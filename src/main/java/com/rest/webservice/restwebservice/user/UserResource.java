package com.rest.webservice.restwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDAOService service;

    //GET /users
    //retrieve all UserResource
    @GetMapping(value = "/users")
    public List <User> retrieveAllUsers(){
        return service.findAll();
    }


    //GET /users/{id}
    //retrieveUser(int id)
    @GetMapping(value = "/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }
}
