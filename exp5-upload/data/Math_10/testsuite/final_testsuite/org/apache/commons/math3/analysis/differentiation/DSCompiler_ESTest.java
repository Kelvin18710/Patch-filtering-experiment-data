package org.apache.commons.math3.analysis.differentiation;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DSCompiler_ESTest extends DSCompiler_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(2, 2);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) 1;
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.5707963267948966, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 16;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 2, doubleArray0, (-1431));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1431
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 1, doubleArray0, (-462));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -462
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-4487);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, (-1705), (double[]) null, (-4487));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 7, (double) 1, (double[]) null, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 3;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 29, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 3, doubleArray0, 2, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 3, 0.0, doubleArray0, 3, doubleArray1, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int[] intArray0 = new int[7];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.tan(doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.sin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.rootN(doubleArray0, 3, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.pow(doubleArray0, 2, doubleArray0, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.acos(doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      int int0 = dSCompiler0.getOrder();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 1464, (double[]) null, (-4006));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 1, (double[]) null, (-2674), (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, (-1138), (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, (-121), (double[]) null, (-5029), (double[]) null, 28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 28, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 28
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double[]) null, 2410, (double[]) null, 2410);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-851), 1, (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 4.4510805312036926E-141, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-1), 0.0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-1.0), (double[]) null, 3215, (double) 2, (double[]) null, 2, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-1434.9813), (double[]) null, (-2807), (double) 1, (double[]) null, 72, (-1.0), (double[]) null, 1, (double[]) null, (-1911));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 1, (-1160.699808), doubleArray0, 1, (-3673.7993394), doubleArray0, 1, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, (double[]) null, 0, (double) 0, (double[]) null, 3, (double) 2, (double[]) null, 3, (double) 0, (double[]) null, 429, (double[]) null, 29);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 5, (double[]) null, (-464));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 159);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 159
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.checkCompatibility((DSCompiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 72, (double[]) null, 72, (double[]) null, (-640));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, doubleArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, (-2190), (double[]) null, (-1812));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2190
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 0, (double[]) null, 1673);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray1, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 707, (double[]) null, 378);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.compose(doubleArray0, (-2222), doubleArray0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-629), doubleArray0, 76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 3);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.atan2(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 1305);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1305
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 772);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 772
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 3, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 3230, doubleArray0, 83);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 83
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 3, doubleArray0, (-851));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -851
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 0, 0.0, doubleArray0, 2, 0.0, doubleArray0, 2, 0.0, doubleArray0, 2, doubleArray0, 429);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 429
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination((-1.0), doubleArray0, 3, (-1.0), doubleArray0, 3, 0.0, doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination((-2063.528893), doubleArray0, 1, 548.47747612159, doubleArray0, 1, doubleArray0, 3);
      assertEquals(4, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int[] intArray0 = new int[1];
      intArray0[0] = 434;
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 434 is larger than the maximum (1)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int[] intArray0 = new int[0];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(1, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[1];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      DSCompiler.getCompiler(8, 8);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-1731), (-1731));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1731
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[9];
      double double0 = dSCompiler0.taylor(doubleArray0, 3, doubleArray0);
      assertEquals(3, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      DSCompiler.getCompiler(0, 599);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 1187, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1187
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-873), doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -873
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, (double[]) null, (-4487), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.remainder(doubleArray0, 3, doubleArray0, 0, doubleArray0, 3);
      dSCompiler0.atan(doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1463.7730104897;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 46);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 2, doubleArray0, (-4106));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray1 = new double[9];
      doubleArray1[2] = (double) 2;
      dSCompiler0.sin(doubleArray1, 2, doubleArray1, 2);
      dSCompiler0.tan(doubleArray1, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {1.2845059111062989, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.9092974268256817, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 2;
      dSCompiler0.rootN(doubleArray0, 0, (-24), doubleArray0, 2);
      assertArrayEquals(new double[] {2.0, 0.0, 0.9715319411536059, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 1102, doubleArray0, 3315);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.pow(doubleArray0, 0, 1.0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 2, doubleArray0, 0, doubleArray0, (-895));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -895
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 5);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, 1.0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 2, 750.0, doubleArray0, 1, 0.0, doubleArray0, 2, 499.5456851, doubleArray0, 2, doubleArray0, 35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 35
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 0, (double[]) null, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, (-2665), doubleArray0, (-617), doubleArray0, (-617));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2665
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 3460, (double[]) null, 0, (double[]) null, 3460);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 2753, doubleArray0, 827);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2753
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 2218, (double[]) null, (-1411));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-329), (double) 0, doubleArray0, (-190));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.0, doubleArray0, 68, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3571, doubleArray0, 1217, (-1651.2933755252577), doubleArray0, 1136, 2344.4, doubleArray0, 3571, doubleArray0, 1136);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1217
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-1101), (-1101));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, (-1870), doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, (-3211), (double[]) null, (-1), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 67, doubleArray0, 67);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 67
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 0, doubleArray0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 1517);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 0, (double[]) null, (-5590), (double[]) null, (-5590));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 53, doubleArray0, 0, doubleArray0, 53);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 53
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 2549, doubleArray0, 28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 0, doubleArray0, 262);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 3034);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, (double[]) null, 1295);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.multiply(doubleArray0, 2, doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 28, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 28
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 1);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(2, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(2, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, (-1260));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 4);
      assertNotNull(dSCompiler0);
      
      double[] doubleArray0 = new double[4];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[3];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(2, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, 55);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 528);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 3, doubleArray0, 870);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 4);
      assertNotNull(dSCompiler0);
      
      double[] doubleArray0 = new double[4];
      dSCompiler0.rootN(doubleArray0, 0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 17, doubleArray0, (-1340));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.pow(doubleArray0, 0, (-850), doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[15];
      dSCompiler0.pow(doubleArray0, 2, 1158, doubleArray0, 2);
      assertEquals(6, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, Double.NaN, doubleArray0, 5641);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.linearCombination(0.826821810431806, doubleArray0, 2, 0.0, doubleArray0, 0, 2696.1377496003506, doubleArray0, 0, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      DSCompiler.getCompiler(0, 304);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      double double0 = dSCompiler0.taylor(doubleArray0, 6, doubleArray0);
      assertEquals(6, dSCompiler0.getSize());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(943);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 943
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      // Undeclared exception!
      DSCompiler.getCompiler(28, 28);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(2, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, (-1410));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) 386;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 1798);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) 386;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 3, doubleArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 2431);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[9];
      dSCompiler0.cos(doubleArray0, 3, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 3, doubleArray0, 1233);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = 0.3443927764892578;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, 3, doubleArray0, 2791);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 2, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, 0.0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 2, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-20.559799966255333);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-2633));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2633
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1705.3966786457);
      dSCompiler0.add(doubleArray0, 0, doubleArray1, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {(-1705.3966786457), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int[] intArray0 = new int[3];
      intArray0[2] = (-264);
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      int[] intArray0 = new int[2];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[4];
      dSCompiler0.rootN(doubleArray0, 0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.pow(doubleArray0, 3, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 4857, doubleArray0, 1, 0.0, doubleArray0, 3, (double) (-1), doubleArray0, 3, doubleArray0, 1247);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1247
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.divide(doubleArray0, 3, doubleArray0, 4213, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.acos(doubleArray0, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 1.5707963267948966, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      assertEquals(3, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[3];
      intArray0[0] = 3;
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int int0 = dSCompiler0.getOrder();
      assertEquals(3, int0);
      assertEquals(20, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 27, (double[]) null, 5092);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, (-264), (double[]) null, (-264), (double[]) null, 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 3694, (double[]) null, (-3806));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1155, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 0, (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 3, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 1, doubleArray0, 3499);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-769.58), (double[]) null, (-1967), (-1238.0), (double[]) null, (-1371), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 162.674151546, doubleArray0, 2, doubleArray0, (-1465));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1465
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-7.369842361872221E127), (double[]) null, 16, (-7.369842361872221E127), (double[]) null, 48, 938.2250316943, (double[]) null, 16, (double[]) null, 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-4.1291070428848755E-76), doubleArray0, 0, 4.438921624363781E-8, doubleArray0, 54, (-4.1291070428848755E-76), doubleArray0, 54, (-1587.632993), doubleArray0, 13, doubleArray0, (-5415));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 54
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(69);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 69
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-3336), (-3336));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3336
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 2309, doubleArray0, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 1116, (double[]) null, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 5040, (double[]) null, 3, (double[]) null, 2757);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, (-464), doubleArray0, (-2365), doubleArray0, 61);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -464
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 1400, (double[]) null, 1206);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 3, (double[]) null, (-1150), (double[]) null, (-1150));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, (-3), doubleArray0, (-3), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 0, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, (-2028), doubleArray1, doubleArray1, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-36), doubleArray0, 4940);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 1, doubleArray0, 820);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 820
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      // Undeclared exception!
      DSCompiler.getCompiler(2690, 94);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, (-1410));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      dSCompiler0.tan(doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 2357);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, (-1500));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[10];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 0, doubleArray0, 1537);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 0, doubleArray0, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 1, doubleArray0, (-1134), doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      dSCompiler0.pow(doubleArray0, 2, (-2186.6913643), doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      assertEquals(1, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[6];
      dSCompiler0.linearCombination(0.0, doubleArray0, 2, 1.0, doubleArray0, 0, 0.1677299439907074, doubleArray0, 0, 0.1677299439907074, doubleArray0, 2, doubleArray0, 3);
      assertEquals(3, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-1.0), doubleArray0, 2, doubleArray0, 2);
      assertEquals(3, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      int[] intArray0 = new int[3];
      intArray0[0] = 3;
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 is larger than the maximum (0)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[9];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      double double0 = dSCompiler0.taylor(doubleArray0, 0, doubleArray0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(1);
      assertEquals(3, dSCompiler0.getOrder());
      assertArrayEquals(new int[] {1, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      DSCompiler.getCompiler(0, 399);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(3, dSCompiler0.getOrder());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.pow(doubleArray0, 3, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-36), doubleArray0, 4940);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, (-1), (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 2, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 1480);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 34;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 3);
      // Undeclared exception!
      try { 
        dSCompiler1.log(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 30, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 58, doubleArray0, (-2190));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2190
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 58, doubleArray0, (-2190));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2190
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 1340, doubleArray0, 1);
      assertArrayEquals(new double[] {1.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 1, doubleArray0, 1, doubleArray0, 58);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 58
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 5);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 0, doubleArray0, 983);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 983
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(187.9, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 1272);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1272
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1699.6582456, doubleArray0, 5, 3499.8477911516, doubleArray0, 1, (double) 5, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 2413);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2413
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.cos(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      int int0 = dSCompiler0.getOrder();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 1132, (double[]) null, 297);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 2319, (double[]) null, 2319, doubleArray0, 33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, (-3590), doubleArray0, 750, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3590
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 2, (double[]) null, 33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray1, 0, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, 16, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-1319), 0.0, doubleArray0, 98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1319
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 0, (double[]) null, (-2726), doubleArray0, 519);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 918, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.2445201873779297, (double[]) null, 24, (double) 0, (double[]) null, 2, (double) 2, (double[]) null, 2097, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.0, doubleArray0, 0, 0.0, doubleArray0, 2, 0.0, doubleArray0, 0, doubleArray0, (-3690));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3690
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1062.82, (double[]) null, 1121, 1062.82, (double[]) null, 167, (double) 0, (double[]) null, 0, (double) 0, (double[]) null, 167, (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-5399), 48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5399
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 2, doubleArray0, 17, doubleArray0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 1740, (double[]) null, 39);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, (double[]) null, (-1319));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.checkCompatibility((DSCompiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 3, (double[]) null, 0, (double[]) null, 1265);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 1160, doubleArray0, 51, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1160
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 2, (double[]) null, 22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, (-4511), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4511
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, (-1008), (double[]) null, 569);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 3110);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3110
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 36, (double[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, (-1319));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1319
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, (-2520), doubleArray0, 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, (-908), doubleArray0, (-2487), doubleArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -908
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 2, doubleArray0, (-3072));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3072
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, (-1216));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1216
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 2640);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2640
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 2, doubleArray0, 918);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 918
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 33, 2, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, (-1538), (-1538), doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 1, doubleArray0, (-3180), doubleArray0, 2795);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2795
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 342, doubleArray0, 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.remainder(doubleArray0, 2, doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.linearCombination((-1366.2451518373282), doubleArray0, 0, (double) 2, doubleArray0, 0, (-3676.56007), doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, (-2836), 0.0, (double[]) null, 0, (double[]) null, 111);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 236);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      double double0 = dSCompiler0.taylor(doubleArray0, 1, doubleArray0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(1997);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1997
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      DSCompiler.getCompiler(3110, 3110);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(2, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      DSCompiler.getCompiler(108, 1);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 1;
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 2, 199, doubleArray0, 199);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 199
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      DSCompiler.getCompiler(84, 0);
      int[] intArray0 = new int[1];
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(6, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(118, 118);
      assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.asin(doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(2, int0);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, (-1), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, (-1977), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1977
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      DSCompiler.getCompiler(45, 0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[21];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 511, doubleArray0, 654);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 511
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 2, 0, doubleArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-5));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 8, (double[]) null, 8, (double[]) null, 138);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-2887), 0, (double[]) null, 917);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 1499, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1499
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 8, (double[]) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) (-1), (double[]) null, 195, 1116.98, (double[]) null, 0, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(2.0500353979930155E-8, doubleArray0, 0, 2029.824347, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2746.0), (double[]) null, 0, (double) 0, (double[]) null, 230, (-739.572560824693), doubleArray0, 1178, doubleArray0, 4410);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 4410, doubleArray0, 13, (double) 51, doubleArray0, 1344, (double) 13, doubleArray0, 51, doubleArray0, 843);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-147.558), (double[]) null, 0, (-2.9726830960751796E-9), (double[]) null, 2136, (-2.9726830960751796E-9), (double[]) null, 0, (-147.558), (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 39, 0.0, (double[]) null, 39, (-1.943473623641502E-9), (double[]) null, 39, 0.0, (double[]) null, 1356, (double[]) null, 39);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, (-6), doubleArray0, (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 1712, (double[]) null, 1712, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 837, doubleArray0, 2593);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2593
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-1651), doubleArray0, (-4275));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1651
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 0, (double[]) null, (double[]) null, 45);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 837, doubleArray0, doubleArray0, (-3967));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3967
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.checkCompatibility((DSCompiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 34, doubleArray0, 450);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, (double[]) null, 138);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, (double[]) null, (-148));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 1108, (double[]) null, 1098, (double[]) null, (-1666));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 199, doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 199
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[21];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-191), doubleArray0, 1940);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1940
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 1, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      DSCompiler.getCompiler(1353, 920);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      DSCompiler.getCompiler(0, 0);
      DSCompiler.getCompiler(36, 0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[21];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 1332);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1332
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1494);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1494
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-60));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -60
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.rootN(doubleArray0, 0, 918, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 917, doubleArray0, 917);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 917
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1494);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1494
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 1195.15, doubleArray0, 0, 5.283020542151163E-141, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, 2.0500353979930155E-8, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[5];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      DSCompiler.getCompiler(41, 41);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-2296), (-2296));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2296
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      double double0 = dSCompiler0.taylor(doubleArray0, 5, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 837, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[21];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 643, doubleArray0, 917, doubleArray0, 917);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 643
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      DSCompiler.getCompiler(0, 1421);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1421;
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      DSCompiler.getCompiler(0, 9);
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (double) 9;
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) (-160);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray1, 0, 3, doubleArray0, (-219));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -219
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, (-1045), doubleArray0, (-1045));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1045
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-11), 15, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      DSCompiler.getCompiler(0, 199);
      double[] doubleArray0 = new double[3];
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      DSCompiler.getCompiler(0, 10);
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (double) 10;
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      DSCompiler.getCompiler(0, 561);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 561;
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      DSCompiler.getCompiler(0, 18);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 18;
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 1, doubleArray0, 520);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 520
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(1, (-6298));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, (-2597), 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[25];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray1, 19, doubleArray0, 755);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 755
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, (double[]) null, 1, doubleArray0, (-603));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, (-3184), doubleArray0, (-3184));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3184
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 2455, (double[]) null, 0, (double[]) null, 69);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 555, (double) 555, (double[]) null, 555);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 3065, (double[]) null, 1123);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 234, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 234
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 32, (double) 32, doubleArray0, 32, (-1129.165304933152), doubleArray0, 32, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(9.390271617387205E-237, doubleArray0, 0, 0.0, doubleArray0, 0, (-1.0), doubleArray0, 0, 342.5340328735305, doubleArray0, 4741, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4741
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-1191), doubleArray0, 85);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1191
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[25];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 274, doubleArray0, doubleArray0, 70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, (-2390), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, (-305), doubleArray0, 2654);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -305
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      DSCompiler.getCompiler(0, 1412);
      double[] doubleArray0 = new double[5];
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DSCompiler.getCompiler(0, 9);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[10];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[10];
      dSCompiler0.pow(doubleArray0, 0, (-2525), doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 4039, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4039
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.acos(doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DSCompiler.getCompiler(0, 561);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 1934);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1934
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DSCompiler.getCompiler(0, 424);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.remainder(doubleArray0, 2, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[20];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.0, doubleArray0, 0, 1495729.0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 1.817649308779104E117, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      DSCompiler.getCompiler(0, 1445);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-604), 1431);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      double double0 = dSCompiler0.taylor(doubleArray0, 3, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      // Undeclared exception!
      DSCompiler.getCompiler(1442, 1442);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 1856, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1856
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(12, doubleArray0.length);
  }
@Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      DSCompiler.getCompiler(744, 0);
      int[] intArray0 = new int[2];
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(824, 1);
      assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(1175, (-3201));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3201
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      DSCompiler.getCompiler(1174, 0);
      double[] doubleArray0 = new double[6];
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 832);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 832
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 21, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-2095));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2095
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, (-969), doubleArray0, (-1288));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -969
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      DSCompiler.getCompiler(874, 0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-1), (-2114), doubleArray0, (-707));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 982, (double[]) null, (-175), (double[]) null, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, (-175), doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -175
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 6.645352711199266E-8, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 299, 0.0, doubleArray0, 66);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 299
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 1832, (double[]) null, 26, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, (-1165), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1165
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 1490, (double[]) null, 33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, (-2043), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2043
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 1261, (double) 1261, (double[]) null, 1261, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-5382.9), doubleArray0, 2868, 1340.9690641010175, doubleArray0, 2868, doubleArray0, 2868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2868
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(2986.1, doubleArray0, 0, (-1870.0), doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 79);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 79
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(845.603123674884, (double[]) null, 2, 865.46, (double[]) null, 0, (double) 2, (double[]) null, 28, (double) 28, (double[]) null, 261, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(242.41, doubleArray0, 0, (double) 0, doubleArray0, 0, (-2528.757748655478), doubleArray0, 1490, 2459.814778623, doubleArray0, 1490, doubleArray0, 1490);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1490
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-554), (-554));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -554
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 0, (double[]) null, (-1869));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, doubleArray0, 529, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 33, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 19, (double[]) null, 14, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, (-1), (double[]) null, 334);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, (-4386), doubleArray0, (-4386));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4386
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 1454, doubleArray0, 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1454
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 1714, (double[]) null, 1714, (double[]) null, 350);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, (-518), doubleArray0, 1920, doubleArray0, 1920);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -518
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-2095), doubleArray0, (-2095));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2095
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 3166);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3166
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.rootN(doubleArray0, 0, (-1264), doubleArray0, 0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0}, doubleArray0, 0.01);
      
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 2, 789, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 0, 26, doubleArray0, 3);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-2095), doubleArray0, (-2095));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2095
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(242.41, doubleArray0, 0, (double) 0, doubleArray0, 0, (-2528.757748655478), doubleArray0, 0, 2459.81478, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2641.5334), (double[]) null, 1714, (-2641.5334), (double[]) null, 1714, (double) 0, (double[]) null, (-2319), (double[]) null, 1714);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.linearCombination(1340.9690641010175, doubleArray0, 0, (-102.787709049018), doubleArray0, 1, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      DSCompiler.getCompiler(1174, 0);
      double[] doubleArray0 = new double[7];
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      DSCompiler.getCompiler(2757, 744);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      DSCompiler.getCompiler(1056, 2430);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      double double0 = dSCompiler0.taylor(doubleArray0, 3, doubleArray0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 68, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, 2, (double[]) null, 473);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) 2;
      dSCompiler0.atan(doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 1.1071487177940904, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      dSCompiler0.atan(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.7853981633974483, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 2, doubleArray0, 35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 35
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.atan2(doubleArray0, 2, doubleArray0, 2, doubleArray0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, (-316));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -316
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2;
      dSCompiler0.log(doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.6931471805599453, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      dSCompiler0.rootN(doubleArray0, 1, 30, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      dSCompiler0.rootN(doubleArray0, 1, 30, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray1, 0, (-1121), doubleArray0, (-230));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -230
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, 2, doubleArray0, 3062);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3062
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 63, doubleArray0, (-1268));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1268
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) 2;
      dSCompiler0.pow(doubleArray0, 2, 0.0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3123);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3123
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (double) (-2694);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray1, 1, doubleArray1, (-1418), doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1418
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 2, doubleArray0, 2, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 1, doubleArray0, 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.acos(doubleArray0, 2, doubleArray0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 2, doubleArray0, 1, doubleArray0, 1210);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1210
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-1540.349), doubleArray0, 0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int[] intArray0 = new int[0];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(4, 4);
      assertEquals(70, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(5, 0);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      dSCompiler0.log(doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.exp(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      int int0 = dSCompiler0.getOrder();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 17, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1011);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1011
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 1929, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 13, doubleArray0, 446);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 211, (double[]) null, 504, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 2, 2, (double[]) null, 955);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-3577), 1.103661060333252, (double[]) null, (-3577));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 66, (-535.65388839), doubleArray0, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 66
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 1328, doubleArray0, (-1793), doubleArray0, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, 0, 0.0, (double[]) null, 0, doubleArray0, 908);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, doubleArray0, 1, (double) 2, doubleArray0, 1, doubleArray0, (-742));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -742
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, Double.NaN, doubleArray0, 0, (double) 0, (double[]) null, 317, doubleArray0, 3123);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 48, Double.NaN, doubleArray0, 18, (double) 0, (double[]) null, 317, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-2335.0509832000143), doubleArray0, 0, (-1188.5), doubleArray0, 1, (-1188.5), doubleArray0, 1, doubleArray0, 2582);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2582
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(1188);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1188
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, (-1793), (double[]) null, 211, (double[]) null, (-2558));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 2792, doubleArray0, 1179);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1179
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 36, doubleArray0, 204);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 158, (double[]) null, doubleArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 351, doubleArray0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.checkCompatibility((DSCompiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, (-1571), doubleArray0, 15, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 1, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 2, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 31, doubleArray0, 803);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 158, doubleArray0, (-965));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, (double[]) null, 939, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, (-145), (double[]) null, 1052);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, (-189), doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -189
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.compose(doubleArray0, 2, doubleArray0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 2, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 1);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(2, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[9];
      dSCompiler0.atan(doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 7, doubleArray0, 947);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 947
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(6, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[9];
      dSCompiler0.acos(doubleArray0, 2, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 917);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 917
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.sin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.cos(doubleArray0, 1, doubleArray0, 1);
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 2, doubleArray0, 1542);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1542
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 2, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-530));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -530
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 2, doubleArray0, 1376);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1376
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 20, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.rootN(doubleArray0, 2, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, (-1999), doubleArray0, 3924);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.linearCombination(0.0, doubleArray0, 1, 0.0, doubleArray0, 1, 2.0, doubleArray0, 1, 2.0, doubleArray0, 1, doubleArray0, 1);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination(1880.2726604581, doubleArray0, 0, (double) 0, doubleArray0, 0, 1880.2726604581, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[9];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(4, (-2289));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2289
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      DSCompiler.getCompiler(2, 850);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      double double0 = dSCompiler0.taylor(doubleArray0, 2278, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      DSCompiler.getCompiler(348, 0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 2, doubleArray0, 374);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 374
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-3193), doubleArray0, (-1835), doubleArray0, 436);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3193
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 0);
      try { 
        dSCompiler1.checkCompatibility(dSCompiler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-593.394530013);
      dSCompiler0.rootN(doubleArray0, 0, 56, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      DSCompiler.getCompiler(956, 0);
      double[] doubleArray0 = new double[1];
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      doubleArray0[0] = (-616.8436661549955);
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      doubleArray0[0] = (-616.8436661549955);
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 13, doubleArray0, 5);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      doubleArray0[1] = (-616.8436661549955);
      dSCompiler0.add(doubleArray0, 3, doubleArray0, 1, doubleArray0, 0);
      assertEquals(12, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2496.018098508), doubleArray0, 0, (double) 13, doubleArray0, 0, (double) 13, doubleArray0, 0, 2180.583230542414, doubleArray0, 902, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 902
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      DSCompiler.getCompiler(956, 0);
      int[] intArray0 = new int[6];
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 3, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 6, doubleArray0, 8, doubleArray0, 6);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      DSCompiler.getCompiler(956, 0);
      double[] doubleArray0 = new double[5];
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(12, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(803, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(803, int0);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, (double[]) null, (-1074));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 3, (double[]) null, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      DSCompiler.getCompiler(956, 0);
      double[] doubleArray0 = new double[15];
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, 0, (double[]) null, 867);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 342.6907275952613, (double[]) null, 1659);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 121, (double) 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 121
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-947.317938), (double[]) null, (-2844), 0.6759096384048462, (double[]) null, 4743, doubleArray0, (-2844));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(803.3157832944481, doubleArray0, (-3163), (double) (-3163), doubleArray0, 1, doubleArray0, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3163
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(Double.NaN, doubleArray0, 0, (double) 0, doubleArray0, 956, 0.0, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 956
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 7, (double[]) null, 7, (double) 7, (double[]) null, 15, 2962.587424099, (double[]) null, (-1138), (-1.1288398461391523E-295), (double[]) null, 7, (double[]) null, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(803, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-3287), (-3287));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3287
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, (-1762), (double[]) null, 714, (double[]) null, 1189);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 36, doubleArray0, 36, doubleArray0, 1296);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 4226, (double[]) null, 4226);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 45, (double[]) null, 45, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 45, doubleArray0, 45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 45
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 1053, (double[]) null, (-215), (double[]) null, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 30, doubleArray0, 30, doubleArray0, 59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 30
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 1597, (double[]) null, 1597);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 69, doubleArray0, doubleArray0, 21);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, (-638), doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(56, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, (-490), doubleArray0, (-490), doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -490
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(45, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 45
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 1278);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1278
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1354);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1354
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(12, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[12];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertEquals(12, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-709), 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -709
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 0, (double[]) null, 536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1728, doubleArray0, (-918), doubleArray0, 1728);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1728
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[16];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 3, (-1063.4983288306191), doubleArray0, 3, (double) 0, doubleArray0, 8, doubleArray0, 3);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 3, doubleArray0, 3, doubleArray0, 0);
      assertEquals(4, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[1];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      DSCompiler.getCompiler(1762, 1762);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      DSCompiler.getCompiler(56, 56);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(803, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-4953), doubleArray0, 803, doubleArray0, (-4953));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4953
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1, doubleArray0, 3060);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (double) (-64);
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, (-64));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      dSCompiler0.acos(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 1, doubleArray0, 66);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 918, doubleArray0, 918);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 918
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 3, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 675, doubleArray0, 675);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, (-1), doubleArray0, 1812);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 1, doubleArray0, 1152);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[14];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, 800.12, doubleArray0, (-1381));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 0, doubleArray0, 1036);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 14;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 0, doubleArray0, 30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 30
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination((double) 1, doubleArray0, 1, 2040.98028408565, doubleArray0, 1, doubleArray0, 1);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[8];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.pow(doubleArray0, 2, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(1, int0);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, (-1246), (double[]) null, 5864);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 229, 713, (double[]) null, (-2139));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, (double[]) null, 0, doubleArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1623, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1623
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 2, (double[]) null, 479, (double[]) null, 479);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 2, 0.0, (double[]) null, 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 224, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, 0, 0.0, (double[]) null, 0, (double[]) null, 586);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-126.213077918344), doubleArray0, 0, 0.0, doubleArray0, (-998), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -998
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-3574.4239), (double[]) null, 905, 1.1768108384670781E-7, doubleArray0, (-1470), 0.0, doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-868.3812224551984), doubleArray0, 1279, (double) 0, doubleArray0, 0, (double) 0, doubleArray0, 23, doubleArray0, (-1824));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1279
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1831.810742, (double[]) null, 0, 1.241529292737115E-25, doubleArray0, 2022, 0.0, doubleArray0, 1, 0.0, (double[]) null, 1, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 2588, 0.0, doubleArray0, 2588, (double) 2588, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 3527);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2588
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeIndex((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 2, doubleArray0, 37);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, (double[]) null, 0, doubleArray0, 1401);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, (-1517), doubleArray0, 3, doubleArray0, (-1517));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1517
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 1, (double[]) null, doubleArray0, 416);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, (-897), doubleArray0, (-665), doubleArray0, (-897));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 2, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 18, (double[]) null, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 2, (double[]) null, (-185), (double[]) null, 1677);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 1153, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1153
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 1214, (double[]) null, 1214);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 458, doubleArray0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.log(doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(1, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[4];
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.pow(doubleArray0, 0, (-2350), doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-941), (-28), (double[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-2339));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2339
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 2);
      try { 
        dSCompiler1.checkCompatibility(dSCompiler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 1);
      try { 
        dSCompiler1.checkCompatibility(dSCompiler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.atan2(doubleArray0, 2, doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 4);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1, doubleArray0, 3082);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, (double[]) null, (-28));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      dSCompiler0.sin(doubleArray0, 4, doubleArray0, 2);
      assertEquals(2, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[15];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, (-1104));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-618), 3, doubleArray0, 186);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -618
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 2, doubleArray0, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[15];
      dSCompiler0.rootN(doubleArray0, 0, 1, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 40, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 1.0, doubleArray0, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.subtract(doubleArray0, 2, doubleArray0, 2, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.add(doubleArray0, 2, doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-3.93114092562274E40), doubleArray0, 0, 0.0, doubleArray0, 2, 0.0, doubleArray0, 0, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(1.7244737148284912, doubleArray0, 1, (-931.72450970298), doubleArray0, 1, (double) (-462), doubleArray0, 1, doubleArray0, 1);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int[] intArray0 = new int[0];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      DSCompiler.getCompiler(0, 1231);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-358), (-358));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double double0 = dSCompiler0.taylor((double[]) null, 0, (double[]) null);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders((-3645));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3645
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      DSCompiler.getCompiler(1455, 918);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getOrder();
      assertEquals(1, int0);
      assertEquals(1, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
