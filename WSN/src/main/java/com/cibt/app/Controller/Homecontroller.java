/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.Controller;

import com.cibt.app.repository.Noderepository;
import com.cibt.app.repository.Relationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/")

public class Homecontroller {
    
   
   @Autowired
    private Noderepository repository;
    @Autowired
    private Relationrepository repoRelationrepository;
    @GetMapping
    public  String index(Model model){
        
        model.addAttribute("records", repository.findAll());
        model.addAttribute("record2", repoRelationrepository.findAll());
        return "node/index";
    }
}
