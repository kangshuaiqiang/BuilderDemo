package demo.ksq.com.builderdemo.abstractest;

import demo.ksq.com.builderdemo.simpletest.Person;

/**
 * Created by 黑白 on 2017/11/20.
 */

public class ConcreteBuilder implements Builder {
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Builder setHeight(float height) {
        this.height = height;
        return this;
    }

    @Override
    public Builder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Person creat() {
        return new Person(name, sex, age, height, weight);
    }
}
