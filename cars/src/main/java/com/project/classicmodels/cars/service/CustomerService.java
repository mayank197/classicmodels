package com.project.classicmodels.cars.service;

import com.project.classicmodels.cars.entities.Customer;
import com.project.classicmodels.cars.repository.CustomerRepository;
import com.project.classicmodels.dtos.CustomerDto;
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

    public List<String> getCustomersByCity(String city) {
        return customerRepository.findByCity(city)
                .stream().map(cust -> cust.getCustomerName())
                .collect(Collectors.toList());
    }

    public List<String> getCustomersByState(String state){
        return customerRepository.findByState(state)
                .stream().map(cust -> cust.getCustomerName())
                .collect(Collectors.toList());
    }

    public List<String> getCustomersByAddress(String address){
        return customerRepository.findByAddressLine1(address)
                .stream().map(cust -> cust.getCustomerName())
                .collect(Collectors.toList());
    }

    public List<CustomerDto> getAllCust(){
        return customerRepository.findAll()
                .stream()
                .map(CustomerDto::mapDetailsToDto)
                .collect(Collectors.toList());
    }


    public List<String> deleteCustomerByCustomerNumber(Integer customerId) {
        customerRepository.deleteByCustomerNumber(customerId);
        return getAllCustomers();
    }
}
