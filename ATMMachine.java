import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();

        obj.checkpin();

    }
}


class ATM {

    float balance;
    int PIN = 2032;

    public void checkpin() {
        System.out.println("Enter you pin: ");
        Scanner in = new Scanner(System.in);
        int enteredPin = in.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Erro-Enter a valid PIN");
        }

    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }


    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }
    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
       if(amount > balance) {
           System.out.println("Insufficient funds");
       }else{
           balance -=amount;
           System.out.println("Moneywithdraw: " + amount+ " Current balance is "+ balance);
       }
       menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount: ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        balance += amount;
        System.out.println("Money Deposited successfully: "+ amount +" Current balance is: "+ balance);
        menu();

    }



}
