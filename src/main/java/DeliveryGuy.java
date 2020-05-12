public class DeliveryGuy implements Delivery {

    //Dependency
    private Package aPackage;


    //Constructor for dependency - injection
    public DeliveryGuy(Package a){
        aPackage = a;
    }


    //Empty Constructor
    public DeliveryGuy(){

    }


    //Setter
    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }


    //Getter
    @Override
    public String getName() {
        return "Yo bro! Im John.";
    }

    @Override
    public String getItem() {
        return aPackage.getItem();
    }
}
