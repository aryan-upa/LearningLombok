package com.example.LearningLombok.Lombok.Customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class CustomerRepository implements Repository {

    private final CustomerService customerService;

    @Override
    public String value() {
        return null;
    }

    public List<Customer> findAll() {
        return new ArrayList<>();
    }

    public Customer findById(Long Id) {
        Customer customer = new Customer("new", "customer@in.our", "database");
        customer.setId(121_121_121L); // Random ID
        return customer;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

