package lab3_static.task3;

import java.time.Year;

public class House {
    private Integer floors;
    private Year buildYear;
    private String buildName;

    public House(){}

    public void houseInfoInput(int floors, int buildYear, String buildName) {
        this.floors = floors;
        this.buildYear = Year.of(buildYear);
        this.buildName = buildName;
    }

    public int howOld(){
        return Year.now().compareTo(this.buildYear);
    }

    @Override
    public String toString(){
        String resultFloors = this.floors == null ? "Н/Д" : this.floors.toString();
        String resultYear = this.buildYear == null ? "Н/Д" : this.buildYear.toString();
        String resultName = this.buildName == null ? "Н/Д" : this.buildName;
        int old = howOld();

        return String.format(
                "Здание: %s,\n" +
                "Количество этажей: %s,\n" +
                "Год постройки: %s,\n" +
                "Зданию %d лет.\n", resultName, resultFloors, resultYear, old);
    }

}
