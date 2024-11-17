package src.BankingSystem;

abstract  class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    protected double balance;
    BankAccount(String accountNumber, String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance  = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance(){
        return balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

}
