package dolman.vendingmachinekata;

public class GoodsInventory {

	private int colas;
	private int chips;
	private int candy;

	public GoodsInventory(int colas, int chips, int candy) {
		this.colas = colas;
		this.chips = chips;
		this.candy = candy;
	}

	public int[] messageInventory() {
		int[] inventory = { colas, chips, candy };
		return inventory;
	}

	public void purchase(String purchasedItem) {
		switch(purchasedItem) {
		case "Cola" :
		colas--;
		break;
		case "Chips" :
		chips--;
		break;
		}
	}

}
