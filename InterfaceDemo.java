public class InterfaceDemo {
    public static void main(String[] args) {
       Carr tesla= new ElectricCar();
        Carr bmW = new DiselCar();

        tesla.start();
        bmW.start();




    }
}

interface Carr{
    public void start();

}

class ElectricCar implements Carr{
  public void start(){
      System.out.println("electric car Starting");
  }
}

class DiselCar implements Carr{
    public void start(){
        System.out.println("disel car Starting");
    }
}