package di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitCard {

	private Address address;

	private String cardNumber;
	private String cardHolderName;
	private double balance;

	public void makePurchase(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Purchase of Rs " + amount + " successful.");
			System.out.println("Remaining balance: Rs" + balance);
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	@Override
	public String toString() {
		return "Debit Card Details:\n" + "Card Number: " + cardNumber + "\n" + "Card Holder Name: " + cardHolderName
				+ "\n" + "Address: " + address + "\n" + "Balance: " + balance;
	}
}