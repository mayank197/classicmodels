package com.project.classicmodels.cars.controller;

import com.project.classicmodels.cars.entities.Customer;
import com.project.classicmodels.cars.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cars")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<String> getAllCustomers(){
        List<String> customers = customerService.getAllCustomers();
        return customers;
    }

}
