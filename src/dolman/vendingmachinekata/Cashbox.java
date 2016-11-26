package dolman.vendingmachinekata;

public class Cashbox {

	private Integer cashInserted = 0;
	private String coinToReturn; 
	
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
			coinToReturn = coin;
		}
	}

	public String getCashInserted() {
		return cashInserted.toString();
	}
	

	public String returnCoin() {
		return coinToReturn;
	}

}
