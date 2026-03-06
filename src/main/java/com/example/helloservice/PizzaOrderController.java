package com.example.helloservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class PizzaOrderController {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public PizzaOrderController(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @PostMapping("/PlacePizzaOrder")
    public ResponseEntity<Map<String, String>> placeOrder(@RequestBody PlaceOrderRequest request) {
        customerRepository.findByCustomerId(request.getCustomerId())
                .orElseGet(() -> customerRepository.save(new Customer(
                        request.getCustomerId(),
                        request.getName(),
                        request.getAddress(),
                        request.getEmail(),
                        request.getPhone()
                )));

        Order order = orderRepository.save(new Order(
                request.getCustomerId(),
                request.getPizzaName(),
                request.getPizzaSize()
        ));

        return ResponseEntity.ok(Map.of("orderId", order.getId()));
    }
}
