package com.imooc.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 23:13
 **/

@Data
@ToString
public class Apple {
    private String color;
    private long weight;

    public Apple(String color, long weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {
    }
}
