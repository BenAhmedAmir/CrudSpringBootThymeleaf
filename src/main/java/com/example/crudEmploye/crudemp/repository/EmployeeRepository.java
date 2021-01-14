package com.example.crudEmploye.crudemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudEmploye.crudemp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
