package com.mems.kinozippy.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IndexRestController {

    @GetMapping("/")
    public String index () {
        return "index";
    }
}
