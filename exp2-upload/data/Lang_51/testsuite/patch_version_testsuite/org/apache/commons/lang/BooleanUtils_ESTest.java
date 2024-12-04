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
        BooleanUtils.toBooleanObject((-1865), 4156, (-1651), 298);
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
        BooleanUtils.toBooleanObject((-526), 120, 70, (-1047));
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
        BooleanUtils.toBoolean(1849, (-1), 0);
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
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2045644811));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) booleanArray0[0]);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, ", '");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "%tpe");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(57);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "Array cannot be empty.", "u# x@rowv");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Integer integer0 = new Integer(1979);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(5, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Integer integer0 = new Integer(1979);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2476), (-2476));
      assertEquals((-2476), int0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      String string0 = BooleanUtils.toString(booleanArray0[0], "fSso", "q'cUif(eAq]mr");
      assertEquals("q'cUif(eAq]mr", string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toString(boolean0, "true", "", "uZ{E+Z>~");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "true", "", "uZ{E+Z>~");
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "zB$ymY&M [|>$<", "", "', has a length less than 2");
      assertEquals("', has a length less than 2", string0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
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
  public void test_0025()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
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
  public void test_0028()  throws Throwable  {
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
  public void test_0029()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("Fx_+", "uj[?hjqor>er.lr", "uj[?hjqor>er.lr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("P~D!'`wk", "P~D!'`wk", "The Array must not be null");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "the string did not match either speciied value", "the string did not match either speciied value");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "ha\"Q{", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("u%\"/j_", "", "u%\"/j_");
      assertFalse(boolean0);
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
      boolean boolean0 = BooleanUtils.toBoolean("<qQS#R");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("@Jz", ".GifA},F9=", ".GifA},F9=", "@Jz");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false", "The array must not contain any null elements", "false", "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("?? z?qiNAat&)~j", "{}", (String) null, (String) null);
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "N.75", "N.75", "N.75");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "?S0P6GP:3$n/aX[", (String) null, "?S0P6GP:3$n/aX[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "B", "~D)Ol;PRB1A(BhC=", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("<qQS#R");
      assertNull(boolean0);
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
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = new Integer((-1934132564));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertEquals((-1934132564), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Integer integer0 = new Integer((-319));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-319), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Integer integer0 = new Integer(1929);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1929, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      int int0 = BooleanUtils.toInteger((Boolean) booleanArray0[3], 1995, 0, 2017);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 76, Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, (-1), 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 69, 69);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Integer integer0 = new Integer((-2400));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Integer integer1 = new Integer(3419);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer2);
      assertNotNull(integer2);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Integer integer0 = new Integer((-1648));
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
  public void test_0068()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer((-2061695753));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(248, 0, 0, 0);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(5253, (-1), 5253, 907);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 57, (-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 0, 76, 1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1);
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
  public void test_0076()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Integer integer0 = new Integer(617);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Integer integer0 = new Integer(109);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Integer integer0 = new Integer((-1453296957));
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
  public void test_0080()  throws Throwable  {
      Integer integer0 = new Integer((-2005287464));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2699, 0, 2699);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, (-4517));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1970402780), (-1711), (-1711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Integer integer0 = new Integer((-1453296957));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1453296957));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(473);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("<qQS#R", "<qQS#R", "ha\"Q{", "<qQS#R");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer((-2005287464));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-2005287464), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("!", "!", "!", "!");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Boolean boolean0 = new Boolean("The Integer did not match any specified value");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(48, (-802), 0, (-618));
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2), 0, 57);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2775));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
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
  public void test_0112()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1721174123));
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Integer integer0 = new Integer(1347);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Integer integer0 = new Integer((-1635));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1635), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(65, 65, (-1345), 65);
      Integer integer0 = new Integer((-1345));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1345), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-23));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Integer integer0 = new Integer(1347);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      int int0 = BooleanUtils.toInteger(boolean0, 2560, 0, 0);
      assertEquals(2560, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils");
      assertEquals("org.apache.commons.lang.BooleanUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "true", "true");
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "", "no", "no");
      String string0 = BooleanUtils.toString(boolean0, "", "", "fh@@");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(65, 65, (-1345), 65);
      String string0 = BooleanUtils.toString(boolean0, "<)X", "<)X", "v:P");
      assertEquals("<)X", string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "no", (String) null, "The array must not contain any null elements");
      assertEquals("The array must not contain any null elements", string0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "", "no", "no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject(2560);
      assertTrue(boolean1);
      
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean1;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean1;
      booleanArray0[5] = boolean1;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
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
  public void test_0136()  throws Throwable  {
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
  public void test_0137()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1493));
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("2}7#-uc]aodw@c5ccvh", "Tt:dA*\"t{CI34czN$o", "2}7#-uc]aodw@c5ccvh");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array is empty", "Array is empty", "Array is empty");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "jITb,pL-$m/kbN", "jITb,pL-$m/kbN");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "[w1UKH*zc`h", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("Array cannot be empty.", ")(q+EP)A6mqV/<T;6v`", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("The Integer did not match any specified value");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The array must not contain any null elements", "A blank string is not a valid number", "", "The array must not contain any null elements");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("((@Kq* 4*-z{*w7D_", "((@Kq* 4*-z{*w7D_", "<)X", "O");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "i.ueyec`#hj", "i.ueyec`#hj", "i.ueyec`#hj");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "ysH&@mBw$0}", (String) null, "ysH&@mBw$0}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "hc:4DS?LQX6C", "on", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "jFQZNBhryhE", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(", '", (String) null, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Integer integer0 = new Integer((-1460));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Integer integer0 = new Integer(1478);
      Boolean boolean0 = new Boolean((String) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1478, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Integer integer0 = new Integer(1056);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1056, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-3934), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 46, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("The Integer did not match any specified value");
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-3934), 0);
      assertEquals((-3934), int0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 322, 43);
      assertEquals(322, int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-291), (-970));
      assertEquals((-970), int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Integer integer0 = new Integer(848);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
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
      Integer integer0 = new Integer(120);
      Integer integer1 = new Integer((-771));
      Integer integer2 = new Integer(120);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer2, integer2);
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
      Integer integer0 = new Integer(1307);
      Integer integer1 = new Integer((-3563));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer((-1720546677));
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
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Integer integer0 = new Integer((-50));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Integer integer0 = new Integer(48);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1928, 187, (-1), 1928);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, 3346, 3346, 3346);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(364, 1, 364, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Integer integer0 = new Integer(1);
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
  public void test_0186()  throws Throwable  {
      Integer integer0 = new Integer((-2292));
      Integer integer1 = new Integer(1422);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer(6);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer(583);
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
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 411, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1720), (-1720), (-1720));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(65, (-1345), 46);
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
      Boolean boolean0 = new Boolean("SJxuA");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2404);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.toBooleanObject((boolean) boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("The Integer did not match any specified value");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
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
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1840870951), (-2342), (-275), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, 0, (-1));
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((-897));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-518));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "off", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Integer integer0 = new Integer((-2420));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "g2E_,EZ>7.FEKB", "g2E_,EZ>7.FEKB");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "", "eCi]q/~|'CKKhOFm", "^");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Integer integer0 = new Integer((-1840870951));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1840870951), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Integer integer0 = new Integer((-1840870951));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1840870951), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 48, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "off", "off");
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "The Array must not be null");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-49), 1, 1667);
      String string0 = BooleanUtils.toString(boolean0, "HH", "eCi]q/~|'CKKhOFm", "");
      assertEquals("eCi]q/~|'CKKhOFm", string0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toString(boolean0, "org.apache.commons.lang.ArrayUtils", "", "org.apache.commons.lang.ArrayUtils");
      assertEquals("org.apache.commons.lang.ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "org.apache.commons.lang.ArrayUtils", "", "org.apache.commons.lang.ArrayUtils");
      assertEquals("org.apache.commons.lang.ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
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
  public void test_0235()  throws Throwable  {
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
  public void test_0236()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[9];
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
  public void test_0237()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
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
  public void test_0240()  throws Throwable  {
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
  public void test_0241()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("J81kg-[}qA", "ucJ&7*dM", "J81kg-[}qA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("false", "--", "dk[9j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "dk[9j", "dk[9j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "CuSQm(P<Y,\"mi.$");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "IUIor}EL&", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("The Integer did not match any specified value", "The Integer did not match any specified value", "The Integer did not match any specified value");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "on", "on", "no");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("uex", "yes", "uex", "uex");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("aa", (String) null, "The Array must not be null", "=U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
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
  public void test_0256()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "C5K!]p#+", (String) null, "C5K!]p#+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "vX0`y", "pa?W,c", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("odf");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = new Boolean("true");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Integer integer0 = new Integer(1482);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1482, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      int int0 = BooleanUtils.toInteger(boolean0, (-998), 816, 0);
      assertEquals(816, int0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1726424909), (-1433737555), (-353));
      assertEquals((-353), int0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-434), (-434));
      assertEquals((-434), int0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 350, 350);
      assertEquals(350, int0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = Boolean.valueOf("kL'(g_x*TA");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
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
      Integer integer0 = new Integer((-1433966240));
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Integer integer0 = new Integer((-1969068055));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Integer integer0 = new Integer((-1613449631));
      Integer integer1 = Integer.valueOf((-1433965340));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
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
  public void test_0283()  throws Throwable  {
      Integer integer0 = new Integer((-3068));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer((-891));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Integer integer0 = new Integer((-1613449631));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(3, (-889), (-1178), (-889));
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(120, 120, (-1), 120);
      int int0 = BooleanUtils.toInteger(boolean0, 120, 120, 65);
      assertEquals(120, int0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1474), 0, 0, (-1474));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer2 = new Integer(929);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer2);
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
      Integer integer0 = new Integer((-1613449631));
      Integer integer1 = Integer.valueOf((-1433965340));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Integer integer0 = new Integer((-275));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Integer integer0 = new Integer((-1119061579));
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
  public void test_0293()  throws Throwable  {
      Integer integer0 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Integer integer0 = new Integer((-1613449631));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(43, 270, 1020);
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
      boolean boolean0 = BooleanUtils.toBoolean(1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1, 1419, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Integer integer0 = new Integer(95);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(10);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("rrto");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "no", "no", "no");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = (Boolean) false;
      booleanArray0[2] = (Boolean) true;
      booleanArray0[3] = (Boolean) false;
      booleanArray0[4] = booleanArray0[0];
      booleanArray0[5] = boolean0;
      booleanArray0[6] = (Boolean) false;
      booleanArray0[7] = (Boolean) false;
      booleanArray0[8] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toStringOnOff(boolean1);
      assertEquals("off", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Integer did not match any specified value", "The Integer did not match any specified value", "The Integer did not match any specified value", "d:hcmr^gignmd v");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1), 102, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2142, 2264, (-2013724388), 2142);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), (-76), (-1), (-1));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2650, 107, 1123);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Integer integer0 = new Integer(37);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(478);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2604));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[6];
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
  public void test_0329()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "gnu}!dj39zj~d/kb4");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "#>S#\n:345KcQf`", "off", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1016, 1016, 0, 0);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Integer integer0 = new Integer((-78));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals((-78), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-644), 101);
      assertEquals((-644), int0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, (-2165), (-55), (-2548));
      assertEquals((-2165), int0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "true");
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toString(boolean0, "org.apache.commons.lang.ArrayUtils", "', has a length less than 2", "on");
      assertEquals("org.apache.commons.lang.ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
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
  public void test_0347()  throws Throwable  {
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
  public void test_0348()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject("VK&(", (String) null, "VK&(", "VK&(");
      booleanArray0[0] = boolean0;
      booleanArray0[1] = booleanArray0[0];
      Boolean boolean1 = BooleanUtils.negate(booleanArray0[0]);
      booleanArray0[2] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject("VK&(", (String) null, "VK&(", "VK&(");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
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
  public void test_0351()  throws Throwable  {
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
  public void test_0352()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("4!Vr @DL6sb", "", "4!Vr @DL6sb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("))g`dll['", "))g`dll['", "))g`dll['");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "?4eFN6Q", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "FYF2i(=B3", "VK&(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("e+G!J7nop", "!RfQv", "The Array must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("zcrW&,|J\"%Bsr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("$lvM", "MqNA]f`&?M:T+ttiP9'", "MqNA]f`&?M:T+ttiP9'", "MqNA]f`&?M:T+ttiP9'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("j8A=M3c]Us0", "{^UzoG=bT", "org.apache.commons.lang.ArrayUtils", "j8A=M3c]Us0");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "u_");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "rXzMqiga|", "rXzMqiga|", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "x:c~8;gq!3a[q>k5'c", (String) null, "x:c~8;gq!3a[q>k5'c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, " |aM2,--I.NlUKY~", " |aM2,--I.NlUKY~", " |aM2,--I.NlUKY~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("eQP(");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1971231124));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Integer integer0 = new Integer(68);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, integer0, integer0);
      assertEquals(68, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject("VK&(", (String) null, "VK&(", "VK&(");
      booleanArray0[0] = boolean0;
      Integer integer0 = new Integer((-3052));
      booleanArray0[2] = booleanArray0[0];
      Integer integer1 = BooleanUtils.toIntegerObject(booleanArray0[2], integer0, integer0, integer0);
      assertEquals((-3052), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(101, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Integer integer0 = new Integer((-1537));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Integer did not match either specified value", (String) null, "The Integer did not match either specified value", "The Integer did not match either specified value");
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 2, 2, (-599));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1702, 1702, 1702);
      assertEquals(1702, int0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 101, 101);
      assertEquals(101, int0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 2142);
      assertEquals(2142, int0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Integer integer0 = Integer.getInteger("zcrW&,|J\"%Bsr");
      Integer integer1 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, (Integer) null, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Integer integer0 = Integer.getInteger("zcrW&,|J\"%Bsr");
      Integer integer1 = new Integer((-46585607));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, (Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Integer integer0 = new Integer((-3052));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Integer integer0 = new Integer(185);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Integer integer0 = new Integer(68);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Integer integer0 = new Integer(69);
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
  public void test_0397()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1086530624), (-3244), (-3244), 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(101, Integer.MAX_VALUE, 101, 101);
      String string0 = BooleanUtils.toString(boolean0, "org.apache.commons.lang.ArrayUtils", "', has a length less than 2", "on");
      assertEquals("', has a length less than 2", string0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2142, 2142, 2142, 2142);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Integer integer0 = new Integer((-1796161710));
      Integer integer1 = new Integer((-93));
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
  public void test_0402()  throws Throwable  {
      Integer integer0 = new Integer((-3052));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Integer integer0 = new Integer(2074);
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
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Integer integer0 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-258062584), 120, (-3052));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1122404624), (-1122404624), (-1122404624));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1768305842), 2077, (-1768305842));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Integer integer0 = new Integer((-3052));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      
      booleanArray0[1] = boolean0;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(booleanArray0[1], true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject("VK&(", (String) null, "VK&(", "VK&(");
      booleanArray0[1] = boolean0;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(booleanArray0[1], true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      String string0 = BooleanUtils.toStringOnOff(booleanArray0[0]);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      String string0 = BooleanUtils.toStringYesNo((Boolean) booleanArray0[0]);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
}
