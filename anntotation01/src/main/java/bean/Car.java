package bean;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 20:04
 **/
public class Car {

    public Car() {
        System.out.println("car...construct...");
    }

    public void init(){
        System.out.println("car ...init..");
    }

    public void destory(){
        System.out.println("car...destroy..");
    }
}
