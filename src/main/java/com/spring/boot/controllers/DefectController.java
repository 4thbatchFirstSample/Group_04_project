package com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.Defect;
import com.spring.boot.services.DefectServices;


@RestController
public class DefectController {
    @Autowired
    
    private DefectServices defectServices;
    
    @PostMapping(value = "/postDefect")
    public String addDefect(@RequestBody Defect defect) {
    	defectServices.addDefect(defect);
		return "Successfully added";
    }
    
    @GetMapping(value = " /getdefect")
    public List<Defect> getEmployeeDetails() {
		return defectServices.getDefect();
	}
    

  
    
    


	
}
