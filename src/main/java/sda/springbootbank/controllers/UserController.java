package sda.springbootbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sda.springbootbank.dto.User;
import sda.springbootbank.repositories.UserRepository;

import javax.websocket.server.PathParam;

/**
 * Created by Ryan Alexander on 21/11/2018.
 */
@RestController
// This handles what we used to do with XML and JSP servlet mapping
@RequestMapping(path = "/users")

public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Filter method, users by 'name'
    @RequestMapping(method = RequestMethod.GET, path = "/allByName")
    public Iterable<User> getAllUserByName(@PathParam("name") String name) {
        return userRepository.findAllByName(name);
    }


    // Filter method, users by 'nationality'
    @RequestMapping(method = RequestMethod.GET, path = "/allByNationality")
    public Iterable<User> getAllUserByNationality(@PathParam("nationality") String nationality) {
        return userRepository.findAllByNationality(nationality);
    }



    /* Post requests can have 'body', like html element. This is the CORRECT way
    to add to the database, which is why the above was just an example and commented out
     */
    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void addNewUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
