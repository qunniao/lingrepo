 package struts.mobile.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserDAO;

import entity.Admin;
import entity.PageBean;
import entity.Store;
import entity.User;

public class MobileUserAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private static final long serialVersionUID = 1L;
    
    HttpServletRequest request;
    HttpServletResponse response;

    public void setServletRequest(HttpServletRequest request) {
     this.request=request;
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response=response;
    }

	
    public void login(){  
        try {
             //HttpServletRequest request =ServletActionContext.getRequest();
             // HttpServletResponse response=ServletActionContext.getResponse();
             this.response.setContentType("text/html;charset=utf-8");
             this.response.setCharacterEncoding("UTF-8");
              String phone = this.request.getParameter("phone");
              String pwd = this.request.getParameter("pwd");
              User user = new User();
             user.setPhone(Integer.parseInt(this.request.getParameter("phone")));
             user.setPassword(this.request.getParameter("pwd"));
             User existUser = userService.login(user);
             System.out.println("手机号："+user.getPhone()+" 密码："+pwd); 
             JSONObject json=new JSONObject(); 
	     		if(existUser==null){
	     			// 登陆失败
	     			json.put("code", 0);
	     			json.put("msg", "用户名或密码错误");
	     		}else{
	     			// 登录成功
	     			json.put("code", 1);
	     			JSONObject jsondata=JSONObject.fromObject(user);     
	     			json.put("data", jsondata);
	     			json.put("msg", "登录成功");
	     		}
	     		System.out.println("json："+json); 
	     		this.response.getWriter().write(json.toString());
                 
            //将要返回的实体对象进行json处理      
              //  JSONObject json=JSONObject.fromObject(this.getUsername());     
             //输出格式如：{"id":1, "username":"zhangsan", "pwd":"123"}      
             //   System.out.println(json);       
            
              //   this.response.getWriter().write(json.toString());
            /**
               JSONObject json=new JSONObject(); 
               json.put("login", "login");
                response.setContentType("text/html;charset=utf-8");
               System.out.println(json);
               byte[] jsonBytes = json.toString().getBytes("utf-8");
               response.setContentLength(jsonBytes.length);
               response.getOutputStream().write(jsonBytes);
               **/
            /**
              JSONObject json=new JSONObject(); 
               json.put("login", "login");
               byte[] jsonBytes = json.toString().getBytes("utf-8");
               response.setContentType("text/html;charset=utf-8");
               response.setContentLength(jsonBytes.length);
               response.getOutputStream().write(jsonBytes);
               response.getOutputStream().flush();
               response.getOutputStream().close();    
             **/  
             
        } catch (Exception e) { 
            e.printStackTrace();
        }
        // return null;
    }
			
}
