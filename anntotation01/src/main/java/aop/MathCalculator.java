package aop;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 11:54
 **/
public class MathCalculator {

    public int div(int i,int j){
        System.out.println("MathCalculator..div..");
        return  i/j;
    }
}
