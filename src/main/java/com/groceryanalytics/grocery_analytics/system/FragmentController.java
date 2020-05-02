package com.groceryanalytics.grocery_analytics.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/store", method = RequestMethod.GET)
    public String getStore(Model model) {

        model.addAttribute("users", userRepository.findAll());
        return "store.html";

    }

    @GetMapping("all")
    public @ResponseBody Iterable<User> getAllUsers() 
    {
        return userRepository.findAll();
    }
}