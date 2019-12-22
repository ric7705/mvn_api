package com.ceiere.mvn_api;

import org.springframework.web.bind.annotation.RequestMapping;

public class SwaggerController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
