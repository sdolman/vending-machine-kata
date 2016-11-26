package dolman.vendingmachinekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	
	
	@Test
	public void whenAnInvalidCoinLikeAPennyIsInsertedThenReturnCoin() {
		underTest.insertCoin("Nonsense");
		Assert.assertEquals("Nonsense", underTest.returnCoin().get(0));
	}
	
	@Test
	public void whenANickelIsInsertedAndReturnCoinActivatedThenReturnANickel () {
		underTest.insertCoin("Nickel");
		underTest.activateCoinReturn();
		Assert.assertEquals("Nickel", underTest.returnCoin().get(0));
	}
	
	@Test
	public void whenANickelAndADimeAreInsertedAndReturnCoinActivatedThenReturnANickelAndADime() {
		underTest.insertCoin("Nickel");
		underTest.insertCoin("Dime");
		underTest.activateCoinReturn();
		Assert.assertEquals("Nickel", underTest.returnCoin().get(0));
		Assert.assertEquals("Dime", underTest.returnCoin().get(1));
		Assert.assertEquals("0", underTest.getCashInserted());
	}


}
