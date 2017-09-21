package struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.StoreService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Admin;
import entity.PageBean;
import entity.Store;
import entity.User;



public class StoreAction extends ActionSupport implements ModelDriven<Store>{
	List<Store> list;
	Store store = new Store();
	private StoreService storeService;
	public List<Store> getList() {
		return list;
	}
	public void setList(List<Store> list) {
		this.list = list;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	@Resource
	public StoreService getStoreService() {
		return storeService;
	}
	@Resource
	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}
	
	@Override 
	public Store getModel(){
		return store;
	}
	
	//查询所有
	public String getStoreList(){
		/*list = storeService.findAll();
		if(list==null)list=new ArrayList();*/
		PageBean<Store> pageBean = storeService.findByPage(currPage);
		// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
		ActionContext.getContext().getValueStack().push(pageBean);
		return "getStoreList";
	}
	//通过id查询
	public String getStoreById(){
	//没进入这个方法嗯
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("store_id"));
		System.out.println(id+".........");
		store = storeService.findById(id);
		return "getStoreById";
	}
	// 当前页数
	private Integer currPage = 1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
}
