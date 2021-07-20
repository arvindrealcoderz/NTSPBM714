package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.beans.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> , JpaRepository<Employee, Integer> ,PagingAndSortingRepository<Employee, Integer>{

}
