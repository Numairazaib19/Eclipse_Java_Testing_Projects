package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Main.CalService;
import Main.Calculator;

import org.junit.Before;
import static org.mockito.Mockito.*;

public class CalServiceTest {
	
	CalService calService;
	@Before
	public void setup() {
		Calculator cal = mock(Calculator.class);
		when(cal.add(3, 3)).thenReturn(6);
		calService = new CalService();
		calService.setCal(cal);
		
	}
	@Test
	public void testAddTwoNumbers() {
		assertEquals(6, calService.addTwoNumbers(3,3));
	
	}

}
