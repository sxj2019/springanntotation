package custom;

import bean.Color;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 16:14
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasBean = registry.containsBeanDefinition("bean.Color");
        System.out.println("hasBean: "+hasBean);
        if(!hasBean){
            RootBeanDefinition definition = new RootBeanDefinition(Color.class);
            registry.registerBeanDefinition("color02",definition);
        }
    }
}
