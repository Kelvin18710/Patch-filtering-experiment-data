package org.apache.commons.math.stat;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1789569706, 1789569706).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      Integer integer0 = new Integer(10);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-4383));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1360L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1557));
      double double0 = frequency0.getPct(828L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2383L);
      double double0 = frequency0.getPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-4383));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('v');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1557));
      double double0 = frequency0.getPct('x');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1557));
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4977));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((long) (-4977));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(33, 33, (-706)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      double double0 = frequency0.getCumPct((-1039));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(';');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct('Y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-300));
      long long0 = frequency0.getCumFreq((-300));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('A');
      long long0 = frequency0.getCumFreq('b');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('%');
      long long0 = frequency0.getCount((-1340L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), 1998).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCount('Y');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      Integer integer0 = Integer.getInteger("`h'_>Sl0I?kTE8G", 0);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('#');
      // Undeclared exception!
      try { 
        frequency0.addValue((int) '#');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((int) '$');
      // Undeclared exception!
      try { 
        frequency0.addValue('$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-1490));
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1, 1092, (-2215), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 1879048192);
      Long long0 = new Long(2904L);
      long long1 = frequency0.getCumFreq((Object) long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(33, 33, (-706)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCumFreq((Object) "LrY5<>ZDO");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('%');
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('$');
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \njava.lang.Object@27a5fd52\t1\t100%\t100%\n");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(33).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('%');
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-3745L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-34), (-34), 18, (-34), 35).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((long) 35);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      double double0 = frequency0.getCumPct((-2456L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1608);
      double double0 = frequency0.getCumPct((-729));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-883));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4977));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((-4977));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-4977));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1073741824);
      frequency0.addValue((-420));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-420\t1\t50%\t50%\n1073741824\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('A');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('I');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      Integer integer0 = new Integer(1);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-860));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3340));
      frequency0.addValue((Object) integer0);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      double double0 = frequency0.getPct((long) (-1409));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      double double0 = frequency0.getPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('[');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('i');
      double double0 = frequency0.getPct('7');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('m');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1254L);
      double double0 = frequency0.getCumPct((-1949L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3340));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((-921));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1109), (-1109)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      double double0 = frequency0.getCumPct('&');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1879048192, (-519), (-519), (-991), 655).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('&');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1190));
      long long0 = frequency0.getCumFreq(3L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue((Object) iterator0);
      long long0 = frequency0.getCumFreq('m');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('q');
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('i');
      long long0 = frequency0.getCount((-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('i');
      long long0 = frequency0.getCount('\'');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3);
      frequency0.addValue('*');
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('#');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) '#');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2674));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(743);
      // Undeclared exception!
      try { 
        frequency0.addValue('Q');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('}');
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1109), (-1109)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq((Object) iterator0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1611L);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1222));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1222));
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCount((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1624), (-1114), 758, (-1624), 1574).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1L));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 625);
      Integer integer0 = new Integer(625);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('R');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nR\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1894L));
      long long0 = frequency0.getCumFreq((-21));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1595L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1611), (-1611), 0, (-1611), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getPct(14);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('7');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('K');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-21));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((-387));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-387\t1\t50%\t50%\n0\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue(1L);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1722);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1722);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((-1378L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct((-17L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1788L);
      double double0 = frequency0.getPct((-3677));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct(9);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1966));
      double double0 = frequency0.getPct('7');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct('8');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      double double0 = frequency0.getCumPct((long) (-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1165, 502, 1789569706, 1789569706, (-2061)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('o');
      long long0 = frequency0.getCount(3464);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct('4');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('2');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1L);
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1966));
      long long0 = frequency0.getCumFreq((-585));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq('2');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount((-17L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('@');
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2065L);
      long long0 = frequency0.getCount('_');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('8');
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('K');
      Integer integer0 = new Integer('K');
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      // Undeclared exception!
      try { 
        frequency0.addValue(4L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('H');
      // Undeclared exception!
      try { 
        frequency0.addValue((-3353));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-679));
      // Undeclared exception!
      try { 
        frequency0.addValue('S');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-91), 419, (-648)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('@');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4L);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(2065L);
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1966));
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1691));
      frequency0.addValue(integer0);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(736L);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(43);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(227);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2128);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2477);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-328L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1165, 502, 1789569706, 1789569706, (-2061)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('o');
      long long0 = frequency0.getCount(3464);
      Object object0 = new Object();
      long long1 = frequency0.getCumFreq(object0);
      assertTrue(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('}');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('d');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-1089L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-344));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1422L));
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
@Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-825));
      Integer integer0 = new Integer((-1478));
      frequency0.addValue(integer0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1478\t1\t50%\t50%\n-825\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('~');
      Integer integer0 = new Integer((-592));
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-362L));
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-851));
      double double0 = frequency0.getPct((long) (-851));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(2442);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('f');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('J');
      double double0 = frequency0.getPct('J');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('~');
      Integer integer0 = new Integer((-592));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(1440L);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('J');
      double double0 = frequency0.getCumPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer(3584);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('b');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(502L);
      double double0 = frequency0.getCumPct('%');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(1440L);
      long long0 = frequency0.getCumFreq(3280);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('J');
      long long0 = frequency0.getCumFreq('c');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('~');
      long long0 = frequency0.getCount((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('J');
      long long0 = frequency0.getCount('c');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('*');
      Integer integer0 = new Integer(3680);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(')');
      // Undeclared exception!
      try { 
        frequency0.addValue(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(':');
      // Undeclared exception!
      try { 
        frequency0.addValue(34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1095));
      // Undeclared exception!
      try { 
        frequency0.addValue('p');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3000), (-3000), 447, (-3000), 0).when(comparator0).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency1.addValue(object0);
      long long0 = frequency1.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1218), 626, (-1218), 0, (-770)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
      
      frequency0.getCount(289);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1636L));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('N');
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1655L);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1636L));
      long long0 = frequency0.getCount((Object) "");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1327L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Integer integer0 = new Integer(936);
      frequency0.addValue(integer0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(998L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(447);
      frequency0.addValue(integer0);
      frequency0.addValue((-372));
      long long0 = frequency0.getCumFreq(8L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1400);
      Integer integer0 = new Integer(1400);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-736));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1073741824);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(447);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(52);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3000), (-3000), 447, (-3000), 10).when(comparator0).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency1.addValue(object0);
      long long0 = frequency1.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('+');
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('\u001D');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(':');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(8L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
@Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(6L);
      frequency0.addValue(2818L);
      double double0 = frequency0.getCumPct(307L);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('\\');
      frequency0.addValue(397);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct('u');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Integer integer0 = new Integer(10);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct((-1L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(604);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1073741824, 1840700269).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct('(');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('u');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(';');
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2638));
      Integer integer0 = new Integer((-2638));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2732, (-254), (-222)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((long) 604);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(6L);
      double double0 = frequency0.getCumPct(307L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2732, (-254), (-222)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(1717986918);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2638));
      double double0 = frequency0.getCumPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2732, (-254), (-222)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('u');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      double double0 = frequency0.getCumPct('/');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('\\');
      long long0 = frequency0.getCumFreq(1339);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2638));
      long long0 = frequency0.getCumFreq('2');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2638));
      long long0 = frequency0.getCount(867L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('\\');
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCount('_');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1948);
      frequency0.addValue('\'');
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('6');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1597L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('L');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2824));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(10);
      // Undeclared exception!
      try { 
        frequency0.addValue('\"');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2673), 1398, 1398, 53, (-2673)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
      
      long long1 = frequency0.getCumFreq(object0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('W');
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('w');
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(604);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3606, 2205, 1196, (-960), (-734)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1551);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nj\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3612, 3612, 3612, (-960), 3612).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('o');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('Y');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-1852));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1567);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
@Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1582), 1431655765).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-919));
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      Integer integer0 = new Integer(0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      double double0 = frequency0.getPct((long) (-1239));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      double double0 = frequency0.getPct((-615L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getPct((-38));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(20);
      double double0 = frequency0.getPct(20);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('f');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct('<');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-935));
      double double0 = frequency0.getCumPct((long) (-935));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(1438);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      double double0 = frequency0.getCumPct('S');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-935));
      long long0 = frequency0.getCumFreq(1028);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 3574, 1064).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq('s');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      long long0 = frequency0.getCount((-5162));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount(':');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1182);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      Integer integer0 = new Integer(107);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('h');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) 'h');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('X');
      // Undeclared exception!
      try { 
        frequency0.addValue(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(38);
      // Undeclared exception!
      try { 
        frequency0.addValue('/');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1582), 1431655765, 1, (-1582), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-919));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1073741824, 1073741824, 44, 1073741824, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1));
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1239));
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(772);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue(0L);
      long long0 = frequency0.getCount((Object) iterator0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      long long0 = frequency0.getCount((Object) iterator0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1802L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1582), 1431655765, 1, (-1582), (-1415)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-919));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct('');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(296);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-935));
      frequency0.addValue((-935));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-935\t2\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1582), 1431655776, 1, (-1582), 1431655776).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(1);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('H');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('t');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1789569706);
      Integer integer0 = new Integer(1789569706);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-1582));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
@Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1732));
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, (-2909), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1732));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('.');
      double double0 = frequency0.getPct((long) 5064);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct(1050);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(')');
      double double0 = frequency0.getPct(95);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(674, (-423)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('<');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('G');
      double double0 = frequency0.getPct('G');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('{');
      double double0 = frequency0.getCumPct((-1L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('m');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('~');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-175));
      double double0 = frequency0.getCumPct('R');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(')');
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(2972);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('m');
      long long0 = frequency0.getCumFreq('m');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-173));
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCount((long) (-173));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('m');
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(')');
      long long0 = frequency0.getCount(')');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(5L);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('E');
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(';');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2229L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('T');
      // Undeclared exception!
      try { 
        frequency0.addValue((-527));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2756L));
      // Undeclared exception!
      try { 
        frequency0.addValue('D');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10, 10, (-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Long long0 = new Long(3112L);
      frequency0.addValue((-1));
      long long1 = frequency0.getCumFreq((Object) long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-175));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1778);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('3');
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('M');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(370);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-3548L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(3938L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10, 10, (-1), 16).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1732));
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1416L);
      double double0 = frequency0.getCumPct(36);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      String string0 = frequency0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2981);
      Integer integer0 = new Integer(2981);
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('Y');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('\'');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-5600));
      Integer integer0 = new Integer((-5600));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1275);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1426L);
      frequency0.addValue((-1207));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1207\t1\t50%\t50%\n1426\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1207));
      double double0 = frequency0.getCumPct(36);
      assertEquals(1.0, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      Integer integer0 = new Integer(739);
      frequency0.addValue((Object) integer0);
      frequency0.addValue((Object) iterator0);
      double double0 = frequency0.getPct(739);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(739);
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(154);
      double double0 = frequency0.getPct(4458L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1001);
      double double0 = frequency0.getPct((long) 1001);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(154);
      double double0 = frequency0.getPct((-2206));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(154);
      double double0 = frequency0.getPct('P');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('g');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(589);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
      double double0 = frequency0.getCumPct(1713L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-1253));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct(10);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1168L);
      double double0 = frequency0.getCumPct('X');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('g');
      double double0 = frequency0.getCumPct('m');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(5L);
      long long0 = frequency0.getCumFreq(5L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('o');
      long long0 = frequency0.getCumFreq(2096);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('g');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((-821L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(4614);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('g');
      long long0 = frequency0.getCount('m');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('q');
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1336);
      frequency0.addValue('#');
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('b');
      // Undeclared exception!
      try { 
        frequency0.addValue(1392L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('b');
      // Undeclared exception!
      try { 
        frequency0.addValue((int) 'b');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      try { 
        frequency0.addValue('7');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(739);
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(739);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1504);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(154);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2458, 2458, 935, (-1080), 2458).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(955);
      long long0 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2999);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1075));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3825);
      frequency0.addValue(integer0);
      frequency0.addValue(3L);
      double double0 = frequency0.getCumPct(1713L);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(955);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(955);
      long long0 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long1 = frequency0.getCumFreq((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      //  // Unstable assertion: assertTrue(long1 == long0);
      //  // Unstable assertion: assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('/');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('b');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(1018L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(935);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }
@Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Object) integer0);
      frequency0.addValue(3364L);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      Integer integer0 = new Integer(1);
      frequency0.addValue('\'');
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2665L));
      double double0 = frequency0.getPct(2532L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct(1317L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(818L);
      double double0 = frequency0.getPct((-3511));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1391);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(818L);
      double double0 = frequency0.getPct('I');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct(',');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('Y');
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('#');
      double double0 = frequency0.getCumPct(2523);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2102);
      double double0 = frequency0.getCumPct('v');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      double double0 = frequency0.getCumPct('g');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-707));
      long long0 = frequency0.getCumFreq((-707));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1391);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('{');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-434L));
      long long0 = frequency0.getCount((-434L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1391);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1530);
      long long0 = frequency0.getCount('&');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('l');
      // Undeclared exception!
      try { 
        frequency0.addValue(2L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('R');
      // Undeclared exception!
      try { 
        frequency0.addValue((-311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(5L);
      // Undeclared exception!
      try { 
        frequency0.addValue('|');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('5');
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2752), (-2752), (-2752)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1422));
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1391);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(818L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      Integer integer0 = new Integer(1);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1672, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      long long1 = frequency0.getCumFreq((-160));
      //  // Unstable assertion: assertTrue(long1 == long0);
      //  // Unstable assertion: assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 2093);
      Integer integer0 = new Integer(2093);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2690L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1051, 10, 10, (-1), 10).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('f');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('?');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2153L));
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2523));
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
@Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(0L);
      Iterator iterator0 = frequency0.valuesIterator();
      double double0 = frequency0.getPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('p');
      double double0 = frequency0.getPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('!');
      double double0 = frequency0.getPct((long) '!');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3492));
      double double0 = frequency0.getPct((-2698L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(723);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1L));
      double double0 = frequency0.getPct(3495);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3512);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('B');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2462));
      double double0 = frequency0.getPct('l');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1989, 1226, 1226, (-2920), 1989).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1226);
      double double0 = frequency0.getCumPct((-1652L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('p');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1989, 1226, 1226, (-2920), 1989).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-911));
      double double0 = frequency0.getCumPct(5007);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-742L));
      double double0 = frequency0.getCumPct(13);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1724);
      double double0 = frequency0.getCumPct('^');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct('n');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(170L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-828));
      long long0 = frequency0.getCumFreq(387);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq('+');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('p');
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCount('7');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-4243L));
      // Undeclared exception!
      try { 
        frequency0.getCumPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('3');
      Integer integer0 = new Integer('3');
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('J');
      // Undeclared exception!
      try { 
        frequency0.addValue(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('F');
      // Undeclared exception!
      try { 
        frequency0.addValue(1373);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3692));
      // Undeclared exception!
      try { 
        frequency0.addValue('%');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1989, 1226, 1226, (-2920), (-2133)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-214L));
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      Integer integer0 = new Integer(1764);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2599L);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('b');
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2462));
      Integer integer0 = new Integer((-751));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1538L));
      long long0 = frequency0.getCumFreq((-3021L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1989, 1226, 1226, (-2920), 1989).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((long) 1989);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(429L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n429\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2133));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1018);
      frequency0.addValue((Object) integer0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('J');
      frequency0.addValue('>');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n>\t1\t50%\t50%\nJ\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('8');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('d');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2566));
      Integer integer0 = new Integer((-2566));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-2920));
      assertEquals(0L, long0);
  }
}
