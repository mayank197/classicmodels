package com.project.classicmodels.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.classicmodels.cars.entities.Customer;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

public class CustomerDto {

    @JsonProperty("addr1")
    private String addressLine1;

    @JsonProperty("addr2")
    private String addressLine2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("contact_first_name")
    private String contactFirstName;

    private String contactLastName;
    private String country;
    private BigDecimal creditLimit;
    private String customerName;
    private String phone;
    private String postalCode;
    private String state;

    public static CustomerDto mapDetailsToDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setAddressLine1(customer.getAddressLine1());
        customerDto.setAddressLine2(customer.getAddressLine2());
        customerDto.setCity(customer.getCity());
        customerDto.setContactFirstName(customer.getContactFirstName());
        customerDto.setContactLastName(customer.getContactLastName());
        customerDto.setCountry(customer.getCountry());
        customerDto.setCreditLimit(customer.getCreditLimit());
        customerDto.setPhone(customer.getPhone());
        customerDto.setPostalCode(customer.getPostalCode());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setState(customer.getState());
        return customerDto;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
