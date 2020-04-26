package com.groceryanalytics.grocery_analytics.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {

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

}