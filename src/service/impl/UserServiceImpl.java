package service.impl;

import java.util.List;

import service.UserService;

import dao.UserDAO;

import entity.Admin;
import entity.PageBean;
import entity.Store;
import entity.User;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	//提供UserDAO对象的注入通道
	public void setUserDAO(UserDAO userDAO){
		this.userDAO = userDAO;
	}
	//添加用户
	public void saveUser(User user){
		if(userDAO.findById(user.getId())==null){
			userDAO.addUser(user);
		}
	}
	
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}
	
	public List<User> findAll() {
			System.out.println("UserServiceImpl findAll");
			return userDAO.findAll();
		}

	@Override
	/**
	 * 业务层查询指定页面方法
	 */
	public PageBean<User> findByPage(Integer currPage) {
		// TODO Auto-generated method stub
		  PageBean<User> pageBean = new PageBean<User>();
	        // 封装当前页数
	        pageBean.setCurrPage(currPage);
	        // 封装每页记录数
	        int pageSize = 5;
	        pageBean.setPageSize(pageSize);
	        // 封装总记录数
	        int totalCount = userDAO.findCount();
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
	        List<User> list = userDAO.findByPage(begin, pageSize);
	        pageBean.setList(list);
			return pageBean;
	}
	
	@Override	
	public User login(User u) {
		// TODO Auto-generated method stub
		User user = userDAO.findByPhoneAndPassword(u);
		return user;
	}
}
