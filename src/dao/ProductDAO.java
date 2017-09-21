package dao;

import java.util.List;

import entity.Admin;
import entity.Product;



public interface ProductDAO {
	public boolean addProduct(Product product); // �û�ע��

	public Product findById(int id); // ���userid�����û�

	public Product findByName(String name); // �û���¼
	
	public List<Product> findAll();
	
	public List<Product> findAllxj();
	public void updateProduct(Product product);
	int findCount();

	List<Product> findByPage(int begin, int pageSize);

	int findCountxj();

	List<Product> findByPagexj(int begin, int pageSize);
}