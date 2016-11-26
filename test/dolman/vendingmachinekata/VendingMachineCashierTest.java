package dolman.vendingmachinekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineCashierTest {
	
	Cashbox underTestCashbox;
	
	@Before
	public void setupCashbox() {
		underTestCashbox = new Cashbox();
	}
	
	@Test
	public void whenANickelIsInsertedThenTotalCashInsertedIncreasesBy5() {
		underTestCashbox.insertCoin("Nickel");
		Assert.assertEquals("5", underTestCashbox.getCashInserted());		
	}
	
	@Test
	public void whenADimeIsInsertedThenTotalCashInsertedIncreasesBy10() {
		underTestCashbox.insertCoin("Dime");
		Assert.assertEquals("10", underTestCashbox.getCashInserted());		
	}
	
	@Test
	public void whenANickelAndADimeAreInsertedThenTotalCashInsertedIncreasesBy15() {
		underTestCashbox.insertCoin("Nickel");
		underTestCashbox.insertCoin("Dime");
		Assert.assertEquals("15", underTestCashbox.getCashInserted());
	}
	
	@Test
	public void whenAQuarterIsInsertedThenTotalCashInsertedIncreasesBy25() {
		underTestCashbox.insertCoin("Quarter");
		Assert.assertEquals("25", underTestCashbox.getCashInserted());
	}
	
	
	@Test
	public void whenAnInvalidCoinLikeAPennyIsInsertedThenReturnCoin() {
		underTestCashbox.insertCoin("Nonsense");
		Assert.assertEquals("Nonsense", underTestCashbox.returnCoin().get(0));
	}
	
	@Test
	public void whenANickelIsInsertedAndReturnCoinActivatedThenReturnANickel () {
		underTestCashbox.insertCoin("Nickel");
		underTestCashbox.activateCoinReturn();
		Assert.assertEquals("Nickel", underTestCashbox.returnCoin().get(0));
	}
	
	@Test
	public void whenANickelAndADimeAreInsertedAndReturnCoinActivatedThenReturnANickelAndADimeAndCashInsertedResetsTo0() {
		underTestCashbox.insertCoin("Nickel");
		underTestCashbox.insertCoin("Dime");
		Assert.assertEquals("15", underTestCashbox.getCashInserted());
		underTestCashbox.activateCoinReturn();
		Assert.assertEquals("Nickel", underTestCashbox.returnCoin().get(0));
		Assert.assertEquals("Dime", underTestCashbox.returnCoin().get(1));
		Assert.assertEquals("0", underTestCashbox.getCashInserted());
	}
	
	@Test
	public void whenAColaIsPurchasedThenNumberOfColasInInventoryDecreasesBy1SoThereAre4Left() {
		GoodsInventory underTestGoodsInventory = new GoodsInventory(5,0,0);
		underTestGoodsInventory.purchase("Cola");
		Assert.assertEquals(4, (underTestGoodsInventory.messageInventory())[0]);
	}
	
	@Test
	public void whenAColaIsPurchasedThenNumberOfColasInInventoryDecreasesBy1SoThereAre6Left() {
		GoodsInventory underTestGoodsInventory = new GoodsInventory(7,0,0);
		underTestGoodsInventory.purchase("Cola");
		Assert.assertEquals(6, (underTestGoodsInventory.messageInventory())[0]);
	}
	
	@Test
	public void whenAChipsBagIsPurchasedThenNumberOfChipsBagsInInventoryDecreasesBy1SoThereAre2Left() {
		GoodsInventory underTestGoodsInventory = new GoodsInventory(0,3,0);
		underTestGoodsInventory.purchase("Chips");
		Assert.assertEquals(2, (underTestGoodsInventory.messageInventory())[1]);
	}


}
