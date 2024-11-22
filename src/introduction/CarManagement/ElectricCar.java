package src.introduction.CarManagement;

public class ElectricCar extends Car{
    private double batteryHealth;
    private boolean chargingStationAvailable;

    public ElectricCar(String brand, String model, int dailyRentalPrice, double batteryHealth, boolean chargingStationAvailable){
        super(brand,model,dailyRentalPrice);
        this.batteryHealth = batteryHealth;
        this.chargingStationAvailable = chargingStationAvailable;
}

    @Override
    public int calculateRentalCost(int days) throws ExceptionHandle.InvalidRentalDayException {
        if (days <= 0){
            throw new ExceptionHandle.InvalidRentalDayException("Rental days must be greater than 0");
        }
        return getDailyRentalPrice() * days;
    }

    @Override
    public void performMaintenance() throws ExceptionHandle.MainTenanceOverdueException {
        if (batteryHealth < 50){
            setNeedMaintenance(true);
            throw new ExceptionHandle.MainTenanceOverdueException("Battery service recommended");
        }
        System.out.println("Electric car maintenance completed");
        setNeedMaintenance(false);
    }
}
