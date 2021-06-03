package com.charter.user.controller;

import com.charter.user.api.UserApi;
import com.charter.user.model.User;
import com.charter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserApi {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<Void> addUser(User body) {
        User user= userService.addUser(body);
        return  new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<User>> deleteUserById(Integer userId) {

        return new ResponseEntity<List<User>>(userService.deleteUser(userId),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<User>> getListOfUsers() {
        return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<User>> getUserById(Integer userId) {
        List<User> al=new ArrayList<User>();
        al.add(userService.getUserById(userId));
        return new ResponseEntity<List<User>>(al,HttpStatus.OK);
    }
}
