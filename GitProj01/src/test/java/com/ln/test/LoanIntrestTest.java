package com.ln.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ln.service.LoanIntrest;

public class LoanIntrestTest 
{
  private static LoanIntrest bankService;
  //changes from STS
  @BeforeAll
  public static void setUp()
  {
	  System.out.println("LoanIntrestTest.setUp()");
	  bankService= new LoanIntrest();
  }
  @Test
  public void testCalCompoundIntrestWithBigValue()
  {
	  double expected=25364.0;
	  double actual=bankService.calclntrestAmount(20000.0,2.0,12.0);
	  assertEquals(expected, actual,1.0);
  }
  @Test
  public void testCalCompoundIntrestWithSmallValue()
  {
	  double expected=1268.0;
	  double actual=bankService.calclntrestAmount(1000.0,2.0,12.0);
	  assertEquals(expected, actual,1.0);
  }
  @Test
  public void testCalCompoundIntrestWithZeroOrNegetiveValues()
  {
	 assertThrows(IllegalArgumentException.class,()->{bankService.calclntrestAmount(12000.0, 0.0, 0.0);});
  }
  @Test
  public void testCalCompoundIntrestTimer()
  {
	 assertTimeout(Duration.ofMillis(3100),()->{bankService.calclntrestAmount(12000.0, 2.0, 12.0);});
  }
  @Test
  public void testsPallendromeWithValidInputs()
  {
	  assertTrue(bankService.isPallendrome("madam"));
  }
  @Test
  public void testsPallendromeWithInValidInputs()
  {
	  assertFalse(bankService.isPallendrome("mada"));
  }
  @AfterEach
  public void afterTest()
  {
	  System.out.println("LoanIntrestTest.afterTest()");
  }
  @AfterAll
  public static void tearDown()
  {
	  System.out.println("LoanIntrestTest.tearDown()");
	  ;
	  bankService=null;
  }
  
  
}
