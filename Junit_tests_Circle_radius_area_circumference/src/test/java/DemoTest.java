

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class DemoTest {
	@Test
	public void MainTestInput1() {
		String input = "1\n";
		
		ByteArrayInputStream in = 
				new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		// expected output
		String consoleOutput = "Enter the radius: " + System.getProperty("line.sepeartor");
		consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.sepeartor");
		consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.sepeartor");
		consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.sepeartor");
			
		assertEquals(consoleOutput, out.toString());
		
	}
	
	@Test
	public void MainTestInput3() {
		String input = "3\n";
		
		ByteArrayInputStream in = 
				new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		// expected output
		String consoleOutput = "Enter the radius: " + System.getProperty("line.sepeartor");
		consoleOutput += "For a circle with radius 3.0," + System.getProperty("line.sepeartor");
		consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.sepeartor");
		consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.sepeartor");
			
		assertEquals(consoleOutput, out.toString());
		
	}
    
}
