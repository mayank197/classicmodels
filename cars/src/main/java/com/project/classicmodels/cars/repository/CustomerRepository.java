package com.project.classicmodels.cars.repository;

import com.project.classicmodels.cars.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByState(String state);
    List<Customer> findByCity(String city);
    List<Customer> findByAddressLine1(String address);

    void deleteByCustomerNumber(Integer customerNumber);


}
