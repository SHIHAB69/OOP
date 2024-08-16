public class SuperKey {
    public static void main(String[] args) {
    Elephant ele = new Elephant();



    }
}

class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
    String color = "white";
    void eat(){
        System.out.println("Animal eat");
    }
}

class Elephant extends Animal{
    Elephant(){
        super();
        System.out.println("Elephant is created");
    }
    String color = "black";
    void eat(){
        System.out.println("Elephant eat");
    }
    void bark(){
        System.out.println("Elephant bark");
    }


    void printColor(){
        super.eat();
        bark();
    }
}


