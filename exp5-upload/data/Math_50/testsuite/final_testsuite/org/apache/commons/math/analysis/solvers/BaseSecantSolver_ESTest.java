package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.function.Ulp;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2071, (UnivariateRealFunction) ceil0, (-1365.7), 0.0, (double) 2071, allowedSolution0);
      assertEquals(2071.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-2440.7));
      double double0 = illinoisSolver0.solve(139, (UnivariateRealFunction) inverse0, (-2228.3250754), 0.0012457814701690717, 3240.92);
      assertEquals(3240.92, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.0017326553828773683), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-417.529328));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(1560, (UnivariateRealFunction) cbrt0, 3248.3088710611, 0.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1624.15443553055, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-2440.7));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      illinoisSolver0.solve(1530, (UnivariateRealFunction) inverse0, (-2228.3250754), 0.1396726964845086, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1114.0927013517578), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.10293142341428918, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1930, (UnivariateRealFunction) inverse0, (-2228.3250754), 3.141592653589793, 1450.7307838, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1450.7307838, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4.7326648635205883E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(134217729, (UnivariateRealFunction) sinh0, (-542.02156397454), (double) 134217729, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(411, (UnivariateRealFunction) inverse0, (-4938.44887398593), 12.48550640151, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (411) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(411, (UnivariateRealFunction) inverse0, 12.48550640151, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [12.486, 0.5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1970), (UnivariateRealFunction) null, (double) (-1970), (double) (-1970), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2147442889, 2147442889, 2147442889);
      Power power0 = new Power(2147442889);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2147442889, (UnivariateRealFunction) power0, (-1269.407221914585), (double) 2147442889, (-1269.407221914585), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-2228.3250754));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1530, (UnivariateRealFunction) inverse0, (-1.284020854163009E289), 4068.499324, 0.6299605249474366, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,530) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-0.46209812037329684));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1994, (UnivariateRealFunction) inverse0, 0.5, (-0.08221794765045065), (-0.46209812037329684), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -0.082]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2440.7), (-1.0), 1994);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2899940, (UnivariateRealFunction) inverse0, 0.001048930301933417, (double) 2899940, 1031.85, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.001, 2,899,940], values: [953.352, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(43913, (UnivariateRealFunction) inverse0, (-357.835976637), 0.0, (-357.835976637));
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-2440.7));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-338), (UnivariateRealFunction) inverse0, (-225.394910893674), 1032.0607766459054, 1032.163772862063);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-338) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1450.7307838, 1994, 1450.7307838);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1994, (UnivariateRealFunction) inverse0, 0.5, (-2053.7542), (double) 1994);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -2,053.754]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1046), (UnivariateRealFunction) null, (double) (-1046), (double) (-1046), (double) (-1046));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 1.09781260446068E-5, 0.6299605249474366);
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
  public void test_0018()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-4519.51801));
      Tan tan0 = new Tan();
      regulaFalsiSolver0.setup(210, tan0, 210, 210, 0.45426290872637676);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [210, 210]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acos acos0 = new Acos();
      pegasusSolver0.setup(2, acos0, 1233.1930518045, 1767362.5643920251, 2);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,233.193, 1,767,362.564], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1515, (UnivariateRealFunction) tan0, (double) 1515, 6581953.3472497985, allowedSolution0);
      assertEquals(3291734.1736248992, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3932132.0333638974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2051, (UnivariateRealFunction) inverse0, (-1254.473), (double) 2051, (double) 2051, allowedSolution0);
      assertEquals(2051.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-9.342337195748208E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2038, (UnivariateRealFunction) inverse0, (-1254.4730021), (double) 2038, (double) 2038, allowedSolution0);
      assertEquals(2038.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.1332387466758036E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1254.473), (double) 2020, (double) 2020, allowedSolution0);
      assertEquals(2020.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(765.527, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1254.4730021), 0.2, allowedSolution0);
      assertEquals((-627.13650105), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1254.2730021), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1262.8523822310387), (double) 2020, (double) 2020, allowedSolution0);
      assertEquals(2020.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(757.147617768961, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1.5891555333843275E13), 0.5, allowedSolution0);
      assertEquals((-7.945777666921388E12), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.5891555333842773E13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2051, 2051, 2051);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2051, (UnivariateRealFunction) inverse0, (-5921283.256519772), (double) 2051, (-1254.473), allowedSolution0);
      assertEquals((-1254.473), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2051.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1254.4730021), (double) 2020, (double) 2020, allowedSolution0);
      assertEquals(2020.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1254.4730021), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1232.8488629372166), (double) 2020, (-1232.8488629372166));
      assertEquals((-1232.8488629372166), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(787.1511370627834, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2020, 2020, 2020);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2020, (UnivariateRealFunction) inverse0, (-1254.4730021), (double) 2020, (double) 2020, allowedSolution0);
      assertEquals(2020.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1254.4730021), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2228.3250754), 0.6299605249474366, (-2228.3250754));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2228.3250754);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = illinoisSolver0.solve(1530, (UnivariateRealFunction) polynomialFunction0, (-6.131728208244913E-288), 1032.0607766459054, allowedSolution0);
      assertEquals(516.0303883229527, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      double double0 = illinoisSolver0.solve(2522, (UnivariateRealFunction) expm1_0, (double) 2522, 0.0, 0.0);
      assertEquals(2522.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2050, 2050, 2050);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2050, (UnivariateRealFunction) inverse0, (-1.5891555333866389E13), (double) 2050, allowedSolution0);
      assertEquals((-7.945777665908194E12), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2050.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1994, 1994);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Gaussian gaussian0 = new Gaussian();
      illinoisSolver0.solve(92, (UnivariateRealFunction) gaussian0, (double) 92, (double) 92, (double) 92);
  }
@Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1092.9, 2526.2942972069);
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(5, (UnivariateRealFunction) atanh0, 0.0, 2526.2942972069, allowedSolution0);
      assertEquals(1263.14714860345, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.03737573700612217);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1103, (UnivariateRealFunction) sinc0, (-1187.5151337109564), 358.6002720201799, allowedSolution0);
      assertEquals((-414.4574308453882), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-486.94641092551234), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146880520, (UnivariateRealFunction) rint0, (double) 0, (double) 2146880520, 0.03880888997355214, allowedSolution0);
      assertEquals(0.03880888997355214, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-69.5), 1184.3804330474861, 1184.3804330474861);
      regulaFalsiSolver0.solve(158, (UnivariateRealFunction) log1p0, (double) 158, 0.0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(79.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) tan0, (double) 2, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1073741838, (UnivariateRealFunction) sinc0, 0.75, (double) 1073741838, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.75, 1,073,741,838], values: [0.909, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(17, (UnivariateRealFunction) sinc0, (double) 0, (double) 17, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4193, (UnivariateRealFunction) sinh0, (-1845.1822114813), 0.5, 5397.88640519, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) sqrt0, (double) 0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1790, (UnivariateRealFunction) sinc0, (double) 1790, (double) 1790, (double) 1790, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,790, 1,790]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.1818181574344635, (-713.22), 0.1818181574344635);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1103, (UnivariateRealFunction) sinc0, (-2691.0), 3.5415647769165806E-7, (-1187.5151337109564), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,691, 0], values: [0, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-48638330), (UnivariateRealFunction) sinc0, (double) (-48638330), (double) (-48638330), (double) (-48638330));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-48,638,330) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(101, (UnivariateRealFunction) sinc0, (double) 101, (double) 101, (double) 101);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [101, 101]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2256), (UnivariateRealFunction) null, (double) (-2256), (double) (-2256), (double) (-2256));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-933.272));
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
  public void test_0051()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atanh atanh0 = new Atanh();
      illinoisSolver0.setup(1073741824, atanh0, 1073741824, 666.2, 1073741824);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,073,741,824, 666.2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      illinoisSolver0.setup(208, expm1_0, 208, 2240.29, 208);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [208, 2,240.29], values: [2,154,032,421,824,846,500,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.03737573700612217);
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(1103, (UnivariateRealFunction) sinc0, (-1187.5151337109564), 0.03737573700612217, 0.0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1184.3804268047347), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1833.199);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1073741838, (UnivariateRealFunction) sinc0, (-1184.380430403352), 1513.091564329091, 685.0, allowedSolution0);
      assertEquals(685.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1184.3804291938598), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(1103, (UnivariateRealFunction) sinc0, (-1.0), 342.83003347621866, allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(342.4335992412907, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1023, 1023);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1023, (UnivariateRealFunction) sinc0, (double) 1023, 1045417.0758616595, (double) 1023, allowedSolution0);
      assertEquals(1023.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1023.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1023, 1023);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1023, (UnivariateRealFunction) sinc0, 1.0, 1021.913075133587, allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1020.987282560192, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(12, (UnivariateRealFunction) sinc0, (double) 0, (double) 12, allowedSolution0);
      assertEquals(6.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(9.424777961048473, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1067);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1067, (UnivariateRealFunction) sinc0, (-3673.616728863), 3037.17, (-3673.616728863), allowedSolution0);
      assertEquals((-3673.616728863), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2812.8676395899374, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(17, (UnivariateRealFunction) sinc0, (double) 0, (double) 17, allowedSolution0);
      assertEquals(8.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(15.707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(1103, (UnivariateRealFunction) sinc0, (-1.0), (double) 1103, allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1102.6990214100176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(87, (UnivariateRealFunction) sinc0, (double) 0, (double) 87, allowedSolution0);
      assertEquals(43.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(84.82300164692447, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(17, (UnivariateRealFunction) sinc0, (double) 0, (double) 17, allowedSolution0);
      assertEquals(8.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(15.707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2021826773, (UnivariateRealFunction) sinc0, (-0.12502530217170715), (double) 1023, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1023, (UnivariateRealFunction) sinc0, 11.0, 4154.804727458456, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,023) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinc sinc0 = new Sinc();
      double double0 = pegasusSolver0.solve(94, (UnivariateRealFunction) sinc0, (double) 94, 1088.617751976373, (double) 94);
      assertEquals(94.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(829.3804605477054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.setup(1130, sinc0, (-2536.633), 1786.42, 1786.42);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-675.442420521806), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1067, (UnivariateRealFunction) sinc0, 3750.1998306, 8.0E298, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,067) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Rint rint0 = new Rint();
      illinoisSolver0.setup(5, rint0, (-1846.515456), 5, (-1846.515456));
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0013081641468675187, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      double double0 = regulaFalsiSolver0.solve(1035, (UnivariateRealFunction) ceil0, (double) 0, (-1906.980545088298), (-1906.980545088298));
      assertEquals((-1906.980545088298), regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(17, (UnivariateRealFunction) sinc0, (double) 17, 4.503599627370496E15, allowedSolution0);
      assertEquals(17.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1963424137, (UnivariateRealFunction) sinh0, (-0.3058015757857271), 1677.190730043, 2.961276275564605E-11);
  }
@Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.solve(121905, (UnivariateRealFunction) tanh0, (-391.3), (double) 0, 2441.548976686592);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(2441.548976686592, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.solve(721, (UnivariateRealFunction) tanh0, (-351.1457532), 2451.0691320946, 5157987.760843879);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(5157987.760843879, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.591314960024157E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 9.999999999996666E-7);
      Inverse inverse0 = new Inverse();
      regulaFalsiSolver0.solve(2159, (UnivariateRealFunction) inverse0, (double) (-20787394), 127.99998772845485, 0.7937005259840998);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.7937005259840998, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.0787266000012275E7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Power power0 = new Power(735);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(7806, (UnivariateRealFunction) power0, (-351.1457532), (double) 735, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 9.999999999996666E-7);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-4016), (UnivariateRealFunction) inverse0, 0.0, (-4198.228), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,016) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1073741824, (UnivariateRealFunction) sqrt0, (double) 1073741824, (double) 1073741824, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,073,741,824, 1,073,741,824]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3, (UnivariateRealFunction) null, (double) 3, (double) 3, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1443, (UnivariateRealFunction) tanh0, (-351.1457532), (double) 723, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid(4172, (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(4172, (UnivariateRealFunction) sigmoid0, (-1.0), (double) 4172, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) tan0, 3433.1, 2097151.7989430043, 2452.009970818043, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1192.15047);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(168535845, (UnivariateRealFunction) tan0, 591.939202, (-810.7095761173958), (-0.001806537099679186), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [591.939, -810.71]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1555, (UnivariateRealFunction) null, (double) 1555, (double) 1555, (double) 1555, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2143485152, (UnivariateRealFunction) sinh0, (-613.058), (double) 2143485152, (-613.058));
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.06003587443157729, (-351.1457532), 1176.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1633), (UnivariateRealFunction) tanh0, 412.4271234, 0.1818181574344635, 1.6316458925732835E-28);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,633) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(14, (UnivariateRealFunction) tanh0, (double) 1443, (-2.2250738585072014E-308), (double) 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,443, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2143503678, (UnivariateRealFunction) null, (double) 2143503678, (double) 2143503678, (double) 2143503678);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
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
  public void test_0090()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      regulaFalsiSolver0.setup(4, ceil0, 4, 4, 4);
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
  public void test_0091()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(12.0, 1.0312294449677421E-10);
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.setup(1828, tanh0, 1828, 2241.417, 0.5);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,828, 2,241.417], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1226, (UnivariateRealFunction) tanh0, (-185.78), (double) 1226, allowedSolution0);
      assertEquals(520.11, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.690861131431828E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1443, 3433.1);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1443, (UnivariateRealFunction) tanh0, (-3054.84), 1.0, (-3054.84), allowedSolution0);
      assertEquals((-3054.84), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1320.1385140371146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3776, (UnivariateRealFunction) cos0, 3.6348189974406326E-6, 1104.2, 1104.2, allowedSolution0);
      assertEquals(1104.2, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(730.420291959627, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(292788712, (-2629.732), (-2629.732));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(292788712, (UnivariateRealFunction) harmonicOscillator0, (-2629.732), 763.65, (double) 292788712, allowedSolution0);
      assertEquals(2.92788712E8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-437.74917726580725), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(187387039, (UnivariateRealFunction) tanh0, (-1766.2215), (double) 187387039, (double) 239, allowedSolution0);
      assertEquals(239.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(6.429075039557971E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(444, (UnivariateRealFunction) tanh0, (-418.03814477), (double) 444, allowedSolution0);
      assertEquals(12.980927614999985, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.2015929308326452E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(5, (UnivariateRealFunction) tanh0, (-0.46305197607818216), 1.0E-6, (-0.46305197607818216), allowedSolution0);
      assertEquals((-0.46305197607818216), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.04709795924308E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(726, (UnivariateRealFunction) tanh0, (-351.1457532), 1385.0, allowedSolution0);
      assertEquals(516.9271234, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.4602839738858012E-21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(200, (UnivariateRealFunction) tanh0, (-3669.0), 1463.0, (double) 200, allowedSolution0);
      assertEquals(200.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.0540784534145619E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1649, (UnivariateRealFunction) tanh0, (-351.1457532), 1.073741824E9, (-351.1457532), allowedSolution0);
      assertEquals((-351.1457532), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.777304054483395E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(947, (UnivariateRealFunction) sin0, 8.667602107530031E-5, (double) 947, (double) 947);
      assertEquals(947.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(34.55751918948772, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1596, (UnivariateRealFunction) tanh0, (-1624.183145192), 8.667602107530031E-5, allowedSolution0);
      assertEquals((-812.0915292579895), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-7.411538288475128E-22), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(735, (UnivariateRealFunction) expm1_0, (-6771.5), 0.5, allowedSolution0);
      assertEquals((-3385.5), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(872, (UnivariateRealFunction) tanh0, 1313.13541219, 0.0, 0.0, allowedSolution0);
      assertEquals(1313.13541219, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      double double0 = regulaFalsiSolver0.solve(1066302, (UnivariateRealFunction) floor0, 0.1874741311185062, (double) 1066302, (-2990.812));
      assertEquals((-2990.812), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.1874741311185062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(726, (UnivariateRealFunction) tanh0, (-351.1457532), (double) 726, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(234, (UnivariateRealFunction) floor0, (-894.4), 0.0, (double) 234, allowedSolution0);
      assertEquals(234.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-125.452180468611), (-125.452180468611));
      Logistic logistic0 = new Logistic((-125.452180468611), 835, 835, 1.2678903907053032E-4, 1.2678903907053032E-4, 1.2678903907053032E-4);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(835, univariateRealFunction0, (double) 835, (-125.452180468611), (double) 835, allowedSolution0);
      assertEquals(835.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-125.452180468611), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1357.3969185931), (-1357.3969185931), (-1357.3969185931));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(686, (UnivariateRealFunction) atan0, (-1357.3969185931), 1821.593, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(232.0980407034499, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0);
      Gaussian gaussian0 = new Gaussian(1.0E-6, 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(125, (UnivariateRealFunction) gaussian0, 1.0, 1.0E-6, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.5000005000000001, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.17558267316538662, 709, 709);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(709, (UnivariateRealFunction) atan0, (-1.7168146928204135), (double) 709, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(353.6415926535898, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.7168146928204135), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(1939895572, (UnivariateRealFunction) atan0, Double.NEGATIVE_INFINITY, (double) 1939895572, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) atan0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(720);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(720, (UnivariateRealFunction) atan0, (double) 720, (double) 720, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [720, 720]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1908, (UnivariateRealFunction) null, (double) 1908, (double) 1908, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.17558267316538662, 709, 709);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(709, (UnivariateRealFunction) atan0, (-1.7168146928204135), (double) 709, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Power power0 = new Power((-1064424113));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1064424113), (UnivariateRealFunction) power0, (double) (-1064424113), (double) (-1064424113), (double) (-1064424113), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,064,424,113) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(694, (UnivariateRealFunction) null, (-1078.41298), (double) 694, (double) 694, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1288484769, (UnivariateRealFunction) sin0, 538.00986068, (double) 1288484769, 8.142559154818866E-24);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1351), (UnivariateRealFunction) ulp0, (double) (-1351), (double) (-1351), (double) (-1351));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,351) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2398.21905), (-2398.21905), (-107.049692459));
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1413, (UnivariateRealFunction) sinh0, (-1.0), (-1.0), (double) 1413);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1119243625, (UnivariateRealFunction) null, (double) 1119243625, (double) 1119243625, (double) 1119243625);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
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
  public void test_0125()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      regulaFalsiSolver0.setup(2, exp0, 2, 2, 2);
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
  public void test_0126()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Acos acos0 = new Acos();
      regulaFalsiSolver0.setup(240, acos0, (-1306.11), 240, 240);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,306.11, 240], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3529, (UnivariateRealFunction) log1p0, (double) 3529, (-1.2788484473194414E-16), (-1.2788484473194414E-16), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,529, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(686);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(686, (UnivariateRealFunction) atan0, (-10.234997674251826), (double) 686, allowedSolution0);
      assertEquals(337.8825011628741, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(326.90640996182236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(686.0, 1530.883757250527);
      double double0 = pegasusSolver0.solve(686, (UnivariateRealFunction) atan0, (-804.6288), 686.0, allowedSolution0);
      assertEquals((-59.31439999999998), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-59.26336915293234), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(717, (-48.975338154793455));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(717, (UnivariateRealFunction) atan0, (-48.975338154793455), (double) 717, allowedSolution0);
      assertEquals(334.01233092260327, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(331.6773053335826, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(152);
      double double0 = illinoisSolver0.solve(152, (UnivariateRealFunction) atan0, (-3519.96957782496), 13.775158241338179, allowedSolution0);
      assertEquals((-1753.097209791811), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-38.7386505481783), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(686, (UnivariateRealFunction) atan0, (-10.234997674251826), (double) 686, allowedSolution0);
      assertEquals(337.8825011628741, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.055822479240393E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5.369040061580765, 686, 686);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(686, (UnivariateRealFunction) atan0, (-1.7168146928204135), (double) 686, allowedSolution0);
      assertEquals(342.1415926535898, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.7168146928204135), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(241, (UnivariateRealFunction) atan0, (-1.5903901259506075), (double) 241, allowedSolution0);
      assertEquals(119.7048049370247, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.51330070999666E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(241, (UnivariateRealFunction) atan0, (-1.9936503921776322E-4), (double) 241, allowedSolution0);
      assertEquals(120.49990031748038, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0067196351120703E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(241, (UnivariateRealFunction) atan0, (-1.994E-4), (double) 241, allowedSolution0);
      assertEquals(120.49990030000001, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0076020713895419E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(241, (UnivariateRealFunction) atan0, (-1.9936503921776322E-4), (double) 241, allowedSolution0);
      assertEquals(120.49990031748038, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.06219343823832E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(158, (UnivariateRealFunction) atan0, (-3519.8467554), 4.9E-324, (-3519.8467554));
      assertEquals((-3519.8467554), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.1067E-320), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2108.65635), (-2108.65635));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(686, (UnivariateRealFunction) atan0, (-0.08868729480913219), 0.5, allowedSolution0);
      assertEquals(0.2056563525954339, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(1939895540, (UnivariateRealFunction) atan0, (double) 1939895540, 0.0, (double) 1939895540);
      assertEquals(1.93989554E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = regulaFalsiSolver0.solve(106, (UnivariateRealFunction) gaussian0, (double) 106, (double) 106, (double) 106);
      assertEquals(106.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(106.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Atan atan0 = new Atan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(241, (UnivariateRealFunction) atan0, (-1.994E-4), (double) 241, allowedSolution0);
      assertEquals(120.49990030000001, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.063803949038019E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(1939895540, (UnivariateRealFunction) atan0, (-3568.115111), (double) 1939895540, (-3568.115111));
      assertEquals((-3568.115111), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.9617328321732715E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(234, (UnivariateRealFunction) floor0, (double) 234, 0.0036, (-5480.89614), allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(842, (UnivariateRealFunction) asin0, 0.0, (-1.0), allowedSolution0);
      assertEquals((-0.5), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(294, (UnivariateRealFunction) cos0, (-1361.3751518209), 1.375, allowedSolution0);
      assertEquals((-680.00007591045), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1063.4291133955112), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(35.2898334749);
      Rint rint0 = new Rint();
      illinoisSolver0.solve(1024, (UnivariateRealFunction) rint0, 35.2898334749, 0.0, 2.7553817452272217E-6);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2.7553817452272217E-6, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.solve(294, (UnivariateRealFunction) cos0, 653.96397389285, 1399.2594624, 653.96397389285);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(653.96397389285, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1264.4910430698917, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(653.96397389285, 653.96397389285);
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(4573, (UnivariateRealFunction) polynomialFunction0, (-1.0), (double) 4573, 1990.8781259809884, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1990.8781259809884, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cosh cosh0 = new Cosh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3613), (UnivariateRealFunction) cosh0, (double) (-3613), (double) (-3613), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,613) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(17588, (UnivariateRealFunction) minus0, (double) 17588, (double) 17588, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [17,588, 17,588]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2146935862, (UnivariateRealFunction) null, (double) 2146935862, (double) 2146935862, allowedSolution0);
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
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(17559068, (UnivariateRealFunction) cos0, (-1353.9121434823091), (-1088.247836888), (-1353.9121434823091), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-580), (UnivariateRealFunction) floor0, (double) (-580), (double) (-580), (double) (-580), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-580) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(653.96397389285);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(294, (UnivariateRealFunction) cos0, 1956517.914681242, 1.0E-6, (-2077.94333381), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,956,517.915, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2513), (UnivariateRealFunction) null, (double) (-2513), (double) (-2513), (double) (-2513), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1370228510, (UnivariateRealFunction) cos0, 0.0, (double) 1370228510, (double) 1370228510);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-3077), (UnivariateRealFunction) minus0, (double) (-3077), (double) (-3077), (double) (-3077));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,077) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Acos acos0 = new Acos();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1022, (UnivariateRealFunction) acos0, (double) 1022, (double) 1022, (double) 1022);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,022, 1,022]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2243), (UnivariateRealFunction) null, (double) (-2243), (double) (-2243), (double) (-2243));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
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
  public void test_0162()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      regulaFalsiSolver0.setup(598, atan0, 598, 598, 598);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [598, 598]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-687.00001));
      pegasusSolver0.setup(323, cos0, (-0.16624879837036133), 0.0, (-5225.96397389285));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0.166, 0], values: [0.986, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3110.055396);
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(243, (UnivariateRealFunction) identity0, (-64.77512898), (double) 243, (double) 243, allowedSolution0);
      assertEquals(243.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.8421709430404007E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Cos cos0 = new Cos();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(313);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) cos0, (-1.665394683691288E-4), (double) 4, (double) 4, allowedSolution0);
      assertEquals(4.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.41883503201423, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(326, (UnivariateRealFunction) cos0, (-661.3052535806519), (double) 326, (-1353.9121434823091), allowedSolution0);
      assertEquals((-1353.9121434823091), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-661.3052535801208), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(287, (UnivariateRealFunction) cos0, (-2054.0097662986436), (double) 287, (-2054.0097662986436));
      assertEquals((-2054.0097662986436), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1380.7299712527142), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver(653.96397389285, 1430.246161582296, 257);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(257, (UnivariateRealFunction) cos0, (double) 257, 1430.246161582296, allowedSolution0);
      assertEquals(843.623080791148, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(897.6493584551191, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(313, (UnivariateRealFunction) cos0, (-1353.9121434823091), (double) 313, (-2375.97104020243), allowedSolution0);
      assertEquals((-2375.97104020243), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(149.22565104551518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1339572614, (UnivariateRealFunction) tanh0, (-2702.944), (double) 1339572614, allowedSolution0);
      assertEquals(6.69784955528E8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(6.020645040338522E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(313, (UnivariateRealFunction) cos0, (-1353.9121434823091), (double) 313, 4573.019804763006, allowedSolution0);
      assertEquals(4573.019804763006, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(149.22565104551518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(73, (UnivariateRealFunction) cos0, (-1353.9121434823091), (double) 313, 3733.0, allowedSolution0);
      assertEquals(3733.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(149.22565104551526, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(828, (UnivariateRealFunction) asinh0, (-1.7403204145054016E-7), (double) 828, 3593.4695, allowedSolution0);
      assertEquals(3593.4695, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.7403204145054016E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(313, (UnivariateRealFunction) cos0, (-1353.9121434823091), (double) 313, 1394.5551, allowedSolution0);
      assertEquals(1394.5551, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(149.22565104551526, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(352, (UnivariateRealFunction) cos0, (-1354.2179), (double) 352, (double) 352, allowedSolution0);
      assertEquals(352.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-240.3318380137132), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3110.055396);
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(272, (UnivariateRealFunction) identity0, (-64.77512898), (double) 272, (double) 272, allowedSolution0);
      assertEquals(272.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(3399, (UnivariateRealFunction) cos0, (-1.0), 531.9835544763506, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Cos cos0 = new Cos();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(313, (UnivariateRealFunction) cos0, (-1353.9121434823091), (double) 313, (-1353.9121434823091));
      assertEquals((-1353.9121434823091), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(149.22565104551518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(653.96397389285, 653.96397389285);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (double) 4573;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(541, (UnivariateRealFunction) polynomialFunction0, (-146.128), 789.0, (-1.0), allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-2339.3912), 2471.0);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(197, (UnivariateRealFunction) sin0, (-3.9218408643271543E-14), 2471.0, allowedSolution0);
      assertEquals(1235.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1642, (UnivariateRealFunction) signum0, 0.0, 0.0, 184.92275827485, allowedSolution0);
      assertEquals(184.92275827485, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-2339.3912), 2471.0);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1306, (UnivariateRealFunction) sin0, (-1.0), 0.5463024898437905, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.04396300080975535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-2339.3912), 2471.0);
      Sin sin0 = new Sin();
      double double0 = regulaFalsiSolver0.solve(343, (UnivariateRealFunction) sin0, (-1874.8094018352), 2471.0, (-1874.8094018352));
      assertEquals((-1874.8094018352), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-136.39059963652517), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      regulaFalsiSolver0.solve(176, (UnivariateRealFunction) sinh0, 0.0, 2.801851179065011);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(2.801851179065011, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-669.56));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(2797, (UnivariateRealFunction) atan0, (-669.56), (double) 2797, (-507.9061971), allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-507.9061971), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.535406780357352E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(343, (UnivariateRealFunction) sin0, (-3577.4954615054658), 1.7029898543501842E-8, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1788.747730744218), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.1358782797964437E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(60886, (UnivariateRealFunction) sin0, 752.564, (double) 60886, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1966, (UnivariateRealFunction) sin0, (double) 1966, (double) 1966, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,966, 1,966]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(343, (UnivariateRealFunction) sin0, (-414.472), (double) 343, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1001), (UnivariateRealFunction) tan0, (double) (-1001), (double) (-1001), (double) (-1001), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,001) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(184141, (UnivariateRealFunction) acosh0, (double) 184141, (double) 184141, (double) 184141, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [184,141, 184,141]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-17096659), (UnivariateRealFunction) null, (double) (-17096659), (double) (-17096659), (double) (-17096659), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Sin sin0 = new Sin();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2307.2815287), (-2307.2815287), (-2307.2815287));
      // Undeclared exception!
      pegasusSolver0.solve(1011763171, (UnivariateRealFunction) sin0, (-4298.0196453), 1.2214786669791806, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-186251), (UnivariateRealFunction) gaussian0, (double) (-186251), (double) (-186251), (double) (-186251));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-186,251) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1903575581, (UnivariateRealFunction) atan0, (double) 1903575581, (double) 1903575581, (double) 1903575581);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,903,575,581, 1,903,575,581]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1407, (UnivariateRealFunction) null, (double) 1407, (double) 1407, (double) 1407);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(419.05384, 419.05384);
      Rint rint0 = new Rint();
      regulaFalsiSolver0.setup(502165827, rint0, 502165827, 419.05384, 419.05384);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [502,165,827, 419.054]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.setup(1011763171, sin0, 136, 1011763171, 136);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [136, 1,011,763,171], values: [-0.79, -0.573]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(186251, (UnivariateRealFunction) sin0, (-3811.50600794), (-1143.7696000299195), (-3811.50600794), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(60886, (UnivariateRealFunction) sin0, 6.2005795, (double) 60886, allowedSolution0);
      assertEquals(30446.10028975, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5679.999517690392, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) sin0, 1.0E-6, (double) 350, allowedSolution0);
      assertEquals(175.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.141592824760434, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) sin0, 1.0E-6, (double) 350, allowedSolution0);
      assertEquals(175.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.141592824760434, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(350, (UnivariateRealFunction) sin0, 1.0E-6, (double) 350, allowedSolution0);
      assertEquals(175.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.1415926535897776, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1995, (UnivariateRealFunction) sin0, (-2.1358782797964437E-17), 57.2957763671875, allowedSolution0);
      assertEquals(28.64788818359375, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5.920098171388333E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(182, (UnivariateRealFunction) sin0, 1.0E-6, (double) 182, allowedSolution0);
      assertEquals(91.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(179.07078125461823, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(182, (UnivariateRealFunction) sin0, 1.0E-6, (double) 182, allowedSolution0);
      assertEquals(91.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(179.07078125461823, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(136, (UnivariateRealFunction) sin0, 1.0E-6, (double) 136, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (136) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(110, (UnivariateRealFunction) sin0, 1.0E-6, (double) 110, allowedSolution0);
      assertEquals(55.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.1415926535897936, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(144, (UnivariateRealFunction) sin0, 1.0E-6, (double) 144, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (144) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(136, (UnivariateRealFunction) sin0, 1.0E-6, (double) 136, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (136) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(296, (UnivariateRealFunction) sin0, (double) 296, 0.0, (double) 296);
      assertEquals(296.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(343, (UnivariateRealFunction) sin0, (-3577.4954615054658), 1.0E-6, allowedSolution0);
      assertEquals((-1788.747730252733), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.322668958889331E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      pegasusSolver0.solve(2414, (UnivariateRealFunction) sin0, (-549.4707261233202), (double) 2414, (-549.4707261233202));
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
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
  public void test_0216()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Expm1 expm1_0 = new Expm1();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-535.5456113383556), (-1135.279326690775), (-5.768180831315456E-14));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2617, (UnivariateRealFunction) expm1_0, (-3229.544833441), 1.176342548272881E-8, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,617) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2387, (UnivariateRealFunction) ceil0, 0.0, 1556.2001850912209, 1199.0, allowedSolution0);
      assertEquals(1199.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1099.544);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2992.0, 5208.4338214, 1099.544);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      double double0 = regulaFalsiSolver0.solve(1543, univariateRealFunction0, 2992.0, 5208.4338214, 4.0, allowedSolution0);
      assertEquals(4.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4534.128402958521, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1556.2001850912209, (-431.821989));
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1659950841, (UnivariateRealFunction) ceil0, 0.25, (-4.1280272718043694E-4), 0.0018246553636565507, allowedSolution0);
      assertEquals(0.0018246553636565507, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.1280272718043694E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(3074, (UnivariateRealFunction) asinh0, (-584.0862196387662), 3237.5693346076323, (double) 3074);
      assertEquals(3074.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.3300881449554756E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1135.279326690775));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(3264, (UnivariateRealFunction) expm1_0, (double) 3264, 0.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1632.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(64.90481402870248);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(584, (UnivariateRealFunction) inverse0, (-2982.8523413137355), (double) 46, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1468.4261706568677), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.1476586862641085, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1556.2001850912209, (-431.821989));
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(219, (UnivariateRealFunction) ceil0, (-431.821989), 0.16666666666666666, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-215.82766116666664), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.8333070733024691), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1093260608, (UnivariateRealFunction) expm1_0, (-1279.221730812652), (double) 1093260608, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(315, (UnivariateRealFunction) log0, (double) 315, (double) 315, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [315, 315]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1073741824, (UnivariateRealFunction) null, (double) 1073741824, (double) 1073741824, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-1477.851801346716), (double) 38, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(60, (UnivariateRealFunction) inverse0, (-528.4931631893589), (double) 60, (double) 60, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (60) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1982.2632251272896, (-1098.999789921815), 64.90481402870248);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, 1955.87, 64.90481402870248, (-1098.999789921815), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,955.87, 64.905]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(770, (UnivariateRealFunction) null, (double) 770, (double) 770, (double) 770, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1), (UnivariateRealFunction) log10_0, (double) (-1), (double) (-1), (double) (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1650245034, (UnivariateRealFunction) sinc0, (double) 1650245034, (double) 1650245034, (double) 1650245034);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,650,245,034, 1,650,245,034]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1), (UnivariateRealFunction) null, (double) (-1), (double) (-1), (double) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
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
  public void test_0235()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      regulaFalsiSolver0.setup(5, polynomialFunction0, 5, 5.0, 5);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      regulaFalsiSolver0.setup(46, inverse0, 46, 1653.905349, (-1212.93236814));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [46, 1,653.905], values: [0.022, 0.001]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1721838390, (UnivariateRealFunction) expm1_0, (-1306.52557), (double) 1721838390, 1285.9992245456676, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(81, (UnivariateRealFunction) inverse0, (-528.4931631893589), (double) 81, allowedSolution0);
      assertEquals((-223.74658159467947), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-5.83132292941701E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2984.788504825085), 14614);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(14614, (UnivariateRealFunction) inverse0, (-2984.788504825085), 1.0E-14, allowedSolution0);
      assertEquals((-1492.3942524125425), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2984.7885048250846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2984.788504825085), 14614);
      double double0 = pegasusSolver0.solve(13, (UnivariateRealFunction) inverse0, (-2984.7885048250846), 1.0E-14, (double) 14614);
      assertEquals(14614.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2984.7885048250846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-536.9026319602553), (double) 46, allowedSolution0);
      assertEquals((-245.45131598012767), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-490.90263196025535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, (-1098.999789921815), 46);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(584, (UnivariateRealFunction) inverse0, (-2984.788504825085), (double) 46, allowedSolution0);
      assertEquals((-1469.3942524125425), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(46.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-536.9026319602553), (double) 46, allowedSolution0);
      assertEquals((-245.45131598012767), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-490.90263196025535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-531.3239970948326), 1143.13699, allowedSolution0);
      assertEquals(305.9064964525836, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-531.3239970948326), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(941, 941, 941);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(941, (UnivariateRealFunction) inverse0, (-528.4931631893589), (double) 941, allowedSolution0);
      assertEquals(206.25341840532053, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(412.50683681064106, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-43.16391058917143), (double) 46, allowedSolution0);
      assertEquals(1.4180447054142817, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-43.16391058917143), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-582.9340680513889), (-582.9340680513889));
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(3074, (UnivariateRealFunction) asinh0, (-582.9340680513889), 3237.5693346076323, (double) 3074);
      assertEquals(3074.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.1481654643148158E-22), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-582.93407), (-582.93407), (-582.93407));
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(625, (UnivariateRealFunction) asinh0, (-582.93407), 3237.569, (double) 625);
      assertEquals(625.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(46, 46, 46);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(46, (UnivariateRealFunction) inverse0, (-528.4931631893589), (double) 46, allowedSolution0);
      assertEquals((-241.24658159467947), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(46.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      regulaFalsiSolver0.solve(45691142, (UnivariateRealFunction) tan0, 1598.0, (double) 45691142, 1598.0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(188, (UnivariateRealFunction) sinc0, 0.5, (double) 188, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.07842259109020233);
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(3182, (UnivariateRealFunction) tan0, 0.0, 0.5, 0.07842259109020233);
      assertEquals(0.07842259109020233, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.07842259109020233);
      Tan tan0 = new Tan();
      double double0 = pegasusSolver0.solve(84, (UnivariateRealFunction) tan0, (-1941.48907221384), 6.0, 0.0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1930.4743855716856), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-22.75546736961863));
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      regulaFalsiSolver0.solve(2127810107, (UnivariateRealFunction) identity0, (-1061.133735), (double) 2127810107, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.0639045229331325E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Tan tan0 = new Tan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.07842259109020233, 3182);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      regulaFalsiSolver0.solve(2127810118, (UnivariateRealFunction) tan0, (-0.37495327744823503), 0.9999997615814245, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.31252324206659476, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.09758293255090966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.2393345855018391E-8);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2127810111, (UnivariateRealFunction) log10_0, 1.2393345855018391E-8, (double) 2127810111, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-12), (UnivariateRealFunction) logit0, (double) (-12), (double) (-12), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-12) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acosh acosh0 = new Acosh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1100, (UnivariateRealFunction) acosh0, (double) 1100, (double) 1100, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,100, 1,100]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(304.03252769);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1006667799, (UnivariateRealFunction) log10_0, 11.609544507525044, 304.03252769, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [11.61, 304.033], values: [1.065, 2.483]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1006667799, (UnivariateRealFunction) atan0, (-2015.6331), 478.16969, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2127810118, (UnivariateRealFunction) log10_0, 0.0, (double) 2127810118, (double) 2127810118, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(5.570911433518948, 5.570911433518948, 5.570911433518948);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2934), (UnivariateRealFunction) log10_0, (double) (-2934), 3786.782247918, 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,934) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Tan tan0 = new Tan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-394.066216158), 0.0, 0.2);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3182, (UnivariateRealFunction) tan0, 0.375, 0.2, 0.375, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.375, 0.2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1), (UnivariateRealFunction) null, (double) (-1), (double) (-1), (double) (-1), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.20439641591233434);
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1073740754, (UnivariateRealFunction) log10_0, 2.507251413038539E-15, (double) 2127810118, 0.20439641591233434);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.07842259109020233);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-261), (UnivariateRealFunction) tan0, 0.0, (-1.9841269659586505E-4), 2285.8106413453056);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-261) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(53, (UnivariateRealFunction) signum0, (double) 53, (double) 53, (double) 53);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [53, 53]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) null, (double) 5, (double) 5, (double) 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.030589580535888672);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      Log10 log10_0 = new Log10();
      regulaFalsiSolver0.solve(2127810118, (UnivariateRealFunction) log10_0, 2.384185791015625E-7, (double) 2127810118, allowedSolution0);
      regulaFalsiSolver0.doSolve();
      // Undeclared exception!
      regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4.503599627370496E15);
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
  public void test_0271()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-22.75546736961863));
      Acos acos0 = new Acos();
      regulaFalsiSolver0.setup(2122054426, acos0, 2122054426, (-2575.20509012161), 1.6375140164835709);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,122,054,426, -2,575.205]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit((-2463.971439), 1211.494456457416);
      pegasusSolver0.setup(1073740757, logit0, (-2463.971439), (-872.412083), (-2463.971439));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,463.971, -872.412], values: [-\u221E, -0.27]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(243, (UnivariateRealFunction) cos0, (-424.0), 7.0, 0.9694100000001035, allowedSolution0);
      assertEquals(0.9694100000001035, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.853981338607687), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2127810118, 0.0, 2127810118);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2127810118, (UnivariateRealFunction) log10_0, 0.0, (double) 2127810118, (double) 2127810118, allowedSolution0);
      assertEquals(2.127810118E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(27, 0.0);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(27, (UnivariateRealFunction) log10_0, 0.0, (double) 27, (double) 27, allowedSolution0);
      assertEquals(27.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(27.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1757, 1757, 56.3);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1757, (UnivariateRealFunction) harmonicOscillator0, 1.0, 3208.28, allowedSolution0);
      assertEquals(1604.64, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2826.1380921514083, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      double double0 = pegasusSolver0.solve(243, (UnivariateRealFunction) cos0, 0.999999002313815, (double) 243, (double) 243);
      assertEquals(243.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(221.4822820780804, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(334.64, 334.64, 334.64);
      Gaussian gaussian0 = new Gaussian(32, 32, 334.64);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(32, univariateRealFunction0, (-4.886696908852405E-4), 334.64, allowedSolution0);
      assertEquals(167.31975566515453, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(45.76680501672621, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2127810118, 0.0, 2127810118);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2127810118, (UnivariateRealFunction) log10_0, 0.0, (double) 2127810118, (double) 2127810118, allowedSolution0);
      assertEquals(2.127810118E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.127810118E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Atan atan0 = new Atan();
      double double0 = regulaFalsiSolver0.solve(1006667799, (UnivariateRealFunction) atan0, (-1.0), 1219.604, allowedSolution0);
      assertEquals(609.302, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.524354896707238E-28), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2140600904, (UnivariateRealFunction) asinh0, (-1.1292624729043115), 2216.3, 1.0E-6, allowedSolution0);
      assertEquals(1.0E-6, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.978593384781551E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.20439641591233434);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2127810122, (UnivariateRealFunction) log10_0, 0.20439641591233434, (double) 2127810122, allowedSolution0);
      assertEquals(1.0639050611021981E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Tan tan0 = new Tan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.2, 1024.0, 0.07842259109020233);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(3182, (UnivariateRealFunction) tan0, 0.798914458781754, 0.0, allowedSolution0);
      assertEquals(0.798914458781754, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(243, (UnivariateRealFunction) cos0, 187.9611, 215.19909677090084, allowedSolution0);
      assertEquals(187.9611, pegasusSolver0.getMin(), 0.01);
      assertEquals(215.1990967709008, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4.910017003315123E-30, 4.910017003315123E-30);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2620, (UnivariateRealFunction) sinc0, 4.910017003315123E-30, 1140.8118682268, 1140.8118682268, allowedSolution0);
      assertEquals(1140.8118682268, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1140.3981332530948, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(16, 0.0, 16);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(16, (UnivariateRealFunction) log10_0, 0.0, (double) 16, (double) 16, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(408, (UnivariateRealFunction) log1p0, 0.0, 0.11113807559013367, allowedSolution0);
      assertEquals(0.055569037795066833, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2411.9297087241384;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = illinoisSolver0.solve(299, (UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-3196.258208), 1215.07000747391, 2760.76702, allowedSolution0);
      assertEquals(2760.76702, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Constant constant0 = new Constant(0.0);
      pegasusSolver0.setup(2685, constant0, 0.0, 0.0, (-0.2499999701976776));
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Constant constant0 = new Constant(0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(0, (-3596.22), 110.662154);
      pegasusSolver0.setup(87, constant0, 0.5, 2292.707, 598.0101848640599);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2251.0));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(898, (UnivariateRealFunction) sinc0, (-3196.258208), 0.8874809691602705, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1597.68536351542), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3194.9997287008196), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2251.0));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1490, (UnivariateRealFunction) sinc0, (-3196.258208), 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,490) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3196.258208), 1.1430250008909141E-8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(299, (UnivariateRealFunction) sinc0, (double) 299, 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [299, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1634, (UnivariateRealFunction) null, (double) 1634, (double) 1634, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0);
      Sigmoid sigmoid0 = new Sigmoid(1.0, (-252.06342194358956));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(43034, (UnivariateRealFunction) sigmoid0, (-252.06342194358956), 1.0, (-1851.02229), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) rint0, (double) 0, (-1362.135061), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(190, (UnivariateRealFunction) sqrt0, (double) 190, (double) 190, (double) 190, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [190, 190]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(182547217, (UnivariateRealFunction) null, (double) 182547217, (double) 182547217, (double) 182547217, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1348.263109449964), (-1348.263109449964), (-1348.263109449964));
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      regulaFalsiSolver0.solve(43006, (UnivariateRealFunction) cbrt0, (-1348.263109449964), (double) 43006, (double) 43006);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1940), (UnivariateRealFunction) cbrt0, (double) (-1940), (double) (-1940), (double) (-1940));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,940) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2251.0));
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(898, (UnivariateRealFunction) sinc0, 1.2599210498948732, (-3196.258208), 1869.5122307);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.26, -3,196.258]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5);
      Abs abs0 = new Abs();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2724, (UnivariateRealFunction) abs0, 0.5, (double) 2724, (double) 2724);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.5, 2,724], values: [0.5, 2,724]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2251.0));
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
  public void test_0304()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.setup(1500, cbrt0, 1500, 1500, 43110);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,500, 1,500]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid(23, 1.8014398509481984E16);
      regulaFalsiSolver0.setup(23, sigmoid0, 23, 168.064, 23);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [23, 168.064], values: [18,014,398,507,633,368, 18,014,398,509,481,984]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(43160, (UnivariateRealFunction) cbrt0, (-763.67127503), (double) 43160, (double) 43160, allowedSolution0);
      assertEquals(43160.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.733917121043406E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1298, (UnivariateRealFunction) cbrt0, (-690.162455176), (double) 1298, allowedSolution0);
      assertEquals(303.91877241200007, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.6818375384383345E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(598.0114700190128);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2241, (UnivariateRealFunction) log0, 0.375, 598.0114700190128, allowedSolution0);
      assertEquals(299.1932350095064, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(79.862987840742, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(43053, (UnivariateRealFunction) cbrt0, (-1572.8086528558129), (double) 43053, (-1572.8086528558129), allowedSolution0);
      assertEquals((-1572.8086528558129), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.5218827156511E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1298, (UnivariateRealFunction) cbrt0, (-690.162455176), 5.0, allowedSolution0);
      assertEquals((-342.581227588), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.384020780543801E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(43086, (UnivariateRealFunction) cbrt0, (-3543.3595386033685), (double) 43086, (double) 43086, allowedSolution0);
      assertEquals(43086.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(8.4071172806899E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3512.138113228927));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(43110, (UnivariateRealFunction) cbrt0, (-3512.138113228927), (double) 43110, 3.9148676411688634, allowedSolution0);
      assertEquals(3.9148676411688634, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.778950703661692E-47), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3495.8024804252414));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(441, (UnivariateRealFunction) cbrt0, (-1638.648519562), (double) 441, allowedSolution0);
      assertEquals((-598.8242597810001), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.1312877951301168E-46), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3538.3185515615464), (-3538.3185515615464));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(43053, (UnivariateRealFunction) cbrt0, (-3538.3185515615464), 7.980136769117572E-15, allowedSolution0);
      assertEquals((-1769.1592757807732), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.9371906700093387E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1598, (UnivariateRealFunction) sinc0, (double) 1598, 2210.578, allowedSolution0);
      assertEquals(1904.289, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1950.929037878571, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.7168146928204135), (-1211.787141232), (-1211.787141232));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(43160, (UnivariateRealFunction) cbrt0, (-1.7168146928204135), (double) 43160, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = illinoisSolver0.solve(260, (UnivariateRealFunction) cbrt0, (-1201.871955066331), (double) 260, (-1201.871955066331));
      assertEquals((-1201.871955066331), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.9585956184879885E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Cbrt cbrt0 = new Cbrt();
      double double0 = regulaFalsiSolver0.solve(43053, (UnivariateRealFunction) cbrt0, 0.0, (double) 43053, (double) 43053);
      assertEquals(43053.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, 1.0);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(43034, (UnivariateRealFunction) cbrt0, (-1348.263109), 0.3794950893318969, allowedSolution0);
      assertEquals((-673.9418069553341), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.3794950893318969, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, 1.0);
      Cbrt cbrt0 = new Cbrt();
      double double0 = regulaFalsiSolver0.solve(43034, (UnivariateRealFunction) cbrt0, (-1348.263109), (double) 43034, (double) 43034);
      assertEquals(43034.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.3794950893318969, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      regulaFalsiSolver0.solve(268, (UnivariateRealFunction) cbrt0, (double) 268, 0.0, (double) 268);
  }
@Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-1.0));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2097, (UnivariateRealFunction) sin0, 3006.385445, 0.0, 2292.018326151851, allowedSolution0);
      assertEquals(2292.018326151851, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) exp0, 40.54649, (-1397.1218), 1821.886);
      assertEquals(1821.886, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1397.1218), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(114.0, 114.0);
      Gaussian gaussian0 = new Gaussian();
      pegasusSolver0.solve(2355, (UnivariateRealFunction) gaussian0, 0.0, 114.0, 114.0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(114.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(114.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1221.188844, 1221.188844);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(1374, (UnivariateRealFunction) sinh0, (-189.9981306515), 0.5, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-94.74906532575), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-189.9981306515), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1222.5925804560018, 1222.5925804560018, 1222.5925804560018);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2481), (UnivariateRealFunction) tan0, (-189.9981306515), 0.19999954104423523, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,481) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3817.324));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2148, (UnivariateRealFunction) sinh0, 1623.0, 1.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,623, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit(1589.149741191514, (-626.3893278226935));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2147480005, univariateRealFunction0, (-626.3893278226935), 1964.557463970936, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-626.389, 1,964.557], values: [\u221E, 0.002]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1222.5925804560018, 1222.5925804560018, 1222.5925804560018);
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1374, (UnivariateRealFunction) sinh0, (-238.02517115776655), 1.6722866885050072E-15, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Logit logit0 = new Logit(68, Integer.MAX_VALUE);
      // Undeclared exception!
      illinoisSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) logit0, (double) 75, (double) Integer.MAX_VALUE, (double) Integer.MAX_VALUE, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1221.188844, 1221.188844, 1221.188844);
      Logit logit0 = new Logit(5.925133778335554E11, 1221.188844);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3197), (UnivariateRealFunction) logit0, (double) (-3197), 1.5074899893686121E10, 1.5074899893686121E10, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,197) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1534, (UnivariateRealFunction) sinc0, (double) 1534, (double) 1534, (double) 1534, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,534, 1,534]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1638), (UnivariateRealFunction) null, (double) (-1638), (double) (-1638), (double) (-1638), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2517, (UnivariateRealFunction) atan0, (-15794.459456223354), (double) 2517, (-15794.459456223354), (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1221.188844, 1221.188844);
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) sinh0, (-3884.3686496322157), 201.74766865288655, 550.112933207403);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1654, (UnivariateRealFunction) asinh0, (double) 1654, (double) 1654, (double) 1654);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,654, 1,654]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(34, (UnivariateRealFunction) null, (double) 34, (double) 34, (double) 34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
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
  public void test_0339()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      pegasusSolver0.setup(4103, signum0, 4103, (-2168.183555), 1.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4,103, -2,168.184]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      regulaFalsiSolver0.setup(2, ulp0, (-137872.4507582066), 2, (-137872.4507582066));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-137,872.451, 2], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(42, 42, 42);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(42, (UnivariateRealFunction) harmonicOscillator0, (double) 42, 1116.798, allowedSolution0);
      assertEquals(579.399, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(651.2170748358985, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1221.188844, 1221.188844, 1221.188844);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1374, (UnivariateRealFunction) sinh0, (-189.9981306515), 0.5, allowedSolution0);
      assertEquals((-94.74906532575), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-189.9981306515), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(42, 42, 1429.243175);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(42, (UnivariateRealFunction) harmonicOscillator0, (double) 42, 1429.243175, allowedSolution0);
      assertEquals(735.6215875, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1133.0346714913035, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit(1589.149741191514, (-603.450156198));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(542, univariateRealFunction0, 1.0E-6, 1.9155040003582885E22, 1589.149740925005, allowedSolution0);
      assertEquals(1589.149740925005, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1589.1497408600005, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit(1589.149741191514, (-626.3893278226935));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(542, univariateRealFunction0, (double) 542, 1.9155040003582885E22, allowedSolution0);
      assertEquals(9.577520001791442E21, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1589.1497408269938, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit(1589.149741191514, (-626.3893278226935));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(542, univariateRealFunction0, 1.0E-6, 1.9155040003582885E22, 1.0E-6, allowedSolution0);
      assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1589.1497409155481, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(1517, (UnivariateRealFunction) sinc0, (double) 1517, 813804.0188426566, 813804.0188426566, allowedSolution0);
      assertEquals(813804.0188426566, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(812268.2053636027, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(66, (UnivariateRealFunction) sinc0, (double) 66, (double) 542, (double) 66, allowedSolution0);
      assertEquals(66.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(69.11503837897544, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(66, (UnivariateRealFunction) sinc0, (double) 66, (double) 542, (double) 66, allowedSolution0);
      assertEquals(66.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(69.11503837897548, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1517, (UnivariateRealFunction) sinc0, (double) 1517, 813803.2202183597, 813803.2202183597, allowedSolution0);
      assertEquals(813803.2202183597, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(811652.4532034982, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1534, (UnivariateRealFunction) sinc0, (double) 1534, 2807.14544137521, 2807.14544137521, allowedSolution0);
      assertEquals(2807.14544137521, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2799.1590543485054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(1517, (UnivariateRealFunction) sinc0, (double) 1517, 813803.2202183597, 813803.2202183597, allowedSolution0);
      assertEquals(813803.2202183597, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(811652.4532034983, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.1802890886101218E103));
      Ceil ceil0 = new Ceil();
      double double0 = pegasusSolver0.solve(20910, (UnivariateRealFunction) ceil0, (-1.1802890886101218E103), (double) 20910, (-1.1802890886101218E103));
      assertEquals((-1.1802890886101218E103), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1438, (UnivariateRealFunction) exp0, (double) 1438, (-4035.643137823645), (-4035.643137823645), allowedSolution0);
      assertEquals((-4035.643137823645), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4035.643137823645), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1221.188844, 1221.188844);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(310, (UnivariateRealFunction) sinh0, (double) 0, 1221.188844, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(610.594422, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(42, 42, (-1878.8182));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(42, (UnivariateRealFunction) harmonicOscillator0, (-1878.8182), (double) 42, allowedSolution0);
      assertEquals((-918.4091), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-614.2152924237924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      illinoisSolver0.solve(2087984197, (UnivariateRealFunction) sinh0, (-1218.35), 0.5, (double) 2087984197);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1668.49), (-1668.49), (-1668.49));
      Power power0 = new Power(2053089239);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(2053089239, (UnivariateRealFunction) power0, (-1668.49), (double) 2053089239, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(2517, (UnivariateRealFunction) atan0, (-15794.459456223354), (double) 2517, (-15794.459456223354), allowedSolution0);
  }
}
