package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import service.AdminService;
import dao.AdminDAO;
import entity.Admin;
@Transactional
public class AdminServiceImpl implements AdminService{
	private AdminDAO adminDAO;
	//鎻愪緵UserDAO瀵硅薄鐨勬敞鍏ラ�閬�
	public void setAdminDAO(AdminDAO adminDAO){
		this.adminDAO = adminDAO;
	}
	//娣诲姞鐢ㄦ埛
	public void addAdmin(Admin user){
			adminDAO.addAdmin(user);
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDAO.updateAdmin(admin);
	}
	
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return adminDAO.findById(id);
	}
	@Override
	/**
	 * 管理员删除
	 */
	
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		System.out.println("AdminServiceImpl findAll");
		return adminDAO.findAll();
	}
	
	@Override
	
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		Admin eadmin = adminDAO.findByPhoneAndPassword(admin);
		return eadmin;
	}
	
	@Override
	/**
	 * 管理员删除
	 */
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		adminDAO.delete(admin);
	}

	
}
