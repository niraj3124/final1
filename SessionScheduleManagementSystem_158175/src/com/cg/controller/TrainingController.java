package com.cg.controller;

/**********************************************************************
 * FileName: SessionScheduledManagementSystem_158175.java
 * Date:15/10/2018
 * 
 * Description:The file contains the User Defined Controller Class For 
 * 				the application Session Scheduled Management System.
 * 
 *********************************************************************/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.service.ITrainingService;

@Controller
public class TrainingController {
	
	@Autowired
	public ITrainingService iTrainingService;
		
	@RequestMapping("index")
	public String getIndexPage()
	{
		return "index";
	}
	
	
	/***********************************************************
	 * Method Name: getViewData(Model m) Return type:String
	 * Parameters:Object of type Model Description:This method returns the name
	 * of the view that is to be displayed on the browser.
	 * 
	 ***********************************************************/

	@RequestMapping(value="scheduledsessions")
	public String getViewData(Model m)
	{
		try
		{
		// Add the attribute to the model
		m.addAttribute("data",iTrainingService.sessionsdatalist());
		//return the view page 
		return "scheduledsessions";
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	
	/***********************************************************
	 * Method Name: getSuccessPage(Model m) Return type:String
	 * Parameters:Object of type Model Description:This method returns the name
	 * of the view that is to be displayed on the browser.
	 * 
	 ***********************************************************/
	
	@RequestMapping("success")
	public String getSuccessPage(Model m)
	{
		try{
		// Add the attribute to the model for displaying message
		m.addAttribute("msg","You are enrolled to : ");
		//return the view page
		return "success";
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	
	
	
	

}
