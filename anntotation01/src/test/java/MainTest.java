import aop.AopConfig;
import aop.MathCalculator;
import bean.Car;
import bean.Person;
import config.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import tx.GirlService;
import tx.TxConfig;

import javax.sql.DataSource;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 15:43
 **/
public class MainTest {

    @Test
    public void testImport(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        print(beanNames);
    }

    @Test
    public void testImport02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ImportConfig02.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        print(beanNames);
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ColorFactoryBeanConfig.class);
        print(ctx.getBeanDefinitionNames());
        Object obj = ctx.getBean("&colorFactoryBean");
        System.out.println(obj);
    }

    @Test
    public void testCar(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
        System.out.println("aplicationContext...");
//        print(ctx.getBeanDefinitionNames());
        Car car =ctx.getBean("car", Car.class);

        ctx.close();
    }

    @Test
    public void testCat(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CatConfig.class);
        System.out.println("容器构建完成。。。");
        ctx.close();
    }

    @Test
    public void testDog(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DogConfig.class);
        System.out.println("ApplicationContext...");
        ctx.close();
//        System.out.println("ApplicationContext close...");
    }

    @Test
    public void testProperties(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertiesConfig.class);
//        print(ctx.getBeanDefinitionNames());
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);
        ConfigurableEnvironment env = ctx.getEnvironment();
        String nickName = env.getProperty("person.nickName");
        System.out.println(nickName);
        ctx.close();

    }

    @Test
    public void testRed(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RedConfig.class);
        System.out.println("ctx:  "+ctx);
        ctx.close();
    }

    @Test
    public void testMorePerson(){
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MorePersonConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("test","prod");
        ctx.register(MorePersonConfig.class);
        ctx.refresh();

//        Map<String ,Person> personMap = ctx.getBeansOfType(Person.class);
//        Set<String> beanNames =personMap.keySet();
//        System.out.println(beanNames);
        String[] beanNames = ctx.getBeanNamesForType(Person.class);
        print(beanNames);
        ctx.close();
    }

    @Test
    public void testAop(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        MathCalculator calculator = ctx.getBean(MathCalculator.class);
        calculator.div(2,0);
        ctx.close();
    }

    @Test
    public void testTx(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TxConfig.class);
//        DataSource dataSource = ctx.getBean(DataSource.class);
//        System.out.println(dataSource);

        GirlService girlService = ctx.getBean(GirlService.class);
        girlService.saveGirl();
        ctx.close();
    }
    private void print(String[] beanNames){
        Stream.of(beanNames).forEach(
                x -> System.out.println(x)
        );
    }
}
