package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 11:54
 **/

@Aspect
public class LogAspect {

//    @Pointcut("public int aop.MathCalculator.*(..)")
    @Pointcut("execution(public int aop.MathCalculator.*(..))")
    public void getPoint(){

    }
    @Before("getPoint()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+
                "除法开始计算,参数是："+ Arrays.asList(joinPoint.getArgs()));
    }

    @After("getPoint()")
    public void  logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法计算结束");
    }

    @AfterReturning(pointcut = "getPoint()",returning = "divReturn")
    public void logReturn(JoinPoint joinPoint,Object divReturn){
        System.out.println(joinPoint.getSignature().getName()+"除法计算返回结果是："+divReturn);
    }

    @AfterThrowing(pointcut = "getPoint()",throwing = "divThrowing")
    public void logException(JoinPoint joinPoint,Object divThrowing){
        System.out.println(joinPoint.getSignature().getName()+"除法计算报异常，异常是："+divThrowing);
    }
}
