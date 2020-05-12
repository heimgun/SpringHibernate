public class DeliveryGuy implements Delivery {

    //Dependency
    private Package aPackage;

    public int phoneNumber;
    public String area;

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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setArea(String area) {
        this.area = area;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getArea() {
        return area;
    }
}
