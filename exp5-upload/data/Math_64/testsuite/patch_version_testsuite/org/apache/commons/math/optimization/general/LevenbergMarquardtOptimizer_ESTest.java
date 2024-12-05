package org.apache.commons.math.optimization.general;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
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
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-145.932));
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
      levenbergMarquardtOptimizer0.cols = (-2231);
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
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.cols = 183;
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
  public void test_0004()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance((-3010.4581808240014));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1294.04609113);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      assertEquals(1, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[2] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      levenbergMarquardtOptimizer0.doOptimize();
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(7, levenbergMarquardtOptimizer0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[2] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-1000.0));
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
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[3];
      SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker(100, 100);
      doubleArray0[1] = (double) 100;
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[2] = doubleArray0;
      levenbergMarquardtOptimizer0.setMaxEvaluations(100);
      MultivariateMatrixFunction multivariateMatrixFunction1 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction1).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction1).when(differentiableMultivariateVectorialFunction0).jacobian();
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
  public void test_0010()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[2] = doubleArray0;
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
  public void test_0011()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-145.932));
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(3, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[2] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-145.932));
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(577.3502691896257, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray1[0]).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimension mismatch 8 != 6
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
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
      levenbergMarquardtOptimizer0.cols = (-117);
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
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(3321.3428659646106);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      assertEquals(1, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1435.7147));
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1435.7147));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
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
  public void test_0019()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      double[][] doubleArray1 = new double[6][8];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-1435.7147));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
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
  public void test_0020()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      double[][] doubleArray1 = new double[6][8];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-10000.0));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[0]);
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
  public void test_0021()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1435.7147));
      double[] doubleArray1 = new double[6];
      double[][] doubleArray2 = new double[6][8];
      doubleArray1[0] = (double) 100;
      doubleArray2[2] = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray2, (Object) doubleArray2).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(408.248290463863, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      double[][] doubleArray1 = new double[6][8];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[6];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.targetValues = doubleArray0;
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, levenbergMarquardtOptimizer0.targetValues);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(408.248290463863, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[0]);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimension mismatch 0 != 1
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-5398);
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
  public void test_0027()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[0]);
      assertEquals(1, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (-1928.78);
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray2, doubleArray2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to perform Q.R decomposition on the 1x1 jacobian matrix
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-2398.122944097536));
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      levenbergMarquardtOptimizer0.setOrthoTolerance((-2398.122944097536));
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-2398.4));
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      levenbergMarquardtOptimizer0.setOrthoTolerance((-50025.01250625313));
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // orthogonality tolerance is too small (-50,025.013), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) doubleArray0, (Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-2525.203284120717));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0);
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(3, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0));
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) doubleArray0, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
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
  public void test_0034()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      levenbergMarquardtOptimizer0.setOrthoTolerance((-2398.4));
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.getCovariances();
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(101000.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray0, doubleArray2);
      assertEquals(166, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      double[][] doubleArray1 = new double[1][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(levenbergMarquardtOptimizer0.residuals).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray0, doubleArray2);
      assertEquals(1, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      levenbergMarquardtOptimizer0.setMaxIterations(100);
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residuals;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residuals, (Object) levenbergMarquardtOptimizer0.residuals, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
@Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
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
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-681);
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
  public void test_0042()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.POSITIVE_INFINITY);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(3011.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(Double.POSITIVE_INFINITY);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
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
  public void test_0047()  throws Throwable  {
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
  public void test_0048()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-2911);
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
  public void test_0049()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(1863.26);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.5);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.5);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(1863.26);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
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
  public void test_0054()  throws Throwable  {
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
  public void test_0055()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-3160);
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
  public void test_0056()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      double[][] doubleArray2 = new double[0][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray2).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[6]);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimension mismatch 0 != 7
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
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
  public void test_0062()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-1087);
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
  public void test_0063()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray2;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-519.1911740338046));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1754.0612716512));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1754.0612716512));
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // orthogonality tolerance is too small (-1,754.061), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[6]);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-8.271386898174E-312));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NEGATIVE_INFINITY);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // orthogonality tolerance is too small (-0), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[0];
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-2698.3047703566426));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-2698.3047703566426));
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(3, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[2] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[6]);
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-8.241582911176E-312));
      levenbergMarquardtOptimizer0.setOrthoTolerance((-8.241582911176E-312));
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // orthogonality tolerance is too small (-0), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[2] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[6]);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-8.241582911176E-312));
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(377.9644730092272, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][1];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[6]);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-8.241582911176E-312));
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[7][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[5];
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
  public void test_0074()  throws Throwable  {
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
  public void test_0075()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-6169);
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
  public void test_0076()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance(2372.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1472.1793));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance(1);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
@Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1[1]).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimension mismatch 8 != 3
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-1179);
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
  public void test_0083()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      double[] doubleArray2 = new double[3];
      doubleArray2[1] = (-0.4666945058319012);
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-0.4666945058319012));
      double[] doubleArray3 = new double[1];
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray0, doubleArray3);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to perform Q.R decomposition on the 3x1 jacobian matrix
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      doubleArray0[1] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 371.6393898374;
      doubleArray2[1] = 1.1102230246251565E-14;
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray2, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(8, levenbergMarquardtOptimizer0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NEGATIVE_INFINITY);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to perform Q.R decomposition on the 3x3 jacobian matrix
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      doubleArray0[2] = (double) 100;
      double[] doubleArray2 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray0, doubleArray0);
      assertEquals(2, levenbergMarquardtOptimizer0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-2480.21));
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      doubleArray0[0] = (double) 100;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray1[1], (Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, levenbergMarquardtOptimizer0.residuals, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(4, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[3];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray2, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray2);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1511.74));
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      levenbergMarquardtOptimizer0.jacobian = null;
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[1] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
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
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][8];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[1]);
      assertEquals(1, levenbergMarquardtOptimizer0.getEvaluations());
  }
@Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[4];
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
  public void test_0093()  throws Throwable  {
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
  public void test_0094()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-3247);
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
  public void test_0095()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-1843.96718));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(607.2973);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(180.7436);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0));
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }
}
