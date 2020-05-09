package com.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owner/index","/owner/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
