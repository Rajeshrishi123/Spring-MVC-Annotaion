package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@PostMapping("/save")
	public String saveData(@RequestBody Student student) {
		System.out.println("Data is "+student);
		
		return"success";
		
	}
	

	
//	@GetMapping("/get/{name}")
//	public String getCustomerNameWithWife(@PathVariable("name") String custName,@RequestParam(name="wifeName",required = false ) String wifeName) {
//		
//		return"welcome "+custName+" and "+wifeName;
//		
//	}
//	
	@GetMapping("/get/{name}")
	public String saveData(@PathVariable("name") String name,@RequestParam(name="wifeNaame" , required = false) String wifeName ) {
		return "name is "+ name +" wifeName is "+wifeName;
	
	}
	
	@PutMapping("/update")
	public String updatingData(@RequestBody Student student) {
		System.out.println("updates data is "+student);
		return "updated";
		
	}
	
	@PatchMapping("/patch")
	public int updatingPatch(@RequestBody Student student) {
		System.out.println("Patched data is "+student);
		return 143;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMapping(@PathVariable("id") int id) {
		System.out.println("deleted data is "+id);
		return "Deleted";
	}

}
