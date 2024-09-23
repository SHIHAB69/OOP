public class MultyLVLinheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

class A{
    void methodA(){
        System.out.println("method of A class");
    }
}

class B extends A{
    void  methodB(){
        System.out.println("method of B class");
    }
}

class C extends B{
    void methodC(){
        System.out.println("method of C class");
    }
}