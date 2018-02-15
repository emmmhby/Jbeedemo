package group.jbee.jbeedemo.action;

import group.jbee.framework.bean.Param;
import group.jbee.framework.helper.BeanHelper;
import group.jbee.jbeedemo.bean.Person;
import group.jbee.jbeedemo.model.User;
import group.jbee.jbeedemo.service.HelloService;
import group.jbee.framework.annotation.Action;
import group.jbee.framework.annotation.Controller;
import group.jbee.framework.annotation.Inject;
import group.jbee.framework.bean.Data;
import group.jbee.framework.bean.View;
import java.util.Map;


@Controller
public class HelloAction {

    @Inject
    private HelloService helloService;


    @Action("POST:/Action1")
    public Data hello(Param param){
        Map<String,Object> params = param.getMap();
        String name = (String) params.get("name");
        User user= new User();
        user.setName(name);
        user.setId(1);
        Data data=new Data(helloService.getName(user));
        return data;
    }

    @Action("PUT:/Action2")
    public Data hellojbee(Param param){
        Map<String,Object> params = param.getMap();
        User user= new User();
        user.setName((String) params.get("name"));
        user.setPassword((String) params.get("password"));
        helloService.insertNewUser(user);
        Data data=new Data(helloService.getName(user));
        return data;
    }
    @Action("GET:/Action3")
    public View personbean(){
        Person person = BeanHelper.getBean(Person.class);
        View view = new View("hello.jsp");
        view.setModel("data",person.say());
        return view;
    }
}
