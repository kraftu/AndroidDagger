package com.example.eerofeev2.androiddagger.dependence.feature;

import com.example.eerofeev2.androiddagger.dependence.core.ClassA1;

/**
 * @author Erofeev Evgeny
 */
public class ClassB2 {
    ClassB1 classB1;
    ClassA1 classA1;

    public ClassB2(ClassB1 classB1, ClassA1 classA1) {
        this.classB1 = classB1;
        this.classA1 = classA1;
    }

    @Override
    public String toString() {
        return "ClassB2{" +
                "classB1=" + classB1 +
                ", classA1=" + classA1 +
                '}';
    }
}
