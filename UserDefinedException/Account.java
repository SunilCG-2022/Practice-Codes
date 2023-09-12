package UserDefinedException;

public class Account {
    private double balance;
    private int number;

    public Account(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawable(double amount) throws InsuffecientBalanceException {

        if(amount <= balance){
            balance -= amount;
        }else{
            double need = amount-balance;
            throw new InsuffecientBalanceException(need); 
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
