 package struts.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserDAO;

import entity.Admin;
import entity.PageBean;
import entity.Store;
import entity.User;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private UserDAO userdao;
	private List<User> list;
	User user = new User();
	private UserService userService;
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override 
	public User getModel(){
		return user;
	}
	//查询所有会员信息
		public String  getUserList()throws Exception{
				/*list = userService.findAll();
				if(list==null)list=new ArrayList();*/
				PageBean<User> pageBean = userService.findByPage(currPage);
			// 使用的是模型驱动，把部门信息放入值栈中，采可以使用OGNL表达是获取
			ActionContext.getContext().getValueStack().push(pageBean);
			return "getUserList";
		}
		//通过id查询
			public String getUserById(){
			//没进入这个方法嗯
				HttpServletRequest request = ServletActionContext.getRequest();
				int id = Integer.parseInt(request.getParameter("id"));
				System.out.println(id+"查询user信息");
				user = userService.findUserById(id);
				return "getUserById";
			}
			
	// 当前页数
			private Integer currPage = 1;
			public void setCurrPage(Integer currPage) {
				this.currPage = currPage;
			}

			
}
