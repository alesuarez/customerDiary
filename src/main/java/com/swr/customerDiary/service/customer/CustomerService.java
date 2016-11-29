package com.swr.customerDiary.service.customer;

import com.swr.customerDiary.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> getAllCustomer();

    void save(String name, String lastName);
}
