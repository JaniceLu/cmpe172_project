package com.groceryanalytics.grocery_analytics.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.groceryanalytics.grocery_analytics.store.User;
import com.groceryanalytics.grocery_analytics.store.UserRepository;

@Controller
public class FragmentController {

    @Autowired

    private UserRepository userRepository;
    
    @GetMapping("items")
    public String getItems() {
        return "items.html";
    }

    @GetMapping("hours")
    public String getHours() {
        return "hours.html";
    }

    @GetMapping("store")
    public String getStore() {
        return "store.html";
    }

    @GetMapping("all")
    public @ResponseBody Iterable<User> getAllUsers() 
    {
        return userRepository.findAll();
    }
}