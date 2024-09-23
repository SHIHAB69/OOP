package src.com.sihab.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10, b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;


        swap(a,b);

        System.out.println(a +" " + b);

    }
    static void swap(int a, int b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}