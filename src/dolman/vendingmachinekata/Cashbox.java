package dolman.vendingmachinekata;

import java.util.ArrayList;
import java.util.List;

public class Cashbox {

	private Integer cashInserted = 0;
	private List<String> coinsToReturn = new ArrayList<String>(); 
	private List<String> coinsInserted = new ArrayList<String>();
	private String coin;
	
	public void insertCoin(String coin) {
		this.coin = coin;
		switch(coin) {
		case "Nickel":
			cashInserted += 5;
			coinsInserted.add(coin);
			break;
		case "Dime":
			cashInserted += 10;
			coinsInserted.add(coin);
			break;
		case "Quarter":
			cashInserted += 25;
			coinsInserted.add(coin);
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
		coinsToReturn.addAll(coinsInserted);
		cashInserted = 0;
	}

}
