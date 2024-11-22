package src.introduction.CarManagement;

public class GasCar extends Car{
    private double fuelCapacity;
    private double tankCapacity;

    GasCar(String brand, String model, int dilyRentalPrice,double fuelCapacity, double tankCapacity){
        super(brand,model,dilyRentalPrice);
        this.fuelCapacity = fuelCapacity;
        this.tankCapacity = tankCapacity;
    }
    @Override
    public int calculateRentalCost(int days) throws ExceptionHandle.InvalidRentalDayException {
        if (days < 0){
            throw new ExceptionHandle.InvalidRentalDayException("Rental days must be morethan zero");
        }
        return getDailyRentalPrice() * days;
    }
    @Override
    public void performMaintenance() throws  ExceptionHandle.MainTenanceOverdueException{
        if (tankCapacity < 5){
            setNeedMaintenance(true);
            throw new ExceptionHandle.MainTenanceOverdueException("Fuel tank too low, fuel required");
        }
        System.out.println("Fuel load complete");
        setNeedMaintenance(false);
    }
}
