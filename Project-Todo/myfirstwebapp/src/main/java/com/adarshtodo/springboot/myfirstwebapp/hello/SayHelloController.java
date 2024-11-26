package com.adarshtodo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class SayHelloController {

	
	// say hello
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Say! What are you learning today ?";
		
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Learning Spring</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Learning Spring boot in Java Developmentm with html </h1>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	
	//sayHello.jsp
	
	
	@RequestMapping("say-hello-jsp")
	
	public String sayHelloJsp() {
		return "sayHello";
		 
	}
	

	
	
	
}




