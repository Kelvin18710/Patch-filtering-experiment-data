package org.apache.commons.math3.distribution;
import org.junit.Test;
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
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1924.3903098, 1924.3903098);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample(0);
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
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(176, 176, 176);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(175, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(176, 0, 176);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(176, 176, 176);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(176, int0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(176, 0, 176);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(7.140343013236265E-60, 7.140343013236265E-60);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(7.140343013236265E-60, 7.140343013236265E-60);
      int int0 = poissonDistribution0.inverseCumulativeProbability(7.140343013236265E-60);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(7.140343013236265E-60, 7.140343013236265E-60);
      double double0 = poissonDistribution0.cumulativeProbability(1528, 1528);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(297, 297);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(8.924048768324976E-200, (-708.6022));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.0010337603403818285, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.0010337603403818285);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(412, (-476.491));
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(0, 715);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(287, (-425.1939), 287);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(287, 1115);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (287) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2747, 0.0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(0.5186340935898386);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
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
  public void test_0015()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1975, 1975, 1975);
      int[] intArray0 = hypergeometricDistribution0.sample(1975);
      assertEquals(1975, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2, 2, 2);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(287, 287, 287);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability(287);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 287 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1975, 1975, 1975);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-2932.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,932 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(1, (-401));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-401) must be less than or equal to upper endpoint (1)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1975, 1975, 1975);
      double double0 = hypergeometricDistribution0.cumulativeProbability(464, 928201846);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1974, 1974, 1974);
      hypergeometricDistribution0.reseedRandomGenerator(1974);
      assertEquals(1974, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(301, 17, 17);
      // Undeclared exception!
      hypergeometricDistribution0.sample(301);
  }
@Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 1.0);
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
  public void test_0024()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(6, 0.031376096288349586);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.8661142926069052);
      assertEquals(270, int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 25, 2890);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(599, 2, 2);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1, 4961.254037327185);
      int int0 = zipfDistribution0.inverseCumulativeProbability(2.714462741648288E-15);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(17, 17, 17);
      int int0 = hypergeometricDistribution0.inverseCumulativeProbability(0.12495299159795481);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.5296054477019876);
      double double0 = poissonDistribution0.cumulativeProbability((-1151), (-1151));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(15, 15, 15);
      double double0 = hypergeometricDistribution0.cumulativeProbability(15, 15);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 25, 2890);
      // Undeclared exception!
      poissonDistribution0.sample(1316);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 1.0);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(53);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1878, 1469, 1469);
      // Undeclared exception!
      hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
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
  public void test_0035()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(367980115, 367980115);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(1.0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 25, 25);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.18492233753204346);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (25) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(10000000, 1.0E-12);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(6, 10000000);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 25, 25);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(25, 25);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (25) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(817, 0.23514013859491284);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample((-1120));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,120)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.08166437495921675, 53);
      int[] intArray0 = poissonDistribution0.sample(1668);
      assertEquals(1668, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(15, 15, 15);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 15 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(15, 15, 15);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.inverseCumulativeProbability((-1837.6568424));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,837.657 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(15, 15, 15);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.cumulativeProbability(15, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (2) must be less than or equal to upper endpoint (15)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(817, 17, 17);
      double double0 = hypergeometricDistribution0.cumulativeProbability(17, 817);
      assertEquals((-3.1086244689504383E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(53, 0.031376096288349586);
      pascalDistribution0.reseedRandomGenerator(53);
      assertTrue(pascalDistribution0.isSupportConnected());
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(53, 53, 53);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(53, int0);
  }
@Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(287);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-945));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-945)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(Integer.MAX_VALUE, 0.9026297667469598);
      // Undeclared exception!
      binomialDistribution0.inverseCumulativeProbability(0.9026297667469598);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(3030.397404229916, 434);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.0);
      assertEquals(1176, int0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1583.262, 1583.262);
      double double0 = poissonDistribution0.cumulativeProbability(0, 543);
      assertEquals(9.91850879765939E-202, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(4381.255074743, 4381.255074743);
      int int0 = poissonDistribution0.sample();
      assertEquals(4301, int0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      double double0 = pascalDistribution0.cumulativeProbability(1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(926, 926);
      // Undeclared exception!
      zipfDistribution0.sample(926);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(926, 926);
      // Undeclared exception!
      zipfDistribution0.sample();
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
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1, (-1.0));
      // Undeclared exception!
      poissonDistribution0.inverseCumulativeProbability(1);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(Double.NaN, Double.NaN);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(Double.NaN);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,823
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1031, 1031);
      // Undeclared exception!
      zipfDistribution0.cumulativeProbability(1031, 1031);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 1, 0);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 0.9026297667469598);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.9026297667469598);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int int0 = pascalDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(0, 1);
      // Undeclared exception!
      try { 
        pascalDistribution0.sample(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 1,073,741,822
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
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
  public void test_0065()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(965.788299738);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(965.788299738);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 965.788 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(965.788299738);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability((-639.722));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -639.722 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1031, 1031);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(1031, (-845));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (-845) must be less than or equal to upper endpoint (1,031)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      pascalDistribution0.reseedRandomGenerator(1);
      assertEquals(0, pascalDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 0.9026297667469598);
      int[] intArray0 = pascalDistribution0.sample(1);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
  }
@Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1981, 1981, 0);
      // Undeclared exception!
      try { 
        hypergeometricDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(1756, 0.14387929841248617);
      // Undeclared exception!
      zipfDistribution0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, Double.NaN);
      double double0 = binomialDistribution0.cumulativeProbability((-33), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(493, 0.37666240996596145);
      int int0 = pascalDistribution0.sample();
      assertEquals(877, int0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.5637576036898502);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.6285316606947873);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(525.91853554, 13);
      int int0 = poissonDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.08206431120174774, 8.940674941569512E-8);
      int int0 = poissonDistribution0.inverseCumulativeProbability(0.08206431120174774);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(539, 539);
      double double0 = zipfDistribution0.cumulativeProbability(2, 539);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(11, 11);
      double double0 = zipfDistribution0.cumulativeProbability(11, 11);
      assertEquals(3.503197731902219E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(493);
      // Undeclared exception!
      poissonDistribution0.sample(493);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(695, 695);
      // Undeclared exception!
      zipfDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
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
  public void test_0082()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(1.0157477855682373, 2);
      // Undeclared exception!
      try { 
        poissonDistribution0.inverseCumulativeProbability(0.04477135215258289);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.628684262076918, (-21.80129414833555));
      // Undeclared exception!
      poissonDistribution0.cumulativeProbability(510, 510);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1, 1);
      int int0 = pascalDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(17, Double.NaN);
      // Undeclared exception!
      try { 
        zipfDistribution0.sample(17);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Discrete cumulative probability function returned NaN for argument 8
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(690.239499);
      // Undeclared exception!
      try { 
        poissonDistribution0.sample((-310));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-310)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(20, 20);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability(20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 20 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(539, 3056.88941195);
      // Undeclared exception!
      try { 
        zipfDistribution0.inverseCumulativeProbability((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(5, 5);
      // Undeclared exception!
      try { 
        zipfDistribution0.cumulativeProbability(1413, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint (5) must be less than or equal to upper endpoint (1,413)
         //
         verifyException("org.apache.commons.math3.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(525.91853554, 13);
      // Undeclared exception!
      try { 
        poissonDistribution0.cumulativeProbability(13, 1267);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (13) exceeded
         //
         verifyException("org.apache.commons.math3.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(493, 0.37666240996596145);
      pascalDistribution0.reseedRandomGenerator(0L);
      assertEquals(0, pascalDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      ZipfDistribution zipfDistribution0 = new ZipfDistribution(2, 2);
      int[] intArray0 = zipfDistribution0.sample(2);
      //  // Unstable assertion: assertArrayEquals(new int[] {1, 2}, intArray0);
  }
}
