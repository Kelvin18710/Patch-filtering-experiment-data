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
      Frequency frequency0 = new Frequency();
      frequency0.addValue('B');
      frequency0.addValue('\"');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n\"\t1\t50%\t50%\nB\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      Integer integer0 = new Integer((-1));
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct((-859L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2262L);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2262L);
      double double0 = frequency0.getPct(1534);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-263), 1610612736).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1227L);
      double double0 = frequency0.getPct('9');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct('W');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1107));
      double double0 = frequency0.getCumPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1107\t1\t100%\t100%\n");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('i');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-972L));
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct('Y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq((-1741L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1107));
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(708);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount('Z');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
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
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(']');
      Integer integer0 = new Integer((-681));
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
  public void test_0024()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('B');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1L));
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
      frequency0.addValue(' ');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2));
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
      frequency0.addValue(690L);
      // Undeclared exception!
      try { 
        frequency0.addValue('[');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2176), (-2176), 1, 1, (-2176)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1227L);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq('9');
      assertEquals(1L, long0);
      
      long long1 = frequency0.getCumFreq(object0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1389);
      frequency0.addValue(integer0);
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
  public void test_0031()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3366);
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
  public void test_0033()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
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
  public void test_0037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('7');
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('^');
      double double0 = frequency0.getCumPct('#');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(349, (-1670), 349, (-2038), 349).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(250);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1995));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, (-2057), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-2057));
      Object object0 = new Object();
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('2');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('>');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1152);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((long) 349);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-47));
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
  public void test_0055()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(868);
      frequency0.addValue(integer0);
      frequency0.addValue(628L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n628\t1\t50%\t50%\n868\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(637);
      Integer integer0 = Integer.getInteger("", 637);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct((long) 1298);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-1238L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct((-4706));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      double double0 = frequency0.getPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(837);
      double double0 = frequency0.getPct('V');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('`');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1L);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-36));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(2691L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1575);
      double double0 = frequency0.getCumPct((-1095));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1077L);
      double double0 = frequency0.getCumPct(1540);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('Y');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1610612736, 5, 5, (-1193), 5488).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(3550);
      double double0 = frequency0.getCumPct((long) (-3870));
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getCumPct('<');
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(122);
      long long0 = frequency0.getCumFreq(289L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(535);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(535);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1610612736, 5, 5, (-1193), 5488).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(3550);
      double double0 = frequency0.getCumPct((long) (-3870));
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq('N');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('C');
      long long0 = frequency0.getCount(116L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(9);
      long long0 = frequency0.getCount(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('G');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1051L);
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
  public void test_0076()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4L);
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
  public void test_0077()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('=');
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
  public void test_0078()  throws Throwable  {
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
  public void test_0079()  throws Throwable  {
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
  public void test_0080()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
      Integer integer0 = new Integer('p');
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
  public void test_0081()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('T');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) 'T');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      // Undeclared exception!
      try { 
        frequency0.addValue('Y');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3693), (-3693), (-638)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1L);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1L);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('4');
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('C');
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nC\t1\t100%\t100%\n");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nC\t0\t0%\t0%\n");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
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
  public void test_0092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('C');
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nC\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
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
  public void test_0096()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1236), (-160), 499, (-1236), 499).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Integer integer0 = new Integer((-1531));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 855, (-1), (-1204)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Integer integer0 = new Integer((-1531));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4315));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-144));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(6L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2640);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-36));
      frequency0.addValue(integer0);
      frequency0.addValue(144);
      Long long0 = new Long(0L);
      long long1 = frequency0.getCumFreq((Object) long0);
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1584));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('J');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('L');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-384));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2481), 1, 1, (-2481), 1717986918).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-4761L));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-4761\t0\t0%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1990L);
      frequency0.addValue((-2018));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-2018\t1\t50%\t50%\n1990\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2179);
      Integer integer0 = Integer.getInteger("a", 2179);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1268), (-1268)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-4761L));
      double double0 = frequency0.getPct((long) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1781L);
      double double0 = frequency0.getPct((long) 1268);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1990L);
      double double0 = frequency0.getPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2179);
      double double0 = frequency0.getPct(2179);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(39);
      double double0 = frequency0.getPct('f');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct('v');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1781L);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2179);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1990L);
      double double0 = frequency0.getCumPct((-2018));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((-1222));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2481), 1, 1, (-2481), 1717986918).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-4761L));
      double double0 = frequency0.getCumPct('d');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2179);
      double double0 = frequency0.getCumPct('?');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2018));
      long long0 = frequency0.getCumFreq((-2018));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(404);
      long long0 = frequency0.getCumFreq(' ');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(404);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1781L);
      long long0 = frequency0.getCount('K');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
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
  public void test_0133()  throws Throwable  {
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
  public void test_0134()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('2');
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
  public void test_0135()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('7');
      // Undeclared exception!
      try { 
        frequency0.addValue(1143L);
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
      frequency0.addValue('E');
      // Undeclared exception!
      try { 
        frequency0.addValue(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      // Undeclared exception!
      try { 
        frequency0.addValue('C');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1912L));
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
  public void test_0139()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1634, (-1215), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('7');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1073741824, 1073741824, 1073741824, (-3866), (-3485)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('o');
      double double0 = frequency0.getCumPct((long) 4097);
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1268), (-1268), 2485, (-1268), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-4761L));
      double double0 = frequency0.getCumPct((-4761L));
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
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
  public void test_0144()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(46);
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
  public void test_0146()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-3839));
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
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
  public void test_0150()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2179);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-3839));
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
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
  public void test_0154()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3054L));
      frequency0.addValue(1536L);
      long long0 = frequency0.getCumFreq((-1032L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3134));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(20);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1073741824);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1634, (-1215), 1634).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('7');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('>');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('/');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2037));
      Integer integer0 = new Integer((-2037));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1275);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 3007);
      frequency0.addValue((-505));
      double double0 = frequency0.getPct(3007);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((long) 3007);
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct((-3210L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-642));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((-877));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      double double0 = frequency0.getPct('u');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1466);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('&');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((long) 3007);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1169), (-1169), (-1169)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      double double0 = frequency0.getCumPct(3043L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1123));
      double double0 = frequency0.getCumPct((-136L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1169), (-1169), (-1169)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-642));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(1346);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-345L));
      double double0 = frequency0.getCumPct('1');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('u');
      double double0 = frequency0.getCumPct('z');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1806, (-2967), 1, 364).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('E');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      long long1 = frequency0.getCumFreq(1L);
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(1392);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(666, (-1289), (-1289), 666, 666).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue((-873));
      long long0 = frequency0.getCumFreq('n');
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1466);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 3007);
      long long0 = frequency0.getCount(5584);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('t');
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
  public void test_0189()  throws Throwable  {
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
  public void test_0190()  throws Throwable  {
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
  public void test_0191()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('|');
      Integer integer0 = Integer.valueOf(0);
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
  public void test_0192()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      // Undeclared exception!
      try { 
        frequency0.addValue(5L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('d');
      // Undeclared exception!
      try { 
        frequency0.addValue(2548);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      try { 
        frequency0.addValue('r');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3151);
      frequency0.addValue(integer0);
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
  public void test_0196()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 3007);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
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
  public void test_0199()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('u');
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
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
  public void test_0204()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      frequency0.addValue((Object) null);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
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
  public void test_0207()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(8L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(13, 13, 0, (-1146), 691).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('d');
      long long0 = frequency0.getCumFreq('Y');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1007);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 0, (-1146), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nu\t0\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(2527L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1840700269);
      frequency0.addValue(integer0);
      frequency0.addValue((-1123));
      double double0 = frequency0.getCumPct((-136L));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1243));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 0, (-1146), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('u');
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      long long1 = frequency0.getCount('u');
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('u');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('u');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-231));
      Integer integer0 = new Integer((-231));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(354);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1472L));
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-415), (-415)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1168);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-236L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-27), 9).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1168);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct((-1510));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-786));
      double double0 = frequency0.getPct('7');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('V');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-415), (-415), (-415)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1168);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1538), 1, 2342, (-4360), 3678).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      Integer integer0 = new Integer(3155);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-4462L));
      double double0 = frequency0.getCumPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('^');
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('B');
      double double0 = frequency0.getCumPct('=');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct('\'');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('r');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCount(641);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 3024);
      long long0 = frequency0.getCount('c');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-4055L));
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
  public void test_0243()  throws Throwable  {
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
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
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
  public void test_0246()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('*');
      Integer integer0 = new Integer((-875));
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
  public void test_0247()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1332L));
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
      frequency0.addValue('\"');
      // Undeclared exception!
      try { 
        frequency0.addValue(1062);
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
      frequency0.addValue(1L);
      // Undeclared exception!
      try { 
        frequency0.addValue('u');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('M');
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
  public void test_0251()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-972));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-415), (-415), (-415)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1168);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('4');
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
  public void test_0255()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('=');
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1472L));
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(860);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
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
  public void test_0264()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-236L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1538), 1, 2342, (-4360), 3678).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      long long1 = frequency0.getCumFreq((-236L));
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-960));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3678);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1538), 1, 2342, (-4360), (-1145)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('O');
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('D');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('U');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(993);
      Integer integer0 = new Integer(993);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-3783));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2319L));
      double double0 = frequency0.getCumPct(1);
      assertEquals(1.0, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('z');
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1194));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(128);
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('`');
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1194));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1194));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-1194));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getPct('M');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('9');
      double double0 = frequency0.getPct('9');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 487, (-1), 487).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(128);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1291);
      frequency0.addValue((-585L));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('z');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(2175L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1789), (-1789), (-1789)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('@');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('@');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-585L));
      long long0 = frequency0.getCumFreq(1978L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-585L));
      long long0 = frequency0.getCumFreq(343);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('9');
      long long0 = frequency0.getCumFreq('9');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('`');
      long long0 = frequency0.getCount((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-585L));
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('`');
      long long0 = frequency0.getCount('z');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
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
  public void test_0300()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue('R');
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
  public void test_0301()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('o');
      // Undeclared exception!
      try { 
        frequency0.addValue((-3266L));
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
      frequency0.addValue('T');
      // Undeclared exception!
      try { 
        frequency0.addValue(3483);
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
      frequency0.addValue(3L);
      // Undeclared exception!
      try { 
        frequency0.addValue('<');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('z');
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
  public void test_0305()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-448), 2704, 2704, (-448), (-2439)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-421L));
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-421L));
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
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
      frequency0.addValue('R');
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
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
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
  public void test_0314()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('<');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
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
  public void test_0318()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      frequency0.addValue(0L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-521));
      Integer integer0 = new Integer((-521));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(22);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3580));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(655);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-2581L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
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
  public void test_0326()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(638);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(638, (-2234), 638, (-2234), 638).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
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
  public void test_0329()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('=');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('f');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1125L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-3747));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1150);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-807), (-881)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-169L));
      double double0 = frequency0.getPct(5L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-169L));
      double double0 = frequency0.getPct(6L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1717986918, 1684).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('$');
      double double0 = frequency0.getPct(1684);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-627L));
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(816);
      double double0 = frequency0.getPct('3');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(9);
      double double0 = frequency0.getPct('B');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('M');
      Integer integer0 = Integer.valueOf((-1544));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(173);
      double double0 = frequency0.getCumPct((-638L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('?');
      double double0 = frequency0.getCumPct(2497);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1717986918, 1684, 1684, (-1015), 1684).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('$');
      double double0 = frequency0.getCumPct('s');
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getCumPct('s');
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1536));
      long long0 = frequency0.getCumFreq(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1150);
      long long0 = frequency0.getCumFreq('k');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1150);
      long long0 = frequency0.getCount((-2731L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-169L));
      long long0 = frequency0.getCount((-1820));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue((Object) iterator0);
      long long0 = frequency0.getCount('e');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2488L));
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
  public void test_0352()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('6');
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
  public void test_0353()  throws Throwable  {
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
  public void test_0354()  throws Throwable  {
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
  public void test_0355()  throws Throwable  {
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
  public void test_0356()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('H');
      Integer integer0 = new Integer('H');
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
  public void test_0357()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('*');
      // Undeclared exception!
      try { 
        frequency0.addValue(5L);
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
      frequency0.addValue('b');
      // Undeclared exception!
      try { 
        frequency0.addValue((-580));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      // Undeclared exception!
      try { 
        frequency0.addValue('h');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 274, (-1), 1557).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3196, 3196, (-2259)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-169L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 274, (-1), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(9);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
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
  public void test_0368()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2658L);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
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
  public void test_0372()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue((Object) iterator0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1150);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-3829L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      frequency0.addValue((-1198L));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1198\t1\t50%\t50%\n1\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1717986918, 1684, 1684, (-1015), 1684).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('$');
      double double0 = frequency0.getCumPct('s');
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3196, 3196, (-2259)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-169L));
      long long0 = frequency0.getCumFreq((-1924));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue((Object) iterator0);
      Integer integer0 = new Integer(0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(307);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3196, 3196).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-169L));
      Integer integer0 = new Integer((-1));
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1844));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-1024));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1820));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('3');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('e');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-3693L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }
@Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
      frequency0.addValue('P');
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3984));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1848L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('|');
      double double0 = frequency0.getPct((-272));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1789569706, 1789569706).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "osOV'A*JSULt");
      double double0 = frequency0.getPct('/');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-243));
      double double0 = frequency0.getPct('F');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1148);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((long) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-243));
      double double0 = frequency0.getCumPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1148);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('1');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      double double0 = frequency0.getCumPct('z');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1865);
      long long0 = frequency0.getCumFreq((long) 1865);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1316L);
      long long0 = frequency0.getCumFreq((-158));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2827);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('E');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
      long long0 = frequency0.getCount(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-243));
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(3428);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('K');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-618));
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
  public void test_0410()  throws Throwable  {
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
  public void test_0411()  throws Throwable  {
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
  public void test_0412()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(':');
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
  public void test_0413()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('I');
      // Undeclared exception!
      try { 
        frequency0.addValue(514L);
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
      frequency0.addValue('2');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2457));
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
      doReturn(9, 1431655765, 1, 1431655765, (-2445)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(1);
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1117);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('J');
      Integer integer0 = new Integer(5034);
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
      frequency0.addValue(806);
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
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('A');
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
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
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1117);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-241L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1789569706, 1789569706, 1789569706, (-1726), 1442).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "osOV'A*JSULt");
      long long0 = frequency0.getCumFreq((Object) "osOV'A*JSULt");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2379);
      double double0 = frequency0.getCumPct((-1728));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1789569706, 1789569706, 1789569706, (-1726), (-1726)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "osOV'A*JSULt");
      long long0 = frequency0.getCumFreq((Object) "osOV'A*JSULt");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      String string0 = frequency0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1544));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1133));
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.addValue('&');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(9);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      frequency0.addValue((-2484));
      double double0 = frequency0.getCumPct((long) (-2484));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('T');
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
  public void test_0440()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('Y');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('J');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(131);
      assertEquals(0L, long0);
  }
}
