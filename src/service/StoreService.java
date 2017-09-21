package service;

import java.util.List;

import entity.Admin;
import entity.PageBean;
import entity.Store;

public interface StoreService {
	List<Store> findAll();//查找全部用户
	Store findById(int id);
	PageBean<Store> findByPage(Integer currPage);
}