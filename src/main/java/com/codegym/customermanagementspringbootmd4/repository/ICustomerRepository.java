package com.codegym.customermanagementspringbootmd4.repository;

import com.codegym.customermanagementspringbootmd4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}