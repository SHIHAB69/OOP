import org.w3c.dom.ls.LSOutput;

public class Hierarchical{
    public static void main(String[] args) {

        Bank obj1 = new Bank();
        Basic obj2 = new Basic();
        SBI obj3 = new SBI();

        obj1.rateOfInterest();
        obj2.rateOfInterest();
        obj3.rateOfInterest();


    }
}

class Bank{
    void rateOfInterest(){
        System.out.println("rate of Bank is 5% ");
    }
}

class Basic  extends Bank{
    @Override
    void rateOfInterest(){
        System.out.println("rate of Basic Bank is 3% ");
    }
}

class SBI extends Bank {
    @Override
    void rateOfInterest(){
        System.out.println("rate of SBI Bank is 4% ");
    }
}