package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "1", numberWords.toWords( 1 ) ) ;
	}

	@Test
	public void numberOneReturnsTwo() {
		Assert.assertEquals( "Two", "2", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numberOneReturnsThree() {
		Assert.assertEquals( "Three", "3", numberWords.toWords( 3 ) ) ;
	}
	
	@Test
	public void numberOneReturnsFour() {
		Assert.assertEquals( "Four", "4", numberWords.toWords( 4 ) ) ;
	}
	
	@Test
	public void numberOneReturnsFive() {
		Assert.assertEquals( "Five", "5", numberWords.toWords( 5 ) ) ;
	}
	
	@Test
	public void numberOneReturnsSix() {
		Assert.assertEquals( "Six", "6", numberWords.toWords( 6 ) ) ;
	}
	
	@Test
	public void numberOneReturnsSeven() {
		Assert.assertEquals( "Seven", "7", numberWords.toWords( 7 ) ) ;
	}
	
	@Test
	public void numberOneReturnsEight() {
		Assert.assertEquals( "Eight", "8", numberWords.toWords( 8 ) ) ;
	}
	
	@Test
	public void numberOneReturnsNine() {
		Assert.assertEquals( "Nine", "9", numberWords.toWords( 9 ) ) ;
	}
}
