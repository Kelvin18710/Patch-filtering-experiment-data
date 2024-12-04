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
      int int0 = 0;
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
  public void test_0001()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-1.0), doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
      
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
  public void test_0002()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 2, doubleArray0, 0);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      int int0 = 0;
      int int1 = 383;
      int int2 = 2709;
      int int3 = 1420;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 383, (double) 383, doubleArray0, 2709, doubleArray0, 1420);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 383
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 774.07682;
      doubleArray0[1] = (double) 0;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 3, doubleArray0, 0);
      doubleArray0[2] = 4172.8519957942;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-698.8716877);
      doubleArray1[1] = (double) 3;
      doubleArray1[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray1, 0, doubleArray1, (-545));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[18];
      doubleArray0[14] = (double) 0;
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 383, 0, doubleArray0, 383);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 383
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray1, 1, doubleArray1, 1, doubleArray0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = null;
      int int2 = (-151);
      int int3 = 0;
      int int4 = 14;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, (-151), (double[]) null, 0, (double[]) null, 14);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      int int0 = 383;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 383, (double) 383, doubleArray0, 2709, doubleArray0, 1420);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 383
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (double) 0;
      doubleArray1[4] = (double) 0;
      int int1 = 1281;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray1, 4, doubleArray0, 1281, doubleArray0, 69);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1281
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 4;
      doubleArray0[1] = (double) 4;
      doubleArray0[2] = (double) 4;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, (-2906), doubleArray0, 1281, doubleArray0, 1281);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2906
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      double double0 = 1.1899254154663847E-222;
      int int1 = 1799;
      double double1 = (-8.772048092842086E271);
      int int2 = 2559;
      int int3 = (-517);
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, (-517), doubleArray0, doubleArray0, 1799);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler.getCompiler(0, 0);
      int int2 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      double double0 = (-2006.1999618434);
      doubleArray0[1] = (-2006.1999618434);
      doubleArray0[1] = (double) 1;
      double[] doubleArray1 = new double[2];
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[5] = 0;
      dSCompiler0.taylor(doubleArray1, 0, doubleArray1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 15, (double) 1, doubleArray0, 1, Double.NaN, doubleArray0, (-1086), doubleArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) (-1917);
      double double0 = dSCompiler0.taylor(doubleArray0, 3, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 357);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 357
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders((-3940));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3940
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      int int0 = 0;
      int int1 = 3;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-698.8716877);
      doubleArray0[1] = (double) 3;
      int int2 = 4;
      int int3 = (-1535);
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 3, doubleArray0, (-1535));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      int int0 = 3;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      double double0 = 1.9809842109680176;
      doubleArray0[0] = 1.9809842109680176;
      int int1 = 739;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, 739, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 3;
      doubleArray0[3] = (double) 0;
      dSCompiler0.atan(doubleArray0, 3, doubleArray0, 0);
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray1, 3, doubleArray1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[15];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 2495);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 1.669813444584674E-8;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) (-287);
      doubleArray0[4] = (double) (-1);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.669813444584674E-8, (double[]) null, (-287), (double) (-287), (double[]) null, (-1), doubleArray0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) (-23);
      doubleArray0[2] = (double) (-23);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = 1900.1;
      int int0 = 0;
      int int1 = (-795);
      dSCompiler0.rootN(doubleArray0, 0, (-795), doubleArray0, 0);
      int int2 = 50;
      int int3 = (-98);
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(50, (-98));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -98
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      int int0 = 0;
      double[] doubleArray1 = null;
      int int1 = (-1);
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 0, doubleArray0, 0, doubleArray0, (-1));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 4, doubleArray0, 0);
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (double) 0;
      doubleArray1[4] = (double) 0;
      dSCompiler0.subtract(doubleArray1, 4, doubleArray0, 0, doubleArray1, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, (-3579));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1229, (-1155), doubleArray0, (-2329));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1229
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      int int1 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, (double[]) null, (-1));
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
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int2 = 1;
      double[] doubleArray0 = new double[2];
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
  public void test_0030()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-698.8716877);
      doubleArray0[1] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, 2469);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 266.8522957677395;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = 588.9355751604;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      int int1 = 2;
      dSCompiler0.sin(doubleArray0, 2, doubleArray0, 2);
      double[] doubleArray1 = null;
      DSCompiler.getCompiler(15, 201);
      int int2 = 986;
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      int int0 = 1;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 1, doubleArray0, 1477);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 3);
      dSCompiler0.getSize();
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 68, doubleArray0, (-128));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 6, doubleArray0, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-698.8716877);
      doubleArray0[1] = (double) 3;
      doubleArray0[2] = (double) 0;
      int int0 = (-545);
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, (-545));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = 1900.1;
      doubleArray0[3] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 3277, doubleArray0, 3277, doubleArray0, 2460);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3277
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, (-1.0), doubleArray0, 0);
      int int0 = (-1986);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, (-1986), 0, doubleArray0, (-1757));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1986
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.getFreeParameters();
      int[] intArray0 = new int[0];
      dSCompiler0.getPartialDerivativeIndex(intArray0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 11, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      int int0 = 677;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 3724, doubleArray0, 677);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3724
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1;
      doubleArray0[2] = (double) 1;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 588.9355751604;
      doubleArray1[1] = (double) 1;
      doubleArray1[2] = (double) 1;
      doubleArray1[3] = 266.8522957677395;
      doubleArray1[4] = (double) 1;
      doubleArray1[5] = (double) 1;
      doubleArray1[6] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray1, (-2650), doubleArray1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2650
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 3;
      doubleArray0[1] = (double) 0;
      int[] intArray0 = new int[0];
      dSCompiler0.getPartialDerivativeIndex(intArray0);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (double) 0;
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      int int0 = 10;
      int int1 = 275;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 10, 275, doubleArray0, 64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int1 = 3;
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 3;
      doubleArray0[1] = (double) 0;
      int[] intArray0 = new int[7];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int2 = 1;
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-698.8716877);
      doubleArray0[1] = (double) 3;
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, (-545));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-698.8716877);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {(-7.49278237148587), 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[0] = 1.4621131420135498;
      doubleArray0[1] = (double) 0;
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 2);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.4621131420135498;
      doubleArray1[1] = 1.4621131420135498;
      doubleArray1[2] = 1.4621131420135498;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 1.4621131420135498;
      dSCompiler0.log(doubleArray1, 0, doubleArray0, 0);
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray1, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray1, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      int int0 = 2391;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 2391);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      int int1 = 2;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 4, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 209.43;
      doubleArray1[1] = 777.3714262;
      doubleArray1[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray1, 0, doubleArray1, 1255, doubleArray0, 2196);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2196
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      int int1 = 0;
      int int2 = (-8);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, (-8), doubleArray0, 267, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = 1;
      DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 313, doubleArray0, (-2329));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[0] = 1.4621131420135498;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.4621131420135498;
      doubleArray1[1] = 1.4621131420135498;
      doubleArray1[2] = 1.4621131420135498;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 1.4621131420135498;
      double[] doubleArray2 = null;
      int int0 = 75;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, (double[]) null, 75, 0.0, doubleArray0, 0, (double) 75, (double[]) null, 75, doubleArray1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      dSCompiler0.linearCombination((double) 0, doubleArray1, 0, 0.0, doubleArray1, 0, 0.0, doubleArray1, 0, doubleArray1, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 8, 2.343525263620692E-8, doubleArray0, 8, doubleArray0, (-1731));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (-2006.1999618434);
      doubleArray0[2] = (double) 1;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (-2006.1999618434);
      dSCompiler0.atan2(doubleArray0, 1, doubleArray1, 0, doubleArray1, 1);
      double[] doubleArray2 = new double[16];
      doubleArray2[0] = (double) 1;
      doubleArray2[1] = (double) 0;
      doubleArray2[2] = (-5068.50782357);
      // Undeclared exception!
      try { 
        dSCompiler1.linearCombination(0.0, doubleArray2, 1, 0.0, (double[]) null, 1, 0.0, doubleArray1, 1, doubleArray2, 75);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler1);
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler1.cos(doubleArray0, 26, doubleArray0, (-542));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (-1.0), doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 2191, (-1670), doubleArray0, (-1670));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2191
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = 1;
      DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[3];
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int2 = 1;
      DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, doubleArray0, 1, 207.0, doubleArray0, 0, doubleArray0, (-566));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -566
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = 0;
      DSCompiler.getCompiler(0, 0);
      int int1 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = null;
      int int2 = 326;
      int int3 = 26;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 326, (double[]) null, 26, (double[]) null, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 4323);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, doubleArray0, 491, doubleArray0, 721);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 491
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler1);
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = (double) 0;
      doubleArray0[1] = (double) 0;
      dSCompiler0.add(doubleArray0, 0, doubleArray1, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 1457, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1457
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2.6010732940533088E-99;
      doubleArray0[1] = 771.85653803;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (-1746.188974491454);
      doubleArray0[4] = (double) (-3589);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) (-3589), (double[]) null, 724, (double) 0, (double[]) null, 0, (double) 724, (double[]) null, 0, 2.6010732940533088E-99, (double[]) null, 1, doubleArray0, (-1474));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 1457, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1457
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 45, (-34), doubleArray0, 45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 45
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      int int1 = (-3885);
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, (-1364), doubleArray0, (-3885));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1364
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      int int1 = (-1812);
      int int2 = 2241;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = (double) 2241;
      doubleArray1[2] = (double) (-1812);
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray1, 2241, doubleArray1, (-1812));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2241
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 774.07682;
      doubleArray0[1] = (double) 0;
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 3, doubleArray0, 0);
      doubleArray0[2] = 4172.8519957942;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-698.8716877);
      doubleArray1[1] = (double) 3;
      doubleArray1[2] = (double) 0;
      int int1 = (-545);
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray1, 0, doubleArray1, (-545));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 0;
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = 0.0;
      dSCompiler0.atan2(doubleArray1, 0, doubleArray1, 0, doubleArray0, 0);
      int int0 = 0;
      dSCompiler0.acos(doubleArray1, 0, doubleArray0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler1);
      DSCompiler.getCompiler(427, 0);
      int int1 = 3580;
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1681;
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 1681.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (-2006.1999618434);
      doubleArray0[2] = (double) 1;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (-2006.1999618434);
      dSCompiler0.atan2(doubleArray0, 1, doubleArray1, 0, doubleArray1, 1);
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) 0;
      doubleArray2[2] = (double) 1;
      doubleArray2[3] = (double) 1;
      doubleArray2[4] = (double) 1;
      doubleArray2[5] = (double) 0;
      doubleArray2[6] = (double) 1;
      doubleArray2[7] = (double) 0;
      doubleArray2[8] = (double) 0;
      dSCompiler1.acos(doubleArray2, 0, doubleArray2, 0);
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
  public void test_0076()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (-2006.1999618434);
      doubleArray0[1] = (double) 1;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (-2006.1999618434);
      dSCompiler0.atan2(doubleArray0, 1, doubleArray1, 0, doubleArray1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 7, (-841), doubleArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = null;
      int int1 = (-3589);
      // Undeclared exception!
      try { 
        dSCompiler0.add((double[]) null, (-3589), (double[]) null, (-3589), (double[]) null, (-1183));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 267, doubleArray0, 0);
      dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (double) 2;
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      int int0 = 0;
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[0] = 1.4621131420135498;
      doubleArray0[1] = (double) 0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.4621131420135498;
      doubleArray1[1] = 1.4621131420135498;
      doubleArray1[2] = 1.4621131420135498;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 1.4621131420135498;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (double) 0;
      doubleArray1[7] = (double) 0;
      doubleArray1[8] = 0.0;
      dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 1.4621131420135498, doubleArray1, 0, 0.0, doubleArray0, 1, doubleArray1, 1);
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = 797.6;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 475, doubleArray0, 475);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      int int0 = 1;
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 1, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = null;
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 622, (double[]) null, 0, (double[]) null, 1952);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 20, doubleArray0, (-3468));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = null;
      int int1 = (-3589);
      double double0 = 1.0;
      int int2 = 11;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 11;
      doubleArray1[1] = (double) 11;
      doubleArray1[2] = Double.NaN;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 11;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (double) (-3589);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, Double.NaN, doubleArray1, (-1068));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 0, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      DSCompiler.getCompiler(1, 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) (-23);
      doubleArray0[2] = (double) (-23);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 267, doubleArray0, 0);
      dSCompiler0.pow(doubleArray0, 0, 0.0, doubleArray0, 0);
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.7853981633974483, 0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      int int1 = 3;
      dSCompiler0.atan(doubleArray0, 3, doubleArray0, 0);
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = 1752.8741;
      doubleArray0[4] = (double) 0;
      double double0 = 1528.0;
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-802), (-802));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -802
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      DSCompiler.getCompiler(3, 3);
      double double0 = 0.0;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (double) 3;
      doubleArray0[4] = (double) 3;
      int int0 = (-1585);
      int int1 = (-1451);
      int int2 = 605;
      int int3 = 3;
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      int int0 = 1;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      DSCompiler.getCompiler(1, 1);
      int int1 = 1151;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 1151;
      doubleArray1[1] = (double) 1151;
      doubleArray1[2] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray1, 1151, 1151, doubleArray1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1151
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      int int0 = 2;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 2;
      int int1 = 3859;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 2;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = 941.6065019;
      doubleArray1[4] = (double) 0;
      doubleArray1[5] = (double) 2;
      double double0 = 0.0;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray1, 3859, 3859, doubleArray1, 3859);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3859
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 315, 315, (double[]) null, 69);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0;
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.0, doubleArray0, 2, 1.0, doubleArray0, 0, (double) 2, doubleArray0, 0, 259.284668, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      int int0 = 218;
      int int1 = 787;
      DSCompiler.getCompiler(218, 787);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) int1;
      doubleArray0[1] = (double) int1;
      double double0 = 2.3705435424427623E169;
      doubleArray0[2] = double0;
      doubleArray0[3] = (double) int0;
      doubleArray0[4] = (double) int1;
      doubleArray0[5] = (double) int0;
      doubleArray0[6] = (double) int0;
      int int2 = 0;
      int int3 = 0;
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[18];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-1630), doubleArray0, (-1630));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1630
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 0, doubleArray0, 245);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 739);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[18];
      dSCompiler0.cos(doubleArray0, 3, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      int int0 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 26, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      DSCompiler.getCompiler(1, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      int int0 = 1327;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 313, doubleArray0, (-2329));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      int int2 = 0;
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      int int3 = 524;
      int int4 = 0;
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 524, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 524
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      doubleArray0[1] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 2241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (-1274.56069964146);
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, (-1812), doubleArray0, 2241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1812
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      int int0 = 3;
      int int1 = 131;
      DSCompiler.getCompiler(3, 131);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int1;
      double double0 = (-75.7157284365547);
      doubleArray0[3] = double0;
      int int2 = 2055;
      int int3 = 677;
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 687, doubleArray0, 3785, doubleArray0, 687);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 687
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 3785, doubleArray0, 1870);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3785
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, 2.6010732940533088E-99, doubleArray0, 0, 5.3774170051560117E-8, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      int int0 = 0;
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, (double) 0, doubleArray0, 2364, (double) 0, doubleArray0, 0, (double) 0, doubleArray0, 2364, doubleArray0, (-931));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2364
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 5.3774170051560117E-8, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-26), 221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      int int0 = 3;
      int int1 = (-1);
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(3, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 35);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      int int0 = 1386;
      int int1 = 1135;
      // Undeclared exception!
      DSCompiler.getCompiler(1386, 1135);
  }
@Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      DSCompiler.getCompiler(3473, 0);
      double[] doubleArray0 = new double[14];
      doubleArray0[0] = (double) 3473;
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, (-1392), doubleArray0, 978);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 978
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, doubleArray1, 0, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      DSCompiler.getCompiler(3473, 0);
      int[] intArray0 = new int[8];
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DSCompiler.getCompiler(509, 0);
      double[] doubleArray0 = new double[3];
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, (-528));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -528
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      DSCompiler.getCompiler(259, 0);
      double[] doubleArray0 = new double[6];
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 1, doubleArray0, 967);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 967
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double[]) null, (-1448), doubleArray0, (-1448));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 1294, doubleArray0, 1294);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1294
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      DSCompiler.getCompiler(3473, 0);
      double[] doubleArray0 = new double[1];
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 0, doubleArray0, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, 2725);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2725
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
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
  public void test_0135()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, (double[]) null, 0, 0.0, (double[]) null, (-2236), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-1604.406561), (double[]) null, 0, (double) 0, (double[]) null, 4, (double) 4, (double[]) null, (-1721), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 379, (double) 0, doubleArray0, 2157, (double) 379, doubleArray0, 2157, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 379
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-1263.9397670486348), (double[]) null, 3, 2224.839102217617, (double[]) null, 0, 392.2, (double[]) null, 3, 0.0, (double[]) null, 0, (double[]) null, 1392);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 3, doubleArray0, 683, (-1263.375), (double[]) null, 1012, (-1263.375), (double[]) null, 1012, (-1263.375), (double[]) null, 0, (double[]) null, 683);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 683
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
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
  public void test_0141()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(Integer.MAX_VALUE, 714);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-4165), (-4165));
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
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 1850);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1850
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, (-186), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 1431, doubleArray0, 1431);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1431
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 67);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 67
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 1254, (double[]) null, 2612, (double[]) null, 1995);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 2, doubleArray0, 3468);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3468
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 2639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2639
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 0, doubleArray0, 157);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 157
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, (-533), (double[]) null, (-533));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.compose(doubleArray0, 1145, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-90), doubleArray0, (-90));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -90
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      // Undeclared exception!
      DSCompiler.getCompiler(46, 972);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[1];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 804);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 804
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1985, 5, doubleArray0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1985
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, 1.0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 2307, doubleArray0, 0, doubleArray0, 59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2307
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.add(doubleArray0, 1, doubleArray0, 0, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, 3, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 0, Double.NaN, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[10];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 10 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      DSCompiler.getCompiler(3473, 0);
      double[] doubleArray0 = new double[0];
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      double double0 = dSCompiler0.taylor(doubleArray0, 1, doubleArray0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(2502);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2502
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 1, doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 419);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 419
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }
}
