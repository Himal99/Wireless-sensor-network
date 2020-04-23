/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.Controller;

import com.cibt.app.entity.Relation;
import com.cibt.app.repository.Relationrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/relation")
public class Relationcontroller {
    
    @Autowired
    private Relationrepository repository;
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("records", repository.findAll());
    return "relation/index";
    }
    
   
    
    @PostMapping
    public String save(Relation r){
        repository.save(r);
        return "redirect:/node";
    }
    
    @GetMapping(value = "/json")
    @ResponseBody
    
    public List<Relation> findall(){
        return repository.findAll();
    }
    
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id){
        repository.deleteById(id);
        return "redirect:/node?success";
    }
    
    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id") int id,Model m){
        m.addAttribute("records",repository.findById(id).get());
        return "relation/edit";
    }
}
