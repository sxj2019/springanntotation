package custom;

import bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 19:51
 **/
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean....");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
