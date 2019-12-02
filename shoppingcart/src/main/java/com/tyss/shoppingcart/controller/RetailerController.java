package com.tyss.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.shoppingcart.DTO.Product;
import com.tyss.shoppingcart.DTO.Retailer;
import com.tyss.shoppingcart.service.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage()
	
	@PostMapping("/login")
	public String login(String email, String password, HttpServletRequest request) {
		
		Retailer bean = service.login(email, password);
		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentails");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}//end of login()
	}
	
	
	@GetMapping("/register")
	public String registerPage() {
		
		return "register";
	}//end of registerPage()
	
	@PostMapping("/register")
	public String register(Retailer bean, ModelMap map) {
		
		int check = service.register(bean);
		if(check > 0) {
			map.addAttribute("msg", "Registration Successful and your ID is " +check);
		}else {
			map.addAttribute("msg", "Email already exists");
		}
		return "login";
	}// end of register()

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false) Retailer bean) {
		
		if(bean == null) {
			
			map.addAttribute("msg", "Please Login");
			return "login";
			
		}else {
			
			return "home";
		}
	}// end of home()
	
	@PostMapping("/home")
	public String home() {
		
		return "home";
		
	}//end of home()

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("id")int id, ModelMap map) {
		
		Product bean = service.searchProduct(id);
		if(bean == null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}// end of search()
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
		
	}
	
	@PostMapping("/changepassword")
	public String changePassword(String password,String confirmpassword,
			@SessionAttribute(name = "bean")Retailer bean,
			ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "Password changed");
		}else {
			map.addAttribute("msg", "Password not changed");
		}
		return "home";
	}
	
	@GetMapping("/order")
	public String oderpage(HttpServletRequest request) {
	
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "order";
		}else {
			return "login";
		}
	}
//	public String order(int quaquantity,) {
//		
//	}
}
