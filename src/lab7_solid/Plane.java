package lab7_solid;

public class Plane {

    private String planeName;

    public Plane(String planeName){
        this.planeName = planeName;
    }

    public String getPlaneName() { return this.planeName; }

    public class Wing{

        private double wingWeight;

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public String  getWingWeight(){
            return String.format("Вес крыла самолета: %,.2f кг", this.wingWeight);
        }
    }

}
