public class MultipleInheritance {
    public static void main(String[] args) {
        R obj = new R();
        obj.run();
    }
}

interface P {
  public void run();
}

interface Q {
  public void run();
}
class R implements P,Q{
    public void run() {
        System.out.println("Running");
    }
}
