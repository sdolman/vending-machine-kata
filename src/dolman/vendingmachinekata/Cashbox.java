package dolman.vendingmachinekata;

import java.util.ArrayList;
import java.util.List;

public class Cashbox {

	private Integer cashInserted = 0;
	private List<String> coinsToReturn = new ArrayList<String>(); 
	private String coin;
	
	public void insertCoin(String coin) {
		this.coin = coin;
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
			coinsToReturn.add(coin);
		}
	}

	public String getCashInserted() {
		return cashInserted.toString();
	}
	

	public List<String> returnCoin() {
		return coinsToReturn;
	}

	public void activateCoinReturn() {
		coinsToReturn.add(coin);
		
	}

}
