package com.dao;

import com.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author CJM
 * @Date 2020/9/22  22:44
 */
public interface UserDao {
    List<User> selectAll();
    User selectById(Integer id);
    void insert(User user);
    void update(User user);
    void delete(Integer id);
}
