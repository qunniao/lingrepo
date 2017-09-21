package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.ProductTypeDAO;
import dao.UserDAO;

import entity.Admin;
import entity.PageBean;
import entity.ProductType;
import entity.Store;
import service.ProductTypeService;
@Transactional
public class ProductTypeServiceImpl implements ProductTypeService  {
	private ProductTypeDAO productTypeDAO; 
	public ProductTypeDAO getProductTypeDAO() {
		return productTypeDAO;
	}
	public void setProductTypeDAO(ProductTypeDAO productTypeDAO) {
		this.productTypeDAO = productTypeDAO;
	}
	@Override
	public List<ProductType> findAll() {
		System.out.println("ProductTypeServiceImpl findAll");
		return productTypeDAO.findAll();
	}
	public List<ProductType> findById(int id) {
		// TODO Auto-generated method stub
		return productTypeDAO.findById(id); 
	}
	
	
	public ProductType findBy(int id) {
		// TODO Auto-generated method stub
		return productTypeDAO.findBy(id); 
	}
	
	//新增一级菜单
	public void addProductType(ProductType productType){
		productTypeDAO.addProductType(productType);
	}
	//新增二级菜单
	public void addProductTypet(ProductType productType){
		productTypeDAO.addProductTypet(productType);
	}
	@Override
	/**
	 * 管理员删除
	 */
	public void delete(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeDAO.delete(productType);
	}

	@Override
	/**
	 * 业务层查询指定页面方法
	 */
	public PageBean<ProductType> findByPage(Integer currPage) {
		// TODO Auto-generated method stub
		  PageBean<ProductType> pageBean = new PageBean<ProductType>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 5;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = productTypeDAO.findCount();
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
	        List<ProductType> list = productTypeDAO.findByPage(begin, pageSize);
	        pageBean.setList(list);
			return pageBean;
	}
}
