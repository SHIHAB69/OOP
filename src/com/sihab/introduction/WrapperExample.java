package src.com.sihab.introduction;

public class WrapperExample {
    public static void main(String[] args) {

        final A sihab = new A("Sihab");
        System.out.println(sihab);
    }



}
    class A {
        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }


    }
