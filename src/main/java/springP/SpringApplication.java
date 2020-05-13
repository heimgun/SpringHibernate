package springP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args){

        //Config-file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configfile.xml");

        //Get bean
        Delivery newDelivery = context.getBean("deliveryGuy", Delivery.class);

        //Use Bean-methods
        System.out.println(newDelivery.getName() + " is knocking on your door");

        //Close context
        context.close();

    }
}
