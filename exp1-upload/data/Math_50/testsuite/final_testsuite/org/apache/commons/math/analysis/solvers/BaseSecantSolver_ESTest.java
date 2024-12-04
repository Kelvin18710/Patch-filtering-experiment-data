package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.StepFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.function.Acosh;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(311.1710738, 1422.97494906);
      Logistic logistic0 = new Logistic(311.1710738, 1422.97494906, 8388607, 1422.97494906, 1422.97494906, 311.1710738);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(8388607, univariateRealFunction0, 0.0, 0.0, 0.0, allowedSolution0);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Logit logit0 = new Logit((-1845.352552184895), 936903171);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(936903171, univariateRealFunction0, (-2210.260045145), 0.0, Double.POSITIVE_INFINITY, allowedSolution0);
      assertEquals(Double.POSITIVE_INFINITY, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1845.3525521848894), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 0.11113807559013367;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) polynomialFunction0, 0.11113807559013367, 0.0, 318.346151);
      assertEquals(318.346151, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(1982, (UnivariateRealFunction) abs0, (double) 0, (double) 0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(974.9096328211726);
      Sigmoid sigmoid0 = new Sigmoid(1314, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(144, (UnivariateRealFunction) sigmoid0, 1112.0, 1024.0, (-213.6328645414), allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-213.6328645414), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1112.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(530.1177782254);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2146627735, (UnivariateRealFunction) sinc0, (-1.7976931348623157E308), (-853.79277037), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(906, (UnivariateRealFunction) expm1_0, (-1.0), 1.633123935319537E16, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (906) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2146627735, (UnivariateRealFunction) sinc0, (double) 2146627735, (double) 2146627735, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,146,627,735, 2,146,627,735]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(530.1383433465281);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(181, (UnivariateRealFunction) sinc0, (-4140.4508054848), 1564.3317088487947, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-4,140.451, 1,564.332], values: [-0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3960308, (UnivariateRealFunction) atan0, (-1686.0), (double) 3960321, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(33160449, (UnivariateRealFunction) log10_0, 1.5830993332061267E-10, (double) 33160449, 1.5830993332061267E-10, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-255), (UnivariateRealFunction) expm1_0, (double) (-255), (double) (-255), (double) (-255), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-255) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(47, (UnivariateRealFunction) asin0, (double) 47, (double) 47, (double) 47, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [47, 47]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(24, (UnivariateRealFunction) null, (double) 24, (double) 24, (double) 24, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log log0 = new Log();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1925, (UnivariateRealFunction) log0, 1.0E-6, (double) 1925, (double) 1925);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(632, (UnivariateRealFunction) expm1_0, (-1464.0583764), 1009.86634, (-1.855715827470042E10));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (632) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(407, (UnivariateRealFunction) tan0, (double) 407, (double) 407, (double) 407);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [407, 407]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-501), (UnivariateRealFunction) null, (double) (-501), (double) (-501), (double) (-501));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.solve(2146627735, (UnivariateRealFunction) sinc0, (-1.7976931348623157E308), (-853.79277037), allowedSolution0);
      illinoisSolver0.doSolve();
      // Undeclared exception!
      illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      pegasusSolver0.setup(4, gaussian0, 4, 4, 1.1921056801463227E-8);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Power power0 = new Power(14);
      pegasusSolver0.setup(14, power0, (-1423.27994762152), 748.04, 14);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,423.28, 748.04], values: [139,979,561,799,243,570,000,000,000,000,000,000,000,000,000, 17,177,007,356,989,665,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(406, (UnivariateRealFunction) sinc0, (-19.343444415021402), (double) 406, allowedSolution0);
      assertEquals(193.3282777924893, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(386.41589639154176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(403, (UnivariateRealFunction) sinc0, (double) 403, 1523.6724369910498, 2.180564266267538, allowedSolution0);
      assertEquals(2.180564266267538, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1523.6724369910498, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(406, (UnivariateRealFunction) sinc0, (-2327.61), (double) 406, allowedSolution0);
      assertEquals((-960.8050000000001), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1407.4335085019538), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(406, (UnivariateRealFunction) sinc0, (-0.7853981633974483), (double) 406, allowedSolution0);
      assertEquals((-0.7853981633974483), illinoisSolver0.getMin(), 0.01);
      assertEquals(405.26545230380924, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(611, (UnivariateRealFunction) sinc0, 85.11892293717659, (double) 611, allowedSolution0);
      assertEquals(85.11892293717659, illinoisSolver0.getMin(), 0.01);
      assertEquals(389.55748904513774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(403, (UnivariateRealFunction) sinc0, 1569.5690348005958, 2590.8287, allowedSolution0);
      assertEquals(1569.5690348005958, illinoisSolver0.getMin(), 0.01);
      assertEquals(2243.0971546630985, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(406, (UnivariateRealFunction) sinc0, (-1.0), (double) 406, allowedSolution0);
      assertEquals((-1.0), illinoisSolver0.getMin(), 0.01);
      assertEquals(405.26545231312906, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(403, (UnivariateRealFunction) sinc0, (double) 403, 1073.172749937, allowedSolution0);
      assertEquals(403.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(807.3893119725768, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(611, (UnivariateRealFunction) sinc0, (double) 611, 1570.1018696768504, allowedSolution0);
      assertEquals(611.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(1479.6901398407924, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(408, (UnivariateRealFunction) sinc0, (-1.0), (double) 408, allowedSolution0);
      assertEquals((-1.0), illinoisSolver0.getMin(), 0.01);
      assertEquals(405.2654523130834, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(35354, (UnivariateRealFunction) tan0, 3490.76163, (double) 35354, (double) 35354);
      assertEquals(35354.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3495.0218273465666, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      double double0 = illinoisSolver0.solve(187, (UnivariateRealFunction) ceil0, (-2530.661439372857), (double) 187, (double) 187);
      assertEquals(187.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.04552416736262899), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(406, (UnivariateRealFunction) sinc0, (-1.0), (double) 406, (-1.0));
      assertEquals((-1.0), illinoisSolver0.getMin(), 0.01);
      assertEquals(405.2654523130833, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-1.0), (-1.0));
      assertEquals((-1.0), pegasusSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(3960384, (UnivariateRealFunction) atan0, (-24.08074), (double) 3960384, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(151, (UnivariateRealFunction) expm1_0, (-635.263989549676), 0.003360119092037365, (double) 4);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (151) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2541, (UnivariateRealFunction) expm1_0, (double) 42, 0.0, allowedSolution0);
      assertEquals(21.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.400536423840393, 297, 2.400536423840393);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(297, (UnivariateRealFunction) sinc0, (-619.1409), (-191.0), 322.4807520368254, allowedSolution0);
      assertEquals(322.4807520368254, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-191.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      double double0 = illinoisSolver0.solve(30698571, (UnivariateRealFunction) expm1_0, (-970.3885233071568), 0.09090909090909091, 1188.838574);
      assertEquals(1188.838574, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.834903087318557E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(937.71061338);
      Sigmoid sigmoid0 = new Sigmoid();
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(Integer.MAX_VALUE, univariateRealFunction0, 937.71061338, (-1.0), 2786.551837, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(2786.551837, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(937.71061338, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.016424579515942082);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(284, (UnivariateRealFunction) inverse0, (-354.24764984), 5633.2378, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(2639.49507508, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.0016053372421999182), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2501.72304041263), (-2501.72304041263), (-2501.72304041263));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1001291260, (UnivariateRealFunction) sinc0, (-2501.72304041263), (double) 1001291260, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2173.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2463), (UnivariateRealFunction) sinc0, 2692.3449041264535, 2692.3449041264535, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,463) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) tan0, (double) 2, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-794), (UnivariateRealFunction) null, (double) (-794), (double) (-794), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2022, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2022, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(2066, (UnivariateRealFunction) log1p0, (-1.0), 1643.805225121, (-2859.54560457), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5.0767965534781645, (-1196.81245161143), 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1706), (UnivariateRealFunction) expm1_0, (-157.154125), (-3069.097777244), 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,706) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.400536423840393, 297, 2.400536423840393);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1263, (UnivariateRealFunction) sinc0, 6.139714100000008E7, (-3264.257672825254), (-301.4), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [61,397,141, -3,264.258]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2596), (UnivariateRealFunction) null, (double) (-2596), (double) (-2596), (double) (-2596), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), 0.0, (-1.0));
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      pegasusSolver0.solve(1001291260, (UnivariateRealFunction) sinc0, 0.0, (double) 1001291260, (-1.0));
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) ceil0, (double) 2, (double) 2, (double) 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1905.643319532);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(4, (UnivariateRealFunction) expm1_0, 3.0, 347.600662408, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [3, 347.601], values: [19.086, 9,142,176,250,167,028,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      illinoisSolver0.setup(6076, ceil0, 2711.410020273, 2711.410020273, 9.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,711.41, 2,711.41]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2066, allowedSolution0);
      assertEquals(19.375956621613497, pegasusSolver0.getMin(), 0.01);
      assertEquals(2031.4480816817243, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(27.373100031654076, 27.373100031654076);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, 27.373100031654076, (double) 2066, allowedSolution0);
      assertEquals(27.373100031654076, pegasusSolver0.getMin(), 0.01);
      assertEquals(2034.7945006832017, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2066, allowedSolution0);
      assertEquals(19.375956621613497, pegasusSolver0.getMin(), 0.01);
      assertEquals(2031.4480816817243, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2066, allowedSolution0);
      assertEquals(19.375956621613497, pegasusSolver0.getMin(), 0.01);
      assertEquals(2031.4480816817243, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-0.3718301849440401));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, (-0.3718301849440401), (double) 2066, allowedSolution0);
      assertEquals((-0.3718301849440401), pegasusSolver0.getMin(), 0.01);
      assertEquals(2064.0263734084942, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, (-1.0), (double) 2066, allowedSolution0);
      assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
      assertEquals(2064.0263734084942, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2022, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2022, allowedSolution0);
      assertEquals(19.375956621613497, pegasusSolver0.getMin(), 0.01);
      assertEquals(1987.2172382900658, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2072, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2072, allowedSolution0);
      assertEquals(1045.6879783108068, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(19.375956621613497, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Cos cos0 = new Cos();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(186, (UnivariateRealFunction) cos0, 19.632914050063107, (double) 186, 19.632914050063107);
      assertEquals(19.632914050063107, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(32.98672286269283, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Minus minus0 = new Minus();
      double double0 = illinoisSolver0.solve(2228, (UnivariateRealFunction) minus0, (-4652.0), (double) 2228, (double) 2228);
      assertEquals(2228.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5.0767965534781645, (-1196.81245161143), 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(8, (UnivariateRealFunction) expm1_0, (-1196.81245161143), 0.0, 541.24655123, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(541.24655123, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(20.350385728361346, 20.350385728361346);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2066, (UnivariateRealFunction) sinc0, 20.350385728361346, (double) 2066, allowedSolution0);
      assertEquals(20.350385728361346, pegasusSolver0.getMin(), 0.01);
      assertEquals(2047.584783799494, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(19.375956621613497, 19.375956621613497, 19.375956621613497);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2065, (UnivariateRealFunction) sinc0, 19.375956621613497, (double) 2065, allowedSolution0);
      assertEquals(19.375956621613497, pegasusSolver0.getMin(), 0.01);
      assertEquals(19.375956621613497, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      illinoisSolver0.solve(758822, (UnivariateRealFunction) cos0, (-3204.466266), (double) 758822, (-3204.466266));
  }
@Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(203, (UnivariateRealFunction) tanh0, (-1347.142), 5.851334615900871E-242, allowedSolution0);
      assertEquals((-673.571), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.87672728251803E-239), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(459, (UnivariateRealFunction) tan0, 0.0, 2945.552192, 1273.5299, allowedSolution0);
      assertEquals(1273.5299, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1018553199, (UnivariateRealFunction) tanh0, (-330.68123715), 1239.790538, 2325.454382393476, allowedSolution0);
      assertEquals(2325.454382393476, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.99060340157005E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2354.009158085728));
      double double0 = illinoisSolver0.solve(207, (UnivariateRealFunction) tanh0, (-493.066597248), (double) 1018553199, 0.875);
      assertEquals(0.875, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-9.705836808490323E-21), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.4612676883679927, (-0.012120852773195728), (-0.15677601939257704));
      illinoisSolver0.solve(312, (UnivariateRealFunction) tanh0, (double) 0, 407.900029387, (double) 312);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(312.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(1018553199, (UnivariateRealFunction) tanh0, (-36.16482269273822), 1239.790538, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(601.8128576536309, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.1845960583646484E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(8, (UnivariateRealFunction) exp0, (double) 8, (-864.2174), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-428.1087), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-864.2174), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      pegasusSolver0.solve(1073654032, (UnivariateRealFunction) sinh0, (-9.280757765557219), (double) 1073654032, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) tanh0, 1.0E-6, 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1018553199, (UnivariateRealFunction) tanh0, (-0.4349908665898268), (-0.4349908665898268), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0.435, -0.435]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, (-1.0), (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1073654042, (UnivariateRealFunction) tanh0, (-0.968888108365414), (double) 1073654042, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      pegasusSolver0.solve(3795, (UnivariateRealFunction) expm1_0, (-2.945241492168958E-38), (double) 3795, (double) 3795, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit((-1002127139), (-1002127139));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1002127139), (UnivariateRealFunction) logit0, (double) (-1002127139), (double) (-1002127139), (double) (-1002127139), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,002,127,139) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(977.33357754);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(60, (UnivariateRealFunction) tanh0, (-1.0), (-957626.5885152116), (-957626.5885152116), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1, -957,626.589]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2148), (UnivariateRealFunction) null, (double) (-2148), (double) (-2148), (double) (-2148), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      regulaFalsiSolver0.solve(475020177, (UnivariateRealFunction) sinh0, (-3523.9357542), 0.7622924977256492, (-3.141592653589793));
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power((-1986));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1986), (UnivariateRealFunction) power0, (double) (-1986), (double) (-1986), (double) (-1986));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,986) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(226, (UnivariateRealFunction) sigmoid0, (double) 226, (double) 226, (double) 226);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [226, 226]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2, (UnivariateRealFunction) null, (double) 2, (double) 2, (double) 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) 76092763;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      regulaFalsiSolver0.setup(76092763, univariateRealFunction0, (-1325.3379179220901), 76092763, 7.6092763E7);
      // Undeclared exception!
      regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-664.4249671), 3280.128780523, (-747.6));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      regulaFalsiSolver0.setup(4, expm1_0, 4, 4, 4);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      illinoisSolver0.setup(275, floor0, 275, 3353.6916067, 3353.6916067);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [275, 3,353.692], values: [275, 3,353]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1948, (UnivariateRealFunction) tanh0, (-0.01640273942), 0.19999954120254515, allowedSolution0);
      assertEquals(0.09179840089127259, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.9034457987826774E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1118, (UnivariateRealFunction) tanh0, (-8.0E298), 0.06656807650226257, (double) 1118, allowedSolution0);
      assertEquals(1118.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.3470709703135406E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(251, (UnivariateRealFunction) tanh0, (-1661.796954487235), (double) 251, allowedSolution0);
      assertEquals((-705.3984772436175), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.1365463770335906E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(230, (UnivariateRealFunction) tanh0, (-0.4349908665898268), (double) 230, allowedSolution0);
      assertEquals(114.78250456670509, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.216121567145354E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1018553236, (UnivariateRealFunction) tanh0, (-0.4349908665898268), (double) 1018553236, allowedSolution0);
      assertEquals(5.0927661778250456E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.1563039527673225E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(151, (UnivariateRealFunction) tanh0, (-161.7705104), (double) 151, allowedSolution0);
      assertEquals((-5.385255199999989), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.2070919220706773E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1073654032, (UnivariateRealFunction) tanh0, (-0.4349908665898268), (double) 1073654032, allowedSolution0);
      assertEquals(5.3682701578250456E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.2378225758641012E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(203, (UnivariateRealFunction) tanh0, (-3415.8), (double) 203, allowedSolution0);
      assertEquals((-1606.4), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.514075255668769E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(203, (UnivariateRealFunction) tanh0, (-1095.8757701336253), (double) 203, allowedSolution0);
      assertEquals((-446.43788506681267), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.5173227612434023E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Minus minus0 = new Minus();
      double double0 = illinoisSolver0.solve(3, (UnivariateRealFunction) minus0, (-3514.5399240526194), (double) 3, (double) 3);
      assertEquals(3.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.440892098500626E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1073654013, (UnivariateRealFunction) tanh0, (-0.35937333), (double) 1073654013, allowedSolution0);
      assertEquals(5.3682700632031333E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.5480699099168482E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1118, (UnivariateRealFunction) tanh0, (-4.9014241771513694E-34), (double) 1118, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-0.009650548613583642), 2721);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.041666666666621166, 0.041666666666621166, 1103.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-0.009650548613583642), 4250.0, (-3076.548898), allowedSolution0);
      assertEquals((-3076.548898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2835.287551503903, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Floor floor0 = new Floor();
      double double0 = illinoisSolver0.solve(2, (UnivariateRealFunction) floor0, 0.0, 2201.64, 1366.095243);
      assertEquals(1366.095243, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(929.80820148314, 2721, 2721);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0E-6, 3.4517999309617897, 1.0E-15);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(1889, (UnivariateRealFunction) harmonicOscillator0, (-449.39922), 389.04613, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-30.176545000000033), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-449.39922), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-1195.27443251792), 2721);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1312145731, (UnivariateRealFunction) harmonicOscillator0, (-1195.27443251792), (double) 1312145731, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 929.80820148314);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1203.2494556932113), 1429.0676523558866, 1815.4306120985);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) harmonicOscillator0, 1815.4306120985, 796.797733, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,815.431, 796.798]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(251, (UnivariateRealFunction) null, (double) 251, (double) 251, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-1195.27443251792), 2721);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-1195.27443251792), (double) 2721, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(181061537, (UnivariateRealFunction) expm1_0, (-695.8), 1002.50328827727, (double) 181061537, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1023), (UnivariateRealFunction) floor0, (double) (-1023), (double) (-1023), (double) (-1023), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,023) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5703, (UnivariateRealFunction) rint0, (double) 5703, (double) 5703, (double) 5703, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5,703, 5,703]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(302, (UnivariateRealFunction) null, (double) 302, (double) 302, (double) 302, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      regulaFalsiSolver0.solve(908866, (UnivariateRealFunction) expm1_0, (-3676.02741837446), 2628.7, 0.0036);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-763), (UnivariateRealFunction) exp0, (double) (-763), (double) (-763), (double) (-763));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-763) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2393, (UnivariateRealFunction) exp0, (double) 2393, (double) 2393, (double) 2393);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,393, 2,393]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2560098), (UnivariateRealFunction) null, (double) (-2560098), (double) (-2560098), (double) (-2560098));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 3;
      StepFunction stepFunction0 = new StepFunction(doubleArray0, doubleArray0);
      illinoisSolver0.setup(3, stepFunction0, (-2.8030698935969793), 3.0, 0.0032412316504633054);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2.803, 3], values: [3, 3]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-1195.27443251792), 2721);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-1195.27443251792), (double) 2721, allowedSolution0);
      assertEquals(762.86278374104, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2676.2684593382037, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, 7.598397185261547, 2721);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, 7.598397185261547, (double) 2721, allowedSolution0);
      assertEquals(1364.2991985926308, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.5988002064654765, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-1195.27443251792), 2721);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-1195.27443251792), (double) 2721, allowedSolution0);
      assertEquals(762.86278374104, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2676.2684593382037, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-1195.27443251792), 2721);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-1195.27443251792), 2.7553817452272217E-6, allowedSolution0);
      assertEquals((-597.6372148812692), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1002.0519752165792), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2721, (-0.009650548613583642), (-1195.27443251792));
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2.7553817452272217E-6, 0.034, 0.034);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) harmonicOscillator0, (-1741.307300465198), 0.034, allowedSolution0);
      assertEquals((-870.636650232599), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-966.0819347557846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1209.9835198552857));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2733, (UnivariateRealFunction) expm1_0, (-1209.9835198552857), 1.0E-6, allowedSolution0);
      assertEquals((-604.9917594276428), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.16566E-318, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1201.5149430452407));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(183, (UnivariateRealFunction) expm1_0, (-1201.5149430452407), 4.504392193227776E-199, allowedSolution0);
      assertEquals((-600.7574715226203), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-5.40759013730627E-196), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1203.2494556932113));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2738, (UnivariateRealFunction) expm1_0, (-1203.2494556932113), 1.0E-6, allowedSolution0);
      assertEquals((-601.6247273466056), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.0062233863186997E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1201.515));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(182, (UnivariateRealFunction) expm1_0, (-1201.515), 1.570796251296997, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (182) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0E-6, 1.0E-6, 0.0);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(178, univariateRealFunction0, (-947.394149), 1.0E-6, 492.5475263331987, allowedSolution0);
      assertEquals(492.5475263331987, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2703, 2703, 2703);
      PegasusSolver pegasusSolver0 = new PegasusSolver(2703, 438.3780208, 2455.1360599257);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2703, (UnivariateRealFunction) harmonicOscillator0, (-2142.9153581), (double) 2703, 1.0E-6, allowedSolution0);
      assertEquals(1.0E-6, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2142.9153581), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1201.5149430452407));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(220, (UnivariateRealFunction) expm1_0, (-1201.5149430452407), 1.0, allowedSolution0);
      assertEquals((-600.2574715226203), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-9.153904514519563E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(956, (UnivariateRealFunction) cos0, (-4098.499), (double) 956, (-2.1942770730481585E-201));
      assertEquals((-2.1942770730481585E-201), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3582.986421419159), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0E-6, 1.0E-6, 0.0);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(178, univariateRealFunction0, (-947.394149), 1.0E-6, 492.5475263331987, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(492.5475263331987, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3233, (UnivariateRealFunction) sinh0, (double) 3233, -0.0, allowedSolution0);
      assertEquals(3233.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = regulaFalsiSolver0.solve(4229, (UnivariateRealFunction) gaussian0, (double) 4229, (double) 4229, (double) 4229);
      assertEquals(4229.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4229.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      double double0 = illinoisSolver0.solve(868, (UnivariateRealFunction) inverse0, (-1.0), (double) 868, (-2189.54217367784));
      assertEquals((-2189.54217367784), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-8.776641739877461E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1750.28), (-1750.28));
      Floor floor0 = new Floor();
      illinoisSolver0.setup(746, floor0, (-1750.28), (-1750.28), (-1750.28));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,750.28, -1,750.28]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(929.80820148314, 2721, 2721);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(2721, (UnivariateRealFunction) expm1_0, (-1195.27443251792), 1.0E-6, allowedSolution0);
      regulaFalsiSolver0.doSolve();
  }
@Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(98, (UnivariateRealFunction) identity0, (-0.49999999999999994), (double) 98, allowedSolution0);
      assertEquals(48.75, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.2, (-2718.26781857));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2452, (UnivariateRealFunction) sin0, 0.0, (-2718.26781857), (-1778.74160606994), allowedSolution0);
      assertEquals((-1778.74160606994), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(9.313225746154785E-10);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(506923378, (UnivariateRealFunction) inverse0, (-0.13398110321081647), 1.0868823918296335E-306, (double) 506923378, allowedSolution0);
      assertEquals(5.06923378E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.879145296844524E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Rint rint0 = new Rint();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
      regulaFalsiSolver0.solve(1079, (UnivariateRealFunction) rint0, 0.0, 0.7937005259840998, 0.5);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2337.8);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(194, (UnivariateRealFunction) inverse0, (-3034.09), 2337.8, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-348.145), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(945.220000000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(179.89713328614795, 179.89713328614795);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1043, (UnivariateRealFunction) sinc0, (-2816.067835), 803.1848, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1006.4415174999999), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2816.067835), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2147483626, (UnivariateRealFunction) expm1_0, (-1280.76202564059), (double) 2147483626, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Acos acos0 = new Acos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2512), (UnivariateRealFunction) acos0, (double) (-2512), (double) (-2512), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,512) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(857.848744128, (-8.0E298), 1517.304583129691);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1043, (UnivariateRealFunction) sinc0, 0.13324, (-156.1004), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.133, -156.1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(91, (UnivariateRealFunction) null, (double) 91, (double) 91, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1905, (UnivariateRealFunction) sinc0, 0.13324, 10.0, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2147483626, (UnivariateRealFunction) expm1_0, (-7.550225817622189E-305), (double) 2147483626, 2.3442132420477412E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-551), (UnivariateRealFunction) inverse0, (double) (-551), (double) (-551), (double) (-551), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-551) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(776.787738358466, 776.787738358466);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(316, (UnivariateRealFunction) inverse0, 776.787738358466, 6.283185307179586, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [776.788, 6.283]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-3777), (UnivariateRealFunction) null, (double) (-3777), (double) (-3777), (double) (-3777), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Cos cos0 = new Cos();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.8214748694041877E-257, 1.0E-15);
      // Undeclared exception!
      illinoisSolver0.solve(2142138131, (UnivariateRealFunction) cos0, 2.8214748694041877E-257, (double) 5024, (-3748.398248339804));
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-522801), (UnivariateRealFunction) sin0, (double) (-522801), (double) (-522801), (double) (-522801));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-522,801) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(82, (UnivariateRealFunction) exp0, (double) 82, (double) 82, (double) 82);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [82, 82]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(179.89713328614795, 179.89713328614795);
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1612, (UnivariateRealFunction) sinc0, (-2816.067835), (-4.096164368798465E-29), 2602.762760189);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,816.068, -0], values: [0, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asin asin0 = new Asin();
      illinoisSolver0.setup(1060297116, asin0, 1060297116, 1060297116, 1060297116);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,060,297,116, 1,060,297,116]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit((-691.0), 2036.0);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      pegasusSolver0.setup(4664, univariateRealFunction0, 4664, 3.649879958553357E11, (-691.0));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [4,664, 364,987,995,855.336], values: [-0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(506923378);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(506923378, (UnivariateRealFunction) inverse0, (-1889.8307), (double) 506923378, allowedSolution0);
      assertEquals(2.5346074408464998E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1889.8307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(5050, (UnivariateRealFunction) cos0, 0.0, (double) 5050, allowedSolution0);
      assertEquals(2525.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5046.968597992003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(30, (UnivariateRealFunction) sinc0, 0.10526403784751892, (double) 30, allowedSolution0);
      assertEquals(15.05263201892376, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(28.27433388227009, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(217, (UnivariateRealFunction) cos0, 89.5353906273091, (double) 217, (-811.69556), allowedSolution0);
      assertEquals((-811.69556), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(89.53539062731025, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(260, (UnivariateRealFunction) sinc0, (double) 260, (double) 506923424, allowedSolution0);
      assertEquals(2.53461842E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.069231588579446E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(506923389, (UnivariateRealFunction) sinc0, (-218.15578417328004), (double) 506923389, allowedSolution0);
      assertEquals(2.5346158542210793E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.069232939464287E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(506923378, (UnivariateRealFunction) sinc0, (-1889.8307), (double) 506923378, allowedSolution0);
      assertEquals(2.5346074408464998E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.069034767799699E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(506923389, (UnivariateRealFunction) sinc0, (-216.9281030824128), (double) 506923389, allowedSolution0);
      assertEquals(2.5346158603594846E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.068841748347063E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(2147483626, (UnivariateRealFunction) expm1_0, (-1280.76202564059), 5.899710779309062E-308, allowedSolution0);
      assertEquals((-640.381012820295), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-7.550225817622189E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = pegasusSolver0.solve(1148, (UnivariateRealFunction) cbrt0, (-2747.874605090965), (double) 1148, (-2747.874605090965));
      assertEquals((-2747.874605090965), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.728087520602835E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Rint rint0 = new Rint();
      double double0 = illinoisSolver0.solve(2147481336, (UnivariateRealFunction) rint0, (-544.564531), (double) 2147481336, (-544.564531));
      assertEquals((-544.564531), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.4354689121246338, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Rint rint0 = new Rint();
      double double0 = pegasusSolver0.solve(156, (UnivariateRealFunction) rint0, (double) 156, 0.3999999761581421, 0.3999999761581421);
      assertEquals(156.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.3999999761581421, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(506923424, (UnivariateRealFunction) sinc0, 0.0, (double) 506923424, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1212, (UnivariateRealFunction) atan0, 0.0, (double) 1212, allowedSolution0);
      assertEquals(606.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(596.565287, 596.565287, 596.565287);
      Logit logit0 = new Logit(596.565287, 0.0);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(745, univariateRealFunction0, 4.5078999257525746E-13, 1964.7637715646688, allowedSolution0);
      assertEquals(982.3818857823346, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1964.7637715646686, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(596.565287, 596.565287, 596.565287);
      Logit logit0 = new Logit(596.565287, 0.0);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(745, univariateRealFunction0, (-2711.8064), 0.6061118554972152, allowedSolution0);
      assertEquals((-1355.6001440722514), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2711.6971970008026), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(9, (UnivariateRealFunction) log1p0, 0.0, 0.0, 1.1921056801463227E-8, allowedSolution0);
      assertEquals(1.1921056801463227E-8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(161.0, (-1580.19894689), 0.0644405329958204);
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) atan0, (double) (-2420), 515.417935541324, 1212.0);
      assertEquals(1212.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-951.5771285139496), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 596.565287, 0.0);
      Power power0 = new Power(1.0);
      illinoisSolver0.solve(2007, (UnivariateRealFunction) power0, 0.0, 0.0, 3236.75);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(3236.75, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinc sinc0 = new Sinc();
      pegasusSolver0.solve(295, (UnivariateRealFunction) sinc0, 1.0E-6, (double) 295, (-3625.5434641645793));
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-3625.5434641645793), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(248.18581963359367, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1031, 0, 0.0);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      regulaFalsiSolver0.solve(1031, univariateRealFunction0, (-250.175), (-3137.30967285442));
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1693.74233642721), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-250.175), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1), (UnivariateRealFunction) logit0, (double) (-1), (double) (-1), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-4318.8), 1156.3126030826);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, 14.0, 1156.3126030826, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(149540598, (UnivariateRealFunction) sinc0, 1061.1874722409327, (double) 1272, (-2016.301433), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(350, (UnivariateRealFunction) tan0, (-692.477834), 1.0E-6, (-1580.19894689), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (350) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(255, (UnivariateRealFunction) identity0, (double) 255, (double) 255, (double) 255, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [255, 255]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1731, (UnivariateRealFunction) null, (double) 1731, (double) 1731, (double) 1731, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1452469, (UnivariateRealFunction) cos0, 803.10259, (double) 1452469, 803.10259);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1110182580, (UnivariateRealFunction) asinh0, 1104.0724408, 596.565287, 3.814697265625E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,104.072, 596.565]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(295, (UnivariateRealFunction) sinc0, 1.0, 1309.81040491081, 2.6376459444383897);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 1,309.81], values: [0.841, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      regulaFalsiSolver0.setup(2, ulp0, 2, 2, 2);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      regulaFalsiSolver0.setup(237, tan0, 237, 1074.92729, 1074.92729);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [237, 1,074.927], values: [5.193, 0.55]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(365, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 365, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.4424221275434493E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(353, (UnivariateRealFunction) atan0, (-1580.2), (double) 353, (-1580.2), allowedSolution0);
      assertEquals((-1580.2), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.1734140266540089E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(322, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 322, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.1029800437756027E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(339, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 339, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.6048500738012713E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 350, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.2527562740517417E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(347, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 347, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.8155574782906555E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 350, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.2527562740517417E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(360, (UnivariateRealFunction) atan0, (-1570.349953635164), (double) 360, (-1570.349953635164), allowedSolution0);
      assertEquals((-1570.349953635164), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.5771845959855268E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(343, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 343, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(6.786387728358913E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 350, (-1580.19894689), allowedSolution0);
      assertEquals((-1580.19894689), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.7526862861440631E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(360, (UnivariateRealFunction) atan0, (-1570.349953635164), (double) 360, (-1570.349953635164), allowedSolution0);
      assertEquals((-1570.349953635164), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.194382350828196E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(350, 350, 350);
      double double0 = illinoisSolver0.solve(2246, (UnivariateRealFunction) atan0, (-523.59), (double) 2246, (-523.59), allowedSolution0);
      assertEquals((-523.59), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-523.59), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1579, (UnivariateRealFunction) log0, 0.0, (double) 1579, 0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,579) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1580.19894689), (-1580.19894689), (-1580.19894689));
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) atan0, (-1580.19894689), (double) 350, (double) 350);
      assertEquals(350.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      regulaFalsiSolver0.solve(197, (UnivariateRealFunction) floor0, (double) 197, 2.3841810913748156E-16, (double) 197);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(596.565287, 596.565287, 596.565287);
      Logit logit0 = new Logit(596.565287, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(745, (UnivariateRealFunction) logit0, (-2711.8064), 0.6061118554972152, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,711.806 out of [596.565, 0] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }
@Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power(8.251545029714408E-9);
      double double0 = illinoisSolver0.solve(3722, (UnivariateRealFunction) power0, (double) 0, 8.251545029714408E-9, 2398.0);
      assertEquals(2398.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Log1p log1p0 = new Log1p();
      regulaFalsiSolver0.solve(516, (UnivariateRealFunction) log1p0, 0.0, (double) 516, 0.0, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(1059, (UnivariateRealFunction) sinc0, (double) 1059, 2132.6722329, 85.0, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(85.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1413.7166941194841, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2132.6722329, (-1185.7983775510538), (-2480.2109688803));
      regulaFalsiSolver0.solve(18, (UnivariateRealFunction) sinc0, (-2480.2109688803), 1370.7820503, (-1.0), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2480.2109688803), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1073741824, (UnivariateRealFunction) sinc0, 2132.2458338790098, (double) 1073741824, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1887, (UnivariateRealFunction) asin0, (double) 1887, (double) 1887, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,887, 1,887]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2132.6722329, (-7.800414592973399E-9), 1.0);
      Logistic logistic0 = new Logistic(2132.6722329, 0.3989422804014327, 2132.6722329, 2132.6722329, (-7.800414592973399E-9), 4289.6);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1073733433, (UnivariateRealFunction) logistic0, 1.0, 2132.6722329, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 2,132.672], values: [2,132.672, 2,132.672]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log1p log1p0 = new Log1p();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1658, (UnivariateRealFunction) log1p0, (-0.0020714778817480834), 2103.0314757251467, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2146225678, (UnivariateRealFunction) sinc0, (-373.592), (double) 2146225678, 1.3397531164136255E9, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1663, (UnivariateRealFunction) sinc0, (double) 1663, 2132.6722329, 2132.6722329, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,663) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5, (UnivariateRealFunction) tan0, (double) 5, (double) 5, (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-579), (UnivariateRealFunction) null, (double) (-579), (double) (-579), (double) (-579), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      pegasusSolver0.solve(3539, (UnivariateRealFunction) sinh0, (-81.02962410356), (double) 3539, (-1.0645898018078128E-12));
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2132.6722329, (-7.800414592973399E-9), 1.0);
      Logistic logistic0 = new Logistic(2132.6722329, 0.3989422804014327, 2132.6722329, 2132.6722329, (-7.800414592973399E-9), 4289.6);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2706, (UnivariateRealFunction) logistic0, 1.0E-6, (-1411.9094524), (double) 2706);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,411.909]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2132.6722329, (-7.800414592973399E-9), 1.0);
      Logistic logistic0 = new Logistic(2132.6722329, 0.3989422804014327, 2132.6722329, 2132.6722329, (-7.800414592973399E-9), 4289.6);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(283, (UnivariateRealFunction) logistic0, 1.0, 706.09642, (-7.800414592973399E-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 706.096], values: [2,132.672, 2,132.672]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.setup(6500, sinc0, 6500, 6500, 1.8597837631119987);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [6,500, 6,500]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      regulaFalsiSolver0.setup(813, ulp0, (-708.6), 644.393164, (-708.6));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-708.6, 644.393], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(194, (UnivariateRealFunction) atan0, (-434.17670108486), 1196.495932513411, (double) 194, allowedSolution0);
      assertEquals(194.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.2542116067670763E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, (-0.01092742735212691), (double) 12, allowedSolution0);
      assertEquals(5.994536286323937, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(9.424777960769449, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(204, (UnivariateRealFunction) sinc0, (double) 204, (double) 1707, allowedSolution0);
      assertEquals(955.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(354.99996985564735, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2132.6722329, 2132.6722329);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(18, (UnivariateRealFunction) sinc0, (double) 18, 2132.6722329, allowedSolution0);
      assertEquals(1075.33611645, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2121.980601202411, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1707, (UnivariateRealFunction) sinc0, 6.441512370621743, (double) 1707, allowedSolution0);
      assertEquals(856.7207561853108, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1668.1856985362192, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1681, (UnivariateRealFunction) sinc0, (-3.9168258408536745E-10), (double) 1681, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,681) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Log1p log1p0 = new Log1p();
      double double0 = regulaFalsiSolver0.solve(1658, (UnivariateRealFunction) log1p0, (-0.0020714778817480834), 2135.255798320868, allowedSolution0);
      assertEquals(1067.626863421493, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.57E-322), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1339757553, (UnivariateRealFunction) sinc0, (double) 1707, (double) 1339757553, allowedSolution0);
      assertEquals(6.6987963E8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.3397531164136255E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1707, (UnivariateRealFunction) sinc0, 0.0, (double) 1707, allowedSolution0);
      assertEquals(853.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1705.8848108992577, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(18, (UnivariateRealFunction) sinc0, (double) 18, 2132.6722329, allowedSolution0);
      assertEquals(18.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(2129.9998191338436, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(940, (UnivariateRealFunction) atan0, (-1615.54018779743), (double) 940, (-1615.54018779743));
      assertEquals((-1615.54018779743), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.3567700750430325E-22), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) sinh0, (-1.0), 1998.7, 1998.7);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(168, (UnivariateRealFunction) sinc0, (double) 168, 1114.2719233891632, allowedSolution0);
      assertEquals(168.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(986.4600932271951, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      double double0 = regulaFalsiSolver0.solve(199, (UnivariateRealFunction) ceil0, (-564.805019403483), (double) 199, (double) 199);
      assertEquals(199.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.20995918911287959), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(699, (UnivariateRealFunction) ceil0, (double) 699, 0.0, allowedSolution0);
      assertEquals(699.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian(2732, 2732);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      double double0 = pegasusSolver0.solve(2732, univariateRealFunction0, (double) 2732, (double) 2732, (double) 2732);
      assertEquals(2732.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(2732.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      regulaFalsiSolver0.solve(932, (UnivariateRealFunction) atan0, (-1615.54018779743), (double) 932, (-1615.54018779743));
  }
@Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2751.5);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(837, (UnivariateRealFunction) tanh0, 0.0, 3001.677, (-2131.79185971), allowedSolution0);
      assertEquals((-2131.79185971), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1579.0), (-1579.0));
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      regulaFalsiSolver0.solve(1071, (UnivariateRealFunction) polynomialFunction0, 0.0, 1071.0, 0.0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Cos cos0 = new Cos();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(166, 166);
      illinoisSolver0.setup(166, cos0, 166, 2989.6049576, (-166.729334));
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2149.973753753761, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver(644.9707564401579);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(125, (UnivariateRealFunction) cos0, (-3133.513042), (-0.3449729956939073), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1566.929007497847), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2531.735396709969), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(508728632, (UnivariateRealFunction) sinh0, (-0.8868070146288421), (double) 508728632, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1366), (UnivariateRealFunction) acosh0, (double) (-1366), (double) (-1366), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,366) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1549.2241575474168), 1.6977658404857385, 2875.75563);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Ceil ceil0 = new Ceil();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(280, (UnivariateRealFunction) ceil0, 2875.75563, 1.6977658404857385, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,875.756, 1.698]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2573, (UnivariateRealFunction) null, (double) 2573, (double) 2573, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(26.72475864252111, 401, 26.72475864252111);
      PegasusSolver pegasusSolver0 = new PegasusSolver(26.72475864252111, 401);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(401, (UnivariateRealFunction) harmonicOscillator0, 26.72475864252111, (double) 401, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(3969, (UnivariateRealFunction) cos0, (double) 146, 1517.2, (-551.0666), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid((-1564), (-1564));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1564), (UnivariateRealFunction) sigmoid0, (double) (-1564), (double) (-1564), (double) (-1564), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,564) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2300, (UnivariateRealFunction) sigmoid0, (double) 2300, (double) 2300, (double) 2300, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,300, 2,300]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-668.63), (-655.3947), (-655.3947));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3491, (UnivariateRealFunction) null, 1548.6290484, (-655.3947), 701.94970888, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1312145731, (UnivariateRealFunction) cos0, (-2006.59995983179), (double) 1312145731, (-2006.59995983179));
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-780412705), (UnivariateRealFunction) asinh0, (double) (-780412705), (double) (-780412705), (double) (-780412705));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-780,412,705) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1073, (UnivariateRealFunction) log10_0, 0.9999999319052925, 4.5713055234720755E-12, (double) 1073);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) null, (double) 2, (double) 2, (double) 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1549.224158), (-1549.224158), (-1549.224158));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      regulaFalsiSolver0.setup(3, atan0, 3, 3, 3);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, 3]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      regulaFalsiSolver0.setup(250, sin0, 5.217875096720913E-4, 4103.89309, 250);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.001, 4,103.893], values: [0.001, 0.827]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(447, (UnivariateRealFunction) cos0, (-190.0663555421825), (double) 146, allowedSolution0);
      assertEquals((-22.03317777109126), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-190.06635554217655), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(137, (UnivariateRealFunction) cos0, (-2007.062287614336), (-83.25220532012949), (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-83.25220532019235), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(426, (UnivariateRealFunction) atan0, (-2971.0), (double) 426, (-2971.0), allowedSolution0);
      assertEquals((-2971.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.091321312864473E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(962, (UnivariateRealFunction) inverse0, (-3337.5665), (double) 962, allowedSolution0);
      assertEquals((-1187.78325), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.029960498293832E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(113, (UnivariateRealFunction) cos0, (-2013.6307661046296), (-6.032174644509064E-23), allowedSolution0);
      assertEquals((-1006.8153830523148), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1873.960017931298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      double double0 = regulaFalsiSolver0.solve(137, (UnivariateRealFunction) cos0, (-2007.062287614336), (double) 137, (double) 137);
      assertEquals(137.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-83.25220532012949), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-699.3), (-2946.8483), 1806.78551);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3437, (UnivariateRealFunction) cos0, (-2946.8483), (-699.3), 1806.78551, allowedSolution0);
      assertEquals(1806.78551, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-700.469717148224), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(226, (UnivariateRealFunction) cos0, (-2014.3521317288473), (double) 146, allowedSolution0);
      assertEquals((-934.1760658644237), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(111.52653920243766, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1448, (UnivariateRealFunction) cos0, (-2007.062287614336), (double) 146, (double) 1448, allowedSolution0);
      assertEquals(1448.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(111.52653920242805, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1549.2241575474168), (-1549.2241575474168), 2880.165610350121);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(280, (UnivariateRealFunction) log10_0, 1.0E-6, (double) 280, allowedSolution0);
      assertEquals(140.0000005, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.8874874090495929, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(26.72475864252111, 401, 26.72475864252111);
      PegasusSolver pegasusSolver0 = new PegasusSolver(401, 401, 26.72475864252111);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(401, (UnivariateRealFunction) harmonicOscillator0, 26.72475864252111, (double) 401, allowedSolution0);
      assertEquals(213.86237932126056, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(26.72475864252111, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      double double0 = regulaFalsiSolver0.solve(180, (UnivariateRealFunction) tanh0, (-2.150669592637872E-23), (double) 180, (-2.150669592637872E-23));
      assertEquals((-2.150669592637872E-23), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      double double0 = regulaFalsiSolver0.solve(250, (UnivariateRealFunction) asinh0, (double) 250, 0.0, 0.0);
      assertEquals(250.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(2.356194490192345, (-2020.371384593));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(189, (UnivariateRealFunction) polynomialFunction0, 0.0, 43.16750274062182, allowedSolution0);
      assertEquals(43.16750274062182, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(137, (UnivariateRealFunction) cos0, (-2007.062287614336), 671.992705952, allowedSolution0);
      assertEquals(671.992705952, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-32.98672286267791), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.19999998807907104, (-2112.51483));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(82, (UnivariateRealFunction) atan0, (-1.0), (double) 82, (-2112.51483), allowedSolution0);
      assertEquals((-2112.51483), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.0194839173657902E-28, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      regulaFalsiSolver0.solve(146, (UnivariateRealFunction) cos0, (-2007.062287614336), (double) 146, (double) 146);
  }
}
