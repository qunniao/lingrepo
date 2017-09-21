package service;

import java.util.List;

import entity.PageBean;
import entity.Product;


public interface ProductService {
	void saveProduct(Product product);//添加用户
	Product getProduct(String name);//按用户名查找用户
	void deleteProduct(int id);//删除用户
	void updateProduct(Product product);//更新用户
	Product findProductById(int id);//按id查找用户
	List<Product> findAll();//查找全部用户
	List<Product> findAllxj();//查找全部用户
	PageBean<Product> findByPage(Integer currPage);
	PageBean<Product> findByPagexj(Integer currPage);
	Product findById(int id);

}