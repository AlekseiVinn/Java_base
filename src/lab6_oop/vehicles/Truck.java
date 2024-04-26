package lab6_oop.vehicles;

public class Truck extends Car{
    public int wheels;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        super(weight,model,color,speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsCount){
        this.wheels = wheelsCount;
        System.out.println("Количество колес: " + this.wheels);
    }

}
