package lab06_oop.inherit_task4;

import java.util.Scanner;

public class Parent {
    protected int intParam;

    public Parent(){}

    public Parent(int intParam){
        this.intParam = intParam;
    }

    public void setIntParam(int intParam){
        this.intParam = intParam;
    }
}
