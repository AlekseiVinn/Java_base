package lab7_solid;

public class Main {
    public static void main(String[] args) {

        Plane su24 = new Plane("Су-24");
        Plane.Wing su24_Wing = su24.new Wing();
        su24_Wing.setWingWeight(1245.229);
        System.out.println("Самолет: " + su24.getPlaneName());
        System.out.println(su24_Wing.getWingWeight());

        Plane an124 = new Plane("Ан-124");
        Plane.Wing an124_Wing = an124.new Wing();
        an124_Wing.setWingWeight(8400);
        System.out.println("Самолет: " + an124.getPlaneName());
        System.out.println(an124_Wing.getWingWeight());
        System.out.println(su24_Wing.getWingWeight());
    }
}
