package struts.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;




import service.AdminService;
import service.impl.AdminServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Admin;
import entity.User;

 
//@Result(name="tolistsec",location="admin_getAdminList.action",type="redirect")杩欎釜鍙槸鎸囧畾鑾峰彇鍒楄〃鐨�
public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String phone;
	String pwd;
	String errormsg;
	List<Admin> list;
	Admin admin = new Admin();

	

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getErrormsg(){
		return errormsg;
	}
	public List<Admin> getList(){
		return list;
	}
	public Admin getAdmin(){
		return admin;
	}
	
	public void setErrormsg(String errormsg){
		this.errormsg=errormsg;
	}
	public void setList(List<Admin> list){
		this.list=list;
	}
	public void setAdmin(Admin admin){
		this.admin=admin;
	}
	
	private AdminService adminService;
	
	@Resource
	public void setAdminService(AdminService adminService){
		this.adminService = adminService;
	}
	
	@Resource
	public AdminService getAdminService(){
		return adminService;
	}
	
	@Override
	public Admin getModel(){
		return admin;
	}
	public String login(){
		/*System.out.println("AdminAction login");
		List<Admin> list = adminService.findAll();
		Admin u = new Admin();
		Iterator<Admin> it = list.iterator();
		System.out.println("1");
		while(it.hasNext()){
			System.out.println("2");
			u = (Admin)it.next();
			System.out.println("3"+u.getName()+u.getPwd());
			if(name.trim().equals(u.getName())&& pwd.trim().equals(u.getPwd())){
				return "success";
			}
		}
		errormsg="用户名或密码错误";
		return "failer";*/
		
		System.out.println("action.login方法执行");
		// 调用业务层方法
		Admin existEmployee = adminService.login(admin);
		if(existEmployee==null){
			// 登陆失败
			this.addActionError("用户名或密码错误！");
			System.out.println("action查找失败");
			return "failer";
		}else{
			// 登录成功
			System.out.println("Action查找成功");
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return "success";
		}
	}
	
	/**
	 * 鑾峰彇绠＄悊鍛樺垪琛�
	 * @return
	 */
	public String getAdminList(){
		list = adminService.findAll();
		if(list==null)list=new ArrayList();
		/*
		Admin admin;
		Iterator<Admin> it = list.iterator();
		while(it.hasNext()){
			admin = (Admin)it.next();
			System.out.println(admin.getId()+" name:"+admin.getName()+" level:"+admin.getLevel());
		}
		*/
		return "getAdminList";
	}
	public String  addAdminList(){
		System.out.println("添加管理员");
		System.out.println(admin.getName()+"..."+admin.getPwd()+"..."+admin.getPhone());
		adminService.addAdmin(admin);
		return "addAdminList";
		
	}

	public String updateStatus(){
		System.out.println("updateStatus");
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Admin ad = adminService.findById(id);
		ad.setStatus(0);
		setAdmin(ad);
		System.out.println("admin id"+admin.getId()+" name:"+admin.getName()+" "+admin.getStatus());
		adminService.updateAdmin(admin);
		//getAdminList();
		return "getAdminList";
	}
	/*
	 * 批量删除管理员
	 */
	public String deleteAdminList(){
		System.out.println("进入删除方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		String items = request.getParameter("delitems"); 
		System.out.println(items);
		String[] item = items.split(","); 
		for (int i = 0; i < item.length; i++) { 
		//	adminService.deleteAdmin(Integer.parseInt(item[i])); 
			admin = adminService.findById(Integer.parseInt(item[i]));
			adminService.delete(admin);
			
		} 
		return "deleteAdminList";
	}




	@Override
	public String execute(){
		return "failer";
	}

}
