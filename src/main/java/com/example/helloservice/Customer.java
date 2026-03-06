package com.example.helloservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerInformation")
public class Customer {

    @Id
    private String id;
    private String customerId;
    private String name;
    private String address;
    private String email;
    private String phone;

    public Customer(String customerId, String name, String address, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
