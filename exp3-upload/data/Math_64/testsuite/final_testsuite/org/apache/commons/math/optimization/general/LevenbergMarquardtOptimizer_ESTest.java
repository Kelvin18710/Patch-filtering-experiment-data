package org.apache.commons.math.optimization.general;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  public void test_0001()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-1057);
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
  public void test_0002()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance((-2005.0));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1912.39214));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(474.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
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
  public void test_0007()  throws Throwable  {
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
  public void test_0008()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-519);
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
  public void test_0009()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(2.2250738585072014E-306);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(2627.18247543057);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-485.4));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
}
