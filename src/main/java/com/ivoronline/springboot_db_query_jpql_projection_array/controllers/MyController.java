package com.ivoronline.springboot_db_query_jpql_projection_array.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_array.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN ARRAY
  //================================================================
  @RequestMapping("ReturnArray")
  Object[] returnArray() {
    Object[] array = (Object[]) personRepository.returnArray();
    return   array;
  }

}
