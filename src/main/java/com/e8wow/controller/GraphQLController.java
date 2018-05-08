package com.e8wow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphQLController {

    @RequestMapping(value = "/graphQL", method = RequestMethod.GET)
    public String graphQL() {
        return "hello world!!";
    }
}
