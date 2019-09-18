package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 10:39
 **/

@Configuration
public class PersonConfig {

    @Bean
    public Person person(){
        return new Person("zhangsan",23);
    }
}
