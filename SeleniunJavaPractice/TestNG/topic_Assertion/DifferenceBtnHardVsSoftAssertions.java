/**
 * 
 */
package topic_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author AMAR 
 * Assertion-used for validation in TestNG
 * Assertion is Two types Such as Hard Assertion & Soft Assertion
 * Difference Between Hard and Soft Assertions are--
 * 1. Hard Assertion we can directly Aces from Assert Class because it is Static Method.but,
 *  Soft Assertion we can not directly Aces from Assert Class because it is Non-Static Method,Need to create an object of SoftAssert class.
 *  2. In HardAssertion  if Assert pass it will be executed all  lines in the class and Test Result Pass .but,
 *       if Assert Fail it will not be executed all  lines(only before the Assert line will be Executed) in the class and Test Result will be Fail.
 * 
 *     In Soft Assertion  if Assert pass/Fail  it will be executed all  lines in the class and Test Result will be  Pass .If,
 *     we use assertAll() Method  it will be executed all  lines in the class  and Test Result will be  Pass/Fail depends on the Assert conditions( pass/Fail)
 */
public class DifferenceBtnHardVsSoftAssertions {
	@Test
public void hardAssertion () {
	System.out.println("it's 1st Line code executed");
	System.out.println("it's 2nd Line code executed");
	Assert.assertEquals(true, true);
	System.out.println("it's 3rd Line code executed");
}
/*	Output of Hard Assertions If Expected vs Actual not matched in above Method ................
 it's 1st Line code executed
it's 2nd Line code executed
FAILED: testng.DifferenceBtnHardVsSoftAssertions.hardAssertion
java.lang.AssertionError: expected [false] but found [true]

Output of Hard Assertions If Expected vs Actual  matched in above Method ................
it's 1st Line code executed
it's 2nd Line code executed
it's 3rd Line code executed
PASSED: testng.DifferenceBtnHardVsSoftAssertions.hardAssertion
	*/
	@Test
public void softAssertion () {
	System.out.println("it's 1st Line code executed");
	System.out.println("it's 2nd Line code executed");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(true, false);
	System.out.println("it's 3rd Line code executed");
//	sa.assertAll();
}
	/*	Output of Soft Assertions If Expected vs Actual not matched or matched in above Method ................
	 it's 1st Line code executed
it's 2nd Line code executed
it's 3rd Line code executed
PASSED: testng.DifferenceBtnHardVsSoftAssertions.softAssertion

	Output of Soft Assertions If Expected vs Actual   not matched in above Method  and using  assertAll()  Method................
	it's 1st Line code executed
it's 2nd Line code executed
it's 3rd Line code executed
FAILED: testng.DifferenceBtnHardVsSoftAssertions.softAssertion
java.lang.AssertionError: The following asserts failed:
	expected [false] but found [true]
	 */
}
