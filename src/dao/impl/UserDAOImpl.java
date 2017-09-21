package dao.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import dao.UserDAO;
import entity.Admin;
import entity.Store;
import entity.User;

public class UserDAOImpl extends HibernateDaoSupport   implements UserDAO {
	public User findById(int id) {
		String hql = "from User where id="+id;
		List<User> list = this.getSession().createQuery(hql).list();
		Iterator<User> it = list.iterator();
		while(it.hasNext()){
			User user = (User)it.next();
			return user;
		}
		return null;
	}

	public User findByName(String name) {
		
		return null;
	}

	public boolean addUser(User user) {
		return false;
	}

	//查找全部用户
	public List<User> findAll() {
		System.out.println("UserDAOImpl findAll");
		List<User> list = getSession().createQuery("from User").list();
		return list;

	}
	

	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from User";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	/**
	 * Dao中查询指定页的方法
	 */
	public List<User> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		List<User> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}
	
	@Override
	public User findByPhoneAndPassword(User u) {
		// TODO Auto-generated method stub
		String hql = "from User where phone=? and password=?";
		List<User> userList = this.getHibernateTemplate().find(hql,u.getPhone(),u.getPassword());
		if(userList.size()>0){

			return userList.get(0);
		}
		return null;
	}

}
