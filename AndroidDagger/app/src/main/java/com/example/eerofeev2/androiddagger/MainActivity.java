package com.example.eerofeev2.androiddagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.eerofeev2.androiddagger.dependence.core.ClassA1;
import com.example.eerofeev2.androiddagger.dependence.core.ClassA2;
import com.example.eerofeev2.androiddagger.dependence.core.ClassA3;
import com.example.eerofeev2.androiddagger.dependence.core.DaggerComponentA;
import com.example.eerofeev2.androiddagger.dependence.feature.ClassB1;
import com.example.eerofeev2.androiddagger.dependence.feature.ClassB2;
import com.example.eerofeev2.androiddagger.dependence.core.ComponentA;
import com.example.eerofeev2.androiddagger.dependence.feature.ComponentB;
import com.example.eerofeev2.androiddagger.dependence.feature.DaggerComponentB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ComponentA componentA = DaggerComponentA.builder().build();

        final ComponentB componentB = DaggerComponentB.builder().componentA(componentA).build();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TestA1", new TestObject(componentB).toString());
            }
        });
    }

    public static class TestObject{

        ClassA1 classA1;
        ClassA2 classA2;
        ClassA3 classA3;


        ClassB1 classB1;
        ClassB2 classB2;

        public TestObject(ComponentB componentB) {
            componentB.inject(this);
        }

        @Override
        public String toString() {
            return "TestObject{" +
                    "classA1=" + classA1.hashCode() +
                    ", classA2=" + classA2.hashCode() +
                    ", classA3=" + classA3.hashCode() +
                    ", classB1=" + classB1.hashCode() +
                    ", classB2=" + classB2.hashCode() +
                    '}';
        }
    }
}
