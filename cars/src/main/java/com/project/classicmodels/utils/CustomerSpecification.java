package com.project.classicmodels.utils;

/*
    File Name : CustomerSpecification.java
                (Used for custom Filter Functionality)

    @author Mayank Sharma
    First Created on 27-02-2020 at 00:10
*/

import com.project.classicmodels.cars.entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CustomerSpecification {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerSpecification.class);

    public static final Specification<Customer> getCustomerFilter(){

        return new Specification<Customer>() {

            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                final List<Predicate> predicates = new ArrayList<>();

                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));

            }

        };

    }
}
