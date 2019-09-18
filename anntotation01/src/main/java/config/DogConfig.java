package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 20:26
 **/

@Configuration
@ComponentScan(basePackages = {"bean","custom"})
public class DogConfig {
}
