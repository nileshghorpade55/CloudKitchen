package com.nd.briyani.CloudKitchen.jpa.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nd.briyani.CloudKitchen.model.Customer;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(CustomerRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Customer(1, "Nilesh","chciken birayni","nileshghorpade55@gmail.com")));
      log.info("Preloading " + repository.save(new Customer(2, "Rajesh","Veg Paneer Tikka","RajeshMohanty@gmail.com")));
    };
  }
}