package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {
	
	private TheJourneyBegins tbj;
	
	@Before
	public void setup () {
		tbj = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(20, tbj.centuryFromYear(1905));
	}
	
	@Test
	public void test2() {
		assertEquals(17, tbj.centuryFromYear(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(1, tbj.centuryFromYear(96));
	}

}
