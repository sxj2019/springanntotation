package config;

import bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 20:05
 **/
@Configuration
public class CarConfig {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
