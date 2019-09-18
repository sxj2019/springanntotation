package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 10:46
 **/
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name: "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("context: "+applicationContext);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String str = resolver.resolveStringValue("${os.name},#{1+1}");
        System.out.println("resolver: "+str);
    }
}
