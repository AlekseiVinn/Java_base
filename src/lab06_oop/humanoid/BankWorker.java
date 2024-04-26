package lab06_oop.humanoid;

public class BankWorker extends Human implements IChangingBank{
    private String bankName;

    public BankWorker(String firstname, String lastName, String bank){
        super(firstname,lastName);
        this.bankName = bank;
    }

    @Override
    public void printInfo(){
        String result = String.format("%s %s - сотрудник банка %s", this.lastName, this.firstName, this.bankName);
        System.out.println(result);
    }

    @Override
    public void setNewBank(String newBank) {
        this.bankName = newBank;
    }
}
