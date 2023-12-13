public class Product {
    String productName;
    long barCode;
    double basePrice;

    private static final double tva=1.2;

    public Product(){

    }

    public Product (String productName, long barCode, double basePrice){
        this.productName=productName;
        this.barCode=barCode;
        this.basePrice=basePrice;

    }

    public double finalPrice(){
        return basePrice * tva;
    }
    public String getInfo(){
        return( "Product Name "+ productName+ "\n" +
                "Product barCode " + barCode + "\n"+
                "Product basePrice " + basePrice );
    }


}
