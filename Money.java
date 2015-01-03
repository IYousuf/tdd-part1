package Chap1;

class Money {
	
	protected String currency;
	protected int amount;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	protected String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}
