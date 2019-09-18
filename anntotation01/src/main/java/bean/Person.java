package bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-11 10:39
 **/

@Data
public class Person {

    @Value("zhangsan")
    private String name;
    @Value("#{20-1}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
