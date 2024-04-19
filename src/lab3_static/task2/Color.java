package lab3_static.task2;

public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    ORANGE("Оранжевый"),
    BLUE("Синий"),
    BLACK("Черный"),
    LAVANDER("Лавандовый"),
    PINK("Розовый"),
    WHITE("Белый");

    private String name;

    Color(String name) {this.name = name;}

    @Override
    public String toString() { return name; }

}
