package config;

import custom.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 19:51
 **/

@Configuration
public class ColorFactoryBeanConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
