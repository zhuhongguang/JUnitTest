package JUnitTest;

import org.junit.Test;

import junit.framework.TestResult;

public class TestJunit3 extends TestResult{
	public synchronized void addError(Test test,Throwable t){
		super.addError((junit.framework.Test)test, t);
	}
	@Test
	public void testAdd(){}
	public synchronized void stop(){}
}
