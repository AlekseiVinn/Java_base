package syntax;

public enum Jengre {
    NONE ("Не определен"),
    ROCK ("Рок"),
    RNB ("R'n'B"),
    POP ("Поп"),
    RAP ("Рэп"),
    INDIE ("Инди");

    private String name;

    Jengre(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
