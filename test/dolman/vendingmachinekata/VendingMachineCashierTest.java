package dolman.vendingmachinekata;

import org.junit.Test;

import org.junit.Assert;

public class VendingMachineCashierTest {
	
	@Test
	public void whenANickelIsInsertedThenTotalCashInsertedIncreasesBy5() {
		Cashbox underTest = new Cashbox();
		underTest.insertCoin("Nickel");
		Assert.assertEquals("5", underTest.getCashInserted());		
	}

}
