package springP;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("specialItem")
public class SpecialItem implements Package {

    //Input method here yaou
    String Item = "Whatever you want";

    @Override
    public String getItem() {
        return null;
    }
}
