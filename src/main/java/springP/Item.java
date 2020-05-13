package springP;

import java.util.ArrayList;
import java.util.Random;

public class Item implements Package {

    String item;

    ArrayList<String> listOfItems = new ArrayList<String>();

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
