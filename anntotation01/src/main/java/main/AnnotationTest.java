package main;

import annotation.MyAnnotation;
import config.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 11:40
 **/
public class AnnotationTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Stream.of(beanNames).forEach(
//                x -> {
//                    System.out.println(x);
//                }
//        );
        MyAnnotation myAnnotation = ctx.getBean(MyAnnotation.class);
        System.out.println(myAnnotation);
    }
}
