package org.apache.commons.math.distribution;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PascalDistribution;
import org.apache.commons.math.distribution.PoissonDistribution;
import org.apache.commons.math.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.distribution.HypergeometricDistribution;
import org.apache.commons.math.distribution.BinomialDistribution;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BinomialDistribution;
import org.apache.commons.math.distribution.PascalDistribution;
import org.apache.commons.math.distribution.PoissonDistribution;
import org.apache.commons.math.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int int0 = zipfDistribution0.sample();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(35, 35);
      double double0 = zipfDistribution0.cumulativeProbability(35, 35);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(5, 5);
      double double0 = zipfDistribution0.cumulativeProbability(5, 5);
      assertEquals(3.086831244727417E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2954, 2954);
      // Undeclared exception!
      zipfDistribution0.sample(2954);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1964, 1964);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1444, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10000000, Double.NaN);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0E-12);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1752.624010865, (-1));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1225, 1225);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1225, 1225);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.06307350627642716, (-1740.1458638306854), (-951));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(4455, 4455);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-951) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.12980841898165818, 0.12980841898165818);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.12980841898165818, 0.12980841898165818);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0E-12);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int int0 = pascalDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(237, 237);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(237);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 118
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample((-650767500));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-650,767,500)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(5, 5);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(5, 5);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability((-3415.966));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,415.966 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(5, 5);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(5, (-190547345));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-190,547,345) must be less than or equal to upper endpoint (5)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      double double0 = zipfDistribution0.cumulativeProbability(Integer.MIN_VALUE, (-567877535));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      pascalDistribution0.reseedRandomGenerator(1);
      assertEquals(Integer.MAX_VALUE, pascalDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.0);
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
  public void test_0024()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(121, 121, 121);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 0.9193888555558614);
      int int0 = pascalDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(103467183, 103467183);
      double double0 = zipfDistribution0.cumulativeProbability(809211790, 809211790);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, (-2380), 1397);
      // Undeclared exception!
      poissonDistribution0.sample(1397);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2892, 2892);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(103467183, 103467183);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.531219815866691, 249, (-458));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.531219815866691);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-458) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(209, 1.0E-6, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(10, 2537);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2177, 0.413692038771871);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.3897167444229126);
      assertEquals(3060, int0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(209, 0, 2);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2, 1.0E-6);
      int int0 = pascalDistribution0.sample();
      assertEquals(3923189, int0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(935251);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(209, 0, 2);
      int[] intArray0 = hypergeometricDistribution0.sample(2179);
      assertEquals(2179, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(121, 121, 121);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-2380));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,380)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(209, 209, 209);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(209);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 209 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(185, 185, 185);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-1.8950538406321535E124));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -18,950,538,406,321,535,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(267, 267, 267);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(267, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (37) must be less than or equal to upper endpoint (267)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(121, 121, 121);
      double double0 = poissonDistribution0.cumulativeProbability(0, 0);
      assertEquals(2.8207700884601463E-53, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2, 1.0E-6);
      pascalDistribution0.reseedRandomGenerator((-1));
      assertEquals(1999998.0, pascalDistribution0.getNumericalMean(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.0);
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
  public void test_0045()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(Integer.MAX_VALUE, 1.0E-12);
      // Undeclared exception!
      binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(15, Double.NaN);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(892, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(39, 0.6055062932963506);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.03320001295749486);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.20084754983192443, 1575.6964279, 10000000);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.04724378696562892);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(134, 0, 134);
      double double0 = hypergeometricDistribution0.cumulativeProbability((-978), (-978));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1575.6964279, 3.4042761729010895E29, 3543);
      // Undeclared exception!
      poissonDistribution0.sample(3543);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(367, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 183
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1037, 0.9872099753839729);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.9872099753839729);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN, (-2069));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(Double.NaN);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1020, 1020);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1020, 1020);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(67, 67, (-1766));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-1766), 67);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,766) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(16, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(16);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 7
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.7535752982147762, 0.7535752982147762, (-2993));
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-2993));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,993)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1575.6964279, 3.4042761729010895E29, 3543);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(322, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(161, 161);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(161);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 161 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(4, 4);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability((-1986.7728));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,986.773 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(20, 20, 20);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(20, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (0) must be less than or equal to upper endpoint (20)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(20, 20, 20);
      double double0 = poissonDistribution0.cumulativeProbability(20, 20);
      assertEquals(0.004230253209146273, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN, (-2069));
      poissonDistribution0.reseedRandomGenerator((-2069));
      assertEquals(Double.NaN, poissonDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(4, 4);
      int int0 = zipfDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.26000272893771803, (-203));
      int[] intArray0 = poissonDistribution0.sample(1);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample((-3329));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-3,329)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 0.9026297667469598);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(14, Double.NaN);
      double double0 = zipfDistribution0.cumulativeProbability(14, 14);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(41, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.5180301427715848);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(41, 0.0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(731, 731);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(238, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 119
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(731, 731);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.9646347639777845);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(93039, 2590.53813);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1, 936);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.3101297522198012, (-224609353));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-224609353), 10000000);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-224,609,353) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1453.35, 1453.35);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(262, int0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 36, (-1));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(46, 46);
      int int0 = zipfDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 0
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int[] intArray0 = binomialDistribution0.sample(1);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
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
  public void test_0085()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(41, 0.0);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability(1906.68101464);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,906.681 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-3618.9767065967));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,618.977 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      // Undeclared exception!
      try { 
        binomialDistribution0.cumulativeProbability(1, (-190547345));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-190,547,345) must be less than or equal to upper endpoint (1)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(521, 0.0);
      double double0 = pascalDistribution0.cumulativeProbability(521, 521);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(521, 0.5786593784387795);
      // Undeclared exception!
      binomialDistribution0.sample(261);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(521, 0.0);
      pascalDistribution0.reseedRandomGenerator((-55L));
      assertEquals(0, pascalDistribution0.getSupportLowerBound());
  }
@Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(32767, 1.0);
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
  public void test_0092()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(526, 526, 526);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(525, int0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0);
      double double0 = poissonDistribution0.cumulativeProbability(32767, 32767);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(224, 224, 224);
      double double0 = hypergeometricDistribution0.cumulativeProbability(224, 224);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(218, 210, 210);
      // Undeclared exception!
      hypergeometricDistribution0.sample(210);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1693, 4170.2171);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2427.0, 0.05216859729054528, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.05216859729054528);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(237463610, 0.5906640000086703);
      pascalDistribution0.inverseCumulativeProbability(0.5906640000086703);
      pascalDistribution0.inverseCumulativeProbability(0.18630199064249076);
      // Undeclared exception!
      pascalDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.11710432822308303);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(617);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(218, 218, 218);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample((-945));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-945)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(120, 0.11710432822308303);
      int int0 = pascalDistribution0.sample();
      assertEquals(1020, int0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(224, 224, 224);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(224);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 224 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(218, 218, 218);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-2120.98445009734));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,120.984 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(364, 364, 364);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(204, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (204)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(Integer.MAX_VALUE, 779, 4042);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(85, 779);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(120, 0.11710432822308303);
      pascalDistribution0.reseedRandomGenerator((-1748L));
      assertTrue(pascalDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int[] intArray0 = binomialDistribution0.sample(1683);
      assertEquals(1683, intArray0.length);
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(10000000, 0);
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
  public void test_0111()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, Double.NaN);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(107, 107);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.25088030099868774);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(107, 2, 50);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.09220839956080029);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 109, 109);
      double double0 = hypergeometricDistribution0.cumulativeProbability((-25474229), (-25474229));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3896, 3896);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(162, 162);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 81
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(382.67135707913195, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3896, 3896);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(3896, 3896);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1458.72114, 1458.72114, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(0, 118);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 0 iterations) for value 1,458.721
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 106, 106);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.9189554812464875);
      assertEquals(103, int0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 78);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1);
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 78);
      zipfDistribution0.sample();
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 1.0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(434);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 106, 106);
      int[] intArray0 = hypergeometricDistribution0.sample(109);
      assertEquals(109, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 106, 106);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample((-450));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-450)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3896, 3896);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(3896);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3,896 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(90, 90, 90);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-1100.05266596));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,100.053 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3896, 3896);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(3896, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (0) must be less than or equal to upper endpoint (3,896)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 106, 106);
      double double0 = hypergeometricDistribution0.cumulativeProbability(104, 109);
      assertEquals(0.08104451875351248, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(109, 109, 109);
      hypergeometricDistribution0.reseedRandomGenerator(109);
      assertEquals(109, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(107, 2, 50);
      // Undeclared exception!
      hypergeometricDistribution0.sample(1739);
  }
@Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1000.0, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1938, 1.0);
      int int0 = pascalDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 3806.312);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 1623.0);
      double double0 = zipfDistribution0.cumulativeProbability((-1920), 180);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 0.4932899475097656);
      // Undeclared exception!
      zipfDistribution0.sample(180);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(312, 312);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(172, 172);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 86
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(32, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(Double.NaN);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 16
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10000000, 1083.0);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(10000000, 10000000);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, (-779));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-779), 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-779) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 1623.0);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 0.4932899475097656);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.04053446737579902);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.04053446737579902);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 1623.0);
      int int0 = zipfDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(172, 172);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(172);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 86
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(182, 182);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-3062));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-3,062)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1704.91078916093);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1704.91078916093);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,704.911 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3811.164443586549);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1113.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,113 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(172, 172);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(172, (-1018791306));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-1,018,791,306) must be less than or equal to upper endpoint (172)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 3806.312);
      double double0 = zipfDistribution0.cumulativeProbability(1910, 1910);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 3806.312);
      zipfDistribution0.reseedRandomGenerator((-1920));
      assertEquals(1, zipfDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3, 3);
      int[] intArray0 = zipfDistribution0.sample(3);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 3, 1}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2.147483647E9, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1567, 1567, 73);
      double double0 = hypergeometricDistribution0.cumulativeProbability(1, 1567);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(138, 19, 0);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1567, 1567, 73);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(73, int0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.14967761934601986);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 73, 73);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(138, 19, 0);
      double double0 = hypergeometricDistribution0.cumulativeProbability(1747, 1747);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2486, 2486);
      // Undeclared exception!
      zipfDistribution0.sample(2486);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1146, 1146);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(166, 166);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(0.5151153178683947);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 83
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(507315142, 507315142);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(507315142, 507315142);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2, 2);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(2, 2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1567, 560558883);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(318, int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1027, 1.0708593250394448E-7);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0708593250394448E-7);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(166, 166);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 83
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(166, 166);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(166);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 83
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(24, 24);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-2714));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,714)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2486, 2486);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(2486);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,486 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability((-567.097377));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -567.097 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(2, (-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-7) must be less than or equal to upper endpoint (2)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      pascalDistribution0.reseedRandomGenerator(0);
      assertTrue(pascalDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
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
  public void test_0178()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(979, 979);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.0);
      double double0 = binomialDistribution0.cumulativeProbability((-1554), 158);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(644, 644);
      // Undeclared exception!
      zipfDistribution0.sample(644);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1020, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(644, 644);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.4897026458359206);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(11, (-183.20453417661), 11);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(11, 11);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (11) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 407.2419496791586);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 407.2419496791586);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.39762192964553833);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.4166246290402286E-7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 5, 5);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(6.931054493326395E-9);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(644, 644);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(907, 148.027982893391);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(907);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 453
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1033194494, 1033194494);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-173));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-173)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability((-959.4224985272308));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -959.422 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(216, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2) must be less than or equal to upper endpoint (216)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1691, 1691);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1691, 1691);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      zipfDistribution0.reseedRandomGenerator(2);
      assertTrue(zipfDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
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
  public void test_0200()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(95);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, Double.NaN);
      double double0 = zipfDistribution0.cumulativeProbability((-1888), 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(150, 1.9803689272433392E-303);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1.9803689272433392E-303);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 66.61487990201589);
      double double0 = zipfDistribution0.cumulativeProbability(78, 78);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(95, 95);
      // Undeclared exception!
      zipfDistribution0.sample(95);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(281, 281);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 78);
      zipfDistribution0.sample();
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 4, (-659472561));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.5296054477019876);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-659,472,561) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(999214310, 15);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1449, 1449);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(239, 2558.9780892);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(162, 162);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(162);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 81
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 78);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-4336));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-4,336)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(95);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(95);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 95 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(4);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1601.82485));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,601.825 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(239, 0.9346277566141885);
      // Undeclared exception!
      try { 
        pascalDistribution0.cumulativeProbability(110, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (17) must be less than or equal to upper endpoint (110)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 4, 4);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(4, 564263993);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(78, 78);
      zipfDistribution0.reseedRandomGenerator(78);
      assertTrue(zipfDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
}
