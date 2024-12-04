package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Inverse;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Power;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.9999997615814209, 0.9999997615814209, 0.9999997615814209);
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) ceil0, 0.0, 0.9999997615814209, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(501, (UnivariateRealFunction) gaussian0, 0.0, 4898.517, (-0.2499999997677497), allowedSolution0);
      assertEquals((-0.2499999997677497), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4898.517, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Gaussian gaussian0 = new Gaussian();
      illinoisSolver0.solve(94, (UnivariateRealFunction) gaussian0, (double) 94, (double) 94, (double) 94);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(94.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(94.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Exp exp0 = new Exp();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-117.861), 1.5707963267948966);
      regulaFalsiSolver0.solve(2619, (UnivariateRealFunction) exp0, (-999.6326), (double) 96, (-1.0));
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-999.6326), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power(905334971);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(905334971, (UnivariateRealFunction) power0, (-1.0), (double) 905334971, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.36787944117, 100, 100);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2627), (UnivariateRealFunction) log1p0, 0.08371849358081818, 1.125, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,627) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(729, (UnivariateRealFunction) sinc0, (double) 729, (double) 729, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [729, 729]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3027), (UnivariateRealFunction) null, (double) (-3027), (double) (-3027), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, (double) 729, (double) 1411, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(162695767, (UnivariateRealFunction) sinh0, (-1939.4275732935148), 4.8639688450993836E-8, (-2169.0805651265), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-531), (UnivariateRealFunction) logit0, (double) (-531), (double) (-531), (double) (-531), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-531) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) floor0, (double) 4, (double) 4, (double) 4, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) null, (double) 2, (double) 2, (double) 2, allowedSolution0);
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Rint rint0 = new Rint();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-14), (UnivariateRealFunction) rint0, (double) (-14), (double) (-14), (double) (-14));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-14) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(100, 100);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(100, (UnivariateRealFunction) log1p0, 0.36787944117, 1.125, 3.2240998453402647E-4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.368, 1.125], values: [0.313, 0.754]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
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
  public void test_0016()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      illinoisSolver0.setup(3, sin0, 3, 1.0E-15, 1.0E-15);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1471.603362789), 668.341);
      Cosh cosh0 = new Cosh();
      pegasusSolver0.setup(2021167881, cosh0, (-329.04030879977), 0.5, 668.341);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-329.04, 0.5], values: [39,752,133,278,725,385,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, 1.128]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(379, (UnivariateRealFunction) sinc0, (-942.186635), (double) 379, 0.5, allowedSolution0);
      assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-933.0530181161686), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, 0.0, (double) 1411, allowedSolution0);
      assertEquals(705.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1410.5751014618152, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1341.94921475, (-900.276746));
      double double0 = illinoisSolver0.solve(2463, (UnivariateRealFunction) sinc0, 1.2246467991473532E-16, (double) 2463, allowedSolution0);
      assertEquals(1231.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2462.991359723423, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, (double) 729, (double) 1411, allowedSolution0);
      assertEquals(1070.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(731.9910882950295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1030, (UnivariateRealFunction) sinc0, 2.056746462459552E-4, (double) 1030, allowedSolution0);
      assertEquals(515.0001028373232, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1027.3007977238353, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(729, (UnivariateRealFunction) sinc0, (-2451.487577032675), 1103.76, allowedSolution0);
      assertEquals((-673.8637885163375), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2450.4422698000276), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(729, (UnivariateRealFunction) sinc0, (-2189.690079552086), (double) 729, allowedSolution0);
      assertEquals((-730.345039776043), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2189.6900795514193), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, 1.0847659812708365E-4, 750.855152, allowedSolution0);
      assertEquals(375.42763023829906, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(750.840643416685, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, (double) 729, (double) 1411, allowedSolution0);
      assertEquals(1070.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(731.9910882950295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(729, (UnivariateRealFunction) sinc0, (-2988.0), (double) 729, allowedSolution0);
      assertEquals((-1129.5), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2189.690079552086), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1411, (UnivariateRealFunction) sinc0, (double) 729, (double) 1411, allowedSolution0);
      assertEquals(1070.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(731.9910882864218, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(414, (UnivariateRealFunction) sinc0, 0.14204727336694215, (double) 414, allowedSolution0);
      assertEquals(207.0710236366835, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(411.5486376202629, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(461, (UnivariateRealFunction) sinc0, (double) 1030, 8.0E298, allowedSolution0);
      assertEquals(4.0E298, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.36787944117, 100, 100);
      double double0 = pegasusSolver0.solve(100, (UnivariateRealFunction) log1p0, (-0.7009175092540497), 0.36787944117, allowedSolution0);
      assertEquals((-0.16651903404202484), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.7009175092540497), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(1030, (UnivariateRealFunction) sinc0, (double) 1030, (double) 8388607, allowedSolution0);
      assertEquals(1030.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(8385463.71273819, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      double double0 = illinoisSolver0.solve(96, (UnivariateRealFunction) floor0, (-1.0), (double) 96, (-1.0));
      assertEquals((-1.0), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Sqrt sqrt0 = new Sqrt();
      illinoisSolver0.solve(1411, (UnivariateRealFunction) sqrt0, (-4406.551848), 0.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-4406.551848), illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(77831, (UnivariateRealFunction) sinc0, (-5.950443523075282E-7), (-0.49999999999999994), 3.7585232820829423E-4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0, -0.5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-746.70004552606));
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2145003271, (UnivariateRealFunction) atan0, (-3506.48315), 1.0, 0.625, allowedSolution0);
      assertEquals(0.625, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2489.560633918422));
      Logit logit0 = new Logit(731, 731);
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      double double0 = pegasusSolver0.solve(731, univariateRealFunction0, 1102.94517, 1.0, 0.06666666666666667);
      assertEquals(0.06666666666666667, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1102.94517, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2960.4513, 2960.4513);
      Atan atan0 = new Atan();
      double double0 = pegasusSolver0.solve(863, (UnivariateRealFunction) atan0, (-2.418998385952148E10), 1.0822986951097846E-10, (double) 863);
      assertEquals(863.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.6667207273454747), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5);
      Power power0 = new Power(4186);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      illinoisSolver0.solve(4186, (UnivariateRealFunction) power0, 0.0, 0.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2960.4513, 2960.4513);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(863, (UnivariateRealFunction) atan0, (-2399.2734330395), 114.528396777, 3.5075881977330454E-11, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(3.5075881977330454E-11, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(114.528396777, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2960.4513, 1.0E-6);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(863, (UnivariateRealFunction) atan0, (-7.800414592973399E-9), 1.0E-6, 16.24616058563575, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(16.24616058563575, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.800414592973399E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit(690.5, 1919896475);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1919896475, (UnivariateRealFunction) logit0, 690.5, (double) 1919896475, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (double) 97, (double) 97, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [97, 97]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(258, (UnivariateRealFunction) null, (double) 258, (double) 258, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (-1336.48), (double) 97, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(4292, (UnivariateRealFunction) inverse0, (-86.264), (double) 4292, (double) 4292, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2961.277406256209, 1.0E-6);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(87, (UnivariateRealFunction) atan0, 1.0E-6, (-7.800414592973399E-9), (double) 87, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2565, (UnivariateRealFunction) null, (double) 2565, (double) 2565, (double) 2565, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2.384185791015625E-7, (-2587.13861991));
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-17), (UnivariateRealFunction) gaussian0, (double) (-17), 2.384185791015625E-7, 2.384185791015625E-7);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-17) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (double) 97, (double) 97, (double) 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [97, 97]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
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
  public void test_0052()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-216.87595173423), (-216.87595173423));
      Acosh acosh0 = new Acosh();
      pegasusSolver0.setup(5, acosh0, 3317.04, (-2416.702), (-216.87595173423));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,317.04, -2,416.702]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-216.87595173423), (-216.87595173423));
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      pegasusSolver0.setup(137, univariateRealFunction0, (-216.87595173423), 137, (-216.87595173423));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-216.876, 137], values: [-0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1274057968, (UnivariateRealFunction) atan0, (-1336.47898), (double) 1274057968, allowedSolution0);
      assertEquals(6.370283157605101E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.438801571874737E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(80, (UnivariateRealFunction) atan0, (-1336.47898), (double) 80, allowedSolution0);
      assertEquals((-628.23949), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.8156083064713453E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(76, (UnivariateRealFunction) atan0, (-782.6697874421), (double) 76, allowedSolution0);
      assertEquals((-353.33489372105), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.1630177987421385E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(80, (UnivariateRealFunction) atan0, (-1336.3314089795924), (double) 80, allowedSolution0);
      assertEquals((-628.1657044897962), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.512219879117782E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (-1336.47898), (double) 97, allowedSolution0);
      assertEquals((-619.73949), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.5796125320648182E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (-1321.6171243218857), (double) 97, allowedSolution0);
      assertEquals((-612.3085621609429), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.8904117543367973E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (-1336.47898), (double) 97, allowedSolution0);
      assertEquals((-619.73949), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.5796125320648182E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1315676009, (UnivariateRealFunction) atan0, (-1587.07819688), (double) 1315676009, allowedSolution0);
      assertEquals(6.578372109609015E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.1051107681544844E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(138, (UnivariateRealFunction) atan0, (-1336.47898), (double) 138, allowedSolution0);
      assertEquals((-599.23949), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.076367821074451E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(97, (UnivariateRealFunction) atan0, (-1336.47898), (double) 97, allowedSolution0);
      assertEquals((-619.73949), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-6.625298683423601E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) atan0, (-1336.48), 4.9E-324, (-1.0252505950876338E-8), allowedSolution0);
      assertEquals((-1.0252505950876338E-8), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.2E-321), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4659.3861864));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(183, (UnivariateRealFunction) expm1_0, (-4659.3861864), (double) 183, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (183) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Atan atan0 = new Atan();
      double double0 = pegasusSolver0.solve(544, (UnivariateRealFunction) atan0, (double) 544, 0.0, (double) 544);
      assertEquals(544.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2961.277406256209, 1.0E-6);
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(87, (UnivariateRealFunction) atan0, 108.58727085971327, (double) 863, (-1823.2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [108.587, 863], values: [1.562, 1.57]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2960.4513, 1.0E-6);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-416), (UnivariateRealFunction) atan0, 1.0E-6, 2960.4513, (double) (-416), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-416) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2959.9598984652284, 2959.9598984652284, 2959.9598984652284);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
  }
}
