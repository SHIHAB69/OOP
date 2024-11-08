package src.staticExample;

public class Main {
    public static void main(String[] args) {

        Human sihab = new Human(23,"Sihab",10000,false);
        Human sourov = new Human(23,"Sourov",10000,true);
        Human priya = new Human(23,"Sourov",10000,true);

        System.out.println(sihab.name);

        /*
            whenever you want to access a static variable use the class
            name instead of the reference variable & Static variable is common for all.
            Static variable is not dependent on the object
            you can access a static variable by the class name
        */
        System.out.println(Human.population);


       // Main.greating();

    }

    static void fun(){
        //[Main.greating();]//you cat use this bcz it requires an instance/object
        // but this function you are using it does not depend on instances
    }

    //Something which is not static, belongs or depends on the object,
    // And static variable doesn't belong to the object
     void greating(){
        //fun();
        System.out.println("Great");
    }
}
