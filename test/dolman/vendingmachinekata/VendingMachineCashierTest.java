package dolman.vendingmachinekata;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

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
	
	@Rule public ExpectedException exception = ExpectedException.none();
	
	
	@Test
	public void whenAnInvalidCoinLikeAPennyIsInsertedThenThrowExceptionAndReturnCoin() throws IllegalArgumentException {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(containsString("Nonsense"));
		underTest.insertCoin("Nonsense");
		Assert.assertEquals("Nonsense", underTest.returnCoin());
	}


}
