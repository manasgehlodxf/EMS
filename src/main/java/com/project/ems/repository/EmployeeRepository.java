package com.project.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ems.entity.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
