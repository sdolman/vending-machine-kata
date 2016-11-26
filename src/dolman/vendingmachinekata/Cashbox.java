package dolman.vendingmachinekata;

public class Cashbox {

	Integer cashInserted;
	
	public void insertCoin(String coin) {
		switch(coin) {
		case "Nickel":
			cashInserted = 5;
			break;
		case "Dime":
			cashInserted = 10;
			break;
		}
	}

	public String getCashInserted() {
		return cashInserted.toString();
	}

}
