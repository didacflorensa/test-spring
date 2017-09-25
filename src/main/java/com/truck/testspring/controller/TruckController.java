package com.truck.testspring.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TruckController {

    @RequestMapping(value = "/",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getId() {
        return "5948GVC";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getModel(){
        return "Renault v60";
    }

}
