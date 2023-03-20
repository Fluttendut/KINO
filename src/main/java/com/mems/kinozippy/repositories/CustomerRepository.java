package com.mems.kinozippy.repositories;

import com.mems.kinozippy.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
