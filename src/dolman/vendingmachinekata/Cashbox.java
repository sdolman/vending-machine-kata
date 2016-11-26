package dolman.vendingmachinekata;

public class Cashbox {

	private Integer cashInserted = 0;
	
	public void insertCoin(String coin) {
		switch(coin) {
		case "Nickel":
			cashInserted += 5;
			break;
		case "Dime":
			cashInserted += 10;
			break;
		case "Quarter":
			cashInserted += 25;
			break;
		default:
			throw new IllegalArgumentException("Invalid coin type: " + coin);
		}
	}

	public String getCashInserted() {
		return cashInserted.toString();
	}

}
