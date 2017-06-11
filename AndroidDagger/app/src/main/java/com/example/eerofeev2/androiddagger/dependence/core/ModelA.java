package com.example.eerofeev2.androiddagger.dependence.core;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Erofeev Evgeny
 */

@Module
public class ModelA {
    @Provides
    @Singleton
    public ClassA1 getA1(){
        return new ClassA1();
    }
    @Provides
    @Singleton
    public ClassA2 getA2(){
        return new ClassA2();
    }
    @Provides
    public ClassA3 getA3(ClassA1 classA1, ClassA2 classA2){
        return new ClassA3(classA1, classA2);
    }
}
