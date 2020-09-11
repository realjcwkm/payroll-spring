/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.payroll.repositories;

import com.employee.payroll.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
