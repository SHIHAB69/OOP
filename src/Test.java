package src;

public class Test {
    public static void main(String[] args) {
        A obj = new A("");
        System.out.println(obj);
    }
}

class A{

    final int num = 10;


    String name;
    public A(String name){
        this.name = name;

    }
}