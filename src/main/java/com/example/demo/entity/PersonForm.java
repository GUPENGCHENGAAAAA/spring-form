package com.example.demo.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2018/6/4.
 */
public class PersonForm {
    @NotNull
    @Size(min = 2,max = 20)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
