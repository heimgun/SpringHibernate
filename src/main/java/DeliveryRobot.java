public class DeliveryRobot implements Delivery {

    private Package aPackage;

    public int phoneNumber;
    public String area;

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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setArea(String area) {
        this.area = area;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getArea() {
        return area;
    }
}
