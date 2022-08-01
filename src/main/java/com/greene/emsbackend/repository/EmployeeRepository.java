package com.greene.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greene.emsbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
