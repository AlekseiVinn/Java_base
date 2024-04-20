package lab3_static;


import lab3_static.task1.Study;
import lab3_static.task2.Color;
import lab3_static.task2.SimpleClass;
import lab3_static.task3.House;
import lab3_static.task4.Tree;

public class Main {
    public static void main(String[] args) {
        //задание 1
        Study Java = new Study("Изучение Java - это просто!");
        System.out.println(Java.printCourse());

        //задание 2
        SimpleClass obj1 = new SimpleClass(Color.RED);
        SimpleClass obj2 = new SimpleClass(Color.LAVANDER, 45.1321);
        SimpleClass obj3 = new SimpleClass();
        obj3.setColor(Color.ORANGE);
        obj3.setName("Заполненный объект");
        obj3.setWeight(10.1515);
        SimpleClass obj4 = new SimpleClass();

        System.out.println("\nЭкземпляр класса(только цвет)");
        System.out.println(obj1);
        System.out.println("\nЭкземпляр класса (цвет+вес)");
        System.out.println(obj2);
        System.out.println("\nЭкземпляр класса (заполненный)");
        System.out.println(obj3);
        System.out.println("\nЭкземпляр класса (пустой)");
        System.out.println(obj4);
        System.out.println();

        //задание 3
        House kreml = new House();
        kreml.houseInfoInput(10, 1495, "Московский кремль");
        House worldTradeCenter = new House();
        worldTradeCenter.houseInfoInput(94, 1966, "Всемирный торговый центр");
        System.out.println(kreml);
        System.out.println(worldTradeCenter);

        //задание 4
        Tree empty = new Tree();
        Tree oak = new Tree(7, "Ель");
        Tree spruce = new Tree(40, "Дуб", true);

    }
}
