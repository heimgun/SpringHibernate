package springP;

import org.springframework.stereotype.Component;
import springP.Delivery;

@Component
public class DeliveryBird implements Delivery {

    //Dependency
    private Package aPackage;

    public int phoneNumber;
    public String area;

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

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setArea(String area) {
        this.area = area;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getArea() {
        return area;
    }
}
