package lab6_oop;

import lab6_oop.inherit_task4.Child;
import lab6_oop.inherit_task5.SuperChild;
import lab6_oop.inherit_task5.SuperParent;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Child childTest = new Child();
        Random rnd = new Random();
        childTest.setIntParam(rnd.nextInt(100));
        System.out.println(childTest.getIntField());

        SuperParent sp = new SuperParent();
        sp.setAge();
        sp.setName();
        System.out.println(sp);

        SuperChild sс = new SuperChild();
        sс.setAge();
        sс.setName();
        System.out.println(sс);


    }
}
