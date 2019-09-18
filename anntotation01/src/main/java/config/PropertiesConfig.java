package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 21:55
 **/

@Configuration
@PropertySource(value = "classpath:person.properties")
public class PropertiesConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
