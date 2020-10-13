package com.example.cms.api;

import com.example.cms.model.Customer;
import com.example.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerResource {
    @Autowired
    private CustomerService customerservice;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerservice.addCustomer(customer);

    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerservice.getCustomer();
    }
    @GetMapping (value="/{customerId}")
        public Customer getCustomer(@PathVariable("customerId") int customerId){
            return customerservice.getCustomer(customerId);
        }

        @PutMapping(value="/{customerId}")
        public Customer updateCustomer(@PathVariable("customerId") int customerId,@RequestBody Customer customer){
        return customerservice.updateCustomer(customerId,customer);
        }
        @DeleteMapping(value="/{customerId}")
        public void deleteCustomer(@PathVariable("customerId") int customerId){
            customerservice.deleteCustomer(customerId);
        }
    }


