package group.jbee.jbeedemo.service;

import group.jbee.jbeedemo.dao.HelloMapper;
import group.jbee.jbeedemo.model.User;
import group.jbee.framework.annotation.Inject;
import group.jbee.framework.annotation.Service;

import java.util.List;

@Service
public class HelloService {


    @Inject
    HelloMapper helloMapper;

    public List<User> getName(User user){
        return helloMapper.getUserInfo(user);
    }
    public void insertNewUser(User user){
        helloMapper.insertNewUser(user);
    }
}
