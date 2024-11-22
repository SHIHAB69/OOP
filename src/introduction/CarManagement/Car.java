package src.introduction.CarManagement;

abstract public class Car {

    private int id;
    String brand;
    String model;
    private int dailyRentalPrice;
    private boolean needMaintenance;
    Car(String brand, String model, int dailyRentalPrice){
        this.brand = brand;
        this.model = model;
        this.dailyRentalPrice= dailyRentalPrice;
        this.needMaintenance = false;
    }

    int getId(){
        return id;
    }
    String getBrand(){
        return brand;
    }

    String getModel(){
        return model;
    }
    int getDailyRentalPrice(){
        return dailyRentalPrice;
    }
    boolean getNeedMaintenance(){
        return needMaintenance;
    }
    public void setNeedMaintenance(boolean needMaintenance){
        this.needMaintenance = needMaintenance;
    }


    abstract public int calculateRentalCost(int days) throws ExceptionHandle.InvalidRentalDayException;
    abstract public void performMaintenance() throws ExceptionHandle.MainTenanceOverdueException;

    public static void displayAvailableCars(Car[] cars){
        System.out.println("Available cars");
        for (Car car : cars){
            System.out.println(car.getId()+": " + car.getBrand()+": "+ car.getModel());
        }
    }


}


