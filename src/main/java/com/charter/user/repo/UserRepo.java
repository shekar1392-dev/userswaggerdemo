package com.charter.user.repo;

import com.charter.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepo {


    public static Map<Integer, User> users = new HashMap<>();

    public static Map<Integer, User> getUsers() {
        return users;
    }
}