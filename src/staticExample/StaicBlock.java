package src.staticExample;

//this is a demo to show initialization of static variables
public class StaicBlock {
    static int a = 5;
    static int b;

    static {
        System.out.println("Im static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaicBlock obj = new StaicBlock();
        System.out.println(StaicBlock.a+" "+StaicBlock.b);
    }
}
