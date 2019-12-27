package com.ats.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ats.service.UsersManagementRegisterService;

/**
 * Class name : GetUnlockingFormViewController<br>
 *@author KUMAR <br>
 *@apiNote This class is to handle request processing logic for Screen "verify link"
 *created Dec 27th 2019
*/

@Controller
public class GetUnlockingFormViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(GetUnlockingFormViewController.class);
	

	/**
	 * variable name : usersManagementRegisterService<br>
	 *@author KUMAR <br>
	 *@apiNote This usersManagementRegisterService variable holds one of the implementation class of UsersManagementRegisterService(I) <br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private UsersManagementRegisterService usersManagementRegisterService;
	
	/**
	 * method name : getUnlockingFormView<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display unlocking form page on to the browser
	 *@param model <br>
	 *@return String <br>
	 *created Dec 27th 2019
	 */
	@RequestMapping(value="/unlockingForm", method = RequestMethod.GET)
	public String getUnlockingFormView(Model model){
		logger.debug(this.getClass()+" from getUnlockingFormView()");
		return null;
	}//getUnlockingFormView(-)
}//class
