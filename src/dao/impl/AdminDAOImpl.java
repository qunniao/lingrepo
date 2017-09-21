package dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.AdminDAO;
import entity.Admin;


public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {
	
	
/*	@Override
	*//**
	 * Dao�и���û���������ѯ
	 *//*
	public Admin findByUsernameAndPassword(Admin admin) {
		// TODO Auto-generated method stub
		String hql = "from Admin where name=? and pwd=?";
		System.out.println(admin.getName()+".. "+admin.getPwd());
		List<Admin> employeeList = this.getHibernateTemplate().find(hql,admin.getName(),admin.getPwd());
		if(employeeList.size()>0){
			return employeeList.get(0);
		}
		return null;
	}*/

	public Admin findById(int id) {
		String hql = "from Admin where id="+id;
		List<Admin> list = this.getSession().createQuery(hql).list();
		Iterator<Admin> it = list.iterator();
		while(it.hasNext()){
			Admin admin = (Admin)it.next();
			return admin;
		}
		return null;
	}

	//查找全部用户
	public List<Admin> findAll() {
		System.out.println("AdminDAOImpl findAll");
		List<Admin> list = getSession().
        createQuery("from Admin").list();
		return list;
	}

	public boolean addAdmin(Admin admin) {
		System.out.println(admin.getName());
		return  (Boolean) super.getHibernateTemplate().save(admin);
	
	}
	@Override
	/**
	 * Dao层删除方法
	 */
	

	public void updateAdmin(Admin admin) {
		System.out.println("AdminDAOImpl updateAdmin");
		try { 
			getHibernateTemplate().update(admin);	
			System.out.println("AdminDAOImpl 2");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Admin findByPhoneAndPassword(Admin admin) {
		// TODO Auto-generated method stub
		String hql = "from Admin where phone=? and pwd=?";
		List<Admin> adminList = this.getHibernateTemplate().find(hql,admin.getPhone(),admin.getPwd());
		if(adminList.size()>0){

			return adminList.get(0);
		}
		return null;
	}
     
	@Override
	/**
	 * Dao层删除方法
	 */
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(admin);
	}

}
