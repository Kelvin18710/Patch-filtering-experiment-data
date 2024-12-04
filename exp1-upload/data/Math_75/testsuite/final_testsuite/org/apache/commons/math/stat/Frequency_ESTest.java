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
      frequency0.addValue('-');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1434));
      frequency0.addValue('H');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1434\t2\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1434));
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('c');
      double double0 = frequency0.getPct((-196));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(10);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 0);
      double double0 = frequency0.getPct('F');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1099);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-6));
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((-2634L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1453));
      double double0 = frequency0.getCumPct(2549L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct((-3129));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1164);
      double double0 = frequency0.getCumPct(1164);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('{');
      double double0 = frequency0.getCumPct('a');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct('~');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1130, 59, 1, 1130).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((long) 959);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2789));
      long long0 = frequency0.getCumFreq((-1012));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-30));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('/');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(']');
      long long0 = frequency0.getCount((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount((-2818));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount('|');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('I');
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
  public void test_0022()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('L');
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
  public void test_0023()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('J');
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
  public void test_0024()  throws Throwable  {
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
  public void test_0025()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('w');
      Integer integer0 = new Integer(10);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
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
  public void test_0028()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
      Integer integer0 = new Integer(2398);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Integer not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('Z');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) 'Z');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('2');
      // Undeclared exception!
      try { 
        frequency0.addValue(2484);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(31);
      // Undeclared exception!
      try { 
        frequency0.addValue('i');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Long long0 = new Long(0L);
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 2181);
      Integer integer0 = new Integer((-2608));
      frequency0.addValue(integer0);
      long long1 = frequency0.getCumFreq((Object) long0);
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(66, (-362), (-362), (-362)).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('L');
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('+');
      Integer integer0 = new Integer(1610612736);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1130, 59).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer('f');
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
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
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable1);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-13L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1676), 31, (-1676), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('h');
      long long0 = frequency0.getCumFreq('h');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "`x|");
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (org.apache.commons.math.stat.Frequency) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Long long0 = new Long(0L);
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 2181);
      long long1 = frequency0.getCumFreq((Object) long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(822);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1277, 1277, 1277, 2181, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('h');
      double double0 = frequency0.getPct(2L);
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1277).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('h');
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('b');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(3672L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2179);
      Integer integer0 = new Integer((-811));
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1717986918);
      frequency0.addValue((long) (-1));
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2245, (-394), (-394), 31, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
      
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      frequency0.addValue('8');
      double double0 = frequency0.getPct('5');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-327));
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('?');
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1453));
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      double double0 = frequency0.getPct(630L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1453));
      double double0 = frequency0.getPct((-365));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1723), (-1723)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('m');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('F');
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1776, 1776, 1776, (-3143), 1776).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((-2884L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(289L);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1723), (-1723), (-1723)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct('T');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('H');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((-519));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq('M');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      long long0 = frequency0.getCount((-80));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount('l');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
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
      frequency0.addValue((-1011));
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
  public void test_0088()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1453));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1453), (-2341)).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct((long) (-1453));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
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
  public void test_0092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('|');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n|\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
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
      Frequency frequency0 = new Frequency();
      frequency0.addValue('e');
      // Undeclared exception!
      try { 
        frequency0.addValue(1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('-');
      // Undeclared exception!
      try { 
        frequency0.addValue((int) '-');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(894L);
      // Undeclared exception!
      try { 
        frequency0.addValue('n');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31, (-1), 31, (-2093)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('F');
      long long0 = frequency0.getCount((-2660L));
      Object object0 = new Object();
      long long1 = frequency0.getCumFreq(object0);
      assertTrue(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('a');
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
  public void test_0101()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1219);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      frequency0.addValue(1219);
      long long0 = frequency0.getCount((Object) iterator0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
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
  public void test_0107()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2245).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(10);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2L);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('F');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(673, 673, 0, (-531), 673).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('V');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1762));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-419));
      frequency0.addValue((Object) integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2063);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1702));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('|');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n|\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('t');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((long) 926);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-394));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-546L));
      frequency0.addValue(4L);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }
@Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1431655765);
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(260);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-608));
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('B');
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('>');
      double double0 = frequency0.getPct(982L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('R');
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-387L));
      double double0 = frequency0.getPct((-1373));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
      double double0 = frequency0.getPct(':');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(':');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('-');
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(4003L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-608));
      double double0 = frequency0.getCumPct((-939));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-387L));
      double double0 = frequency0.getCumPct('0');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('n');
      double double0 = frequency0.getCumPct('r');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-387L));
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((-641));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(':');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCount((-333L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1L));
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1073741824).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1839);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(';');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
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
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('n');
      Integer integer0 = new Integer((-342));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
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
  public void test_0156()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1599L));
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1599\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('g');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1343L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('!');
      // Undeclared exception!
      try { 
        frequency0.addValue(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-147));
      // Undeclared exception!
      try { 
        frequency0.addValue('X');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-98), (-98), (-98)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('*');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(678);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
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
  public void test_0166()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
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
  public void test_0170()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-641));
      frequency0.addValue(integer0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue((-387L));
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1777));
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1128L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue('X');
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-40), 3017, 788, (-1), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('*');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1431655765);
      long long0 = frequency0.getCumFreq(1161);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-40), 3017, 788, (-1), 788).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('*');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('f');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nf\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-10));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (org.apache.commons.math.stat.Frequency) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(1702L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('{');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('|');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(31);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((int) 'F');
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
  public void test_0195()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('G');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-77));
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2482));
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1431655765);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(455);
      double double0 = frequency0.getPct(455);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('`');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(624);
      double double0 = frequency0.getPct('9');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2643);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2006);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-1634L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(522);
      double double0 = frequency0.getCumPct((-263L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10, 10, 10).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(31);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(174);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2334, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('d');
      double double0 = frequency0.getCumPct('y');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('H');
      double double0 = frequency0.getCumPct('Y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1694));
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('3');
      long long0 = frequency0.getCumFreq('l');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('m');
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount((-2232));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2643);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('b');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4L);
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
  public void test_0216()  throws Throwable  {
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
  public void test_0217()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      Integer integer0 = new Integer((-2729));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
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
  public void test_0220()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('$');
      // Undeclared exception!
      try { 
        frequency0.addValue(2L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('x');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1226));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3247);
      // Undeclared exception!
      try { 
        frequency0.addValue('f');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
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
  public void test_0227()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2334, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('d');
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('d');
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-573));
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
  public void test_0230()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1831));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('R');
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(25, 71, 1850, (-571), 2325).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-571), (-1161), 0, (-571), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-477));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer('I');
      frequency0.addValue((Object) integer0);
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((-33));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1638);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('d');
      double double0 = frequency0.getCumPct(449);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('I');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('i');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-134L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2154));
      frequency0.addValue(6L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-2154\t1\t50%\t50%\n6\t1\t50%\t100%\n", string0);
  }
@Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1196));
      frequency0.addValue(integer0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-512));
      frequency0.addValue((-790));
      double double0 = frequency0.getCumPct((long) (-790));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1201, 1201, 795, 1201).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('E');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1500L);
      double double0 = frequency0.getPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2136), (-2136)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(4228L);
      double double0 = frequency0.getPct((long) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1196));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(2875);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1570L));
      double double0 = frequency0.getPct((-608));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('?');
      double double0 = frequency0.getPct('E');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(3506);
      double double0 = frequency0.getPct('b');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('E');
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      double double0 = frequency0.getCumPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2136), (-2136), (-2136)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(4228L);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1676));
      double double0 = frequency0.getCumPct((long) (-1676));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1749L);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1570L));
      double double0 = frequency0.getCumPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(4);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('t');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1198);
      long long0 = frequency0.getCumFreq((long) 1198);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = Integer.getInteger("", 10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(10);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('`');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(4228L);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount('\\');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(999L);
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
  public void test_0283()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-362L));
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
  public void test_0284()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue((-1484));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1484), (-996)).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct(0L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('@');
      Integer integer0 = new Integer((-244));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
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
  public void test_0288()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3576);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "org.apache.commons.math.MathRuntimeException$6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('s');
      // Undeclared exception!
      try { 
        frequency0.addValue(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\\');
      // Undeclared exception!
      try { 
        frequency0.addValue(1198);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      // Undeclared exception!
      try { 
        frequency0.addValue('D');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1907, (-1), 1907, (-2362), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1468), 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(31);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-544));
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
  public void test_0297()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1497L);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
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
  public void test_0304()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(129);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('?');
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1678L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1201).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator0);
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-272), (-1592), 1918, (-272), (-272)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct(9);
      assertEquals(Double.NaN, double0, 0.01);
      
      frequency0.addValue(1749L);
      frequency0.addValue(10);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n1749\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-38));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Integer integer0 = new Integer(236);
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((long) 't');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-3141));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1408), 1088, 1088, (-1408), 1088).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('i');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('\\');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1196));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-244));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('#');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(834L);
      frequency0.addValue((-1412));
      double double0 = frequency0.getCumPct((-880));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(78);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1121)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct(3L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3453), (-3453), (-3453), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Comparable<Frequency> comparable1 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable1);
      double double0 = frequency0.getPct((long) 0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3121L);
      double double0 = frequency0.getPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(78);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(78);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1493);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('F');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1926);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(78);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-2264));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1412));
      double double0 = frequency0.getCumPct((-880));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('!');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2638);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('z');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-214L));
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2638);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(195);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2638);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('t');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(comparable0).compareTo(any());
      frequency0.addValue('6');
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.shaded.org.mockito.codegen.Comparable$MockitoMock$1313418252 cannot be cast to java.lang.Character
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1610612736);
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
  public void test_0348()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(' ');
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
  public void test_0349()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('o');
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
  public void test_0350()  throws Throwable  {
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
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      Integer integer0 = new Integer(1610612736);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('?');
      // Undeclared exception!
      try { 
        frequency0.addValue(1L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      // Undeclared exception!
      try { 
        frequency0.addValue((-955));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1139);
      // Undeclared exception!
      try { 
        frequency0.addValue('f');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
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
      doReturn((-3453), (-3453), (-3453)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(78);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1073741824);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1785));
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1493);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator0);
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1121), 9, (-1412), 9).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((long) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3219));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(42);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (org.apache.commons.math.stat.Frequency) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1398L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n1398\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      long long0 = frequency0.getCumFreq('x');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(4L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
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
  public void test_0383()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-2315));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1360), (-1360), 1925, 1925, (-1360)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      long long1 = frequency0.getCumFreq(object0);
      assertTrue(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('C');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('b');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }
@Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4L);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1545));
      frequency0.addValue((-4));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1545\t1\t50%\t50%\n-4\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue((-3268L));
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Integer integer0 = new Integer(4612);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3831L);
      double double0 = frequency0.getPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2330);
      double double0 = frequency0.getPct((long) 2330);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1610612736, 1610612736).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('W');
      double double0 = frequency0.getPct(295);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-931));
      double double0 = frequency0.getPct((-931));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('L');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1865L));
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2794L);
      double double0 = frequency0.getCumPct((-1183L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((long) 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((-1530));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1545));
      double double0 = frequency0.getCumPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-931));
      double double0 = frequency0.getCumPct('$');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1409));
      long long0 = frequency0.getCumFreq(5L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-931));
      long long0 = frequency0.getCumFreq('$');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(628L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 0);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1865L));
      long long0 = frequency0.getCount('Y');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(1717986918, 1717986918).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct(0L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(1717986918, 411).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1920), 1789569706, 4139).when(comparable0).compareTo(any());
      frequency0.addValue((long) 4139);
      frequency0.addValue(52L);
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq(389L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1920), (-1920)).when(comparable0).compareTo(any());
      frequency0.addValue((-1L));
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
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
  public void test_0419()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
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
  public void test_0422()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('l');
      // Undeclared exception!
      try { 
        frequency0.addValue(460L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(',');
      // Undeclared exception!
      try { 
        frequency0.addValue(2035);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2254L);
      // Undeclared exception!
      try { 
        frequency0.addValue('9');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('O');
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
  public void test_0428()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-660), 2610, 2610, 2610, (-660)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1865L));
      frequency0.getCount('Y');
      double double0 = frequency0.getPct('l');
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1865L));
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(')');
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
  public void test_0431()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2673);
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
  public void test_0433()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue('W');
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue('#');
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(9, (-801), 168, (-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(496);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      frequency0.equals(frequency1);
      frequency1.getCumPct(1942);
      frequency0.getCumFreq('S');
      frequency0.getCumPct(0L);
      frequency0.getCount((Object) frequency1);
      frequency1.getPct('0');
      frequency1.addValue(0L);
      frequency0.hashCode();
      frequency1.getCumPct('l');
      frequency1.getSumFreq();
      frequency0.getCumFreq(28L);
      Object object0 = new Object();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-2329), (-2329), 0, 0, 0).when(comparable0).compareTo(any());
      doReturn((String) null).when(comparable0).toString();
      frequency1.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency1.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2166);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2166);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1378));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(38);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(9, (-801), 168, (-1), 38).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(496);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('5');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('+');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2016));
      double double0 = frequency0.getCumPct((-412L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue(0);
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(317);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(' ');
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('z');
      double double0 = frequency0.getPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(684);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-903));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct('H');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(684);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('x');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3145);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('E');
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-195L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
      double double0 = frequency0.getCumPct(593);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1429L));
      double double0 = frequency0.getCumPct('1');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(684);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('x');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2086);
      long long0 = frequency0.getCumFreq(2086);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('0');
      long long0 = frequency0.getCumFreq('F');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2517);
      long long0 = frequency0.getCount((long) 2517);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(10);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(3545);
      long long0 = frequency0.getCount('I');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('2');
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-4477), (-1054), 0, 0, 0).when(comparable0).compareTo(any());
      doReturn((String) null).when(comparable0).toString();
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1051L);
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
  public void test_0479()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('~');
      Integer integer0 = new Integer((-2747));
      // Undeclared exception!
      try { 
        frequency0.addValue(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
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
  public void test_0482()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('z');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('t');
      // Undeclared exception!
      try { 
        frequency0.addValue(4L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('Y');
      // Undeclared exception!
      try { 
        frequency0.addValue(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1029));
      // Undeclared exception!
      try { 
        frequency0.addValue('$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
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
  public void test_0489()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1443, 3395, 3395, (-1060), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1036), 9, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('i');
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-291));
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
  public void test_0494()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
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
  public void test_0498()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('2');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('2');
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(684);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(5L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1442));
      frequency0.addValue(integer0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1443, 1443, 1443, (-1060), 1443).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1442));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((long) (-4649));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1245);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('E');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nE\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1442));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1321);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('k');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('e');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(161);
      assertEquals(0L, long0);
  }
}
