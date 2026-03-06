package com.example.helloservice;

public class PlaceOrderRequest {
    private String customerId;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String pizzaName;
    private String pizzaSize;

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getPizzaName() { return pizzaName; }
    public String getPizzaSize() { return pizzaSize; }
}
