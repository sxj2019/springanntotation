package condition;

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
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String osName = env.getProperty("os.name");
        System.out.println("linux------>"+ osName);
        if(osName.equals("linux")){
            return true;
        }
        return false;
    }
}
