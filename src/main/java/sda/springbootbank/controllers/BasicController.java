package sda.springbootbank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryan Alexander on 26/11/2018.
 */

@RequestMapping(path = "/")
@RestController
public class BasicController {

    @GetMapping
    public String hello() {
        return "Welcome";
    }

    @GetMapping(path ="/protected")
    public String helloFromProtected(){
        return "Here you are safe";
    }
}
