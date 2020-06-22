package com.zy.Repository;

import com.zy.Entry.Customer;
import com.zy.Entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Customer findByCusIdAAndCusPassWord(String cusId,String password);
}
