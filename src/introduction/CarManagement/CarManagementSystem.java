package src.introduction.CarManagement;

public class CarManagementSystem {
    public static void main(String[] args) {
        Car electric = new ElectricCar("Tesla","Model 3", 100,60,true);
        Car gas = new GasCar("Toyota","Corolla",59,30,15);

        Car[] cars = {electric,gas};

        Car.displayAvailableCars(cars);

        try{
            System.out.println("Renting electric car for five days");
            System.out.println("Rental cost "+electric.calculateRentalCost(0));

            System.out.println("Performing maintanace on gas car");
            gas.performMaintenance();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
