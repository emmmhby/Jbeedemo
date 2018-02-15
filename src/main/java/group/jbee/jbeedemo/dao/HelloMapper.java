package group.jbee.jbeedemo.dao;


import group.jbee.jbeedemo.model.User;
import group.jbee.framework.annotation.Repository;
import group.jbee.framework.orm.annotation.Insert;
import group.jbee.framework.orm.annotation.Select;


import java.util.List;

@Repository
public interface HelloMapper {

    @Select("select * from users where name=#{name}")
    List<User> getUserInfo(User user);

    @Insert(value = "insert into users(name,password) values(#{name},#{password})")
    void insertNewUser(User user);
}
