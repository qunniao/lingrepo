package dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StoreDAO;
import entity.Admin;
import entity.Store;
import entity.User;

public class StoreDAOImpl extends HibernateDaoSupport implements StoreDAO{
	//查询
	@Override
	public List<Store> findAll() {
		System.out.println("StoreDAOImpl findAll");
		List<Store> list = getSession().createQuery("from Store").list();
		return list;
	}

	@Override
	public Store findById(int id) {
		String hql = "from Store where store_id="+id;
		List<Store> list = this.getSession().createQuery(hql).list();
		Iterator<Store> it = list.iterator();
		while(it.hasNext()){
			Store store = (Store)it.next();
			return store;
		}
		return null;
	}


	@Override
	/**
	 * Dao层查询总员工数的方法
	 */
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from Store";
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
	public List<Store> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Store.class);
		List<Store> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}
	

}
