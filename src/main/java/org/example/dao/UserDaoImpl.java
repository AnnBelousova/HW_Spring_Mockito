package org.example.dao;

import org.example.User;
import org.example.service.UserService;

import java.util.*;


public class UserDaoImpl implements UserDao {

    private List<User> userList = new ArrayList();
    User user;

    @Override
    public User getUserByName(String name) {
        userList.add(new User("Anna"));
        userList.add(new User("Sergey"));
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            } else
                return null;
        }
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        userList.add(new User("Anna"));
        userList.add(new User("Sergey"));
        return userList;
    }
}
