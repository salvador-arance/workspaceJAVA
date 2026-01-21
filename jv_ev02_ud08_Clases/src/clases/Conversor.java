package clases;

public class Conversor {
	private static final double CHANGE_PESETAS_EUROS = 166.386d;
	private static final double CHANGE_DOLLARS_EUROS = 1.11d;
	private static final double CHANGE_POUNDS_EUROS = 0.8d;
	
	public double pesetas2Euros(double amount) {
		return amount / CHANGE_PESETAS_EUROS;
	}
	public double euros2Pesetas(double amount) {
		return amount * CHANGE_PESETAS_EUROS;
	}
	public double euros2Dollars(double amount) {
		return amount * CHANGE_DOLLARS_EUROS;
	}
	public double dollars2Euros(double amount) {
		return amount / CHANGE_DOLLARS_EUROS;
	}
	public double euros2Pounds(double amount) {
		return amount * CHANGE_POUNDS_EUROS;
	}
	public double pounds2Euros(double amount) {
		return amount / CHANGE_POUNDS_EUROS;
	}
}
