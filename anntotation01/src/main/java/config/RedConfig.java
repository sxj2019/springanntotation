package config;

import bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 10:51
 **/

@Configuration
public class RedConfig {

    @Bean(name = "red02")
    public Red red(){
        return new Red();
    }
}
