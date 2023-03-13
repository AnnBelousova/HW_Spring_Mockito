package org.example.service;

import org.example.User;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user) {
        if (userDao.findAllUsers().contains(user)) {
            return true;
        } else {
            return false;
        }
    }
}