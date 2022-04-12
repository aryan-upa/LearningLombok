package com.example.LearningLombok.Lombok.Customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@AllArgsConstructor
@Slf4j
public class CustomerService {
    // IntelliJ might suggest us to make this class a record but that's because the methods are un-used.

    private final CustomerRepository customerRepository;

    List<Customer> getCustomers () {
        // Change LOGGER to log.
        log.info("getCustomers was called!");
        return customerRepository.findAll();
    }

    Customer getCustomerById (Long Id) {
        log.info(String.format("getCustomerById for ID: %s was called!",Id));
        return customerRepository.findById(Id);
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
}
