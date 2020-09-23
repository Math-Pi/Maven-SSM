package com.service;

import com.bean.Employee;

import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/23  11:38
 */
public interface EmployeeService {
    /*查询所有记录*/
    List<Employee> selectEmployeeAll();
    /*通过id查询*/
    Employee selectEmployeeById(Integer id);
    /*插入记录*/
    int insertEmployee(Employee employee);
    /*更新记录*/
    int updateEmployee(Employee employee);
    /*删除记录*/
    int deleteEmployee(Integer id);
}
