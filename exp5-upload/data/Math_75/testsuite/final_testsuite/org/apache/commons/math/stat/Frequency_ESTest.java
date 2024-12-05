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
      frequency0.addValue((-1L));
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      frequency0.addValue(48);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1033);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      double double0 = frequency0.getPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-48)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((long) (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-286));
      frequency0.addValue(12L);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(88L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(587L);
      double double0 = frequency0.getPct(723);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\"');
      double double0 = frequency0.getPct('1');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('V');
      double double0 = frequency0.getPct('[');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Object object0 = new Object();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(587L);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-427));
      double double0 = frequency0.getCumPct((-1188L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct(2701L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4780L);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('A');
      double double0 = frequency0.getCumPct(2805);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1033);
      double double0 = frequency0.getCumPct('c');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1442L));
      double double0 = frequency0.getCumPct('K');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1789569706, 1789569706, 1272, (-460), 1789569706).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('A');
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
      
      long long1 = frequency0.getCumFreq(3421);
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31, 31, (-2655), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) (-2655));
      long long0 = frequency0.getCumFreq(465L);
      assertEquals(0L, long0);
      
      long long1 = frequency0.getCumFreq('n');
      assertEquals(1L, long1);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('V');
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      long long0 = frequency0.getCount(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('A');
      long long0 = frequency0.getCount('`');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
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
      frequency0.addValue(3L);
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
  public void test_0026()  throws Throwable  {
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
  public void test_0027()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\"');
      // Undeclared exception!
      try { 
        frequency0.addValue(5L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('U');
      // Undeclared exception!
      try { 
        frequency0.addValue(2929);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
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
  public void test_0030()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('S');
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
  public void test_0032()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-48), 1, 1, (-4995)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      frequency0.addValue(1);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('A');
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue('8');
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
  public void test_0035()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
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
  public void test_0037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1781);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(4333);
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
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable1);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency((Comparator) null);
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-417));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(616);
      frequency0.addValue((Comparable<?>) integer0);
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
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
  public void test_0053()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-3974));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-2066), 1, (-455), 0).when(comparator1).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator1);
      Integer integer0 = new Integer(1789569628);
      frequency1.addValue(integer0);
      long long0 = frequency1.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2066)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('V');
      Frequency frequency1 = new Frequency((Comparator) null);
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(' ');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('q');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(5L);
      double double0 = frequency0.getPct(754);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(31);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq(4L);
      assertEquals(1L, long0);
  }
@Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(400);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(29);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(1326);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      frequency0.addValue(1L);
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-798)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(915L);
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(29);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((long) 1326);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      double double0 = frequency0.getPct((long) 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-696));
      double double0 = frequency0.getPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3180);
      double double0 = frequency0.getPct(3180);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(9, 1550).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) null);
      double double0 = frequency0.getPct('\"');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1154L));
      double double0 = frequency0.getPct('L');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3180);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('c');
      double double0 = frequency0.getCumPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-593));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1154L));
      double double0 = frequency0.getCumPct('L');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(778L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1154L));
      long long0 = frequency0.getCumFreq('L');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1154L));
      long long0 = frequency0.getCount(1337L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('f');
      long long0 = frequency0.getCount('N');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3088));
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
  public void test_0085()  throws Throwable  {
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
  public void test_0086()  throws Throwable  {
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
  public void test_0087()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3908L);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n3908\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
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
  public void test_0089()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('!');
      // Undeclared exception!
      try { 
        frequency0.addValue((long) '!');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('M');
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
  public void test_0091()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(236);
      // Undeclared exception!
      try { 
        frequency0.addValue('\"');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-142L));
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
  public void test_0094()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(42, (-1969), 1, (-1969), 2179).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Comparable<?>) null);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-88), 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(915L);
      long long0 = frequency0.getCumFreq('C');
      long long1 = frequency0.getCumFreq(object0);
      //  // Unstable assertion: assertTrue(long1 == long0);
      //  // Unstable assertion: assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-88), (-1853), 1, (-1), (-1067)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(915L);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(400);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('-');
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
  public void test_0099()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('f');
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1855);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3180);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(400);
      frequency0.addValue((Comparable<?>) null);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue((-1210));
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(4114, 4114, 4114, (-1727), 2575).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1818));
      double double0 = frequency0.getCumPct('X');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-6960));
      frequency0.addValue(1);
      double double0 = frequency0.getCumPct((-1289));
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(349L);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1225L));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1225\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nMock for Comparable, hashCode: 418133194\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
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
  public void test_0120()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1035L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(881);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      Integer integer0 = new Integer((-481));
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
  public void test_0124()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('M');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(146);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-2353));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
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
  public void test_0129()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1233L));
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1237));
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('U');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct(';');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getCumPct((-1774L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('{');
      double double0 = frequency0.getCumPct(4L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((-2621));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) (-1));
      double double0 = frequency0.getCumPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(3439);
      double double0 = frequency0.getCumPct('^');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2004));
      long long0 = frequency0.getCumFreq((-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('{');
      long long0 = frequency0.getCumFreq('{');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2488, 926).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue((Object) comparable0);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount('~');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1709L);
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
      frequency0.addValue((-2741));
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
  public void test_0147()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1955L));
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
  public void test_0148()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      frequency0.getCumFreq((-894));
      frequency0.getCumPct(object0);
      frequency0.addValue((-679L));
      frequency0.addValue((-1));
      frequency0.clear();
      long long0 = frequency0.getCumFreq(31);
      assertEquals(0L, long0);
      
      double double1 = frequency0.getCumPct((Object) null);
      assertEquals(double1, double0, 0.01);
      
      frequency0.addValue((-679L));
      frequency0.valuesIterator();
      frequency0.getSumFreq();
      double double2 = frequency0.getPct(2017);
      assertEquals(0.0, double2, 0.01);
      
      frequency0.addValue((-1));
      frequency0.getPct(496L);
      double double3 = frequency0.getPct(object0);
      assertEquals(0.0, double3, 0.01);
      
      frequency0.addValue(1L);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-308), 0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      long long1 = frequency0.getCumFreq(2L);
      assertEquals(3L, long1);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
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
  public void test_0150()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
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
  public void test_0151()  throws Throwable  {
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
  public void test_0152()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
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
  public void test_0154()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('.');
      // Undeclared exception!
      try { 
        frequency0.addValue((-591L));
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
      frequency0.addValue('L');
      // Undeclared exception!
      try { 
        frequency0.addValue((-48));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2741));
      // Undeclared exception!
      try { 
        frequency0.addValue('O');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('%');
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2297, 0, 1, (-499), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1442), (-1442), (-3159)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-611), (-1), 9, (-1), 9).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('y');
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
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
  public void test_0165()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2454);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('{');
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(574L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Frequency> comparator1 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator1);
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(704);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-595));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
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
  public void test_0179()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-595));
      frequency0.addValue(integer0);
      frequency0.addValue(1L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-595\t1\t50%\t50%\n1\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('^');
      double double0 = frequency0.getCumPct('E');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('i');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('P');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1269));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-458L));
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      Integer integer0 = new Integer(9);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('X');
      double double0 = frequency0.getPct(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('9');
      double double0 = frequency0.getPct(1546);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1817), (-1817)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct(')');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2013, 2013).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('+');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-458L));
      double double0 = frequency0.getCumPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer(267);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(100);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(182);
      double double0 = frequency0.getCumPct('+');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('3');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(435);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq('Q');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-458L));
      long long0 = frequency0.getCount((-458L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('9');
      long long0 = frequency0.getCount(1546);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount('\"');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
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
  public void test_0206()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2L);
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
  public void test_0207()  throws Throwable  {
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
  public void test_0208()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('$');
      Integer integer0 = new Integer((-727));
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
  public void test_0209()  throws Throwable  {
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
  public void test_0210()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1332);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n1332\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
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
  public void test_0212()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('8');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('#');
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
  public void test_0214()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1826);
      // Undeclared exception!
      try { 
        frequency0.addValue('j');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1817), (-1817), (-1817)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2013, 2013, 1, (-233)).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2229L));
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
  public void test_0220()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('9');
      long long0 = frequency0.getCount((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
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
  public void test_0225()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('9');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10).when(comparator0).compare(any() , any());
      Frequency frequency1 = new Frequency(comparator0);
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue(2545L);
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator0);
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(434, 434, 434, (-857), 434).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((long) (-857));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10, 1996, (-996), (-996)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(2545L);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      long long0 = frequency0.getCumFreq((Object) iterator0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
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
  public void test_0238()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('B');
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('Q');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('F');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-1998L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(42);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2545L);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3216);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n3216\t1\t100%\t100%\n", string0);
  }
@Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4400));
      frequency0.addValue(integer0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(1);
      double double0 = frequency0.getCumPct(9);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1073741824);
      frequency0.addValue((-433));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-433\t1\t50%\t50%\n1073741824\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1346L);
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct((Object) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(3085);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-2609));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3489));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-3489));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('+');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('/');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(473);
      double double0 = frequency0.getCumPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n473\t1\t100%\t100%\n");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-2838L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct(31);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1073741824);
      double double0 = frequency0.getCumPct('_');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('I');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(82);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(31);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      long long0 = frequency0.getCumFreq(')');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount(31);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(82);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('U');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
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
  public void test_0270()  throws Throwable  {
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
  public void test_0271()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('9');
      Integer integer0 = new Integer(815);
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
  public void test_0272()  throws Throwable  {
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
  public void test_0273()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \nj\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
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
  public void test_0275()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('[');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
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
  public void test_0277()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(82);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
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
  public void test_0280()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-517));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
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
  public void test_0283()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Frequency> comparator1 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-433), (-56)).when(comparator1).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency1 = new Frequency(comparator1);
      frequency1.addValue(31);
      long long0 = frequency1.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
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
  public void test_0287()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-937L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue((-1660));
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency(comparator1);
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1), (-1), 1073741824, (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('i');
      Object object0 = new Object();
      double double0 = frequency0.getPct((long) 1073741824);
      assertEquals(0.0, double0, 0.01);
      
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), 1073741824, 2117, (-1), 1578).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue((-1));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('X');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4400));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(485);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((long) 485);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
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
  public void test_0303()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-3445L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('X');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount('U');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1549);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(31);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      try { 
        frequency0.addValue('[');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
@Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2511L));
      Integer integer0 = new Integer(9);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(757);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2923), 0, 0, (-2923)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1992);
      double double0 = frequency0.getPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(5805);
      double double0 = frequency0.getPct(2051);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(0);
      double double0 = frequency0.getPct('S');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2629));
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(1992);
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 'd');
      double double0 = frequency0.getCumPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-40L));
      double double0 = frequency0.getCumPct(1717986918);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue(31);
      double double0 = frequency0.getCumPct('y');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(354);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('y');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((-1530L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(9);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-28L));
      long long0 = frequency0.getCumFreq(' ');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4951);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(1352L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-2511L));
      long long0 = frequency0.getCount(907);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('<');
      long long0 = frequency0.getCount('~');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-490));
      frequency0.addValue(integer0);
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
  public void test_0333()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2629));
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-2629)).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumFreq((-2629));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
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
  public void test_0335()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('J');
      Integer integer0 = new Integer((-3408));
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
  public void test_0336()  throws Throwable  {
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
  public void test_0337()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 'd');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
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
  public void test_0339()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('e');
      // Undeclared exception!
      try { 
        frequency0.addValue((-584L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('7');
      // Undeclared exception!
      try { 
        frequency0.addValue((-933));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      // Undeclared exception!
      try { 
        frequency0.addValue('.');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-4088));
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
  public void test_0344()  throws Throwable  {
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-1847), 1546, (-1847), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-620L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(92, (-1167), 401, 401, (-1167)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      frequency0.addValue('6');
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4951);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-490));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-28L));
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
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
  public void test_0353()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-593L));
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue(0L);
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-17));
      double double0 = frequency0.getCumPct((-863));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, (-1847), 1546, (-1847), 10).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-620L));
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(674);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
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
  public void test_0368()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      frequency0.addValue(comparable0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nnull\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-2274));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('*');
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
  public void test_0372()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('t');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('C');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(504);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(10);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((long) 0);
      assertEquals(0.5, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-103));
      frequency0.addValue((-865L));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-865\t1\t50%\t50%\n-103\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3761L));
      Object object0 = new Object();
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1709);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((long) 1709);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1929, 11).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct(11);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3761L));
      double double0 = frequency0.getPct('6');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(31, 31).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('1');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3204));
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      double double0 = frequency0.getCumPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1018), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 871);
      double double0 = frequency0.getCumPct((long) 871);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 1562, (-1597), (-1597)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1449), 0, 0, (-1449), 1078).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct(1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getCumPct('t');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1451L);
      long long0 = frequency0.getCumFreq(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(944, (-1), (-1), 772, 944).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency0.addValue((-1599));
      long long0 = frequency0.getCumFreq('t');
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue((long) 1);
      long long0 = frequency0.getCount((long) 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1L));
      long long0 = frequency0.getCount(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount('m');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-5334));
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
  public void test_0396()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1449));
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
  public void test_0397()  throws Throwable  {
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
  public void test_0398()  throws Throwable  {
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
  public void test_0399()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(944);
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
  public void test_0400()  throws Throwable  {
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
  public void test_0401()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('@');
      // Undeclared exception!
      try { 
        frequency0.addValue((-4128L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('Q');
      // Undeclared exception!
      try { 
        frequency0.addValue((-4645));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      // Undeclared exception!
      try { 
        frequency0.addValue('6');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-267), 929, 929, 929, (-1762)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct((long) 0);
      assertEquals(0.0, double0, 0.01);
      
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-977), (-977), 3683, (-977), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 871);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct((long) 871);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-1018), (-1)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 871);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-946));
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
  public void test_0410()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1929, 11, 11, 11).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1929);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((long) 871);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      long long0 = frequency0.getCount((Object) iterator0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
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
  public void test_0416()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1709);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1535);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(541);
      frequency0.addValue(integer0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1827, (-445), 0, (-445), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(633);
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
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
  public void test_0430()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(14);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-452));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('.');
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
  public void test_0433()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('#');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('+');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(541);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(31);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      frequency0.addValue(1L);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(4L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(633);
      frequency0.addValue(1L);
      long long0 = frequency0.getCumFreq(31);
      assertEquals(1L, long0);
  }
@Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1);
      frequency0.addValue(1);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(430);
      frequency0.addValue((Object) integer0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(902L);
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(770);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-163L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct((-2514));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(770);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(770);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      double double0 = frequency0.getPct('Q');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(2821);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct('N');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2591, 2591, 2591, 2591, (-1162)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(669);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((-955L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(31);
      double double0 = frequency0.getCumPct(4345L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct(10);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(902L);
      double double0 = frequency0.getCumPct('L');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(770);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('\\');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq((-2640L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(770);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(770);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq('R');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(902L);
      long long0 = frequency0.getCount(902L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      long long0 = frequency0.getCount('*');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
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
      frequency0.addValue(2471);
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
  public void test_0462()  throws Throwable  {
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
  public void test_0463()  throws Throwable  {
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
  public void test_0464()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('1');
      Integer integer0 = new Integer(1073741824);
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
  public void test_0465()  throws Throwable  {
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
  public void test_0466()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \nD\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      try { 
        frequency0.addValue(390L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('v');
      // Undeclared exception!
      try { 
        frequency0.addValue((int) 'v');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1527);
      // Undeclared exception!
      try { 
        frequency0.addValue('@');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
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
      doReturn((-617), 9, 9, (-617), (-617)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(114L);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2591, 2591, 2591, 2591, (-1162)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(669);
      frequency0.addValue(0);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      long long0 = frequency0.getCumFreq((Object) iterator0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(669);
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
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
  public void test_0475()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2016);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('l');
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
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
      long long0 = frequency0.getCount((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(948, 948, 948, (-3187), 948).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(114L);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      frequency0.addValue('');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \nD\t1\t50%\t50%\n\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(768);
      double double0 = frequency0.getCumPct(10);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
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
  public void test_0495()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('+');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('\'');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((-2803L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq(1431655765);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1466));
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1379);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-1387));
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-958));
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      double double0 = frequency0.getPct((Object) iterator0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-958));
      double double0 = frequency0.getPct((-1L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1847);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1251);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1051, 0, 0, (-3136), 3041).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
      
      double double0 = frequency0.getPct('c');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(132);
      double double0 = frequency0.getPct('f');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0L);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer(526);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1301));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((long) (-1301));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
      double double0 = frequency0.getCumPct((-3));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1301));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct('(');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3984, 10, 3984, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('Z');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq(2654L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3041, 3041, 3041, 3041).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCumFreq('@');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(10);
      long long0 = frequency0.getCount(10);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(1847);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('8');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(775);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-2558)).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      // Undeclared exception!
      try { 
        frequency0.getCumPct(972L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.getCumFreq('@');
      frequency0.clear();
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      Object object1 = new Object();
      frequency0.addValue(775);
      Long long1 = new Long(0L);
      frequency0.valuesIterator();
      Integer integer0 = new Integer(775);
      frequency0.addValue(integer0);
      frequency0.addValue((-912));
      frequency0.valuesIterator();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-2558), 0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      Comparable<Frequency> comparable1 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-1320), 1).when(comparable1).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable1);
      frequency0.getCount(0L);
      double double0 = frequency0.getPct((-593));
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getCumPct((-912));
      assertEquals(0.5, double1, 0.01);
      
      frequency0.addValue(integer0);
      frequency0.hashCode();
      long long2 = (-682L);
      double double2 = frequency0.getCumPct(long2);
      assertEquals(0.42857142857142855, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
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
  public void test_0527()  throws Throwable  {
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
  public void test_0528()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(' ');
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
  public void test_0529()  throws Throwable  {
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
  public void test_0530()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-764));
      frequency0.addValue(integer0);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-764\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
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
  public void test_0532()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('p');
      // Undeclared exception!
      try { 
        frequency0.addValue(8L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('@');
      // Undeclared exception!
      try { 
        frequency0.addValue((-2274));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(745L);
      // Undeclared exception!
      try { 
        frequency0.addValue('~');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(27);
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
  public void test_0537()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1051, 0, 0, (-3136), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3984, 10, 3984, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2862), (-2862), (-2862)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1318);
      long long0 = frequency0.getCumFreq((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
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
  public void test_0541()  throws Throwable  {
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
  public void test_0542()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-79), (-79)).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(1L);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1451));
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1338);
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency1.addValue(1L);
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      boolean boolean0 = frequency0.equals(iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-711));
      frequency0.addValue(integer0);
      frequency0.addValue(310L);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-711\t1\t50%\t50%\n310\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(3L);
      long long0 = frequency0.getCumFreq((-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-764));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
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
  public void test_0558()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(10);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('u');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-4054L));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.addValue((-169L));
      double double0 = frequency0.getPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      frequency0.addValue(0);
      double double0 = frequency0.getPct(object0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('C');
      double double0 = frequency0.getPct(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4345);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getPct(831);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2533);
      double double0 = frequency0.getPct('w');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('c');
      double double0 = frequency0.getPct('c');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-465));
      Object object0 = new Object();
      double double0 = frequency0.getCumPct(object0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1250));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(9);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((-776L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-169L));
      double double0 = frequency0.getCumPct((long) 1649);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(']');
      double double0 = frequency0.getCumPct((int) ']');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct((-1660));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-169L));
      double double0 = frequency0.getCumPct('m');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0);
      double double0 = frequency0.getCumPct('K');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1250));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4345);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((-257));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('c');
      long long0 = frequency0.getCumFreq('c');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4345);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((long) 4345);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(4451);
      long long0 = frequency0.getCount((-972));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-1864));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('1');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
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
  public void test_0584()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
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
  public void test_0585()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('g');
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
  public void test_0586()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('T');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(')');
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
  public void test_0588()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-433L));
      // Undeclared exception!
      try { 
        frequency0.addValue('m');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1128));
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
  public void test_0591()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-1457), (-1457)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(10, 10, 1, 1, (-3528)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
      
      long long1 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(4345);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
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
  public void test_0595()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('$');
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
  public void test_0597()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(907);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
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
  public void test_0601()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable0);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
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
  public void test_0605()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(3L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\"');
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals("Value \t Freq. \t Pct. \t Cum Pct. \n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-1457), 1).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2145);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getPct(66);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) ">f");
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
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
  public void test_0618()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
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
  public void test_0620()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-358));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('d');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('W');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-11), 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1427));
      Integer integer0 = new Integer((-1427));
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq((-2244));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1L);
      frequency0.addValue((-76));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-76\t1\t50%\t50%\n1\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-11)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1427));
      frequency0.hashCode();
  }
}
