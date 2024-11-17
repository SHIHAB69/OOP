package src.sinleton;

public class Singleton {

    // private constructor to restrict instantiation from other classes
    private Singleton() {
    }
    private static Singleton instance;

    public static Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
    }
}
