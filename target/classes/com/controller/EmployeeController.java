package com.controller;

import com.bean.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/23  11:37
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    /*查询所有记录*/
    @RequestMapping("/selectEmployeeAll")
    @ResponseBody
    public List<Employee> selectEmployeeAll(Model model){
        return employeeService.selectEmployeeAll();
    }
    /*通过id查询*/
    @RequestMapping("/selectEmployee/{id}")
    @ResponseBody
    public Employee selectEmployeeById(@PathVariable Integer id){
        return employeeService.selectEmployeeById(id);
    }
    /*插入一条记录*/
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    /*插入一条记录*/
    @RequestMapping("/insertEmployee")
    @ResponseBody
    public void insertEmployee(Employee employee) throws UnsupportedEncodingException {
/*
        Employee employee=new Employee(2,"李四",20,"男","12386942894","东莞","123");
*/
        employee.setName(new String(employee.getName().getBytes("iso8859-1"),"utf-8"));
        employee.setSex(new String(employee.getSex().getBytes("iso8859-1"),"utf-8"));
        employee.setAddress(new String(employee.getAddress().getBytes("iso8859-1"),"utf-8"));
        int rows=employeeService.insertEmployee(employee);
        if(rows>0)
            System.out.println("数据插入成功！");
        else
            System.out.println("数据插入失败！");
    }
    /*更新记录*/
    @RequestMapping("/updateEmployee/{id}")
    @ResponseBody
    public void updateEmployee(@PathVariable Integer id){
        Employee employee=new Employee(id,"王五",20,"男","12386942894","深圳","123");
        int rows=employeeService.updateEmployee(employee);
        if(rows>0)
            System.out.println("数据更新成功！");
        else
            System.out.println("数据更新失败！");
    }
    /*删除记录*/
    @RequestMapping("/deleteEmployee/{id}")
    @ResponseBody
    public void deleteEmployee(@PathVariable Integer id){
        int rows=employeeService.deleteEmployee(id);
        if(rows>0)
            System.out.println("数据删除成功！");
        else
            System.out.println("数据删除失败！");
    }
}