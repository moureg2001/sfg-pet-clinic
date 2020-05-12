package com.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/pets")
@Controller
public class PetController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listPet(){
        return "pets/index";
    }
}
