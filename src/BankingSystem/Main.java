package src.BankingSystem;

public class Main {
    public void main(String[] args) {
        SavingsAccount account = new SavingsAccount("12345","John Doe",1000.0,2.5);

        System.out.println("Account holder" + account.getAccountHolderName());
        System.out.println("Account Number" + account.getAccountNumber());
        System.out.println("Account Balance" + account.getBalance());
        account.deposit(500);
        System.out.println("Balance after deposit : $ "+ account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal : $ "+ account.getBalance());

        account.applyInterest();
    }

}
