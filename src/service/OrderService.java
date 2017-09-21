package service;

import java.util.List;

import entity.Order;
import entity.PageBean;

public interface OrderService {

	List<Order> findAll();

	PageBean<Order> findByPage(Integer currPage);

	Order findById(int id);


}