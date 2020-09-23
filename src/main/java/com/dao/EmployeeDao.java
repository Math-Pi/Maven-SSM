package com.dao;

import com.bean.Employee;
import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/23  11:39
 */
public interface EmployeeDao {
    List<Employee> selectEmployeeAll();
    Employee selectEmployeeById(Integer id);
    int insertEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(Integer id);
}
