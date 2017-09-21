package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import service.AdminService;
import service.OrderService;
import dao.AdminDAO;
import dao.OrderDAO;
import entity.Admin;
import entity.Order;
import entity.PageBean;
import entity.Store;
@Transactional
public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDAO;


	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return orderDAO.findById(id);
	}
	@Override
	/**
	 * 管理员删除
	 */
	
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		System.out.println("OrderServiceImpl findAll");
		return orderDAO.findAll();
	}

	public PageBean<Order> findByPage(Integer currPage) {
		// TODO Auto-generated method stub
		  PageBean<Order> pageBean = new PageBean<Order>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 5;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = orderDAO.findCount();
	        pageBean.setTotalCount(totalCount);
	        // 封装页数
	        int totalPage;
	        if(totalCount%pageSize==0){
	        	totalPage = totalCount/pageSize;
	        }else{
	        	totalPage = totalCount/pageSize + 1; 
	        }
	        pageBean.setTotalPage(totalPage);
	        // 封装当前页记录
	        int begin= (currPage - 1)*pageSize;
	        List<Order> list = orderDAO.findByPage(begin, pageSize);
	        pageBean.setList(list);
			return pageBean;
	}





}
