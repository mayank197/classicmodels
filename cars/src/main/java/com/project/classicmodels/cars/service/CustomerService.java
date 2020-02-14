package com.project.classicmodels.cars.service;

import com.project.classicmodels.cars.entities.Customer;
import com.project.classicmodels.cars.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = false)
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<String> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream().map(cust -> cust.getCustomerName()).collect(Collectors.toList());
    }
}
