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
        BooleanUtils.toBooleanObject(1297, 0, 0, 0);
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
        BooleanUtils.toBooleanObject((-1468406214), (-164), (-2), (-1083033862));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1920), 101, 3068);
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
      Integer integer0 = new Integer(108);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3308));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-518));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
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
  public void test_0007()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "1lhHzv");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "--", (String) null, "EV^O:9,$va|4");
      assertNull(string0);
      assertFalse(boolean0.equals((Object)boolean1));
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("dy?.G&C9YFi", "dy?.G&C9YFi", "@3QbW6}!/hZ>MgK^y", "");
      String string0 = BooleanUtils.toString(boolean0, "", "dy?.G&C9YFi", "l=62j)8qu<V|X'<");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("nM");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "^u(qobdqb},b5=%", "");
      assertEquals("^u(qobdqb},b5=%", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toString(boolean0, "^u(qobdqb},b5=%", "Array is empty", "Array is empty");
      assertEquals("Array is empty", string0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "Z^E[sQ[", "j9'$&9HGYK/C*", "o.=`Hf");
      assertEquals("o.=`Hf", string0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
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
  public void test_0026()  throws Throwable  {
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
  public void test_0027()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      Boolean[] booleanArray1 = new Boolean[7];
      booleanArray1[0] = (Boolean) false;
      booleanArray1[1] = (Boolean) booleanArray0[2];
      booleanArray1[2] = (Boolean) true;
      booleanArray1[3] = (Boolean) false;
      booleanArray1[4] = (Boolean) false;
      booleanArray1[5] = (Boolean) false;
      Integer integer0 = new Integer((-831));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray1[6] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
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
  public void test_0030()  throws Throwable  {
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
  public void test_0031()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, " ", "array is empty", (String) null);
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(",jf&0~N](#-x~ao||nY", "`", ",jf&0~N](#-x~ao||nY");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("jew", "jew", "jew");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "sm", "false");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "#nuJK_=*/[", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(" <>Bj0", "The Integer did not match either specified value", "The Integer did not match either specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("neo", "false", "false", "false");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("o.=`Hf", "j9'$&9hgyk/c*", "j9'$&9hgyk/c*", "o.=`Hf");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "\"4)", "Z^E[sQ[", "xw-atdhd~\"m|acp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "\"4)", "Z^E[sQ[", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, " is not a valid number.", "h!l?;13R[+w_'~V6x");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "2", (String) null, "array is empty");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Boolean boolean0 = new Boolean("\"g8&sd7hVRTmXGY2=+");
      Integer integer0 = new Integer(1469);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1469, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Integer integer0 = new Integer((-2093064));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-2093064), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Integer integer0 = new Integer((-2021161078));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-2021161078), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 473, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 120, 120, (-1952701058));
      assertEquals((-1952701058), int0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1), (-587));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("2", " ", "2", " ");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      Integer integer0 = BooleanUtils.toIntegerObject(booleanArray0[2]);
      assertEquals(0, (int)integer0);
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
      Integer integer0 = new Integer((-2021161078));
      Integer integer1 = new Integer(2546);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, (Integer) null, integer0);
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
      Integer integer0 = new Integer((-3721));
      Integer integer1 = new Integer((-234865432));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = new Integer((-919));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer((-1435114108));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Integer integer0 = new Integer(46);
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
  public void test_0073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1718, 0, 0, 1718);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1320), (-218), (-1320), (-1320));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(46, 46, 1, 46);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Integer integer0 = new Integer(68);
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
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer(46);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Integer integer0 = new Integer(1527);
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
      Integer integer0 = new Integer((-528));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(896, (-1), (-1));
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
      boolean boolean0 = BooleanUtils.toBoolean(68, 68, 68);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1818, 896, 1818);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(599);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1644);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) false, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Integer integer0 = new Integer((-3721));
      Integer integer1 = new Integer((-234865432));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Integer integer0 = new Integer((-3721));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
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
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
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
        BooleanUtils.toBooleanObject(120, (-1071), 100, 1);
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
        BooleanUtils.toBooleanObject(0, 1078, 2474, 2543);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 108, (-1778), 0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(81, 1, 0);
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
      Integer integer0 = new Integer((-497));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(8);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
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
  public void test_0114()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "true");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, " is not a valid number.", " is not a valid number.", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("no");
      String string0 = BooleanUtils.toString(boolean0, "$", "", "9/;");
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
      Integer integer0 = new Integer((-1445110761));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1445110761), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(4493, 4493, 0, 4493);
      Integer integer0 = new Integer(4493);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 100, 100);
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) false, 1326, 795, 1528);
      assertEquals(795, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "0x", "0x");
      assertEquals("0x", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(100);
      String string0 = BooleanUtils.toString(boolean0, "on", (String) null, "true");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
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
  public void test_0130()  throws Throwable  {
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
  public void test_0131()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
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
  public void test_0134()  throws Throwable  {
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
  public void test_0135()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4298));
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("g$g::y\",3d<", "w7>IS}i~*H}x47", "w7>IS}i~*H}x47");
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
      boolean boolean0 = BooleanUtils.toBoolean("off", "true", "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "yes", "org.apache.commons.lang.ArrayUtils");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "MQ'l#0IQ#V5vm*PBxM.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "MUWT<C{ yH.TZ1}-[lt", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("e^Fzb[(kfaF]DQJ'}k", "e^Fzb[(kfaF]DQJ'}k", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("8IQ)I5ADWP|KxZJ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "ms", "ms", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(")\bMRT!:7c;o)8lx", "yes", "h-(.>", "The Array must not be null");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "[1^D]\"AQ@*{>|F", "{'sU m{ca.|", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "vgz1\"(", (String) null, "vgz1\"(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "yes", "k=zp+rg +|ZN@.1", "): }02U~1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("8IQ)I5ADWP|KxZJ");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer((-1719967058));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1719967058), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Integer integer0 = new Integer(529);
      Boolean boolean0 = BooleanUtils.toBooleanObject("JP", "NX", "JP", "JP");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(529, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Integer integer0 = new Integer((-81));
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Integer integer0 = new Integer(1767);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1767, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-757), (-757), 0);
      assertEquals((-757), int0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 2279, (-24));
      assertEquals((-24), int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Integer integer0 = new Integer((-1526));
      Integer integer1 = new Integer((-1085558047));
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
  public void test_0175()  throws Throwable  {
      Integer integer0 = new Integer((-1445110761));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = new Integer(529);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer(3849);
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
  public void test_0178()  throws Throwable  {
      Integer integer0 = new Integer((-4182052));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = new Integer((-3622));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2245, (-1018), 2245, (-1018));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Integer integer0 = new Integer(1308);
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
  public void test_0184()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Integer integer0 = new Integer((-2028236891));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer((-1445110761));
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
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer((-81));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 69, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
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
  public void test_0192()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) booleanArray0[2]);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(4493, 4493, 0, 4493);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Boolean boolean0 = new Boolean("CEPc");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Integer integer0 = new Integer(735);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[5];
      Boolean boolean0 = new Boolean(false);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.negate(booleanArray0[0]);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("MUWT<C{ yH.TZ1}-[lt", "MUWT<C{ yH.TZ1}-[lt", "MUWT<C{ yH.TZ1}-[lt", "MUWT<C{ yH.TZ1}-[lt");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4298));
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4298));
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("Array element ");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
}
