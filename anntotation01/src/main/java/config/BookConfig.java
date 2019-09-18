package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 10:58
 **/
@Configuration
@ComponentScan(basePackages = "bean",
        includeFilters = {
//            @ComponentScan.Filter(
//                  type = FilterType.ANNOTATION,
//                  classes = {Controller.class}
//            )
            @ComponentScan.Filter(
                   type = FilterType.CUSTOM,
                    value = {MyFilterType.class}
            )
        },
        useDefaultFilters = false
)
public class BookConfig {
}
