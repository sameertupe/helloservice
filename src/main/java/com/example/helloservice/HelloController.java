package com.example.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;
import java.util.List;

@RestController
public class HelloController {

    private final RequestTimeRepository repository;

    public HelloController(RequestTimeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public List<RequestTime> hello() {
        long nextCounter = repository.count() + 1;
        repository.save(new RequestTime(nextCounter, Instant.now()));
        return repository.findAll();
    }
}
