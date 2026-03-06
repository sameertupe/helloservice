package com.example.helloservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestTimeRepository extends MongoRepository<RequestTime, String> {
}
