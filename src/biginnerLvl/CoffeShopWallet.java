package src.biginnerLvl;

public class CoffeShopWallet {

    public static void main(String[] args) {
        CoffeWallet user = new CoffeWallet(1000);
        try{
            user.purchase(500);
            user.purchase(500);
            user.purchase(500);
        }catch (Exception e){
            System.out.println(e);
        }
    }

public static class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


    public static class CoffeWallet{
        private double balance;

        public CoffeWallet(double balance) {
            this.balance = balance;
        }
        public void addFunds(double amount){
            balance += amount;
            System.out.println("Funds Added, Current Balance: "+balance+" Amount Added: "+amount);
        }

        public void purchase(double amount) throws InsufficientBalanceException{
            if (amount > balance){
                throw new InsufficientBalanceException( "Purchase failed: Insufficient balance. Current balance: "+balance+"Taka");
            }
            balance -= amount;
            System.out.println("Purchase successful. Remaining Balance"+balance);

        }
        public double getBalance(){
            return balance;
        }
    }
}
