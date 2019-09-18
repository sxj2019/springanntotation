package condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 15:10
 **/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        ConfigurableListableBeanFactory bc = conditionContext.getBeanFactory();
        ClassLoader cl = conditionContext.getClassLoader();
        BeanDefinitionRegistry registry= conditionContext.getRegistry();
        String osName = env.getProperty("os.name");
        System.out.println("windos---------> "+osName);
        if (osName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
