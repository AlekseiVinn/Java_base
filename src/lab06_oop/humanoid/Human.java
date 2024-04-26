package lab06_oop.humanoid;

public abstract class Human {
    protected String firstName;
    protected String lastName;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void printInfo();
}
