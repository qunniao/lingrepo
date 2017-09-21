package service;

import java.util.List;


import entity.Admin;
import entity.PageBean;
import entity.User;

public interface UserService{
	void saveUser(User user);//添加用户
	User getUser(String name);//按用户名查找用户
	void deleteUser(int id);//删除用户
	void updateUser(User user);//更新用户
	User findUserById(int id);//按id查找用户
	List<User> findAll();//查找全部用户
	PageBean<User> findByPage(Integer currPage);
	User login(User u);
	
	

}
