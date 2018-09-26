package com.sda.mysql.controlers;

import com.sda.mysql.model.User;
import com.sda.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/chat/user")
public class UserControler {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String surname){
        User user = new User();
        user.setName(name);
        user.setSurename(surname);
        userRepository.save(user);
        return user.toString();
    }
}
