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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-918L));
      Integer integer0 = new Integer(1876);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('F');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((Object) null);
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-28));
      double double0 = frequency0.getPct(7L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(381);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(0);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getPct('O');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-1869L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct((long) 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('b');
      double double0 = frequency0.getCumPct(10);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-918L));
      double double0 = frequency0.getCumPct(3253);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct('P');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-3578L));
      double double0 = frequency0.getCumPct('x');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq(2L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-918L));
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq('*');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-918L));
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-918L));
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1681));
      long long0 = frequency0.getCount('{');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
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
  public void test_0021()  throws Throwable  {
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
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
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
  public void test_0024()  throws Throwable  {
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
  public void test_0025()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('u');
      Integer integer0 = new Integer(9);
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
  public void test_0026()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('n');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) 'n');
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
      frequency0.addValue('x');
      // Undeclared exception!
      try { 
        frequency0.addValue((-417));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-44L));
      // Undeclared exception!
      try { 
        frequency0.addValue('q');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value not comparable to existing values.
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3668), (-3668), 9, (-3668), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3668), (-3668), 9, (-3668), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-207), (-2955), (-207)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue('2');
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
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
  public void test_0037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2L);
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
  public void test_0038()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.addValue((-3578L));
      long long0 = frequency0.getCount((Object) iterator0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-612), 1, 1, (-25), 745).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3146);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('~');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n~\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-28));
      frequency0.addValue((long) (-630));
      Integer integer0 = new Integer((-630));
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('K');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('l');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-1321));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 2752);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('#');
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1620));
      double double0 = frequency0.getPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      double double0 = frequency0.getPct(1120);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(10);
      double double0 = frequency0.getPct('q');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      double double0 = frequency0.getPct('n');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Integer integer1 = new Integer((-333));
      double double0 = frequency0.getCumPct((Object) integer1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct((-4674L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3431));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2752, (-1638), 2752, (-1638), (-174)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      double double0 = frequency0.getCumPct((-1638));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('#');
      double double0 = frequency0.getCumPct((-1349));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1620));
      double double0 = frequency0.getCumPct('2');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      double double0 = frequency0.getCumPct('v');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('#');
      long long0 = frequency0.getCumFreq('#');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('#');
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCount(1120);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCount('S');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
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
  public void test_0077()  throws Throwable  {
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
  public void test_0078()  throws Throwable  {
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
  public void test_0079()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3404);
      frequency0.addValue('f');
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
  public void test_0080()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('=');
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
  public void test_0081()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('R');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1328));
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
      frequency0.addValue(831L);
      // Undeclared exception!
      try { 
        frequency0.addValue('q');
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
      frequency0.addValue(0);
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
  public void test_0084()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2752, (-1638), 2752, (-1638), (-174)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3217, (-1), (-311)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\\');
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
  public void test_0089()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('7');
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
  public void test_0091()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) null);
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nnull\t1\t100%\t100%\n");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
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
  public void test_0095()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2752, (-1638), 2752, (-1638), 1502).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(object0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(10);
      long long0 = frequency0.getCumFreq(9);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(4930);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(2L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(9);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-2127));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('X');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('S');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('E');
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4L);
      frequency0.addValue(0L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n4\t1\t50%\t100%\n", string0);
  }
}
