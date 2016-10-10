package JUnitTest;

import static org.junit.Assert.*;

import org.junit.*;

public class TestJunit {
String message="Hello World";
MessageUtil messageUtil=new MessageUtil(message);

@Test
public void testPrintMessage() {
	message="new world";
   assertEquals(message,messageUtil.printMessage());
}
}
