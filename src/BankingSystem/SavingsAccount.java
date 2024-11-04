package src.BankingSystem;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolderName, double balance , double interestRate){
        super(accountNumber,accountHolderName,balance);
        this.interestRate = interestRate;
    }

    @Override
    public  void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }else {
            System.out.println("Invalid withdrawl amount ");
        }
    }
    @Override
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal: $" + amount);
        }else {
            System.out.println("Invalid withdrawl amount or insufficient balance");
        }
    }

    public void applyInterest(){
        balance += balance * (interestRate /100);
        System.out.println("Interest applied: $" + (balance * interestRate));
    }

}