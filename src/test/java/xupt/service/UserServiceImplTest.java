package xupt.service;

import lombok.experimental.Accessors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xupt.pojo.User;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void queryById() {
        System.out.println(userService.queryById(8l));
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setAge(1);
        userService.saveUser(user);   }
}