package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

        // Retrieve the DebitCard bean from the context
        DebitCard debitCard = (DebitCard) context.getBean("dcard");

        // Display details of the DebitCard
        debitCard.details();
        debitCard.makePurchase(670);
    }
}

