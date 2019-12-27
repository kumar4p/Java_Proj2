package com.ats.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.command.StateCommand;
import com.ats.repository.StatesRepository;

/**
 * Class name : CitiesManagementServiceImpl<br>
 *@author KUMAR <br>
 *@apiNote This class is implementation of CitiesManagementService(I) for cities management
 *created Dec 27th 2019
*/
@Service
public class StatesManagementServiceImpl implements StatesManagementService{
	
	private static final Logger logger = LoggerFactory.getLogger(StatesManagementServiceImpl.class);
	
	/**
	 * variable name : statesRepository<br>
	 *@author KUMAR <br>
	 *@apiNote This statesRepository variable holds one of the implementation class of StatesRepository(I) <br>
	 *the implementation class proxy class which is dynamically generated runtime for performing curd operation on the StatesEntity object<br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private StatesRepository statesRepository;
	
	/**
	 * method name : getAllCities<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to load countries by using statesRepository object from data base 
	 *@return  <![CDATA[List<CityCommand>]]><br>
	 *created Dec 27th 2019
	*/
	@Override
	public List<StateCommand> getAllStates() {
		logger.debug("getAllStates()");
		// TODO Auto-generated method stub
		return null;
	}//getAllStates()

}//class
