package dao;

import java.util.List;

import entity.Admin;
import entity.User;

public interface AdminDAO {
	public boolean addAdmin(Admin user); // �û�ע��
	public Admin findById(int id); // ���userid�����û�
	
	Admin findByPhoneAndPassword(Admin employee);
	public List<Admin> findAll();
	public void updateAdmin(Admin admin);
	
	void delete(Admin admin);

}
