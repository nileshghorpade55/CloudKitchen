package com.nd.briyani.CloudKitchen.jpa.repository;
import org.springframework.data.repository.CrudRepository;

import com.nd.briyani.CloudKitchen.model.Customer;  

public interface CustomerRepository extends CrudRepository<Customer, Integer>  
{  
}  