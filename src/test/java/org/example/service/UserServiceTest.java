package org.example.service;


import org.example.User;
import org.example.dao.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private final String CORRECT_NAME = "Anna";
    private final String NOT_CORRECT_NAME = "Lisa";


    @Mock
    UserService userService;
    @InjectMocks
    UserDaoImpl out;

    @Test
    void shouldReturnTrueIfUserExists() {
        User user = new User(CORRECT_NAME);
        when(userService.checkUserExist(user))
                .thenReturn(true);
    }

    @Test
    void shouldReturnTrueIfUserNotExists() {
        User user = new User(NOT_CORRECT_NAME);
        when(userService.checkUserExist(user))
                .thenReturn(false);
    }
}