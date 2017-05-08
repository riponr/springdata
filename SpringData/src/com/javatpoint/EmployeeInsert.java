package com.javatpoint;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeInsert {
	
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Employee1 employee1){  
	    String query="insert into employee values('"+employee1.getId()+"','"+employee1.getName()+"','"+employee1.getDesignation()+"','"+employee1.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	
	public int deleteEmployee(Employee1 e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	  

}
