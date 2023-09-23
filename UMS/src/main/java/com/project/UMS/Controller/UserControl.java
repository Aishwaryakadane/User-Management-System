package com.project.UMS.Controller;

import com.project.UMS.Model.User;
import com.project.UMS.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserControl {

    @Autowired
    UserService userservice;

    @PostMapping("posting/user")
    public String adduser(@Valid @RequestBody User u){
        return userservice.adduser(u);
    }

    @GetMapping("get/user")
    public List<User> getAllUser(){
        return userservice.getAllUser();
    }

    @GetMapping("getting/id/{id}")
    public User getbyid(@PathVariable Integer id){
        return userservice.getbyid(id);
    }

    @PutMapping("user/{id}/address/{email}")
    public String getupdated(@PathVariable Integer id, @Email @PathVariable String email){
        return userservice.getupdateemailbyid(id,email);
    }

    @DeleteMapping("deleting/{id}")
    public String userdel(@PathVariable Integer id){
        return userservice.deletinguser(id);
    }

}
