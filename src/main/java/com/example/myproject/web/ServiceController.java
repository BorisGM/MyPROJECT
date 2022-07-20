package com.example.myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

//

    @GetMapping(value = "/services")
    public String getService() {

        return "service";
    }
}
