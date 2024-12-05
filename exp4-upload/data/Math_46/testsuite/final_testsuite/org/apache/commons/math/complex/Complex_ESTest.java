package org.apache.commons.math.complex;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.complex.ComplexField;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      Complex complex0 = new Complex(97.72170432, 320.82);
      List<Complex> list0 = complex0.nthRoot(775);
      assertEquals(775, list0.size());
      assertEquals(97.72170432, complex0.getReal(), 0.01);
      assertEquals(320.82, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.1738929649871164, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.1738929649871164, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
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
  public void test_0005()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.cosh();
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 0.0);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Complex complex0 = new Complex((-146.545), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.subtract((-146.545));
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.sqrt1z();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.createComplex(1.0, (-1925.0));
      Complex complex2 = complex1.sqrt();
      assertEquals((-1925.0), complex1.getImaginary(), 0.01);
      assertEquals(31.032243390868814, complex2.getReal(), 0.01);
      assertEquals((-31.016126932131954), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.createComplex(1.0, (-1925.0));
      Complex complex2 = complex1.sinh();
      assertEquals((-1925.0), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.8218869980136863), complex2.getReal(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-1.102949333474091), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2076.34567), (-2076.34567));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-2076.34567), complex0.getReal(), 0.01);
      assertEquals((-2076.34567), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Complex complex0 = new Complex((-5105.3769));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex2.sin();
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-47128.738557687335), complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Complex complex0 = new Complex((-226.84050647));
      Complex complex1 = complex0.sin();
      assertEquals((-0.6018658058073052), complex1.getReal(), 0.01);
      assertEquals((-226.84050647), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.0, 2.0);
      Complex complex1 = complex0.sin();
      assertEquals((-1.5093064853236158), complex1.getImaginary(), 0.01);
      assertEquals(2.0, complex0.getImaginary(), 0.01);
      assertEquals(3.4209548611170133, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Complex complex0 = new Complex((-2000.313931), (-2000.313931));
      Complex complex1 = complex0.multiply((-797.925122992689));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-2000.313931), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-2000.313931), complex0.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Complex complex0 = new Complex((-226.84050647));
      Complex complex1 = Complex.valueOf((-226.84050647), (-226.84050647));
      Complex complex2 = complex0.pow(complex1);
      assertEquals((-1.3272815727337467E-225), complex2.getImaginary(), 0.01);
      assertEquals((-5.819465842284245E-228), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 3997.302854559);
      Complex complex1 = complex0.pow(1.34217729E8);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(3997.302854559, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(38.47841760435743);
      assertEquals((-0.6827330532021055), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.7306678986142274), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Complex complex0 = new Complex((-5105.3769));
      Complex complex1 = Complex.valueOf(2434.7);
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.243006113843E7), complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8));
      Complex complex1 = complex0.I.multiply(complex0);
      assertEquals((-2.6033824355191673E-8), complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.multiply((-1123.473284735453));
      assertEquals((-1123.473284735453), complex1.getReal(), 0.01);
      assertEquals((-1123.473284735453), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.0));
      Complex complex1 = complex0.multiply(260.344);
      assertEquals((-260.344), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.log();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals((-3.141592653589793), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.multiply(complex0);
      boolean boolean0 = complex1.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getReal();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, 112.159178811852);
      double double0 = complex0.getImaginary();
      assertEquals(112.159178811852, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      double double0 = complex0.getImaginary();
      assertEquals((-2385.0), double0, 0.01);
      assertEquals(112.159178811852, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 0.0);
      double double0 = complex0.getArgument();
      assertEquals(3.141592653589793, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Complex complex0 = new Complex(-0.0, -0.0);
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals((-3.141592653589793), double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1788.08), (-1788.08));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1788.08), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((double) (-45));
      Complex complex2 = complex1.exp();
      assertFalse(complex2.isInfinite());
      assertEquals((-0.8414709848078973), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = new Complex(6.283185307179586, 112.159178811852);
      Complex complex2 = complex0.divide(complex1);
      assertEquals(112.159178811852, complex1.getImaginary(), 0.01);
      assertEquals((-2.1843830148613392), complex2.getImaginary(), 0.01);
      assertEquals((-21.14205134038655), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.divide((-857.06387));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide((-3.3309557035688367E7));
      Complex complex2 = complex1.tanh();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-3.002141394220838E-8), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-3.002141391039712E-8), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.createComplex(Double.POSITIVE_INFINITY, 1.0082644628099173);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.0082644628099173, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.createComplex(0.0, (-1.0));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.createComplex(0.041666666666666664, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.041666666666666664, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.createComplex(Double.NaN, Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.createComplex((-5862.74882), (-3.3309557035688367E7));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-5862.74882), complex1.getReal(), 0.01);
      assertEquals((-3.3309557035688367E7), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.cosh();
      double double0 = complex1.getReal();
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
      assertEquals((-2.211548776825506E48), double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.2992798673060089E48, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.subtract(1870.770159662705);
      Complex complex2 = complex1.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-1869.770159662705), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Complex complex0 = new Complex((-5105.3769));
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.9585755287515092), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1091.5), (-1091.5));
      Complex complex1 = complex0.subtract(2.0);
      Complex complex2 = complex1.cos();
      assertTrue(complex2.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-1091.5), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-1093.5), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8));
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertEquals((-2.6033824355191673E-8), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.0));
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Complex complex0 = new Complex((-2443.3454), (-2443.3454));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.tan();
      assertEquals((-2443.3454001868554), complex2.getReal(), 0.01);
      assertEquals((-2443.345400187285), complex2.getImaginary(), 0.01);
      assertEquals((-2443.3454), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Complex complex0 = new Complex((-2443.3454), (-2443.3454));
      Complex complex1 = complex0.asin();
      assertEquals((-0.785398142459203), complex1.getReal(), 0.01);
      assertEquals((-8.84084421564877), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Complex complex0 = new Complex(1232.42725438393);
      Complex complex1 = complex0.INF.add(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.asin();
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.add(complex1);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.add(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 0.0);
      Complex complex1 = complex0.I.divide((-1451.252474496529));
      Complex complex2 = complex0.add(complex1);
      assertEquals((-6.890599792754336E-4), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-6.890599792754336E-4), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8));
      Complex complex1 = complex0.INF.add((-1787.28285309648));
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.add(0.0);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-6.123233995736766E-17));
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-6.123233995736766E-17), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.add(3375.278295326778);
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
      assertEquals((-2385.0), complex1.getImaginary(), 0.01);
      assertEquals(3487.43747413863, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(1.304E19);
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.304E19, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-696.321684373));
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
  public void test_0066()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0067()  throws Throwable  {
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
  public void test_0068()  throws Throwable  {
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
  public void test_0069()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.ZERO.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals(33.73037662461324, complex2.getReal(), 0.01);
      assertEquals(35.3538892634192, complex2.getImaginary(), 0.01);
      assertEquals(2385.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.exp();
      Complex complex2 = complex1.acos();
      Complex complex3 = complex2.atan();
      assertEquals((-1.5707963267948966), complex3.getReal(), 0.01);
      assertEquals(0.6983742405300988, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(1.842567048470771);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.multiply((-418.7382));
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.I.divide(complex1);
      assertFalse(complex2.isInfinite());
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.divide(0.0);
      Complex complex2 = complex1.negate();
      complex2.add(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 2230.113);
      assertEquals(2230.113, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Complex complex0 = new Complex((-2076.34567), Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals((-2076.34567), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 244.78);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1900);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(1920);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1612));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,612
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(5444);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.tanh();
      assertEquals((-6.63849149046289E-98), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(112.159178811852, complex0.getReal(), 0.01);
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.ONE.sqrt1z();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
      assertEquals(112.159178811852, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, 0.5891179329848354);
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(1.5278465976357902E-16, complex1.getImaginary(), 0.01);
      assertEquals(1.1786071662802926, complex1.getReal(), 0.01);
      assertEquals(0.5891179329848354, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      complex0.atan();
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      complex0.asin();
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract((-1123.473284735453));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertFalse(complex0.isNaN());
      assertEquals(112.159178811852, complex0.getReal(), 0.01);
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.negate();
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.0, 2.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(2.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Complex complex0 = new Complex(1.0082644628099173, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(1.0082644628099173);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.0082644628099173, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Complex complex0 = new Complex((-2000.313931), (-2000.313931));
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.pow(0.0);
      Complex complex3 = complex2.sinh();
      assertNotSame(complex3, complex2);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = new Complex(1.0082644628099173, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(1.0082644628099173, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf((-1384.175881183));
      Complex complex2 = complex0.divide(complex1);
      boolean boolean0 = complex2.equals(complex0);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(boolean0);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf((-1384.175881183));
      boolean boolean0 = complex1.equals(complex0);
      assertEquals((-1384.175881183), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, (-1113.599709));
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals((-1113.599709), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, 0.5891179329848354);
      complex0.divide(Double.NaN);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.5891179329848354, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Complex complex0 = Complex.valueOf(112.159178811852, (-2385.0));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(112.159178811852, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-2385.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex0.sin();
      Complex complex3 = complex2.pow(complex1);
      assertTrue(complex0.equals((Object)complex2));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertSame(complex3, complex1);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      complex0.divide(complex0);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Complex complex0 = new Complex((-226.84050647));
      Complex complex1 = complex0.ZERO.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(1533.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1533.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.add((-2543.623));
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7080734182735711, Double.NaN);
      Complex complex1 = new Complex(6.283185307179586, 0.5891179329848354);
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(6.283185307179586, complex1.getReal(), 0.01);
      assertEquals(0.5891179329848354, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.asin();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.multiply((-4630.4828686));
      Complex complex4 = complex3.sqrt();
      assertEquals(-0.0, complex3.getReal(), 0.01);
      assertEquals((-52.95846067783055), complex4.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Complex complex0 = new Complex(1.0082644628099173, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertEquals(1.0082644628099173, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.ONE.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Complex complex0 = new Complex((-5105.3769));
      Complex complex1 = complex0.pow((-623.69467924));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Complex complex0 = new Complex((-5105.3769));
      complex0.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-5105.3769), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.divide(1.0082644628099173);
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Complex complex0 = Complex.valueOf(990.949923002);
      // Undeclared exception!
      try { 
        complex0.INF.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sin();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Complex complex0 = new Complex((-1611.7807224992));
      Complex complex1 = complex0.INF.cos();
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1611.7807224992), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(1118.8624329899867);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1118.8624329899867), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(0.0, 2941.40444458);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(boolean0);
      assertEquals(2941.40444458, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1118.8624329899867), (-1118.8624329899867));
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals((-1118.8624329899867), complex0.getImaginary(), 0.01);
      assertEquals((-1118.8624329899867), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-24.823));
      Complex complex1 = Complex.valueOf((-24.823), 285.9);
      Complex complex2 = complex0.I.divide(complex1);
      assertEquals((-24.823), complex0.getReal(), 0.01);
      assertEquals(0.00347155643375467, complex2.getReal(), 0.01);
      assertEquals((-3.0141463922732484E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 592.7185571);
      Complex complex1 = complex0.atan();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(0.0016871429734032347, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.4255188208147591), 1849.99477182);
      Complex complex1 = complex0.tanh();
      assertEquals((-0.9200167801400172), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.0770175415236435), complex1.getImaginary(), 0.01);
      assertEquals((-1.4255188208147591), complex0.getReal(), 0.01);
      assertEquals(1849.99477182, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.957007209750105E-8), (-2.957007209750105E-8));
      Complex complex1 = complex0.tan();
      assertEquals((-2.9570072097501032E-8), complex1.getReal(), 0.01);
      assertEquals((-2.957007209750105E-8), complex0.getImaginary(), 0.01);
      assertEquals((-2.957007209750105E-8), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.957007208537199E-8), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Complex complex0 = Complex.valueOf(990.949923002);
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(990.949923002, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.subtract(1719.869793809);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.sqrt1z();
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Complex complex0 = new Complex((-0.009902063637826582), (-0.009902063637826582));
      Complex complex1 = complex0.sqrt();
      assertEquals(0.045285588514831276, complex1.getReal(), 0.01);
      assertEquals((-0.009902063637826582), complex0.getImaginary(), 0.01);
      assertEquals((-0.10932908197255295), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-752.0993), 1.25);
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals(1.25, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-752.0993), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Complex complex0 = new Complex(2.6967135034957607E-22, 2.6967135034957607E-22);
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.sinh();
      assertEquals(2.6967135034957607E-22, complex1.getReal(), 0.01);
      assertEquals((-2.6967135034957607E-22), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1118.8624329899867), (-1516.125722190831));
      Complex complex1 = complex0.sin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1118.8624329899867), complex0.getReal(), 0.01);
      assertEquals((-1516.125722190831), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Complex complex0 = new Complex((-386.01260980144), (-386.01260980144));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Complex complex0 = new Complex(2.6967135034957607E-22, 2.6967135034957607E-22);
      Complex complex1 = complex0.pow(complex0);
      assertEquals((-1.3087923640408227E-20), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 781.315000814);
      Complex complex1 = complex0.pow(836.549590843);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Complex complex0 = new Complex((-1118.8624329899867));
      Complex complex1 = complex0.pow((-543.5660392791));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.negate();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-31.4731222484279));
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(31.4731222484279, complex1.getReal(), 0.01);
      assertEquals((-31.4731222484279), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.subtract(2.384185791015625E-7);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Complex complex0 = new Complex((-0.0013888888689039883));
      Complex complex1 = complex0.ONE.multiply(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1964.446564651347), Double.NaN);
      Complex complex1 = complex0.ONE.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Complex complex0 = new Complex((-686.27935781179), (-404.10279));
      Complex complex1 = complex0.log();
      assertEquals((-2.609425885149564), complex1.getImaginary(), 0.01);
      assertEquals((-404.10279), complex0.getImaginary(), 0.01);
      assertEquals(6.680121644097378, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(1790.6979103207195, complex0.getImaginary(), 0.01);
      assertEquals(1790.6979103207195, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getReal();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Complex complex0 = new Complex((-1118.8624329899867));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals((-1118.8624329899867), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1790.6979103207195, double0, 0.01);
      assertEquals(1790.6979103207195, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Complex complex0 = new Complex((-686.27935781179), (-404.10279));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-686.27935781179), complex0.getReal(), 0.01);
      assertEquals((-404.10279), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Complex complex0 = Complex.valueOf(854.93123004, 148.5);
      double double0 = complex0.ZERO.getArgument();
      assertFalse(complex0.isInfinite());
      assertEquals(854.93123004, complex0.getReal(), 0.01);
      assertEquals(148.5, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Complex complex0 = new Complex((-1611.7807224992));
      double double0 = complex0.getArgument();
      assertEquals(3.141592653589793, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-415.32917));
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Complex complex0 = new Complex((-686.27935781179), (-404.10279));
      Complex complex1 = complex0.multiply(2846.34784335);
      Complex complex2 = complex1.exp();
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals((-1953389.7700432113), complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1150217.104808218), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.123233995736766E-17, 2169.909201978);
      Complex complex1 = complex0.exp();
      assertEquals(0.8024093693382567, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2169.909201978, complex0.getImaginary(), 0.01);
      assertEquals((-0.5967739974212861), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Complex complex0 = new Complex(2.6967135034957607E-22, 2.6967135034957607E-22);
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.exp();
      assertEquals((-2.6967135034957607E-22), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals((-2.6967135034957607E-22), complex2.getImaginary(), 0.01);
      assertEquals(2.6967135034957607E-22, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Complex complex0 = new Complex(3605.819740145304, 3605.819740145304);
      Complex complex1 = complex0.ONE.add((-227.476376));
      Complex complex2 = complex1.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.03140428422953745, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(3605.819740145304, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.divide(3355.4447);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Complex complex0 = new Complex(2.6967135034957607E-22, 2.6967135034957607E-22);
      Complex complex1 = complex0.divide((-972.4777));
      assertFalse(complex1.isInfinite());
      assertEquals((-2.773033770847147E-25), complex1.getReal(), 0.01);
      assertEquals(2.6967135034957607E-22, complex0.getImaginary(), 0.01);
      assertEquals((-2.773033770847147E-25), complex1.getImaginary(), 0.01);
      assertEquals(2.6967135034957607E-22, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Complex complex0 = Complex.valueOf(66.4821, 66.4821);
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 0.8414709848078965);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(66.4821, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(66.4821, complex0.getReal(), 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(0.0, (-718.3751));
      assertEquals((-718.3751), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex((-329.58), 0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-329.58), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Complex complex0 = new Complex(0.8159026898411613, 0.8159026898411613);
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.cosh();
      assertEquals((-0.18718292566404324), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.2416454011890803, complex2.getImaginary(), 0.01);
      assertEquals(1.6469440226882004, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      Complex complex1 = complex0.cosh();
      assertEquals(1790.6979103207195, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Complex complex0 = Complex.valueOf(8.0);
      Complex complex1 = complex0.cos();
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.14550003380861354), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1118.8624329899867), (-1118.8624329899867));
      Complex complex1 = complex0.cos();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1118.8624329899867), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Complex complex0 = new Complex(974.4348);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.conjugate();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(974.4342868819016, complex1.getImaginary(), 0.01);
      assertEquals((-974.4342868819016), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Complex complex0 = new Complex((-0.1428571423679182));
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Complex complex0 = new Complex((-1611.7807224992));
      Complex complex1 = complex0.atan();
      assertEquals((-1.5701758950837283), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-5.551115123125783E-17), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1118.8624329899867), (-1118.8624329899867));
      Complex complex1 = complex0.asin();
      assertEquals((-8.059788534141335), complex1.getImaginary(), 0.01);
      assertEquals((-0.7853980635454803), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Complex complex0 = new Complex(1327.471, 0.0);
      Complex complex1 = complex0.INF.add(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Complex complex0 = new Complex(974.4348);
      Complex complex1 = complex0.I.createComplex((-3341.9953244124), (-484.74972));
      Complex complex2 = complex1.add(complex0);
      assertEquals((-2367.5605244124), complex2.getReal(), 0.01);
      assertEquals((-484.74972), complex2.getImaginary(), 0.01);
      assertEquals((-484.74972), complex1.getImaginary(), 0.01);
      assertEquals((-3341.9953244124), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Complex complex0 = new Complex(2.639303909564496E-4, (-0.7853981633974483));
      Complex complex1 = complex0.add((-0.7853981633974483));
      assertEquals((-0.7853981633974483), complex0.getImaginary(), 0.01);
      assertEquals((-0.7853981633974483), complex1.getImaginary(), 0.01);
      assertEquals((-0.7851342330064919), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Complex complex0 = Complex.INF;
      try { 
        complex0.NaN.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
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
  public void test_0226()  throws Throwable  {
      Complex complex0 = new Complex(760.431, 760.431);
      // Undeclared exception!
      complex0.nthRoot(1000224934);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.ZERO.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
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
  public void test_0229()  throws Throwable  {
      Complex complex0 = new Complex((-0.1428571423679182));
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
  public void test_0230()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-31.4731222484279));
      Complex complex1 = complex0.sqrt();
      assertEquals(5.61009110874573, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.sqrt1z();
      complex0.subtract(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1790.6979103207195, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Complex complex0 = new Complex((-686.27935781179), (-404.10279));
      Complex complex1 = complex0.negate();
      assertEquals((-404.10279), complex0.getImaginary(), 0.01);
      assertEquals(404.10279, complex1.getImaginary(), 0.01);
      assertEquals((-686.27935781179), complex0.getReal(), 0.01);
      assertEquals(686.27935781179, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply((-1.0));
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Complex complex0 = new Complex(1327.471, 0.0);
      Complex complex1 = complex0.INF.multiply(1327.471);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(1327.471, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2806.9154464715, (-1786.9454144576));
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0031609371684909E7), complex1.getImaginary(), 0.01);
      assertEquals((-1786.9454144576), complex0.getImaginary(), 0.01);
      assertEquals(4685600.409389257, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.4255188208147591), 1849.99477182);
      Complex complex1 = complex0.NaN.multiply(complex0);
      assertEquals((-1.4255188208147591), complex0.getReal(), 0.01);
      assertEquals(1849.99477182, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Complex complex0 = new Complex(974.4348);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-0.001026236467109451), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2806.9154464715, (-1786.9454144576));
      complex0.NaN.add(complex0);
      assertEquals((-1786.9454144576), complex0.getImaginary(), 0.01);
      assertEquals(2806.9154464715, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 781.315000814);
      double double0 = complex0.abs();
      assertEquals(781.315000814, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(781.315000814, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Complex complex0 = new Complex(1790.6979103207195, Double.NaN);
      assertEquals(1790.6979103207195, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Complex complex0 = new Complex((-1118.8624329899867));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1118.8624329899867), complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(135);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(1104);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1159));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,159
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
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.tanh();
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Complex complex0 = new Complex((-1118.8624329899867));
      complex0.NaN.tan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1118.8624329899867), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1357.0), Double.NaN);
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1357.0), Double.NaN);
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.atan();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(1790.6979103207195, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1790.6979103207195, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.subtract(2569.575319018);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.negate();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(930.3029);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-1357.0), Double.NaN);
      Complex complex2 = complex0.add(complex1);
      complex2.multiply(Double.NaN);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1790.6979103207195, 1790.6979103207195);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertTrue(complex1.isInfinite());
      assertEquals(1790.6979103207195, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Complex complex0 = new Complex((-761.3576731779084));
      Complex complex1 = Complex.valueOf((-635.1005076199941), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals((-635.1005076199941), complex1.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-1357.0), Double.NaN);
      Complex complex2 = complex0.INF.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(0.0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(1.0, 1.0);
      Complex complex2 = complex1.divide(Double.NEGATIVE_INFINITY);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.NEGATIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.divide(0.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Complex complex0 = new Complex((-2422.05532056), (-2422.05532056));
      complex0.NaN.divide((-2422.05532056));
      assertEquals((-2422.05532056), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2422.05532056), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-1357.0), Double.NaN);
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.divide(complex0);
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2348.14);
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(2348.14, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add((-7773140.220581126));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Complex complex0 = new Complex(781.315000814, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply((-24.915491085654406));
      assertEquals(781.315000814, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.NaN, (-1357.0));
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-1357.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(37);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(37, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(449.7008083337078);
      assertEquals((-0.8915822500658441), complex1.getReal(), 0.01);
      assertEquals(0.45285879848748295, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      ComplexField complexField0 = complex0.ZERO.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.toString();
      assertEquals("(0.0, 1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.pow((double) 37);
      complex2.acos();
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }
@Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-439.4442041362576));
      List<Complex> list0 = complex0.nthRoot(584);
      assertEquals((-439.4442041362576), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(584, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Complex complex0 = Complex.valueOf(780.0330473925225);
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
  public void test_0317()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2217.49330655), (-4863.1547225));
      Complex complex1 = Complex.valueOf((-2217.49330655), (-2690.3));
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-2690.3), complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2217.49330655), complex1.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.exp();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-806.455));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-806.455), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.tanh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Complex complex0 = new Complex((-217.15395), 1029.8391333787);
      Complex complex1 = complex0.tanh();
      assertEquals(1029.8391333787, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-217.15395), complex0.getReal(), 0.01);
      assertEquals((-4.508467774617291E-189), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isNaN());
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Complex complex0 = Complex.valueOf(126.2, 4442.064);
      Complex complex1 = complex0.tanh();
      assertEquals(4442.064, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-1.4127609097929327E-110), complex1.getImaginary(), 0.01);
      assertEquals(126.2, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1029.8391333787);
      Complex complex1 = complex0.tan();
      assertEquals(1029.8391333787, complex0.getReal(), 0.01);
      assertEquals((-0.6889289180034913), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Complex complex0 = new Complex((-564.956003727), (-564.956003727));
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.tan();
      assertEquals((-26.114406429611115), complex1.getImaginary(), 0.01);
      assertEquals(1.452305382520147E-23, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.subtract(complex0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Complex complex0 = new Complex((-564.956003727), (-564.956003727));
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex((-742.73971907));
      Complex complex2 = complex0.ZERO.subtract(complex1);
      assertEquals(742.73971907, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-742.73971907), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(2.0, 2.0);
      Complex complex2 = complex1.ZERO.subtract(complex1);
      assertEquals((-2.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertEquals((-2.0), complex2.getImaginary(), 0.01);
      assertEquals(2.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.subtract(2.0);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.subtract(1.5707963267948966);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-0.8813735870195429), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3316.0, 0.3999999761581421);
      Complex complex1 = complex0.sqrt1z();
      assertEquals((-3315.9998492159216), complex1.getImaginary(), 0.01);
      assertEquals(0.3999999761581421, complex0.getImaginary(), 0.01);
      assertEquals(0.3999999943468123, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Complex complex0 = new Complex(2413.0, 2413.0);
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.sinh();
      assertEquals(22.35505900245265, complex1.getImaginary(), 0.01);
      assertEquals(53.969886631371935, complex1.getReal(), 0.01);
      assertEquals((-1.2834498384286989E23), complex2.getReal(), 0.01);
      assertEquals((-4.88832556373148E22), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-829.75559474));
      Complex complex1 = complex0.ONE.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-829.75559474), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4442.064, 4442.064);
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(4442.064, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(4442.064, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Complex complex0 = new Complex((-1589.1634), 1029.8391333787);
      Complex complex1 = complex0.sin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1029.8391333787, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1589.1634), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Complex complex0 = new Complex((-1976.06973351));
      Complex complex1 = complex0.subtract((-1976.06973351));
      Complex complex2 = complex1.sin();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Complex complex0 = new Complex(3032.061347);
      Complex complex1 = complex0.sin();
      assertEquals((-0.411807150832746), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(3032.061347, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4917275.564609527), 0.1428571343421936);
      Complex complex1 = complex0.sin();
      assertEquals((-0.0333292297917642), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.9825346093013205, complex1.getReal(), 0.01);
      assertEquals((-4917275.564609527), complex0.getReal(), 0.01);
      assertEquals(0.1428571343421936, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Complex complex0 = new Complex((-0.9505909539362848), 6.283185307179586);
      Complex complex1 = complex0.add(2855.149188535484);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2217.493306553489));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.pow(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Complex complex0 = new Complex((-0.9505909539362848), 6.283185307179586);
      Complex complex1 = complex0.pow(complex0);
      assertEquals((-2.944870731444087E-6), complex1.getReal(), 0.01);
      assertEquals((-1.8385951198084284E-6), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Complex complex0 = Complex.valueOf(8.0E298, (-1.0));
      Complex complex1 = complex0.pow((-3452.6975));
      assertEquals(8.0E298, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(1.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.I.divide(3047.6574924);
      Complex complex2 = complex1.pow(6.283185307179586);
      assertEquals(3.281208608558273E-4, complex1.getImaginary(), 0.01);
      assertEquals((-1.1618001470837424E-22), complex2.getReal(), 0.01);
      assertEquals((-5.53818681772405E-23), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-3919.53352904));
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-3919.53352904), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2217.493306553489));
      Complex complex1 = complex0.multiply(4442.064);
      assertEquals((-9850247.18728222), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-2217.493306553489), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.multiply(6.283185307179586);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-6.283185307179586), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3099.81), 0.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-3099.81), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2462.1));
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2462.1), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1345.091778123), (-1345.091778123));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertEquals((-1345.091778123), complex0.getReal(), 0.01);
      assertEquals((-1345.091778123), double0, 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      double double0 = complex1.getArgument();
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.negate();
      double double0 = complex1.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3.141592653589793), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.414213562373095, 2.414213562373095);
      Complex complex1 = complex0.exp();
      assertEquals(7.434389483162757, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2.414213562373095, complex0.getImaginary(), 0.01);
      assertEquals((-8.351288957202954), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-3919.53352904));
      Complex complex2 = complex1.exp();
      double double0 = complex2.getReal();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Complex complex0 = new Complex(2205.0, 2205.0);
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.cos();
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2205.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Complex complex0 = new Complex(3032.061347);
      Complex complex1 = Complex.valueOf((-4917275.564609527), 0.1428571343421936);
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1621.7599190315877), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(4.711551581353727E-5, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(2.0, 2.0);
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(2.0, complex1.getReal(), 0.01);
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertEquals(0.25, complex2.getReal(), 0.01);
      assertEquals((-0.25), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.add(2.0);
      Complex complex2 = complex1.divide(1.4456468917292502E-16);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1211.471));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.divide((-1211.471));
      assertEquals(0.9260333681207019, complex1.getReal(), 0.01);
      assertEquals((-7.643875652992947E-4), complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.divide(0.41421356237309515);
      assertEquals(3.7922377958740787, complex2.getReal(), 0.01);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex((-2217.493306553489), 0.0);
      assertEquals((-2217.493306553489), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.NaN, 0.0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Complex complex0 = Complex.valueOf(268.5982, 3047.6574924);
      Complex complex1 = complex0.ZERO.createComplex(268.5982, (-2462.917817320845));
      assertEquals(268.5982, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(3047.6574924, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(268.5982, complex0.getReal(), 0.01);
      assertEquals((-2462.917817320845), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Complex complex0 = new Complex((-564.956003727), (-564.956003727));
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.cosh();
      assertEquals((-282.47844437583433), complex2.getReal(), 0.01);
      assertEquals((-282.4775593511657), complex2.getImaginary(), 0.01);
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-3919.53352904));
      Complex complex2 = complex1.cosh();
      assertTrue(complex2.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.028240960365167E31);
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-0.31872410789639166), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1345.091778123), (-1345.091778123));
      Complex complex1 = complex0.cos();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals((-1345.091778123), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2217.493306553489));
      Complex complex1 = complex0.INF.conjugate();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-2217.493306553489), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.I.divide(3047.6574924);
      Complex complex2 = complex1.conjugate();
      Complex complex3 = complex2.sqrt();
      assertEquals((-0.01280860766937272), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Complex complex0 = new Complex((-1788.923459), (-1788.923459));
      Complex complex1 = complex0.conjugate();
      assertEquals((-1788.923459), complex1.getReal(), 0.01);
      assertEquals((-1788.923459), complex0.getReal(), 0.01);
      assertEquals(1788.923459, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1788.923459), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1029.8391333787);
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1029.8391333787, complex1.getReal(), 0.01);
      assertEquals(1029.8391333787, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 750.3875036576);
      Complex complex1 = complex0.atan();
      assertEquals(0.001332645582591788, complex1.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.atan();
      assertEquals(1.095546696303347, complex2.getReal(), 0.01);
      assertEquals((-0.22101690190093917), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Complex complex0 = Complex.valueOf(8.0E298, (-1.0));
      Complex complex1 = complex0.asin();
      assertEquals(8.0E298, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4917276.203103172), 1.0);
      Complex complex1 = complex0.asin();
      assertEquals((-1.5707961233735401), complex1.getReal(), 0.01);
      assertEquals(16.103067534569195, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Complex complex0 = new Complex((-564.956003727), (-564.956003727));
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-564.956003727), complex0.getImaginary(), 0.01);
      assertEquals((-564.956003727), complex0.getReal(), 0.01);
      assertEquals((-1129.912007454), complex1.getReal(), 0.01);
      assertEquals((-1129.912007454), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.I.divide(3047.6574924);
      Complex complex2 = complex1.pow((-303.30664957125));
      Complex complex3 = complex2.add(3.281208608558273E-4);
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-3099.81));
      Complex complex1 = complex0.add((-3099.81));
      assertEquals((-3099.81), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3099.81), complex1.getImaginary(), 0.01);
      assertEquals((-3099.81), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.asin();
      assertEquals(0.9859776332644142, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Complex complex0 = new Complex(2413.0, 2413.0);
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
  public void test_0395()  throws Throwable  {
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
  public void test_0396()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0397()  throws Throwable  {
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
  public void test_0398()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3603.44330802237));
      Complex complex1 = complex0.sqrt();
      assertEquals(60.028687375473815, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.log();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.exp();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-299.911));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1352.9586);
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex0.add(complex1);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(1352.9586, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.I.divide(3047.6574924);
      double double0 = complex1.abs();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(3.281208608558273E-4, complex1.getImaginary(), 0.01);
      assertEquals(3.281208608558273E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      double double0 = complex0.INF.abs();
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Complex complex0 = new Complex(2457.6266261768333, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(2457.6266261768333, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Complex complex0 = new Complex((-1976.06973351));
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1976.06973351), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(6.283185307179586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1816.9435584, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(37);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(37);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-638));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -638
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      Complex complex1 = complex0.NaN.conjugate();
      Complex complex2 = complex1.sinh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(2712.3, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sin();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      Complex complex1 = complex0.NaN.conjugate();
      Complex complex2 = complex1.pow(2712.3);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2712.3, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Complex complex0 = new Complex(2413.0);
      Complex complex1 = complex0.NaN.cos();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(2413.0, complex0.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.acos();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(1.0151416063308716E-7);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0151416063308716E-7), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(6102.9412323);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      Complex complex1 = complex0.sqrt1z();
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      Complex complex1 = complex0.NaN.conjugate();
      Complex complex2 = complex1.negate();
      assertSame(complex2, complex1);
      assertEquals(2712.3, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-3097.116063965));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.createComplex(31.051358074, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.asin();
      assertTrue(complex1.isInfinite());
      assertEquals(31.051358074, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 0.0);
      complex0.hashCode();
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-439.4442041362576));
      complex0.divide(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals((-439.4442041362576), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-0.49999999999999994));
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-0.49999999999999994), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      Complex complex1 = complex0.NaN.divide(2712.3);
      Complex complex2 = complex1.atan();
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2712.3, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      boolean boolean0 = complex1.isNaN();
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.ONE.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.divide(complex0);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      Complex complex0 = new Complex(2413.0, 2413.0);
      Complex complex1 = complex0.I.add(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(2413.0, complex0.getImaginary(), 0.01);
      assertEquals(2413.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      complex0.NaN.add(2712.3);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2712.3, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sqrt();
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(1431655765);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Complex complex0 = new Complex(2712.3);
      complex0.ZERO.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(2712.3, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0475()  throws Throwable  {
      Complex complex0 = new Complex(2413.0);
      String string0 = complex0.toString();
      assertFalse(complex0.isInfinite());
      assertEquals("(2413.0, 0.0)", string0);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex0.subtract(complex1);
  }
@Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0478()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.log();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2360.483348824698);
      Complex complex1 = complex0.ONE.divide((-551.8498));
      assertEquals((-0.0018120872744721481), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(2360.483348824698, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1888.0);
      Complex complex1 = complex0.atan();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(5.296610664796692E-4, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Complex complex0 = new Complex(0.041666666666666664);
      Complex complex1 = complex0.ZERO.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      Complex complex1 = complex0.tanh();
      assertEquals(0.028392952868232287, complex1.getImaginary(), 0.01);
      assertEquals((-1.0238355945704727), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.0), complex0.getReal(), 0.01);
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.0, (-3323.0622320489274));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.tanh();
      assertEquals(0.9171523200922993, complex2.getReal(), 0.01);
      assertEquals((-4.779675335954011E-5), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1045.799326, (-1.0));
      Complex complex1 = complex0.tan();
      assertEquals(1045.799326, complex0.getReal(), 0.01);
      assertEquals((-0.1426931870027113), complex1.getReal(), 0.01);
      assertEquals((-0.8013899780211495), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4.9E-324));
      Complex complex1 = complex0.INF.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-4.9E-324), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.ONE.sin();
      Complex complex2 = complex1.ZERO.subtract(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1600.87450063216), complex0.getReal(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.8414709848078965), complex2.getReal(), 0.01);
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Complex complex0 = new Complex(1.0);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.ZERO.subtract(complex1);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4.9E-324));
      Complex complex1 = complex0.INF.subtract((-4.9E-324));
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-4.9E-324), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2147.94516979));
      Complex complex1 = complex0.subtract((-2147.94516979));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      Complex complex1 = complex0.subtract(498.307);
      assertEquals((-2.0), complex1.getImaginary(), 0.01);
      assertEquals((-500.307), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.sqrt();
      assertEquals((-30.977221443378294), complex1.getImaginary(), 0.01);
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
      assertEquals(12.831185246481954, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Complex complex0 = new Complex(820.428621554824, 820.428621554824);
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(820.428621554824, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(820.428621554824, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.sin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-794.94893352256), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 3133.811731176956);
      Complex complex1 = new Complex(3133.811731176956, 3133.811731176956);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(3133.811731176956, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.ONE.divide(0.08371849358081818);
      Complex complex3 = complex2.pow(complex1);
      assertEquals((-0.9408202297325973), complex3.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-0.3389060272788062), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.pow(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.log();
      Complex complex2 = complex1.pow((-2016.19992708));
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Complex complex0 = Complex.valueOf(120.75823);
      Complex complex1 = complex0.ZERO.createComplex((-1.5005236223586271), 388.86336212);
      Complex complex2 = complex1.pow(1694.40171257924);
      assertEquals(120.75823, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(388.86336212, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.negate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2360.483348824698);
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(2360.483348824698, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals((-1189625.989999895), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.multiply((-1090.7));
      Complex complex3 = complex2.log();
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals((-1189625.989999895), complex2.getImaginary(), 0.01);
      assertEquals(13.98914952156923, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Complex complex0 = new Complex((-385.777));
      Complex complex1 = complex0.ZERO.log();
      boolean boolean0 = complex1.isInfinite();
      assertFalse(complex0.isInfinite());
      assertTrue(boolean0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ONE.exp();
      double double0 = complex1.getReal();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = complex0.INF.conjugate();
      double double0 = complex1.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Complex complex0 = new Complex(0.041666666666666664);
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.acos();
      double double0 = complex1.getArgument();
      assertEquals((-1.1828547996008207), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Complex complex0 = Complex.valueOf(250.30306357878, 250.30306357878);
      Complex complex1 = complex0.ZERO.createComplex(2312.28205084803, 250.30306357878);
      Complex complex2 = complex1.exp();
      assertEquals(250.30306357878, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(250.30306357878, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(250.30306357878, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Complex complex0 = new Complex(0.9999790630047182, 1298.4066679);
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals((-1.6274388410652236), complex1.getReal(), 0.01);
      assertEquals((-2.1771976287731856), complex1.getImaginary(), 0.01);
      assertEquals(1298.4066679, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.sqrt1z();
      Complex complex2 = complex0.add((-2766.07444035188));
      Complex complex3 = complex2.divide(complex1);
      assertEquals(0.7071067811865475, complex3.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.divide(3113.8798258509396);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.divide(2245.0947492098226);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.3540825766049954), complex1.getImaginary(), 0.01);
      assertEquals((-794.94893352256), complex0.getReal(), 0.01);
      assertEquals((-0.3540825766049954), complex1.getReal(), 0.01);
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Complex complex0 = new Complex((-3285.73199), (-2026.1));
      Complex complex1 = complex0.ONE.createComplex(Double.NaN, (-3285.73199));
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
      assertEquals((-3285.73199), complex1.getImaginary(), 0.01);
      assertEquals((-3285.73199), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.createComplex(Double.POSITIVE_INFINITY, 0.3999999761581421);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.3999999761581421, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.createComplex((-308.46), (-308.46));
      Complex complex2 = complex1.sin();
      Complex complex3 = complex2.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals((-2.528324355537857E133), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1273.3);
      Complex complex1 = complex0.cos();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.5776289237918562), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1189625.49));
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.1698342564008819, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 58, 384.5487290473);
      Complex complex1 = complex0.cos();
      assertEquals(6.061288101909721E165, complex1.getReal(), 0.01);
      assertEquals((-5.0495723518713486E166), complex1.getImaginary(), 0.01);
      assertEquals(384.5487290473, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1273.3);
      Complex complex1 = complex0.I.conjugate();
      assertEquals(1273.3, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Complex complex0 = new Complex((-3285.73199), (-2026.1));
      Complex complex1 = complex0.atan();
      assertEquals((-1.3596967668979263E-4), complex1.getImaginary(), 0.01);
      assertEquals((-1.5705758243831907), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.asin();
      assertEquals((-7.717998648868363), complex1.getImaginary(), 0.01);
      assertEquals((-0.785397965595051), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.add(complex1);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertTrue(complex0.isNaN());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.add(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1045.799326, (-1.0));
      Complex complex1 = complex0.ONE.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(1046.799326, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.add((-2147.94516979));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-1.7976931348623157E308));
      Complex complex2 = complex1.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.7976931348623157E308), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.multiply((-768.74713165));
      Complex complex2 = complex1.acos();
      assertEquals(611114.7124536945, complex1.getImaginary(), 0.01);
      assertEquals((-14.36276073679508), complex2.getImaginary(), 0.01);
      assertEquals(0.785398163397783, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.ZERO.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0549()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(2147023886);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
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
  public void test_0551()  throws Throwable  {
      Complex complex0 = new Complex(760.8918558600008);
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
  public void test_0552()  throws Throwable  {
      Complex complex0 = new Complex(3118.6938848, 3118.6938848);
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
  public void test_0553()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.sqrt();
      double double0 = complex1.getImaginary();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, double0, 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sqrt();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex1.log();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.INF.divide(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.valueOf(0.0);
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(1147.435453);
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex0.ONE.divide(complex2);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-8.715090484169819E-4), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.tanh();
      Complex complex2 = complex1.I.add(complex1);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1335.49766));
      Complex complex1 = complex0.ZERO.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1335.49766), complex1.getReal(), 0.01);
      assertEquals((-1335.49766), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      complex0.NaN.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.sqrt1z();
      double double0 = complex1.abs();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
      assertEquals(1.4142135623730951, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Complex complex0 = new Complex(1.0);
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      Complex complex0 = new Complex(34.77228812, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(34.77228812, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1090.7), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1090.7), double0, 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1081.5049964756192), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1917);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      List<Complex> list0 = complex0.nthRoot(1917);
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
      assertEquals(1917, list0.size());
      assertEquals((-794.94893352256), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-386));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -386
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Complex complex0 = new Complex((-1090.7));
      List<Complex> list0 = complex0.NaN.nthRoot(1917);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1, list0.size());
      assertFalse(complex0.isInfinite());
      assertFalse(list0.contains(complex0));
      assertEquals((-1090.7), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.ONE.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1600.87450063216), complex0.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.NaN.sin();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.cosh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.cos();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex1.atan();
      assertEquals((-1600.87450063216), complex0.getReal(), 0.01);
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(3054.828776386);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(6.283185307179586);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 1090.6995415787062);
      Complex complex1 = complex0.multiply(2254.23);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(1086.4421967, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1086.4421967, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex0.pow(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1600.87450063216), complex0.getReal(), 0.01);
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      complex0.NaN.hashCode();
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-2.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.sqrt1z();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = complex0.NaN.tan();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(4.455505956692757, complex0.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = complex0.log();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.494140625, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      boolean boolean0 = complex0.equals(complex0);
      assertEquals(4.455505956692757, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2334.93408073));
      Complex complex1 = complex0.divide(0.0);
      complex1.acos();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-2334.93408073), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.divide((-0.1666666567325592));
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      Complex complex1 = complex0.divide(complex0);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.divide(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
      assertEquals((-794.94893352256), complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.conjugate();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.add((-2376.86388));
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
      assertEquals((-3977.73838063216), complex1.getReal(), 0.01);
      assertEquals((-1600.87450063216), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add(6.283185307179586);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals((-1600.87450063216), complex0.getImaginary(), 0.01);
      assertEquals((-1600.87450063216), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Complex complex0 = new Complex((-794.94893352256), (-794.94893352256));
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
      assertEquals((-794.94893352256), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-794.94893352256), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      complex0.I.getField();
      assertEquals((-2.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1600.87450063216), (-1600.87450063216));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      String string0 = complex0.NaN.toString();
      assertEquals("(NaN, NaN)", string0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-2.0), complex0.getReal(), 0.01);
      assertEquals((-2.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.0), (-2.0));
      complex0.I.asin();
  }
@Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-287.61368220208), 54.515163283898);
      // Undeclared exception!
      complex0.I.nthRoot(1073741829);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Complex complex0 = new Complex((-869.7951349415346), 219.510751911);
      List<Complex> list0 = complex0.nthRoot(1);
      assertFalse(list0.contains(complex0));
      assertEquals((-869.7951349415346), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
      assertEquals(219.510751911, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0633()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-3087.01));
      Complex complex1 = complex0.sqrt();
      assertEquals(39.28746619470388, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-3087.01), complex0.getImaginary(), 0.01);
      assertEquals((-39.287466194703875), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1819.6933661625753));
      Complex complex1 = complex0.I.cos();
      assertFalse(complex0.isNaN());
      assertEquals((-1819.6933661625753), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.I.sin();
      complex1.hashCode();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Complex complex0 = new Complex(9.220590270857665E-9);
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(9.220590270857665E-9, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.valueOf(0.0, (-1.4674011002723395));
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.4674011002723395), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2161916.259260104), (-213.8049));
      Complex complex1 = complex0.tan();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-3.5564507833537803E-186), complex1.getReal(), 0.01);
      assertEquals((-2161916.259260104), complex0.getReal(), 0.01);
      assertEquals((-213.8049), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1808.0792996173));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.subtract(0.041666666666666664);
      assertEquals(3.0999259869231266, complex2.getReal(), 0.01);
      assertEquals((-8.193167504485558), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2803.1872629675245), (-2803.1872629675245));
      Complex complex1 = complex0.sqrt();
      assertEquals(24.094793858764014, complex1.getReal(), 0.01);
      assertEquals((-58.169978116412054), complex1.getImaginary(), 0.01);
      assertEquals((-2803.1872629675245), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Complex complex0 = new Complex((-3422.8599916140056), (-3422.8599916140056));
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals((-3422.8599916140056), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-3422.8599916140056), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sinh();
      assertEquals((-1.1752011936438014), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(1.0004123684793558);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.sinh();
      assertEquals((-0.5405611555062568), complex3.getImaginary(), 0.01);
      assertEquals(0.4571001787731202, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      Complex complex0 = new Complex((-1807.0), (-1807.0));
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals((-1807.0), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1807.0), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-287.61368220208), 54.515163283898);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.sin();
      assertEquals((-1.8059149071912168E124), complex2.getImaginary(), 0.01);
      assertEquals((-3.623213501191689E124), complex2.getReal(), 0.01);
      assertEquals(54.515481368683986, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.sin();
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.1752011936438014), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(917.164028152);
      Complex complex2 = complex1.pow(complex1);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      Complex complex0 = Complex.valueOf(165.96);
      Complex complex1 = complex0.ONE.sqrt();
      Complex complex2 = complex1.pow(complex0);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(165.96, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-213.8049));
      Complex complex1 = complex0.I.pow(complex0);
      Complex complex2 = complex1.tanh();
      assertFalse(complex2.isInfinite());
      assertEquals((-0.1330889183212775), complex2.getImaginary(), 0.01);
      assertEquals((-0.30168772445499564), complex1.getImaginary(), 0.01);
      assertEquals((-0.7720236713510926), complex2.getReal(), 0.01);
      assertEquals((-0.9534067950844313), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      Complex complex0 = new Complex((-2421.47388), 240.60438757734);
      Complex complex1 = complex0.pow(240.60438757734);
      assertEquals((-2421.47388), complex0.getReal(), 0.01);
      assertEquals(240.60438757734, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, (-1808.0792996173));
      Complex complex1 = complex0.pow((-1808.0792996173));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1808.0792996173), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Complex complex0 = Complex.valueOf(165.96);
      Complex complex1 = complex0.pow(40.0);
      Complex complex2 = complex0.cos();
      Complex complex3 = complex2.pow(complex1);
      assertEquals((-0.855432677002326), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex3.equals((Object)complex1));
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2803.1872629675245), (-2803.1872629675245));
      Complex complex1 = complex0.ONE.tanh();
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-2134.891037525703), complex2.getImaginary(), 0.01);
      assertEquals((-2134.891037525703), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.multiply(complex0);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-1499.630516666364));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1499.630516666364), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.4674011002723395));
      Complex complex1 = complex0.multiply(0.030589580535888672);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-1.4674011002723395), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-0.04488718413523238), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.log();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3.141592653589793), complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      boolean boolean0 = complex1.isNaN();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      Complex complex0 = new Complex(1846.1562045957, 1846.1562045957);
      Complex complex1 = complex0.tan();
      double double0 = complex1.getReal();
      assertTrue(complex1.isNaN());
      assertEquals(1846.1562045957, complex0.getReal(), 0.01);
      assertEquals(1846.1562045957, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3230.507));
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-3230.507), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      Complex complex0 = new Complex((-1807.0), (-1807.0));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertEquals((-1807.0), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1807.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      Complex complex0 = new Complex(1846.1562045957, 1846.1562045957);
      double double0 = complex0.I.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(1846.1562045957, complex0.getReal(), 0.01);
      assertEquals(1846.1562045957, complex0.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-3087.01));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4217.2384, 4217.2384);
      Complex complex1 = complex0.exp();
      assertEquals(4217.2384, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      Complex complex0 = new Complex((-1807.0), (-1807.0));
      Complex complex1 = complex0.exp();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1807.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-287.61368220208), 54.515163283898);
      Complex complex1 = complex0.exp();
      assertEquals(54.515163283898, complex0.getImaginary(), 0.01);
      assertEquals((-5.5038037251311406E-126), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.1033509006352626E-125), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(1319.3789546366172);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1808.0792996173));
      Complex complex1 = complex0.divide(1319.3789546366172);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.3704018040179218), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1808.0792996173), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-3.141592653589793));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.3183098861837907), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.NaN, 0.030589580535888672);
      assertEquals(0.030589580535888672, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      Complex complex0 = new Complex(888.1321521925, 888.1321521925);
      Complex complex1 = complex0.NaN.createComplex(0.0, 0.0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2803.1872629675245), (-2803.1872629675245));
      Complex complex1 = complex0.NaN.createComplex((-2803.1872629675245), 0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2803.1872629675245), complex1.getReal(), 0.01);
      assertEquals((-2803.1872629675245), complex0.getReal(), 0.01);
      assertEquals((-2803.1872629675245), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(684.104936816773, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(684.104936816773, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex((-3.940510424527919E-20), (-3.940510424527919E-20));
      assertEquals((-3.940510424527919E-20), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-3.940510424527919E-20), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      Complex complex0 = new Complex(888.1321521925, 888.1321521925);
      Complex complex1 = complex0.cosh();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(888.1321521925, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.cosh();
      assertFalse(complex3.isInfinite());
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.9888977057628651), complex3.getImaginary(), 0.01);
      assertEquals(0.8337300251311491, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.00000000914026, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.conjugate();
      boolean boolean0 = complex1.equals(complex2);
      assertFalse(complex2.equals((Object)complex0));
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex0.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      Complex complex0 = new Complex((-1845.649161424309), 3999.0);
      Complex complex1 = complex0.atan();
      assertEquals(2.0615079185820745E-4, complex1.getImaginary(), 0.01);
      assertEquals((-1.570701182496523), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.subtract(complex1);
      assertEquals((-1.1102230246251565E-16), complex3.getImaginary(), 0.01);
      assertEquals((-0.044935016649466364), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(1.3117102704855564E13);
      Complex complex2 = complex1.asin();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Complex complex0 = new Complex((-4231.859));
      Complex complex1 = complex0.INF.subtract((-4231.859));
      Complex complex2 = complex1.add(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Complex complex0 = new Complex((-1807.0), (-1807.0));
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.add(complex0);
      assertEquals((-3614.0), complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-241.12169852782296), (-1793.405263));
      Complex complex2 = complex0.ZERO.add(complex1);
      assertEquals((-241.12169852782296), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
      assertEquals((-1793.405263), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.add(0.0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2803.1872629675245), (-2803.1872629675245));
      Complex complex1 = complex0.add(0.0);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals((-2803.1872629675245), complex1.getReal(), 0.01);
      assertEquals((-2803.1872629675245), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Complex complex0 = Complex.valueOf(688.222);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.acos();
      assertEquals(3.890334358250787E298, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
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
  public void test_0697()  throws Throwable  {
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
  public void test_0698()  throws Throwable  {
      Complex complex0 = Complex.NaN;
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
  public void test_0699()  throws Throwable  {
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
  public void test_0700()  throws Throwable  {
      Complex complex0 = new Complex((-869.7951349415346), 219.510751911);
      Complex complex1 = complex0.sqrt();
      assertEquals(29.7225652457433, complex1.getImaginary(), 0.01);
      assertEquals(3.6926616208275815, complex1.getReal(), 0.01);
      assertEquals(219.510751911, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.NaN.log();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      complex0.subtract(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      Complex complex0 = new Complex(0.2, 0.2);
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.asin();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(1078.5315);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1819.6933661625753));
      Complex complex1 = complex0.INF.sqrt1z();
      Complex complex2 = complex1.subtract(complex0);
      complex2.multiply(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1819.6933661625753), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.atan();
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-3087.01));
      Complex complex1 = complex0.NaN.add(complex0);
      Complex complex2 = complex0.add(complex1);
      assertSame(complex2, complex1);
      assertEquals((-3087.01), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.ONE.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Complex complex0 = new Complex(3181.999131);
      Complex complex1 = complex0.sqrt1z();
      double double0 = complex1.abs();
      assertEquals(3181.998973866075, complex1.getImaginary(), 0.01);
      assertEquals(3181.998973866075, double0, 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      double double0 = complex1.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      Complex complex0 = new Complex(1846.1562045957, 1846.1562045957);
      double double0 = complex0.getReal();
      assertEquals(1846.1562045957, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1846.1562045957, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 3542.7);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(14);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(24);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1431655765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,431,655,765
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.sqrt();
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      Complex complex0 = new Complex((-2421.47388), 240.60438757734);
      Complex complex1 = complex0.NaN.sinh();
      assertEquals(240.60438757734, complex0.getImaginary(), 0.01);
      assertEquals((-2421.47388), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.exp();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Complex complex0 = new Complex(0.13333332538604736, 0.13333332538604736);
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.13333332538604736, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.13333332538604736, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.13333332538604736, Double.NaN);
      complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      Complex complex2 = complex1.atan();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1808.0792996173));
      Complex complex1 = complex0.multiply(0.0);
      Complex complex2 = complex1.pow((-1.4674011002723395));
      Complex complex3 = complex2.multiply((-1808.0792996173));
      assertNotSame(complex3, complex2);
      assertTrue(complex3.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1808.0792996173), complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(1.4639795872058685, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(1.4639795872058685, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      Complex complex0 = new Complex((-147.654074), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals((-147.654074), complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1808.0792996173));
      complex0.hashCode();
      assertEquals((-1808.0792996173), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.2);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex1.isInfinite());
      assertEquals(5.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      Complex complex0 = new Complex(0.2, 0.2);
      Complex complex1 = complex0.subtract(0.2);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.2, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.2, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(0.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide((-3334.3286269581));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.I.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.divide(complex0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.conjugate();
      Complex complex2 = complex0.subtract(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.add((-3.940510424527919E-20));
      assertFalse(complex1.isInfinite());
      assertEquals((-3.940510424527919E-20), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add((-768.826764511948));
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.acos();
      Complex complex2 = complex1.sin();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract((-2436.9531041092));
      Complex complex2 = complex1.asin();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals((-8.49165094861637), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.NaN.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt1z();
      complex1.asin();
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
  }
@Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      Complex complex0 = new Complex((-223.1626526265), (-2671.0740574));
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
  public void test_0783()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertEquals(1.0547686614863E-154, complex1.getReal(), 0.01);
      assertEquals((-1.0547686614862998E-154), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.subtract(0.0);
      Complex complex2 = complex1.sinh();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      Complex complex0 = new Complex(32.04023191189382);
      Complex complex1 = Complex.valueOf(32.04023191189382, 473.7545477826);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(32.04023191189382, complex1.getReal(), 0.01);
      assertEquals(473.7545477826, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-979.0));
      Complex complex1 = complex0.add((-1313.957082));
      Complex complex2 = (Complex)complex0.readResolve();
      boolean boolean0 = complex1.equals(complex2);
      assertTrue(complex2.equals((Object)complex0));
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals((-979.0), complex1.getImaginary(), 0.01);
      assertEquals((-1313.957082), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      Complex complex0 = new Complex((-186.5706));
      Complex complex1 = complex0.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-186.5706), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.041666666666666664, (-2.2250738585072014E-308));
      Complex complex1 = complex0.tanh();
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.2212153497001895E-308), complex1.getImaginary(), 0.01);
      assertEquals(0.04164257074548596, complex1.getReal(), 0.01);
      assertEquals(0.041666666666666664, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.tan();
      assertEquals(1.3132701117508359, complex2.getImaginary(), 0.01);
      assertEquals(0.6129781483738451, complex1.getImaginary(), 0.01);
      assertEquals((-0.6300345794400924), complex2.getReal(), 0.01);
      assertEquals(8.275712938738128, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2332.2462941);
      Complex complex1 = new Complex(0.0, (-487.66809333603294));
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex2.acos();
      Complex complex4 = complex3.tan();
      assertEquals((-1.119660371004167), complex4.getImaginary(), 0.01);
      assertEquals(0.4458924871138561, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.subtract(0.0);
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Complex complex0 = new Complex((-346.8671308536));
      Complex complex1 = complex0.subtract(2.0);
      assertEquals((-348.8671308536), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.subtract(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3170.1), (-3170.1));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-3170.1), complex0.getReal(), 0.01);
      assertEquals((-3170.1), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2849.561836757367));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2849.561836757367), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = complex0.sinh();
      assertEquals((-2.2250738585072014E-308), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Complex complex0 = Complex.valueOf(193.967211);
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(193.967211, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.7253436837128683), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Complex complex0 = Complex.valueOf(996.504179331, 996.504179331);
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals(996.504179331, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(996.504179331, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = complex0.I.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Complex complex0 = new Complex(2129.882125, 2129.882125);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Complex complex0 = new Complex((-2.2250738585072014E-308));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-6.990275687580919E-308), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      Complex complex0 = new Complex((-3086.82666713206), 614804.4493492183);
      Complex complex1 = complex0.pow(1053.291226082);
      assertEquals((-3086.82666713206), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(614804.4493492183, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2216.715861639793, 2216.715861639793);
      Complex complex1 = complex0.divide(4507.51);
      Complex complex2 = complex1.pow(4507.51);
      assertEquals(0.4917827939682425, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals(0.4917827939682425, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Complex complex0 = new Complex((-3086.82666713206), 614804.4493492183);
      Complex complex1 = complex0.I.log();
      Complex complex2 = complex1.pow(1053.291226082);
      assertEquals((-1.6460444523108664E206), complex2.getReal(), 0.01);
      assertEquals(3.34367957478494E206, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.negate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-979.0));
      Complex complex1 = complex0.multiply(complex0);
      assertEquals((-979.0), complex0.getImaginary(), 0.01);
      assertEquals((-958441.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2849.561836757367));
      Complex complex1 = complex0.I.multiply(complex0);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2849.561836757367), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.2250738585072014E-308), 6821.1598533973665);
      Complex complex1 = complex0.multiply(0.039661961793296285);
      assertEquals((-8.8250794363375E-310), complex1.getReal(), 0.01);
      assertEquals(6821.1598533973665, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(270.54058149141287, complex1.getImaginary(), 0.01);
      assertEquals((-2.2250738585072014E-308), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Complex complex0 = new Complex(2129.882125, 2129.882125);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.multiply(2129.882125);
      assertEquals(1672.8055679167483, complex2.getReal(), 0.01);
      assertEquals((-18537.519994571372), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.log();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-3.141592653589793), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = complex0.tan();
      boolean boolean0 = complex1.isNaN();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(3212.3067350650854, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(boolean0);
      assertEquals(2259.411465805518, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.cos();
      double double0 = complex1.getReal();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1172.5460602, 2730.829);
      Complex complex2 = complex0.ZERO.subtract(complex1);
      double double0 = complex2.getReal();
      assertFalse(complex2.isInfinite());
      assertEquals(2730.829, complex1.getImaginary(), 0.01);
      assertEquals((-1172.5460602), double0, 0.01);
      assertEquals((-2730.829), complex2.getImaginary(), 0.01);
      assertEquals(1172.5460602, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Complex complex0 = new Complex(2133.9307611893596, 0.0);
      double double0 = complex0.ONE.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(2133.9307611893596, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      double double0 = complex1.getArgument();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2849.561836757367));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = complex0.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(2259.411465805518, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = new Complex(3410.58);
      Complex complex2 = complex1.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ONE.createComplex((-3085.07), 0.0);
      Complex complex2 = Complex.valueOf(14.0);
      Complex complex3 = complex1.divide(complex2);
      assertEquals((-220.36214285714286), complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals((-3085.07), complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(0.625, 0.625);
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(0.625, complex1.getReal(), 0.01);
      assertEquals((-0.8), complex2.getImaginary(), 0.01);
      assertEquals(0.8, complex2.getReal(), 0.01);
      assertEquals(0.625, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(2.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2332.2462941);
      Complex complex1 = new Complex(0.0, (-487.66809333603294));
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex2.divide((-1238.0300370663));
      assertEquals((-5.866010569111844E-4), complex3.getImaginary(), 0.01);
      assertEquals((-5.55279010708826E-4), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      Complex complex0 = new Complex(528.2);
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 2601.27);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(2601.27, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(0.0, 1100.0804987);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1100.0804987, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(1448.0984184, 3.209194263454614);
      Complex complex2 = complex1.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(3.209194263454614, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.cosh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008336750013465571, (-1.0));
      Complex complex1 = complex0.cosh();
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(0.540321081860439, complex1.getReal(), 0.01);
      assertEquals((-0.007015214504475017), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = complex0.cos();
      assertEquals(2259.411465805518, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-711.1750314303868), 0.0);
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals((-711.1750314303868), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.2250738585072014E-308), (-2.2250738585072014E-308));
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertEquals((-2.2250738585072014E-308), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Complex complex0 = Complex.valueOf(262.988719236868, (-346.8671308536));
      Complex complex1 = complex0.atan();
      assertEquals((-0.0018306263603926891), complex1.getImaginary(), 0.01);
      assertEquals(1.569408372350727, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Complex complex0 = new Complex(8.0E298);
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(8.0E298, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      Complex complex0 = new Complex((-452.63), (-452.63));
      Complex complex1 = complex0.asin();
      assertEquals((-0.7853975532660958), complex1.getReal(), 0.01);
      assertEquals((-7.154795785537457), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(1.0, (-1671.03));
      Complex complex2 = complex1.asin();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(5.984331230228391E-4, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3105.32), (-3726.846593181305));
      Complex complex1 = complex0.I.add(complex0);
      assertEquals((-3105.32), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3105.32), complex0.getReal(), 0.01);
      assertEquals((-3725.846593181305), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(1.7029898543501842E-8);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.add(0.0);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1916.614076);
      Complex complex1 = complex0.ZERO.add((-4355.72332572));
      assertEquals((-4355.72332572), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1916.614076, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      Complex complex0 = Complex.valueOf(262.988719236868, (-346.8671308536));
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.acos();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(1.3557610276366015E150, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ONE.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
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
  public void test_0856()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0857()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(613566731);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
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
  public void test_0859()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      try { 
        complex0.ONE.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
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
  public void test_0861()  throws Throwable  {
      Complex complex0 = new Complex((-452.63), (-452.63));
      Complex complex1 = complex0.sqrt();
      assertEquals((-452.63), complex0.getImaginary(), 0.01);
      assertEquals((-23.374617480687615), complex1.getImaginary(), 0.01);
      assertEquals(9.682083575784038, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ZERO.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3170.1), (-3170.1));
      complex0.NaN.exp();
      assertEquals((-3170.1), complex0.getImaginary(), 0.01);
      assertEquals((-3170.1), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(0.28765547534768593);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1024.0);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(1024.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 1.0);
      Complex complex1 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      Complex complex0 = Complex.valueOf(318.891371, 318.891371);
      Complex complex1 = complex0.INF.multiply(complex0);
      assertEquals(318.891371, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(318.891371, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      Complex complex1 = Complex.ZERO;
      complex0.divide(complex1);
      assertEquals(2259.411465805518, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(3212.3067350650854, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.add(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.add(complex1);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      Complex complex0 = new Complex(32.04023191189382);
      double double0 = complex0.abs();
      assertEquals(32.04023191189382, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(32.04023191189382, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3212.3067350650854, 2259.411465805518);
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(3212.3067350650854, complex0.getReal(), 0.01);
      assertEquals(2259.411465805518, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      Complex complex0 = Complex.valueOf(193.967211);
      Complex complex1 = complex0.INF.negate();
      double double0 = complex1.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(193.967211, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Complex complex0 = new Complex(2344.553309, Double.NaN);
      assertEquals(2344.553309, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      Complex complex0 = new Complex(1315.30423973, (-1825.8129071));
      double double0 = complex0.I.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals((-1825.8129071), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1315.30423973, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      Complex complex0 = new Complex((-452.63), (-452.63));
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertEquals((-452.63), complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals((-452.63), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1313.88, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(3123);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      Complex complex1 = complex0.NaN.sqrt();
      List<Complex> list0 = complex1.nthRoot(29);
      assertEquals(1, list0.size());
      assertFalse(list0.contains(complex0));
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-358));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -358
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.tanh();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      Complex complex1 = complex0.NaN.sqrt();
      Complex complex2 = complex1.sinh();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      Complex complex1 = complex0.NaN.sqrt();
      Complex complex2 = complex1.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      Complex complex1 = complex0.NaN.sqrt();
      Complex complex2 = complex1.negate();
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      Complex complex0 = new Complex(528.2);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(528.2, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.INF.exp();
      Complex complex2 = complex1.multiply(1.0);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isNaN());
      assertNotSame(complex2, complex1);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      Complex complex0 = Complex.valueOf(996.504179331, 996.504179331);
      complex0.NaN.hashCode();
      assertFalse(complex0.isNaN());
      assertEquals(996.504179331, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(996.504179331, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      complex0.INF.hashCode();
      assertFalse(complex0.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = complex0.multiply((-2.2250738585072014E-308));
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      Complex complex2 = (Complex)complex1.readResolve();
      boolean boolean0 = complex0.equals(complex2);
      assertFalse(boolean0);
      assertFalse(complex2.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide((-1.456777090425021E-4));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(0.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      Complex complex2 = complex1.log();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      Complex complex0 = new Complex(528.2);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(528.2, complex0.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.NaN.divide(complex0);
      Complex complex2 = complex1.divide((-2077.9842081296));
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      complex0.NaN.conjugate();
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.subtract(3157.35604628);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex2.equals((Object)complex1));
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = complex0.NaN.add((-2.2250738585072014E-308));
      Complex complex2 = complex1.multiply(complex1);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      double double0 = complex0.ZERO.abs();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      Complex complex0 = Complex.valueOf(5342.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(5342.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.createComplex((-2077.9842081296), Double.NaN);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2077.9842081296), complex1.getReal(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      List<Complex> list0 = complex0.nthRoot(29);
      assertEquals(29, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertFalse(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      Complex complex1 = complex0.I.pow(1255.787);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.3283721273697793), complex1.getImaginary(), 0.01);
      assertEquals(0.94454843495008, complex1.getReal(), 0.01);
      assertEquals(1255.787, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      String string0 = complex0.toString();
      assertEquals("(1255.787, 0.0)", string0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1255.787);
      complex0.NaN.sqrt1z();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1255.787, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.2250738585072014E-308));
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-2.2250738585072014E-308), complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }
}
