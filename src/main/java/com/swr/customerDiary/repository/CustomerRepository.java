package com.swr.customerDiary.repository;

import com.swr.customerDiary.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
