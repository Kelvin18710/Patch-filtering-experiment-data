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
import org.apache.commons.math.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0001()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2352912915503111E-4, (-1.0));
      Complex complex1 = complex0.divide(complex0);
      assertEquals(1.2352912915503111E-4, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1102.0);
      Complex complex1 = complex0.ZERO.tanh();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1102.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-0.761594155955765), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2352912915503111E-4, (-1.0));
      Complex complex1 = complex0.tanh();
      assertEquals((-1.5574076432468391), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(1.2352912915503111E-4, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(4.231513390253705E-4, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.3526624085705803), (-1.3526624085705803));
      Complex complex1 = complex0.tan();
      assertEquals((-1.1270663698529797), complex1.getImaginary(), 0.01);
      assertEquals((-1.3526624085705803), complex0.getImaginary(), 0.01);
      assertEquals((-0.0639595129725269), complex1.getReal(), 0.01);
      assertEquals((-1.3526624085705803), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.tan();
      Complex complex2 = complex1.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract((-3763.882691472896));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(3764.882691472896, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.ZERO.createComplex((-1.0), (-1.0));
      Complex complex2 = complex1.subtract((-1.0));
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 606.3205);
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(606.3205, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Complex complex0 = new Complex(942.9338582664, 1711.0);
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(942.9338582664, complex0.getReal(), 0.01);
      assertEquals(1711.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Complex complex0 = new Complex(0.1818181574344635, 0.1818181574344635);
      Complex complex1 = complex0.I.sqrt();
      Complex complex2 = complex1.divide(0.1818181574344635);
      Complex complex3 = complex2.sinh();
      assertEquals((-16.61670254038813), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-17.911617447164787), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Complex complex0 = Complex.valueOf(732.33061901, (-3017.66));
      Complex complex1 = complex0.sin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-3017.66), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(732.33061901, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2352912915503111E-4, (-1.0));
      Complex complex1 = complex0.sin();
      assertEquals(1.9061540654993875E-4, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.175201184677342), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(1.2352912915503111E-4, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = Complex.valueOf((-1291.703), 8.0E298);
      Complex complex3 = complex1.pow(complex2);
      assertTrue(complex3.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.20787957635076193, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.3526624085705803), (-1.3526624085705803));
      Complex complex1 = complex0.pow(complex0);
      assertEquals((-0.01156465942148427), complex1.getReal(), 0.01);
      assertEquals(0.012692484054794246, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 3154.93290023925);
      Complex complex1 = complex0.pow(3154.93290023925);
      assertEquals(3154.93290023925, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-2219.04143355));
      Complex complex1 = complex0.pow((-2219.04143355));
      assertEquals((-2219.04143355), complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.pow(1547.0516);
      assertEquals((-0.9967169961898706), complex1.getImaginary(), 0.01);
      assertEquals(0.08096437183256239, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.negate();
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-869.7));
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex1.I.multiply(complex2);
      assertEquals((-869.7), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(-0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), (-1.0));
      Complex complex1 = complex0.multiply(6.283185307179586);
      assertEquals((-6.283185307179586), complex1.getImaginary(), 0.01);
      assertEquals((-6.283185307179586), complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.045712456144603224), complex3.getReal(), 0.01);
      assertEquals((-1.162151901852981E-16), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      double double0 = complex1.getReal();
      assertEquals(1.4142135623730951, double0, 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Complex complex0 = new Complex((-1.7168146928204135));
      double double0 = complex0.getReal();
      assertEquals((-1.7168146928204135), double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2352912915503111E-4, (-1.0));
      double double0 = complex0.getImaginary();
      assertEquals(1.2352912915503111E-4, complex0.getReal(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1035.106410162707), (-1035.106410162707));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1035.106410162707), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(0.36787944117144233, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.pow(complex1);
      Complex complex4 = complex3.tan();
      Complex complex5 = complex4.divide(complex0);
      assertTrue(complex5.equals((Object)complex4));
      assertEquals((-0.4684736472678565), complex5.getReal(), 0.01);
      assertEquals(1.1846213034200639, complex5.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.sqrt();
      assertEquals((-0.8408964152537145), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(0.333333333333333);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2352912915503111E-4, (-1.0));
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.divide(713.7527941959418);
      assertEquals((-1.2352912915503111E-4), complex1.getReal(), 0.01);
      assertEquals(0.0014010453032643074, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.7306990621898637E-7), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(Double.NaN, 0.875);
      assertTrue(complex1.isNaN());
      assertEquals(0.875, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(0.0, 0.2);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.2, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.createComplex(1.625, 0.0);
      assertEquals(1.625, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex((-2682.400849465117), (-4221.2707994155));
      Complex complex2 = complex1.pow(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(2.356194490192345, 2.356194490192345);
      Complex complex2 = complex1.cosh();
      assertEquals((-3.7637541395008345), complex2.getReal(), 0.01);
      assertEquals(3.696734399792561, complex2.getImaginary(), 0.01);
      assertEquals(2.356194490192345, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Complex complex0 = new Complex(3930.949736348, 3930.949736348);
      Complex complex1 = complex0.cos();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(3930.949736348, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(1372.575614);
      Complex complex2 = complex1.cos();
      assertEquals((-0.5039473057272508), complex2.getImaginary(), 0.01);
      assertEquals(1.0797148360976152, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.7859136624251081, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-869.7));
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.conjugate();
      assertEquals((-869.7), complex3.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.conjugate();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 3154.93290023925);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.cosh();
      assertEquals(2.5091783526143026, complex2.getReal(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-7.294288067637793E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Complex complex0 = new Complex((-1.5707963267948966), 606.3205);
      Complex complex1 = complex0.I.asin();
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(606.3205, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), (-1.0));
      Complex complex1 = complex0.asin();
      assertEquals((-1.0612750619050357), complex1.getImaginary(), 0.01);
      assertEquals((-0.6662394324925153), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-2.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex1.add(complex2);
      assertEquals((-1.1102230246251565E-16), complex3.getImaginary(), 0.01);
      assertEquals(2.3695301804976046, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.add(1.161262645315048);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 3154.93290023925);
      Complex complex1 = complex0.ZERO.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(3154.93290023925, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add((-1592.562629766574));
      assertEquals((-1592.562629766574), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Complex complex0 = new Complex((-2244.70324), (-2331.0));
      Complex complex1 = complex0.add((-168.922));
      assertEquals((-2331.0), complex0.getImaginary(), 0.01);
      assertEquals((-2413.62524), complex1.getReal(), 0.01);
      assertEquals((-2331.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Complex complex0 = new Complex((-1.5707963267948966), 606.3205);
      Complex complex1 = complex0.ONE.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
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
  public void test_0070()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2177.466, (-1761.310380612));
      // Undeclared exception!
      complex0.nthRoot(2145699109);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0072()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0073()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), (-1.0));
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
  public void test_0074()  throws Throwable  {
      Complex complex0 = new Complex((-1170.1774711176142), (-1170.1774711176142));
      Complex complex1 = complex0.sqrt();
      assertEquals((-37.58362889048632), complex1.getImaginary(), 0.01);
      assertEquals((-1170.1774711176142), complex0.getImaginary(), 0.01);
      assertEquals(15.567648809636708, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.log();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2177.466, 2177.466);
      Complex complex1 = complex0.exp();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2177.466, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-472.28));
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.multiply(Double.NaN);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.multiply(complex0);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.add(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Complex complex0 = new Complex((-1.7168146928204135));
      Complex complex1 = complex0.NaN.divide(2.0);
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex1);
      assertEquals((-1.7168146928204135), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      double double0 = complex1.abs();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
      assertEquals(1.4142135623730951, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 9.596689413740465E-4);
      assertEquals(9.596689413740465E-4, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.INF.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals(0.7853981633974483, double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.17506080569750193, 0.0875862700108075);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0875862700108075, double0, 0.01);
      assertEquals(0.17506080569750193, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.7553817452272217E-6, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      complex0.nthRoot(1);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sinh();
      List<Complex> list0 = complex1.nthRoot(1);
      assertTrue(list0.contains(complex1));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Complex complex0 = new Complex(0.1818181574344635, 0.1818181574344635);
      // Undeclared exception!
      try { 
        complex0.nthRoot((-257));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -257
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-2379.95));
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.sin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.cosh();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Complex complex0 = new Complex(2958.503488, 0.4342944622039795);
      Complex complex1 = complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.4342944622039795, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      complex1.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      complex1.asin();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.11111095942313305, 2177.466);
      complex0.NaN.subtract(2350.173);
      assertEquals(0.11111095942313305, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(2177.466, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(2.0);
      Complex complex2 = complex1.subtract(complex0);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.NaN.negate();
      assertFalse(complex0.isNaN());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(0.7853981633974483);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(6.283185307179586);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-2703.8606161196967));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2177.466);
      Complex complex1 = new Complex(2177.466, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(2177.466, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY, 1.0);
      Complex complex2 = complex0.pow(complex1);
      assertFalse(complex2.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.17506080569750193, 0.0875862700108075);
      Complex complex1 = new Complex(0.0, 0.17506080569750193);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0875862700108075, complex0.getImaginary(), 0.01);
      assertEquals(0.17506080569750193, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Complex complex0 = new Complex((-2244.70324));
      Complex complex1 = new Complex((-2244.70324), (-2331.0));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-2244.70324), complex1.getReal(), 0.01);
      assertEquals((-2331.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Complex complex0 = new Complex((-1.5707963267948966), 606.3205);
      Complex complex1 = complex0.divide((-1.5707963267948966));
      assertEquals((-385.99561869179814), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(606.3205, complex0.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.NaN);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Complex complex0 = Complex.valueOf(906.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(906.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.conjugate();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.conjugate();
      double double0 = complex1.getArgument();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-1.5707963267948966), double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(0.0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.log();
      List<Complex> list0 = complex1.nthRoot(3584);
      assertEquals(3.141592653589793, complex1.getImaginary(), 0.01);
      assertEquals(3584, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.atan();
      complex0.divide(complex1);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Complex complex0 = new Complex(0.2857142686843872, Double.NaN);
      assertEquals(0.2857142686843872, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      boolean boolean0 = complex0.isNaN();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.ZERO.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Complex complex0 = new Complex((-2062.304552553375), (-2062.304552553375));
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
  public void test_0151()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.INF.toString();
      assertEquals("(Infinity, Infinity)", string0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }
@Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0154()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Complex complex0 = new Complex(0.19999954120254515);
      Complex complex1 = complex0.INF.exp();
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(0.19999954120254515, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.divide((-1.0));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.1102230246251565E-16), complex2.getImaginary(), 0.01);
      assertEquals(0.4953672892186734, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.718281828459045, Double.POSITIVE_INFINITY);
      assertEquals(2.718281828459045, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1623728.4124063095));
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex1.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1623728.4124063095), complex0.getReal(), 0.01);
      assertEquals((-0.761594155955765), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2463.098334859));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tan();
      assertEquals((-2.018586435098241E-23), complex2.getReal(), 0.01);
      assertEquals((-0.9999999175849511), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.INF.subtract(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(2821.131, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.subtract(complex0);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-24.563962463182424));
      Complex complex1 = complex0.INF.add((-24.563962463182424));
      Complex complex2 = complex1.subtract((-2052.6989666319027));
      assertFalse(complex0.isInfinite());
      assertEquals((-24.563962463182424), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.subtract(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1730.418452977);
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.subtract((-669.459074708));
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(1730.418452977, complex0.getReal(), 0.01);
      assertEquals(669.459074708, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1839.052144603), (-704.47));
      Complex complex1 = complex0.sqrt1z();
      assertEquals((-704.47), complex0.getImaginary(), 0.01);
      assertEquals((-1839.051907513404), complex1.getImaginary(), 0.01);
      assertEquals(704.4700908198986, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1730.418452977);
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals(1730.418452977, complex0.getReal(), 0.01);
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1839.052144603), (-704.47));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-704.47), complex0.getImaginary(), 0.01);
      assertEquals((-1839.052144603), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1332.395052464, 1332.395052464);
      Complex complex1 = complex0.sin();
      assertFalse(complex0.isInfinite());
      assertEquals(1332.395052464, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1332.395052464, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Complex complex0 = new Complex(141.2417689789036, 141.2417689789036);
      Complex complex1 = complex0.sin();
      assertEquals(1.4186635360435845E60, complex1.getReal(), 0.01);
      assertEquals((-1.085966342856079E61), complex1.getImaginary(), 0.01);
      assertEquals(141.2417689789036, complex0.getImaginary(), 0.01);
      assertEquals(141.2417689789036, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1332.395052464, 1332.395052464);
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Complex complex0 = new Complex((-992.9563));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.pow(1615.660621652678);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(1.0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Complex complex0 = new Complex(9.313225746154785E-10);
      Complex complex1 = complex0.I.pow(2958.0);
      assertFalse(complex1.isInfinite());
      assertEquals((-8.532826431614403E-14), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1839.052144603));
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1839.052144603), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.multiply(8.644035376593028);
      Complex complex2 = complex1.atan();
      assertEquals(0.11620698708638968, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-509.566), (-0.22930563435331064));
      Complex complex1 = complex0.multiply(3792.015713090028);
      assertEquals((-1932282.278856433), complex1.getReal(), 0.01);
      assertEquals((-869.5305685678304), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.22930563435331064), complex0.getImaginary(), 0.01);
      assertEquals((-509.566), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      boolean boolean0 = complex1.isNaN();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Complex complex0 = new Complex(14.0, (-2792.0));
      Complex complex1 = complex0.conjugate();
      double double0 = complex1.getImaginary();
      assertEquals(2792.0, double0, 0.01);
      assertEquals(14.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2792.0), complex0.getImaginary(), 0.01);
      assertEquals(14.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.INF.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Complex complex0 = new Complex((-796.55777), (-796.55777));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(4.137037375380325E14, 0.3333333333332802);
      Complex complex2 = complex1.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.3333333333332802, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2625.4), (-2625.4));
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.exp();
      assertEquals((-2625.400000000001), complex2.getImaginary(), 0.01);
      assertEquals((-2625.4000000000005), complex2.getReal(), 0.01);
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex0.ONE.cosh();
      Complex complex3 = complex2.divide(complex1);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex2.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract((-217.3749));
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-217.3749), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1332.395052464, 1332.395052464);
      Complex complex1 = complex0.INF.divide(1332.395052464);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(1332.395052464, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1332.395052464, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Complex complex0 = new Complex((-2463.098334859), (-2463.098334859));
      Complex complex1 = complex0.divide(645.4398967541036);
      assertFalse(complex1.isInfinite());
      assertEquals((-2463.098334859), complex0.getImaginary(), 0.01);
      assertEquals((-3.816154451012157), complex1.getImaginary(), 0.01);
      assertEquals((-3.816154451012157), complex1.getReal(), 0.01);
      assertEquals((-2463.098334859), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(Double.NaN, Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.createComplex(1.3245471311735498E-8, Double.POSITIVE_INFINITY);
      assertEquals(1.3245471311735498E-8, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.createComplex((-943.260423), (-943.260423));
      Complex complex2 = complex1.exp();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-943.260423), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Complex complex0 = new Complex((-2463.098334859), (-2463.098334859));
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2463.098334859), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Complex complex0 = new Complex(14.0, (-2792.0));
      Complex complex1 = complex0.cosh();
      assertEquals((-385031.5536088922), complex1.getReal(), 0.01);
      assertEquals((-2792.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-461860.3347315091), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1332.395052464, 1332.395052464);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex2.cos();
      assertTrue(complex3.isInfinite());
      assertEquals(12018.00652123183, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Complex complex0 = new Complex((-1631.7395660151435), (-1631.7395660151435));
      Complex complex1 = complex0.atan();
      assertEquals((-1.5704899053280696), complex1.getReal(), 0.01);
      assertEquals((-3.064214284654642E-4), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7976931348623157E308);
      Complex complex1 = complex0.asin();
      assertFalse(complex0.isInfinite());
      assertEquals(1.7976931348623157E308, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Complex complex0 = new Complex((-2463.098334859), (-2463.098334859));
      Complex complex1 = complex0.asin();
      assertEquals((-0.7853981427936869), complex1.getReal(), 0.01);
      assertEquals((-8.848896092994583), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1332.395052464, 1332.395052464);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex0.add(complex1);
      assertTrue(complex2.equals((Object)complex1));
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.subtract(2399.72530780003);
      Complex complex2 = complex1.add(complex1);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.0, complex2.getImaginary(), 0.01);
      assertEquals((-2399.72530780003), complex1.getReal(), 0.01);
      assertEquals((-4799.45061560006), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(1.4255188208147591, 8.346173547264663E265);
      Complex complex2 = complex1.tanh();
      Complex complex3 = complex0.add(complex2);
      assertEquals((-0.1152665297115117), complex2.getImaginary(), 0.01);
      assertEquals(1.9940756895408902, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-0.1152665297115117), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1839.052144603), (-704.47));
      Complex complex1 = complex0.add((-704.47));
      assertEquals((-704.47), complex0.getImaginary(), 0.01);
      assertEquals((-2543.522144603), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-704.47), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-587.9672183868));
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.acos();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
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
  public void test_0221()  throws Throwable  {
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
  public void test_0222()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(217944);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0224()  throws Throwable  {
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
  public void test_0225()  throws Throwable  {
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
  public void test_0226()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1623728.4124063095));
      Complex complex1 = complex0.sqrt();
      assertEquals(1274.2560230998752, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1123.0627, 0.0);
      Complex complex1 = complex0.INF.divide(complex0);
      Complex complex2 = complex1.log();
      assertEquals(1123.0627, complex0.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.subtract(complex0);
      Complex complex2 = complex1.conjugate();
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-412.13));
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-412.13), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-3382112.790568894));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7937005259840998, 0.0);
      Complex complex1 = complex0.INF.multiply(complex0);
      assertEquals(0.7937005259840998, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      complex0.ONE.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex0.I.add(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.add(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Complex complex0 = new Complex((-6.663542893624021E-14), (-3034.9685));
      double double0 = complex0.I.abs();
      assertFalse(complex0.isNaN());
      assertEquals((-6.663542893624021E-14), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-3034.9685), complex0.getImaginary(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-24.563962463182424));
      Complex complex1 = complex0.INF.add((-24.563962463182424));
      double double0 = complex1.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals((-24.563962463182424), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, (-1618.0));
      assertEquals((-1618.0), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Complex complex0 = new Complex(1330.0782385963705, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(1330.0782385963705, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1839.052144603));
      double double0 = complex0.ZERO.getArgument();
      assertFalse(complex0.isInfinite());
      assertEquals((-1839.052144603), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Complex complex0 = new Complex(14.0, (-2792.0));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2792.0), double0, 0.01);
      assertEquals(14.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1623728.4124063095));
      double double0 = complex0.getReal();
      assertEquals((-1623728.4124063095), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.6033824355191673E-8), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-796.55777));
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(95);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1623728.4124063095));
      List<Complex> list0 = complex0.NaN.nthRoot(3191);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(list0.contains(complex0));
      assertEquals((-1623728.4124063095), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2147483542));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,147,483,542
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7976931348623157E308);
      Complex complex1 = complex0.tanh();
      complex1.tanh();
      assertEquals(1.7976931348623157E308, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sinh();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2821.131, complex0.getReal(), 0.01);
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.INF.divide(complex0);
      complex1.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.atan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.ZERO.subtract(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(2821.131, complex0.getReal(), 0.01);
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract((-269.1057));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.INF.divide(complex0);
      complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(4.13703654392813E14);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(0.008336750013465571, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.ONE.pow(complex1);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(0.008336750013465571, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.sinh();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7976931348623157E308);
      complex0.NaN.hashCode();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1.7976931348623157E308, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.cos();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-24.563962463182424));
      Complex complex1 = complex0.INF.add((-24.563962463182424));
      Complex complex2 = complex1.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-24.563962463182424), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7976931348623157E308);
      Complex complex1 = complex0.NaN.divide(1.5707963267948966);
      assertEquals(1.7976931348623157E308, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Complex complex0 = new Complex(3191.834);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(3191.834, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.I.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.ONE.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(2821.131, complex0.getReal(), 0.01);
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add((-1.0E-6));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      Complex complex1 = complex0.I.multiply(complex0);
      Complex complex2 = complex1.pow(2821.131);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(2821.131, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-7.518954114491108E-19), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      List<Complex> list0 = complex0.nthRoot(2097);
      assertEquals(2821.131, complex0.getReal(), 0.01);
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertEquals(2097, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      complex0.NaN.getField();
      assertFalse(complex0.isNaN());
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertEquals(2821.131, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1623728.4124063095));
      Complex complex1 = complex0.pow(complex0);
      complex1.atan();
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2821.131, 7.518954114491108E-19);
      String string0 = complex0.NaN.toString();
      assertEquals(7.518954114491108E-19, complex0.getImaginary(), 0.01);
      assertEquals("(NaN, NaN)", string0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(2821.131, complex0.getReal(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0309()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.tanh();
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertFalse(boolean0);
      assertFalse(complex2.isInfinite());
      assertEquals(1.557407724654902, complex2.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7976931348623157E308), 2048.5850945410034);
      Complex complex1 = complex0.divide(2048.5850945410034);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.7976931348623157E308), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-8.77529149095512E304), complex1.getReal(), 0.01);
      assertEquals(2048.5850945410034, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7976931348623157E308), 2048.5850945410034);
      Complex complex1 = complex0.ONE.divide((-1.7976931348623157E308));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1.7976931348623157E308), complex0.getReal(), 0.01);
      assertEquals(2048.5850945410034, complex0.getImaginary(), 0.01);
      assertEquals((-5.562684646268003E-309), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.036, 0.036);
      Complex complex1 = complex0.atan();
      assertEquals(0.03596884771679852, complex1.getImaginary(), 0.01);
      assertEquals(0.036031055537681086, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(0.087);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.tanh();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals((-0.08678116153147496), complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2), 333.048310155415);
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.tanh();
      assertEquals((-4.3051286633090325E-17), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.808043575936883E-17), complex2.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract((-55.674));
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1418.08046));
      Complex complex1 = complex0.subtract(0.0);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.subtract(1368.16073);
      assertEquals((-1368.16073), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.sqrt1z();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1418.08046));
      Complex complex1 = complex0.sqrt();
      assertEquals((-1418.08046), complex0.getImaginary(), 0.01);
      assertEquals(26.627809335354645, complex1.getReal(), 0.01);
      assertEquals((-26.627809335354645), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 399.5077849875956);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.tan();
      assertEquals((-0.4448811371768727), complex2.getReal(), 0.01);
      assertEquals((-1.0166244879269206), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.774103620269052), complex1.getImaginary(), 0.01);
      assertEquals((-1.1160795966614758), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Complex complex0 = Complex.valueOf(330.84657339);
      Complex complex1 = complex0.sin();
      assertEquals((-0.8301322104945901), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(330.84657339, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = new Complex(0.0, 8.585163902527109);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.sin();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-2675.8348043887745), complex3.getImaginary(), 0.01);
      assertEquals((-8.585163902527109), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Complex complex0 = new Complex(661.0, (-2411.6477795));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-569.999632925469), (-569.999632925469));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.pow(complex1);
      assertEquals(1.2246467991473532E-16, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.pow(complex0);
      assertEquals((-0.9888977057628651), complex1.getImaginary(), 0.01);
      assertEquals(2.526039138719339, complex2.getReal(), 0.01);
      assertEquals((-1.776841277695923), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7976931348623157E308), 2048.5850945410034);
      Complex complex1 = complex0.pow(2812.11176);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-1.7976931348623157E308), complex0.getReal(), 0.01);
      assertEquals(2048.5850945410034, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2), 333.048310155415);
      Complex complex1 = complex0.pow((-232.677597));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(333.048310155415, complex0.getImaginary(), 0.01);
      assertEquals((-1230.2), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex1.pow(1.0);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals((-1.2246467991473532E-16), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1457.727237251);
      Complex complex1 = complex0.createComplex(1457.727237251, 1457.727237251);
      Complex complex2 = complex1.sin();
      Complex complex3 = complex2.negate();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
      assertEquals(1457.727237251, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.equals((Object)complex0));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2));
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.multiply(complex0);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals((-1230.2), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Complex complex0 = new Complex(661.0, (-2411.6477795));
      Complex complex1 = complex0.multiply((-1.0));
      assertEquals((-2411.6477795), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-661.0), complex1.getReal(), 0.01);
      assertEquals(2411.6477795, complex1.getImaginary(), 0.01);
      assertEquals(661.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 6.283185307179586);
      Complex complex1 = complex0.multiply((-1230.3750659898558));
      assertEquals(6.283185307179586, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-7730.674536947576), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.log();
      assertEquals(0.2573165113878535, complex2.getReal(), 0.01);
      assertEquals((-0.8703274249911193), complex2.getImaginary(), 0.01);
      assertEquals((-0.9888977057628651), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getReal();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Complex complex0 = new Complex((-80.41), (-4515.671));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertEquals((-4515.671), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-80.41), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Complex complex0 = new Complex((-2645.349));
      double double0 = complex0.getArgument();
      assertEquals(3.141592653589793, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Complex complex0 = new Complex(661.0, (-2411.6477795));
      double double0 = complex0.getArgument();
      assertEquals((-1.3032796259842727), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, (-0.25));
      Complex complex1 = complex0.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-0.25), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.729936));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-355.4508069863806), (-355.4508069863806));
      Complex complex1 = complex0.exp();
      assertEquals((-3.836704352496558E-155), complex1.getReal(), 0.01);
      assertEquals((-355.4508069863806), complex0.getImaginary(), 0.01);
      assertEquals(1.8573023531772991E-155, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.divide((-3086.03));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(Double.NaN, 6.283185307179586);
      assertEquals(6.283185307179586, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-355.4508069863806));
      Complex complex1 = complex0.createComplex((-355.4508069863806), 1177.3);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1177.3, complex1.getImaginary(), 0.01);
      assertEquals((-355.4508069863806), complex0.getReal(), 0.01);
      assertEquals((-355.4508069863806), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.createComplex(0.0, 0.0);
      Complex complex2 = complex1.negate();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.createComplex(Double.POSITIVE_INFINITY, (-4157.730902885537));
      assertTrue(complex1.isInfinite());
      assertEquals((-4157.730902885537), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1892.101), (-1892.101));
      Complex complex1 = complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1892.101), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1892.101), (-1892.101));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.cosh();
      assertEquals(3.89162616058456, complex2.getImaginary(), 0.01);
      assertEquals((-3.554268502938286), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Complex complex0 = new Complex(0.030589580535888672, 3.290731916715755E-7);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.cosh();
      assertEquals((-1.1820713961129868E-8), complex2.getImaginary(), 0.01);
      assertEquals((-1.0064641108103974E-8), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(1.5425310154646728, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2), 333.048310155415);
      Complex complex1 = new Complex(0.0, (-1418.08046));
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = Complex.I;
      Complex complex4 = complex2.divide(complex3);
      Complex complex5 = complex4.cos();
      assertFalse(complex4.isInfinite());
      assertEquals(1230.2, complex4.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex5.getImaginary(), 0.01);
      assertTrue(complex5.isInfinite());
      assertEquals(1751.128770155415, complex4.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex5.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 6.283185307179586);
      Complex complex1 = Complex.valueOf(6.283185307179586, (-1230.3750659898558));
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.cos();
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7791029171515579, complex3.getReal(), 0.01);
      assertEquals((-1.014406962056447), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7976931348623157E308), 2048.5850945410034);
      Complex complex1 = complex0.conjugate();
      assertEquals((-2048.5850945410034), complex1.getImaginary(), 0.01);
      assertEquals((-1.7976931348623157E308), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-1.7976931348623157E308), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.atan();
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(0.7524692671419272, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1480.0161296446));
      Complex complex1 = complex0.atan();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals((-6.756684147868617E-4), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Complex complex0 = new Complex((-80.41), (-4515.671));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(3.894215346332998E34, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.5034359355202403E34, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(1.2393345855018391E-8, 1.2393345855018391E-8);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.asin();
      assertEquals((-8.763418949977736E-9), complex3.getReal(), 0.01);
      assertEquals(0.8813735782561243, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1965.694262508325));
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-8.276748021416681), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2));
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.add(complex2);
      assertEquals((-0.005107450257827659), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-0.011567114350145126), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-615.9723895));
      assertEquals((-615.9723895), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1418.08046));
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.add(complex1);
      Complex complex3 = complex2.acos();
      assertEquals((-0.8813735870195429), complex3.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Complex complex0 = Complex.NaN;
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
  public void test_0376()  throws Throwable  {
      Complex complex0 = Complex.INF;
      try { 
        complex0.I.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(22188);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
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
  public void test_0379()  throws Throwable  {
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
  public void test_0380()  throws Throwable  {
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
  public void test_0381()  throws Throwable  {
      Complex complex0 = new Complex((-2178.89), 3.290731916715755E-7);
      Complex complex1 = complex0.sqrt();
      assertEquals(3.290731916715755E-7, complex0.getImaginary(), 0.01);
      assertEquals(3.5248842070158614E-9, complex1.getReal(), 0.01);
      assertEquals(46.67858181221876, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = complex0.ZERO.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sqrt();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2), 333.048310155415);
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertEquals(333.048310155415, complex0.getImaginary(), 0.01);
      assertEquals((-1230.2), complex0.getReal(), 0.01);
      assertEquals((-333.048310155415), complex1.getImaginary(), 0.01);
      assertEquals(1230.2, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(6.283185307179586);
      assertEquals(6.283185307179586, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Complex complex0 = new Complex((-2178.89), 3.290731916715755E-7);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.multiply(0.0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals((-2178.89), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(3.290731916715755E-7, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1230.2));
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1513392.04, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1892.101), (-1892.101));
      Complex complex1 = Complex.valueOf((-726.293763437669), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-726.293763437669), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.add(complex0);
      Complex complex3 = complex2.divide(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex3.isNaN());
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-355.4508069863806));
      Complex complex1 = complex0.NaN.exp();
      Complex complex2 = complex1.sinh();
      Complex complex3 = complex0.add(complex2);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex3, complex2);
      assertFalse(complex0.isNaN());
      assertEquals((-355.4508069863806), complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Complex complex0 = new Complex(0.6666666269302368);
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.add(complex0);
      assertEquals(0.6666666269302368, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-355.4508069863806));
      double double0 = complex0.abs();
      assertEquals(355.4508069863806, double0, 0.01);
      assertEquals((-355.4508069863806), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Complex complex0 = new Complex((-0.12502530217170715), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Complex complex0 = new Complex((-798.3458), Double.NaN);
      assertTrue(complex0.isNaN());
      assertEquals((-798.3458), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-718.468651409352));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals((-718.468651409352), double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Complex complex0 = Complex.valueOf(7.549789948768648E-8, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-377.11), Double.POSITIVE_INFINITY);
      List<Complex> list0 = complex0.nthRoot(175);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1, list0.size());
      assertTrue(complex0.isInfinite());
      assertEquals((-377.11), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(136);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, (-0.25));
      // Undeclared exception!
      try { 
        complex0.nthRoot((-779));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -779
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.tanh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.cosh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.atan();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(Double.NaN);
      Complex complex2 = complex1.log();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract((-377.11));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(378.11, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.subtract((-981.0012453));
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(880.90006);
      Complex complex2 = complex1.multiply((-1509.488));
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-377.11), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals((-377.11), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ZERO.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.divide(complex0);
      boolean boolean0 = complex1.equals(complex2);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertTrue(complex2.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(0.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.divide(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(1644.4956967899645);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.414213562373095);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(2.414213562373095, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(2650.177637523865);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Complex complex0 = new Complex((-2178.89), 3.290731916715755E-7);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.multiply(complex1);
      Complex complex3 = complex2.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2178.89), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(3.290731916715755E-7, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertNotSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Complex complex0 = Complex.valueOf(8.0E298);
      Complex complex1 = complex0.sqrt1z();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(8.0E298, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 945.9158503843872);
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.exp();
      assertEquals(945.9158503843872, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(259);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(259, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Complex complex0 = new Complex(8.0E298);
      Complex complex1 = complex0.acos();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(8.0E298, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Complex complex0 = Complex.INF;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }
@Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
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
  public void test_0464()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Complex complex0 = Complex.valueOf(10.0);
      Complex complex1 = complex0.divide((-1723.5509));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(10.0, complex0.getReal(), 0.01);
      assertEquals((-0.005801975444995561), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Complex complex0 = new Complex((-1207.888));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tanh();
      assertEquals((-4.800634069493237E-4), complex2.getImaginary(), 0.01);
      assertEquals(1.0037108923435283, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Complex complex0 = Complex.valueOf(853.7, 853.7);
      Complex complex1 = complex0.tan();
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(853.7, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(853.7, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Complex complex0 = new Complex((-0.16624882440418567), (-0.16624882440418567));
      Complex complex1 = complex0.tan();
      assertEquals((-0.16624882440418567), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.16624882440418567), complex0.getReal(), 0.01);
      assertEquals((-0.16311937692094433), complex1.getReal(), 0.01);
      assertEquals((-0.16924287644892863), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(2.0);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      Complex complex1 = complex0.ONE.cosh();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(1.1752011936438014, complex2.getImaginary(), 0.01);
      assertEquals(459.98268116236, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-762.85));
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-19.530104966435793), complex1.getImaginary(), 0.01);
      assertEquals((-762.85), complex0.getImaginary(), 0.01);
      assertEquals(19.530104966435793, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Complex complex0 = Complex.valueOf(853.7, 853.7);
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals(853.7, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(853.7, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Complex complex0 = Complex.valueOf(10.0);
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(10.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Complex complex0 = Complex.valueOf(858.463, 858.463);
      Complex complex1 = complex0.sin();
      assertEquals(858.463, complex0.getReal(), 0.01);
      assertEquals(858.463, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Complex complex0 = new Complex((-365.8), (-1648.74));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.42, 0.32763758128857656);
      Complex complex1 = complex0.pow(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      Complex complex1 = complex0.ONE.cosh();
      Complex complex2 = Complex.valueOf(0.8414709848078965, 0.8414709848078965);
      Complex complex3 = complex2.conjugate();
      Complex complex4 = complex1.pow(complex3);
      assertEquals((-0.5142164641511446), complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.3456299887404455, complex4.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Complex complex0 = new Complex((-1207.888));
      Complex complex1 = complex0.pow((-1207.888));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = Complex.valueOf(4.455505956692757, 2717.8272164933);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.pow(1814.7);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-2717.8272164933), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = complex0.pow(1814.7);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Complex complex0 = Complex.valueOf(731.0);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.pow(6.283185307179586);
      assertEquals((-3.7731030590879174E-15), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Complex complex0 = new Complex((-2778.0));
      Complex complex1 = complex0.ZERO.multiply(complex0);
      assertEquals((-2778.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 655.145);
      Complex complex1 = Complex.valueOf(2369.4819674297883);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex0.multiply(complex2);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-1552354.2635517886), complex3.getImaginary(), 0.01);
      assertEquals((-429214.971025), complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(19.769767970036693);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.multiply((-1.0));
      assertEquals((-637.68444), complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertEquals((-637.68444), complex1.getReal(), 0.01);
      assertEquals(637.68444, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.I.log();
      assertEquals(637.68444, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1803.1745611743913), (-1803.1745611743913));
      Complex complex1 = complex0.log();
      assertEquals(7.8438776258652565, complex1.getReal(), 0.01);
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
      assertEquals((-1803.1745611743913), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.pow(complex0);
      boolean boolean0 = complex1.isNaN();
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      Complex complex1 = complex0.ONE.cosh();
      Complex complex2 = complex1.subtract(1754.17751);
      double double0 = complex2.getReal();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(459.98268116236, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1752.6344293651848), double0, 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Complex complex0 = new Complex((-1207.888));
      Complex complex1 = complex0.INF.negate();
      double double0 = complex1.getImaginary();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Complex complex0 = new Complex((-2778.0));
      double double0 = complex0.ONE.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-2778.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333329196);
      Complex complex1 = complex0.atan();
      double double0 = complex1.getArgument();
      assertEquals(0.008333140440131781, complex1.getReal(), 0.01);
      assertEquals((-6.661492342541148E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Complex complex0 = new Complex((-2778.0));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.exp();
      assertEquals((-8.751460241862389E276), complex1.getReal(), 0.01);
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(5.1578285791245847E275, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.exp();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.5403023058681398, complex2.getReal(), 0.01);
      assertEquals((-0.8414709848078965), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Complex complex0 = new Complex(4.455505956692757);
      Complex complex1 = Complex.valueOf(4.455505956692757, 2717.8272164933);
      Complex complex2 = complex0.divide(complex1);
      assertEquals(4.455505956692757, complex1.getReal(), 0.01);
      assertEquals((-0.0016393588067195454), complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2.6875045198494763E-6, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.divide(0.99);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.42, 0.32763758128857656);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.divide(0.32763758128857656);
      assertEquals(0.32763758128857656, complex0.getImaginary(), 0.01);
      assertEquals((-4155.419879675219), complex1.getImaginary(), 0.01);
      assertEquals(1.0000000289561066, complex2.getReal(), 0.01);
      assertEquals((-12682.976914101953), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.createComplex(Double.NaN, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(0.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-249.9161779628248), (-249.9161779628248));
      assertFalse(complex1.isInfinite());
      assertEquals((-249.9161779628248), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-249.9161779628248), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertEquals((-4.3757301209311943E276), complex1.getReal(), 0.01);
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertEquals(2.5789142895622923E275, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Complex complex0 = Complex.valueOf(459.98268116236, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals((-4.3757301209311943E276), complex1.getReal(), 0.01);
      assertEquals((-2.5789142895622923E275), complex1.getImaginary(), 0.01);
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(459.98268116236, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-459.98268116236), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 655.145);
      Complex complex1 = Complex.valueOf(2369.4819674297883);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.conjugate();
      assertFalse(complex3.equals((Object)complex2));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-2369.4819674297883), complex3.getReal(), 0.01);
      assertEquals((-2369.4819674297883), complex2.getReal(), 0.01);
      assertEquals((-655.145), complex3.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.42, 0.32763758128857656);
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(4155.42, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Complex complex0 = new Complex((-1139.35226));
      Complex complex1 = complex0.atan();
      assertEquals((-1.569918635339561), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Complex complex0 = Complex.valueOf(731.0);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.cosh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2.5060326757551032, complex2.getReal(), 0.01);
      assertEquals((-1.2755732736710692E-16), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.633123935319537E16, 1.633123935319537E16);
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Complex complex0 = new Complex((-0.16624882440418567), (-0.16624882440418567));
      Complex complex1 = complex0.asin();
      assertEquals((-0.1646803918715231), complex1.getReal(), 0.01);
      assertEquals((-0.16774115298618275), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 166.21273838095954);
      Complex complex1 = complex0.add(complex0);
      assertEquals(166.21273838095954, complex0.getImaginary(), 0.01);
      assertEquals(332.42547676191907, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals((-2.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Complex complex0 = new Complex(1.225743062930824E-8);
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(2.451486125861648E-8, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.225743062930824E-8, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.add(166.21273838095954);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Complex complex0 = new Complex(263, (-465.14432293888));
      Complex complex1 = complex0.add((-465.14432293888));
      assertFalse(complex1.isInfinite());
      assertEquals((-465.14432293888), complex1.getImaginary(), 0.01);
      assertEquals((-465.14432293888), complex0.getImaginary(), 0.01);
      assertEquals((-202.14432293888), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      Complex complex1 = complex0.ONE.sqrt();
      Complex complex2 = complex1.acos();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Complex complex0 = Complex.valueOf(7.94057237967);
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
  public void test_0535()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(683117645);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
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
  public void test_0537()  throws Throwable  {
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
  public void test_0538()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0539()  throws Throwable  {
      Complex complex0 = new Complex(1.4456468917292502E-16);
      Complex complex1 = complex0.ZERO.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1024.0, 0.0);
      Complex complex1 = complex0.cosh();
      complex1.sqrt();
      assertEquals(1024.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.log();
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.negate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Complex complex0 = Complex.valueOf(731.0);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(534361.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.INF.multiply(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.multiply(complex0);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex0.isNaN());
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertEquals(637.68444, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.divide(complex0);
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.42, 0.32763758128857656);
      double double0 = complex0.ZERO.abs();
      assertEquals(0.32763758128857656, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(4155.42, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333329196);
      double double0 = complex0.INF.abs();
      assertEquals(0.008333333333329196, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Complex complex0 = new Complex(3208.271644631, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(3208.271644631, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Complex complex0 = new Complex((-1207.888));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1207.888), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 459.98268116236);
      double double0 = complex0.getReal();
      assertEquals(459.98268116236, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1949030.2983098708));
      assertEquals((-1949030.2983098708), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2478.937714), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(7);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(263);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2887));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,887
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Complex complex0 = new Complex((-330.704));
      Complex complex1 = complex0.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-330.704), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(2.5789142895622923E275, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-4.3757301209311943E276), complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Complex complex0 = new Complex(247, 247);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.acos();
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(8.643635144431383E106, complex1.getReal(), 0.01);
      assertEquals((-208.63730134854353), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.exp();
      Complex complex2 = Complex.valueOf(0.0, (-762.85));
      Complex complex3 = complex1.add(complex2);
      assertEquals((-762.85), complex3.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.718281828459045, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.cos();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Complex complex0 = new Complex(263, (-465.14432293888));
      Complex complex1 = complex0.subtract((double) 263);
      assertEquals((-465.14432293888), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-465.14432293888), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.subtract(5.406257287177141E-5);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(1186.8244071637369);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.9755190146754057, 0.9755190146754057);
      complex0.multiply(Double.NaN);
      assertEquals(0.9755190146754057, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.9755190146754057, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(0.11111095942313305);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-1.0), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.sqrt();
      Complex complex3 = complex2.asin();
      assertTrue(complex3.isNaN());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.42, 4155.42);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(4155.42, complex0.getImaginary(), 0.01);
      assertEquals(4155.42, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.divide(0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4155.673874782813, 4155.673874782813);
      complex0.divide(Double.NaN);
      assertEquals(4155.673874782813, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(4155.673874782813, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(2.0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(354.2943615762);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.log();
      Complex complex2 = complex1.exp();
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Complex complex0 = new Complex((-19.915), Double.NaN);
      complex0.sqrt1z();
      assertEquals((-19.915), complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Complex complex0 = new Complex((-330.704));
      complex0.nthRoot(263);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      complex0.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertEquals(637.68444, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Complex complex0 = new Complex(1156.2282);
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
  public void test_0622()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.toString();
      assertEquals("(0.0, 1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Complex complex0 = Complex.valueOf(637.68444, 637.68444);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(637.68444, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(637.68444, complex1.getReal(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2704.0, 2704.0);
      List<Complex> list0 = complex0.nthRoot(4954);
      assertEquals(4954, list0.size());
      assertEquals(2704.0, complex0.getReal(), 0.01);
      assertEquals(2704.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.ZERO.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.subtract(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 0.0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.subtract(2.0);
      Complex complex2 = complex1.tanh();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.761594155955765), complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(1.58248530788145);
      Complex complex2 = complex1.tanh();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-85.54675964380442), complex2.getImaginary(), 0.01);
      assertEquals(1.58248530788145, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1157.302744));
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1157.302744), complex0.getReal(), 0.01);
      assertEquals((-2.5468371394727116), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.subtract(0.0);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.pow(843.0);
      Complex complex2 = complex1.subtract((-583.416046689));
      assertEquals((-1.2058323659630968E-13), complex2.getImaginary(), 0.01);
      assertEquals((-1.2058323659630968E-13), complex1.getImaginary(), 0.01);
      assertEquals(582.416046689, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.multiply(1.1921056801463227E-8);
      Complex complex2 = complex1.conjugate();
      Complex complex3 = complex2.sqrt();
      assertEquals(7.720445842522058E-5, complex3.getReal(), 0.01);
      assertEquals((-7.720445842522058E-5), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3952.032994, (-1462.538));
      Complex complex1 = complex0.sinh();
      assertEquals((-1462.538), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(3952.032994, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.1752011936438014), complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.tan();
      Complex complex3 = complex2.sqrt1z();
      Complex complex4 = complex3.sinh();
      assertEquals((-0.9974964827012336), complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(36.071404402473284, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1897.6082062756116), (-1097.777));
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals((-1097.777), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1897.6082062756116), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      Complex complex0 = new Complex((-396.532683), (-396.532683));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-273.88151789));
      Complex complex1 = Complex.valueOf((-0.0013888888689039883), 2.0);
      Complex complex2 = complex0.pow(complex1);
      assertEquals((-0.001806049090984557), complex2.getImaginary(), 0.01);
      assertEquals(4.142223480604533E-4, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      Complex complex0 = new Complex((-1390.0), 0.375);
      complex0.NaN.pow(0.375);
      assertEquals(0.375, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1390.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Complex complex0 = new Complex((-396.532683), (-396.532683));
      Complex complex1 = complex0.pow((-396.532683));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-396.532683), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2704.0, 2704.0);
      Complex complex1 = complex0.pow(515.6072075664217);
      assertEquals(2704.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2704.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-273.88151789));
      Complex complex1 = complex0.negate();
      Complex complex2 = Complex.valueOf((-0.0013888888689039883), 2.0);
      Complex complex3 = complex1.subtract(complex2);
      Complex complex4 = complex1.subtract((-0.0013888888689039883));
      Complex complex5 = complex3.pow(complex4);
      assertEquals((-2.0), complex3.getImaginary(), 0.01);
      assertEquals(273.8829067788689, complex4.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex5.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex5.getReal(), 0.01);
      assertEquals(-0.0, complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-273.88151789));
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.2071594690590597E121), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(4.407597410585024E118, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4564.9543));
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.multiply(complex0);
      assertEquals((-5.068117370221614E-13), complex3.getImaginary(), 0.01);
      assertEquals(3529.5359023180913, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-776.283));
      assertFalse(complex1.isInfinite());
      assertEquals((-776.283), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.multiply((-1.0));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      Complex complex0 = new Complex(7860.574383024778);
      Complex complex1 = complex0.log();
      assertEquals(8.969614959473988, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      Complex complex0 = new Complex((-1777.379073184228), (-1777.379073184228));
      Complex complex1 = complex0.log();
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
      assertEquals((-1777.379073184228), complex0.getImaginary(), 0.01);
      assertEquals(7.829468717679224, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      Complex complex0 = new Complex(3.141592653589793, 3.141592653589793);
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(3.141592653589793, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ZERO.acos();
      Complex complex2 = complex1.sinh();
      Complex complex3 = complex2.asin();
      double double0 = complex3.getImaginary();
      assertEquals((-1.4756716789398663), double0, 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.INF.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-273.88151789));
      Complex complex1 = complex0.conjugate();
      double double0 = complex1.getArgument();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-273.88151789), complex0.getReal(), 0.01);
      assertEquals((-3.141592653589793), double0, 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1913.60005991461, 3404.85);
      Complex complex1 = complex0.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(3404.85, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4564.9543));
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 1921.0);
      Complex complex2 = new Complex(0.6905817003766437, 1921.0);
      Complex complex3 = complex1.divide(complex2);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(0.6905817003766437, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals(1921.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex0));
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.divide(0.6299605249474366);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.createComplex(560.1202898537571, Double.NaN);
      assertTrue(complex1.isNaN());
      assertEquals(560.1202898537571, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      Complex complex0 = new Complex((-8.376096451439999));
      Complex complex1 = complex0.createComplex((-9.449227799253528E7), (-9.449227799253528E7));
      assertEquals((-9.449227799253528E7), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-9.449227799253528E7), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      Complex complex0 = Complex.valueOf(629.926709250785, 629.926709250785);
      Complex complex1 = complex0.cosh();
      assertEquals(1.8722348146999264E273, complex1.getImaginary(), 0.01);
      assertEquals(629.926709250785, complex0.getImaginary(), 0.01);
      assertEquals((-7.002088703518782E271), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1913.60005991461, 3404.85);
      Complex complex1 = complex0.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(3404.85, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2050.8298, 2050.8298);
      Complex complex1 = complex0.cos();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(2050.8298, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2294.271149747478), (-2294.271149747478));
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.I.add(complex1);
      Complex complex3 = complex2.negate();
      Complex complex4 = complex3.atan();
      assertFalse(complex3.isInfinite());
      assertEquals(-0.0, complex3.getReal(), 0.01);
      assertFalse(complex3.equals((Object)complex2));
      assertEquals((-2294.271149747478), complex0.getReal(), 0.01);
      assertEquals((-2294.271149747478), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(0.7617262217813369, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      Complex complex0 = new Complex((-1390.0), 0.375);
      Complex complex1 = complex0.divide((-1390.0));
      Complex complex2 = complex1.atan();
      assertEquals(0.7853981815933233, complex2.getReal(), 0.01);
      assertEquals((-1.3489208469460358E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex((-8.0E298), 1502.256054276);
      Complex complex2 = complex1.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-8.0E298), complex1.getReal(), 0.01);
      assertEquals(1502.256054276, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Complex complex0 = new Complex((-1742.8048));
      Complex complex1 = complex0.asin();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(8.156398146858399, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4564.9543));
      Complex complex1 = complex0.INF.negate();
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals((-4564.9543), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.add(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Complex complex0 = new Complex(3.141592653589793, 3.141592653589793);
      Complex complex1 = Complex.valueOf(3.141592653589793, (-941.811546116998));
      Complex complex2 = complex0.I.add(complex1);
      assertEquals(3.141592653589793, complex2.getReal(), 0.01);
      assertEquals((-940.811546116998), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(3.141592653589793, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tan();
      assertEquals((-1.414213562373095), complex2.getImaginary(), 0.01);
      assertEquals(6.123233995736767E-17, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.I.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
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
  public void test_0696()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(1073741824);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
      Complex complex0 = Complex.ONE;
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
  public void test_0699()  throws Throwable  {
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
  public void test_0700()  throws Throwable  {
      Complex complex0 = new Complex((-8.376096451439999));
      Complex complex1 = complex0.sqrt();
      assertEquals(2.894148657453518, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3952.032994, (-1462.538));
      complex0.NaN.exp();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1462.538), complex0.getImaginary(), 0.01);
      assertEquals(3952.032994, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      Complex complex0 = new Complex(625.35561408, 625.35561408);
      Complex complex1 = complex0.exp();
      assertEquals((-6.890415328167052E270), complex1.getImaginary(), 0.01);
      assertEquals((-3.815247944923952E271), complex1.getReal(), 0.01);
      assertEquals(625.35561408, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.tan();
      Complex complex2 = complex1.pow((-3375.932129275));
      Complex complex3 = complex0.multiply(complex2);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.multiply(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Complex complex0 = new Complex((-1390.0), 0.375);
      double double0 = complex0.getReal();
      assertEquals((-1390.0), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.375, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-850.1036251755), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.sqrt();
      List<Complex> list0 = complex2.nthRoot(28);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1, list0.size());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2037));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,037
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sqrt1z();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sinh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cos();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cos();
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Complex complex0 = new Complex(1.176342548272881E-8);
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Complex complex0 = new Complex((-13.559596245563364));
      complex0.NaN.subtract((-13.559596245563364));
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-13.559596245563364), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Complex complex0 = new Complex(7860.574383024778);
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.subtract(complex1);
      assertEquals(7860.574383024778, complex0.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(0.0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(7.299543898703458E-25);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.multiply((-300.655845441));
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(825.78478355, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.I.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(825.78478355, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.pow(complex1);
      assertFalse(complex2.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ZERO.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      boolean boolean0 = complex0.equals(complex1);
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
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(109);
      boolean boolean0 = complex0.equals(list0);
      assertEquals(1, list0.size());
      assertFalse(boolean0);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      Complex complex0 = new Complex(432.7916116326);
      Complex complex1 = Complex.valueOf(432.7916116326, 432.7916116326);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(432.7916116326, complex1.getReal(), 0.01);
      assertEquals(432.7916116326, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.divide(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide((-1.850652352248981));
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-0.5403500007901338), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(1.1921056801463227E-8);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex2.divide(complex0);
      assertNotSame(complex3, complex2);
      assertTrue(complex3.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.conjugate();
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.conjugate();
      Complex complex2 = complex1.add(0.4342944622039795);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add((-1.0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add((-2590.4));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex0);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.multiply(1.1921056801463227E-8);
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex0.divide(complex2);
      Complex complex4 = complex3.acos();
      assertEquals(5.1364858818432845E-9, complex3.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      Complex complex0 = new Complex(3539.597862057, Double.NaN);
      complex0.acos();
      assertEquals(3539.597862057, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.INF.atan();
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.toString();
      assertEquals("(0.0, 1.0)", string0);
  }
@Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      Complex complex0 = Complex.valueOf(750.0, (-2535.163409333492));
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
  public void test_0781()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.sqrt1z();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(2024.33964360918);
      assertEquals(4.939882510116274E-4, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.createComplex(1201.836, (-1319.55396203145));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-1319.55396203145), complex1.getImaginary(), 0.01);
      assertEquals(4.142204071527024E-4, complex2.getImaginary(), 0.01);
      assertEquals(3.772676310140246E-4, complex2.getReal(), 0.01);
      assertEquals(1201.836, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-447.36715723));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-447.36715723), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-133.15), 0.0);
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-133.15), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      Complex complex0 = new Complex(2024.33964360918);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tanh();
      assertEquals((-2.0587687964639665), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1618.08843114));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.tan();
      assertEquals(1.6031907406404362E-10, complex2.getReal(), 0.01);
      assertEquals((-1618.0884314078967), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.INF.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = Complex.valueOf(1.073741824E9, 804.0);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-804.0), complex2.getImaginary(), 0.01);
      assertEquals((-1.073741824E9), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(804.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = Complex.I;
      boolean boolean0 = complex1.equals(complex2);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      Complex complex0 = new Complex(2177.179144, 1216.0174861);
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1216.0174861, complex0.getImaginary(), 0.01);
      assertEquals(2177.179144, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.createComplex((-3120.79237), (-3120.79237));
      Complex complex2 = complex1.sin();
      assertEquals((-3120.79237), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3120.79237), complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertTrue(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.tanh();
      Complex complex2 = Complex.valueOf(2847.5893265722);
      Complex complex3 = complex1.pow(complex2);
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(complex0);
      Complex complex2 = Complex.valueOf((-3399.3088), (-2539.6995));
      Complex complex3 = complex1.atan();
      Complex complex4 = complex3.pow(complex2);
      assertEquals((-1.5707963267948966), complex3.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals(0.5493061443340549, complex3.getImaginary(), 0.01);
      assertTrue(complex4.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      Complex complex2 = Complex.valueOf((-3399.3088), (-2539.6995));
      Complex complex3 = complex2.add(complex0);
      Complex complex4 = complex1.pow(complex3);
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals((-2538.6995), complex3.getImaginary(), 0.01);
      assertTrue(complex4.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-754.71422689924));
      assertEquals(0.9009287790757046, complex1.getImaginary(), 0.01);
      assertEquals((-0.43396697458811334), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.073741824E9, 804.0);
      Complex complex1 = complex0.pow(1.073741824E9);
      assertEquals(804.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1920.1962732023612, 6.283185307179586);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex0.I.multiply(complex1);
      assertEquals(207.65776708112506, complex2.getReal(), 0.01);
      assertEquals((-169.0147287384286), complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.5000000000000003E-299);
      Complex complex1 = complex0.multiply((-316.62));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-7.915500000000001E-297), complex1.getReal(), 0.01);
      assertEquals(2.5000000000000003E-299, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-822.5836952484212));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-822.5836952484212), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1920.1962732023612, 6.283185307179586);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.log();
      assertEquals((-207.65776708112506), complex1.getImaginary(), 0.01);
      assertEquals(5.590037418517623, complex2.getReal(), 0.01);
      assertEquals((-2.2539616004896375), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide((-177.1074590877));
      double double0 = complex1.getReal();
      assertEquals((-0.005646289575555485), double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Complex complex0 = new Complex(3074.50939724861);
      Complex complex1 = complex0.INF.subtract(770.8);
      double double0 = complex1.getImaginary();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.cos();
      Complex complex2 = complex1.atan();
      double double0 = complex2.getImaginary();
      assertEquals((-1.1102230246251565E-16), double0, 0.01);
      assertEquals(0.4953672892186734, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      Complex complex0 = new Complex((-1317.51615494746));
      Complex complex1 = complex0.pow((-580.7805657478197));
      double double0 = complex1.getArgument();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1317.51615494746), complex0.getReal(), 0.01);
      assertEquals((-3.141592653589793), double0, 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.exp();
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1161.7942636), 3722.656220563616);
      Complex complex1 = complex0.exp();
      assertEquals(3722.656220563616, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      Complex complex0 = new Complex((-3539.117775612614), 0.16666666666745392);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.exp();
      assertEquals((-12.291399258358105), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Complex complex0 = new Complex((-411.504187751688));
      Complex complex1 = Complex.valueOf(0.7853981633974483);
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-0.0019086030878290292), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.ONE.subtract(0.0);
      Complex complex3 = complex2.I.log();
      Complex complex4 = complex3.multiply(complex2);
      Complex complex5 = complex1.divide(complex4);
      assertEquals(1.5707963267948966, complex4.getImaginary(), 0.01);
      assertFalse(complex5.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex5.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide((-1153.5));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.createComplex(1046.0, Double.NaN);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals(1046.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2849.702705919);
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(2849.702705919, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Complex complex0 = new Complex((-1723.5348143), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-133.15), 0.0);
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.cos();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.8548287812673636), complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), (-1.0));
      Complex complex1 = complex0.cos();
      assertEquals((-0.9888977057628651), complex1.getImaginary(), 0.01);
      assertEquals(0.8337300251311491, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3399.3088), (-2539.6995));
      Complex complex1 = complex0.conjugate();
      assertEquals((-3399.3088), complex1.getReal(), 0.01);
      assertEquals((-2539.6995), complex0.getImaginary(), 0.01);
      assertEquals((-3399.3088), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2539.6995, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-133.15), 0.0);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.subtract(1655.411757016);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.1102230246251565E-16), complex2.getImaginary(), 0.01);
      assertEquals((-1656.9750431572975), complex2.getReal(), 0.01);
      assertEquals((-1.5632861412975836), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide((-177.1074590877));
      Complex complex2 = complex1.asin();
      assertEquals((-0.005646319577155936), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-0.005646289575555485), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      Complex complex0 = new Complex(478.0);
      Complex complex1 = complex0.asin();
      assertEquals((-6.862756818881086), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1920.1962732023612, 6.283185307179586);
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex2.isInfinite());
      assertEquals(1751.1815444639326, complex2.getReal(), 0.01);
      assertEquals((-201.37458177394547), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-1319.55396203145), 1013.456093);
      Complex complex2 = complex1.add(552.965937);
      assertFalse(complex2.isInfinite());
      assertEquals((-766.58802503145), complex2.getReal(), 0.01);
      assertEquals(1013.456093, complex1.getImaginary(), 0.01);
      assertEquals(1013.456093, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Complex complex0 = new Complex(1.0, (-2478.3114610002685));
      Complex complex1 = complex0.ZERO.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.9694634878950273), (-0.9694634878950273));
      Complex complex1 = complex0.add(1052.4289619725457);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.9694634878950273), complex0.getImaginary(), 0.01);
      assertEquals(1051.4594984846508, complex1.getReal(), 0.01);
      assertEquals((-0.9694634878950273), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      Complex complex0 = Complex.valueOf(8.0E298, 0.0);
      Complex complex1 = complex0.acos();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(8.0E298, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
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
  public void test_0846()  throws Throwable  {
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
  public void test_0847()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_0848()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
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
  public void test_0849()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1262.8161);
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
  public void test_0850()  throws Throwable  {
      Complex complex0 = new Complex(2416.5991323925987, 2416.5991323925987);
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.sqrt();
      assertFalse(complex2.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.log();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(283.216825511);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex0.add(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3074.50939724861, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(complex0);
      assertEquals(6149.01879449722, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(3074.50939724861, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1161.7942636), 3722.656220563616);
      double double0 = complex0.I.abs();
      assertEquals((-1161.7942636), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(3722.656220563616, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-133.15), 0.0);
      double double0 = complex0.abs();
      assertEquals(133.15, double0, 0.01);
      assertEquals((-133.15), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 0.0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2849.702705919);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(2849.702705919, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      Complex complex0 = new Complex(3074.50939724861);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(3074.50939724861, complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      Complex complex0 = Complex.valueOf(873.7, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-1316.0));
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(66);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(66, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(204);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(66);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-78));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -78
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(0.0);
      Complex complex2 = complex1.cos();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.subtract(0.0);
      Complex complex2 = Complex.valueOf((-1.0), (-1.0));
      Complex complex3 = complex1.multiply(complex2);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals((-1.0), complex3.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(358.44259715);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.negate();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-2030.176387767355));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(971.1013946415, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(971.1013946415, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.tanh();
      complex1.hashCode();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.pow((-525.6614563430184));
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.log();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertTrue(complex1.isInfinite());
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Complex complex0 = new Complex(3074.50939724861);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(3074.50939724861, complex0.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      Complex complex0 = new Complex(3074.50939724861);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(3074.50939724861, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(0.0);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Complex complex0 = new Complex(4.622690043929385E10);
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.divide(4.622690043929385E10);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Complex complex0 = new Complex((-1317.51615494746));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1317.51615494746), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.NaN);
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Complex complex0 = new Complex(3074.50939724861);
      Complex complex1 = complex0.conjugate();
      assertEquals(3074.50939724861, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(3074.50939724861, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.5000000000000003E-299);
      Complex complex1 = complex0.I.add(Double.NaN);
      assertEquals(2.5000000000000003E-299, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(3625936.0254897755);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.atan();
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      complex0.nthRoot(1845600982);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }
@Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      Complex complex0 = new Complex((-2483.836538), 291.8852);
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
  public void test_0933()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = Complex.valueOf(1.0);
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isNaN());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      Complex complex1 = complex0.ONE.divide(2068.827278664);
      assertEquals(2246.6278745, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(4.833656295588757E-4, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(3429.431165929, 4072.768995828);
      Complex complex2 = complex0.divide(complex1);
      assertNotSame(complex2, complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-4118.0));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-2.4283632831471587E-4), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1471.34206);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1471.34206, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.2675934823758863E-8, 0.0);
      assertFalse(complex0.isInfinite());
      assertEquals(1.2675934823758863E-8, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(781.323006);
      Complex complex2 = complex1.tanh();
      assertEquals(0.8740221685295416, complex1.getImaginary(), 0.01);
      assertEquals((-0.48588604519878686), complex1.getReal(), 0.01);
      assertEquals((-0.8485301544746049), complex2.getReal(), 0.01);
      assertEquals(0.7377720411620686, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.tanh();
      assertEquals((-1.557407724654902), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      Complex complex0 = new Complex((-3428.431165929));
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tan();
      assertEquals((-0.9999999574617964), complex2.getImaginary(), 0.01);
      assertEquals((-1.0418854736365573E-23), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2076.40132633681, 2076.40132633681);
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(2076.40132633681, complex0.getImaginary(), 0.01);
      assertEquals(2076.40132633681, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 0.9193254701662489);
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(0.08067452983375112, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.INF.subtract(76.460865965);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.subtract((-1.0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3074.7, 3074.7);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.subtract(1.0);
      assertEquals((-3075.7), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-3074.7), complex2.getImaginary(), 0.01);
      assertEquals((-3074.7), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      Complex complex0 = new Complex((-3175.0331683319), (-5.385491939844655));
      Complex complex1 = complex0.sqrt();
      assertEquals((-5.385491939844655), complex0.getImaginary(), 0.01);
      assertEquals(0.04778824649126831, complex1.getReal(), 0.01);
      assertEquals((-56.347452933104286), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      Complex complex0 = new Complex((-670.1580247747032), 944.0);
      Complex complex1 = complex0.sinh();
      assertEquals((-670.1580247747032), complex0.getReal(), 0.01);
      assertEquals((-2.6996012822105157E289), complex1.getReal(), 0.01);
      assertEquals(5.551230140376655E290, complex1.getImaginary(), 0.01);
      assertEquals(944.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sinh();
      assertFalse(complex2.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-0.8414709848078965), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2731.69977466829, (-944.6359222));
      Complex complex1 = complex0.sin();
      assertEquals(2731.69977466829, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-944.6359222), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sin();
      assertEquals((-0.6349639147847361), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-1.2984575814159773), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      Complex complex0 = new Complex((-4118.0), (-4118.0));
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.pow(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-4118.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      Complex complex0 = new Complex(3074.7);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.pow(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.subtract((-20.0));
      Complex complex2 = new Complex((-2456.47679));
      Complex complex3 = complex2.pow(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.5724106125665957E71), complex3.getReal(), 0.01);
      assertEquals((-1.5424646823438978E56), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.pow((-2204.59830282));
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(3810.007290669985);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.9999344247594808), complex1.getReal(), 0.01);
      assertEquals((-0.01145190730516924), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.divide((-2698.078591928));
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-3.70634125704032E-4), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.multiply((-976.6603982427));
      assertEquals((-976.6603982427), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.multiply(0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(4072.768995828, (double) 596);
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.log();
      assertEquals(8.3226727270191, complex3.getReal(), 0.01);
      assertEquals((-4072.768995828), complex2.getImaginary(), 0.01);
      assertEquals((-1.4254899159285666), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(2246.6278745, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      Complex complex0 = new Complex((-670.1580247747032), 944.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-670.1580247747032), double0, 0.01);
      assertEquals(944.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(1.5707963267948966, double0, 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      Complex complex0 = new Complex((-3175.0331683319), (-5.385491939844655));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-3.1398964550024173), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      Complex complex0 = new Complex((-3428.431165929));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3074.7, 3074.7);
      Complex complex1 = complex0.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(3074.7, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.subtract(complex0);
      Complex complex3 = complex2.exp();
      assertEquals(2.5280649404636923, complex3.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3.9372278667073894), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf((-1237.9186985697165));
      Complex complex2 = complex1.divide(complex0);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1237.9186985697165), complex2.getReal(), 0.01);
      assertEquals((-1237.9186985697165), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide((-1.960688694));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 0.0);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(0.0, 0.1666666505023083);
      assertEquals(0.1666666505023083, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.createComplex(Double.NaN, Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.createComplex((-900.251016850035), 0.0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-900.251016850035), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      Complex complex0 = new Complex((-0.16624879837036133));
      Complex complex1 = complex0.I.createComplex((-0.16624879837036133), (-3480.0923409));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-0.16624879837036133), complex1.getReal(), 0.01);
      assertEquals((-3480.0923409), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      Complex complex0 = new Complex((-4118.0), (-4118.0));
      Complex complex1 = complex0.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals((-4118.0), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.087, 2064.433138355816);
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertEquals((-0.9218834422859414), complex1.getReal(), 0.01);
      assertEquals((-0.03446414540225919), complex1.getImaginary(), 0.01);
      assertEquals(2064.433138355816, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3074.7, 3074.7);
      Complex complex1 = complex0.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(3074.7, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-5951.66));
      Complex complex1 = complex0.conjugate();
      assertEquals((-5951.66), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      Complex complex0 = new Complex((-4118.0), (-4118.0));
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals((-4118.0), complex0.getImaginary(), 0.01);
      assertEquals((-4118.0), complex1.getReal(), 0.01);
      assertEquals(4118.0, complex1.getImaginary(), 0.01);
      assertEquals((-4118.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      Complex complex0 = new Complex((-3428.431165929));
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.atan();
      assertEquals((-0.7853981633974483), complex1.getReal(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      Complex complex0 = new Complex(3074.7);
      Complex complex1 = complex0.atan();
      assertEquals((-1.1102230246251565E-16), complex1.getImaginary(), 0.01);
      assertEquals(1.5704710918240894, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      Complex complex0 = new Complex((-5951.66), (-5951.66));
      Complex complex1 = complex0.asin();
      assertEquals((-9.731146222065313), complex1.getImaginary(), 0.01);
      assertEquals((-0.7853981598685935), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.add(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.valueOf((-1955.074293285417), (-1.0));
      Complex complex2 = complex0.I.add(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1955.074293285417), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1955.074293285417), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(1960.56);
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.add(0.9473574487656714);
      assertEquals(1.9473574487656715, complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-1960.56), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_1007()  throws Throwable  {
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
  public void test_1008()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(6055);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
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
  public void test_1010()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_1011()  throws Throwable  {
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
  public void test_1012()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      Complex complex1 = complex0.exp();
      complex1.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(7.719134556323597E-8, Double.NaN);
      Complex complex2 = complex0.ONE.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.INF.multiply(0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      complex0.multiply(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 0.9193254701662489);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(0.9193254701662489, complex0.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      Complex complex1 = complex0.NaN.negate();
      Complex complex2 = complex1.I.asin();
      complex2.add(complex1);
      assertEquals(0.8813735870195428, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Complex complex0 = new Complex((-5951.66), (-5951.66));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-11903.32), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-5951.66), complex0.getImaginary(), 0.01);
      assertEquals((-5951.66), complex0.getReal(), 0.01);
      assertEquals((-11903.32), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.pow(complex0);
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertTrue(complex0.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      double double0 = complex0.abs();
      assertEquals(2246.6278745, complex0.getReal(), 0.01);
      assertEquals(2246.6278745, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 0.0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2246.6278745);
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
      assertEquals(2246.6278745, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(962);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(251);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2441));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,441
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.pow(3809.0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      complex0.cos();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      Complex complex2 = complex1.sin();
      Complex complex3 = complex2.log();
      assertSame(complex3, complex1);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      Complex complex1 = complex0.subtract(4899798.3949790085);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      double double0 = complex1.getImaginary();
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      Complex complex0 = new Complex(0.24104384099230028, (-1687.1883));
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
      assertEquals(0.24104384099230028, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1687.1883), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      Complex complex0 = new Complex(2046.7411155815446, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(5039.0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2046.7411155815446, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-1843.29));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.pow(complex0);
      assertTrue(complex0.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.acos();
      complex1.multiply(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(complex0.equals((Object)complex1));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.NaN.tan();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ONE.pow(complex0);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(1.304E19);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.acos();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.add((-1.0));
      assertEquals((-2.0), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add((-1443.5149206228));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.asin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      Complex complex3 = complex2.asin();
      assertTrue(complex3.isNaN());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(98);
      assertTrue(list0.contains(complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(98, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      Complex complex0 = Complex.INF;
      String string0 = complex0.toString();
      assertEquals("(Infinity, Infinity)", string0);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = (Complex)complex0.readResolve();
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }
@Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
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
  public void test_1090()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex2.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex3.isNaN());
      assertTrue(complex1.isInfinite());
      assertFalse(complex3.isInfinite());
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      Complex complex0 = new Complex((-2909.82683918397), 1.0);
      Complex complex1 = complex0.sin();
      assertEquals((-1.0082194995642426), complex1.getReal(), 0.01);
      assertEquals((-2909.82683918397), complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.8896617105559058, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.I.sinh();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.NaN.negate();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8), (-2.234522938847204E7));
      Complex complex1 = complex0.tanh();
      assertEquals((-4.5827617949646153E-7), complex1.getReal(), 0.01);
      assertEquals((-4.074690957692789), complex1.getImaginary(), 0.01);
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertEquals((-2.234522938847204E7), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.tan();
      assertEquals((-1.557407724654902), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.tan();
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-0.761594155955765), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = new Complex(0.0);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(6.283185307179586, 0.01745329052209854);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-0.01745329052209854), complex2.getImaginary(), 0.01);
      assertEquals((-6.283185307179586), complex2.getReal(), 0.01);
      assertEquals(6.283185307179586, complex1.getReal(), 0.01);
      assertEquals(0.01745329052209854, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      Complex complex0 = new Complex(3620.5, 3620.5);
      Complex complex1 = complex0.subtract(3620.5);
      assertEquals(3620.5, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(3620.5, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-512.45168664138), (-512.45168664138));
      Complex complex1 = complex0.subtract(1.1730463525082348E-7);
      assertFalse(complex1.isInfinite());
      assertEquals((-512.4516867586846), complex1.getReal(), 0.01);
      assertEquals((-512.45168664138), complex1.getImaginary(), 0.01);
      assertEquals((-512.45168664138), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(1, 1);
      Complex complex2 = complex1.sqrt1z();
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.7861513777574233), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.sqrt();
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2953.254994006), (-2953.254994006));
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-2953.254994006), complex0.getImaginary(), 0.01);
      assertEquals((-2953.254994006), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1449.407105878, 5402.12248937754);
      Complex complex1 = complex0.sin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(5402.12248937754, complex0.getImaginary(), 0.01);
      assertEquals(1449.407105878, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      Complex complex0 = new Complex((-417.30688667291));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      Complex complex0 = new Complex(3861.78, 2581.70005905);
      Complex complex1 = complex0.pow(2581.70005905);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2581.70005905, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(2.234522938847204E7);
      assertFalse(complex1.isInfinite());
      assertEquals(0.8195274385396308, complex1.getImaginary(), 0.01);
      assertEquals((-0.5730399440533545), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1288.6631986424);
      Complex complex1 = complex0.pow((-2953.254994006));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      Complex complex0 = new Complex(1.625);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.pow((-2928.39132300548));
      assertEquals((-4.0130341704936316E-83), complex2.getImaginary(), 0.01);
      assertEquals(5.68482057377252E-83, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      Complex complex0 = new Complex(2.0, 2.0);
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      Complex complex0 = new Complex(2.0, 2.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals((-1.8355546787822323), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
      Complex complex0 = new Complex((-417.30688667291));
      Complex complex1 = complex0.multiply(417.30688667291);
      assertEquals((-174145.03766463697), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-417.30688667291), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1119()  throws Throwable  {
      Complex complex0 = new Complex((-1261.8145574));
      Complex complex1 = complex0.I.multiply((-1261.8145574));
      assertFalse(complex1.isInfinite());
      assertEquals((-1261.8145574), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.log();
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-3.141592653589793), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      Complex complex0 = new Complex(2.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(2.0, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      double double0 = complex1.getImaginary();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.ZERO.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7443430119242758E7, 0.5039018405998233);
      Complex complex1 = complex0.exp();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.5039018405998233, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      Complex complex0 = new Complex((-2909.82683918397), 1.0);
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, 0.01745329052209854);
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.exp();
      assertEquals((-1.831851893442591E116), complex2.getImaginary(), 0.01);
      assertEquals(4.672792177479964, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-7.257341178916384E114), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex((-0.010714690733195933));
      Complex complex2 = complex0.I.divide(complex1);
      assertEquals((-93.32980530197013), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(Double.NaN, Double.POSITIVE_INFINITY);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.createComplex(Double.POSITIVE_INFINITY, 1471.6401852);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(1471.6401852, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8), (-2.234522938847204E7));
      Complex complex1 = complex0.createComplex((-2.6033824355191673E-8), (-2.6033824355191673E-8));
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-2.6033824355191673E-8), complex1.getReal(), 0.01);
      assertEquals((-2.6033824355191673E-8), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(6.283185307179586, 0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 37, 2579.228949559466);
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertEquals(2579.228949559466, complex0.getImaginary(), 0.01);
      assertEquals((-5.858555551169641E15), complex1.getReal(), 0.01);
      assertEquals(1.0909327368721802E14, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      Complex complex0 = new Complex(3861.78, 2581.70005905);
      Complex complex1 = complex0.cosh();
      double double0 = complex1.getArgument();
      assertEquals((-0.7853981633974483), double0, 0.01);
      assertEquals(2581.70005905, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2259.4085665270545);
      Complex complex1 = complex0.cos();
      double double0 = complex1.getReal();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.8233834872212611), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      Complex complex0 = new Complex(0.8414709848078965, 37);
      Complex complex1 = complex0.cos();
      assertEquals(37.0, complex0.getImaginary(), 0.01);
      assertEquals(3.904623380880138E15, complex1.getReal(), 0.01);
      assertEquals((-4.3690377363887085E15), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1992.30516307947));
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1992.30516307947), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.0));
      Complex complex1 = complex0.atan();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.1428571423679182), 0.19999999999923582);
      Complex complex1 = complex0.atan();
      assertEquals((-0.14759940711673034), complex1.getReal(), 0.01);
      assertEquals(0.19840329164076573, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      Complex complex0 = new Complex((-2.6033824355191673E-8), (-2.234522938847204E7));
      Complex complex1 = complex0.asin();
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertEquals((-1.165073040987557E-15), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1178.076158441);
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals((-7.764785013177702), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      Complex complex0 = new Complex((-3893.43));
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3893.43), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-7786.86), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(311363.0, (-130.4479531495));
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-129.4479531495), complex2.getImaginary(), 0.01);
      assertEquals(311363.0, complex1.getReal(), 0.01);
      assertEquals(311363.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.log();
      Complex complex2 = complex1.add((-6724.823));
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.add(0.0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2953.254994006), (-2953.254994006));
      Complex complex1 = complex0.add(1.0);
      assertEquals((-2953.254994006), complex0.getImaginary(), 0.01);
      assertEquals((-2952.254994006), complex1.getReal(), 0.01);
      assertEquals((-2953.254994006), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      Complex complex0 = Complex.NaN;
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
  public void test_1153()  throws Throwable  {
      Complex complex0 = Complex.INF;
      try { 
        complex0.ONE.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(1662233503);
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
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
  public void test_1156()  throws Throwable  {
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
  public void test_1157()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.ONE.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.exp();
      Complex complex2 = complex1.conjugate();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.718281828459045, complex2.getReal(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.asin();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sqrt();
      Complex complex3 = complex2.subtract((double) (-429));
      Complex complex4 = complex3.cos();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.add(complex1);
      Complex complex3 = complex2.multiply(0.7853981633974483);
      assertTrue(complex1.equals((Object)complex2));
      assertTrue(complex2.isInfinite());
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-5822.10234840602), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(12.566372705904223, 2451.1260700349712);
      Complex complex2 = complex1.acos();
      Complex complex3 = complex0.divide(complex2);
      complex3.multiply(complex2);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-8.49746318227583), complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1178.076158441);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(1178.076158441, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.I.divide(complex0);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.createComplex(0.0, (-0.010714690733195933));
      Complex complex2 = complex1.I.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-93.32980530197013), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1716.0), Double.NaN);
      Complex complex1 = complex0.ONE.add(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.add(complex0);
      Complex complex2 = complex1.divide((-851.8297));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      Complex complex0 = new Complex(142.409464048, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(142.409464048, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1180()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1181()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getImaginary();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1183()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1184()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-1668.176));
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1185()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(933);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(1218);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2446));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,446
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      Complex complex2 = complex1.conjugate();
      Complex complex3 = complex2.atan();
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals((-0.7617262217813369), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.subtract(0.21384862224257672);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.7861513777574233, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      Complex complex0 = new Complex((-417.30688667291));
      Complex complex1 = complex0.multiply((-417.30688667291));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-1023.0));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(1809.7997855797328, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1809.7997855797328, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.6033824355191673E-8), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.sqrt1z();
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.valueOf(4.455505956692757, 0.11113807559013367);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.11113807559013367, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(4.455505956692757, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.divide(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.log();
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      Complex complex0 = new Complex((-142.4), (-142.4));
      Complex complex1 = complex0.divide((-142.4));
      assertEquals((-142.4), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-142.4), complex0.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.NaN);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(2042.85);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 1.0);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.subtract(3.834E-20);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      Complex complex0 = new Complex((-417.30688667291));
      Complex complex1 = complex0.INF.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add((-142.409464048));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(0.4, 4.9930949553762706E14);
      Complex complex2 = complex1.asin();
      Complex complex3 = complex0.multiply(complex2);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      Complex complex0 = new Complex(3.145894820876798E-6, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(3.145894820876798E-6, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.nthRoot(1);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      String string0 = complex0.toString();
      assertEquals("(NaN, NaN)", string0);
  }
}
