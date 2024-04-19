package lab3_static.task4;

public class Tree {
    /*
    4. Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
●	Конструктор, который устанавливает все переменные в классе;

Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

     */
    private Integer age;
    private Boolean isAlive;
    private String name;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Конструктор возраст+название. Дерево: " + this.name + ", возраст: " + this.age + ".");
    }

    public Tree(int age, String name, boolean isAlive){
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
        System.out.println("Полный конструктор. Дерево: " + this.name + ", возраст: " + this.age + ", живое: " + this.isAlive);
    }
}
