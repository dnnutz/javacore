public class Wine extends Product {
    double bottleVolume;

    public static final double additionalTaxa=1.32;

    public  Wine (String productName, long barCode, double basePrice,double bottleVolume){
        super(productName,barCode,basePrice);
        this.bottleVolume=bottleVolume;
    }

    @Override
    public  String getInfo() {
        return ("Wine Name "+ productName+ "\n" +
                "Wine barCode " + barCode + "\n"+
                "Wine basePrice " + basePrice + "\n"+
                "Wine bootleVolume "  + bottleVolume);
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() *  additionalTaxa;
    }
}
