package com.springbootwebmvc.springbootwebmvc.repository;

import com.springbootwebmvc.springbootwebmvc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /* We add a custom method here but do not use it in this example.
     * The method name must follow findBy<column name> pattern, then JpaRepository
     * will implement the detail jdbc query code which we do not need to care, we just
     * need to call this method and pass in the userName to get result list.
     * */
    List<Employee> findByUserName(String userName);
}
