package com.javatpoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainData {

	public static void main(String[] args) {
		
		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
			
			/*
			 EmployeeInsert ei=(EmployeeInsert)ctx.getBean("einsert");  
			   int status=ei.saveEmployee(new Employee1(105,"Taskin"," Officer",35000));  
			    System.out.println(status); */
			 
			 
			
			     
			/* EmployeeInsert ei=(EmployeeInsert)ctx.getBean("einsert");      
			    Employee1 e=new Employee1(); 
			    e.setId(101); 
			    int status=ei.deleteEmployee(e); 
			    System.out.println(status); */
			 
			 EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
			  System.out.println("Green Organization Eployee Profile:");
			  System.out.println();
			    List<Employee> list=dao.getAllEmployeesRowMapper();  
			          
			    for(Employee e:list)  
			        System.out.println(e);
		}

	}


