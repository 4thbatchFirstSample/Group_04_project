package com.spring.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @PutMapping(value = "/postDefect/id")
    public String putDefect(@RequestBody Defect id) {
    	 defectServices.updateDefect(id);
		return "Successfully added";
    }
    
    
    @GetMapping(value = "/getDefect")
    public List<Defect> getDefect(@RequestBody Defect defect) {
		return defectServices.getDefects();
		
    }
   
    @GetMapping(value = "/getDefect"+"/"+"id")
    public Optional<Defect> getD(@RequestBody Defect defect,@PathVariable Long id) {
		return defectServices.getDefect(id);
		
    }
   
    


  @DeleteMapping(value = "/defect"+"/"+"{id}")
  public String deleteDefect(@PathVariable Long id) {
		defectServices.deleteDefect(id);
		return "Successfully deleted";
  }
		
		 @DeleteMapping(value = "/defect")
		  public String deleteDefect() {
				defectServices.deleteDefects();
				return "Successfully deleted";
		
		
		
    
   
		 }	 
}
