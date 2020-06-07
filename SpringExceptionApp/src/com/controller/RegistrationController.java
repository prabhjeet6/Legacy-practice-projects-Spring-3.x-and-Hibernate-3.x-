package com.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exception.PriceException;
import com.bean.Book;

@Controller
@RequestMapping(value="/registerNewBook.htm") 
public class RegistrationController { 
  
	private static Log LOG = LogFactory.getLog(RegistrationController.class);
	
	@Resource(name="demoValidator")
	private Validator validate;
	
    @RequestMapping(method= RequestMethod.GET) 
    public String showForm(ModelMap model){ 
      
    	Book book = new Book(); 
        model.addAttribute("BOOK", book); 
        return "registerNewBook"; 
    } 
  
    @RequestMapping(method=RequestMethod.POST)
    /*
     * TODO:1) Add the annotation ExceptionHandler to point to PriceException Class
     * 2) Check the price of book. If it is less than 0 or greater than 10000 then
     * throw the PriceException object.
     */
    @ExceptionHandler({ PriceException.class })
    public String processForm(@ModelAttribute(value="BOOK") Book book, BindingResult result){
    	LOG.info("Author : " + book.getAuthor());
    	if(book.getPrice()>0f&& book.getPrice()<10000f)
    	{
    		throw null;
    	}
    	else
    	{
    		validate.validate(book, result);
    	
    	if(result.hasErrors()){ 
            return "registerNewBook"; 
        }else{
            return "confirmation"; 
        }
    	}
    	
    } 
}
