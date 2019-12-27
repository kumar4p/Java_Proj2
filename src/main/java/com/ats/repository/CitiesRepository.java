package com.ats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ats.entity.CityEntity;

/**
 * class name : CitiesRepository<br>
 *@author KUMAR <br>
 *@apiNote This CitiesRepository(I) extends from JpaRepository(I)<br>
 *so we no need to write any code for basic CRUD operations spring data only supplies
 *those logics, if we customized queries then we have to write our own methods 
 *created Dec 22nd 2019
*/
@Repository
public interface CitiesRepository extends JpaRepository<CityEntity, Integer> {

}//interface
