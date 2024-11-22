package src.introduction.CarManagement;

public class ExceptionHandle {
    public static class InvalidRentalDayException extends Exception {
        public InvalidRentalDayException(String e){
            super(e);
        }
    }

    public static class MainTenanceOverdueException extends Exception{
        public MainTenanceOverdueException(String e){
            super(e);
        }
    }
}
