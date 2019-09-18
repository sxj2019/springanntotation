package config;

import bean.Blue;
import bean.Color;
import custom.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 15:43
 **/
@Configuration
//@Import({Color.class, Blue.class})
@Import(MyImportSelector.class)
public class ImportConfig {
}
