package com.nd.briyani.CloudKitchen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	

    public Customer() {
	
	}
	public Customer(int id, String name, String order, String email) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
		this.email = email;
	}
	@Id
    @Column
    private int id;

    @Column
    private String name;

    @Column(name = "order_name") // Avoid reserved keyword
    private String order;

    @Column
    private String email;

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
