package com.example.thymeleafboilerplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;

@RequestMapping("/")
@Controller
public class TestController {
    @Autowired
    ApplicationContext ac;
    @GetMapping
    public String DBConnectTest() throws SQLException {
        System.out.println(ac.getBean(DataSource.class).getConnection());
        return "index";
    }
}
