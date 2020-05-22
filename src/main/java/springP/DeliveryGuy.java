package springP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeliveryGuy implements Delivery {

    @Autowired
    @Qualifier("randomItem")
    private Package dailyMail;

    //Dependency injection with autoWired
    public DeliveryGuy(Package a){
        dailyMail = a;
    }

    public DeliveryGuy(){
        System.out.println("Inside the emptiness of the DeliveryGuy-constructor");
    }

    public void setDailyMail(Package a){
        dailyMail = a;
    }

    @Override
    public String getName() {
        return "Anders Hole";
    }

    @Override
    public String getItem() {
        return dailyMail.getItem();
    }
}
