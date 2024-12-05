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
        BooleanUtils.toBooleanObject(102, 1328, 1774, 3605);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((-939), 95, 0, (-939));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2546), 100, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2013784843));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(175);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "true", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(100, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("`nVU", (String) null, "`nVU", "`nVU");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), (-1), (-1), 0);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1814), 2276);
      assertEquals(2276, int0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, (-184), (-1141));
      assertEquals((-1141), int0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "', has a length less than 2", "', has a length less than 2");
      assertEquals("', has a length less than 2", string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "Z*-78^/QT_M");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "The String did not match either specified value", "The String did not match either specified value", "The String did not match either specified value");
      assertEquals("The String did not match either specified value", string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2276, 2276, 0, 0);
      String string0 = BooleanUtils.toString(boolean0, "].ef;J_Hc_ luCaZ!", "2.!wmMnIc!5wa", "].ef;J_Hc_ luCaZ!");
      assertEquals("].ef;J_Hc_ luCaZ!", string0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
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
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
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
  public void test_0024()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
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
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("The Array must not be null");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("M", "kaS:8Yxf%0wA,ZvFVk", "M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("ft{OW(", "false", "!`seQif");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "gjw;tm", "gjw;tm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "A blank string is not a valid number", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "\"]~)");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no", "no", "y?");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("@gM7=z#GB3(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("false", "+mSpicU^D>8u|", "e", "0kK~Q<1b-q");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("w?0Gv-{Lkr\"bf", "w?0Gv-{Lkr\"bf", "w?0Gv-{Lkr\"bf", "w?0Gv-{Lkr\"bf");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "on", "on", "on");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "EfT{^vtbMh", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "3JI[", "3JI[", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "`qx", "2`v7?Ih5`");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes", "A blank string is not a valid number", "JNK~cW[(0|;!", "yes");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Integer integer0 = new Integer((-432));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-432), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Integer integer0 = new Integer((-1641));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1641), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Integer integer0 = new Integer(4845);
      Boolean boolean0 = Boolean.valueOf("E9725YVaj /");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(4845, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Integer integer0 = new Integer(977);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Integer integer0 = new Integer((-432));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-432), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 1115, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2276, 2276, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("The Array must not be null");
      int int0 = BooleanUtils.toInteger(boolean0, (-1141), 0, (-1581));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 537);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1), (-663));
      assertEquals((-663), int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Integer integer0 = new Integer(1015);
      Integer integer1 = new Integer((-1644));
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
  public void test_0068()  throws Throwable  {
      Integer integer0 = new Integer((-1131151926));
      Integer integer1 = new Integer(896);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer((-1433507393));
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
  public void test_0071()  throws Throwable  {
      Integer integer0 = new Integer(977);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Integer integer0 = new Integer((-1581));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Integer integer0 = new Integer(4845);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1834, 1175, 1175, 607);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2276, (-1814), 2276, 1452);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Integer integer0 = new Integer((-1581));
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
  public void test_0077()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer((-1));
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Integer integer0 = new Integer((-1641));
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
  public void test_0079()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Integer integer0 = new Integer((-663));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-3925), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(76, 76, 76);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2, 95, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("The Array must not be null");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1404);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-3635));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toString(boolean0, "+r}~kEFoq", "", "yes");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Integer integer0 = new Integer(1009);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("ueu");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1379), 1450, 442);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1056), (-3400), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2092425455));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(931);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "yes", "yes", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = new Integer((-9));
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Boolean boolean0 = new Boolean(" 1e9#Yl|)a");
      Integer integer0 = Integer.getInteger("`c`7", (-90812233));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-344));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 69, 69, (-344));
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "6", "6");
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Integer integer0 = new Integer(2104);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "6", "zei.y{xB)^r?C.dg", "");
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toString(boolean0, "Array cannot be empty.", (String) null, "false");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Integer integer0 = new Integer(37);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
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
  public void test_0126()  throws Throwable  {
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
  public void test_0127()  throws Throwable  {
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
  public void test_0128()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
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
  public void test_0131()  throws Throwable  {
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
  public void test_0132()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("d(#@)", "d(#@)", "d(#@)", "d(#@)");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "PX", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("r^m", "r^m", "r^m");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "on", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "G=L#?3}m9", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("aqI", "The Integer did not match either specified value", "The Integer did not match either specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Ose");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "\"_1+*uNP", "\"_1+*uNP", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("X6|Jw{9", " 1e9#Yl|)a", "X6|Jw{9", "false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(",']%-n.m5g6gNeR", (String) null, "oL;EU!}$Uk#,le)'/", "&nL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "no", "no", "no");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "be~F\"D)", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, (-701));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(", '");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = new Integer((-9));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-9), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Integer integer0 = new Integer(4);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(4, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(", '", ", '", ", '", ", '");
      Integer integer0 = new Integer((-2097554571));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-2097554571), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Integer integer0 = new Integer((-40));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-40), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Integer integer0 = new Integer(4414);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      int int0 = BooleanUtils.toInteger(boolean0, (-1), 0, 799);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1341), 3826, (-315675934));
      assertEquals((-315675934), int0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      int int0 = BooleanUtils.toInteger(boolean0, (-2101802873), (-1), 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1114, 1114);
      assertEquals(1114, int0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-380), (-380));
      assertEquals((-380), int0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(0);
      Integer integer2 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer((-2779));
      Integer integer2 = Integer.valueOf((-2779));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer2, integer1);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-2779));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Integer integer0 = new Integer((-397));
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
  public void test_0175()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = Integer.getInteger("Ose");
      Integer integer1 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer1, integer0, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = Integer.getInteger("Ose");
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1446241629), (-581), (-581), (-1446241629));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-541), (-662), (-662), (-662));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(120, 120, 120, 120);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(76, (-1433736662), 76, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Integer integer0 = new Integer((-9));
      Integer integer1 = Integer.getInteger("off");
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Integer integer0 = new Integer(69);
      Integer integer1 = Integer.getInteger("q[", 106);
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
  public void test_0184()  throws Throwable  {
      Integer integer0 = new Integer(2757);
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
  public void test_0185()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Integer integer0 = Integer.getInteger("`c`7", (-90812233));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer((-37));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2236), (-3233), (-3233));
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
      boolean boolean0 = BooleanUtils.toBoolean((-597), (-597), (-597));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(76, 1312, 76);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(68);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-90812233));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Integer integer0 = new Integer(4414);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Integer integer0 = new Integer(37);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.math.NumberUtils", (String) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
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
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1613449609), (-48656997), (-48656997), (-1994467173));
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(750, (-1075), (-3959), 750);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2351), 0, (-2233));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Integer integer0 = new Integer((-117));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-450));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2500));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "false", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3830);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "false", "f");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Integer integer0 = new Integer(2368);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(2368, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = new Integer(43);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 780, 780);
      assertEquals(780, int0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-1729), (-1729));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "@?}mI==90MIy", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "xwl+m");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "|#TB2<u;#Lv");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "", "*?j+URX,IO<As84V6L\"", "ik}o'$ZW)D<R>r(buD");
      assertEquals("*?j+URX,IO<As84V6L\"", string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "(Um?gbzhQXly(}oMD", "|sYD)", "|sYD)");
      assertEquals("|sYD)", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "|#TB2<u;#Lv");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
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
  public void test_0239()  throws Throwable  {
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
  public void test_0240()  throws Throwable  {
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
  public void test_0241()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
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
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "|#TB2<u;#Lv");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toStringYesNo(boolean1);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false", "false", "?xu8Js");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.ArrayUtils", "org.apache.commons.lang.BooleanUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "true", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("", "p|PUZrMgoQ)jv_", "p|PUZrMgoQ)jv_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("A blank string is not  valid number", "yes", "yes", "yes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array is empty", "n", "Array is empty", "Array is empty");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("/Gj2!79", " ZS,GsI", " ZS,GsI", "/Gj2!79");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "on", "on", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "5s+~]zm@y[(idgj~#k", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "array is empty", "array is empty", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Integer integer0 = new Integer((-3248));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-3248), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Integer integer0 = new Integer(2368);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2368, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "|#TB2<u;#Lv");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      
      int int0 = BooleanUtils.toInteger(boolean1, (-2280), (-2280), (-2065));
      assertEquals((-2280), int0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1169579741), (-1169579741), 1539);
      assertEquals(1539, int0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1729), 1467);
      assertEquals((-1729), int0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer((-1717986916));
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals((-1717986916), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Integer integer0 = new Integer(4);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Integer integer0 = new Integer((-450));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer((-1));
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
  public void test_0282()  throws Throwable  {
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
  public void test_0283()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Integer integer0 = new Integer((-2383));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1995781669), (-1), (-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(779, 383, 779, 383);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1448192968), (-1448192968), (-1448192968), (-1448192968));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(1583);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, (Integer) null);
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
      Integer integer0 = new Integer(45);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer1);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
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
  public void test_0292()  throws Throwable  {
      Integer integer0 = Integer.getInteger("false", 108);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(65, (-2396), (-3248));
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
      boolean boolean0 = BooleanUtils.toBoolean(102, 102, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-3507), 1, (-3507));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1195);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off", "off", "off", "off");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off", "off", "off", "off");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2970), (-1), (-1134969925), 2967);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1440), (-868), 5325);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(446, 0, 446);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Integer integer0 = new Integer((-1868));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(910);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(17);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Boolean boolean0 = new Boolean("OJ0;^");
      String string0 = BooleanUtils.toString(boolean0, "", (String) null, "\"m&'DKlt^Hw");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Integer integer0 = new Integer(92);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1717986916));
      Integer integer0 = new Integer((-1717986916));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1717986916), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-6), (-6));
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "ac3tx1*b%", "^GUf");
      assertEquals("^GUf", string0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "org.apache.commons.lang.ArrayUtils", "pO/O8;=FDX9w", "org.apache.commons.lang.ArrayUtils");
      assertEquals("org.apache.commons.lang.ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "#a8F\"wajmvEZZM-X!*", "The String did not match any specified value", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = (Boolean) false;
      booleanArray0[1] = (Boolean) true;
      booleanArray0[2] = (Boolean) false;
      booleanArray0[3] = (Boolean) false;
      booleanArray0[4] = (Boolean) true;
      booleanArray0[5] = (Boolean) false;
      booleanArray0[6] = (Boolean) false;
      booleanArray0[7] = (Boolean) false;
      Boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
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
  public void test_0342()  throws Throwable  {
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
  public void test_0343()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
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
  public void test_0344()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
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
  public void test_0347()  throws Throwable  {
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
  public void test_0348()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("kn", "oQB", "kn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("kn", "g!/+P$2EE-)sWg", "g!/+P$2EE-)sWg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "--", "--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.math.NumberUtils", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "--");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("T;^!ll~Wb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("#a8F\"wajmvEZZM-X!*", "", "yes", "#a8F\"wajmvEZZM-X!*");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("", "A blank string is not a valid number", (String) null, "--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off", "off", "off", "off");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "{Bx", "{Bx", "{Bx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Array is empty", "`9Jk-C", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, ", '", "' 9)j|LD.Q d;G3#CA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "g", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("T;^!ll~Wb");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(203);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer1);
      assertFalse(integer2.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = Boolean.valueOf("g!/+P$2EE-)sWg");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(57, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Integer integer0 = new Integer((-747));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-747), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 1, 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-3760), (-971), (-3760));
      assertEquals((-3760), int0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 2010, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 65, 0);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "--", "", (String) null);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Integer integer0 = new Integer((-2005079691));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Integer integer0 = new Integer(3);
      Integer integer1 = new Integer(468);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
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
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer(100);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Integer integer0 = new Integer(102);
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
  public void test_0392()  throws Throwable  {
      Integer integer0 = new Integer(2260);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Integer integer0 = Integer.getInteger("on", (-2803));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(57, 43, 43, 43);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1910183069), 1, 1, (-1910183069));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2147483645), (-2147483645), 598, 598);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1505), (-2665), (-1505), (-1455758265));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Integer integer0 = new Integer(995);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Integer integer0 = new Integer(65);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Integer integer0 = new Integer((-747));
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
  public void test_0404()  throws Throwable  {
      Integer integer0 = new Integer(57);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1162), 2827, (-4667));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-4667), (-4667), (-4667));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-7));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = new Boolean("g");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Boolean boolean0 = new Boolean("{BBx");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      String string0 = BooleanUtils.toStringOnOff((Boolean) booleanArray0[3]);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(3180, (-1562), 140, 140);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(674, 114, 114);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Integer integer0 = new Integer(1249);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(674);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
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
  public void test_0432()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(76);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(760, 0, 760, 1079);
      String string0 = BooleanUtils.toString(boolean0, "", "", "OP9<oB9.|");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(705);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals(705, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-3629));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Integer integer0 = new Integer((-1318));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, integer0, integer0);
      assertEquals((-1318), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "m", "m");
      assertEquals("m", string0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toString(boolean0, "Array cannot be empty.", "off", "off");
      assertEquals("Array cannot be empty.", string0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "The String did not match any specified value", "false", "Array cannot be empty.");
      assertEquals("Array cannot be empty.", string0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
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
  public void test_0450()  throws Throwable  {
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
  public void test_0451()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
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
  public void test_0454()  throws Throwable  {
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
  public void test_0455()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes", "q", "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("A blank string is not a valid number", "([y", "The String did not match any specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "{}", "yes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "m");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "!rp|-k[,4>'c", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array cannot be empty.", "Array cannot be empty.", "Array cannot be empty.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off", "", "lca >", "off");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("true", (String) null, "on", "F2~rK!g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "{}", "{}", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "{}", "F2~rK!g", "JY_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "{}", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("-0x");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Integer integer0 = Integer.getInteger("f{*U2C", 48);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) false, integer0, integer0, (Integer) null);
      assertEquals(48, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("0x", "0x", "0x", "0x");
      int int0 = BooleanUtils.toInteger(boolean0, 1087, 0, (-4332));
      assertEquals(1087, int0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 441, 441, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-177), (-177));
      assertEquals((-177), int0);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Integer integer0 = new Integer((-2414));
      Integer integer1 = new Integer((-261));
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
  public void test_0493()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(289);
      Integer integer2 = new Integer(289);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer2, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(289);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Integer integer0 = Integer.getInteger("f{*U2C", 48);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Integer integer0 = new Integer((-4190));
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
  public void test_0497()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2060008171), 1, 1, 1);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-4182052), (-4182052), 1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(887);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("cr c");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer((-1307));
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
  public void test_0503()  throws Throwable  {
      Integer integer0 = new Integer(859);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Integer integer0 = new Integer((-1307));
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
  public void test_0505()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1455726445), (-1), 1);
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
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1), (-42), (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Integer integer0 = new Integer((-1808018875));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-136));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-42));
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer(48);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(48, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}", (String) null, "{}", "_R,T");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("_R,T", "_R,T", "_R,T", "_R,T");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 1, 0, 0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1554), 0, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1134, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(517);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(951);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Integer integer0 = new Integer(1209);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString((boolean) boolean0, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Integer integer0 = new Integer(108);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(108, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Integer integer0 = new Integer((-1078909011));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1078909011), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(609);
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
      assertEquals(609, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) true, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-122));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      int int0 = BooleanUtils.toInteger(booleanArray0[0], (-1554), (-1554), (-1586));
      assertEquals((-1586), int0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, ",-q`", ",-q`");
      assertEquals(",-q`", string0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "org.apache.commons.lang.BooleanUtils");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      String string0 = BooleanUtils.toString(booleanArray0[0], ">BTv0", "0", "0");
      assertEquals(">BTv0", string0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
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
  public void test_0556()  throws Throwable  {
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
  public void test_0557()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
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
  public void test_0558()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[1] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
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
  public void test_0561()  throws Throwable  {
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
  public void test_0562()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1870));
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("c*", "meb", "c*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("u&~", "u&~", "u&~");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "2\"(FzLk&0-uJA;!eP", "yes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "no", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("B8UG.Dh=#q!;>u}8&Hl", "vLgc8O'Iv) dXfcDUD", "vLgc8O'Iv) dXfcDUD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "no", "no", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("", ")!lbI$|J:tBEc{h#W5", "u98I$Neu", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("6#V^.%yO@| 66k +A35", "R2$&b!^mbYD", "6#V^.%yO@| 66k +A35", "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "{}", ", '", "the array must not contain any null elements");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "V[MBHt(#sbD", "false", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("array cannot be empty.");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Integer integer0 = new Integer((-960));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-960), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer((-359));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals((-359), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 1, 1, (-3151));
      int int0 = BooleanUtils.toInteger(boolean0, 1, (-3151), (-3151));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1825, 1825);
      assertEquals(1825, int0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1833, 1833);
      assertEquals(1833, int0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Integer integer0 = new Integer(488);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Integer integer0 = new Integer(951);
      Integer integer1 = new Integer(57);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Integer integer0 = new Integer(460);
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, (Integer) null);
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
      Integer integer0 = new Integer(102);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Integer integer0 = new Integer((-4445));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Integer integer0 = new Integer((-1));
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
  public void test_0610()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(4007, (-6254807), (-6254807), (-6254807));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-1083521585), (-40676972), 1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), 0, (-1), (-1));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Integer integer0 = new Integer(318);
      Integer integer1 = new Integer(Integer.MAX_VALUE);
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
  public void test_0615()  throws Throwable  {
      Integer integer0 = new Integer(318);
      Integer integer1 = new Integer(1441);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Integer integer0 = new Integer((-1434));
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
  public void test_0617()  throws Throwable  {
      Integer integer0 = new Integer((-758));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Integer integer0 = Integer.getInteger("");
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Integer integer0 = new Integer(318);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2045644811), (-1448648362), (-1448648362));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-48), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Integer integer0 = new Integer((-1078909011));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2091));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("XRfD", "XRfD", "XRfD", "XRfD");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, (-1908874351));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1870));
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(388, 0, 43, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 1035, 939);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Integer integer0 = new Integer(1035);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
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
  public void test_0649()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "org.apache.commons.lang.ArrayUtils", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1035);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Integer integer0 = new Integer(1926);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Integer integer0 = new Integer((-427));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-427), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(" is not a valid number.");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Integer integer0 = new Integer((-2232));
      Integer integer1 = BooleanUtils.toIntegerObject(booleanArray0[0], integer0, integer0, integer0);
      assertEquals((-2232), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 2859);
      assertEquals(2859, int0);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("gvFW<!.GkP7<Jbs");
      int int0 = BooleanUtils.toInteger(boolean0, (-823), 0, (-393));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "no", "no", (String) null);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, "jb&$bk8", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
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
  public void test_0666()  throws Throwable  {
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
  public void test_0667()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("=z#eLo/(5ptO");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Boolean[] booleanArray0 = new Boolean[3];
      booleanArray0[0] = (Boolean) false;
      booleanArray0[1] = boolean1;
      booleanArray0[2] = (Boolean) false;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
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
  public void test_0670()  throws Throwable  {
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
  public void test_0671()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "s", "s");
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("R@H>E{7L[)[?p", "*w", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yeds", "oAQ~*{dq", "yeds");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "q%t?<4,", "off");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "b>7rvh2MA6=v>2xI(y)", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("HoQ", "HoQ", "HoQ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("no", "ys", "ys", "ys");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("mL", "ys", "mL", "mL");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "no", "no", "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "ZqtpsyxWGK+Gi9", "ZqtpsyxWGK+Gi9", "ZqtpsyxWGK+Gi9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "2km=$3~b]J", "IUUA", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "on", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "1x", "1x", "");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      Integer integer0 = new Integer(2603);
      Boolean boolean0 = BooleanUtils.toBooleanObject((-860));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(2603, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, (-1), (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-141736948), (-141736948), 2159);
      assertEquals(2159, int0);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-985), 0, 0);
      assertEquals((-985), int0);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 2859);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1482), (-636));
      assertEquals((-636), int0);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = new Integer(1811);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Integer integer0 = new Integer((-4915));
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
  public void test_0709()  throws Throwable  {
      Integer integer0 = new Integer(3414);
      Integer integer1 = new Integer(2289);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer2);
      assertNotNull(integer2);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      Integer integer0 = new Integer((-1357));
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
  public void test_0711()  throws Throwable  {
      Integer integer0 = new Integer(48);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Integer integer0 = new Integer(3414);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1288, 101, 443, 1288);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-956), 219, 3323, 219);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-1968987989), 0, (-1074));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer((-3258));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Integer integer0 = new Integer(2088);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Integer integer0 = new Integer(54);
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
  public void test_0722()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      Integer integer0 = new Integer(0);
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
  public void test_0725()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(350, 43, (-3101));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(550, 550, 550);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1429, (-1), 1429);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Integer integer0 = new Integer((-1994731455));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1057));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("=z#eLo/(5ptO");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "no", "no", (String) null);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("=z#eLo/(5ptO");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBooleanDefaultIfNull(boolean1, false);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2062177580), 43, 43, (-863));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 100, 2488);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      Integer integer0 = new Integer(187);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1111);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-600));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "/$w.e55");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      Integer integer0 = new Integer(2605);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2605, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Boolean boolean0 = new Boolean("on");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Integer integer0 = new Integer((-1084530373));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1084530373), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, (-2570));
      assertEquals((-2570), int0);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "false", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("`T");
      String string0 = BooleanUtils.toString(boolean0, "`T", "6", "6");
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "Lw", "false", "]82T");
      assertEquals("Lw", string0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "JA$Yi}IG{kvQV", "JA$Yi}IG{kvQV", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
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
  public void test_0771()  throws Throwable  {
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
  public void test_0772()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[7];
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
  public void test_0773()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[4] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
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
  public void test_0776()  throws Throwable  {
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
  public void test_0777()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("yes", (String) null, "nYTm]pGT+t~c0\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("A blank string is not a valid number", "A blank string is not a valid number", "A blank string is not a valid number");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, ", '", ", '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "0x", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "@,EiN1_,4wo*XQZ^s", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Po~SR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("aNH", "The Array must not be null", "The Array must not be null", "aNH");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("array is empty", "}", "array is empty", "array is empty");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Po~SR", "Po~SR", "Po~SR", "Po~SR");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "rqwe", "rqwe", "rqwe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "nn", "nn", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "G4]", (String) null, "-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("x9p_EPr9)J'", "kf4'`gz.", "kf4'`gz.", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) true, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Integer integer0 = new Integer((-1717986916));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1717986916), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-1431655763), 0, (-1431655763));
      assertEquals((-1431655763), int0);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2605, 2605, 2605);
      assertEquals(2605, int0);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      int int0 = BooleanUtils.toInteger(boolean0, (-1431655763), 0, (-1431655763));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 2, 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "X(yNH>f$<4dJKlFy", "true");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      Integer integer0 = new Integer(48);
      Integer integer1 = new Integer((-500));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Integer integer0 = new Integer((-2084));
      Integer integer1 = new Integer((-1643));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Integer integer0 = new Integer(48);
      Integer integer1 = new Integer((-500));
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
  public void test_0818()  throws Throwable  {
      Integer integer0 = new Integer((-1));
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
  public void test_0819()  throws Throwable  {
      Boolean boolean0 = new Boolean("F }s V0r?a8");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Integer integer0 = Integer.getInteger("Array element ", (Integer) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(10, 57, 57, 10);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-1971), 0, (-1971));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1175, 1175, (-1133), (-1447469278));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(147, 742, (-1982835571), (-1128406300));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(0);
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
  public void test_0827()  throws Throwable  {
      Integer integer0 = new Integer(1760);
      Integer integer1 = new Integer((-1));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
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
  public void test_0829()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Integer integer0 = new Integer((-896));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2, (-426), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1), 1634, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Integer integer0 = new Integer((-2808));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1431655763));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("rqwe");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, (Integer) null, (Integer) null);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      boolean[] booleanArray0 = new boolean[6];
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) booleanArray0[3], integer0, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      Boolean boolean0 = new Boolean("F }s V0r?a8");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("`T");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("aIQJ<2[U");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-682), 1312, 1567, 1567);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(3603, 0, 2096);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      Integer integer0 = new Integer(6896);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1991));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
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
  public void test_0865()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "true", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, ">!18\"pc#M!u-d/r", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      Integer integer0 = new Integer((-172));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-172), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = Boolean.FALSE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 102, 2);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, ";~!q$ 2H4oajh", ";~!q$ 2H4oajh");
      assertEquals(";~!q$ 2H4oajh", string0);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "keC`>A}IF{FJVAWpq", "Ph]5_]9vmk{t[+#d=");
      assertEquals("keC`>A}IF{FJVAWpq", string0);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toString(boolean0, "O->]CMf~", "", "O->]CMf~");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "K\"v\"T", "JC;u4-vgY#A0j aa6");
      String string0 = BooleanUtils.toString(boolean0, "--", "Array cannot be empty.", "?W,v");
      assertEquals("--", string0);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
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
  public void test_0884()  throws Throwable  {
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
  public void test_0885()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
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
  public void test_0888()  throws Throwable  {
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
  public void test_0889()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[5];
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
      
      booleanArray0[0] = boolean0;
      booleanArray0[1] = booleanArray0[0];
      booleanArray0[2] = booleanArray0[0];
      booleanArray0[3] = booleanArray0[1];
      booleanArray0[4] = booleanArray0[1];
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(">w", "true", "wHP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on", "no", "on");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "on", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "H~WxjRGPC.T", "H~WxjRGPC.T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no", "no", "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array is empty", "ag`V;E+", "ag`V;E+", "Array is empty");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("no", "d@l,zFL", "d@l,zFL", "d@l,zFL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "[/5rJ&gS$y;T2kfUk('", "[/5rJ&gS$y;T2kfUk('", "[/5rJ&gS$y;T2kfUk('");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", "od]", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "no", "on", "on");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("#RxAz:'|l#JAn");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-858));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-858), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      Integer integer0 = new Integer((-2022309120));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Integer integer0 = Integer.getInteger("LGe@`#2k4(xe6\"%w}`#", (Integer) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-2143), (-714862049), (-2143));
      assertEquals((-2143), int0);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      int int0 = BooleanUtils.toInteger(boolean0, (-1953669449), 3924, 45);
      assertEquals(3924, int0);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-3247));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-3300), (-609));
      assertEquals((-609), int0);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = Integer.getInteger("*k\"", 48);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Integer integer0 = new Integer(2630);
      Integer integer1 = new Integer(97);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Integer integer0 = new Integer((-454));
      Integer integer1 = new Integer((-1953374439));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Integer integer0 = new Integer(83);
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
  public void test_0930()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      Integer integer0 = new Integer(14);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(3077, (-199), 100, (-199));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 68, 1, 1);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1935421999), (-5990), (-1953669449), (-1935421999));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      Integer integer0 = new Integer((-2022309120));
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
  public void test_0938()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer((-2915));
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      Integer integer0 = new Integer((-853));
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
  public void test_0940()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1), (-1077908660), 1634);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-529), (-529), (-529));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1078918007), 391, (-1078918007));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-553));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, (-1953669449), 3924, 45);
      assertEquals((-1953669449), int0);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      Integer integer0 = new Integer((-2143));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1033), 0, 1239, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1615, 1374, (-4252));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      Integer integer0 = new Integer((-1903));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(208);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
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
  public void test_0974()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "yes", "", "");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "Ut)]:R2,GTN?qth");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-155), 0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      Integer integer0 = Integer.getInteger("yes", 1);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      assertTrue(boolean0);
      
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = new Integer(337);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals(337, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 108, 108);
      assertEquals(108, int0);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "no", "ywBZu!)pcp=a");
      assertEquals("ywBZu!)pcp=a", string0);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "(lw}`mZ", "(lw}`mZ");
      assertEquals("(lw}`mZ", string0);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "", "=XsA}&*1Wb4ad+kYS", "=XsA}&*1Wb4ad+kYS");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "H", ",{`xpK ", "-8%Id{>R@1<vvI~<f|#");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(".Y^X5", ".Y^X5", ".Y^X5", "d");
      Boolean boolean1 = new Boolean("c");
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
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
  public void test_0992()  throws Throwable  {
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
  public void test_0993()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 2060);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
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
  public void test_0996()  throws Throwable  {
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
  public void test_0997()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("bsJ|qbRm7;UqO", "|d?&`[5V+", "|d?&`[5V+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("The Array must not be null", "The Array must not be null", "The Array must not be null");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "The Integer did not match any specified value", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "hy|JQg3*i+km3|C0I", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("`", "", "`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("c", "d", "QKY?M1yz7&I?l", "c");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("g>", "lA+GYw`27K*#|^M", (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.BooleanUtils", "a`S?", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "jjtG", "jjtG", "jjtG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "0x", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("1/s1wh");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1123035308));
      Integer integer0 = new Integer((-1123035308));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1123035308), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      Integer integer0 = new Integer(473);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      Integer integer0 = new Integer((-1758));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1758), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(100, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 3375, 3375, (-1447722942));
      assertEquals((-1447722942), int0);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      int int0 = BooleanUtils.toInteger(boolean0, 1, 384, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 2212);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 24, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1705);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1969349682));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer(102);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      Integer integer0 = new Integer(2987);
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
  public void test_1035()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 2246, 2246, 1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), 2060, (-1077887544), (-4182052));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2060, (-4182052), 2060, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      Integer integer0 = new Integer((-4252));
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer1);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      Integer integer0 = new Integer(1183);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
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
  public void test_1045()  throws Throwable  {
      Integer integer0 = Integer.getInteger("no");
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      Integer integer0 = new Integer(101);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
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
  public void test_1048()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(97, 1572, 2411);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1615, 1615, 1615);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1, 758, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      Integer integer0 = new Integer(69);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2004968833));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("on");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 2060);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
}
