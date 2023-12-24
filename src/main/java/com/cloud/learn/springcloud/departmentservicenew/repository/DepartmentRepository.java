package com.cloud.learn.springcloud.departmentservicenew.repository;


import com.cloud.learn.springcloud.departmentservicenew.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
