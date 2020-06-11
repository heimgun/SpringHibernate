package springP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args){

        //Config-file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        //Get bean
        Delivery newDelivery = context.getBean("deliveryGuy", Delivery.class);

        //Use Bean-methods
        //Green bop
        System.out.println(newDelivery.getName() + " is knocking on your door");
        System.out.println(newDelivery.getItem() + " is delivered to you. Sign here!");

        //Close context
        context.close();

    }
}
