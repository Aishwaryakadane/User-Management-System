package com.project.UMS.BeanBag;

import com.project.UMS.Model.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootConfiguration
@EnableAutoConfiguration
public class UserBean {

    @Bean
    List<User> userList(){
        return new ArrayList<>();
    }
}
