package JUnitTest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSuite suite=new TestSuite(TestJunit1.class,TestJunit2.class,TestJunit3.class);
		TestResult result=new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = "+ result.runCount());
	}

}
