package com.example.LearningLombok.NonLobmbok.Customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerService {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers () {
        LOGGER.info("getCustomers was called!");
        return customerRepository.findAll();
    }

    Customer getCustomerById (Long Id) {
        LOGGER.info(String.format("getCustomerById for ID: %s was called!",Id));
        return customerRepository.findById(Id);
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
}
