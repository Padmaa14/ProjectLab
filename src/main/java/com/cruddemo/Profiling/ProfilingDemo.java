package com.cruddemo.Profiling;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfilingDemo {
   // @Value("${message}")
    String message;

   // @PostConstruct
    public void printMessage() {
        System.out.println(message);
    }
}
