package lab3_static.task2;

public class SimpleClass {
    private Color color;
    private String name;
    private Double weight;

    public SimpleClass(){}

    public SimpleClass(Color color){
        this.color = color;
    }

    public SimpleClass(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        String resultColor = this.color == null ? "Н/Д" : this.color.toString();
        String resultName = this.name == null ? "Н/Д" : this.name;
        String resultWeight = this.weight == null ? "Н/Д" : String.format("%.2f",this.weight);

        return String.format("Объект\n" +
                    "Цвет: %s,\n" +
                    "Название: %s,\n" +
                    "Вес: %s", resultColor, resultName, resultWeight);
    }
}
