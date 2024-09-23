public class Abstraction {
    public static void main(String[] args) {

    Tata obj = new Tata();
    obj.fuelType();
    obj.color();

    }
}


abstract class car{
    abstract public void fuelType();

    public void color(){
        System.out.println("Black");
    }

}

class Tata extends car {
    public void fuelType(){
        System.out.println("Disel");
    }
}