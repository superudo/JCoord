package uk.me.jstott.jcoord.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Jcoord unit test suite.
 * (c) 2006 Jonathan Stott
 * Created on 12-Mar-2006
 *
 * @author Jonathan Stott
 * @version 1.1
 * @since 1.1
 */
public class AllTests {

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }


  public static Test suite() {
    TestSuite suite = new TestSuite("Test for uk.me.jstott.jcoord");
    //$JUnit-BEGIN$
    suite.addTestSuite(uk.me.jstott.jcoord.junit.MGRSRefTest.class);
    suite.addTestSuite(uk.me.jstott.jcoord.junit.LatLngTest.class);
    suite.addTestSuite(uk.me.jstott.jcoord.junit.UTMRefTest.class);
    suite.addTestSuite(uk.me.jstott.jcoord.junit.ECEFRefTest.class);
    suite.addTestSuite(uk.me.jstott.jcoord.junit.IrishRefTest.class);
    suite.addTestSuite(uk.me.jstott.jcoord.junit.OSRefTest.class);
    //$JUnit-END$
    return suite;
  }

}
