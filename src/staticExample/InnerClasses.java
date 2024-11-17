package src.staticExample;

//outside classes cannot be static
public class InnerClasses {
    static class Test{
    String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sihab");
        Test b = new Test("Sihab");
    }

}
