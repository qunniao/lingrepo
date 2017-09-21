package dao;

import java.util.List;

import entity.Admin;
import entity.Store;

public interface StoreDAO {
	public List<Store> findAll();

	public Store findById(int id);

	List<Store> findByPage(int begin, int pageSize);

	int findCount();
}