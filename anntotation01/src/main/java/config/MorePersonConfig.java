package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 11:12
 **/

@Configuration
public class MorePersonConfig {

    @Profile("test")
    @Bean
    public Person person01(){
        return new Person();
    }

    @Profile("dev")
    @Bean
    public Person person02(){
        return new Person();
    }

    @Profile("prod")
    @Bean
    public Person person03(){
        return new Person();
    }
}
