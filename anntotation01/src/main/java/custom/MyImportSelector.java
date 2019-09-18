package custom;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 16:02
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"bean.Color","bean.Blue"};
    }
}
