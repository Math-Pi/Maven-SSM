package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/23  11:39
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> selectEmployeeAll() {
        return employeeDao.selectEmployeeAll();
    }

    @Override
    public Employee selectEmployeeById(Integer id) {
        return employeeDao.selectEmployeeById(id);
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(Integer id) {
        return employeeDao.deleteEmployee(id);
    }
}
