

public class OopDemo {
    public static void main(String[] args) {

      Dog bruno = new Dog();

      bruno.name = "Bruno";
      bruno.eat();





    }
}


class Dog{
    String name;
    int id;

    public void eat(){
        System.out.println(name + " Eats!");
    }


}
