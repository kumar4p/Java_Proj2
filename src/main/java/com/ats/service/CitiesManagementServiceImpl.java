package com.ats.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.command.CityCommand;
import com.ats.repository.CitiesRepository;

/**
 * Class name : CitiesManagementServiceImpl<br>
 *@author KUMAR <br>
 *@apiNote This class is implementation of CitiesManagementService(I) for cities management
 *created Dec 27th 2019
*/
@Service
public class CitiesManagementServiceImpl implements CitiesManagementService {

	private static final Logger logger = LoggerFactory.getLogger(CitiesManagementServiceImpl.class);
	
	/**
	 * variable name : citiesRepository<br>
	 *@author KUMAR <br>
	 *@apiNote This citiesRepository variable holds one of the implementation class of CitiesRepository(I) <br>
	 *the implementation class proxy class which is dynamically generated runtime for performing curd operation on the CityEntity object<br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private CitiesRepository citiesRepository;
	
	/**
	 * method name : getAllCities<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to load countries by using citiesRepository object from data base 
	 *@return  <![CDATA[List<CityCommand>]]><br>
	 *created Dec 27th 2019
    */
	@Override
	public List<CityCommand> getAllCities() {
		logger.debug("getAllCities()");
		// TODO Auto-generated method stub
		return null;
	}//getAllCities()

}//class
