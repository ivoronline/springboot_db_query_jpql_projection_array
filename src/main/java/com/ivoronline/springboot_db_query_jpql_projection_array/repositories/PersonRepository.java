package com.ivoronline.springboot_db_query_jpql_projection_array.repositories;

import com.ivoronline.springboot_db_query_jpql_projection_array.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // RETURN ARRAY
  //=======================================================================================
  // John,20
  @Query(value = "SELECT john.name, john.age FROM Person john WHERE john.name = 'John' AND john.age = 20")
  Object returnArray();

}
