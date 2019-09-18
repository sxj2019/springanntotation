package main;

import bean.Person;
import config.PersonConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 10:43
 **/
public class PersonMainTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanNames) System.out.println(beanName);
    }
}
