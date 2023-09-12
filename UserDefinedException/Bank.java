package UserDefinedException;

public class Bank {
    public static void main(String[] args) {
        Account ac =new Account(1);
        ac.deposit(1000.00);
        System.out.println("Depositing Amount 1000 ");
        
        try {
            System.out.println("Withdrawing 300");
            ac.withdrawable(300.00);
            System.out.println("Withdrawing 300");
            ac.withdrawable(300.00);
            System.out.println("Withdrawing 300");
            ac.withdrawable(300.00);
            System.out.println("Withdrawing 300");
            ac.withdrawable(300.00);
            
        } catch (InsuffecientBalanceException e) {
            System.out.println("Amount is not sufficient: " +e.getAmount());  
            e.printStackTrace();
        }finally{
            System.out.println("account Balance : " +ac.getBalance()); 
        }
    }

}
