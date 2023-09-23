package com.project.UMS.Service;

import com.project.UMS.Model.User;
import com.project.UMS.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userrepo;

    public List<User> getAllUser(){

        return userrepo.getUserList();
    }
    public String adduser(User u) {
      List<User> users = getAllUser();
         users.add(u);
        return "user added";
    }

    public User getbyid(Integer id) {
        List<User> users = getAllUser();
        for(User u : users){
            if(id.equals(u.getUserId())){
                return u;
            }
        }
        throw new IllegalStateException("id not found");
    }


    public String getupdateemailbyid(Integer id, String email) {
        List<User> users = getAllUser();
        for(User u : users){
            if(id.equals(u.getUserId())){
                u.setUserEmail(email);
                return " email address updated";
            }
        }
       return id + "not found";
    }

    public String deletinguser(Integer id) {
        List<User> users = getAllUser();
        for(User u : users){
            if(id.equals(u.getUserId())){
                users.remove(u);
                return "user deleted ";
            }
        }
        return id + "not found";
    }
}
