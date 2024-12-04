package org.apache.commons.math.optimization.general;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[8];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-1);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1742.52915385));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1742.52915385));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-299.486592312729));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-1252);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(171.718);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(100.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-928);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-2750.585449));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-6294.821322282985));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-6294.821322282985));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[7];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-83);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(90.533253);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0E-10);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-513);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-984.08));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance((-984.08));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-984.08));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-258);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(1632.891598);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-4501.04));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(61.983);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-613);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.POSITIVE_INFINITY);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(2.2204E-16);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(1039.4046151);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[4][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-370);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[4][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.cols = 100;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(-0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[4][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.cols = 0;
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(2, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      double[] doubleArray2 = new double[7];
      doubleArray1[0] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1[1], (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      doubleArray1[1] = doubleArray2;
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(10835.66741116723, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(2.2250738585072014E-308);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1145.15));
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[4];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(3, levenbergMarquardtOptimizer0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      double[] doubleArray2 = new double[7];
      doubleArray1[2] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[4];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      doubleArray1[1] = doubleArray2;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1145.15));
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(500.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[4];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(3, levenbergMarquardtOptimizer0.getIterations());
  }
}
