package org.apache.commons.math.distribution;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.HypergeometricDistribution;
import org.apache.commons.math.distribution.PascalDistribution;
import org.apache.commons.math.distribution.PoissonDistribution;
import org.apache.commons.math.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.distribution.BinomialDistribution;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BinomialDistribution;
import org.apache.commons.math.distribution.HypergeometricDistribution;
import org.apache.commons.math.distribution.PoissonDistribution;
import org.apache.commons.math.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(312, 0.4737146832269313);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample((-1794));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,794)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1122, 0.0);
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.10684455611190757, 1.5231541295722552E-16, (-2908));
      int int0 = poissonDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(297, 297);
      double double0 = zipfDistribution0.cumulativeProbability(297, 297);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0);
      double double0 = poissonDistribution0.cumulativeProbability((-142), 759);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(26, 26);
      // Undeclared exception!
      zipfDistribution0.sample(26);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(297, 297);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(19, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 9
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1158, 1158);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.5620903916754836);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.12980841898165818, 297, (-1));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(Double.NaN);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1158, (-1023446623));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(1158, 1158);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,023,446,623) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.5960405605799479, 184);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.5960405605799479);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(269, 269);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(269);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 134
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1122, 0.6571071608956996);
      int int0 = pascalDistribution0.sample();
      assertEquals(624, int0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(707, 707, 707);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(707);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 707 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability((-1.7544995191195304E182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -175,449,951,911,953,040,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(19, 19);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(19, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (19)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1158, 1158);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1158, 1158);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1122, 0.6571071608956996);
      pascalDistribution0.reseedRandomGenerator(0L);
      assertEquals(0, pascalDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(9, 9);
      int[] intArray0 = zipfDistribution0.sample(9);
      assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(833.0);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.5191890001296997);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.8459379525820234, 0, 1495);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1428, 1428, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(18, 18);
      double double0 = zipfDistribution0.cumulativeProbability(18, 18);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(698, 0.5100858200691127);
      double double0 = binomialDistribution0.cumulativeProbability((-1), 698);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1550, 0.5538186728244616);
      // Undeclared exception!
      binomialDistribution0.sample(1550);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1913, 1067.6933843);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(176393440, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 88,196,719
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2323, 18);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(4628.81965220088, (-419.183844849), (-1019237123));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(4.806827797299427E-9);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,019,237,123) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3140, 3140);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(3140, 3140);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(698, 0.5100858200691127);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.5100858200691127);
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(698, 0.5100858200691127);
      int int0 = binomialDistribution0.sample();
      assertEquals(373, int0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1448, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(1448);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 723
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(775467703, 775467703, 775467703);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(775467703);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 775,467,703 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-354.7355264948));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -354.736 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 1.0);
      // Undeclared exception!
      try { 
        binomialDistribution0.cumulativeProbability(1428, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (0) must be less than or equal to upper endpoint (1,428)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3, 0.7437603331662372, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(0, 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 0 iterations) for value 3
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.8459379525820234, 0, 1495);
      poissonDistribution0.reseedRandomGenerator(1428);
      assertEquals(Integer.MAX_VALUE, poissonDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(18, 0.3557156125515007);
      int[] intArray0 = binomialDistribution0.sample(18);
      assertEquals(18, intArray0.length);
  }
}
