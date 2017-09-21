package dao;

import java.util.List;

import entity.Admin;
import entity.User;

public interface UserDAO {

	public boolean addUser(User user); // �û�ע��

	public User findById(int id); // ���userid�����û�

	public User findByName(String name); // �û���¼
	
	public List<User> findAll();

	int findCount();

	List<User> findByPage(int begin, int pageSize);
	
	User findByPhoneAndPassword(User u);
}
