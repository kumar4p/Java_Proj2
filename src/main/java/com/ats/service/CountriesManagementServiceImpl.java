package com.ats.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.command.CountryCommand;
import com.ats.repository.CountriesRepository;

/**
 * Class name : CountriesManagementServiceImpl<br>
 *@author KUMAR <br>
 *@apiNote This class is implementation of CountriesManagementService(I) for Countries management
 *created Dec 27th 2019
*/
@Service
public class CountriesManagementServiceImpl implements CountriesManagementService {

	private static final Logger logger = LoggerFactory.getLogger(CountriesManagementServiceImpl.class);
	
	/**
	 * variable name : countriesRepository<br>
	 *@author KUMAR <br>
	 *@apiNote This countriesRepository variable holds one of the implementation class of CountriesRepository(I) <br>
	 *the implementation class proxy class which is dynamically generated runtime for performing curd operation on the CountryEntity object<br>
	 *created Dec 27th 2019
	*/
	@Autowired
	private CountriesRepository countriesRepository;
	
	/**
	 * method name : getAllCountries<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to load countries by using countriesRepository object from data base 
	 *@return  <![CDATA[List<CountryCommand>]]><br>
	 *created Dec 27th 2019
	*/
	@Override
	public List<CountryCommand> getAllCountries() {
		logger.debug("getAllCountries()");
		// TODO Auto-generated method stub
		return null;
	}//getAllCountries()

}//class
