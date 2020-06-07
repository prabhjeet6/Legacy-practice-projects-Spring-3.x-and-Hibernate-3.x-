package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Employee;


@Controller

public class TestController {
	


/*
* TODO: Create a new empty ModelAndView Object. Instantiate the Employee class and call the setter methods to set temporary values to the object.
* Set the view name "view" to the ModelAndView object created earlier. Add the employee object to the ModelAndView and return the sa
*/
    
	
@RequestMapping(value="/welcome" )
	public  ModelAndView displayHello(@RequestParam int empno,@RequestParam String ename)
	{
      Employee emp=new Employee();
      ModelAndView mv=new ModelAndView();
      emp.setEmpno(empno);
      emp.setEname(ename);
      mv.setViewName("view");
      mv.addObject("Employee",emp);
      
      return mv;
		
	}
    


/*
*TODO: Create a new Employee Object. Set the values of the employee Object to the request parameter variables fetch.
*Return the object back.
*/
    @RequestMapping(value="/model")
    public @ModelAttribute("emp")Employee modelVal( @RequestParam int empno,@RequestParam String ename)
	{
    	 Employee ob=new Employee();
         
         ob.setEmpno(empno);
         ob.setEname(ename);
         return ob;
    	
	}
    

}
