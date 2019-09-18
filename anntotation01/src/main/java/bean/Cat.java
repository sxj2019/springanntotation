package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 20:14
 **/

//@Component
public class Cat implements DisposableBean, InitializingBean {

    public Cat() {
        System.out.println("cat...contructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat...destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...init...");
    }
}
