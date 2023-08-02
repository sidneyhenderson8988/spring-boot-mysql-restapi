package com.example.demo.technologies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/techologies")
public class TechnologiesController {

	@Autowired
	private final TechnologiesService technologiesService;

	public TechnologiesController(TechnologiesService technologiesService) {
		this.technologiesService = technologiesService;
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Technologies>> getAllTechnologies(){
		List<Technologies> technologies = technologiesService.getAllTechnologies();
		return new ResponseEntity<>(technologies, HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Technologies> getById(@PathVariable Integer id) {
		Technologies technology = technologiesService.getById(id);
		return new ResponseEntity<>(technology, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<Technologies> getByName(@RequestParam(value="name") String name) {
		Technologies technology = technologiesService.getByName(name);
		return new ResponseEntity<>(technology, HttpStatus.OK);
	}
	
	@PostMapping("/addNewTech") 
	public ResponseEntity<Technologies> addNewTech(@RequestBody Technologies newTech) {
		Technologies technology = technologiesService.addNewTech(newTech);
		return new ResponseEntity<>(technology, HttpStatus.OK);
	}
	
	@PutMapping("/updateTech/{id}")
	public ResponseEntity<Technologies> updateOrCreateTech(@RequestBody Technologies newTech, @PathVariable Integer id) {
		Technologies technology = technologiesService.updateOrAddNewTech(newTech, id);
		return new ResponseEntity<>(technology, HttpStatus.OK);
	    
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTech(@PathVariable Integer id) {
		technologiesService.deleteTech(id);
		return new ResponseEntity<>("Technology deleted.",HttpStatus.OK);
	}
	
}
