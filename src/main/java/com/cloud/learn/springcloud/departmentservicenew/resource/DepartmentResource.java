package com.cloud.learn.springcloud.departmentservicenew.resource;

import com.cloud.learn.springboot.departmentservice.entity.Department;
import com.cloud.learn.springboot.departmentservice.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentResource {

    private DepartmentRepository departmentRepository;

    public DepartmentResource(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/departments")
    public List<Department> getDepartments(){
/*        List<Department> departments = new ArrayList<>();
        departments.add(new Department(1,"Ram"));
        departments.add(new Department(1,"Sham"));
        return departments;*/
        return departmentRepository.findAll();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable Integer id){
        return departmentRepository.findById(id).get();
    }

    @PostMapping("/departments")
    public List<Department> createDepartments(@RequestBody List<Department> departments){

        return departmentRepository.saveAll(departments);

    }

}
