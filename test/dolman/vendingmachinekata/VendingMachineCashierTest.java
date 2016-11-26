package dolman.vendingmachinekata;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class VendingMachineCashierTest {
	
	Cashbox underTest;
	
	@Before
	public void setupCashbox() {
		underTest = new Cashbox();
	}
	
	@Test
	public void whenANickelIsInsertedThenTotalCashInsertedIncreasesBy5() {
		underTest.insertCoin("Nickel");
		Assert.assertEquals("5", underTest.getCashInserted());		
	}
	
	@Test
	public void whenADimeIsInsertedThenTotalCashInsertedIncreasesBy10() {
		underTest.insertCoin("Dime");
		Assert.assertEquals("10", underTest.getCashInserted());		
	}
	
	@Test
	public void whenANickelAndADimeAreInsertedThenTotalCashInsertedIncreasesBy15() {
		underTest.insertCoin("Nickel");
		underTest.insertCoin("Dime");
		Assert.assertEquals("15", underTest.getCashInserted());
	}
	
	@Test
	public void whenAQuarterIsInsertedThenTotalCashInsertedIncreasesBy25() {
		underTest.insertCoin("Quarter");
		Assert.assertEquals("25", underTest.getCashInserted());
	}


}
