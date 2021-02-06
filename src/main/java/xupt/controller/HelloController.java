package xupt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xupt.pojo.User;
import xupt.service.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

@RestController
public class HelloController {
    @Value("${xupt.url}")
    private String url;
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }

    @GetMapping("")
    public void dd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jj.html").forward(request,response);
    }


    @GetMapping("hello")
    public String hello(){
        System.out.println(url);
        System.out.println(dataSource);
        return "jhfsjf"+url;
    }
}
