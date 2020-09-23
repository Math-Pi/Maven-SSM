package com.service;

import com.bean.User;

import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/22  22:28
 */
public interface UserService {
    /*查询所有记录*/
    List<User> selectAll();
    /*通过id查询*/
    User selectById(Integer id);
    /*插入记录*/
    void insert(User user);
    /*更新记录*/
    void update(User user);
    /*删除记录*/
    void delete(Integer id);

}
