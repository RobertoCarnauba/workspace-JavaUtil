package entities;

public class Accont {

	private Integer number;
	private String holder;
	private double balance; 
	
	public Accont(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Accont(Integer number, String holder, double initailDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initailDeposit);
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount){
		balance -= amount + 5.0;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Accont: "
	           + number
	           + ", Holder: " 
	           + holder 
	           + ", Balance: R$ " 
	           + String.format("%.2f", balance);
	}
	
	

}
