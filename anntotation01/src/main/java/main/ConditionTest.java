package main;

import bean.Person;
import config.ConditionConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 15:05
 **/
public class ConditionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
//        ConfigurableEnvironment env = ctx.getEnvironment();
//        String osName = env.getProperty("os.name");
//        System.out.println(osName);

        Map<String, Person> map  = ctx.getBeansOfType(Person.class);
        System.out.println(map);

    }
}
