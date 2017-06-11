package com.example.eerofeev2.androiddagger.dependence.feature;

import com.example.eerofeev2.androiddagger.MainActivity;
import com.example.eerofeev2.androiddagger.dependence.core.ComponentA;

import dagger.Component;

/**
 * @author Erofeev Evgeny
 */

@CompB2
@Component(dependencies = ComponentA.class, modules = ModelB.class)
public interface ComponentB {
    ClassB1 getClassB1();
    ClassB2 getClassB2();

    void inject(MainActivity.TestObject testObject);
}
