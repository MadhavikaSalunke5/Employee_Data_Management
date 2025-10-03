package com.example.employee_data_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_data_management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
