/**
 * 
 */
package com.Olusola.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Olusola.demo.model.Alien;

/**
 * @author hp
 *
 */
public interface Repos extends CrudRepository<Alien, String>
{

	List<Alien> findByUserName(String UserName);
	
	
	@Query("from Alien where lname=?1 order by lname")
	List<Alien> findBylname(String lname) ;
}
