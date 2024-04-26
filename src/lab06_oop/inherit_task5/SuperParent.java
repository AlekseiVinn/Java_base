package lab06_oop.inherit_task5;

import java.util.Scanner;

public class SuperParent {
    protected static Scanner scan = new Scanner(System.in);

    protected int Age;
    protected String Name;

    public void setAge(){
        System.out.print("Введите возраст пользователя: ");
        this.Age = scan.nextInt();
        scan.nextLine();
    }

    public void setName(){
        System.out.print("Введите имя пользователя: ");
        this.Name = scan.nextLine();
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder(this.getClass().getSimpleName() + ":\n");
        result.append(String.format("Пользователь: %s\n", this.Name));
        result.append(String.format("Пользователь: %d", this.Age));
        return result.toString();
    }




}
