package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PalindromoTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1(){
		assertEquals(true, tjb.palindromo("aabaa"));
	}
	
	@Test
	public void test2(){
		assertEquals(false, tjb.palindromo("abac"));
	}
	
	@Test
	public void test3(){
		assertEquals(true, tjb.palindromo("a"));
	}
	
	@Test
	public void test4(){
		assertEquals(false, tjb.palindromo("az"));
	}



}
