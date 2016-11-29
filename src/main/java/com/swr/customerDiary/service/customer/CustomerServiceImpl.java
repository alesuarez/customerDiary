package com.swr.customerDiary.service.customer;

import com.swr.customerDiary.model.Customer;
import com.swr.customerDiary.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void save(String name, String lastName) {
        customerRepository.save(new Customer(name, lastName));
    }
}

