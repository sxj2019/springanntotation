package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 12:00
 **/
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public MathCalculator calculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
