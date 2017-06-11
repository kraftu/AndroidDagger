package com.example.eerofeev2.androiddagger.dependence.core;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Erofeev Evgeny
 */

@Singleton
@Component(modules = ModelA.class)
public interface ComponentA {
    ClassA1 getClass1();
    ClassA2 getClass2();
    ClassA3 getClass3();
}
