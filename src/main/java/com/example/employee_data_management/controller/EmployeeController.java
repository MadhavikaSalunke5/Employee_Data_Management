package com.example.employee_data_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_data_management.entity.Employee;
import com.example.employee_data_management.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*") // allow frontend JS
public class EmployeeController {

  private final EmployeeService service;

  public EmployeeController(EmployeeService service) {
    this.service = service;
  }

  @GetMapping
  public List<Employee> getAll() {
    return service.getAllEmployees();
  }

  @PostMapping
  public Employee add(@RequestBody Employee employee) {
    return service.addEmployee(employee);
  }

  @PutMapping("/{id}")
  public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
    return service.updateEmployee(id, employee);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.deleteEmployee(id);
  }
}
