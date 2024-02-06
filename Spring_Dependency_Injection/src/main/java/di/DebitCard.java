package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class DebitCard {
    @Autowired
    @Qualifier("homeAddress")
    private Address address;
    private String cardNumber;
    private String cardHolderName;
    private double balance;


    public void details() {
        System.out.println("Debit Card Details:");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Balance: Rs" + balance);
        System.out.println("Address: " + address.getCity() + ", " + address.getPostalCode() );
    }

    public void makePurchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Purchase of Rs " + amount + " successful.");
            System.out.println("Remaining balance: Rs" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

	public DebitCard(Address address, String cardNumber, String cardHolderName, double balance) {
		super();
		this.address = address;
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.balance = balance;
	}
}