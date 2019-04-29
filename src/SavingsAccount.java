public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String owner, double balance, String currency) {
        super(owner, balance, currency);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }
}
