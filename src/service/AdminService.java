package service;

import java.util.List;

import entity.Admin;

public interface AdminService{
	void addAdmin(Admin admin);//添加用户
	void updateAdmin(Admin user);//更新用户
	Admin findById(int id);//按id查找用户
	
	Admin login(Admin admin);
	List<Admin> findAll();//查找全部用户
	
	void delete(Admin admin);


	

}
