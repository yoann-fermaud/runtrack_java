package jour2.job01;

public class BankAccountExtended extends BankAccount {
    private int savingAccountBalance;
    private int interest;

    public BankAccountExtended(int currentAccountBalance, int savingAccountBalance, int interest) {
        super(currentAccountBalance);
        this.savingAccountBalance = savingAccountBalance;
        this.interest = interest;
    }

    private void newSavingAccountBalance() {
        float rate = (float) this.interest / 100;
        this.savingAccountBalance += (int) (this.savingAccountBalance * rate);
        System.out.println("Interest added: " + this.interest + "€. New balance: " + this.savingAccountBalance + "€.");
    }

    public void showInfo() {
        getBalance();
        System.out.println("Savings account balance: " + this.savingAccountBalance + "€.");
        newSavingAccountBalance();
    }
}
