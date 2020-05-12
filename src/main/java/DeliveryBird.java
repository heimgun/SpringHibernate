


public class DeliveryBird implements Delivery{

    //Dependency
    private Package aPackage;

    //Constructor for Dependency injection
    public DeliveryBird(Package a){
        aPackage = a;
    }

    //Empty Constructor
    public DeliveryBird(){

    }

    //Setters
    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    //Getters
    @Override
    public String getName(){
        return "Pip";
    }

    @Override
    public String getItem() {
        return aPackage.getItem();
    }

}
