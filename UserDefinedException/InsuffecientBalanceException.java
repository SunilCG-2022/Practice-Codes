package UserDefinedException;

/**
 * InsuffecientBalance
 */
public class InsuffecientBalanceException extends Exception{

    private double amount;
    public InsuffecientBalanceException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}