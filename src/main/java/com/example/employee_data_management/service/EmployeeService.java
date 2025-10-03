package com.example.employee_data_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_data_management.entity.Employee;
import com.example.employee_data_management.repository.EmployeeRepository;

@Service
public class EmployeeService {

  private final EmployeeRepository repository;

  public EmployeeService(EmployeeRepository repository) {
    this.repository = repository;
  }

  public List<Employee> getAllEmployees() {
    return repository.findAll();
  }

  public Employee addEmployee(Employee employee) {
    return repository.save(employee);
  }

  public Employee updateEmployee(Long id, Employee employee) {
    return repository.findById(id).map(emp -> {
      emp.setName(employee.getName());
      emp.setEmail(employee.getEmail());
      emp.setDepartment(employee.getDepartment());
      emp.setSalary(employee.getSalary());
      return repository.save(emp);
    }).orElseThrow(() -> new RuntimeException("Employee not found"));
  }

  public void deleteEmployee(Long id) {
    repository.deleteById(id);
  }
}
