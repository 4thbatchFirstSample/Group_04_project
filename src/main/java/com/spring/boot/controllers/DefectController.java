package com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @GetMapping(value = "/getDefect")
    public List<Defect> getDefect() {
		return defectServices.getDefect();
		
    }
    
@PutMapping(value = "/alterDefect")
public String updateDefect(@RequestBody Defect defect) {
	defectServices.addDefect(defect);
	return "Successfully updated";
	
}
  @DeleteMapping(value = "/defect"+"/"+"{id}")
  public String deleteDefect(@PathVariable Long id) {
		defectServices.deleteDefect(id);
		return "Successfully deleted";
    
   
	
}
}