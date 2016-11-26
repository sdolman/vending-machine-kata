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
		int[] inventory = {4}; 
		return inventory;
	}

	public void purchase(String purchasedItem) {
		
	}

}
