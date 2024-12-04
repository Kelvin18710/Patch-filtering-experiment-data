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
        BooleanUtils.toBooleanObject((-5837), 0, (-2719), (-2719));
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(120, (-1597), 0, 120);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(97, 1538, 631);
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-232), (-1464), (-3990));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(765);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Integer integer0 = new Integer(3402);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "", "{}", "'");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2014583448));
      int int0 = BooleanUtils.toInteger(boolean0, 120, (-1597), (-3384));
      assertEquals(120, int0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) false, 0, (-1953039882), (-1953039882));
      assertEquals((-1953039882), int0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "(X<icZ,c<Y", "8=*+{N:S");
      assertEquals("8=*+{N:S", string0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "n4}18", "The Array must not be null");
      assertEquals("n4}18", string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      String string0 = BooleanUtils.toString(boolean0, "G RW&4Gv?|NGX!=", "\"yel:H6]MC`!bv", "");
      assertEquals("\"yel:H6]MC`!bv", string0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(46);
      String string0 = BooleanUtils.toString(boolean0, "k5hdMj&:j(Qe~L", "", "");
      assertEquals("k5hdMj&:j(Qe~L", string0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "iV{uXKe(s%.D", "3Fes&F/t+9yzd#Rhv", (String) null);
      assertNull(string0);
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
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
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
  public void test_0025()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[18];
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
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("~q", "0x", "0x");
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
      boolean boolean0 = BooleanUtils.toBoolean("fx.-2/%ou3+hf3m", "fx.-2/%ou3+hf3m", "fx.-2/%ou3+hf3m");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "vV", "vV");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("{}", "W}uY!.G1Sp'#w", "W}uY!.G1Sp'#w", "W}uY!.G1Sp'#w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Cza?1r", "Z(^]^N", "org.apache.commons.lang.BooleanUtils", "Cza?1r");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
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
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ", '", (String) null, "A^W]6\"IQ+D6+2,@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "&RyJ0umu({)t", "cu5ao(}K%?[", (String) null);
      assertNull(boolean0);
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
      assertTrue(boolean0);
      assertNotNull(boolean0);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("n4}18");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Integer integer0 = new Integer((-676));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-676), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Integer integer0 = new Integer(2216);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(2216, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject((boolean) boolean0, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(97, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "");
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "Array is empty", "", "");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1879886297), 1);
      assertEquals((-1879886297), int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = new Integer((-1457811651));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Integer integer1 = new Integer((-1995626677));
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
  public void test_0071()  throws Throwable  {
      Integer integer0 = new Integer((-1096));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Integer integer0 = new Integer((-1067));
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
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Integer integer0 = new Integer((-1610743646));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Integer integer0 = new Integer(2854);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(43, (-3805), 64, (-3805));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(102, 1, 102, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2648), (-2648), 1660, 1660);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Integer integer0 = new Integer((-1140303019));
      Integer integer1 = new Integer((-664));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3988);
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
  public void test_0082()  throws Throwable  {
      Integer integer0 = new Integer((-1274));
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
      Integer integer0 = new Integer(345);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Integer integer0 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2291, 2291, 2291);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(46, 182, 46);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-533));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Integer integer0 = new Integer((-2754));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "Array is empty", "", "");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "Array is empty", "", "");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "Array is empty", "", "");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
      assertNotNull(string0);
      
      String string1 = BooleanUtils.toString(false, string0, "");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "Array is empty", "", "");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, (-1), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-4737), 0, 0);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, (-1445619993), 45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1374));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "{$#cQ0E8 [H", ";'29wC{9gVEL`");
      assertEquals(";'29wC{9gVEL`", string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Integer integer0 = new Integer((-1560));
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Integer integer0 = new Integer(10);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(10, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1109415669), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-485), 1763);
      assertEquals(1763, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      int int0 = BooleanUtils.toInteger(booleanArray0[0], 0, 10, 10);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "", (String) null, "tv-N3q\":d:{Xxo\"rZ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      String string0 = BooleanUtils.toString((Boolean) booleanArray0[0], "", (String) null, "tv-N3q\":d:{Xxo\"rZ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "qcA([`FMZD}Y6xa9ya", "EpQlHtFzMd+;\u0007z\"", "EpQlHtFzMd+;\u0007z\"");
      assertEquals("EpQlHtFzMd+;\u0007z\"", string0);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "");
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      booleanArray0[8] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
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
  public void test_0133()  throws Throwable  {
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
  public void test_0134()  throws Throwable  {
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
  public void test_0135()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
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
  public void test_0138()  throws Throwable  {
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
  public void test_0139()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yTX", "", "yTX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("z+i}+cR@x", "z+i}+cR@x", "z+i}+cR@x");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "Sf,~B;15^la", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("hb? ~4V*v$/cU", "The Array must not be null", "3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("LtLJt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("org.apache.commons.lang.BooleanUtils", (String) null, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{[+so*", "7AHq&flV4o2m*Ua", "{[+so*", "7AHq&flV4o2m*Ua");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", ")e3kd[+Dft", "Zz", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "tbmJH", "tbmJH", "tbmJH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "yes", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "<}", "Gu,wwO4", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("vW6D{gP");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-3242));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-3242), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Integer integer0 = new Integer((-1560));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1560), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1371), 2, (-1722538537));
      assertEquals((-1722538537), int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      int int0 = BooleanUtils.toInteger(boolean0, (-263), 1290, (-514));
      assertEquals(1290, int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-4928), (-4928));
      assertEquals((-4928), int0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject("60|[eWtDV!Y");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((-35));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = new Integer((-35));
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
  public void test_0175()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = new Integer((-2984));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = new Integer((-1023));
      Integer integer1 = new Integer((-11));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, integer1);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Integer integer0 = new Integer((-1983342904));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = new Integer(221);
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
  public void test_0181()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), 1293, 1293, 1293);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1535, 4034, 4034, 1535);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Integer integer0 = new Integer((-10));
      Integer integer1 = new Integer(1);
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
  public void test_0186()  throws Throwable  {
      Integer integer0 = new Integer((-1109755848));
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
  public void test_0187()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer((-65940589));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Integer integer0 = new Integer((-10));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-3447), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1459623964), (-1459623964), (-3093));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-484), (-1), (-2396));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Integer integer0 = Integer.getInteger("off", 1290);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(446);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(446);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Integer integer0 = new Integer((-271));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-3735), (-1225), (-3016));
      assertEquals((-3735), int0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Integer integer0 = new Integer((-3445));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) booleanArray0[7]);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(616, 100, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2519, 644, (-4112));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Integer integer0 = new Integer((-1939294409));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1160);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1370));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "hs4Z", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "{YdnKSj+<ERPF@PJ-Q:", ".-cK|S2K\">W |6;");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Integer integer0 = new Integer((-3167));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-3167), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Integer integer0 = new Integer((-349));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1670, (-4286));
      assertEquals(1670, int0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "P;@},", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "b3|q", "mmq8b[pI[/(8");
      assertEquals("b3|q", string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toString(boolean0, "!", "jQ7=^u/h ~B44W`_a(", "yes");
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "true", "true", "Array cannot be empty.");
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "org.apache.commons.lang.BooleanUtils", "}v?X;@s`_:_", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
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
  public void test_0239()  throws Throwable  {
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
  public void test_0240()  throws Throwable  {
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
  public void test_0241()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[5];
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
  public void test_0242()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
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
  public void test_0246()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("3q", "NI$]$z", "3q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("_9k", "0x", "on");
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "Or~", "Or~");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "n ?UZ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "2", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array cannot be empty.", "Array cannot be empty.", "{}");
      assertTrue(boolean0);
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
      boolean boolean0 = BooleanUtils.toBoolean(" is not a valid number.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(" OT72iTa6n", "Array is empty", "Array is empty", " OT72iTa6n");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("B;I`!wCYC)y0ch", "!", "on", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(" is not a valid numbr.", "yes", " is not a valid numbr.", "The Array must not be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "off", "The array must not contain any null elements", "off");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "n", "", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-1939294409));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1939294409), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Integer integer0 = new Integer(1492);
      Boolean boolean0 = Boolean.TRUE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1492, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Integer integer0 = new Integer(11);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(11, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-990), (-990), 46);
      assertEquals((-990), int0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 43, 43, 7);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      int int0 = BooleanUtils.toInteger(boolean0, 102, 0, 0);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("vlhPM!", "vlhPM!", "vlhPM!", "vlhPM!");
      int int0 = BooleanUtils.toInteger((boolean) boolean0, (-990), (-990));
      assertEquals((-990), int0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 705, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, (Integer) null, integer1);
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
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(120);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array cannot be empty.", "Array cannot be empty.", ")AYpRN.NA)]", "uDM_g@Cgrg1");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer((-406));
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer(226);
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
  public void test_0285()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array cannot be empty.", "Array cannot be empty.", ")AYpRN.NA)]", "uDM_g@Cgrg1");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array cannot be empty.", "Array cannot be empty.", ")AYpRN.NA)]", "uDM_g@Cgrg1");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1639), 1196, 1196, 1196);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 100, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3534, 1, 1, 3534);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Integer integer0 = new Integer(524);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
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
  public void test_0292()  throws Throwable  {
      Integer integer0 = new Integer(3869);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
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
  public void test_0294()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
      
      boolean boolean1 = BooleanUtils.toBoolean((Integer) null, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array cannot be empty.", "Array cannot be empty.", ")AYpRN.NA)]", "uDM_g@Cgrg1");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2027), (-1892), (-1892));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1010, 1010, 1010);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-2027), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1076860143));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1010);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Boolean boolean0 = new Boolean("RX6l6n");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("g(<t8|", "g(<t8|", "g(<t8|", "g(<t8|");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "o>9zn", (String) null, (String) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("eif");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(814, (-1), 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, (-863), (-863));
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-893), (-1966), (-669));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Integer integer0 = new Integer(2301);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(46);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-669));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
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
  public void test_0330()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "6mX+G1#PY$PRh");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "|ia");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Integer integer0 = new Integer(915);
      Integer integer1 = new Integer((-1883313785));
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals((-1883313785), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 214, 214);
      assertEquals(214, int0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-729), 1751, 2671);
      assertEquals((-729), int0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "cnxhVcpeu}r-", "cnxhVcpeu}r-");
      assertEquals("cnxhVcpeu}r-", string0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toString(boolean0, "no", "The String did not match either specified value", ":I\"g[1?^Oa");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
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
  public void test_0349()  throws Throwable  {
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
  public void test_0350()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
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
  public void test_0353()  throws Throwable  {
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
  public void test_0354()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("org.apache.commons.lang.ArrayUtils", "on", "org.apache.commons.lang.ArrayUtils");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("UAr", "UAr", "UAr");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "false", "false");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "The Integer did not match either specified value", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("The String did not match any specified value", "j", "j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("MB5?jy<`", "Array cannot be empty.", "Array cannot be empty.", "MB5?jy<`");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("#>:;", "0s!AT9", "0s!AT9", "0s!AT9");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Array must not be null", "The Array must not be null", "wp[7", "false");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "YgOe:sQ:~fMxV1U", "YgOe:sQ:~fMxV1U", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "`t_", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "+cn", "+cn", "+cn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = new Integer((-729));
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals((-729), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Integer integer0 = new Integer(1408);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1408, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Integer integer0 = new Integer(915);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(915, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, Integer.MAX_VALUE, Integer.MAX_VALUE, 1340);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
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
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Integer integer0 = new Integer((-305));
      Integer integer1 = new Integer(97);
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
  public void test_0393()  throws Throwable  {
      Integer integer0 = new Integer((-1994674209));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Integer integer0 = new Integer(6);
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
  public void test_0395()  throws Throwable  {
      Integer integer0 = new Integer((-1982862647));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Integer integer0 = new Integer((-1902));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Integer integer0 = new Integer(1408);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(108, (-316), (-316), 108);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(4036, (-1433046622), 4036, 1545);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1297), (-1297), 0, 2422);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-4196), 1961, (-3283), (-3283));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Integer integer0 = new Integer((-1128788565));
      Integer integer1 = new Integer((-954));
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
  public void test_0404()  throws Throwable  {
      Integer integer0 = new Integer(57);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
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
  public void test_0406()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-408), 20, (-408));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-825), (-825), (-825));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Integer integer0 = new Integer((-1880208358));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("tru");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(80);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", " is not a valid number.", "on", " is not a valid number.");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Boolean boolean0 = new Boolean("`toNrmdt%");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "The Integer did not match either specified value", "\"^'U]|xrTJdra", "on");
      assertEquals("\"^'U]|xrTJdra", string0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-196), 109, 2062, (-69));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-494), 100, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Integer integer0 = new Integer((-773));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-777));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
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
  public void test_0437()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "-0x");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "Qv", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2982), 3192, (-2982), 1264);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Integer integer0 = new Integer(2257);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2257, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1604), 1);
      assertEquals((-1604), int0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 100, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "DsK.1ro;W&R", "DsK.1ro;W&R");
      assertEquals("DsK.1ro;W&R", string0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2079);
      String string0 = BooleanUtils.toString(boolean0, "9\" wl[B7\"", "The String did not match any specified value", (String) null);
      assertEquals("9\" wl[B7\"", string0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Boolean boolean0 = new Boolean("{}");
      String string0 = BooleanUtils.toString(boolean0, "{}", "{}", "The Array must not be null");
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2278), (-2278), (-2278), 3367);
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean boolean1 = BooleanUtils.toBooleanObject(false);
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
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
  public void test_0454()  throws Throwable  {
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
  public void test_0455()  throws Throwable  {
      Integer integer0 = new Integer((-924));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[7];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
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
  public void test_0458()  throws Throwable  {
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
  public void test_0459()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2099761786), (-2099761786), (-2099761786), (-1));
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("o~s|", "mDU", "mDU");
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
      boolean boolean0 = BooleanUtils.toBoolean("yes", "M;reuVeOc", "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "?PQ!pi<f.JD-HCEXg:", "?PQ!pi<f.JD-HCEXg:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "o~s|", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("xmr", "xmr", "xmr");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array cannot be empty.", "", "", "Array cannot be empty.");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("yes", "g'", (String) null, "H$#*J[\"9:W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Integer did not match either specified value", "", "The Integer did not match either specified value", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "g(yr", "g(yr", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "xmr", "xmr", "xmr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "The Integer did not match either specified value", "The Array must not be null");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Boolean boolean0 = new Boolean("0l");
      Integer integer0 = new Integer((-773));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-773), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Integer integer0 = new Integer(1813);
      Boolean boolean0 = new Boolean(true);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1813, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Integer integer0 = new Integer((-1087042863));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1087042863), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, (-678), (-678), 0);
      assertEquals((-678), int0);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2062);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 2062, 2062, 2062);
      assertEquals(2062, int0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 297, 65);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2898));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
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
      Integer integer0 = new Integer(1409);
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
  public void test_0497()  throws Throwable  {
      Integer integer0 = new Integer(738);
      Integer integer1 = new Integer((-2005623944));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer2);
      assertNotNull(integer2);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Integer integer0 = new Integer((-596));
      Integer integer1 = new Integer((-1613322998));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Integer integer0 = new Integer((-3071));
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
  public void test_0501()  throws Throwable  {
      Integer integer0 = new Integer(2463);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(469, (-1433737555), 0, (-1433737555));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1372), (-2096597635), 2554, (-1372));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("o~s|");
      Integer integer0 = new Integer((-2898));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
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
  public void test_0507()  throws Throwable  {
      Integer integer0 = new Integer(1153);
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
      Integer integer0 = new Integer((-2726));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Integer integer0 = new Integer((-1019));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1), (-2099761786), (-1604));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1), 68, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1014);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Boolean boolean0 = new Boolean("on");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "on", "on", "on");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "", "", "w>5DI");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3553, 3553, (-3588), 3553);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "ghb@/", (String) null, "z,");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("nnd");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2027), (-414), (-414), (-414));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(927, 0, 3201);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 597, (-1393));
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
      boolean boolean0 = BooleanUtils.toBoolean(1741);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
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
  public void test_0540()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "_Cn[Ew]DsAO_c4f}$e", " is not a valid number.");
      assertEquals(" is not a valid number.", string0);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "org.apache.commons.lang.math.NumberUtils", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(Integer.MAX_VALUE, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Integer integer0 = new Integer(702);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-2060), (-1));
      assertEquals((-2060), int0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("aa;_qI", "aa;_qI", "aa;_qI", "aa;_qI");
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 1291);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "/T\"+gB0v]8HL]Bv?|q");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      String string0 = BooleanUtils.toString(boolean0, "no", (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1978);
      String string0 = BooleanUtils.toString(boolean0, "nJ%h 4.4@*RQq", "", "");
      assertEquals("nJ%h 4.4@*RQq", string0);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
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
  public void test_0558()  throws Throwable  {
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
  public void test_0559()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
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
  public void test_0562()  throws Throwable  {
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
  public void test_0563()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("'L#IF{A Tg7(>fL", "on", "'L#IF{A Tg7(>fL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("NuIv", "NuIv", "NuIv");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "{(&Uzk[$(2l8m\".", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.math.NumberUtils", "g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("-Gg%@5%M:Iz9D,)", "ehf", "ehf");
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
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("NuIv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("o1", "A blank string is not a valid number", (String) null, "A blank string is not a valid number");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("\"rkz.!mndr-,fi(]", "-gFIompd}R", "\"rkz.!mndr-,fi(]", "?J");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "1:+rv^_jzaSz", "1:+rv^_jzaSz", "1:+rv^_jzaSz");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "false", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "no", "&#1SlKOirA<<GU3Uo", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("QXR{`NSp!bkWi#;0e", "false", "false", "QXR{`NSp!bkWi#;0e");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("A");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Integer integer0 = new Integer((-484));
      Boolean boolean0 = BooleanUtils.toBooleanObject((-484));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-484), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Boolean boolean0 = Boolean.FALSE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(43, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Integer integer0 = new Integer((-1373));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1373), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-3020), (-3020), 0);
      assertEquals((-3020), int0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1242, 1242, 1242);
      assertEquals(1242, int0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 487, 12);
      assertEquals(487, int0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1095, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Integer integer0 = new Integer(1939);
      Integer integer1 = new Integer(57);
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
  public void test_0600()  throws Throwable  {
      Integer integer0 = new Integer(1918);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Integer integer0 = new Integer((-1285));
      Integer integer1 = new Integer(21);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Integer integer0 = new Integer((-3073));
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
  public void test_0603()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Integer integer0 = new Integer(2185);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Integer integer0 = new Integer((-1285));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-408), (-1793419823), (-1793419823), (-1793419823));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(100, 0, (-1099527195), 100);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2095, (-2086133790), 2095, 1650);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Integer integer0 = new Integer((-135675770));
      Integer integer1 = new Integer(2028);
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
  public void test_0611()  throws Throwable  {
      Integer integer0 = new Integer(1276);
      Integer integer1 = new Integer(1161);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Integer integer0 = new Integer((-2548));
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
  public void test_0613()  throws Throwable  {
      Integer integer0 = new Integer((-2548));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1135), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1149, 1149, (-1421));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = (Boolean) false;
      booleanArray0[2] = (Boolean) boolean1;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = (Boolean) boolean1;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = (Boolean) false;
      booleanArray0[7] = (Boolean) false;
      booleanArray0[8] = (Boolean) false;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2.equals((Object)boolean1));
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "on", "?J");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Integer integer0 = new Integer((-1373));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2765, 2505, 0, (-1299));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1221, 0, 0, 1221);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(935, 498, 498);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1296));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2353);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
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
  public void test_0645()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "/pIv@`z1J+20ClsAvV", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", ", '");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "?P", "", "The array must not contain any null elements");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      Integer integer0 = new Integer(1890);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = Integer.getInteger("UoeGChs?Kyw|GF", 0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1227));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1227), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      boolean boolean0 = true;
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-602));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-378), 0);
      assertEquals((-378), int0);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      int int0 = BooleanUtils.toInteger((Boolean) booleanArray0[0], (-1633047378), (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
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
      boolean[] booleanArray0 = new boolean[6];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, ":HW+'FBL", "nL&b&'");
      assertEquals("nL&b&'", string0);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      String string0 = BooleanUtils.toString(boolean0, "true", "true", "true");
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, "d6r^#w8Mzg>D;", (String) null);
      assertNull(string0);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(1215);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", ";cL", "", "f$Z|2k$T27-7<%SO");
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[7];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("off", "K<vPUh=dJtd4^c[BO_/", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on", "4L", "on");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "]LrP_L3q", "]LrP_L3q");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "', is neither of type Map.Entry nor an Array", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("[\"'Gq!", "[\"'Gq!", "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("ol", "yes", "yes", "ol");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("yes", "(lY7mNcZJ?2;JtvEF]", "rMoJefE", "rMoJefE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", ";cL", "", "f$Z|2k$T27-7<%SO");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
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
  public void test_0685()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "1jwK9US9C", " is not a valid number.", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "f$Z|2k$T27-7<%SO", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "on", "[647", "org.apache.commons.lang.ArrayUtils");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
      Integer integer0 = new Integer(29);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = booleanArray0[0];
      booleanArray0[3] = booleanArray0[1];
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals(29, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      Integer integer0 = new Integer(29);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject((boolean) boolean0, integer0, integer0);
      assertEquals(29, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      boolean boolean0 = true;
      int int0 = BooleanUtils.toInteger((Boolean) boolean0, 0, 57, 2379);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1, 120, 2681);
      assertEquals(2681, int0);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      Integer integer0 = new Integer(29);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      int int0 = BooleanUtils.toInteger((boolean) boolean0, 4364, 29);
      assertEquals(4364, int0);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(116);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      Integer integer0 = new Integer(1);
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
  public void test_0707()  throws Throwable  {
      Integer integer0 = new Integer(29);
      Integer integer1 = new Integer(45);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Integer integer0 = new Integer(29);
      Integer integer1 = new Integer(45);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Integer integer0 = new Integer((-1227));
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
  public void test_0710()  throws Throwable  {
      Integer integer0 = Integer.valueOf(658);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      Integer integer0 = new Integer(1915);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1087020381), (-1), 6, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(4364, 45, 4364, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(81, 81, 81, 81);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Integer integer1 = new Integer((-1));
      Integer integer2 = new Integer(57);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
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
  public void test_0718()  throws Throwable  {
      Integer integer0 = new Integer(29);
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
  public void test_0719()  throws Throwable  {
      Integer integer0 = new Integer(1009);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Integer integer0 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2040109463), 12, 82);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1636, 1636, 1636);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2040109463), 0, (-2040109463));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-29));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1107223603));
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      boolean boolean0 = true;
      Boolean boolean1 = BooleanUtils.negate((Boolean) boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(116);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("sff");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }
@Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1040, 591, (-3060), 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3026, (-1910294698), (-1910294698), 3026);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(3025, (-1967), (-1235));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Integer integer0 = new Integer((-537));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(466);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1234));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
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
  public void test_0754()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "I*b#uc", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "A blank string is not a valid number", "no", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Integer integer0 = new Integer((-1685));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1685), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      Integer integer0 = new Integer((-1789569704));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1789569704), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 2207, 2207);
      assertEquals(2207, int0);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "Y2fv", "Y2fv");
      assertEquals("Y2fv", string0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Integer integer0 = new Integer(459);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      String string0 = BooleanUtils.toString(boolean0, "GPuA;", "org.apache.commons.lang.ArrayUtils", "&WVoN[iI");
      assertEquals("org.apache.commons.lang.ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      String string0 = BooleanUtils.toString(boolean0, "GPuA;", "org.apache.commons.lang.ArrayUtils", "&WVoN[iI");
      assertEquals("GPuA;", string0);
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
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      Boolean boolean0 = new Boolean(";|f#");
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
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
  public void test_0775()  throws Throwable  {
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
  public void test_0776()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("C5[w'8le", (String) null, "C5[w'8le");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, ", '", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "[vI]LT=Iud.a", "b~9m\"?l.A3M)1C^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("E}{y$", "Array cannot be empty.", "YH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("xO");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("TJV~_O/zxnO%FE", (String) null, "?d_gju6$", "TJV~_O/zxnO%FE");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("OgNkk", ",3??r>+y%m", "OgNkk", ",3??r>+y%m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("'~?4VU{)c", "'~?4VU{)c", (String) null, "tjv~_o/zxno%fe");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "_{mc^SpiLS{;+8>Ec ", "no", ":-!GjKN^5\"`K]Na@C3x");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "no", "?d_gju6$", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Zu", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "s&is=g&arO", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("67", "Array element ", "fqhz#.n:+NLgPB8m", "#i6;:2<b=VuTu PQk-");
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
      assertNotNull(boolean0);
      assertTrue(boolean0);
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
      String string0 = BooleanUtils.toString(boolean0, "", "", "', has a length less than 2");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("fqhz#.n:+NLgPB8m");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, (Integer) null, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1463149028));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Boolean boolean0 = new Boolean(";|f#");
      int int0 = BooleanUtils.toInteger(boolean0, 1168, 1076, 3135);
      assertEquals(1076, int0);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1875), (-1618419716), (-536));
      assertEquals((-536), int0);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 1168, 1076, 3135);
      assertEquals(1168, int0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-849), (-2590));
      assertEquals((-2590), int0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-1474));
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
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, integer1);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
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
  public void test_0821()  throws Throwable  {
      Integer integer0 = new Integer((-1446841421));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(68, 217, 217, 217);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2093), 0, (-2093), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3452, 3452, 3452, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
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
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(620);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Integer integer0 = new Integer(1);
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
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-184), (-1), 20);
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
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 2968);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1145404069), 39, (-1145404069));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(Integer.MAX_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Integer integer0 = new Integer(459);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
}
