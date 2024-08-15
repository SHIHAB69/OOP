public class Inheritance {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.brand = "BMW";
        car1.price = 150000;
        car1.milage = 18.3;
        car1.fType = "Petrol";
        car1.color = "Red";
        car1.sunRoof = true;
        car1.display();



    }
}
class Vehicle {
    double price;
    double milage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(milage);
        System.out.println(color);
    }
}


class Car extends Vehicle{
    String fType;
    boolean sunRoof;
    String brand;



}

//class Parent{
//    void display(){
//        System.out.println("Parent");
//    }
//}
//
//class Child  extends Parent{
//    void show(){
//        System.out.println("child");
//    }
//}

