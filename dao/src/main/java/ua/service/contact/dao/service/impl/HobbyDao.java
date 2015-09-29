package ua.service.contact.dao.service.impl;

import org.springframework.stereotype.Repository;


import core.model.Hobby;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 10.09.15.
 */
@Repository
public class HobbyDao {

  private Map<String,String> serviseHobby= new HashMap<String,String>();

  public Collection<String> getAll() {
    return serviseHobby.values();
  }

  public void addHobby(Hobby hobby){

    if (searchHobby(hobby.getTitle()) ==null) {

      serviseHobby.put(hobby.getTitle(),hobby.getDescription());
      return;

    }


  };
  public String searchHobby(String title) {


    if (serviseHobby.get(title) != null) {

      return serviseHobby.get(title);


    }
    return null;

  }







}
