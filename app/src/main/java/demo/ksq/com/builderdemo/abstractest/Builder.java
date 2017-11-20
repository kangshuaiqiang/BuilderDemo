package demo.ksq.com.builderdemo.abstractest;

import demo.ksq.com.builderdemo.simpletest.Person;

/**
 * Created by 黑白 on 2017/11/20.
 */

public interface Builder {
    Builder setName(String name);

    Builder setSex(boolean sex);

    Builder setAge(int age);

    Builder setHeight(float height);

    Builder setWeight(float weight);

    Person creat();
}
