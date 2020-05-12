public class DeliveryRobot implements Delivery {

    private Package aPackage;

    public DeliveryRobot(Package a){
        aPackage = a;
    }

    //Empty method
    public DeliveryRobot(){
        System.out.println("No args method");
    }


    //Setter
    public void setaPackage(Package aPackage){
        this.aPackage = aPackage;
    }


    //Getters
    @Override
    public String getName() {
        return "D-Bot 2.0";
    }

    @Override
    public String getItem() {
        return aPackage.getItem();
    }
}
