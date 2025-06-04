package com.nd.briyani.CloudKitchen.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd.briyani.CloudKitchen.jpa.repository.CustomerRepository;
import com.nd.briyani.CloudKitchen.model.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

//getting all student records  
	public List<Customer> getAllStudent() {
		List<Customer> students = new ArrayList<Customer>();
		customerRepository.findAll().forEach(student -> students.add(student));
		return students;
	}

//getting a specific record  
	public Customer getStudentById(int id) {
		return customerRepository.findById(id).get();
	}

	public void saveOrUpdate(Customer student) {
		customerRepository.save(student);
	}

//deleting a specific record  
	public void delete(int id) {
		customerRepository.deleteById(id);
	}
}