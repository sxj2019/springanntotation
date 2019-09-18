package com.imooc.main;

import com.imooc.bean.Apple;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 23:16
 **/
public class FilterApple {

    public static List<Apple> findGreenApple(List<Apple> apples){
        List<Apple> lst = new ArrayList<>();
        for (Apple apple : apples){
            if("green".equals(apple.getColor())){
                lst.add(apple);
            }
        }
        return lst;
    }

    public static List<Apple> findApple(List<Apple> apples,String color){
        List<Apple> lst = new ArrayList<>();
        for (Apple apple : apples){
            if(color.equals(apple.getColor())){
                lst.add(apple);
            }
        }
        return lst;
    }

    public static List<Apple> findAppleByFilter(List<Apple> apples,AppleFilter filter){
        List<Apple> lst = new ArrayList<>();
        for (Apple apple : apples){
            if (filter.isMath(apple)){
                lst.add(apple);
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("green",120),new
                Apple("red",190),new Apple("green",70));
//        List<Apple> lst = findGreenApple(apples);
//        List<Apple> lst = findApple(apples,"red");
//        List<Apple> lst = findAppleByFilter(apples, new AppleFilter() {
//            @Override
//            public boolean isMath(Apple apple) {
//                return "green".equals(apple.getColor()) || apple.getWeight()>100;
//            }
//        });
//        List<Apple> lst = findAppleByFilter(apples,apple -> {
//            return "green".equals(apple.getColor());
//        });
//        System.out.println(lst);

        List<Apple> list = findAppleByFilter(apples,a->"green".equals(a.getColor()));

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        }).start();
//
//        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//        System.out.println("Main: "+Thread.currentThread().getName());
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Function<String,Integer> fun = s -> s.length();

//        fun f = s -> s.length();

        SUM sum = (x,y) ->{};

        Predicate<String> predicate = a -> a.length() == 1;

        Annotation x;
        Override y;
    }

    public interface Predicate<T>{
        boolean test(T x);
    }
    @FunctionalInterface
    public interface  SUM{
        void fun(int x,int y);
    }
    @FunctionalInterface
    public  interface  fun{
        int fun(String s);
    }
    @FunctionalInterface
    public interface AppleFilter{
        public boolean isMath(Apple apple);
    }


}


