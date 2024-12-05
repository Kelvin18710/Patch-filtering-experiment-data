package org.apache.commons.lang;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(501, 3493, 0, 1084);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-602), 101, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(824);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "LOH[G],O-y");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "true");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "no", "no", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(69, (-2019), 69, 0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1616);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1616, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer1 = new Integer(65);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
      assertEquals(65, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-730), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, 0, (-1), 57);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "no", "no");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf((String) null);
      String string0 = BooleanUtils.toString(boolean0, "hI~L2", "", "J~x%{k>2W+7f&#");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "on", "on", "on");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("/tbQ`Nre>=^F4/Jd", "on", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("LX?Z#Vg~K{$nxQ", "Dh&qeO0KF", "LX?Z#Vg~K{$nxQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "F", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "Bf&_^I\"s6V~!p1C`s", "HL-L;d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Wa", "{}", "{}", "Wa");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("6}rcP_cp#", "", "true", "yes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "ca`se", "ca`se", "ca`se");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "kq~@}%p", "org.apache.cNmmons.lang.BooleanUtils", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "BJ;-Smwb_2 r  ", (String) null, "YuE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(",7", (String) null, ",7", "true");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("-0x");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals((-1145), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1145), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Integer integer0 = new Integer((-1334));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1334), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, 949, (-1145), (-1145));
      assertEquals((-1145), int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1132502240), 48, (-1534));
      assertEquals((-1534), int0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      int int0 = BooleanUtils.toInteger(boolean0, 949, (-1145), (-1145));
      assertEquals(949, int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, (-1763));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1257, (-743));
      assertEquals((-743), int0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Integer integer0 = new Integer((-3148));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer(854);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Integer integer0 = new Integer(1257);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Integer integer0 = new Integer(1659);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1538, (-2292), (-2292), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-355), (-355), (-355), (-355));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1132502240), (-1534), 48, (-1132502240));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Integer integer0 = new Integer((-894));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Integer integer0 = new Integer(554);
      Integer integer1 = new Integer((-1439592647));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Integer integer0 = new Integer(108);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Integer integer0 = new Integer((-1334));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1310, (-1634), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(715, 715, 715);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(715, 1, 715);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = new Integer(65);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1145));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-4115));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBooleanDefaultIfNull(boolean1, true);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Integer integer0 = new Integer((-1145));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2169, 2719, (-119), 2719);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1), 0, 1038);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2135, 0, 2135);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-898));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "r~/F%ERR");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Integer integer0 = new Integer(546);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(546, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger((boolean) boolean0, 0, (-801));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1253, 1253);
      assertEquals(1253, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      int int0 = BooleanUtils.toInteger(boolean0, 0, Integer.MAX_VALUE, 1208);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3052));
      int int0 = BooleanUtils.toInteger(boolean0, 2135, 0, (-3052));
      assertEquals(2135, int0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "QmpQD~u7", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "on", "The Array must not be null", "no");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("r~/F%ERR", (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("The String did not match any specified value", "The String did not match any specified value", "The String did not match any specified value");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "g/g!YnCQ-AK-b", "g/g!YnCQ-AK-b");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "true", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false", ">^{m'*7H7EU/", "false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("|`Q7*QS^AZb", "@F)X@", "jpJB\"y$5", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "5", "off", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off", "off", "false", "6dcS j%8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "on", "on", "@BfQvc&/f)~*Gpn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "C", (String) null, "C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "no", "no", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(")#ptb:");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Integer integer0 = new Integer((-380));
      Boolean boolean0 = BooleanUtils.toBooleanObject("--", "d?", "--", "d?");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-380), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3);
      Integer integer0 = new Integer(3);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(3, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Integer integer0 = new Integer((-1793866103));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1793866103), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      int int0 = BooleanUtils.toInteger(boolean0, (-3052), (-3052), 0);
      assertEquals((-3052), int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1883184137), 0, (-1883184137));
      assertEquals((-1883184137), int0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-366), (-1));
      assertEquals((-366), int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-576), (-576));
      assertEquals((-576), int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean1);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Integer integer0 = new Integer(1440);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = new Integer((-1343));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer((-1434423148));
      Integer integer1 = new Integer((-2272));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Integer integer0 = new Integer((-406));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Integer integer0 = new Integer((-3010));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = Integer.getInteger("no");
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Integer integer0 = new Integer((-2050543671));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Integer integer0 = new Integer(3);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(594, (-2005898962), 100, (-2005898962));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), 6182, 6182, (-1));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1086563994), (-3039), (-1086563994), 1983);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Integer integer0 = new Integer(1528);
      Integer integer1 = new Integer(57);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer((-17));
      Integer integer1 = new Integer((-1883184137));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer((-1129));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Integer integer0 = new Integer((-4232));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1880756468), (-1880756468), (-1880756468));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, 52, (-2036502899));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(462);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(45);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Boolean boolean0 = new Boolean("3Z]");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      Boolean boolean1 = BooleanUtils.negate((Boolean) boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Integer integer0 = new Integer((-1129));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) true);
      assertNotNull(string0);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1055, (-4), (-4), 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1303), 102, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1515));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1515));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Integer integer0 = new Integer((-1515));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4868), (-4868), (-4868), (-4868));
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "(^M8nZU$!in5L/", "Qhd0lwj_eUu-");
      assertEquals("(^M8nZU$!in5L/", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "=", " is not a valid number.", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-917));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-917), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1003, 1007);
      assertEquals(1007, int0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Integer integer0 = new Integer((-1515));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      int int0 = BooleanUtils.toInteger(boolean0, (-2678), 1, 48);
      assertEquals((-2678), int0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "6\"#");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Integer integer0 = new Integer((-1515));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "on", "#@nheo?su", (String) null);
      assertEquals("#@nheo?su", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      boolean boolean0 = true;
      Boolean boolean1 = BooleanUtils.toBooleanObject(true);
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = boolean1;
      booleanArray0[1] = (Boolean) boolean0;
      booleanArray0[2] = boolean1;
      booleanArray0[3] = boolean1;
      booleanArray0[4] = boolean1;
      booleanArray0[5] = boolean1;
      booleanArray0[6] = boolean1;
      booleanArray0[7] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no", "on", "no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("", "%}L", "%}L");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "dr2HS!uChuC<", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "dfTaA~~&=rTaxLH(=", " is not a valid number.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(">\u0004a5 ", ">\u0004a5 ", ">\u0004a5 ");
      String string0 = BooleanUtils.toStringOnOff((Boolean) boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("tSux");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("A blank string is not a valid number", "p=!.@#)iL(is:@a", "p=!.@#)iL(is:@a", "A blank string is not a valid number");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("X.Esd'L*45o1:", "KjF}tP", "Array cannot be empty.", "0x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "The String did not match either specified value", "The String did not match either specified value", "The String did not match either specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "on", (String) null, "on");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "l zk:BnI", "false", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(">\u0004a5 ");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Integer integer0 = new Integer(1454);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1454, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Integer integer0 = new Integer(3058);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(3058, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-2014036753), 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      int int0 = BooleanUtils.toInteger(boolean0, 1, 542, 542);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-2014253595), (-754));
      assertEquals((-2014253595), int0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Integer integer0 = new Integer(1595);
      Integer integer1 = new Integer((-2076131377));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Integer integer0 = new Integer((-1357));
      Integer integer1 = new Integer((-1807));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Integer integer0 = new Integer(1294);
      Integer integer1 = new Integer(1952);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Integer integer0 = new Integer(4656);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Integer integer0 = new Integer((-2242));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Integer integer0 = new Integer(1294);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1613449609), 2421, (-1534), (-1613449609));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3082, (-1433047974), 3082, 3082);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1174), (-4182052), 1465);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Integer integer0 = new Integer(43);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer(2396);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Integer integer0 = new Integer((-1385));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Integer integer0 = new Integer(826);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Integer integer0 = new Integer(983);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(4268, 1, 1134);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, (-1541));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(4268, 1134, 4268);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(96);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3190);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("yes");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("9w~hMphHww,cYy8MH", "9w~hMphHww,cYy8MH", "9w~hMphHww,cYy8MH", "]U");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("9w~hMphHww,cYy8MH", "9w~hMphHww,cYy8CH", "9w~hMphHww,cYy8MH", (String) null);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "The Array must not be null", "yes");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      boolean boolean0 = true;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(767, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(6, 1, 1, 69);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1523, 45, 687);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Integer integer0 = new Integer((-1086022323));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-269));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-79));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "off");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, "", (String) null, "The Array must not be null");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(639);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals(639, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer(376);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(376, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-132), (-190), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "The String did not match either specified value", "The String did not match either specified value");
      assertEquals("The String did not match either specified value", string0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2091);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "c\"]", "false", "");
      assertEquals("c\"]", string0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "org.apache.commons.lang.BooleanUtils", ")Y<", ")T:o+$Km");
      assertEquals(")T:o+$Km", string0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2438);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Boolean[] booleanArray0 = new Boolean[6];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("(Q=!'kx?xsR [E", "yes", "(Q=!'kx?xsR [E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("+9", "+9", "+9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "ew*leS#i|", "ew*leS#i|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "false");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("false", "", ")K$TKm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("X", "i", "i", "X");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("i", "X", "i", "X");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false", "false", "org.apache.commons.lang.BooleanUtils", "false");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "k", "k", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Oo", (String) null, "Oo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "-cN@!=2nd4n+_w.'j,", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "true", "-cN@!=2nd4n+_w.'j,", "true");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("Qpr}oY#CFF:rJ,", "", "false", "av");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("PIVM");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer((-1086022323));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1086022323), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2091);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Integer integer0 = new Integer((-1091129174));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1091129174), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2438, 2438, 2438, 2438);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 2438, 2438, 0);
      assertEquals(2438, int0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-796), (-610));
      assertEquals((-796), int0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1456696622), 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Integer integer0 = new Integer((-6));
      Integer integer1 = new Integer(679);
      Integer integer2 = new Integer(679);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer2, integer2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
      
      Integer integer1 = new Integer(2009);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Integer integer0 = new Integer((-16586930));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Integer integer0 = new Integer((-1914536595));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Integer integer0 = new Integer((-79));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2370, 3568, 3568, 3568);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1929), (-813), (-1929), (-1929));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1592), (-2), 3864, (-1592));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("Pk`r^-Ff/6t<E#h\"");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer((-884));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Integer integer0 = new Integer(2702);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Integer integer0 = Integer.getInteger((String) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1773), 1430, 1430);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-79), (-79), 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2438, 0, 2438);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2438);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2438);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2091);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Boolean boolean0 = new Boolean("Ml>(q%Jn_^$[9");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Integer integer0 = new Integer((-5885));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(376, 376, 376, 376);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
@Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1717, 1, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1746), (-1130), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1792576168));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1792576168));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("yes");
      String string0 = BooleanUtils.toString(boolean0, "no", "", "D");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Integer integer0 = new Integer(69);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(69, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Integer integer0 = new Integer((-1613));
      Integer integer1 = BooleanUtils.toIntegerObject(false, (Integer) null, integer0);
      assertEquals((-1613), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Integer integer0 = new Integer((-28629474));
      Integer integer1 = new Integer(512);
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
      assertEquals(512, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 2, 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(5667, 5667, 5667, 5667);
      int int0 = BooleanUtils.toInteger(boolean0, 5667, (-2837), 1);
      assertEquals(5667, int0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "TV*XAO<z[i", "-0x");
      assertEquals("TV*XAO<z[i", string0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "`*@5(");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Integer integer0 = new Integer(821);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "off", (String) null, (String) null);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "m6b??", "0(/h.w", "m6b??");
      assertEquals("m6b??", string0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = booleanArray0[3];
      booleanArray0[7] = boolean0;
      booleanArray0[8] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes", (String) null, "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("%E", "%E", "%E");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "3A.s |i|C~c;3{J;", "Rq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "ljrXT}m", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("", "false", "false");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("m3VwU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", (String) null, (String) null, "");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("0;^Bbv[&c#$|f", "!P*@_ajg1sV#tO", "!P*@_ajg1sV#tO", "GgneRI#3b4=M\t+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("m3VwU", "m3VwU", "nH> nlQ{7C]uB}~86'd", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "The Integer did not match any specified value", "The String did not match either specified value", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "(,+", "(,+", "Array cannot be empty.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ">::ZZuNV|b5a;L3\"1<A", (String) null, ">::ZZuNV|b5a;L3\"1<A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, " is not a valid number.", "3A.s |i|C~c;3{J;");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "dR", "no", "dR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Integer integer0 = new Integer((-28629474));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-28629474), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("org.apache.commons.lang.BooleanUtils");
      Integer integer0 = new Integer((-2937));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 0, (-895));
      assertEquals((-895), int0);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1451188921), (-1451188921));
      assertEquals((-1451188921), int0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-142899422), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Integer integer0 = new Integer(2235);
      Integer integer1 = new Integer((-3780));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Integer integer0 = new Integer(70);
      Integer integer1 = Integer.valueOf((-679));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Integer integer0 = new Integer(821);
      Integer integer1 = new Integer(94);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Integer integer0 = new Integer((-1994449611));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2097688359), (-2311), (-2311), (-2097688359));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, 0, 0, 566);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(998);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Integer integer0 = new Integer((-3147));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Integer integer0 = new Integer((-3));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-551), 0, (-551));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Integer integer0 = new Integer((-1795423715));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3317);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1795423715), (-3354), (-1795423715), (-1843233010));
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("0(/h.w");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, 1, 120, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 69, 76);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-469), 904, (-469));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-870));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "#<{]W");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, ".8(vy9FTD", "MAB1Rk|D", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1302));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1302), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", (String) null, "", "");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 5, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 1797);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(":P@ND");
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-469), (-2411));
      assertEquals((-469), int0);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "4il!3", "4il!3");
      assertEquals("4il!3", string0);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "|0!um");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(":P@ND");
      String string0 = BooleanUtils.toString(boolean0, "", ":P@ND", "");
      assertEquals(":P@ND", string0);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false", "false", "false", "false");
      String string0 = BooleanUtils.toString(boolean0, "}t!51a5q+$?|!.m7l", "}t!51a5q+$?|!.m7l", "-L~O7 u_o'{\"[H9ZL");
      assertEquals("}t!51a5q+$?|!.m7l", string0);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "?J", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      booleanArray0[0] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("THn&qEswIs7qd=!p<", "L L:", "L L:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(", '", ", '", ", '");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "array element ", "M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "The String did not match any specified value", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off", "", "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("nx_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Hp4|9+D)f", "GLVb", "GLVb", "Hp4|9+D)f");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("+CDre-g11+NgC5?5", "nx_", "|I8Sx/lFSxGU%", "g^)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "", "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "fOhPadHPRW>.q32/*a", "X", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "GcW/pEswKnx", (String) null, "sxoh@p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, "G^)");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false", "false", "false", "false");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Integer integer0 = new Integer(1196);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1196, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      int int0 = BooleanUtils.toInteger(boolean0, 97, 97, 0);
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 3118, 3118, 101);
      assertEquals(101, int0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 198, 953);
      assertEquals(198, int0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-706), (-706));
      assertEquals((-706), int0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Integer integer0 = new Integer(1504);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Integer integer0 = new Integer((-594));
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-2400));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Integer integer0 = new Integer(31);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(849, (-48826193), (-48826193), 849);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(732, (-2615), 732, (-2615));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(370, 370, 370, 370);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1666), 2, 2, (-1078407031));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1170));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1170));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Integer integer0 = new Integer((-48826193));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Integer integer0 = new Integer(101);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1, 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(4, 4, 4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(484, 4, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Integer integer0 = new Integer(1196);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("XeN");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Xho", "Xho", "Xho", "Xho");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(953);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("NN");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
}
