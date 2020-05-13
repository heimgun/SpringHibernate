package springP;

import org.springframework.stereotype.Component;

@Component
public class DeliveryGuy implements Delivery {


    @Override
    public String getName() {
        return "Anders Hole";
    }

    @Override
    public String getItem() {
        return null;
    }
}
