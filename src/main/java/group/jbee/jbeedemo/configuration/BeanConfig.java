package group.jbee.jbeedemo.configuration;

import group.jbee.framework.annotation.Bean;
import group.jbee.framework.annotation.Configuration;
import group.jbee.jbeedemo.bean.Person;

@Configuration
public class BeanConfig {

    @Bean
    public Person getPersonBean(){
        return new Person();
    }
}
