package di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Load the Spring application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_context.xml");

		// Retrieve the DebitCard bean from the context
		DebitCard debitCard = (DebitCard) context.getBean("debitCard");

		System.out.println(debitCard.toString());

		debitCard.makePurchase(670);

		context.close();
	}
}
