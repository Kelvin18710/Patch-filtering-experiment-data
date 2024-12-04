package org.apache.commons.math.distribution;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BinomialDistribution;
import org.apache.commons.math.distribution.HypergeometricDistribution;
import org.apache.commons.math.distribution.PoissonDistribution;
import org.apache.commons.math.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.distribution.PascalDistribution;
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
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(744, 744, 744);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample((-4903));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-4,903)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2705, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(133, 133);
      int int0 = zipfDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2885.021243145558, 712);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0E-12);
      assertEquals(2514, int0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(394, 0, 394);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(180, 180);
      double double0 = zipfDistribution0.cumulativeProbability(180, 180);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(3387, 0, 3387);
      double double0 = hypergeometricDistribution0.cumulativeProbability(0, 895);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.5399037252947769, (-1627), (-1627));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.9997074656260758);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,627) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 180, (-1446));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(180, 1031);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,446) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(151, 151);
      zipfDistribution0.inverseCumulativeProbability(0.15765498119913168);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(203, 203);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 101
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(715, 715, 715);
      int[] intArray0 = hypergeometricDistribution0.sample(715);
      assertEquals(715, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2705, 0.0);
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
  public void test_0013()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(133, 133);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 715, 715);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(715);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 715 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2885.021243145558, 2756);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(744, 744, 744);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(744, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (744)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(677, 123, 123);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(123, 710);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      zipfDistribution0.reseedRandomGenerator(1538L);
      assertEquals(1, zipfDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(151, 151);
      // Undeclared exception!
      zipfDistribution0.sample(151);
  }
@Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10, 10, 10);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample((-825));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-825)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(94, 1.0E-12);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(21, 1.0);
      int int0 = zipfDistribution0.sample();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(21, 1.0);
      int int0 = zipfDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1019237123, 21, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(150.3, 51);
      double double0 = poissonDistribution0.cumulativeProbability((-901298238), 2813);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(19, 19);
      // Undeclared exception!
      zipfDistribution0.sample(19);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9506043611405193, 0.9506043611405193, (-4));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.9659918999911379);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(568944871, 568944871);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(568944871, 568944871);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(833.325711801093, (-1483.2));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(10, 10);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction diverged to NaN for value 833.326
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(507, 507);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(97, 97);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.7962473009751485);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2384, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,191
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(97, 97);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10, 10, 10);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 10 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10, 10, 10);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-2.0197142620980974E-8));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10, 10, 10);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(10, (-705931769));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-705,931,769) must be less than or equal to upper endpoint (10)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(46, 46);
      double double0 = zipfDistribution0.cumulativeProbability(46, 46);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(378.10678);
      poissonDistribution0.reseedRandomGenerator(2147483648L);
      assertEquals(378.10678, poissonDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(841, 0.0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample((-5262));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-5,262)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.7908417412805324, 958.19477582401);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(841, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9026297667469598, (double) 0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.6170841455459595);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(526, 526, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(1.0E-12);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(2045, 2045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2916, (double) 2916);
      // Undeclared exception!
      poissonDistribution0.sample(2916);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, 285173490);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9026297667469598, (double) (-36));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(0.9026297667469598);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN);
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
  public void test_0054()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(45.94, (-1.0));
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(4094, 4094);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9367142680896576, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(0, 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
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
  public void test_0057()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, (double) 1);
      int[] intArray0 = poissonDistribution0.sample(1);
      assertArrayEquals(new int[] {2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
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
  public void test_0059()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1043, (double) 1043);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1043);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,043 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1954, 1954, 1954);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-1731.6395677742016));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,731.64 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 12, (double) 12);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(1365, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (12) must be less than or equal to upper endpoint (1,365)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9026297667469598, (double) 0);
      double double0 = poissonDistribution0.cumulativeProbability((-375021546), 544);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, (double) 1);
      poissonDistribution0.reseedRandomGenerator(1);
      assertEquals(0, poissonDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.9847);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(994);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }
@Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1000.0, (-2754));
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-1667));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,667)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(4831, 4831);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4676, 0.017465956808979295);
      int int0 = binomialDistribution0.sample();
      assertEquals(93, int0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.12980840430358748);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3121.7677475, 3121.7677475, 1);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.1910135746002197, 0.04887891502399046);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.04887891502399046);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      double double0 = pascalDistribution0.cumulativeProbability(1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4676, 0.017465956808979295);
      // Undeclared exception!
      binomialDistribution0.sample(92);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 16777219, 2097150);
      // Undeclared exception!
      poissonDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.9026297241072663);
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
  public void test_0075()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN, 9069);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1001.0, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(318, 318);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Continued fraction convergents failed to converge (in less than 1 iterations) for value 1,001
         //
         verifyException("org.apache.commons.math.util.ContinuedFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4676, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
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
  public void test_0081()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2288.1931079751475, 2288.1931079751475);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(2288.1931079751475);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,288.193 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability((-91.48776869968));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -91.488 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.cumulativeProbability(1, (-2539));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-2,539) must be less than or equal to upper endpoint (1)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4676, 0.0);
      double double0 = binomialDistribution0.cumulativeProbability((-152), 3914);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4676, 0.0);
      binomialDistribution0.reseedRandomGenerator(4676);
      assertEquals(4676, binomialDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int[] intArray0 = pascalDistribution0.sample(1);
      assertArrayEquals(new int[] {0}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(9.223372036854776E18, 109);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-2545));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,545)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(Integer.MAX_VALUE, 0.16087876796967637);
      // Undeclared exception!
      binomialDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1762.735986, 0.0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(419, int0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2825, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2, 1);
      int int0 = binomialDistribution0.sample();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.inverseCumulativeProbability(4.920784622407246E-8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(364380298, 0.0);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 0.0, 2825);
      double double0 = poissonDistribution0.cumulativeProbability(501, 2825);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2825, 0.0);
      // Undeclared exception!
      binomialDistribution0.sample(2825);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2825, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(2825);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,412
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(336352046, 9.118819143623114E-4);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(542852580, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability(0.37311969708376735);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(893683118, 893683118);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(893683118);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 893,683,118 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(705931769, 705931769);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(987, 2001);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.2204489707946777, (-74.0), 91);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(91, 91);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (91) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(717, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 358
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
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
  public void test_0105()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(1, (-299));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-299) must be less than or equal to upper endpoint (1)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2825, 0.0);
      binomialDistribution0.reseedRandomGenerator(2825);
      assertEquals(2825, binomialDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2825, 0.0);
      int[] intArray0 = binomialDistribution0.sample(2);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3947.6625, 1);
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
  public void test_0110()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, (-2506.085625957792));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(5.5906456251308664E-8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.12980841898165818);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.12980841898165818);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.3183098861837907, 1223.11050024);
      double double0 = poissonDistribution0.cumulativeProbability(0, 0);
      assertEquals(0.7684685987331722, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(44, 44);
      // Undeclared exception!
      zipfDistribution0.sample(44);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(187513365, 187513365);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN);
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
  public void test_0119()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(6256, 6256);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(6256, 6256);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 4, 4);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(4, 4);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(132.7630457991524, 1.0E-9);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0E-9);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, (double) 1);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(306, 1);
      int int0 = binomialDistribution0.sample();
      assertEquals(306, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1072, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(1072);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 536
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(44, 44);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-1291));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,291)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(615.6833957180315, 615.6833957180315);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(615.6833957180315);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 615.683 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(132.7630457991524, 1.0E-9);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-2495.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,495 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(132.7630457991524, 1896);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-560), (-3043));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-3,043) must be less than or equal to upper endpoint (-560)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.1817063622420624E-11);
      double double0 = poissonDistribution0.cumulativeProbability(63, 2149);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0E-6);
      poissonDistribution0.reseedRandomGenerator((-1L));
      assertEquals(1.0E-6, poissonDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, Double.NaN);
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
  public void test_0133()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2221);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0L);
      assertEquals(675, int0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, (-265));
      double double0 = poissonDistribution0.cumulativeProbability((-265), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      poissonDistribution0.reseedRandomGenerator((-2609L));
      int int0 = poissonDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(416, 14, 416);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.6415454149246216);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(9.724280436531502E-13);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0E-12);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(9.724280436531502E-13);
      double double0 = poissonDistribution0.cumulativeProbability(10000000, 10000000);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      double double0 = poissonDistribution0.cumulativeProbability(0, 0);
      assertEquals(0.36787944117146065, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 721, 721);
      // Undeclared exception!
      poissonDistribution0.sample(721);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.9053890756345163E-13, (-2.462631860370667E-9));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(1.9053890756345163E-13);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN);
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
  public void test_0146()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10000000, 32767, 32767);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(63, 63);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(1, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(882, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 440
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-690));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-690)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1751.5629362);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1751.5629362);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,751.563 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-2679.12240784344));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,679.122 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2340.21547253682);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(2, (-1900));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-1,900) must be less than or equal to upper endpoint (2)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int[] intArray0 = binomialDistribution0.sample(1);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.90573420416, 0.90573420416);
      double double0 = poissonDistribution0.cumulativeProbability(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals((-1.0), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
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
  public void test_0157()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.6712652600419278);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9254430001877367);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      double double0 = binomialDistribution0.cumulativeProbability(250, 250);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      binomialDistribution0.sample(2561);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 0
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10000000, 1.0E-12);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0E-12);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1.0E-12);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(710212210);
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(710212210, 710212210);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2, 2);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(2, 321);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(50, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(50);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 24
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(73, 0.4358128673908345);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample((-440));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-440)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.6712652600419278);
      int[] intArray0 = poissonDistribution0.sample(2);
      assertArrayEquals(new int[] {2, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(73, 73);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.461463136044985);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2113, 2113);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(2113);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,113 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-769.732112));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -769.732 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(710212210, 710212210, 710212210);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(710212210, 2371);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2,371) must be less than or equal to upper endpoint (710,212,210)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(73, 73);
      double double0 = zipfDistribution0.cumulativeProbability(0, 3247);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(328, 328);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(73, 73);
      zipfDistribution0.reseedRandomGenerator(73);
      assertEquals(73, zipfDistribution0.getNumberOfElements());
  }
}
