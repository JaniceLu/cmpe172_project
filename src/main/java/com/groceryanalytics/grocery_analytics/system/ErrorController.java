package com.groceryanalytics.grocery_analytics.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/oops")
    public String triggerException() {
        throw new RuntimeException(
            "Expected: controller used to showcase what went wrong"
        );
    }
}