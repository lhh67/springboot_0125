package xupt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xupt.mapper.UserMapper;
import xupt.pojo.User;

@Service
public class UserServiceImpl  {


@Autowired
private xupt.mapper.UserMapper userMapper;

    //根据id查询
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void saveUser(User user){
        System.out.println("ss");
        userMapper.insertSelective(user);

    }

}
