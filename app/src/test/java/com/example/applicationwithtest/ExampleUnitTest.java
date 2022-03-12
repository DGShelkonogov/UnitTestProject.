package com.example.applicationwithtest;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkEmailTest() {
        String email = "asd";
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("asd", "asd"));

        assertTrue(MainActivity.checkEmail(email, users));
    }

    @Test
    public void checkPasswordTest() {
        String password = "123asdASD$$$$$$$";
        assertTrue(MainActivity.checkPassword(password));
    }

    @Test
    public void checkAddUser() {
        String email = "asd";
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("asd2", "123asdASD$$$$$$"));

        assertTrue(MainActivity.addUser(email,"123asdASD$$$$$$$", users));
    }
}