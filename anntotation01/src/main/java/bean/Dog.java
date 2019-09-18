package bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 20:24
 **/

@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext ctx;

    public Dog() {
        System.out.println("Dog-->constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog-->init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog-->destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
