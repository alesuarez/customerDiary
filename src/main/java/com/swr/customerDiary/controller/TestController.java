package com.swr.customerDiary.controller;

import com.swr.customerDiary.model.Customer;
import com.swr.customerDiary.repository.CustomerRepository;
import com.swr.customerDiary.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/testController")
@Controller
public class TestController {

    @Autowired
    CustomerService customerService;

    @ResponseBody
    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(value = "/allCustomer", method = RequestMethod.GET)
    Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @ResponseBody
    @RequestMapping(value = "/crear/{name}/{lastName}", method = RequestMethod.GET)
    void putCustomer(@PathVariable("name") String name, @PathVariable("lastName") String lastName){
        customerService.save(name, lastName);
    }
}
