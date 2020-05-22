package springP;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
@Qualifier("randomItem")
public class RandomItem implements Package {

    String item;

    ArrayList<String> listOfItems = new ArrayList<>();

    public void fillList(){
        listOfItems.add("Pizza");
        listOfItems.add("Letter from your mom");
        listOfItems.add("Brand new shoes");
        listOfItems.add("Book");
        listOfItems.add("A too small sweater");
        listOfItems.add("Bills");
    }

    public int getRandomNumber(){
        Random random = new Random();
        int x = random.nextInt(listOfItems.size());
        System.out.println(x);
        return x;
    }

    @Override
    public String getItem() {
        fillList();
        item = listOfItems.get(getRandomNumber());
        System.out.println(item);
        return item;
    }
}
