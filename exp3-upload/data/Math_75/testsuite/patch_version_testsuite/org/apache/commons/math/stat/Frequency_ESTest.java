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
      Integer integer0 = new Integer((-2236));
      frequency0.addValue(integer0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3492), 1732, 1, (-1042), 2396).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((-4864));
      double double0 = frequency0.getCumPct(1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((-4864));
      double double0 = frequency0.getPct('r');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3860));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      double double0 = frequency0.getPct(1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2662), (-2662), (-654), 0, (-2834)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1405L));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct((Object) null);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getPct(0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-321));
      double double0 = frequency0.getPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('d');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      double double0 = frequency0.getCumPct((-3));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(944L);
      double double0 = frequency0.getCumPct('5');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3492), 1732, 1, (-1042), 2396).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getCumPct('s');
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3860));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((-3860));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('D');
      long long0 = frequency0.getCumFreq('D');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(0L);
      long long0 = frequency0.getCount((-2304L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-21));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount(1431);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getCount('9');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(31);
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
  public void test_0020()  throws Throwable  {
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
  public void test_0021()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('(');
      Integer integer0 = new Integer((-911));
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
      frequency0.addValue((-659L));
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-659\t1\t100%\t100%\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
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
  public void test_0025()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('r');
      // Undeclared exception!
      try { 
        frequency0.addValue((-266));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3644L));
      // Undeclared exception!
      try { 
        frequency0.addValue('d');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2282), (-2282), 2246, 2246, (-2282)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-321));
      double double0 = frequency0.getPct('`');
      assertEquals(0.0, double0, 0.01);
      
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-522), (-522), 1, (-522), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue((-1405L));
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
      
      double double0 = frequency0.getCumPct((long) (-522));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('$');
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCumFreq((Object) integer0);
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
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      long long0 = frequency0.getCount(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(6);
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-21));
      frequency0.addValue(integer0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
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
  public void test_0040()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(5L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      Integer integer0 = new Integer(1618);
      frequency1.addValue((Comparable<?>) integer0);
      boolean boolean0 = frequency1.equals(frequency0);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency1.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3492), 1732, 1, (-3492), 2396).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq(2396);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-597));
      long long0 = frequency0.getCumFreq((-642L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2236));
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-3860));
      frequency0.addValue((Object) integer0);
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
      Frequency frequency0 = new Frequency();
      frequency0.addValue('8');
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n8\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1));
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('');
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
  public void test_0057()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('8');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('o');
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
      frequency0.addValue(1853L);
      frequency0.addValue((-1L));
      long long0 = frequency0.getCumFreq(4L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3440));
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
  public void test_0062()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('h');
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1873), 1632, 1, (-1873), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue('-');
      double double0 = frequency0.getCumPct('-');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 1632, (-2729)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
      
      double double1 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct((Object) frequency0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('5');
      double double0 = frequency0.getPct((-769L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1424L));
      double double0 = frequency0.getPct((-1424L));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('');
      double double0 = frequency0.getPct(744);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = new Integer(1987);
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getPct((-1));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      double double0 = frequency0.getPct(',');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getPct('=');
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(807);
      double double0 = frequency0.getCumPct(62);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any(org.apache.commons.math.stat.Frequency.class) , any(org.apache.commons.math.stat.Frequency.class));
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Frequency> comparable0 = (Comparable<Frequency>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any(org.apache.commons.math.stat.Frequency.class));
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct('s');
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1873), 1632, 1, (-1873), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = frequency0.getCumPct('-');
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(3732);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((long) (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('O');
      long long0 = frequency0.getCumFreq('g');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-720));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount((-1408L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1431655765);
      long long0 = frequency0.getCount(1431655765);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCount('-');
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2065);
      frequency0.addValue(integer0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(2065, 2065).when(comparable0).compareTo(any());
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
  public void test_0083()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(861);
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
      frequency0.addValue('');
      Integer integer0 = new Integer(744);
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
  public void test_0087()  throws Throwable  {
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
  public void test_0088()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      // Undeclared exception!
      try { 
        frequency0.addValue((Comparable<?>) "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.String not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
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
  public void test_0090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      // Undeclared exception!
      try { 
        frequency0.addValue(1526L);
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
      frequency0.addValue('5');
      // Undeclared exception!
      try { 
        frequency0.addValue((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Long not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(16);
      // Undeclared exception!
      try { 
        frequency0.addValue('-');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // instance of class java.lang.Character not comparable to existing values
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) frequency0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-1690), 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 1632, (-2729)).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue((Comparable<?>) integer0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(1.0, double0, 0.01);
      
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
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
  public void test_0098()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
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
      frequency0.addValue(0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Comparator<Frequency> comparator0 = (Comparator<Frequency>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCount((Object) frequency0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      frequency0.addValue(comparable0);
      long long0 = frequency0.getSumFreq();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getSumFreq();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(3L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2065);
      frequency0.addValue(integer0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-1690), 31).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      Object object0 = new Object();
      long long0 = frequency0.getCumFreq(object0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1431655765);
      frequency0.addValue(0L);
      long long0 = frequency0.getCumFreq(802);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      Integer integer0 = new Integer((-720));
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2982));
      long long0 = frequency0.getCount((Object) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-720));
      frequency0.addValue(integer0);
      frequency0.addValue((Comparable<?>) integer0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
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
  public void test_0117()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2065);
      frequency0.addValue(integer0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n2065\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-1408L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-720));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      frequency0.addValue(2171);
      double double0 = frequency0.getCumPct((Object) iterator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq('m');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('E');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCumFreq(3693);
      assertEquals(0L, long0);
  }
}
