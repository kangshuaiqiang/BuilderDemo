package demo.ksq.com.builderdemo.simpletest;

/**
 * Created by 黑白 on 2017/11/20.
 * 定义一个Person类  他包含了所有属性的get和set方法
 * 简单
 */

public class Person {
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;


    public Person(String name, boolean sex, int age, float height, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
