package springP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args){

        //Config-file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configfile.xml");

        //Get bean
        Delivery newDelivery = context.getBean("deliveryBird", Delivery.class);

        //Use Bean-methods
        System.out.println(newDelivery.getName() + " is knocking on your door");
        System.out.println(newDelivery.getItem() + " is delivered to you. Sign here!");

        //Close context
        context.close();

    }
}
