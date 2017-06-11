package com.example.eerofeev2.androiddagger.dependence.feature;

import com.example.eerofeev2.androiddagger.dependence.core.ClassA1;
import com.example.eerofeev2.androiddagger.dependence.core.ClassA2;

import dagger.Module;
import dagger.Provides;

/**
 * @author Erofeev Evgeny
 */
@Module
public class ModelB {
    @Provides
    @CompB2
    public ClassB1 createB1(){
        return new ClassB1();
    }
    @Provides
    public ClassB2 createB2(ClassB1 classB1, ClassA1 classA1)
    {
        return new ClassB2(classB1, classA1);
    }

}
