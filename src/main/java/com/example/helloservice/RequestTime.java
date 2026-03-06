package com.example.helloservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection = "RequestTimes")
public class RequestTime {

    @Id
    private String id;
    private long counter;
    private Instant requesttime;

    public RequestTime(long counter, Instant requesttime) {
        this.counter = counter;
        this.requesttime = requesttime;
    }

    public String getId() { return id; }
    public long getCounter() { return counter; }
    public Instant getRequesttime() { return requesttime; }
}
