package com.example.eerofeev2.androiddagger.dependence.core;

/**
 * @author Erofeev Evgeny
 */
public class ClassA3 {
    private ClassA1 classA1;
    private ClassA2 classA2;

    public ClassA3(ClassA1 classA1, ClassA2 classA2) {
        this.classA1 = classA1;
        this.classA2 = classA2;
    }

    @Override
    public String toString() {
        return "ClassA3{" +
                "classA1=" + classA1 +
                ", classA2=" + classA2 +
                '}';
    }
}
