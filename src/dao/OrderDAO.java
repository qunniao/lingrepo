package dao;

import java.util.List;

import entity.Admin;
import entity.Order;
import entity.Product;

public interface OrderDAO {



	int findCount();

	List<Order> findByPage(int begin, int pageSize);

	Order findById(int id);

	List<Order> findAll();


}