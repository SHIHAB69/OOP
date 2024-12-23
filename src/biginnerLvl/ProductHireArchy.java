package src.biginnerLvl;

public class ProductHireArchy {

    abstract class Product{
        private String name;
        private double price;

        public Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public double getPrice(){
            return price;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public abstract String getDetails();
        public abstract void applyDiscount(double percentage);
    }

    class Electronics extends Product{
        private int warranty;

        public Electronics(String name, double price, int warranty){
            super(name,price);
            this.warranty = warranty;
        }
        @Override
        public String getDetails(){
            return "Product"+getName()+", Price"+ getPrice()+", Warranty"+ warranty+"Years";
        }
        @Override
        public void applyDiscount(double percentage){
            setPrice(getPrice() - getPrice() * (percentage/100));
        }
    }

    class Clothing extends Product{
        private String size;
        public Clothing(String name, double price, String size){
            super(name,price);
            this.size = size;
        }

        @Override
        public String getDetails(){
            return "Product: "+getName()+", Price: "+getPrice()+", Size"+size;
        }
        @Override
        public void applyDiscount(double percentage){
            setPrice(getPrice() - getPrice() * (percentage/100));
        }
    }

}
