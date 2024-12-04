package org.apache.commons.math.complex;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 2604.74233);
      // Undeclared exception!
      try { 
        complex0.I.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.sqrt();
      assertEquals(0.7071067811865476, complex3.getReal(), 0.01);
      assertEquals((-0.7071067811865475), complex3.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      complex0.ONE.hashCode();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), 0.0);
      Complex complex1 = complex0.ZERO.divide((-821.6785237752421));
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-0.16624879837036133));
      Complex complex1 = complex0.divide(complex0);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-0.16624879837036133), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1626.87818), 0.0);
      assertEquals((-1626.87818), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 437.518588270559);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.tanh();
      assertFalse(complex2.isInfinite());
      assertEquals((-437.518588270559), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.1093879413171797), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Complex complex0 = new Complex(2249.3152, 2208.0);
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.tan();
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.831601649362021E-19), complex2.getReal(), 0.01);
      assertEquals(51.967530225655885, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.subtract(1968.1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Complex complex0 = new Complex((-1495.44285343598), (-1495.44285343598));
      Complex complex1 = complex0.subtract((-20.59));
      assertEquals((-1474.85285343598), complex1.getReal(), 0.01);
      assertEquals((-1495.44285343598), complex0.getImaginary(), 0.01);
      assertEquals((-1495.44285343598), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2178.30019239107), 0.625);
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isInfinite());
      assertEquals(0.625, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2178.30019239107), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 2604.74233);
      Complex complex1 = complex0.sinh();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.35416418764295277), complex1.getImaginary(), 0.01);
      assertEquals(2604.74233, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Complex complex0 = Complex.valueOf(263.278358498);
      Complex complex1 = complex0.sin();
      assertEquals(263.278358498, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.5773051118589798), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.subtract(complex0);
      Complex complex2 = complex1.sin();
      assertEquals((-0.6349639147847361), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(1.2984575814159773, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Complex complex0 = new Complex((-6632.384588), (-6632.384588));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.createComplex(526.5548178585007, 1128.916397417272);
      Complex complex2 = complex1.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Complex complex0 = new Complex(602.22971644, 602.22971644);
      complex0.NaN.pow(602.22971644);
      assertEquals(602.22971644, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(602.22971644, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1565.2514070650643);
      Complex complex1 = complex0.I.sin();
      Complex complex2 = complex1.add(1231.121018);
      Complex complex3 = complex2.pow(1565.2514070650643);
      assertTrue(complex3.isInfinite());
      assertEquals(1.1752011936438014, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(1565.2514070650643, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1231.121018, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(1229.3820219);
      assertFalse(complex1.isInfinite());
      assertEquals(0.8252912330006823, complex1.getImaginary(), 0.01);
      assertEquals((-0.5647073407812347), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-196.471768043855));
      Complex complex2 = complex1.tan();
      assertEquals(0.7377591298648369, complex1.getReal(), 0.01);
      assertEquals((-0.675064046073466), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.4622118711601265, complex2.getReal(), 0.01);
      assertEquals((-0.8354731522947398), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.negate();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Complex complex0 = Complex.valueOf(263.278358498);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.sin();
      assertTrue(complex3.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-1649.795774967654), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Complex complex0 = new Complex((-1866.4621284), 0.9999999803007278);
      Complex complex1 = complex0.multiply(0.2);
      assertEquals(0.19999999606014557, complex1.getImaginary(), 0.01);
      assertEquals(0.9999999803007278, complex0.getImaginary(), 0.01);
      assertEquals((-373.29242568), complex1.getReal(), 0.01);
      assertEquals((-1866.4621284), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.multiply(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(2525.69623, 2525.69623);
      Complex complex2 = complex0.add(complex1);
      Complex complex3 = complex2.divide(complex1);
      Complex complex4 = complex3.multiply(1502.47223147172);
      assertFalse(complex2.isInfinite());
      assertEquals(1502.7696687117225, complex4.getReal(), 0.01);
      assertEquals((-0.29743724000247646), complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex1.log();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3.141592653589793), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.9699272335463627E-8, 0.3492436898935675);
      double double0 = complex0.getReal();
      assertEquals(1.9699272335463627E-8, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.3492436898935675, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      double double0 = complex1.getReal();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.sqrt1z();
      double double0 = complex1.getImaginary();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Complex complex0 = new Complex((-1495.44285343598), (-1495.44285343598));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertEquals((-2.356194490192345), double0, 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Complex complex0 = new Complex((-1866.4621284), 0.9999999803007278);
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.9999999803007278, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Complex complex0 = new Complex(6467.440125379396, 6467.440125379396);
      Complex complex1 = complex0.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(6467.440125379396, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Complex complex0 = Complex.valueOf(349.879);
      Complex complex1 = complex0.ZERO.exp();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(349.879, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3199.201914014075, 6.283185307179586);
      Complex complex1 = complex0.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(6.283185307179586, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1901.4));
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1901.4), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1901.4), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = new Complex(0.9999999803007278, 629.1206493559833);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.divide(1901.4);
      assertEquals((-0.33087233057535675), complex3.getImaginary(), 0.01);
      assertEquals(629.1206493559833, complex1.getImaginary(), 0.01);
      assertEquals((-0.9999999803007278), complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-5.259282530244702E-4), complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-629.1206493559833), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1565.2514070650643);
      Complex complex1 = complex0.createComplex(1231.121018, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(1231.121018, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(complex1.isNaN());
      assertEquals(1565.2514070650643, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-2268.82098), (-2268.82098));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-2268.82098), complex1.getReal(), 0.01);
      assertEquals((-2268.82098), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, (-3.141592653589793));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-3.141592653589793), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Complex complex0 = new Complex(5424.1331145037, 5424.1331145037);
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.divide(5424.1331145037);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Complex complex0 = new Complex(2525.69623, 2525.69623);
      Complex complex1 = complex0.cosh();
      assertEquals(2525.69623, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Complex complex0 = new Complex(2525.69623, 2525.69623);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(2525.69623, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Complex complex0 = new Complex(575.0, 575.0);
      Complex complex1 = complex0.cos();
      assertEquals(575.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.609710971045772E249), complex1.getReal(), 0.01);
      assertEquals(2.3168105900666326E248, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.exp();
      Complex complex2 = complex1.cos();
      assertEquals((-0.4857693871955125), complex2.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(1.179501321915592, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1565.2514070650643);
      Complex complex1 = complex0.I.asin();
      Complex complex2 = complex1.subtract(complex0);
      Complex complex3 = complex2.conjugate();
      assertEquals(0.8813735870195428, complex2.getImaginary(), 0.01);
      assertEquals((-1565.2514070650643), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-0.16624879837036133));
      Complex complex1 = complex0.atan();
      assertEquals((-0.16780634168051997), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1901.4));
      Complex complex1 = complex0.atan();
      assertEquals((-1.5702703985800024), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(2525.69623, 2525.69623);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.atan();
      assertEquals(1.9796522128213666E-4, complex3.getReal(), 0.01);
      assertEquals(2525.69623, complex1.getImaginary(), 0.01);
      assertEquals((-1.9796521093769549E-4), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1920.4967218, 9.0);
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex0.atan();
      Complex complex3 = complex2.pow(complex1);
      Complex complex4 = complex3.asin();
      assertEquals(1.7979285475754272E7, complex3.getImaginary(), 0.01);
      assertEquals(3.871683659116411E8, complex3.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add((-949.077766));
      Complex complex2 = complex1.asin();
      Complex complex3 = complex2.tanh();
      assertEquals((-1.0720376334870576), complex3.getReal(), 0.01);
      assertEquals(0.05323003979065121, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.add(complex2);
      assertTrue(complex3.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.add(0.0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Complex complex0 = new Complex((-1495.44285343598), (-1495.44285343598));
      Complex complex1 = complex0.add((-1495.44285343598));
      assertEquals((-1495.44285343598), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2990.88570687196), complex1.getReal(), 0.01);
      assertEquals((-1495.44285343598), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Complex complex0 = Complex.valueOf(441.41226165);
      Complex complex1 = complex0.pow(57.2957763671875);
      Complex complex2 = complex1.acos();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(3.4547200697865425E151, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.INF.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(1431655765);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.multiply((Complex) null);
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
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Complex complex0 = new Complex(575.0, 575.0);
      Complex complex1 = complex0.NaN.conjugate();
      Complex complex2 = complex1.log();
      assertFalse(complex0.isInfinite());
      assertEquals(575.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(575.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Complex complex0 = Complex.valueOf(441.41226165);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(441.41226165, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Complex complex0 = new Complex((-1626.87818));
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2646732.612560112, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.multiply(complex0);
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-1379.32822));
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals((-1379.32822), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(0.0, 0.0);
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 1870.87);
      Complex complex1 = Complex.valueOf(1870.87);
      Complex complex2 = complex1.add(complex0);
      assertEquals(1870.87, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertSame(complex2, complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.cosh();
      Complex complex3 = complex2.add(complex0);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Complex complex0 = new Complex(602.22971644, 602.22971644);
      double double0 = complex0.abs();
      assertEquals(602.22971644, complex0.getImaginary(), 0.01);
      assertEquals(851.6814326535513, double0, 0.01);
      assertEquals(602.22971644, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Complex complex0 = new Complex((-701.8505), 629.1206493559833);
      Complex complex1 = complex0.exp();
      double double0 = complex1.abs();
      assertEquals(1.5495326404656124E-305, double0, 0.01);
      assertEquals(1.0772123584040962E-305, complex1.getReal(), 0.01);
      assertEquals(629.1206493559833, complex0.getImaginary(), 0.01);
      assertEquals(1.1138513988723171E-305, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 0.9999999803007278);
      assertEquals(0.9999999803007278, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Complex complex0 = new Complex((-3712.702012272376), Double.NaN);
      assertEquals((-3712.702012272376), complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4508218.949417281), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1841);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(104);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.pow((-1.396941961929881E303));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3.0, 3.0);
      Complex complex1 = complex0.subtract(3.0);
      assertFalse(complex1.isInfinite());
      assertEquals(3.0, complex0.getImaginary(), 0.01);
      assertEquals(3.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.sqrt1z();
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.negate();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Complex complex0 = new Complex(3.814697265625E-6);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(3.814697265625E-6, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(0.1111111111111111);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.multiply(1.9699272335463627E-8);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-1388.548800395806));
      Complex complex1 = new Complex((-1388.548800395806), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex2.isNaN());
      assertEquals((-1388.548800395806), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex0.pow(complex1);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.pow(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = Complex.valueOf(0.0, (-64.50008640253087));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-64.50008640253087), complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals("(0.0, 1.557407724654902)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.divide(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Complex complex0 = new Complex(6467.440125379396, 6467.440125379396);
      complex0.divide(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(6467.440125379396, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(6467.440125379396, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(1.1730463525082348E-7);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      boolean boolean0 = complex1.isNaN();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.divide(complex0);
      Complex complex2 = complex1.subtract((double) 573);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add((-709830.7227112539));
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4338.549, Double.POSITIVE_INFINITY);
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(4338.549, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Complex complex0 = new Complex((-701.8505), (-853.6290760289));
      Complex complex1 = complex0.exp();
      Complex complex2 = complex0.multiply((-1828.0));
      Complex complex3 = complex2.divide(complex1);
      assertEquals(9.823507875550767E-306, complex1.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(1560433.9509808293, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.1983481689635334E-305, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(573);
      assertEquals(573, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.toString();
      assertEquals("(0.0, 1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.acos();
  }
@Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      try { 
        complex0.ONE.nthRoot((-2972));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,972
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Complex complex0 = Complex.valueOf(286.44, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isNaN());
      assertEquals(286.44, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((double) 1, 2.0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1597.33572798513), (-4006.5320400001));
      Complex complex1 = Complex.valueOf((-572.66689270963), 862.36797104);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-572.66689270963), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(862.36797104, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 1584.113293765);
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex1.tanh();
      assertEquals((-0.761594155955765), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Complex complex0 = new Complex((-2149.36379929));
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.tanh();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.557407724654902), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Complex complex0 = new Complex((-6.4), (-6.4));
      Complex complex1 = complex0.tan();
      assertEquals((-6.4), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-6.4), complex0.getImaginary(), 0.01);
      assertEquals((-0.9999946284746805), complex1.getImaginary(), 0.01);
      assertEquals((-1.27828508422708E-6), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      Complex complex1 = complex0.I.asin();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-0.8813735870195428), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-660.6742290001639), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.subtract(498.8);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(498.8, complex0.getImaginary(), 0.01);
      assertEquals(498.8, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2602.524048111884));
      Complex complex1 = complex0.sqrt();
      assertEquals(36.073009634017815, complex1.getReal(), 0.01);
      assertEquals((-2602.524048111884), complex0.getImaginary(), 0.01);
      assertEquals((-36.073009634017815), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Complex complex0 = new Complex((-1200.825232759), (-1200.825232759));
      Complex complex1 = complex0.sinh();
      assertEquals((-1200.825232759), complex0.getImaginary(), 0.01);
      assertEquals((-1200.825232759), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-660.6742290001639), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1978.482169097285));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Complex complex0 = new Complex(229.502562717054);
      Complex complex1 = Complex.valueOf(229.502562717054, 229.502562717054);
      Complex complex2 = complex1.pow(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.pow(498.8);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(498.8, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.pow((-782.0));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(498.8, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.pow((-2563.0427733342));
      assertEquals((-0.990985070053672), complex2.getReal(), 0.01);
      assertEquals((-0.13397235136668634), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.asin();
      Complex complex2 = complex1.multiply(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Complex complex0 = Complex.valueOf(660.97606);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(436889.35189312353, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3839.0);
      Complex complex1 = complex0.multiply((-414.28745486));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1590449.53920754), complex1.getReal(), 0.01);
      assertEquals(3839.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-8780203.91006935));
      Complex complex1 = complex0.multiply((-4928.77191));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(4.327562239602198E10, complex1.getReal(), 0.01);
      assertEquals((-8780203.91006935), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.log();
      assertEquals((-1.158673312010046), complex2.getImaginary(), 0.01);
      assertEquals(2.0596328578975136, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Complex complex0 = Complex.valueOf(660.97606);
      boolean boolean0 = complex0.isNaN();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals(660.97606, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex1.isInfinite();
      assertTrue(boolean0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      Complex complex1 = complex0.acos();
      double double0 = complex1.getReal();
      assertEquals((-7.186407480484448), complex1.getImaginary(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-343.0719995));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-343.0719995), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-660.6742290001639), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Complex complex0 = new Complex((-6.4), (-6.4));
      Complex complex1 = complex0.multiply((-6.4));
      double double0 = complex1.getImaginary();
      assertEquals((-6.4), complex0.getImaginary(), 0.01);
      assertEquals(40.96000000000001, complex1.getReal(), 0.01);
      assertEquals(40.96000000000001, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-6.4), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      double double0 = complex0.getArgument();
      assertEquals(3.141592653589793, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.negate();
      double double0 = complex1.getArgument();
      assertEquals((-2.356194490192345), double0, 0.01);
      assertEquals(498.8, complex0.getImaginary(), 0.01);
      assertEquals(498.8, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1978.482169097285));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Complex complex0 = new Complex(1.0);
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.divide(complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-0.2723414689118315), complex3.getReal(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.8414709848078965, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.5403023058681398), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.divide(3991.132837984149);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-660.6742290001639));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.divide((-660.6742290001639));
      assertEquals(0.010877384291740953, complex2.getImaginary(), 0.01);
      assertEquals((-0.004755131221546427), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-6.05843098));
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals((-0.16505923782926385), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.NaN, (-0.9999404779121764));
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals((-0.9999404779121764), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(0.0, 0.0011912243516647436);
      assertEquals(0.0011912243516647436, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2602.524048111884));
      Complex complex1 = complex0.createComplex(2650.594043519063, 0.0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(2650.594043519063, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.createComplex(343.0719995, 343.0719995);
      Complex complex2 = complex1.exp();
      assertEquals((-5.881093286957275E148), complex2.getImaginary(), 0.01);
      assertEquals(343.0719995, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-7.925358439085624E148), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.createComplex((-4025.0989), (-411.9));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-411.9), complex1.getImaginary(), 0.01);
      assertEquals((-4025.0989), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.cosh();
      assertEquals(498.8, complex0.getImaginary(), 0.01);
      assertEquals(1.3829997581093393E216, complex1.getImaginary(), 0.01);
      assertEquals((-1.5985406318029874E216), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Complex complex0 = new Complex(1.633123935319537E16, 1.633123935319537E16);
      Complex complex1 = complex0.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(1.633123935319537E16, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.sinh();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.cos();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals((-4.227696836810262E-17), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3839.0);
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.conjugate();
      assertFalse(complex2.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.026228698876894045), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(0.0011912243516647436);
      Complex complex2 = complex1.atan();
      assertEquals((-0.001191223788209968), complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0000040192693418, (-4928.77191));
      Complex complex1 = complex0.atan();
      assertEquals(1.5707962856302582, complex1.getReal(), 0.01);
      assertEquals((-2.0289029210867853E-4), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1597.33572798513), (-4006.5320400001));
      Complex complex1 = complex0.asin();
      assertEquals((-9.062584873398803), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(complex0);
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.NaN);
      Complex complex1 = complex0.ONE.sqrt();
      Complex complex2 = complex1.add(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(2.0, complex2.getReal(), 0.01);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Complex complex0 = new Complex((-6.4), (-6.4));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-6.4), complex0.getReal(), 0.01);
      assertEquals((-12.8), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-6.4), complex0.getImaginary(), 0.01);
      assertEquals((-12.8), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add((-3163.4));
      assertEquals((-3163.4), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.NaN);
      Complex complex1 = complex0.ONE.sqrt();
      Complex complex2 = complex1.add(1716.18568944878);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1717.18568944878, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1597.33572798513), (-4006.5320400001));
      Complex complex1 = complex0.add(4459.22);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-2.0623688984595433E7), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-5066454.257790633), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.ZERO.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(889516852);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.INF.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1978.482169097285));
      Complex complex1 = complex0.sqrt();
      assertEquals(44.48013229631051, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex0.subtract(complex1);
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ONE.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.add(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.ZERO.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1597.33572798513), (-4006.5320400001));
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertEquals((-1597.33572798513), complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals((-4006.5320400001), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1597.33572798513), (-4006.5320400001));
      double double0 = complex0.getImaginary();
      assertEquals((-4006.5320400001), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1597.33572798513), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 1.7976931348623157E308);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sinh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Complex complex0 = Complex.valueOf(286.44, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.subtract(Double.POSITIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(498.8, complex0.getReal(), 0.01);
      assertEquals(498.8, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      Complex complex2 = complex1.cos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.cos();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.atan();
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      Complex complex2 = complex1.asin();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt1z();
      Complex complex2 = complex1.subtract(6.283185307179586);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(1768.0810354);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Complex complex0 = new Complex((-2149.36379929));
      Complex complex1 = complex0.NaN.pow((-1074.8244882148542));
      List<Complex> list0 = complex1.nthRoot(37);
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(list0.contains(complex0));
      assertEquals((-2149.36379929), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Complex complex0 = new Complex(2717.5036, 134.80934);
      Complex complex1 = complex0.exp();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(134.80934, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(1.0000002370473264, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(1.0000002370473264, complex1.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-911.0), Double.NaN);
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.5874010519681994);
      complex0.NaN.hashCode();
      assertFalse(complex0.isInfinite());
      assertEquals(1.5874010519681994, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Complex complex0 = Complex.valueOf(660.97606);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(660.97606, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Complex complex0 = Complex.valueOf(660.97606);
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(660.97606, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.valueOf(2627.1120587);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(2627.1120587, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.divide(6.283185307179586);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.multiply((-704.0));
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-704.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Complex complex0 = Complex.valueOf(498.8, 498.8);
      Complex complex1 = Complex.valueOf(498.8);
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.cosh();
      Complex complex4 = complex3.atan();
      assertEquals(248801.44, complex2.getImaginary(), 0.01);
      assertTrue(complex4.isNaN());
      assertFalse(complex2.isInfinite());
      assertTrue(complex3.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt1z();
      complex1.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(Double.POSITIVE_INFINITY);
      List<Complex> list0 = complex1.nthRoot(90);
      assertTrue(complex1.isInfinite());
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex1));
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(2.0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = (Complex)complex1.readResolve();
      boolean boolean0 = complex1.equals(complex2);
      assertFalse(complex2.isInfinite());
      assertFalse(complex2.equals((Object)complex0));
      assertTrue(boolean0);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(complex0);
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.sqrt();
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt1z();
      double double0 = complex1.abs();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Complex complex0 = new Complex((-1715.588665925), Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals((-1715.588665925), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(4989);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(4989, list0.size());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7976931348623157E308);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(1.7976931348623157E308, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.toString();
      assertEquals("(0.0, 1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.sqrt1z();
  }
@Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      // Undeclared exception!
      try { 
        complex0.ONE.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Complex complex0 = new Complex(358.79076354, (-944.5358));
      Complex complex1 = complex0.I.divide(complex0);
      assertEquals((-9.252184512521277E-4), complex1.getReal(), 0.01);
      assertEquals(3.5145288782706505E-4, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-356.02712612296557));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals((-356.02712612296557), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Complex complex0 = Complex.valueOf(841.15906869, 0.0);
      assertEquals(841.15906869, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Complex complex0 = new Complex((-195.98101));
      Complex complex1 = complex0.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-195.98101), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757, 3.1075110632230718E7);
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-1.1714739525351971E-4), complex1.getImaginary(), 0.01);
      assertEquals(0.9997570067288148, complex1.getReal(), 0.01);
      assertEquals(4.455505956692757, complex0.getReal(), 0.01);
      assertEquals(3.1075110632230718E7, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Complex complex0 = Complex.valueOf(757943.36, (-169.524780245026));
      Complex complex1 = complex0.tan();
      assertEquals(757943.36, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-8.504125440289285E-148), complex1.getReal(), 0.01);
      assertEquals((-169.524780245026), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1140.0, 1140.0);
      Complex complex1 = complex0.multiply(complex0);
      Complex complex2 = complex1.subtract(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals(1140.0, complex0.getReal(), 0.01);
      assertEquals(2598060.0, complex2.getImaginary(), 0.01);
      assertEquals((-1140.0), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Complex complex0 = new Complex((-827.04569));
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Complex complex0 = new Complex(42.770996);
      Complex complex1 = complex0.INF.subtract(2626.95);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Complex complex0 = Complex.valueOf(757943.36, (-169.524780245026));
      Complex complex1 = complex0.subtract(757943.36);
      assertEquals((-169.524780245026), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-169.524780245026), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Complex complex0 = new Complex((-412.01598824101));
      Complex complex1 = complex0.sqrt1z();
      assertEquals(412.01477469408314, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Complex complex0 = new Complex((-1194.699), (-1194.699));
      Complex complex1 = complex0.I.sinh();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(1.306932828523934, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.sqrt1z();
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.INF.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Complex complex0 = new Complex((-557.997214887466), (-557.997214887466));
      Complex complex1 = complex0.sqrt();
      assertEquals((-557.997214887466), complex0.getImaginary(), 0.01);
      assertEquals((-25.953077312216127), complex1.getImaginary(), 0.01);
      assertEquals(10.750116608037391, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.4134241574411574), (-0.4134241574411574));
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals((-0.4134241574411574), complex0.getImaginary(), 0.01);
      assertEquals((-0.4134241574411574), complex0.getReal(), 0.01);
      assertEquals((-0.3894707761206021), complex1.getReal(), 0.01);
      assertEquals((-0.43657239912270923), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1155.6582699314), (-1155.6582699314));
      Complex complex1 = complex0.sin();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1155.6582699314), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1155.6582699314), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-870.6));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sin();
      assertEquals((-870.6000000268983), complex2.getReal(), 0.01);
      assertEquals(5.330884000177268E-14, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Complex complex0 = Complex.valueOf(97.7175133014876);
      Complex complex1 = new Complex(4.8071087803691626E-6);
      Complex complex2 = complex1.pow(complex0);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(841.15906869);
      Complex complex2 = complex0.pow(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.9689459326003385, complex2.getImaginary(), 0.01);
      assertEquals((-0.2472726828771433), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.createComplex(1684.905727199, 1684.905727199);
      Complex complex2 = complex1.pow(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract((double) 7);
      Complex complex2 = complex1.pow(472.300837551);
      assertTrue(complex2.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-304.0), (-304.0));
      Complex complex1 = complex0.pow((-304.0));
      assertEquals((-304.0), complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-304.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(1684.905727199);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((double) 7);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-4.286263797015736E-16), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1140.0, 1140.0);
      Complex complex1 = complex0.ONE.negate();
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1140.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1140.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1140.0, 1140.0);
      Complex complex1 = new Complex(0.0, 1140.0);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(1299600.0, complex2.getImaginary(), 0.01);
      assertEquals((-1299600.0), complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1140.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ONE.multiply(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.multiply((-654.5991106600104));
      assertFalse(complex1.isInfinite());
      assertEquals((-654.5991106600104), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-30.205587823287));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-30.205587823287), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.subtract(0.0);
      boolean boolean0 = complex1.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.INF.log();
      boolean boolean0 = complex1.isInfinite();
      assertFalse(complex0.isInfinite());
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Complex complex0 = new Complex((-412.01598824101));
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals((-412.01598824101), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.negate();
      double double0 = complex1.getImaginary();
      assertEquals((-1.0), double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.negate();
      double double0 = complex1.getArgument();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.5707963267948966), double0, 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(3199.9392);
      Complex complex2 = complex1.exp();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3198.9392), complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1140.0, 1140.0);
      Complex complex1 = complex0.exp();
      assertTrue(complex1.isInfinite());
      assertEquals(1140.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Complex complex0 = new Complex((-557.997214887466), (-557.997214887466));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(1.0105680264204566E242, complex1.getReal(), 0.01);
      assertEquals((-3.8560323264474603E241), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.997844754509471E-9, 1.997844754509471E-9);
      Complex complex1 = new Complex(4.9E-324);
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7029898543501842E-8);
      Complex complex1 = new Complex((-1750.49));
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-9.728646575245698E-12), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.subtract(complex0);
      Complex complex2 = complex1.divide((-7.800414592973399E-9));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-870.6));
      Complex complex1 = complex0.divide(2836.895376456);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.3068847752459591), complex1.getReal(), 0.01);
      assertEquals((-870.6), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex((-850.96077285), Double.NaN);
      assertEquals((-850.96077285), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(0.0, (-1.7976931348623157E308));
      assertFalse(complex1.isInfinite());
      assertEquals((-1.7976931348623157E308), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.createComplex(0.008336750013465571, 0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.008336750013465571, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Complex complex0 = new Complex((-557.997214887466), (-557.997214887466));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.divide(0.008333333333333333);
      Complex complex3 = complex2.cosh();
      assertFalse(complex2.isInfinite());
      assertEquals(1.212681631704548E244, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-4.627238791736953E243), complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Complex complex0 = new Complex((-3006.9044262477));
      Complex complex1 = complex0.I.cosh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Complex complex0 = new Complex((-557.997214887466), (-557.997214887466));
      Complex complex1 = complex0.cosh();
      assertEquals(3.8560323264474603E241, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-557.997214887466), complex0.getImaginary(), 0.01);
      assertEquals((-1.0105680264204566E242), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Complex complex0 = new Complex((-1750.49));
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.8121947307062535), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.010714690733195933), (-0.010714690733195933));
      Complex complex1 = complex0.conjugate();
      assertEquals((-0.010714690733195933), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.010714690733195933, complex1.getImaginary(), 0.01);
      assertEquals((-0.010714690733195933), complex1.getReal(), 0.01);
      assertEquals((-0.010714690733195933), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), (-1.0));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.017221967897851354, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals((-0.5976405218914749), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(1.212681631704548E244);
      Complex complex2 = complex1.asin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.212681631704548E244), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.010714690733195933), (-0.010714690733195933));
      Complex complex1 = complex0.asin();
      assertEquals((-0.010715100722742728), complex1.getImaginary(), 0.01);
      assertEquals((-0.010714280658916516), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 903.34);
      Complex complex1 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.add(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(903.34, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(903.34, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(2.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), (-1.0));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-2.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals((-2.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(2.0);
      assertEquals(3.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.010714690733195933), (-0.010714690733195933));
      Complex complex1 = complex0.add((-0.010714690733195933));
      assertEquals((-0.010714690733195933), complex1.getImaginary(), 0.01);
      assertEquals((-0.021429381466391867), complex1.getReal(), 0.01);
      assertEquals((-0.010714690733195933), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.createComplex((-2669.0), (-8.0E298));
      Complex complex2 = complex1.acos();
      assertEquals((-2669.0), complex1.getReal(), 0.01);
      assertEquals((-8.0E298), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757, 3.1075110632230718E7);
      try { 
        complex0.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(5007);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      try { 
        complex0.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.INF.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(3199.9392);
      Complex complex2 = complex1.sqrt();
      assertEquals(56.55916548182089, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex2.exp();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertNotSame(complex3, complex2);
      assertTrue(complex3.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.5403023058681398), complex2.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Complex complex0 = new Complex((-3006.9044262477));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-3006.9044262477), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1048.0618559559));
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1048.0618559559), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(557.997214887466);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Complex complex0 = new Complex((-1062.834));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.I.multiply(complex1);
      assertEquals((-1062.834), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Complex complex0 = new Complex((-1062.834));
      Complex complex1 = complex0.I.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-1062.834), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1140.0, 1140.0);
      Complex complex1 = complex0.INF.sin();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(1140.0, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isNaN());
      assertEquals(1140.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ZERO.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.createComplex(1684.905727199, 1684.905727199);
      Complex complex2 = complex1.sinh();
      Complex complex3 = complex2.asin();
      Complex complex4 = complex1.add(complex3);
      assertSame(complex4, complex3);
      assertTrue(complex2.isInfinite());
      assertEquals(1684.905727199, complex1.getReal(), 0.01);
      assertEquals(1684.905727199, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 903.34);
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(903.34, complex0.getImaginary(), 0.01);
      assertEquals(1806.68, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      double double0 = complex1.abs();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Complex complex0 = new Complex((-5916164.923160048), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-1090.92));
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals((-1090.92), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Complex complex0 = new Complex((-1047.9250887093192), Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1047.9250887093192), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Complex complex0 = new Complex(42.770996);
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals(42.770996, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      complex0.multiply(complex0);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2443.871407859008), Double.NaN);
      List<Complex> list0 = complex0.nthRoot(111);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Complex complex0 = new Complex((-137.5), 4373.774026464);
      // Undeclared exception!
      try { 
        complex0.NaN.nthRoot((-2656));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,656
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.tan();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sinh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Complex complex0 = new Complex((-1048.0618559559), (-1048.0618559559));
      Complex complex1 = complex0.NaN.cos();
      assertEquals((-1048.0618559559), complex0.getReal(), 0.01);
      assertEquals((-1048.0618559559), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-756.0151080381177));
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.pow((-501.4));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Complex complex0 = new Complex((-137.5), 4373.774026464);
      complex0.INF.hashCode();
      assertEquals(4373.774026464, complex0.getImaginary(), 0.01);
      assertEquals((-137.5), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide((-654.5991106600104));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Complex complex0 = Complex.valueOf(97.7175133014876);
      complex0.NaN.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(97.7175133014876, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.log();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.add((-1.0));
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.createComplex(2021.7, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(2021.7, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Complex complex0 = Complex.valueOf(97.7175133014876);
      complex0.nthRoot(1107);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Complex complex0 = Complex.INF;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Complex complex0 = Complex.INF;
      String string0 = complex0.toString();
      assertEquals("(Infinity, Infinity)", string0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(2110.149350737599, (-3666.461019));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isNaN());
      assertFalse(boolean0);
      assertEquals(2110.149350737599, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3666.461019), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1187.23148977));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1187.23148977), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.createComplex((-1468.604), 0.0);
      Complex complex2 = complex1.tan();
      assertFalse(complex2.isInfinite());
      assertEquals((-11.011520699399536), complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1468.604), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.tan();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.761594155955765), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.subtract(complex0);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.subtract(0.01745329052209854);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, 1526.43369280601);
      Complex complex1 = complex0.subtract(6.283185307179586);
      assertEquals(1526.43369280601, complex1.getImaginary(), 0.01);
      assertEquals(1526.43369280601, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Complex complex0 = new Complex((-2099.12428954301));
      Complex complex1 = complex0.ONE.subtract((-2099.12428954301));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2100.12428954301, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.subtract(1.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.sqrt1z();
      Complex complex2 = complex1.pow(1881.750982842);
      Complex complex3 = complex2.sqrt1z();
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.7050813447092628E283, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ONE.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333333333);
      Complex complex1 = complex0.INF.sqrt1z();
      assertEquals(0.008333333333333333, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3586.609318114203);
      Complex complex1 = complex0.I.pow(2.85040095144011776E17);
      Complex complex2 = complex1.sinh();
      assertEquals(3586.609318114203, complex0.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.36970367118627034), complex1.getReal(), 0.01);
      assertEquals((-0.22634852603387925), complex2.getReal(), 0.01);
      assertEquals(0.8564860272704232, complex2.getImaginary(), 0.01);
      assertEquals(0.9291497164135574, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-995.4368), (-995.4368));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-995.4368), complex0.getReal(), 0.01);
      assertEquals((-995.4368), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2469.64), (-2469.64));
      Complex complex1 = complex0.sin();
      assertEquals((-2469.64), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2469.64), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Complex complex0 = new Complex((-2391.0), (-2391.0));
      Complex complex1 = Complex.valueOf(3341.034457954758, 338.4271870565);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Complex complex0 = new Complex((-2626.04));
      Complex complex1 = complex0.I.pow(complex0);
      assertEquals((-0.9980267284282911), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.06279051952900362, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-383.7060894959516));
      Complex complex2 = complex1.pow(complex0);
      assertEquals((-383.7060894959516), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(4.545733196645555, complex2.getReal(), 0.01);
      assertEquals((-1.5738495282884717), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(1652.1760366);
      Complex complex2 = complex1.pow(5441.0);
      assertEquals(1652.1760366, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Complex complex0 = new Complex((-2822.3939922428), 1.5707963267948966);
      Complex complex1 = complex0.pow((-2535.511333));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1526.43369280601, 0.0952233225107193);
      Complex complex2 = complex0.I.multiply(complex1);
      assertEquals(1526.43369280601, complex2.getImaginary(), 0.01);
      assertEquals((-0.0952233225107193), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-107.84), (-107.84));
      Complex complex1 = complex0.multiply((-1179.73533986779));
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-2.7439383104193542E7), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Complex complex0 = new Complex((-2626.04));
      Complex complex1 = complex0.ONE.log();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Complex complex0 = new Complex((-1369.0), (-1369.0));
      Complex complex1 = complex0.log();
      assertEquals(7.568409415568421, complex1.getReal(), 0.01);
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
      assertEquals((-1369.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4.0, 0.0);
      Complex complex1 = complex0.INF.atan();
      boolean boolean0 = complex1.isNaN();
      assertFalse(complex0.isInfinite());
      assertEquals(4.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Complex complex0 = new Complex((-2626.04));
      double double0 = complex0.getReal();
      assertEquals((-2626.04), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-383.7060894959516));
      double double0 = complex1.getImaginary();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-383.7060894959516), double0, 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3586.609318114203);
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4.0, 0.0);
      Complex complex1 = complex0.atan();
      double double0 = complex1.getArgument();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-4.186937069285954E-17), double0, 0.01);
      assertEquals((-5.551115123125783E-17), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Complex complex0 = Complex.valueOf(807.81, 894.8614575148133);
      Complex complex1 = complex0.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(894.8614575148133, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-1429.3919));
      Complex complex2 = complex1.exp();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1429.3919), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.03275152530605851), complex2.getImaginary(), 0.01);
      assertEquals((-0.9994635248922927), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333333333);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.008333333333333333, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Complex complex0 = new Complex((-16.213708276451996), 3463.7);
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(16.21370827644103, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide((-752.5561257));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Complex complex0 = new Complex((-2099.12428954301));
      Complex complex1 = complex0.I.divide((-1610.7598232));
      assertFalse(complex0.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-6.208250203393824E-4), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Complex complex0 = new Complex((-1369.0), (-1369.0));
      Complex complex1 = complex0.createComplex(0.08713622391223907, Double.NaN);
      assertFalse(complex0.isNaN());
      assertEquals(0.08713622391223907, complex1.getReal(), 0.01);
      assertEquals((-1369.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.25, (-0.2499999701976776));
      Complex complex1 = complex0.createComplex(0.0, 178.37715);
      assertEquals(1.25, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(178.37715, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-0.2499999701976776), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex((-1535.226210216268), (-1535.226210216268));
      assertEquals((-1535.226210216268), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1535.226210216268), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      Complex complex0 = Complex.valueOf(794.91809, 794.91809);
      Complex complex1 = complex0.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(794.91809, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Complex complex0 = Complex.valueOf(794.91809, 794.91809);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(794.91809, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Complex complex0 = new Complex((-5874.8), 0.16666666666666666);
      Complex complex1 = complex0.conjugate();
      assertEquals(0.16666666666666666, complex0.getImaginary(), 0.01);
      assertEquals((-5874.8), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.16666666666666666), complex1.getImaginary(), 0.01);
      assertEquals((-5874.8), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.5703914095011424), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.atan();
      assertEquals(1.095546696303347, complex2.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals((-0.22101690190093917), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.asin();
      assertEquals(8.504974810371488, complex1.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3371.8);
      Complex complex1 = complex0.asin();
      assertEquals((-8.816349163952093), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(1.0);
      Complex complex2 = complex0.add(complex1);
      assertEquals(2.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.add(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-383.7060894959516));
      Complex complex2 = complex1.add(complex0);
      assertEquals((-382.7060894959516), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.add(0.0);
      Complex complex2 = complex1.add((-1570.01));
      Complex complex3 = complex2.cos();
      assertEquals(1.0901090594890561, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-0.8317640608949121), complex3.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-383.7060894959516));
      Complex complex2 = complex1.add((-383.7060894959516));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-383.7060894959516), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-383.7060894959516), complex2.getReal(), 0.01);
      assertEquals((-383.7060894959516), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-4824.436105923679));
      Complex complex2 = complex1.acos();
      Complex complex3 = complex2.pow(363.591);
      Complex complex4 = complex3.acos();
      assertEquals(0.7290908529265491, complex2.getImaginary(), 0.01);
      assertFalse(complex4.isNaN());
      assertEquals(4.5861475780202797E24, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.INF.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(1073741824);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.sqrt();
      assertEquals(49.695472630814166, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.exp();
      complex1.log();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-1.0));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(957.2);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(957.2);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(947.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(947.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      complex0.divide(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4.0, 0.0);
      Complex complex1 = complex0.INF.atan();
      Complex complex2 = complex0.ONE.add(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(4.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(complex0);
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(Double.NaN);
      Complex complex2 = complex1.add(complex0);
      assertTrue(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Complex complex0 = Complex.valueOf(794.91809, 794.91809);
      double double0 = complex0.abs();
      assertEquals(794.91809, complex0.getImaginary(), 0.01);
      assertEquals(1124.1839438537168, double0, 0.01);
      assertEquals(794.91809, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Complex complex0 = new Complex(0.2, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.2, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      double double0 = complex0.getImaginary();
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      double double0 = complex0.getReal();
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 6.283185307179586);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      List<Complex> list0 = complex0.INF.nthRoot(657);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(889);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-6898));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -6,898
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Complex complex0 = Complex.valueOf(947.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.acos();
      complex1.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(947.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      complex0.NaN.subtract(3785.4604231);
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      Complex complex1 = complex0.NaN.sinh();
      Complex complex2 = complex0.subtract(complex1);
      complex2.acos();
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.negate();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.039913914276898055, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(0.039913914276898055);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.039913914276898055, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(8.251545029714408E-9, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(8.251545029714408E-9, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(complex0);
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.NaN.tanh();
      Complex complex2 = complex0.multiply(complex1);
      boolean boolean0 = complex0.equals(complex2);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2469.64), complex0.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Complex complex0 = new Complex((-2469.64));
      Complex complex1 = complex0.exp();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.divide(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2762.31762776848));
      complex0.divide(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-2762.31762776848), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      Complex complex1 = complex0.divide((-4391.58124284639));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.8619811894101418), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(0.16666666666666666);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.exp();
      complex1.add(Double.NaN);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.25, (-0.2499999701976776));
      Complex complex1 = complex0.pow(178.37715);
      Complex complex2 = complex1.asin();
      double double0 = complex2.abs();
      assertEquals((-5.0765075495782359E18), complex1.getReal(), 0.01);
      assertEquals((-0.2499999701976776), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(3.885958474680855E18, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.25, (-0.2499999701976776));
      Complex complex1 = complex0.createComplex(828.0482177514, Double.POSITIVE_INFINITY);
      assertEquals(1.25, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-0.2499999701976776), complex0.getImaginary(), 0.01);
      assertEquals(828.0482177514, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.nthRoot(49);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3785.4604231);
      complex0.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(3785.4604231, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.25, (-0.2499999701976776));
      String string0 = complex0.toString();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals("(1.25, -0.2499999701976776)", string0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.readResolve();
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }
}
