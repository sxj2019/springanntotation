package config;

import bean.Person;
import condition.LinuxCondition;
import condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 15:05
 **/

@Configuration
public class ConditionConfig {

    @Bean("person")
    public Person person01(){
        return new Person("zhangsan",26);
    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person02(){
        return new Person("Bill",56);
    }

    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person person03(){
        return new Person("Linus",34);
    }
}
