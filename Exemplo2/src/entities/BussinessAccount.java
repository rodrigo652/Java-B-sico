package entities;

public class BussinessAccount extends Account{

    private double loanLimit;

    public BussinessAccount() {

    }

    public BussinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
