package org.example.dao;

import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao userDao = new UserDaoImpl();
    private final String CORRECT_NAME = "Anna";
    private final String NOT_CORRECT_NAME = "Lisa";

    @Test
    void shouldReturnUserNameIfExists() {
        User userExpected = userDao.getUserByName(CORRECT_NAME);
        User actual = new User(CORRECT_NAME);
        Assertions.assertEquals(userExpected.toString(), actual.toString());
    }

    @Test
    void shouldReturnNullIfUser() {
        User userExpected = userDao.getUserByName(NOT_CORRECT_NAME);
        Assertions.assertEquals(userExpected, null);
    }


}