package lab6_oop.inherit_task5;

public class SuperChild extends SuperParent{
    @Override
    public void setName(){
        System.out.print("Введите имя пользователя-наследника: ");
        this.Name = scan.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.getClass().getSimpleName() + ":\n");
        result.append(String.format("Пользователь-наследник: %s\n", this.Name));
        result.append(String.format("Пользователь-наследник: %d", this.Age));
        return result.toString();
    }
}
