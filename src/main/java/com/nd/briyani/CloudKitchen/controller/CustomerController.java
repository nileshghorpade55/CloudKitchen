package com.nd.briyani.CloudKitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nd.briyani.CloudKitchen.model.Customer;
import com.nd.briyani.CloudKitchen.service.CustomerService;
//creating RestController  
@RestController  
public class CustomerController   
{  
//autowired the StudentService class  
@Autowired  
CustomerService customerService;  
//creating a get mapping that retrieves all the students detail from the database   
@GetMapping("/customer")  
private List<Customer> getAllStudent()   
{  
return customerService.getAllStudent();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/customer/{id}")  
private Customer getStudent(@PathVariable("id") int id)   
{  
return customerService.getStudentById(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/customer/{id}")  
private void deleteStudent(@PathVariable("id") int id)   
{  
	customerService.delete(id);  
}  
//creating post mapping that post the student detail in the database  
@PostMapping("/customer")  
private int saveStudent(@RequestBody Customer student)   
{  
	customerService.saveOrUpdate(student);  
return student.getId();  
}  
}  