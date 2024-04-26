package lab6_oop.humanoid;

public class Client extends Human implements IChangingBank{
    private String bankName;

    public Client(String firstname, String lastName, String bank){
        super(firstname,lastName);
        this.bankName = bank;
    }

    @Override
    public void printInfo(){
        String result = String.format("%s %s - клиент банка %s", this.lastName, this.firstName, this.bankName);
        System.out.println(result);
    }

    @Override
    public void setNewBank(String newBank) {
        this.bankName = newBank;
    }
}
