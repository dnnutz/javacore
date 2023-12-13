public class Chocolate extends Product{

    double weight;

    public Chocolate(String productName, long barCode, double basePrice, double weight){
        super(productName,barCode,basePrice);
        this.weight=weight;
    }

    @Override
    public String getInfo() {
        return ("Chocolate Name "+ productName+ "\n" +
                "Chocolate barCode " + barCode + "\n"+
                "Chocolate basePrice " + basePrice + "\n"+
                "Chocolate weight " + weight) ;
    }


    }



