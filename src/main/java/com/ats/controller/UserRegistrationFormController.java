package com.ats.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ats.command.UserCommand;
import com.ats.entity.UserEntity;
import com.ats.service.CitiesManagementService;
import com.ats.service.CountriesManagementService;
import com.ats.service.StatesManagementService;
import com.ats.service.UsersManagementRegisterService;

/**
 * Class name : UserRegistrationFormController<br>
 *@author KUMAR <br>
 *@apiNote This class is to handle request processing logic for Screen "User Registration Form" page
 *created Dec 27th 2019
*/
@Controller
public class UserRegistrationFormController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRegistrationFormController.class);
	
	/**
	 * variable name : countriesManagementService<br>
	 *@author KUMAR <br>
	 *@apiNote This countriesManagementService variable holds one of the implementation class of CountriesManagementService(I) <br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private CountriesManagementService countriesManagementService;
	
	/**
	 * variable name : statesManagementService<br>
	 *@author KUMAR <br>
	 *@apiNote This statesManagementService variable holds one of the implementation class of StatesManagementService(I) <br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private StatesManagementService statesManagementService;
	
	/**
	 * variable name : citiesManagementService<br>
	 *@author KUMAR <br>
	 *@apiNote This citiesManagementService variable holds one of the implementation class of CitiesManagementService(I) <br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private CitiesManagementService citiesManagementService;
	
	/**
	 * variable name : usersManagementRegisterService<br>
	 *@author KUMAR <br>
	 *@apiNote This usersManagementRegisterService variable holds one of the implementation class of UsersManagementRegisterService(I) <br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private UsersManagementRegisterService usersManagementRegisterService;
	
	/**
	 * method name : displayRegistrationForm<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display Registration Form page on to the browser
	 *@param model <br>
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping(value="/" , method = RequestMethod.GET)
	public String displayRegistrationForm(Model model){
		logger.debug("getRegistrationForm(-)");
		model.addAttribute("userCommand"+new UserEntity());
		return null;
	}//getRegistrationForm(-)
	
	/**
	 * method name : getCountries<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to send countries in JSON format as String
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping(value="/loadCountries",method = RequestMethod.GET)
	public @ResponseBody String getCountries(){
		logger.debug("getCountries()");
		return null;
	}//getCountries()
	
	/**
	 * method name : getStates<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to send states in JSON format as String
	 *@param HttpServletRequest request
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping(value="/loadStates" , method=RequestMethod.GET)
	public @ResponseBody String getStates(HttpServletRequest request){
		logger.debug("getStates()");
		return null;
	}//getStates()
	
	/**
	 * method name : getCities<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to send states in JSON format as String
	 *@param HttpServletRequest request
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping(value="/loadCities")
	public @ResponseBody String getCities(HttpServletRequest req){
		logger.debug("getCities(-)");
		return null;
	}//getCities()
	
	/**
	 * method name : checkingEmailIdIsPresent<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to check whether entered EmialId is valid or nor
	 *@param HttpServletRequest request
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping
	public @ResponseBody boolean  checkingEmailIdIsPresent(HttpServletRequest request){
		logger.debug("checkingEmailIdIsPresent()");
		return false;
	}//checkingEmailIdIsPresent(-)
	
	/**
	 * method name : registerUser<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to register/save user details
	 *@paramUserCommand
	 *@param Model
	 *@return String <br>
	 *created Dec 27th 2019
	*/
	@RequestMapping(value="/registerUser")
	public String registerUser(@ModelAttribute(value="user") UserCommand userCommand, Model model){
		logger.debug("registerUser()");
		return null;
	}//registerUser(-,-)
}//class
