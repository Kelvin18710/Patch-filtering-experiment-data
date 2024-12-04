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
      DSCompiler.getCompiler(0, 134);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 134;
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 2963, doubleArray0, 2963, doubleArray0, 2963);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2963
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 722);
      assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 1097, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, (-1), doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 1012, (double[]) null, 2, doubleArray0, (-2854));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 1331, doubleArray0, 1331, doubleArray0, 2460);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1331
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DSCompiler.getCompiler(0, 134);
      double[] doubleArray0 = new double[2];
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, (-642), doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -642
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 0, doubleArray0, (-3413));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3413
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      double[] doubleArray0 = new double[2];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 1);
      assertEquals(1, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 412);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 412
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      DSCompiler.getCompiler(0, 134);
      DSCompiler.getCompiler(0, 3);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      assertEquals(1, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan(doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 812);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 812
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      DSCompiler.getCompiler(0, 134);
      double[] doubleArray0 = new double[5];
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.0, doubleArray0, 1, (-5.095229574221907E-8), doubleArray0, (-1876), (-1277.75414), doubleArray0, 17, doubleArray0, (-1876));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1876
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-135.94656631106), doubleArray0, 0, (-135.94656631106), doubleArray0, 1, doubleArray0, 2196);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2196
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DSCompiler.getCompiler(0, 1518);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-2769), 722);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      double double0 = dSCompiler0.taylor(doubleArray0, 0, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(24);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DSCompiler.getCompiler(993, 993);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }
@Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 4709.814786;
      doubleArray0[1] = (double) 2;
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 2, doubleArray0, 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 2, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) (-2);
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 3, doubleArray0, 377);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 377
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 4709.814786;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 1070);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1070
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 4709.814786;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 1077, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1077
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, (-663));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -663
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 2, doubleArray0, (-1781), doubleArray0, (-3662));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 3);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1832.5);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-1832.5), doubleArray0, (-2914));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2914
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, 1103, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) 2;
      dSCompiler0.subtract(doubleArray0, 2, doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) 2;
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, doubleArray0, 2, doubleArray0, (-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.add(doubleArray0, 3, doubleArray0, 2, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[8];
      dSCompiler0.linearCombination((double) 2, doubleArray0, 1, 6.7171126157142075E-9, doubleArray0, 1, 4.000000013434225, doubleArray0, 1, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.linearCombination((-2710.800165705977), doubleArray0, 0, (-261.532911372), doubleArray0, 2, doubleArray0, 2);
      assertEquals(2, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      DSCompiler.getCompiler(2, 1370);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.pow(doubleArray0, 856, 0, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      int int0 = dSCompiler0.getOrder();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.subtract((double[]) null, 2832, (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, 597, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 597
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 2, doubleArray0, 0);
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
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 2230, (double[]) null, 3462, (double[]) null, 35);
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
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, (-1), doubleArray0, 62, doubleArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 3630, 3630, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-2000), (double) (-1539), (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.log((double[]) null, 0, doubleArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1961.6007, (double[]) null, (-1143), 3.1660099222737955E-7, (double[]) null, (-97), (double[]) null, (-1143));
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
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 0, doubleArray0, 1451);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1451
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 20, (double[]) null, 130, (double) 0, (double[]) null, 20, 3576.0, (double[]) null, (-862), (double[]) null, 130);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, (-1), doubleArray0, 1132);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-994.6683117878), doubleArray0, 0, (double) 0, doubleArray0, 1, 0.0, doubleArray0, 2, (double[]) null, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
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
  public void test_0067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-12), (-12));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -12
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, (-106), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 1125, (double[]) null, 1125);
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
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, (-1079), doubleArray0, (-1079));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1079
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.compose((double[]) null, 2, (double[]) null, doubleArray0, 38);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
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
  public void test_0074()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, (-181), doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -181
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.atan((double[]) null, 592, (double[]) null, 4069);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 0, (double[]) null, 1318);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, 42, (double[]) null, 714);
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
      double[] doubleArray0 = new double[8];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 2, doubleArray0, 3490);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3490
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, (-15), doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 746, doubleArray0, 0, doubleArray0, 746);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 746
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, doubleArray0, 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(4, 4);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 4, doubleArray0, 483);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 483
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(2, dSCompiler0.getOrder());
      
      double[] doubleArray0 = new double[9];
      dSCompiler0.asin(doubleArray0, 2, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 0, doubleArray0, 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.5707963267948966, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      double[] doubleArray0 = new double[9];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[15];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.rootN(doubleArray0, 0, 1449, doubleArray0, 7);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, 3, doubleArray0, (-157));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 10, 2, (double[]) null, 1449);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[8];
      dSCompiler0.divide(doubleArray0, 3, doubleArray0, 3, doubleArray0, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, 6, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 40, 0, doubleArray0, 40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 40
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      assertEquals(6, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[9];
      dSCompiler0.pow(doubleArray0, 2, 2272.0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (-994.6683117878), doubleArray0, 0, (double) 0, doubleArray0, 1, 0.0, doubleArray0, 2, (double[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
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
  public void test_0105()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      double double0 = dSCompiler0.taylor(doubleArray0, 0, doubleArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(2, 2);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders((-2179));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2179
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(2141, (-961));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -961
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 2217, doubleArray0, (-2428));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-214);
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 0, doubleArray0, (-2397), doubleArray0, (-2397));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2397
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DSCompiler.getCompiler(287, 0);
      int[] intArray0 = new int[6];
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(2, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler(288, (-620));
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
      double[] doubleArray0 = new double[3];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.sin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.rootN(doubleArray0, 0, (-1), doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 2217, doubleArray0, (-2428));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      DSCompiler.getCompiler(287, 0);
      double[] doubleArray0 = new double[10];
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.cos(doubleArray0, 4, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.acos(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {1.5707963267948966, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(1, int0);
      assertEquals(1, dSCompiler0.getSize());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 0, (double[]) null, (-4703));
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
        dSCompiler0.subtract(doubleArray0, 0, (double[]) null, 0, (double[]) null, 1495);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 0, doubleArray0, (-510), doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -510
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.sin((double[]) null, 0, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 1034, (double[]) null, 0, (double[]) null, 654);
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
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 26, doubleArray0, 0, (double[]) null, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, (-1060), (double[]) null, 0, (double[]) null, (-1060));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 0, (double[]) null, 0);
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
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (double) 0, doubleArray0, (-1684));
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
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 340, doubleArray0, 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 340
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, (double[]) null, 34, (double[]) null, 0);
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
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 0, 729.6403375105, doubleArray0, 0, doubleArray0, (-389));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -389
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, (double[]) null, 0, (double) 2050, (double[]) null, 0, (-20.9139), (double[]) null, 1, doubleArray0, (-2435));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 0, doubleArray0, 16, (double) 16, doubleArray0, (-29), (double) 0, doubleArray0, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.getPartialDerivativeOrders(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
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
        DSCompiler.getCompiler((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      DSCompiler.getCompiler(287, 0);
      double[] doubleArray0 = new double[0];
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, (-920), (double[]) null, (-920));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
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
  public void test_0145()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 1, (double[]) null, 110, (double[]) null, 207);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 0, doubleArray0, 360);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 1543, (double[]) null, 1543);
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
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 2, doubleArray0, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-1), doubleArray0, 23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 60, (-1246), (double[]) null, (-1246));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, (-4305));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4305
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.exp((double[]) null, (-49), (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.atan2(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 0);
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray1, 0, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 0, doubleArray0, 536);
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
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, doubleArray0, (-214));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 1231);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 0, 3, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 2, 1, (double[]) null, 0);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.pow(doubleArray0, 0, 483.2690078598702, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      dSCompiler0.subtract(doubleArray0, 1, doubleArray0, 1, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 56, doubleArray0, 13, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 56
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.linearCombination(1.0, doubleArray0, 0, (double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, 3881.7, doubleArray0, 0, doubleArray0, 1);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[3];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, (double) 0, doubleArray0, 2, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.linearCombination(5.74952254077566E-19, doubleArray0, 0, 2335.2308992413905, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = new int[2];
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[0];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      DSCompiler.getCompiler(420, 0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      DSCompiler.getCompiler(0, 32);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      DSCompiler.getCompiler(23, 0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getFreeParameters();
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, doubleArray0, 0, doubleArray0, 688);
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
      // Undeclared exception!
      try { 
        dSCompiler0.divide((double[]) null, 57, (double[]) null, 19, (double[]) null, 2);
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 1;
      dSCompiler0.asin(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.5707963267948966, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) 3;
      // Undeclared exception!
      try { 
        dSCompiler0.acos(doubleArray0, 3, doubleArray0, 724);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 724
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.tan(doubleArray0, 1, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 518, doubleArray0, 518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 518
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, doubleArray0, 78, doubleArray0, 78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, doubleArray0, 1, doubleArray0, 828);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1;
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 3300, doubleArray0, 68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 1, 3300, doubleArray0, 68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.divide(doubleArray0, 1, doubleArray0, 673, doubleArray0, 673);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 0, (-2916), doubleArray0, 1185);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1185
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1412;
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 1, 1412, doubleArray0, (-2046));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2046
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 1;
      dSCompiler0.pow(doubleArray0, 1, 0.0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.cos(doubleArray0, 0, doubleArray0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 487);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 487
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.pow(doubleArray0, 0, doubleArray0, 2, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.add(doubleArray0, 0, doubleArray0, 0, doubleArray0, 686);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 686
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(1.0, doubleArray0, 1, 2674.4556087032597, doubleArray0, 0, 1.0, doubleArray0, 1, (double) 1, doubleArray0, 1, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, doubleArray0, 3, 266.2645006962605, doubleArray0, 3, 3.0, doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((-2302.83367), doubleArray0, 1, (-2302.83367), doubleArray0, 2, doubleArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
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
  public void test_0203()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(6, 6);
      assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.exp(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      double[] doubleArray0 = new double[5];
      dSCompiler0.sin(doubleArray0, 3, doubleArray0, 0);
      assertEquals(3, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.rootN(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(2, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[3];
      dSCompiler0.pow(doubleArray0, 1, 0.0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.divide(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[15];
      dSCompiler0.acos(doubleArray0, 2, doubleArray0, 2);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      // Undeclared exception!
      try { 
        dSCompiler0.tan((double[]) null, 1, (double[]) null, 22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN((double[]) null, 3, (-3228), doubleArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.remainder((double[]) null, 542, (double[]) null, 0, (double[]) null, 77);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.remainder(doubleArray0, 0, doubleArray0, 0, doubleArray0, 487);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 487
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double[]) null, 0, doubleArray0, (-1602));
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
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.pow((double[]) null, 0, (double) 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.log(doubleArray0, 3462, doubleArray0, (-886));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3462
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination(0.0, (double[]) null, 27, 0.0, (double[]) null, (-4379), (double[]) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dSCompiler0.linearCombination((double) 1, (double[]) null, 0, 1.8305382378470305E269, (double[]) null, 0, (-4648.7733643), (double[]) null, 5297, (-1705.9938), (double[]) null, 3075, doubleArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
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
  public void test_0220()  throws Throwable  {
      // Undeclared exception!
      try { 
        DSCompiler.getCompiler((-332), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, 0, (double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      // Undeclared exception!
      try { 
        dSCompiler0.cos((double[]) null, 0, (double[]) null, 1152);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
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
  public void test_0224()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.atan2((double[]) null, 0, (double[]) null, 3, (double[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 0, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      // Undeclared exception!
      try { 
        dSCompiler0.asin((double[]) null, 3, (double[]) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.acos((double[]) null, (-1521), doubleArray0, (-5397));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.compose(doubleArray0, 0, doubleArray0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.log(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      dSCompiler0.multiply(doubleArray0, 0, doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.multiply(doubleArray0, 578, doubleArray0, 2498, doubleArray0, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 578
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        dSCompiler0.exp(doubleArray0, (-595), doubleArray0, (-595));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -595
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.getSize();
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      DSCompiler dSCompiler1 = DSCompiler.getCompiler(0, 0);
      try { 
        dSCompiler0.checkCompatibility(dSCompiler1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      dSCompiler0.checkCompatibility(dSCompiler0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[8];
      dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 3, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, Double.NaN, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.atan2(doubleArray0, 1, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dSCompiler0.atan(doubleArray0, 1, doubleArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.atan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dSCompiler0.asin(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.asin(doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[2];
      dSCompiler0.tan(doubleArray0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dSCompiler0.sin(doubleArray0, 0, (double[]) null, 631);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.cos(doubleArray0, 3, doubleArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.log(doubleArray0, 1, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NEGATIVE_INFINITY, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.rootN(doubleArray0, 3, 3, doubleArray0, 2202);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2202
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[1];
      dSCompiler0.pow(doubleArray0, 0, 0, doubleArray0, 0);
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.pow(doubleArray0, 3, Double.NaN, doubleArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      double[] doubleArray0 = new double[4];
      dSCompiler0.remainder(doubleArray0, 1, doubleArray0, 0, doubleArray0, 1);
      assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 3);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        dSCompiler0.subtract(doubleArray0, 3, doubleArray0, 3, doubleArray0, (-372));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -372
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[9];
      dSCompiler0.linearCombination((double) 0, doubleArray0, 0, 0.0, doubleArray0, 0, 0.0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double[] doubleArray0 = new double[7];
      dSCompiler0.linearCombination(0.0, doubleArray0, 5, (double) 0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      int[] intArray0 = new int[1];
      intArray0[0] = 124;
      try { 
        dSCompiler0.getPartialDerivativeIndex(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 124 is larger than the maximum (1)
         //
         verifyException("org.apache.commons.math3.analysis.differentiation.DSCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
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
  public void test_0255()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 19);
      //  // Unstable assertion: assertNull(dSCompiler0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(3, 0);
      assertEquals(1, dSCompiler0.getSize());
      
      double[] doubleArray0 = new double[5];
      dSCompiler0.linearCombination(1.0, doubleArray0, 0, (-1395.5511), doubleArray0, 3, 0.0, doubleArray0, 3, (double) 0, doubleArray0, 0, doubleArray0, 3);
      assertEquals(3, dSCompiler0.getFreeParameters());
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      double double0 = dSCompiler0.taylor((double[]) null, 0, (double[]) null);
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, dSCompiler0.getOrder());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int[] intArray0 = dSCompiler0.getPartialDerivativeOrders(0);
      assertEquals(0, dSCompiler0.getOrder());
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      DSCompiler.getCompiler(2836, 2836);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(0, 0);
      int int0 = dSCompiler0.getOrder();
      assertEquals(0, dSCompiler0.getFreeParameters());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      DSCompiler dSCompiler0 = DSCompiler.getCompiler(1, 1);
      assertEquals(1, dSCompiler0.getFreeParameters());
      
      int[] intArray0 = new int[1];
      int int0 = dSCompiler0.getPartialDerivativeIndex(intArray0);
      assertEquals(0, int0);
  }
}
