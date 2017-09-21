package service.impl;

import java.util.List;

import dao.AdminDAO;
import dao.StoreDAO;

import entity.Admin;
import entity.PageBean;
import entity.Store;
import entity.User;
import service.StoreService;

public class StoreServiceImpl implements StoreService {
	private StoreDAO storeDAO;
	
	//查找所有商家列表
	@Override
	public List<Store> findAll() {
		System.out.println("StoreServiceImpl findAll");
		return storeDAO.findAll();
	}
	public Store findById(int id) {
		// TODO Auto-generated method stub
		return storeDAO.findById(id);
	}
	public StoreDAO getStoreDAO() {
		return storeDAO;
	}
	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}

	@Override
	/**
	 * 业务层查询指定页面方法
	 */
	public PageBean<Store> findByPage(Integer currPage) {
		// TODO Auto-generated method stub
		  PageBean<Store> pageBean = new PageBean<Store>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 5;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = storeDAO.findCount();
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
	        List<Store> list = storeDAO.findByPage(begin, pageSize);
	        pageBean.setList(list);
			return pageBean;
	}
}
