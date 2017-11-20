package demo.ksq.com.builderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import demo.ksq.com.builderdemo.abstractest.ConcreteBuilder;
import demo.ksq.com.builderdemo.abstractest.Director;
import demo.ksq.com.builderdemo.simpletest.Builder;
import demo.ksq.com.builderdemo.simpletest.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //建造者模式    简单实现
//        testBuilder();
        abtestBuilder();
    }

    private void abtestBuilder() {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("Mirhunana", true, 23, 180, 100);
        Person person = builder.creat();
        Log.e("zzzzzz", person.getName());
    }

    private void testBuilder() {
        Builder builder = new Builder();
        builder.setName("康帅强");
        builder.setAge(25);
        Person person = builder.create();
        Log.e("zzzzzz", person.getName());
    }
}
