package com.springboot.springboot.service;

import com.springboot.springboot.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();
}
