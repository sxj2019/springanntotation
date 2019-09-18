package com.imooc.main;

import com.imooc.bean.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-14 18:35
 **/
public class FilterApple02 {

    public static List<Apple> fileAppler(List<Apple> src, Predicate<Apple> predicate){
        List<Apple> lst = new ArrayList<>();
        for (Apple apple : src){
            if (predicate.test(apple)) {
                    lst.add(apple);
                }
            }
        return lst;
    }

    public static List<Apple> filterApple02(List<Apple> src, FilterApple.Predicate<Apple> predicate){
//        Stream.of(src).forEach(
//
//        );
        return null;
    }
}
