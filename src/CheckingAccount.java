public class CheckingAccount extends BankAccount {

    private String accountNumber;
    private double maxDiscovered;

    public CheckingAccount(String owner, double balance, String currency) {
        super(owner, balance, currency);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMaxDiscovered() {
        return maxDiscovered;
    }

    public void setMaxDiscovered(double maxDiscovered) {
        this.maxDiscovered = maxDiscovered;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", maxDiscovered=" + maxDiscovered +
                "} " + super.toString();
    }
}
