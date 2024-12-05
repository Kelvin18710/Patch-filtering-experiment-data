package org.apache.commons.math3.distribution;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1489);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 260);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(812, int0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 260);
      int int0 = poissonDistribution0.sample();
      assertEquals(2412, int0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 2450);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.596553);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 2450);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.3333333333333333);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1415.794524318072);
      double double0 = poissonDistribution0.cumulativeProbability(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2442, 2442);
      // Undeclared exception!
      poissonDistribution0.sample(2442);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.9985313415527344, (-1.548715389333397E-8));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(0.9985313415527344);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 28, 28);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1.0E-12);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (28) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.3333333333333333, (-2218.97));
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(10000000, 10000000);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.3333333333333333, 7);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(7, 1209);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (7) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0E-12, (double) 10000000);
      int[] intArray0 = poissonDistribution0.sample(2442);
      assertEquals(2442, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.39068812441824724, (-32));
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-32));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-32)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1044);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 2450);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(2450);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,450 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 2450);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-4626.4043445));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4,626.404 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2416, 2416);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(2416, (-1331));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-1,331) must be less than or equal to upper endpoint (2,416)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 2450);
      double double0 = poissonDistribution0.cumulativeProbability(2450, 2450);
      assertEquals(0.008059577053612488, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(858, 858);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 2450, 2450);
      poissonDistribution0.reseedRandomGenerator(2450);
      assertEquals(0, poissonDistribution0.getSupportLowerBound());
  }
@Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample((-2209));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,209)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(3523, 0);
      double double0 = binomialDistribution0.cumulativeProbability(163, 10000000);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(151, 0.029855131146781844);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.0023393823098027955);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2421.8675211197);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.6232728299672516);
      assertEquals(2436, int0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1.0, 901);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      binomialDistribution0.sample(3814);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 4,999,999
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(905, 905);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.041666666666621166);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10000000, 369, 369);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(34, 5468749);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, 0.9026297667);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.13569003890990727);
      assertEquals(9025266, int0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(25, 0.25817148449237526);
      int int0 = binomialDistribution0.sample();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0.6204015142175308);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(776);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(25, 0.19474466486708075);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability(7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-2421.5987005706547));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,421.599 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2421.8675211197);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(5394, 2321);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2,321) must be less than or equal to upper endpoint (5,394)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(25, 0.25817148449237526);
      binomialDistribution0.reseedRandomGenerator(25);
      assertEquals(0, binomialDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(25, 0.25817148449237526);
      binomialDistribution0.sample(25);
      // Undeclared exception!
      binomialDistribution0.sample();
  }
@Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(276, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample((-4173));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-4,173)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10000000, 10000000, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(276, 276, 276);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(275, int0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(10000000, 10000000, 0);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.4843113896130571);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.5);
      double double0 = poissonDistribution0.cumulativeProbability(50, 50);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      // Undeclared exception!
      binomialDistribution0.sample(3065);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1667, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(1667);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 833
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.4897026458359206, (-3.128894928199484E-290));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability(0.4709796905517578);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(176393444);
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(1, 176393444);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-378), 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, 0.2815598249435425);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.04006308894932531);
      assertEquals(2813109, int0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, 0.2815598249435425);
      int int0 = binomialDistribution0.sample();
      assertEquals(2817443, int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability(2496.923096606165);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,496.923 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.inverseCumulativeProbability((-952.5940926109635));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -952.594 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, 0.2815598249435425);
      // Undeclared exception!
      try { 
        binomialDistribution0.cumulativeProbability(2, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-1) must be less than or equal to upper endpoint (2)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      binomialDistribution0.reseedRandomGenerator(0);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(10000000, 0.2815598249435425);
      binomialDistribution0.sample(2);
      // Undeclared exception!
      binomialDistribution0.sample();
  }
@Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1760, 1760);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-406));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-406)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      double double0 = zipfDistribution0.cumulativeProbability(1402, 10000000);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.37214350152565245, 38);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.37214350152565245);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      double double0 = zipfDistribution0.cumulativeProbability((-847), (-847));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      double double0 = zipfDistribution0.cumulativeProbability(1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(38, 38);
      // Undeclared exception!
      zipfDistribution0.sample(38);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1220, 367.85252316265877);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(749, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 374
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1852, 2051.746153161073);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.4897026458359206, 7);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (7) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2267, 2267);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(753, 753);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(38, (-1449.8330725), 38);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(38, 38);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (38) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(38, 0.31500764073424703);
      int int0 = zipfDistribution0.inverseCumulativeProbability(0.31500764073424703);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(38, 0.31500764073424703);
      int int0 = zipfDistribution0.sample();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(392.39870279, 392.39870279);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(392.39870279);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 392.399 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(392.39870279, 392.39870279);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-422.0433621884857));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -422.043 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(38, 0.31500764073424703);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(38, 33);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (33) must be less than or equal to upper endpoint (38)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 1);
      zipfDistribution0.reseedRandomGenerator(1);
      assertEquals(1, zipfDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(859.6705456, 859.6705456);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 287, 287);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 240.0);
      int int0 = zipfDistribution0.sample();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.2827868942011302, 0.1491555324362519);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.8081808588240906);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(150, 1084.2158);
      double double0 = zipfDistribution0.cumulativeProbability(150, 150);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      // Undeclared exception!
      binomialDistribution0.sample(2644);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(32767, 1840.03);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(4319, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 2,159
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1, (-3825.31));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, 1);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1, (-1528.09561608));
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(1, 1451);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.27530025821652626, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(363, Integer.MAX_VALUE);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 1.0E-6);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1005);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 240.0);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample((-581655560));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-581,655,560)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(2);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, (-5865.276517));
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-5865.276517));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -5,865.277 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.2827868942011302, 0.2827868942011302);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(1392, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-1) must be less than or equal to upper endpoint (1,392)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(198, 0.4201913653980338);
      binomialDistribution0.reseedRandomGenerator(198);
      assertEquals(198, binomialDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(8, 0);
      int[] intArray0 = binomialDistribution0.sample(8);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0, 968.446, (-1411));
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-1411));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,411)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.06216714749895792, 0.06216714749895792);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2598, 0, 2);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      double double0 = pascalDistribution0.cumulativeProbability(0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2, 0.9035341538936539);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.9035341538936539);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      double double0 = pascalDistribution0.cumulativeProbability(1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1.0);
      double double0 = binomialDistribution0.cumulativeProbability(1, 2097150);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1053, 0.2479134751346952);
      // Undeclared exception!
      binomialDistribution0.sample(1045);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(254, 1);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(2, Double.NaN);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability(Double.NaN);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3599.982267, 3599.982267, (-1));
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability((-1), 1018791306);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(358, 8);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1053, Double.NaN);
      // Undeclared exception!
      try { 
        binomialDistribution0.sample(1669);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 526
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 0.23946511499820902);
      int[] intArray0 = pascalDistribution0.sample(1);
      assertArrayEquals(new int[] {8}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability(1987.7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,987.7 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.inverseCumulativeProbability((-4525.09314));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4,525.093 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.cumulativeProbability(2, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (1) must be less than or equal to upper endpoint (2)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(3591, 1);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1, 1);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.06216714749895792, 0.06216714749895792);
      poissonDistribution0.reseedRandomGenerator((-2150L));
      assertEquals(0.06216714749895792, poissonDistribution0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 0.23946511499820902);
      int int0 = pascalDistribution0.sample();
      //  // Unstable assertion: assertEquals(2, int0);
  }
}
