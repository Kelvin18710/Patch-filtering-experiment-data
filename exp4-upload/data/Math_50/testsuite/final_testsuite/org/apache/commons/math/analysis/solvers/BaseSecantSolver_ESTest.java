package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Logistic;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(835821, (UnivariateRealFunction) expm1_0, (-3501.957107978), 0.0, allowedSolution0);
      assertEquals((-1750.978553989), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1183, (UnivariateRealFunction) inverse0, (-244.0648132076763), 1215.7491016829572, 1310.044136225531, allowedSolution0);
      assertEquals(1310.044136225531, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.1342326382010603E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Log1p log1p0 = new Log1p();
      double double0 = illinoisSolver0.solve(52, (UnivariateRealFunction) log1p0, 0.0, 1.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(255, (UnivariateRealFunction) asin0, 0.0, 857.759066769, (-378.03373766495724), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-378.03373766495724), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.solve(158, (UnivariateRealFunction) sinc0, 2353.68490307, 3922.923, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(3138.303951535, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2456.7254551072183, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2101309387, (UnivariateRealFunction) sinc0, 2.356194490192345, (double) 2101309387, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2474, (UnivariateRealFunction) sinc0, (-448.66465464408896), (double) 2474, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,474) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1101.5371291, 4340.2, 0.036);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1311, (UnivariateRealFunction) inverse0, 1693.68, 73.11685498751422, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,693.68, 73.117]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(142, (UnivariateRealFunction) null, (double) 142, (double) 142, allowedSolution0);
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
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(287030, (UnivariateRealFunction) sinc0, 7.0, (double) 287014, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Power power0 = new Power(6611);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(6611);
      // Undeclared exception!
      pegasusSolver0.solve(6611, (UnivariateRealFunction) power0, (-2737.291515885), 771.66, 771.66, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) atan0, (-220.903872), 0.14285714285714285, (-2741.53527850404), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Power power0 = new Power(6611);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(6611, (UnivariateRealFunction) power0, (double) 6611, (double) 6611, (double) 6611, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [6,611, 6,611]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(286, (UnivariateRealFunction) null, (double) 286, (double) 286, (double) 286, allowedSolution0);
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
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2098, (UnivariateRealFunction) sinc0, 2227.01819513, 1.0, (-2654.35765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,227.018, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-139), (UnivariateRealFunction) null, (double) (-139), (double) (-139), (double) (-139));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
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
  public void test_0017()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.setup(347, sinc0, 347, 70.3677467459936, 70.3677467459936);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [347, 70.368]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      regulaFalsiSolver0.setup(202594942, minus0, (-2354.17814278564), (-2100.21), (-2354.17814278564));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,354.178, -2,100.21], values: [2,354.178, 2,100.21]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2098);
      double double0 = regulaFalsiSolver0.solve(1288396105, (UnivariateRealFunction) sinc0, 0.11764700710773468, (double) 1288396105, allowedSolution0);
      assertEquals(6.441980525588236E8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.288396103296562E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(557, (UnivariateRealFunction) tanh0, (-441.22422037944773), (double) 557, allowedSolution0);
      assertEquals(57.887889810276135, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.990377250047605E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2102739148, (UnivariateRealFunction) cbrt0, (-1.0), (double) 2102739148, allowedSolution0);
      assertEquals(1.0513695735E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(6.966809495655713E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2098);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2098, (UnivariateRealFunction) sinc0, (-441.22422037944773), (-292.28523445), allowedSolution0);
      assertEquals((-366.7547274147239), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-314.89330744667024), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(4339, (UnivariateRealFunction) inverse0, (-942.9608779659054), (double) 4339, allowedSolution0);
      assertEquals(1698.0195610170474, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.533270279986163E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.solve(2103, (UnivariateRealFunction) sinc0, (-442.964103), (double) 2103, (double) 2103);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(2103.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-439.82297150257256), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(835821, (UnivariateRealFunction) sinc0, 2353.68490307, (double) 835821, allowedSolution0);
      assertEquals(419087.342451535, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(835707.6281520353, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(835821, (UnivariateRealFunction) sinc0, 2353.982883377625, (double) 835821, allowedSolution0);
      assertEquals(419087.49144168885, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(835531.6989634342, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(835821, (UnivariateRealFunction) sinc0, 2353.68490307, (double) 835821, allowedSolution0);
      assertEquals(419087.342451535, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(835707.6281520353, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3261, (UnivariateRealFunction) sinc0, (-444.08040211600655), (double) 3261, allowedSolution0);
      assertEquals((-444.08040211600655), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(3260.9731745887175, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2098, (UnivariateRealFunction) sinc0, (-441.22), (double) 2098, allowedSolution0);
      assertEquals((-441.22), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(2038.8936321797758, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double double0 = pegasusSolver0.solve(2098, (UnivariateRealFunction) sinc0, (-3025.5105754302645), (-441.22422037944773), (double) 2098);
      assertEquals(2098.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3025.353725406971), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power(823);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(823, (UnivariateRealFunction) power0, (-285.74051482385), (double) 823, (-285.74051482385));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (823) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      double double0 = regulaFalsiSolver0.solve(165, (UnivariateRealFunction) floor0, (-702.02002772), (double) 165, (-702.02002772));
      assertEquals((-702.02002772), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.18628505322578803, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1311, 242.38222333555302, 1311);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      Rint rint0 = new Rint();
      double double0 = regulaFalsiSolver0.solve(2370, (UnivariateRealFunction) rint0, 242.38222333555302, 0.19999954104423523, (-1072.0), allowedSolution0);
      assertEquals((-1072.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.19999954104423523, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2098, (UnivariateRealFunction) sinc0, (-441.22422037944773), (double) 2098, allowedSolution0);
      assertEquals((-441.22422037944773), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1900.663555422064, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(2098, (UnivariateRealFunction) sinc0, (double) 2098, 1.7976931348623157E308);
      assertEquals(2098.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1731.81804), (-1731.81804));
      Power power0 = new Power(6611);
      // Undeclared exception!
      regulaFalsiSolver0.solve(6611, (UnivariateRealFunction) power0, (-1731.81804), (double) 6611, (double) 6611);
  }
@Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(3117, (UnivariateRealFunction) asinh0, (double) 3117, 0.0, (double) 3117);
      assertEquals(3117.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      pegasusSolver0.solve(3221, (UnivariateRealFunction) asinh0, (-1258.0), 4577.455, 4577.455);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(4577.455, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.947055907407068E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1465.8839945075874, 13.07, (-1838.569681707914));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 12;
      doubleArray0[1] = (double) 12;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(12, (UnivariateRealFunction) polynomialFunction0, (-3036.0597), 1465.8839945075874, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-785.0878527462064), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit((-2923.26385), 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(103559952, (UnivariateRealFunction) logit0, (-2923.26385), (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(31, (UnivariateRealFunction) expm1_0, (-1.0), 3.145894820876798E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (31) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1283, (UnivariateRealFunction) signum0, (double) 1283, (double) 1283, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,283, 1,283]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) null, (double) 4, 3214.8919482329, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0);
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1706, (UnivariateRealFunction) log10_0, (double) 0, 3.1012873247934403, 3.9736429850260626E-8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Constant constant0 = new Constant((-2504));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2504), (UnivariateRealFunction) constant0, (double) (-2504), (double) (-2504), (double) (-2504), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,504) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1333, (UnivariateRealFunction) atan0, 13.0, (-1081.0), 1.304E19, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [13, -1,081]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(232, (UnivariateRealFunction) atan0, 1.5665410333304204, 1210.70664807, (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1.567, 1,210.707], values: [1.003, 1.57]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(11, (UnivariateRealFunction) atan0, (-2.6033824355191673E-8), 0.6666666865359983, (-1201.52034), (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Log10 log10_0 = new Log10();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-36.800609), 1706, (-36.800609));
      // Undeclared exception!
      pegasusSolver0.solve(1706, (UnivariateRealFunction) log10_0, 0.0, (double) 1706, (double) 1706);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(31, (UnivariateRealFunction) atan0, 2381.7858396921, (double) 232, (double) 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,381.786, 232]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(151, (UnivariateRealFunction) null, (double) 151, (double) 151, (double) 151);
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
  public void test_0053()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      pegasusSolver0.setup(4, log1p0, 4, 4, 4);
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
  public void test_0054()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Acos acos0 = new Acos();
      illinoisSolver0.setup(80, acos0, 6.295889827757746E-9, 80, 80);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 80], values: [1.571, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(31, (UnivariateRealFunction) atan0, (-2.6033824355191673E-8), 0.6666666865359983, (-1201.52034), allowedSolution0);
      assertEquals((-1201.52034), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.482852672931358E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3193, (UnivariateRealFunction) asinh0, (-438.3323), 3.8586203625898235E-11, allowedSolution0);
      assertEquals((-219.1661499999807), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.4574683166145737E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(3256, (UnivariateRealFunction) asinh0, (-2.673978233859273E-15), (double) 3256, (-1215.7604686790867), allowedSolution0);
      assertEquals((-1215.7604686790867), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(9.094947017729282E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(913, (UnivariateRealFunction) asinh0, (-2625.1367787278), (double) 913, allowedSolution0);
      assertEquals((-856.0683893639), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-9.68436786215061E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(232, (UnivariateRealFunction) atan0, (-1370.6), 7.677299114711294E21, 1.0, allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1370.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(31, (UnivariateRealFunction) expm1_0, (-1.0), 3.145894820876798E-6, allowedSolution0);
      assertEquals((-0.49999842705258957), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.145894820876798E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1312, (UnivariateRealFunction) atan0, (-1214.2500476950909), 1.304E19, (-1214.2500476950909), allowedSolution0);
      assertEquals((-1214.2500476950909), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-8.174651975875801E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1333, (UnivariateRealFunction) atan0, (-1201.52034), 1.304E19, (-1201.52034), allowedSolution0);
      assertEquals((-1201.52034), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(6.5182722473600891E18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(266, (UnivariateRealFunction) atan0, (-1201.52034), 2381.7858396921, 3.1012873247934403, allowedSolution0);
      assertEquals(3.1012873247934403, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1201.52034), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1333, (UnivariateRealFunction) atan0, (-2235.9), (double) 1333, (-2235.9), allowedSolution0);
      assertEquals((-2235.9), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1333.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(835, (UnivariateRealFunction) sinc0, (double) 4, 3210.707691968769, 0.19999954120254515, allowedSolution0);
      assertEquals(0.19999954120254515, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3210.7076919687684, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(37, (UnivariateRealFunction) expm1_0, (-1764.41468313), (double) 37, (-1761.82915739691));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (37) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Atan atan0 = new Atan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(232, (UnivariateRealFunction) atan0, (-1370.6), 7.677299114711294E21, 1.0, allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5.103439681656164E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.3333333134651184);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.solve(234871, (UnivariateRealFunction) tanh0, 1.0, (double) 0, (double) 234871, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(234871.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-12.33724142814998), (-12.33724142814998), 0.49423143328424196);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(266, (UnivariateRealFunction) atan0, 0.0, 0.7512018187608073, allowedSolution0);
      assertEquals(0.37560090938040364, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-585.0), (-585.0));
      assertEquals((-585.0), pegasusSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.304E19, 1.304E19, 1.304E19);
      Atan atan0 = new Atan();
      regulaFalsiSolver0.solve(29000, (UnivariateRealFunction) atan0, (-0.48807337205887685), 1.9699272335463627E-8, 1.4110894749057413E-19);
  }
@Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-1.2894843995880004E-113), (double) 1826, (-0.12502530217170715), allowedSolution0);
      assertEquals((-0.12502530217170715), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Gaussian gaussian0 = new Gaussian();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(193, (UnivariateRealFunction) gaussian0, (double) 20, (double) 193, 4.9E-324);
      assertEquals(4.9E-324, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(193.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3.141592653589793), (-3.141592653589793), 114.0);
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(234, (UnivariateRealFunction) identity0, (-331.593959092874), 114.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-108.796979546437), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1494.22037);
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      illinoisSolver0.solve(1435, (UnivariateRealFunction) cbrt0, (-1782.4085997042866), 1.0, 1494.22037, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1494.22037, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(3813, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), 1799.8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) asin0, (double) 1, (double) 1, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(134217729, (UnivariateRealFunction) logit0, (double) 134217729, (double) 134217729, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 134,217,729 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1494.22037);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Power power0 = new Power((-589.578659));
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1435, (UnivariateRealFunction) power0, (-1824.62978441858), 0.07692307692307693, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,824.63, 0.077], values: [\uFFFD, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1495.7408472244388);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Expm1 expm1_0 = new Expm1();
      illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), 440.743228, 440.743228, allowedSolution0);
      illinoisSolver0.doSolve();
      // Undeclared exception!
      illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), (double) 2545, (double) 2545, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3244.19873), (-3244.19873));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2144535169, (UnivariateRealFunction) cbrt0, 2223.1517911519945, (-3244.19873), (double) 2144535169, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,223.152, -3,244.199]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(196, (UnivariateRealFunction) null, (double) 196, (double) 196, (double) 196, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1495.7408472244388);
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), 440.743228, 440.743228, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1495.7408472244388);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Expm1 expm1_0 = new Expm1();
      illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), 440.743228, 440.743228, allowedSolution0);
      illinoisSolver0.doSolve();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1815.100317585661);
      // Undeclared exception!
      regulaFalsiSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-349.825793), 2223.151827632895, (-1782.4085997042866));
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2042, (UnivariateRealFunction) ulp0, (double) 2042, (double) 2042, (double) 2042);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,042, 2,042]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1495.7408472244388);
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-897.3443603855324), (-4.030764912991526E-56), (-4.030764912991526E-56));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-897.344, -0], values: [-1, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1495.7408472244388);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Expm1 expm1_0 = new Expm1();
      illinoisSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-1782.4085997042866), 440.743228, 440.743228, allowedSolution0);
      illinoisSolver0.doSolve();
      IllinoisSolver illinoisSolver1 = new IllinoisSolver();
      illinoisSolver1.solve(2144525751, (UnivariateRealFunction) expm1_0, (-597.52023), 440.743228, allowedSolution0);
      illinoisSolver1.doSolve();
      // Undeclared exception!
      illinoisSolver1.doSolve();
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1494.22037);
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
  public void test_0089()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid((-0.041429049505300256), 749);
      regulaFalsiSolver0.setup(749, sigmoid0, 3538.503604876, 3538.503604876, 0.5);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,538.504, 3,538.504]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0927593352081957E-14, 3.6676005444723E-15, 887);
      regulaFalsiSolver0.setup(887, harmonicOscillator0, (-1070.672668847824), 3.6676005444723E-15, 1504.5839203839946);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,070.673, 0], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2651, (UnivariateRealFunction) cbrt0, (-1337.848263595273), (double) 2651, (double) 2651, allowedSolution0);
      assertEquals(2651.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.735487667319632E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-249.2242339985563), (double) 1826, (-249.2242339985563), allowedSolution0);
      assertEquals((-249.2242339985563), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.151270306618153E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2677, (UnivariateRealFunction) cbrt0, (-1339.17729696), (double) 2677, (double) 2677, allowedSolution0);
      assertEquals(2677.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.2006822801676974E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-249.2242339985563), (double) 1826, (-249.2242339985563), allowedSolution0);
      assertEquals((-249.2242339985563), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.063004594099879E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1858, (UnivariateRealFunction) cbrt0, (-268.4025679333524), (double) 1858, (-268.4025679333524), allowedSolution0);
      assertEquals((-268.4025679333524), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.3103166657799414E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(2640, (UnivariateRealFunction) cbrt0, (-1339.17729696), (double) 2640, (double) 2640, allowedSolution0);
      assertEquals(2640.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.0898392402834422E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-249.2242339985563));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-249.2242339985563), (double) 1826, (-249.2242339985563), allowedSolution0);
      assertEquals((-249.2242339985563), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4748547760675003E-46), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3244.19873), (-3244.19873));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2144535467, (UnivariateRealFunction) cbrt0, (-3244.19873), 1.0E-15, allowedSolution0);
      assertEquals((-1622.099365), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.5376609658848353E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-249.2242339985563));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-249.2242339985563), (double) 1826, (-249.2242339985563), allowedSolution0);
      assertEquals((-249.2242339985563), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4748547760675003E-46), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-249.2242339986), (-249.2242339986));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(132, (UnivariateRealFunction) cbrt0, (-249.2242339986), (double) 132, (-249.2242339986), allowedSolution0);
      assertEquals((-249.2242339986), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.3548292611127774E-47, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-249.2242339985563));
      Cbrt cbrt0 = new Cbrt();
      double double0 = illinoisSolver0.solve(1089, (UnivariateRealFunction) cbrt0, (-9.82014138354278E-46), 2220.75805638978, (-9.82014138354278E-46));
      assertEquals((-9.82014138354278E-46), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      double double0 = regulaFalsiSolver0.solve(2069, (UnivariateRealFunction) ceil0, (double) 2069, (-0.1666666567325592), (double) 2069);
      assertEquals(2069.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.1666666567325592), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(237, (UnivariateRealFunction) gaussian0, (double) 237, (double) 237, (double) 237, allowedSolution0);
      assertEquals(237.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(237.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1815.100317585661);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2545, (UnivariateRealFunction) expm1_0, (-349.825793), 2223.151827632895, (-1782.4085997042866));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,545) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-221.90144163225804), (-221.90144163225804));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(132, (UnivariateRealFunction) cbrt0, (-221.90144163225804), (double) 132, (-221.90144163225804), allowedSolution0);
      assertEquals((-221.90144163225804), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.43467415851888E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-249.2242339985563), (-249.2242339985563), (-249.2242339985563));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1826, (UnivariateRealFunction) cbrt0, (-249.2242339985563), (double) 1826, (-249.2242339985563), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,826) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3625, (UnivariateRealFunction) sinh0, 0.0, 4.857373710489989E-10, allowedSolution0);
      assertEquals(2.4286868552449945E-10, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(81, 77.281438487201, 98.9480400014);
      double double0 = regulaFalsiSolver0.solve(81, (UnivariateRealFunction) sin0, (-61.862202732), (-0.2499999997677497), (-0.2499999997677497), allowedSolution0);
      assertEquals((-0.2499999997677497), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-61.862202732), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = illinoisSolver0.solve(1237, (UnivariateRealFunction) gaussian0, (double) 1237, (double) 1237, (double) 1237);
      assertEquals(1237.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1237.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Rint rint0 = new Rint();
      double double0 = regulaFalsiSolver0.solve(124, (UnivariateRealFunction) rint0, (-959.37562), 236.51406634655956, (-1544.24));
      assertEquals((-1544.24), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.46407384084395176), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.5830993332061267E-10, 1.5830993332061267E-10);
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(119, (UnivariateRealFunction) floor0, (-460.99800379036), 1.5607961601207294, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-229.71860381511962), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5595866364183901, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2759.622867483), (-2.962221541430069E-5));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(222879506, (UnivariateRealFunction) sin0, (-2.962221541430069E-5), 1.0E-14, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1.4811107702150346E-5), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4624597658583711E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.4698569875578686), (-0.4698569875578686));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(222879551, (UnivariateRealFunction) sin0, (-0.4698569875578686), (double) 222879551, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), 1.0E-6);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1318), (UnivariateRealFunction) sin0, 0.0558677079692223, 495.093260243, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,318) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.5830993332061267E-10, 1.5830993332061267E-10);
      Acos acos0 = new Acos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3392, (UnivariateRealFunction) acos0, (double) 3392, (-2052.660437319), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,392, -2,052.66]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(30, (UnivariateRealFunction) null, (double) 30, (double) 30, allowedSolution0);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2146706742, (UnivariateRealFunction) cos0, (-1016.3871860735549), (double) 2146706742, (-1016.3871860735549), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(81, 77.281438487201, 98.9480400014);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(81, (UnivariateRealFunction) sin0, 3178.3, (-3358.07395599), (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,178.3, -3,358.074]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3384.7927803427), (-2759.622867483));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3, (UnivariateRealFunction) sin0, (-2759.622867483), 6.000360459735117E8, (double) 612406985, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,759.623, 600,036,045.974], values: [-0.965, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Sin sin0 = new Sin();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), 1.0E-6);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(81, (UnivariateRealFunction) sin0, (-1.0), 1913.01, 1.0E-6, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      illinoisSolver0.solve(837971130, (UnivariateRealFunction) sinh0, (-2399.0479724887086), (double) 837971130, (double) 837971130);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2759.622867483), (-2.962221541430069E-5));
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(222879506, (UnivariateRealFunction) sin0, 1729.47, 542.0, (-2759.622867483));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,729.47, 542]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Sin sin0 = new Sin();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(81, 77.281438487201, 98.9480400014);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(81, (UnivariateRealFunction) sin0, 6.569478691775192E-9, 0.9146954625387622, 0.0558677079692223);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0.915], values: [0, 0.792]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
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
  public void test_0125()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log10 log10_0 = new Log10();
      regulaFalsiSolver0.setup(3, log10_0, 3, (-3736.86431), 3);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, -3,736.864]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      regulaFalsiSolver0.setup(2766, cos0, (-0.2499999701976776), 2766, 2766);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0.25, 2,766], values: [0.969, 0.171]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146706750, (UnivariateRealFunction) cos0, (-985.411375), (double) 2146706750, (-985.411375), allowedSolution0);
      assertEquals((-985.411375), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.149534286490813E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(142, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 142, (-0.7872739309301284), allowedSolution0);
      assertEquals((-0.7872739309301284), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(14.137166941154343, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146706750, (UnivariateRealFunction) cos0, (-985.6101523909731), (double) 2146706750, (-985.6101523909731), allowedSolution0);
      assertEquals((-985.6101523909731), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(9.114636745290452E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146706750, (UnivariateRealFunction) cos0, (-985.411375), (double) 2146706750, (-985.411375), allowedSolution0);
      assertEquals((-985.411375), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.149534286490813E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146706750, (UnivariateRealFunction) cos0, (-987.817839506885), (double) 2146706750, (-987.817839506885), allowedSolution0);
      assertEquals((-987.817839506885), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.4355767680070415E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146706750, (UnivariateRealFunction) cos0, (-987.817839506885), (double) 2146706750, (-987.817839506885), allowedSolution0);
      assertEquals((-987.817839506885), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(3.435576768007052E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 161, (-0.7872739309301284), allowedSolution0);
      assertEquals((-0.7872739309301284), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 161, (-0.7872739309301284), allowedSolution0);
      assertEquals((-0.7872739309301284), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.5707963270765304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) cos0, (-1.199693300307616), (double) 161, (-1.199693300307616), allowedSolution0);
      assertEquals((-1.199693300307616), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(20.420352248333657, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 161, (-0.7872739309301284), allowedSolution0);
      assertEquals((-0.7872739309301284), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(166, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 166, (-0.7872739309301284), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (166) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) cos0, (-0.7872739309301284), (double) 161, (-0.7872739309301284), allowedSolution0);
      assertEquals((-0.7872739309301284), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.5707963270765304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), 1.0E-6);
      double double0 = pegasusSolver0.solve(81, (UnivariateRealFunction) sin0, 77.281438487201, 99.04032877869552, (-1.0), allowedSolution0);
      assertEquals((-1.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(78.53981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3384.7927803427), 1.2675934823758863E-8);
      illinoisSolver0.solve(81, (UnivariateRealFunction) sin0, (-0.2499999997677497), 1.2675934823758863E-8, 1.0E-6, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Power power0 = new Power((-1913.46375134));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(3326, (UnivariateRealFunction) power0, (-1913.46375134), (double) 3326, allowedSolution0);
      assertEquals((-1913.46375134), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(3326.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Sin sin0 = new Sin();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1287.1069589, (-2759.622867483));
      double double0 = pegasusSolver0.solve(612406985, (UnivariateRealFunction) sin0, 0.0, (-1052.491369076523), 400.2215125);
      assertEquals((-1052.491369076523), pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2518, (UnivariateRealFunction) sinh0, (-2398.53776376877), (double) 2518, (-2398.53776376877));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,518) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1972495046, (UnivariateRealFunction) tanh0, 0.0, 913.0430086812099, allowedSolution0);
      assertEquals(456.52150434060496, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(97);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2376, (UnivariateRealFunction) tanh0, 0.0, (-1461.1173948191), 0.1818181574344635, allowedSolution0);
      assertEquals(0.1818181574344635, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      regulaFalsiSolver0.solve(1160226168, (UnivariateRealFunction) tanh0, (double) 8388608, 0.0, (-3079.03913));
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-3079.03913), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.solve(8388608, (UnivariateRealFunction) tanh0, (-331.947329), 0.0036);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-165.9718645), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(7.025197849986616E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1871.89725730781), (-1871.89725730781), (-882.573476275613));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1871.89725730781);
      doubleArray0[1] = (-1871.89725730781);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(2451, (UnivariateRealFunction) polynomialFunction0, 0.0, (-1.0), 1034.16831321, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1034.16831321, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(3411, (UnivariateRealFunction) expm1_0, (-4.910186024616902E-7), (double) 3411, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Constant constant0 = new Constant(1);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) constant0, (double) 1, (double) 1, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2143961423, (UnivariateRealFunction) log0, 2605.4471081095, 2605.4471081095, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,605.447, 2,605.447]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1717, (UnivariateRealFunction) null, (double) 1717, (double) 1717, allowedSolution0);
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
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1705757, (UnivariateRealFunction) tanh0, (-523.0631952815069), (double) 1705757, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(1646653761, (UnivariateRealFunction) sinh0, (-3056.06713563), (double) 1646653761, (double) 1646653761, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-20158), (UnivariateRealFunction) cbrt0, (double) (-20158), (double) (-20158), (double) (-20158), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-20,158) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2146914321, (UnivariateRealFunction) identity0, (double) 2146914321, (double) 2146914321, (double) 2146914321, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,146,914,321, 2,146,914,321]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) null, (double) 1, (double) 1, (double) 1, allowedSolution0);
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit(1.2675934823758863E-8, 428190478);
      // Undeclared exception!
      illinoisSolver0.solve(428190478, (UnivariateRealFunction) logit0, 1.2675934823758863E-8, (double) 428190478, (-2245.574182247128));
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Identity identity0 = new Identity();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1554), (UnivariateRealFunction) identity0, (double) (-1554), (double) (-1554), (double) (-1554));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,554) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2358, (UnivariateRealFunction) sinh0, (double) 2358, (double) 2358, (double) 2358);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,358, 2,358]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(273, (UnivariateRealFunction) null, (double) 273, (double) 273, (double) 273);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
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
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.setup(2, tanh0, 3323.4, 3323.4, (-4.9E-324));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,323.4, 3,323.4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      illinoisSolver0.setup(2303, signum0, (-1090.4235537639372), (-1.0), 55.866193016664205);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,090.424, -1], values: [-1, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2440, 2440, 2440);
      double double0 = illinoisSolver0.solve(2440, (UnivariateRealFunction) tanh0, (-523.0632), (double) 2440, 1.0E-15, allowedSolution0);
      assertEquals(1.0E-15, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(958.4684, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1735, (UnivariateRealFunction) sin0, (-4.9E-324), (double) 1735, allowedSolution0);
      assertEquals(867.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.2737367544323206E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1705757, (UnivariateRealFunction) tanh0, (-425.1164315), (double) 1705757, allowedSolution0);
      assertEquals(852665.9417842501, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-5.629184085231403E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1705757, (UnivariateRealFunction) tanh0, (-0.7419927353575904), (double) 1705757, allowedSolution0);
      assertEquals(852878.1290036323, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.576331047554963E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1705760, (UnivariateRealFunction) tanh0, (-4669.752381393147), (double) 1705760, allowedSolution0);
      assertEquals(850545.1238093035, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.1322184643522365E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(638, (UnivariateRealFunction) tanh0, (-2325.947), (double) 638, (-2325.947));
      assertEquals((-2325.947), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.251675665039861E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2440, (UnivariateRealFunction) tanh0, (-523.0632), (double) 2440, allowedSolution0);
      assertEquals(958.4684, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.682212544063799E-33, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1705757, (UnivariateRealFunction) tanh0, (-1595.5), (double) 1705757, allowedSolution0);
      assertEquals(852080.75, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.3681777357954484E-21), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1705730, (UnivariateRealFunction) tanh0, (-523.0631952815069), (double) 1705730, allowedSolution0);
      assertEquals(852603.4684023592, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(9.784113969681376E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1264, (UnivariateRealFunction) tanh0, (-524.1356375657015), (double) 1264, allowedSolution0);
      assertEquals(369.93218121714926, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-7.559887557560902E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(8388625, (UnivariateRealFunction) tanh0, (-523.063), (double) 8388625, allowedSolution0);
      assertEquals(4194050.9684999995, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.987079850360987E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1705704, (UnivariateRealFunction) tanh0, (-523.0631952815069), (double) 1705704, allowedSolution0);
      assertEquals(852590.4684023592, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.2018154037923834E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2090856442, (UnivariateRealFunction) tanh0, (-523.0631952815069), (double) 2090856442, allowedSolution0);
      assertEquals(1.0454279594684024E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(7.262923308560751E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-3053.5750433601715), (-3053.5750433601715));
      double double0 = illinoisSolver0.solve(2140145821, (UnivariateRealFunction) tanh0, (-331.947329), 0.0036);
      assertEquals((-165.9718645), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1705730, (UnivariateRealFunction) tanh0, (-523.0631952815069), (double) 1705730, allowedSolution0);
      assertEquals(852603.4684023592, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4964421228014777E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(1073741824, (UnivariateRealFunction) tanh0, (-523.0631952815069), 1.6672829664E-314, (-523.0631952815069));
      assertEquals((-523.0631952815069), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-8.704270728765E-312), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Floor floor0 = new Floor();
      illinoisSolver0.solve(160, (UnivariateRealFunction) floor0, (double) 160, 0.008333333333333333, (double) 160);
  }
@Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(224, (UnivariateRealFunction) sin0, 5.0487097934144756E-29, (double) 224, (double) 224, allowedSolution0);
      assertEquals(224.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Asin asin0 = new Asin();
      pegasusSolver0.solve(544688836, (UnivariateRealFunction) asin0, 0.0, 0.0, 1.0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6);
      Logistic logistic0 = new Logistic(1.0E-6, 1.0E-6, 1.0E-6, 2118, 0.5, 1.0E-6);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      pegasusSolver0.solve(2118, univariateRealFunction0, (double) 2118, 0.5, 2292.368);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(2292.368, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2118.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2453.201758246684));
      Gaussian gaussian0 = new Gaussian((-1.0), 5017.0);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      illinoisSolver0.solve(2051826725, univariateRealFunction0, (-2453.201758246684), (double) 5017, 5017.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(5017.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.9999999998902172), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2475.5591);
      // Undeclared exception!
      illinoisSolver0.solve(170206, (UnivariateRealFunction) expm1_0, (-2681.009), 1772.300343, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.3142197306483), (-2447.3142197306483));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-756782062), (UnivariateRealFunction) expm1_0, (double) 1200, (double) 1200, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-756,782,062) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(369, (UnivariateRealFunction) expm1_0, 261.272328, (-3754.18881936), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [261.272, -3,754.189]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2308, (UnivariateRealFunction) null, (double) 2308, (double) 2308, allowedSolution0);
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.3142197306483), (-2447.3142197306483));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(170198, (UnivariateRealFunction) expm1_0, (-2447.3142197306483), (double) 170198, (double) 170198, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2433.942518661498), (-2433.942518661498));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2202), (UnivariateRealFunction) expm1_0, 0.001768673083148542, 0.001768673083148542, (double) 170198, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,202) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.3142197306483), (-2447.3142197306483));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(170198, (UnivariateRealFunction) expm1_0, (double) 170198, 3.288858706157284E-39, 580.2481157766, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [170,198, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(166, (UnivariateRealFunction) null, (double) 166, (double) 166, (double) 166, allowedSolution0);
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.0), (-2447.0));
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(170206, (UnivariateRealFunction) expm1_0, (-2447.0), 1.01, 1.01, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.3142197306483), (-2447.3142197306483));
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      illinoisSolver0.solve(170206, (UnivariateRealFunction) expm1_0, (-2447.3142197306483), 1083.4445932734047, (double) 170206);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2145750771), (UnivariateRealFunction) logit0, (double) (-2145750771), (double) (-2145750771), (double) (-2145750771));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,145,750,771) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (double) 104, (double) 104, (double) 104);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [104, 104]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (double) 104, 1813.1202032357476, 1813.1202032357476);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [104, 1,813.12], values: [-0.322, -0.409]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
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
  public void test_0200()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      pegasusSolver0.setup(2547, sinh0, 2547, 2547, 2547);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,547, 2,547]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2103.053599, 2103.053599);
      Cos cos0 = new Cos();
      illinoisSolver0.setup(4, cos0, (-1321.443268290491), 4, 2103.053599);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,321.443, 4], values: [-0.393, -0.654]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (double) 104, 1169.215305466, allowedSolution0);
      assertEquals(636.607652733, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(841.9468311620647, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1589, (UnivariateRealFunction) sin0, (double) 1589, 2319.47434170706, (double) 1589, allowedSolution0);
      assertEquals(1589.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1979.203371761562, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, 6.665544878926496E-14, (double) 104, (double) 104, allowedSolution0);
      assertEquals(104.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(103.67255756846319, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2475.5591);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1200, (UnivariateRealFunction) expm1_0, (-2447.3142197306483), 0.704064887632669, 0.704064887632669, allowedSolution0);
      assertEquals(0.704064887632669, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1236.595766748623), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, 0.07842259109020233, (double) 104, allowedSolution0);
      assertEquals(52.0392112955451, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(103.67255756846313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2475.5591);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1200, (UnivariateRealFunction) expm1_0, (-2447.3142197306483), 0.704064887632669, (-5.0487097934144756E-29), allowedSolution0);
      assertEquals((-5.0487097934144756E-29), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.704064887632669, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, 0.08, (double) 104, allowedSolution0);
      assertEquals(52.04, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(103.67255756846319, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (-0.006829191521100919), 1693.29, 549.77382, allowedSolution0);
      assertEquals(549.77382, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.3688530201147343E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(1593, (UnivariateRealFunction) sin0, 0.008333333333333333, (double) 1593, 0.008333333333333333);
      assertEquals(0.008333333333333333, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(15.707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.47881629816613847, 0.47881629816613847, 0.47881629816613847);
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(231, (UnivariateRealFunction) sin0, 0.47881629816613847, (double) 231, 0.2640822136985751, allowedSolution0);
      assertEquals(0.2640822136985751, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(15.652895503184627, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.704064887632669);
      double double0 = regulaFalsiSolver0.solve(1200, (UnivariateRealFunction) expm1_0, (-1.0), 1.01, allowedSolution0);
      assertEquals(0.004999999999999893, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(117, (UnivariateRealFunction) sin0, (double) 117, 0.0, (double) 117);
      assertEquals(117.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.704064887632669);
      double double0 = regulaFalsiSolver0.solve(1200, (UnivariateRealFunction) expm1_0, (-1.0), 1.01, allowedSolution0);
      assertEquals(0.004999999999999893, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.955629158907555E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Sin sin0 = new Sin();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (double) 104, 549.77382, (double) 104);
      assertEquals(104.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(245.04422698000388, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2447.3142197306483), (-2447.3142197306483));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(170198, (UnivariateRealFunction) expm1_0, (-2447.3142197306483), 1.01, 1.01, allowedSolution0);
      assertEquals(1.01, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-5.0487097934144756E-29), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      illinoisSolver0.solve(517, (UnivariateRealFunction) sigmoid0, (-1444.6720320787658), 1.0, (-2180.551538914431));
  }
}
