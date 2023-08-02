package com.example.demo.technologies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologiesService {
	
	@Autowired
	TechnologiesRepository technologiesRepository;

    public List<Technologies> getAllTechnologies() {
        return technologiesRepository.findAll();
    }
	
    public Technologies getById(Integer id) {
        return technologiesRepository.findById(id).get();
    }
    
    public Technologies getByName(String name) {
        return technologiesRepository.findByName(name);
    }
    
    public Technologies addNewTech(Technologies newTech) {
        return technologiesRepository.save(newTech);
    }
    
    public Technologies updateOrAddNewTech(Technologies newTech, Integer id) {
    	return technologiesRepository.findById(id)
    	        .map(item -> {
    	          item.setName(newTech.getName());
    	          item.setCompany(newTech.getCompany());
    	          item.setYear(newTech.getYear());
    	          return technologiesRepository.save(item);
    	        })
    	        .orElseGet(() -> {
    	        	newTech.setId(id);
    	          return technologiesRepository.save(newTech);
    	        });
    }
    
    public void deleteTech(Integer id) {
    	technologiesRepository.deleteById(id);
    }

}
