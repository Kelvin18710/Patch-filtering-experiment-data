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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, 845);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 845
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 3, doubleArray0, 101);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 101
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[14];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 2, doubleArray0, 38);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 2, doubleArray0, 1234);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1234
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.6724261045455933;
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 68, doubleArray0, (-560));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -560
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 3, doubleArray1, 1176, doubleArray1, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 532, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 1843, doubleArray0, (-1002));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1002
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[14];
      doubleArray0[2] = (double) 2;
      dSCompiler0.pow(doubleArray0, 2, 2, doubleArray0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 2, doubleArray0, 38);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, 1311, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, 0.0, doubleArray0, 143);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 143
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 1;
      dSCompiler0.remainder(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.8776378474431369;
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.add(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[20];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 3, 0.0, doubleArray0, 3, (-3482.0218), doubleArray0, 7, doubleArray0, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
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
  public void test_0018()  throws Throwable  {
      DSCompiler.getCompiler(536, 0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 1, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(1, (-277));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -277
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 1265, doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, (-1531), (double[]) null, (-1));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, (-359), doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 2326, (double[]) null, 2, (double[]) null, (-2835));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 176, (double[]) null, 0, doubleArray0, 176);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-344), (-25), (double[]) null, (-344));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 3, doubleArray0, 0, doubleArray0, (-5));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, (double[]) null, 0);
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
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(3.79438125545842E-8, (double[]) null, 755, (-474.20866603186), (double[]) null, 1601, doubleArray0, 4);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 42, (double) 0, doubleArray0, 0, doubleArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 42
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1518, (double[]) null, 3, (-1.0), (double[]) null, 137, 0.0, (double[]) null, 3, (double[]) null, (-693));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 42, (double[]) null, 42, 1041.9, (double[]) null, 1, (double) 1, (double[]) null, 2, (-896.9011), (double[]) null, 0, (double[]) null, 32);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1500, doubleArray0, 1500, (double) 0, doubleArray0, (-1387), (double) 0, doubleArray0, (-3896), (double) (-1387), doubleArray0, 1431, doubleArray0, 1500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1500
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, (double[]) null, 3, (double[]) null, 2);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 1843, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
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
  public void test_0045()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 3, (double[]) null, 369, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 227, doubleArray0, (-3642), doubleArray0, 227);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 227
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, (-2584), doubleArray0, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
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
  public void test_0049()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 314, doubleArray0, 0, doubleArray0, 3785);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 314
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 1014, doubleArray0, 610);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 1, doubleArray0, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-440), doubleArray0, (-104));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -104
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(5, 0);
      assertNotNull(dSCompiler0);
      
      double[] doubleArray0 = new double[8];
      dSCompiler0.multiply(doubleArray0, 5, doubleArray0, 5, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, (double[]) null, 0, doubleArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 3);
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
  public void test_0058()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 0);
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
  public void test_0059()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[22];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[20];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, 22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[16];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[22];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.remainder(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      dSCompiler0.add(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination((-1248.1), doubleArray0, 0, Double.NaN, doubleArray0, 1, (-1248.1), doubleArray0, 0, Double.NaN, doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 439.0907248, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination(816.5704121, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
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
  public void test_0076()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      DSCompiler.getCompiler(7, 7);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      double double0 = dSCompiler0.taylor(doubleArray0, 3, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(493);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 493
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      DSCompiler.getCompiler(0, 6);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getOrder();
      assertEquals(1, int0);
      assertEquals(1, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[22];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[16];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 219, doubleArray0, 0, doubleArray0, 122);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 219
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[22];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(1, dSCompiler0.getSize());
  }
@Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 1190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      dSCompiler0.pow(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) 1;
      dSCompiler0.rootN(doubleArray0, 2, 4049, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.rootN(doubleArray0, 2, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 891, doubleArray0, 834);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, (-1951.098923914967), doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1;
      dSCompiler0.pow(doubleArray0, 1, 1.0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1512.0, doubleArray0, 0, 0.0, doubleArray0, 1892, 0.0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, (-4302));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1892
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
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
  public void test_0096()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1, doubleArray0, 1, doubleArray0, (-27));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -27
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.linearCombination(3.0, doubleArray0, 0, 3.0, doubleArray0, 1, doubleArray0, 1);
      assertEquals(1, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 3981.114606, doubleArray0, 1, (-3535.864756), doubleArray0, 1, doubleArray0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.atan(doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      int[] intArray0 = new int[1];
      intArray0[0] = 3;
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 2, doubleArray0, 52);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 2, doubleArray0, (-444));
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
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 17, (double) 0, (double[]) null, (-766));
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
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 0, (double[]) null, 0, doubleArray0, 0);
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
        dSCompiler0.multiply(doubleArray0, (-2775), doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2775
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, (-2031), doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 26, doubleArray0, (-3086));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(3.0, doubleArray0, (-320), (double) 1, doubleArray0, 2501, doubleArray0, 2501);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -320
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, (-1766), 1.0, (double[]) null, (-1766), 0.0, (double[]) null, 0, (double[]) null, (-1766));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) (-1144), (double[]) null, 0, (double) (-1144), doubleArray0, (-5809), 0.0, (double[]) null, 348, 0.0, doubleArray0, 348, doubleArray0, 348);
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
  public void test_0115()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 1003);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 2, (double[]) null, 1113, (double[]) null, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, doubleArray0, 45);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-506), doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -506
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
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
  public void test_0120()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 30, (double[]) null, 9, doubleArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 33, doubleArray0, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, (double[]) null, 1190);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 2, doubleArray0, 290);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, (-915), doubleArray0, 45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -915
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 1069, (double[]) null, 364, doubleArray0, 364);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, (-471), doubleArray0, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.compose(doubleArray0, 3, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-2235), doubleArray0, 234);
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
      double[] doubleArray0 = new double[6];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
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
  public void test_0134()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
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
  public void test_0136()  throws Throwable  {
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
  public void test_0137()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 1190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 2, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.asin(doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 1, doubleArray0, 249);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      assertEquals(4, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[7];
      dSCompiler0.tan(doubleArray0, 3, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.sin(doubleArray0, 1, doubleArray0, 1);
      assertEquals(3, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 1, doubleArray0, 27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      assertEquals(4, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[7];
      dSCompiler0.cos(doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, (-1015), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1015
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, 2, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 1184, doubleArray0, 1184);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
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
  public void test_0155()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 1069, doubleArray0, 660, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1069
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, 0, (-2.483811732227808E-8), (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
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
  public void test_0158()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 3);
      assertEquals(1, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[1];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(3, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      DSCompiler.getCompiler(0, 1244);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-637), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -637
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      double double0 = dSCompiler0.taylor(doubleArray0, 15, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(1003);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1003
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      // Undeclared exception!
      DSCompiler.getCompiler(11, 11);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 1118, (double[]) null, 1118, (double[]) null, (-1015));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      int int1 = 62;
      double[] doubleArray0 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 1, (double[]) null, 1402);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 1;
      doubleArray0[4] = (double) 1;
      doubleArray0[5] = (double) 1;
      dSCompiler0.acos(doubleArray0, 1, doubleArray0, 0);
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.pow(doubleArray0, 0, 1.0, doubleArray0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 20, doubleArray0, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      int int0 = 895;
      double[] doubleArray0 = null;
      int int1 = 25;
      int int2 = 60;
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 25, (double[]) null, 60);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      dSCompiler0.linearCombination(0.0, doubleArray0, 1, (-2.5243286814648133E-8), doubleArray0, 1, doubleArray0, 0);
      doubleArray0[1] = (double) 1;
      int int0 = 2751;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1, doubleArray0, 2751);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      dSCompiler0.linearCombination(0.0, doubleArray0, 1, (-2.5243286814648133E-8), doubleArray0, 1, doubleArray0, 0);
      doubleArray0[1] = (double) 1;
      int int2 = 2751;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1, doubleArray0, 2751);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 1;
      dSCompiler0.getOrder();
      int int0 = 1027;
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 2651, doubleArray0, 1027, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2651
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      int int1 = 895;
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 0, (double[]) null, 0, (double[]) null, 895);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 56;
      doubleArray0[1] = (-1157.40689793);
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = 2351.6722617112;
      int[] intArray0 = dSCompiler1.getPartialDerivativeOrders(0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 1);
      int[] intArray0 = new int[0];
      dSCompiler0.getPartialDerivativeIndex(intArray0);
      int int1 = (-53);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1549, doubleArray0, (-53));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1549
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 1);
      int int1 = 1549;
      int[] intArray0 = new int[0];
      dSCompiler0.getPartialDerivativeIndex(intArray0);
      int int2 = (-53);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1549, doubleArray0, (-53));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1549
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 1073.9, doubleArray0, 0, (double) 0, doubleArray0, 1, (-343.0), doubleArray0, 1, doubleArray0, 121);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 121
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.taylor(doubleArray0, 643, doubleArray0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1602, 1602);
      assertNull(dSCompiler1);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      int int2 = 0;
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 1;
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = (double) 1;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (double) 1;
      int int2 = 45;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, (-2333), doubleArray0, (-1503));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1, doubleArray0, 788);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 0, (double[]) null, 0, (double[]) null, (-2045));
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
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      int int1 = 895;
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 895, doubleArray0, 895, doubleArray0, (-20));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 895
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      assertEquals(1, dSCompiler0.getSize());
      assertNotNull(dSCompiler0);
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {1.0, 2.0}, doubleArray0, 0.01);
      
      dSCompiler0.pow(doubleArray0, 1, 2.0, doubleArray0, 0);
      assertArrayEquals(new double[] {4.0, 2.0}, doubleArray0, 0.01);
      
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 1;
      doubleArray1[2] = (double) 1;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (-2207.195088204567);
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (double) 1;
      doubleArray1[7] = (double) 1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = (double) 34;
      doubleArray2[1] = (double) 34;
      doubleArray2[2] = (double) 1;
      doubleArray2[3] = (-2207.195088204567);
      doubleArray2[4] = (double) 0;
      doubleArray2[5] = (-2207.195088204567);
      doubleArray2[6] = (double) 0;
      doubleArray2[7] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 34, doubleArray1, 1, doubleArray2, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 3170);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      double[] doubleArray1 = null;
      int int0 = 33;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double[]) null, 552, doubleArray0, (-394));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-581.5009032732), (double[]) null, 66);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      doubleArray0[4] = (double) 0;
      double double0 = (-205.91078359217);
      int int0 = 6;
      int int1 = (-4132);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.0, doubleArray0, 0, (-205.91078359217), doubleArray0, 6, 0.0, doubleArray0, (-4132), doubleArray0, (-4132));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 1;
      doubleArray1[1] = (double) 1;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 1;
      doubleArray1[4] = (double) 1;
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (double) 0;
      doubleArray1[7] = (double) 0;
      doubleArray1[8] = (double) 1;
      dSCompiler0.divide(doubleArray0, 1, doubleArray0, 1, doubleArray1, 0);
      doubleArray0[0] = (double) 1;
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      double[] doubleArray2 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 33, doubleArray0, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      int int2 = 586;
      int int3 = 0;
      int int4 = 271;
      int int5 = 2;
      dSCompiler0.divide(doubleArray0, 1, doubleArray0, 271, doubleArray0, 2);
      int int6 = 6;
      DSCompiler.getCompiler(271, 2);
      double double0 = 1.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) int5;
      doubleArray1[1] = (double) int0;
      doubleArray1[2] = (double) int3;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = double0;
      doubleArray2[1] = (double) int5;
      doubleArray2[2] = (double) int1;
      doubleArray2[3] = (double) int3;
      doubleArray2[4] = (double) int2;
      doubleArray2[5] = (double) int5;
      doubleArray2[6] = double0;
      doubleArray2[7] = double0;
      double double1 = 0.0;
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      DSCompiler.getCompiler(0, 303);
      double[] doubleArray0 = new double[8];
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1602, 1602);
      assertNull(dSCompiler1);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 1045);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 33, doubleArray0, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double double0 = (-2941.15);
      int int0 = 186;
      double double1 = (-969.6842166131);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 186;
      doubleArray0[2] = (double) 186;
      doubleArray0[3] = (double) 0;
      int int1 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-969.6842166131), doubleArray0, 0, (-2941.15), doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 169);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 169
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = null;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-1957.7447516536);
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 186;
      doubleArray1[3] = (double) 186;
      doubleArray1[4] = (-1957.7447516536);
      doubleArray1[5] = (double) 186;
      doubleArray1[6] = (double) 0;
      int int0 = 1121;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 0, (-1957.7447516536), doubleArray1, 1121, 186.0, (double[]) null, 0, doubleArray1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      int int1 = 186;
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2941.15), doubleArray0, 0, (double) 0, doubleArray0, 0, (-2941.15), doubleArray0, 186, doubleArray1, 186);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 186
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int1 = 0;
      int int2 = (-880);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) (-880);
      doubleArray0[2] = (double) (-880);
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) (-880);
      doubleArray0[6] = (double) (-880);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, (-761), doubleArray1, 126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      doubleArray0[2] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 0);
      int int0 = 715;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, (-609), doubleArray0, 715);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -609
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 1764;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 1;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 1764;
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (double) 1;
      doubleArray1[7] = (double) 3186;
      doubleArray1[8] = 3763.626461622;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 3763.626461622, doubleArray1, (-1487));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      int int1 = 2285;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 2285);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2285
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) 50;
      doubleArray1[2] = 0.4248080849647522;
      doubleArray1[3] = 2011.7838;
      doubleArray1[4] = 0.4248080849647522;
      doubleArray1[5] = 2011.7838;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.4248080849647522, (double[]) null, 50, 2011.7838, doubleArray0, 50, doubleArray1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      int int0 = 1384;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1384, doubleArray0, 2670, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1384
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-880), doubleArray0, 0);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2809.51;
      doubleArray1[1] = (double) (-880);
      doubleArray1[2] = (double) 2;
      doubleArray1[3] = (double) 2;
      doubleArray1[4] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 315, doubleArray0, doubleArray1, 158);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray1, 1388, doubleArray1, doubleArray1, 221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, (-685));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      dSCompiler0.rootN(doubleArray0, 0, (-2587), doubleArray0, 0);
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-861), 8.498192212235393E178, doubleArray0, (-3381));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -861
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      int int1 = 720;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 720, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 720
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 186);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 1);
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 15, (-2112.053), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 0, (-1.0), (double[]) null, 0, (-1.0), (double[]) null, 0, (double) 1, (double[]) null, 1, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      int int1 = 45;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 62);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = 1689.1036108524;
      doubleArray0[4] = (double) 1;
      int int0 = (-3808);
      int int1 = 60;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 2621, 366, doubleArray0, 60);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2621
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      dSCompiler0.rootN(doubleArray0, 1, (-1350), doubleArray0, 5);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1173, (-763.50689), doubleArray0, 1897);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1173
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 1739, doubleArray0, (-861));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1739
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      int int2 = 1196;
      int int3 = 571;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1, doubleArray0, 571);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1196;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 1196;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 1196;
      doubleArray0[6] = (double) 1196;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-745.6);
      doubleArray1[1] = (double) 1196;
      doubleArray1[2] = (double) 1196;
      doubleArray1[3] = (double) 1;
      doubleArray1[4] = 1.9256689548492432;
      doubleArray1[5] = 1.9256689548492432;
      doubleArray1[6] = (double) 1196;
      doubleArray1[7] = (-685.159997666);
      doubleArray1[8] = (double) (-239);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.9256689548492432, doubleArray1, 1, (-940.822), doubleArray1, 441, (-685.159997666), doubleArray1, 1196, (-4401.0), doubleArray1, 1444, doubleArray0, 1196);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 441
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0038848218538872, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 506;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 506, doubleArray0, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 506
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-632), (-244));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.getSize();
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-1), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      int int0 = 0;
      int int1 = 303;
      DSCompiler.getCompiler(0, 303);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 303;
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      int int0 = 3;
      DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      doubleArray0[2] = (double) 3;
      doubleArray0[3] = Double.NaN;
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      int int0 = 0;
      int int1 = 3;
      DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 3;
      double double0 = Double.NaN;
      doubleArray0[3] = Double.NaN;
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) (-685);
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 1;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 1033.730053341;
      doubleArray1[3] = (double) 0;
      int int0 = (-8);
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray1, (-259), doubleArray0, (-8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -259
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      doubleArray0[4] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 1879, 0.0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double) 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[3] = (double) 0;
      int int0 = 4158;
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 4158);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4158
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-1328));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1328
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      int int1 = 0;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-2403), doubleArray0, 0);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      int int2 = 2543;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) (-2403);
      doubleArray1[2] = (-566.66);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2543, (-2403), doubleArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2543
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 3, (double[]) null, 3, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      int int2 = (-1627);
      double[] doubleArray1 = null;
      int int3 = 1278;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 1278, (double[]) null, 2171, (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 221;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray1, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray1, 0, doubleArray0, 221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      int int1 = (-1821);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(31, 31);
      // Undeclared exception!
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-1328));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1328
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      double double0 = 0.0;
      int int2 = 781;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 781, 781, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 781
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = 1689.1036108524;
      doubleArray0[4] = (double) 1;
      doubleArray0[5] = (double) 1;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (double) 0;
      doubleArray0[8] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 2291);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      int int1 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 2409;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 2409;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 2409;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 1, doubleArray0, 2409);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 2409);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) (-685);
      doubleArray0[2] = (double) 1;
      doubleArray0[3] = (double) 1;
      dSCompiler0.taylor(doubleArray0, 15, doubleArray0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-38), 1.0, doubleArray0, (-685));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -38
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) (-1358);
      doubleArray2[1] = 5.041914939880371;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = 0.0;
      doubleArray2[4] = 0.0;
      doubleArray2[5] = (double) 0;
      doubleArray2[6] = (double) (-1358);
      doubleArray2[7] = (double) (-1358);
      doubleArray2[8] = 0.0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, (-1358), 0.0, doubleArray1, (-1358), 0.0, doubleArray1, 0, 5.041914939880371, doubleArray2, (-1358), doubleArray2, (-953));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1358
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.0, doubleArray0, 775, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 775, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 775
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-250));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 0;
      doubleArray2[2] = (double) 183;
      doubleArray2[3] = 1.1047391891479492;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray1, 0, doubleArray2, 347);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      int int0 = 0;
      int int1 = 303;
      DSCompiler.getCompiler(0, 303);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 303;
      int int2 = (-3139);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (-3355.3399359586);
      doubleArray0[7] = (double) 0;
      doubleArray0[8] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 597, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 597
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-250));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = 496;
      double[] doubleArray0 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 496, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1, doubleArray0, (-1627), (double[]) null, (-1627));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1627
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      assertNotNull(dSCompiler0);
      
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getSize());
      assertEquals(1, dSCompiler0.getOrder());
      
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, (-2650), doubleArray0, (-2650));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2650
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 1, doubleArray0, 3186);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 62, doubleArray0, 62, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 62
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      int int0 = (-3);
      int int1 = 17;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 17, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, 452, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 781, 781, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 781
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-2403), doubleArray0, 0);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      double double0 = 558.546;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) (-2403);
      doubleArray1[2] = (-566.66);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2543, 1020, doubleArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2543
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 53, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 53
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      intArray0[1] = 0;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, (-1496), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1496
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      int int0 = 1;
      int int1 = 925;
      DSCompiler.getCompiler(1, 925);
      int[] intArray0 = new int[4];
      intArray0[0] = int0;
      intArray0[1] = int1;
      intArray0[2] = int1;
      intArray0[3] = int0;
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      int int0 = 303;
      DSCompiler.getCompiler(0, 303);
      double[] doubleArray0 = new double[8];
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (double) 0;
      doubleArray0[8] = (double) 0;
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.0, doubleArray0, 506, doubleArray0, (-609));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 506
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray1, 183, doubleArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 183
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray1, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      double double0 = (-2941.15);
      int int1 = 190;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2941.15), doubleArray0, 0, (double) 0, doubleArray0, 0, (-2941.15), doubleArray0, 190, doubleArray1, 190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 190
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      int int1 = 186;
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) (-1174);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2941.15), doubleArray0, (-1174), (double) 0, doubleArray0, 0, (-2941.15), doubleArray0, 186, doubleArray1, 186);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1174
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      int int0 = 22;
      int int1 = 1804;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 22, doubleArray0, 1804);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 379, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 25, 1.3725786770437066E105, doubleArray0, 25);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 25
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      DSCompiler.getCompiler(0, 0);
      dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, (-685));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 3673, doubleArray0, 14, doubleArray0, 2507);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3673
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-832), 1153);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      int int0 = 496;
      DSCompiler.getCompiler(0, 496);
      double[] doubleArray0 = null;
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      int int0 = 541;
      int int1 = (-216);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 541, doubleArray0, (-216));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 221, doubleArray0, 0, doubleArray0, 221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 221
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3380, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3380
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      int int0 = 0;
      int int1 = 3;
      DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 3;
      doubleArray0[3] = Double.NaN;
      int int2 = (-1439);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      double double0 = dSCompiler0.taylor(doubleArray0, 1041, doubleArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (-385.480037);
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      dSCompiler0.taylor(doubleArray0, 872, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (-385.480037);
      doubleArray1[2] = (double) 872;
      doubleArray1[3] = Double.NaN;
      doubleArray1[4] = (-385.480037);
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (-385.480037);
      doubleArray1[7] = Double.NaN;
      doubleArray1[8] = (double) 872;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (-385.480037);
      doubleArray2[1] = (double) 0;
      doubleArray2[2] = (double) 872;
      doubleArray2[3] = (-385.480037);
      doubleArray2[4] = (double) 0;
      doubleArray2[5] = (double) 872;
      doubleArray2[6] = (double) 872;
      double double0 = dSCompiler0.taylor(doubleArray1, 0, doubleArray2);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      int int0 = 2292;
      DSCompiler.getCompiler(2292, 2292);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      int int1 = 3399;
      int int2 = 180;
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      int int0 = 2751;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1, doubleArray0, 2751);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      int int1 = 571;
      int int2 = 0;
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1, doubleArray0, (-1893), doubleArray0, 2374);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1893
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 0;
      int[] intArray0 = new int[1];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      intArray0[0] = 0;
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
  public void test_0289()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = 1196;
      double[] doubleArray0 = null;
      int int1 = (-4376);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, 0, (double[]) null, (-4376));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      DSCompiler.getCompiler(0, 0);
      int int0 = 496;
      DSCompiler.getCompiler(0, 496);
      double[] doubleArray0 = null;
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      DSCompiler.getCompiler(303, 303);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      int int0 = 2302;
      int int1 = 1419;
      // Undeclared exception!
      DSCompiler.getCompiler(2302, 1419);
  }
@Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 3);
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
  public void test_0294()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 3);
      try { 
        dSCompiler1.checkCompatibility(dSCompiler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 3, (double) 0, doubleArray0, 0);
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 2);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 1118.943061;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, (-1939));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1939
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 3, doubleArray0, (-2214));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2214
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 7, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 1481, doubleArray0, 1481);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1481
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.divide(doubleArray0, 3, doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 2;
      dSCompiler0.pow(doubleArray0, 0, 50, doubleArray0, 2);
      assertArrayEquals(new double[] {2.0, 0.0, 1.125899906842624E15}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 2, (double) 2, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-2077.522);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 3, doubleArray0, 3, doubleArray0, 94);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 94
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-2077.522);
      dSCompiler0.divide(doubleArray0, 3, doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 2);
      dSCompiler0.linearCombination(0.0, doubleArray0, 2, (double) 0, doubleArray0, 0, doubleArray0, 2);
      assertEquals(2, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
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
  public void test_0308()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 4);
      assertEquals(35, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.tan(doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      int int0 = dSCompiler0.getOrder();
      assertEquals(3, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 2, (double[]) null, (-1915));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 59, doubleArray0, 0, doubleArray0, 59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 59
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, (double[]) null, (-445));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, 3713, (double[]) null, 151);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, (-1088), (double[]) null, 0, (double[]) null, (-1029));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, doubleArray0, 983, (double[]) null, 545);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 0, (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1599, (double) 0, doubleArray0, 1599);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1599
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, (-1088), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-1.0), (double[]) null, 178, 1.0, (double[]) null, (-258), (double[]) null, 444);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 2140, (-1.0), doubleArray0, 2140, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2140
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 0, 0.0, (double[]) null, 0, 2206.1062844443745, (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 3, 3.0, doubleArray0, 3, 0.06666666666666667, doubleArray0, 33, doubleArray0, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 1512, (-121.3789002), (double[]) null, 1512, (-3103.4063248), (double[]) null, 1512, (-1.0), (double[]) null, 5, (double[]) null, 0);
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
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(994.208615201, doubleArray0, 1, (double) 1, doubleArray0, 0, (double) 868, doubleArray0, (-1094), 439.9081, doubleArray0, 11, doubleArray0, 3295);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
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
  public void test_0331()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(4560, Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 929, (double[]) null, 0);
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
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 3608);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3608
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, (-2647), (double[]) null, 545);
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
  public void test_0337()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 955, doubleArray0, 2252, doubleArray0, 955);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 955
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, (double[]) null, 522);
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
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, (-1441), (double[]) null, 12);
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
  public void test_0341()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 16, doubleArray0, 536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-4718));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4718
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 3, doubleArray0, 1713);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1713
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-5084), doubleArray0, (-5084));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5084
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (-445), (double[]) null, 551);
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
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 39);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply((double[]) null, 2, (double[]) null, (-1614), (double[]) null, 2);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int int0 = dSCompiler0.getSize();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
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
  public void test_0352()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(4, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[1];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, 536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 536
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 536
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 1445);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1445
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(3, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {1.5707963267948966}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, (-1843));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1843
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.rootN(doubleArray0, 0, 3, doubleArray0, 0);
      assertEquals(3, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 2840);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2840
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[11];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 3, (double) 0, doubleArray0, 0);
      dSCompiler0.linearCombination(2.065941333770752, doubleArray0, 0, 0.0, doubleArray0, 0, 2.065941333770752, doubleArray0, 3, doubleArray0, 3);
      dSCompiler0.acos(doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-3103.4063248), doubleArray0, 0, (double) 0, doubleArray0, 0, (-1.0), doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(4, 0);
      int[] intArray0 = new int[0];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 2, doubleArray0, 1369);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1369
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      DSCompiler.getCompiler(1, 654);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-1529), (-1529));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1529
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      double double0 = dSCompiler0.taylor(doubleArray0, 0, doubleArray0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
  }
@Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 2;
      dSCompiler0.atan(doubleArray0, 1, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 2.0, 1.1071487177940904, 0.2214297435588181, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[6];
      doubleArray1[3] = (double) 3;
      dSCompiler0.acos(doubleArray1, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, (double[]) null, 23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, doubleArray0, (-1851), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1851
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 1.0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, doubleArray0, (-1851), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1851
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 958, doubleArray0, 40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 958
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-629.345);
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, (-3442), doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 1413, 31, (double[]) null, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.pow(doubleArray0, 0, 322, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 2, doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 2, (double[]) null, 25, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 3, doubleArray0, 8, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 0, doubleArray0, (-66));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 0, (double[]) null, (-758), (double[]) null, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1639, doubleArray0, 1639, doubleArray0, 1639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1639
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 36, 1305.7264, doubleArray0, (-899));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, (-3292), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3292
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(194.9138475, (double[]) null, 0, 194.9138475, (double[]) null, 2330, doubleArray0, 53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 11, (-7.490757191850264E-8), doubleArray0, 29, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(Double.NaN, (double[]) null, 929, 1075.74597221, (double[]) null, 3670, 1063.3182939128, (double[]) null, 1, (double[]) null, 748);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(5.390620378060543E-9, doubleArray0, 7, (-969.5706078391992), doubleArray0, (-3453), 495.9175775, doubleArray0, 2, doubleArray0, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, (double[]) null, 18, (double) 1, (double[]) null, 1144, (-17.4950049), doubleArray0, 1, (-17.4950049), doubleArray0, 0, doubleArray0, 3901);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 3, (double) 3, doubleArray0, 1413, (double) 1413, doubleArray0, 1413, 0.0, doubleArray0, 32, doubleArray0, 1413);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1413
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(804);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 804
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
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
  public void test_0408()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 12, doubleArray0, (-1367));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1367
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 21, (double[]) null, 1087);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 1, (double[]) null, (double[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, (-140));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
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
  public void test_0413()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 11, (double[]) null, 501, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 2, doubleArray0, 3, doubleArray0, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 2349, (double[]) null, (-371));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.compose(doubleArray0, (-1), doubleArray0, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, (-2907), doubleArray0, (-2907));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 390, doubleArray0, 390);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 390
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
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
  public void test_0424()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.atan(doubleArray0, 1, doubleArray0, 3);
      assertEquals(1, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, (-3566));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 1048);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1048
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, 722);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.tan(doubleArray0, 3, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.tan(doubleArray0, 2, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      dSCompiler0.sin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 2, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 2, doubleArray0, (-1308));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, 3, doubleArray0, 722);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-1), 2, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, 2620, (double[]) null, (-632));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, 1689.58, doubleArray0, 395);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 395
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.pow(doubleArray0, 0, Double.NaN, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-3514));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3514
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 5122.568057455, doubleArray0, 0, 0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(194.9138475443166, doubleArray0, 0, 194.9138475443166, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
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
  public void test_0448()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(800, (-602));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -602
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-431), (-431));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -431
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      DSCompiler.getCompiler(2, 10);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 1, (double[]) null, 65, (double[]) null, (-2716));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 2, (double[]) null, 2, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
@Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(2, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) 1;
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 1.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, doubleArray0, 309, doubleArray0, 24);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2070.033);
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.rootN(doubleArray0, 2, 4108, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-3371.0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray1, 0, doubleArray1, 0, doubleArray0, 3405);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3405
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-3371.958884603725);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray1, 0, doubleArray1, 0, doubleArray0, (-1997));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1997
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2070.033);
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-3138.983690868), doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 17, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 650);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 650
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler1.atan(doubleArray0, 0, doubleArray0, 1502);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1502
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 58, (double[]) null, 2485, (double[]) null, 58);
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
      double[] doubleArray0 = new double[3];
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
  public void test_0475()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[13];
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, (-1686), doubleArray0, 51);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 0, (double[]) null, 99, (double[]) null, 99);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, (-745), (double[]) null, 0);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 116, (double) 116, doubleArray0, 116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 116
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, (-2241), (double) (-2241), (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(820.9968822771, (double[]) null, (-1), (-323.8459534892), (double[]) null, (-2048), (-2116.9171052), doubleArray0, 3, doubleArray0, 651);
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
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2196.649), (double[]) null, (-2326), (double) (-1), doubleArray0, 0, (double) 0, (double[]) null, 49, 0.0, doubleArray0, 493, doubleArray0, (-2814));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
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
  public void test_0483()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-4), (-4));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 459, (double[]) null, (-1), (double[]) null, (-1));
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
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, (-1), (double[]) null, 1401);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 2997, (double[]) null, (double[]) null, 23);
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
  public void test_0488()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 40, (double[]) null, 0, doubleArray0, 222);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 1932, doubleArray0, 1932, doubleArray0, 1932);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1932
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, (-1), (double[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 45, (double[]) null, 2530);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 971, (double[]) null, 1322);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 2, doubleArray0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.compose((double[]) null, (-1), doubleArray0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-3083));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3083
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 439, (-1), doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 439
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 47, doubleArray0, 47, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 2);
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
  public void test_0501()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 3, doubleArray0, 116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 116
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 3322);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3322
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 3, doubleArray0, (-3145));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3145
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, (-1822));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1822
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, (-606));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -606
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 3, doubleArray0, 3, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 175, doubleArray0, 0, (double) 2429, doubleArray0, 0, 33.3999159379, doubleArray0, 0, (double) 0, doubleArray0, 2429, doubleArray0, 175);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2429
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-754.3674442351), doubleArray0, 0, (double) 0, doubleArray0, 0, (-2.44242319E-315), doubleArray0, 0, doubleArray0, (-797));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -797
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-2080.323311818722), doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[3];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      DSCompiler.getCompiler(8, 3);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      double double0 = dSCompiler0.taylor(doubleArray0, 118, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders((-1509));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1509
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      DSCompiler.getCompiler(0, 1145);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 0);
      try { 
        dSCompiler1.checkCompatibility(dSCompiler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1;
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {1.0, 0.7853981633974483, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
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
  public void test_0534()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1);
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {1.0, (-0.17260374626909167), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[10];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, (-2580));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2580
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 67, doubleArray0, 3227);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3227
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 399, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 399
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-396), doubleArray0, 2763);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2763
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      dSCompiler0.pow(doubleArray0, 2, (double) 47, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 1.1004323959350586, doubleArray0, (-1241));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1241
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = 656.78575942;
      dSCompiler0.remainder(doubleArray1, 1, doubleArray1, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1, doubleArray0, 1, doubleArray0, (-3013));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3013
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 3;
      dSCompiler0.add(doubleArray0, 3, doubleArray0, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {3.0, 0.0, 0.0, 3.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(2, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[9];
      dSCompiler0.add(doubleArray0, 2, doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      DSCompiler.getCompiler(2, 957);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.exp(doubleArray0, 1, doubleArray0, 0);
      assertEquals(1, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 2362, (double[]) null, 2362);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 0, doubleArray0, 4021, doubleArray0, 776);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, (-2483), (double[]) null, (-1574));
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
  public void test_0554()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-606.40694921229), (double[]) null, 0, doubleArray0, 2);
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
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 199, doubleArray0, 199);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 199
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-426.457323129447), (double[]) null, 2, (-3172.21235222607), doubleArray0, 2, 0.0, (double[]) null, 65, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2108.29692155646), doubleArray0, 1668, (double) 0, doubleArray0, 0, (double) 1668, doubleArray0, 377, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1668
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, (double[]) null, 0, 1.8718514371423056E183, (double[]) null, 0, (double) 0, (double[]) null, (-34), doubleArray0, (-1897));
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
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(918.2824077, doubleArray0, 0, (double) 0, doubleArray0, (-217), (double) 0, doubleArray0, 0, (double) 0, doubleArray0, (-217), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -217
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
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
  public void test_0562()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, 0, (double[]) null, 56);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, (double[]) null, 0, (double[]) null, 0);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, (double[]) null, 30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 1738);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1738
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
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
  public void test_0567()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 0, (double[]) null, 0, (double[]) null, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-754));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -754
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 64, (double[]) null, 74);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 1533, doubleArray0, (-11));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1533
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, 0, (double[]) null, 0, (double[]) null, 0);
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
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, (-10), doubleArray0, 0, doubleArray0, (-10));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -10
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 453, (double[]) null, 28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 18, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-2168), (-2168), doubleArray0, (-1256));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 6, doubleArray0, (-481));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 37, doubleArray0, 3746);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 37
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
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
  public void test_0583()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 1, doubleArray0, (-70));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -70
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.atan(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, (-1096));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1096
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.asin(doubleArray0, 3, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.acos(doubleArray0, 7, doubleArray0, 7);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.5707963267948966, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[4];
      dSCompiler0.sin(doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 3, doubleArray0, 58);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 58
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 1, doubleArray0, (-2150));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2150
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 2, (double[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.rootN(doubleArray0, 0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 1, 3, doubleArray0, 0);
      assertEquals(1, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-591), 1, doubleArray0, (-1021));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -591
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[10];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1153, doubleArray0, 1153, doubleArray0, 1281);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1153
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.linearCombination(Double.NaN, doubleArray0, 0, Double.NaN, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
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
  public void test_0608()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(0, (-789));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -789
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double double0 = dSCompiler0.taylor((double[]) null, (-1), (double[]) null);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(6, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, intArray0.length);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      DSCompiler.getCompiler(29, 29);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 2980, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2980
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 1417, doubleArray0, 1417);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1417
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 3;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {(-0.1425465430742778), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, doubleArray0, 0, doubleArray0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.rootN(doubleArray0, 0, (-328), doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, 3175, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-387), doubleArray0, 1199);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1199
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      assertEquals(0, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 3;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.acos(doubleArray0, 2, doubleArray0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, doubleArray0, 66, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 66
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.9069552421569824, doubleArray0, 3, 3.813910484313965, doubleArray0, 2, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      assertEquals(3, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[3];
      intArray0[0] = (-1670);
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(1, dSCompiler0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
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
  public void test_0629()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      int int0 = dSCompiler0.getOrder();
      assertEquals(2, int0);
      assertEquals(2, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(1, dSCompiler0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 2027, doubleArray0, 598);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 3, doubleArray0, 23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 1, (double[]) null, 2);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 2, doubleArray0, 5634, doubleArray0, 5634);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5634
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 1267, (double[]) null, 1267);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, (-21), (double[]) null, 2331);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 0, (double[]) null, 3, (double[]) null, 60);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 29, doubleArray0, 18, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 3, (double) 3, doubleArray0, 3);
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
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, (-1472), (double[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, (-2572), doubleArray0, (-2572));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2572
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-356.073768), doubleArray0, 0, (-356.073768), (double[]) null, 1207, doubleArray0, 2189);
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
        dSCompiler0.linearCombination((double) 0, (double[]) null, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-283.709608), doubleArray0, (-1521), (double) 1, doubleArray0, 1, 0.0, doubleArray0, (-1521), doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1521
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(8.924048768324976E-200, (double[]) null, 0, 0.0, (double[]) null, 0, (-2132.201944078436), doubleArray0, 0, 0.0, (double[]) null, 0, doubleArray0, (-1170));
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
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-1330.615715), doubleArray0, 0, 4288.577739222762, doubleArray0, 810, (double) 0, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-1372), (double[]) null, 39);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, (-2684), (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-1036), doubleArray0, 2363);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1036
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
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
  public void test_0652()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, (-2408), doubleArray0, 0, doubleArray0, (-2408));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2408
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 1655, doubleArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, (-50));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -50
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.compose(doubleArray0, 3, doubleArray0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.log(doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, (-810), doubleArray0, 2112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -810
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(3, 0);
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
  public void test_0660()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 1823);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1823
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1019, 3, doubleArray0, 1019);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1019
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-2073), doubleArray0, 2886);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2886
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, 27, doubleArray0, 27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 2, (double) 3, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.pow(doubleArray0, 2, (double) 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.linearCombination(1611.954240237, doubleArray0, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.linearCombination(1.991444798915497E-192, doubleArray0, 0, 1.0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, 0.4515827052894548, doubleArray0, 0, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[3];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 30);
      assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      DSCompiler.getCompiler(1265, 1265);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(2462);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2462
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 2, doubleArray0, 2, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-2035), doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }
}
