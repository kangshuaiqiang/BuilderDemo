package demo.ksq.com.builderdemo.abstractest;

/**
 * Created by 黑白 on 2017/11/20.
 * Director  主管
 * 主管类  就只操作builder对象的
 */

public class Director {
    private Builder abBuilder;

    public Director(Builder abBuilder) {
        this.abBuilder = abBuilder;
    }

    public void construct(String name, boolean sex, int age, float height, float weight) {
        abBuilder.setName(name);
        abBuilder.setSex(sex);
        abBuilder.setAge(age);
        abBuilder.setHeight(height);
        abBuilder.setWeight(weight);
    }
}
