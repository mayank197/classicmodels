package com.project.classicmodels.cars.controller;

import com.project.classicmodels.cars.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/customers/city/{city}")
    public List<String> getCustomersByCity(@PathVariable(value = "city") String city){
        List<String> customers = customerService.getCustomersByCity(city);
        return customers;
    }

    @GetMapping("/customers/state/{state}")
    public List<String> getCustomersByState(@PathVariable(value = "state") String state){
        List<String> customers = customerService.getCustomersByState(state);
        return customers;
    }

    @GetMapping("/customers/addr")
    public List<String> getCustomersByAddress(@RequestParam(value = "address") String address){
        List<String> customers = customerService.getCustomersByAddress(address);
        return customers;
    }

    @DeleteMapping("/customers/remove")
    public List<String> deleteCustomerById(@RequestParam(value = "custId") Integer customerId){
        List<String> customers = customerService.deleteCustomerByCustomerNumber(customerId);
        return customers;
    }

}
