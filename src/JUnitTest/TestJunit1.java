package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {
@Test
public void testAdd(){
	int num=5;
	String temp=null;
	String str="Jnuit is working fine";
	
	assertEquals("Jnuit is working fine",str);
	
	assertFalse(num>6);
	
	assertNotNull(str);
}
}
