package config;

import custom.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 16:13
 **/

@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ImportConfig02 {
}
