package com.charter.user.service;

import com.charter.user.model.User;
import com.charter.user.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService{
    private Map<Integer, User> users= UserRepo.getUsers();

        public UserService(){
            //User u1=new User(1L,"raja");
           User u1=new User();
           u1.setId(1);
           u1.setAid(1);
           u1.setName("shekar");
            User u2=new User();
            u2.setId(2);
            u2.setAid(2);
            u2.setName("raj");
            User u3=new User();
            u3.setId(3);
            u3.setAid(1);
            u3.setName("shekar");

            users.put(1,u1);
            users.put(2,u2);
            users.put(3,u3);


        }

        public List<User> getAllUsers(){
            return new ArrayList<User>(users.values());
        }
        public User getUserById(Integer userId){
            return users.get(userId);

        }
        public User addUser(User user){
            user.setId(users.size()+1);
            users.put(user.getId(),user);
            return user;
        }
        public User updateUser(User user){
            if(user.getId()<=0){
                return null;
            }
            users.put(user.getId(),user);
            return user;
        }
        public List<User> deleteUser(Integer id){
            users.remove(id);
            return new ArrayList<User>(users.values());
        }

}
