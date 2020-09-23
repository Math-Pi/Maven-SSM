package com.controller;

import com.bean.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/22  22:28
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello";
    }
    /*查询所有记录*/
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<User> users=userService.selectAll();
        model.addAttribute("users",users);
        return "list";
    }
    /*通过id查询*/
    @RequestMapping("/select/{id}")
    @ResponseBody
    public User selectById(@PathVariable Integer id){
        return userService.selectById(id);
    }
    /*插入一条记录*/
    @RequestMapping("/insert")
    @ResponseBody
    public void insert(){
        User user=new User(2,"李四","123");
        userService.insert(user);
    }
    /*更新记录*/
    @RequestMapping("/update/{id}")
    @ResponseBody
    public void update(@PathVariable Integer id){
        User user=new User(id,"王五","123");
        userService.update(user);
    }
    /*删除记录*/
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }
}

