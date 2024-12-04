package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.StepFunction;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Inverse;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tan;
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(52, (UnivariateRealFunction) tanh0, (-1487.5176718550297), 2.2250738585072014E-308, 0.5);
      assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.3076116118536127E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(851, (UnivariateRealFunction) atan0, (-1.0), 1.0, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(91, (UnivariateRealFunction) tanh0, (-1462.2486573754188), (double) 91, (-1462.2486573754188));
      assertEquals((-1462.2486573754188), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.8601895897619187E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1718.83);
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(2687, (UnivariateRealFunction) sqrt0, 0.0, 161.063019431502, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(80.531509715751, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.008333333333333333, 0.008333333333333333, 1724.57);
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(503, (UnivariateRealFunction) tanh0, (-142.97602), 702.30893, 3808.8886805);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(3808.8886805, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(279.66645500000004, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2710, (UnivariateRealFunction) log1p0, (-1.0), (double) 2710, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1773.360542631936, 1773.360542631936, 1773.360542631936);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-6), (UnivariateRealFunction) tanh0, (-1484.3329396585978), 0.5039018405998233, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-6) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3355.377388612, 3355.377388612, 3355.377388612);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(13, (UnivariateRealFunction) tanh0, (-1484.3329396585978), (-1484.3329396585978), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,484.333, -1,484.333]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.19999998807907104, 1.0, 0.19999998807907104);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(23, (UnivariateRealFunction) tanh0, 0.19999998807907104, 1724.2484106988486, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.2, 1,724.248], values: [0.197, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2141971626, (UnivariateRealFunction) cos0, 2102.56, (double) 2141971626, 2102.56, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-674.177604), (-674.177604));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1023), (UnivariateRealFunction) atan0, (-4004.08444), (-4004.08444), (-4355.54432663), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,023) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(34, (UnivariateRealFunction) floor0, (double) 34, (double) 34, (double) 34, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [34, 34]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(981906456, (UnivariateRealFunction) null, (double) 981906456, (double) 981906456, (double) 981906456, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(23, (UnivariateRealFunction) tanh0, (-2035.753), 1.0E-6, 1.0E-6, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1.2393345855018391E-8;
      doubleArray0[2] = 0.09349093124643341;
      StepFunction stepFunction0 = new StepFunction(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-4225), (UnivariateRealFunction) stepFunction0, 1.2393345855018391E-8, 1544.761516, (-4371.813));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,225) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(35, (UnivariateRealFunction) tanh0, (double) 35, (double) 35, (double) 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [35, 35]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(66, (UnivariateRealFunction) null, (double) 66, (double) 66, (double) 66);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2266.9));
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = (double) 2859;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      regulaFalsiSolver0.setup(2859, polynomialFunction0, (-4316.12274335), 2859.0, 1438.99642);
      // Undeclared exception!
      regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
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
  public void test_0019()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      illinoisSolver0.setup(191, cos0, 191, 191, 191);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [191, 191]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Power power0 = new Power(1006.482254065422);
      pegasusSolver0.setup(91, power0, 947.23821, 1006.482254065422, 1535.31132219);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [947.238, 1,006.482], values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(70, (UnivariateRealFunction) tanh0, (-130.75178709037095), (double) 70, allowedSolution0);
      assertEquals((-30.375893545185477), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.556321948521011E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) tanh0, (-1487.4648743250257), 2.416671547672014E-6, (-0.47496021472910877), allowedSolution0);
      assertEquals((-0.47496021472910877), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.038825148507659E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2018, (UnivariateRealFunction) tanh0, (-1047.1754), 6.787363161830022E-17, (double) 2018, allowedSolution0);
      assertEquals(2018.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-7.100772370772788E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(81, (UnivariateRealFunction) tanh0, (-0.09088450866185192), (double) 81, (-0.09088450866185192));
      assertEquals((-0.09088450866185192), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(7.558577120069166E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(107, (UnivariateRealFunction) asinh0, (-575.973287), 0.2222222089767456, allowedSolution0);
      assertEquals((-287.87553239551164), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(9.059566412016324E-22, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(35, (UnivariateRealFunction) tanh0, (-1461.7457780726254), (double) 35, allowedSolution0);
      assertEquals((-713.3728890363127), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-5.275636723544441E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(224, (UnivariateRealFunction) tanh0, (-0.9917824945385673), 5.559653955045515E-6, 1.0, allowedSolution0);
      assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.221357982469657E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(81, (UnivariateRealFunction) tanh0, (-1303.2852), (double) 81, 3105.445392144464, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(3105.445392144464, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.3341562662986764E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(192, (UnivariateRealFunction) tanh0, (-0.16666666666666666), (double) 192, (-1.8427850642816166E-14), allowedSolution0);
      assertEquals((-1.8427850642816166E-14), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.4799821181199243E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2082638314, (UnivariateRealFunction) cos0, 3.35271726026241E-5, 85.65128, allowedSolution0);
      assertEquals(42.8256567635863, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(70.68583471469883, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2782, (UnivariateRealFunction) tanh0, (-1.8601895897619187E-23), 0.11764700710773468, allowedSolution0);
      assertEquals(0.05882350355386734, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.8601895897619187E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1052277304, (UnivariateRealFunction) tan0, 1.125, (double) 1052277304, allowedSolution0);
      assertEquals(5.261386525625E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0521418876277921E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(70, (UnivariateRealFunction) tanh0, (-1504.875812847785), (double) 70, (double) 70);
      assertEquals(70.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(2018, (UnivariateRealFunction) tanh0, (double) 2018, 0.0, (double) 2018);
      assertEquals(2018.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      illinoisSolver0.solve(192, (UnivariateRealFunction) tanh0, (-547.0881834759283), 1918.151025784, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Power power0 = new Power(11);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(11, (UnivariateRealFunction) power0, 0.0, 0.0, (-1096.0147236579), allowedSolution0);
      assertEquals((-1096.0147236579), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Power power0 = new Power(11);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(11, (UnivariateRealFunction) power0, 0.0, 0.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-6785.7352), (-6785.7352), 2193.610899394);
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(1163, (UnivariateRealFunction) exp0, 255.977216, (-6785.7352), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-3264.878992), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-6785.7352), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2964, (UnivariateRealFunction) log0, 4.0697949690799595E-15, (double) 2964, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2.503032725915993E-12));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) sinc0, (-2.503032725915993E-12), (-1713.304694), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0, -1,713.305]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(7, (UnivariateRealFunction) null, (double) 7, (double) 7, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) sinc0, 0.0, (double) Integer.MAX_VALUE, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) sinh0, (-753.0), (double) 4, (-753.0), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(122, (UnivariateRealFunction) atan0, (double) 122, (double) 122, (double) 122, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [122, 122]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-361), (UnivariateRealFunction) null, (double) (-361), (double) (-361), (double) (-361), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-300), (-300), (-2153.438445124888));
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2151, (UnivariateRealFunction) log10_0, 0.14982303977012634, (double) 2151, 3954.717050233);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1625), (UnivariateRealFunction) expm1_0, (double) (-1625), (double) (-1625), (double) (-1625));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,625) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(142, (UnivariateRealFunction) log0, (double) 142, (double) 142, (double) 142);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [142, 142]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1899), (UnivariateRealFunction) null, (double) (-1899), (double) (-1899), (double) (-1899));
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2242.78711));
      Expm1 expm1_0 = new Expm1();
      regulaFalsiSolver0.setup(377201, expm1_0, (-153.347), 2834, (-4.9E-324));
      // Undeclared exception!
      regulaFalsiSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
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
  public void test_0052()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      regulaFalsiSolver0.setup(461, ulp0, 461, 461, 461);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [461, 461]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Ceil ceil0 = new Ceil();
      pegasusSolver0.setup(1288, ceil0, 1288, 1589.498516962002, 1288);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,288, 1,589.499], values: [1,288, 1,590]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2142944429, (UnivariateRealFunction) asinh0, (-0.1014140691153938), (double) 2142944429, allowedSolution0);
      assertEquals(1.0714722144492929E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.418745564179234E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1559.994455, 2147483646, 1559.994455);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483646, (UnivariateRealFunction) harmonicOscillator0, 1559.994455, (double) 2147483646, allowedSolution0);
      assertEquals(1.0737426029972274E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.4213211451878195E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2242.78711));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2864, (UnivariateRealFunction) tan0, (-2242.78711), (-1713.304694), allowedSolution0);
      assertEquals((-1978.045902), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2241.5263583363126), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2242.78711));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2834, (UnivariateRealFunction) tan0, (-2242.78711), (-1713.304694), allowedSolution0);
      assertEquals((-1978.045902), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2241.526358336327), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1712.1700481265868, 1997, 1712.1700481265868);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1997, (UnivariateRealFunction) harmonicOscillator0, (-2612.8013), (double) 1997, allowedSolution0);
      assertEquals((-307.90065000000004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(576.6222617956446, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2242.78711));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2834, (UnivariateRealFunction) tan0, (-2242.78711), (-1713.4664505480675), allowedSolution0);
      assertEquals((-1978.126780274034), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2241.526358336332), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = pegasusSolver0.solve(284, (UnivariateRealFunction) cbrt0, (-3502.5), (double) 284, (double) 284);
      assertEquals(284.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-6.267977637137216E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2035, (-3482.0772144020193), 1253.615581864515);
      double double0 = illinoisSolver0.solve(2035, (UnivariateRealFunction) cbrt0, (-3482.0772144020193), 1253.615581864515, 2615.275502108849, allowedSolution0);
      assertEquals(2615.275502108849, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1253.615581864515, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(2146230133, (UnivariateRealFunction) sinc0, (-0.0021871782639655253), (double) 2146230133, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.0731150664989065E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.1462301318707485E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146230133, (UnivariateRealFunction) sinc0, (-81.04), 4.594243144125408E-9, allowedSolution0);
      assertEquals((-40.51999999770288), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-78.53981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3506.5559413083015));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(272, (UnivariateRealFunction) cbrt0, (-3506.5559413083015), 7.949797216161852, allowedSolution0);
      assertEquals((-1749.30307204607), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(6.315314452153804E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3506.5559413083015));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(272, (UnivariateRealFunction) cbrt0, (-5.977637797531633E-46), 0.08713622391223907, (double) 0, allowedSolution0);
      assertEquals((-3.26687423376936E-46), double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(282, (UnivariateRealFunction) log1p0, (-0.13562581245181415), (double) 282, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (282) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      double double0 = regulaFalsiSolver0.solve(1062, (UnivariateRealFunction) ceil0, (-936.93719498993), (double) 1062, (-936.93719498993));
      assertEquals((-936.93719498993), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.49814868834118897), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = pegasusSolver0.solve(284, (UnivariateRealFunction) cbrt0, (double) 284, 0.0, 0.0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = regulaFalsiSolver0.solve(1551, (UnivariateRealFunction) gaussian0, (double) 1551, 0.0, (double) 1551);
      assertEquals(1551.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1551.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3502.5155263));
      Cbrt cbrt0 = new Cbrt();
      double double0 = pegasusSolver0.solve(296, (UnivariateRealFunction) cbrt0, (-3502.5155263), (double) 296, (double) 296);
      assertEquals(296.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.4415916744418377E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(10, (UnivariateRealFunction) sin0, 1.0, 11.0, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1461, (UnivariateRealFunction) tan0, (-1297.79121), 1.0E-6, 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,461) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Identity identity0 = new Identity();
      double double0 = illinoisSolver0.solve(3, (UnivariateRealFunction) identity0, (-1410.963075), (double) 3, 1128.733);
      assertEquals(1128.733, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(1899849100, (UnivariateRealFunction) asin0, 3.9736429850260626E-8, 0.0, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.9868214925130313E-8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(254, (UnivariateRealFunction) sinc0, (-889.0707209659115), 2.0827657155992525E-5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (254) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1461, (UnivariateRealFunction) log10_0, 1119.542421122, 1119.542421122, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,119.542, 1,119.542]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-939), (UnivariateRealFunction) null, (double) (-939), (double) (-939), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(103, (UnivariateRealFunction) sinc0, (-889.0707209659115), 2.0827657155992525E-5, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(163435535, (UnivariateRealFunction) log10_0, 0.0010346877285690248, (double) 163435535, (double) 1438, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Identity identity0 = new Identity();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(145, (UnivariateRealFunction) identity0, 920.7028050357876, (-1777.6451774209318), (-1777.6451774209318), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [920.703, -1,777.645]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) null, (double) 5, (double) 5, (double) 5, allowedSolution0);
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
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2628, (UnivariateRealFunction) log10_0, 2.1215204264172266E-15, (double) 2628, 0.333333333333333);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Signum signum0 = new Signum();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2726), (UnivariateRealFunction) signum0, (double) 288, 1194.1, 146.130172);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,726) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(42, (UnivariateRealFunction) sinc0, 2017.6824, 2017.6824, (-1080.3796621161));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,017.682, 2,017.682]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(132817588, (UnivariateRealFunction) null, (double) 132817588, (double) 132817588, (double) 132817588);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
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
  public void test_0087()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cosh cosh0 = new Cosh();
      illinoisSolver0.setup(2223, cosh0, 2223, 2223, 2223);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,223, 2,223]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.setup(193, tanh0, 0.7093694935981589, 193, 0.7093694935981589);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.709, 193], values: [0.61, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1267, (UnivariateRealFunction) signum0, (-624.1509753963743), (double) 1267, (-624.1509753963743), allowedSolution0);
      assertEquals((-624.1509753963743), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.098504686919791E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1285, (UnivariateRealFunction) signum0, (-637.4126844), (double) 1285, (-637.4126844), allowedSolution0);
      assertEquals((-637.4126844), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.6765946761889026E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1261, (UnivariateRealFunction) signum0, (-636.1464785602399), (double) 1261, (-636.1464785602399), allowedSolution0);
      assertEquals((-636.1464785602399), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(8.510499741075543E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Signum signum0 = new Signum();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(103, (UnivariateRealFunction) signum0, (-1.5707963267948966), 6.283185307179586, allowedSolution0);
      assertEquals(2.356194490192345, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-5.617605424385893E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1073185526, (UnivariateRealFunction) signum0, (-637.4126844), (double) 1073185526, (-637.4126844), allowedSolution0);
      assertEquals((-637.4126844), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.1429762672837843E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1256, (UnivariateRealFunction) signum0, (-637.1512179589845), (double) 1256, (-637.1512179589845), allowedSolution0);
      assertEquals((-637.1512179589845), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4.479087681447446E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(7, (UnivariateRealFunction) expm1_0, (-2674.74863651), 2.8269794867571955E-30, 0.9989653122714418, allowedSolution0);
      assertEquals(0.9989653122714418, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.8269794867571955E-30, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1438, (UnivariateRealFunction) log10_0, 7.527073174512695E-5, 363.48337, 7.527073174512695E-5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,438) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(562, (UnivariateRealFunction) log10_0, 1.0E-6, (double) 562, allowedSolution0);
      assertEquals(281.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000000022, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(42, (UnivariateRealFunction) sinc0, (double) 42, 2017.6824, (-1005.31478225), allowedSolution0);
      assertEquals((-1005.31478225), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1941.5042599184917, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1494, (UnivariateRealFunction) log10_0, 0.00103469, (double) 1494, 1.000000000000002, allowedSolution0);
      assertEquals(1.000000000000002, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1073185508, (UnivariateRealFunction) log10_0, 0.00103469, (double) 1073185508, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Log10 log10_0 = new Log10();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(1493, (UnivariateRealFunction) log10_0, 0.00103469, (double) 1493, (double) 1493);
      assertEquals(1493.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Minus minus0 = new Minus();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(262, (UnivariateRealFunction) minus0, (-1641.43376), 855.090104, allowedSolution0);
      assertEquals((-393.171828), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1072, (UnivariateRealFunction) atan0, (-518.794829), (double) 1072, allowedSolution0);
      assertEquals(276.6025854999999, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4.352492712902619E-25), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.16624882440418567));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(95, (UnivariateRealFunction) tanh0, (-378.0), (double) 95, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Signum signum0 = new Signum();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(612406976, (UnivariateRealFunction) signum0, 0.0, (-1.0), (double) 767, allowedSolution0);
      assertEquals(767.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Signum signum0 = new Signum();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(103, (UnivariateRealFunction) signum0, (-1.5707963267948966), 6.283185307179586, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(2.356194490192345, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.7450702829239286E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2.0318274396103185E-6, 2.399494875, (-1.9005053929651199));
      assertEquals((-1.9005053929651199), regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      regulaFalsiSolver0.solve(254, (UnivariateRealFunction) sin0, (-1193.3109331101116), 1500.5292070009793, (double) 103);
      regulaFalsiSolver0.doSolve();
  }
@Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(14, (UnivariateRealFunction) asin0, 0.0, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(856, (UnivariateRealFunction) tan0, (-1.0), (double) 856, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1399.6568275));
      Atan atan0 = new Atan();
      double double0 = illinoisSolver0.solve(1024043403, (UnivariateRealFunction) atan0, (-1047.0), 5.650007086920087E-9, (double) 1024043403);
      assertEquals(1.024043403E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.668153783851046E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      pegasusSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) tan0, (-2213.35424547887), 0.0, 1264.140223953);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1264.140223953, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4.284297466701477, 4.284297466701477, 4.284297466701477);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(665, (UnivariateRealFunction) tan0, 4.284297466701477, (double) 665, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(334.6421487333508, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(384.2188560511296, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3294198.0);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(161, (UnivariateRealFunction) cbrt0, (-2.819238869969487E-11), 3294198.0, 1137.8291132451693, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1137.8291132451693, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.819238869969487E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power((-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(1959231414, (UnivariateRealFunction) power0, (-1.0), 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1399.6568275));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(99, (UnivariateRealFunction) expm1_0, (-2.668153783851046E-20), (double) 1024043403, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (99) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3668, (UnivariateRealFunction) atanh0, (double) 3668, (double) 3668, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,668, 3,668]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(723127218, (UnivariateRealFunction) null, (double) 723127218, (double) 723127218, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2143575119, (UnivariateRealFunction) tan0, (-1.0), (double) 2143575119, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, (-661.9262254980425));
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1480), (UnivariateRealFunction) cbrt0, 215.4, (-4655.660075456518), (-5024.779766), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,480) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3294184.3567480026, 3294184.3567480026, 3294184.3567480026);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(857, (UnivariateRealFunction) sin0, 881.606406040024, 1.0E-6, (-8.623507201521771E-5), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [881.606, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2147268300, (UnivariateRealFunction) null, (double) 2147268300, (double) 2147268300, (double) 2147268300, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688, 18.596177432888688, 18.596177432888688);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(774, (UnivariateRealFunction) tan0, 690.366213, (double) 774, 828.09, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Tan tan0 = new Tan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(848);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(848, (UnivariateRealFunction) tan0, (-0.08890801804590251), (-0.08890801804590251), 3294184.3567480026);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0.089, -0.089]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4.284297466701477, 4.284297466701477, 4.284297466701477);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(665, (UnivariateRealFunction) tan0, (double) 665, 436846.4165431843, 1214.8162273315866);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [665, 436,846.417], values: [-1.62, -9.573]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3294184.3567480026, 3294184.3567480026, 3294184.3567480026);
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
  public void test_0127()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.312161683779635, 1.312161683779635);
      Tan tan0 = new Tan();
      illinoisSolver0.setup(369, tan0, 1.312161683779635, 1.312161683779635, 369);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.312, 1.312]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-848.1706220521272), 184, 184);
      illinoisSolver0.setup(184, harmonicOscillator0, 184, 2269.64498, (-1292.0));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [184, 2,269.645], values: [563.846, 135.032]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(805.5960244524355, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688, 18.596177432888688);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(262, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 262, (double) 262, allowedSolution0);
      assertEquals(262.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(38.00951579236812, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(69, (UnivariateRealFunction) cbrt0, (-1727.41196433), (double) 69, allowedSolution0);
      assertEquals((-829.205982165), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.519353714485151E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      double double0 = illinoisSolver0.solve(3304, (UnivariateRealFunction) inverse0, (-2586.8018761267203), (double) 3304, (-2586.8018761267203));
      assertEquals((-2586.8018761267203), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.459286351794599E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688, 18.596177432888688, 18.596177432888688);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(852.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688, 18.596177432888688, 18.596177432888688);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(237.5546212947594, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.596177432888688, 18.596177432888688, 18.596177432888688);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(858, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 858, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(858.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(794.8229413582177, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(794.8229413582177, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0), (-1.0));
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(376, (UnivariateRealFunction) sinh0, (-1.0), 601.820897592514, 601.820897592514);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (376) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(852, (UnivariateRealFunction) tan0, 18.596177432888688, (double) 852, 18.596177432888688, allowedSolution0);
      assertEquals(18.596177432888688, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(794.8229413582175, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(744, (UnivariateRealFunction) cos0, (double) 744, 3294198.0, allowedSolution0);
      assertEquals(744.0, illinoisSolver0.getMin(), 0.01);
      assertEquals(1579409.003054713, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1757.86), (-0.12502530217170715));
      // Undeclared exception!
      illinoisSolver0.solve(2147456468, (UnivariateRealFunction) inverse0, (-3790.0), 18.596177432888688, 2.3605437049077693E-6);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(18.173999686735666, 18.173999686735666, 18.173999686735666);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(865, (UnivariateRealFunction) tan0, 18.173999686735666, (double) 865, 18.173999686735666, allowedSolution0);
  }
}
