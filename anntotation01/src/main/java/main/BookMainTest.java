package main;

import config.BookConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 10:59
 **/
public class BookMainTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BookConfig.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(
                x -> {
                    System.out.println(x);
                }
        );
    }
}
