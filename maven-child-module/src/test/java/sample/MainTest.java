package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void test(){
		Main m = new Main();
		assertTrue(m.getName()==null);
	}

}
