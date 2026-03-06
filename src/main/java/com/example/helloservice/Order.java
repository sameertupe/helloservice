package com.example.helloservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection = "OrderInformation")
public class Order {

    @Id
    private String id;
    private String customerId;
    private String pizzaName;
    private String pizzaSize;
    private Instant orderTime;

    public Order(String customerId, String pizzaName, String pizzaSize) {
        this.customerId = customerId;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.orderTime = Instant.now();
    }

    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public String getPizzaName() { return pizzaName; }
    public String getPizzaSize() { return pizzaSize; }
    public Instant getOrderTime() { return orderTime; }
}
