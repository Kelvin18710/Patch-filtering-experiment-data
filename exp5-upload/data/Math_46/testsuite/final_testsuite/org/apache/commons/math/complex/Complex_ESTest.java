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
  public void test_0001()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-2938.66933384474));
      Complex complex2 = complex1.sqrt();
      assertEquals((-2938.66933384474), complex1.getImaginary(), 0.01);
      assertEquals(38.33190142586681, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-38.33190142586681), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.multiply(1.1921056801463227E-8);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(1.1921056801463227E-8, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.3812720091343277, 129.0434164);
      Complex complex1 = complex0.atan();
      assertEquals(0.007749417330551332, complex1.getImaginary(), 0.01);
      assertEquals(1.5707734294298787, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 383.5971);
      Complex complex1 = complex0.atan();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0026069077824668377, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.subtract((double) 17);
      Complex complex2 = complex1.tanh();
      assertEquals(3.1169050532319897E-15, complex2.getImaginary(), 0.01);
      assertEquals((-17.0), complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0000000000000016), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1293.4181));
      Complex complex1 = complex0.pow(0.26580222883407956);
      Complex complex2 = complex1.tanh();
      assertEquals(4.978697554385667, complex1.getImaginary(), 0.01);
      assertEquals(4.507381799777287, complex1.getReal(), 0.01);
      assertEquals(1.000209528609404, complex2.getReal(), 0.01);
      assertEquals((-1.2352156659420127E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.tan();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-0.761594155955765), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.I.subtract(complex1);
      assertFalse(complex2.isNaN());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract((-134.46419339883));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(135.46419339883, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1876.8));
      Complex complex1 = complex0.subtract(0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-548.587789371));
      Complex complex1 = complex0.sqrt();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-548.587789371), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2816.2071739), (-2816.2071739));
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isInfinite());
      assertEquals((-2816.2071739), complex0.getReal(), 0.01);
      assertEquals((-2816.2071739), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.0, 1957.0537773);
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1957.0537773, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1607.859), (-2902.02981));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-786.8), (-786.8));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1022.198, 1022.198);
      Complex complex1 = complex0.pow(1274.600289931895);
      assertEquals(1022.198, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(2414.698666569158);
      assertEquals((-0.4558557586901277), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.8900536653871204), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.multiply(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(1022.198, 1022.198);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex1.multiply(complex2);
      assertEquals((-2088755.3044079999), complex3.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(1022.1979999999749, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2537.36), 1574.59);
      Complex complex1 = complex0.multiply(1574.59);
      assertEquals((-2537.36), complex0.getReal(), 0.01);
      assertEquals(1574.59, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-3995301.6824), complex1.getReal(), 0.01);
      assertEquals(2479333.6681, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1607.859), (-2902.02981));
      Complex complex1 = complex0.log();
      assertEquals((-2.076740825201289), complex1.getImaginary(), 0.01);
      assertEquals(8.107020431907308, complex1.getReal(), 0.01);
      assertEquals((-2902.02981), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.pow((-1217.70161287));
      boolean boolean0 = complex1.isNaN();
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(complex0);
      boolean boolean0 = complex1.isInfinite();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getReal();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2677.84));
      double double0 = complex0.getReal();
      assertEquals((-2677.84), double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1268.29222), (-1268.29222));
      double double0 = complex0.getImaginary();
      assertEquals((-1268.29222), double0, 0.01);
      assertEquals((-1268.29222), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1268.29222), (-1268.29222));
      Complex complex1 = complex0.ONE.log();
      double double0 = complex1.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1268.29222), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1268.29222), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7187938783536083E-4), (-1.7187938783536083E-4));
      double double0 = complex0.getArgument();
      assertEquals((-2.356194490192345), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2537.36), 1574.59);
      Complex complex1 = complex0.exp();
      assertEquals(1574.59, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.tan();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.45054953406980763), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1022.198, 1022.198);
      Complex complex1 = complex0.exp();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1022.198, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.7187938783536083E-4), (-1.7187938783536083E-4));
      Complex complex1 = Complex.valueOf(4213849.024);
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-4.078916611782264E-11), complex2.getImaginary(), 0.01);
      assertEquals((-4.078916611782264E-11), complex2.getReal(), 0.01);
      assertEquals((-1.7187938783536083E-4), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(2106.936150257661);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2537.36), 1574.59);
      Complex complex1 = complex0.divide(0.06666666666666667);
      assertEquals((-38060.4), complex1.getReal(), 0.01);
      assertEquals(1574.59, complex0.getImaginary(), 0.01);
      assertEquals(23618.85, complex1.getImaginary(), 0.01);
      assertEquals((-2537.36), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(Double.NaN, Double.NaN);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(17, Double.POSITIVE_INFINITY);
      assertEquals(17.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex((-3048.6), 1.25);
      assertFalse(complex1.isInfinite());
      assertEquals(1.25, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-3048.6), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.createComplex(0.0, (-4735.832709753));
      assertEquals((-4735.832709753), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1607.859), (-2902.02981));
      Complex complex1 = complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2902.02981), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.3812720091343277, 129.0434164);
      Complex complex1 = complex0.cosh();
      assertEquals((-0.09212683445974672), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(129.0434164, complex0.getImaginary(), 0.01);
      assertEquals((-1.0432768094976783), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Complex complex0 = new Complex(2949.3585, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(1022.198, 1022.198);
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.conjugate();
      assertEquals((-1021.198), complex3.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1022.198), complex2.getImaginary(), 0.01);
      assertEquals(1022.198, complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-1021.198), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-771.45));
      Complex complex1 = complex0.atan();
      assertEquals((-5.551115123125783E-17), complex1.getImaginary(), 0.01);
      assertEquals((-1.5695000672318613), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3051.388155), (-3051.388155));
      Complex complex1 = complex0.asin();
      assertEquals((-0.7853981499724234), complex1.getReal(), 0.01);
      assertEquals((-9.063072669686749), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Complex complex0 = new Complex(15.0, 15.0);
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY, 3718.0);
      Complex complex2 = complex0.add(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(3733.0, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(3718.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.createComplex(0.0, 0.0);
      Complex complex2 = complex1.add(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1268.29222), (-1268.29222));
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-1268.29222), complex0.getReal(), 0.01);
      assertEquals((-2536.58444), complex1.getReal(), 0.01);
      assertEquals((-1268.29222), complex0.getImaginary(), 0.01);
      assertEquals((-2536.58444), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Complex complex0 = new Complex(0.07490822288864472);
      Complex complex1 = complex0.add(0.07490822288864472);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.14981644577728945, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.pow(complex1);
      Complex complex3 = complex2.add(0.9055386218805612);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.2013670756493233, complex3.getReal(), 0.01);
      assertEquals((-0.062254170293263564), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.acos();
      Complex complex2 = complex1.pow((double) 102);
      Complex complex3 = complex2.acos();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
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
  public void test_0071()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0072()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(1431655784);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
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
  public void test_0074()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.ZERO.divide((Complex) null);
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
      Complex complex0 = Complex.ZERO;
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
  public void test_0076()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1268.29222), (-1268.29222));
      Complex complex1 = complex0.sqrt();
      assertEquals(16.20715642202976, complex1.getReal(), 0.01);
      assertEquals((-39.12753684156646), complex1.getImaginary(), 0.01);
      assertEquals((-1268.29222), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.negate();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.multiply(2106.936150257661);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.multiply(1193.378084507127);
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1429.145855443038);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1429.145855443038, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.subtract(complex0);
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
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
      Complex complex0 = Complex.valueOf((-2677.84));
      double double0 = complex0.abs();
      assertEquals(2677.84, double0, 0.01);
      assertEquals((-2677.84), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586);
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.multiply(0.0);
      double double0 = complex1.abs();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 4.6510023759593495E-5);
      assertTrue(complex0.isNaN());
      assertEquals(4.6510023759593495E-5, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Complex complex0 = new Complex(2751.322634456057, Double.NaN);
      assertTrue(complex0.isNaN());
      assertEquals(2751.322634456057, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.NaN);
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(209);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(932);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1045));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,045
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(1291);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(1291, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cosh();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.cosh();
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.pow((-1859.3599683567577));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      Complex complex2 = complex1.subtract(17.0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.sqrt1z();
      assertNotSame(complex2, complex1);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.negate();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Complex complex0 = new Complex(15.0, 15.0);
      Complex complex1 = new Complex(846.2652276202, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(846.2652276202, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3731.2694742, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(3731.2694742, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.multiply(complex0);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.asin();
      complex1.hashCode();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.multiply(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
      Complex complex1 = complex0.INF.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-48.61259792198));
      assertEquals((-0.020570799396587153), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide((-502.191));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.atan();
      Complex complex2 = complex0.ZERO.add(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.acos();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add((-1293.4181));
      assertFalse(complex1.isNaN());
      assertEquals((-1293.4181), complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(3555.1703159341528);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.acos();
      Complex complex2 = complex1.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(1.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.INF.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1293.4181));
      Complex complex1 = complex0.pow(0.26580222883407956);
      complex1.sin();
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.NaN.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.I.toString();
      assertEquals("(0.0, 1.0)", string0);
  }
@Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Complex complex0 = new Complex((-1195.48450457), (-1195.48450457));
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
  public void test_0158()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.972747308392));
      Complex complex1 = complex0.INF.createComplex(82.0, (-3288.4758471524597));
      Complex complex2 = complex1.tanh();
      Complex complex3 = complex2.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(3.453707214155867E-36, complex3.getReal(), 0.01);
      assertEquals(1.1928093521112276E-71, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2883.179687615);
      Complex complex1 = complex0.INF.cosh();
      assertTrue(complex1.isNaN());
      assertEquals(2883.179687615, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Complex complex0 = new Complex((-0.25), (-0.25));
      complex0.INF.hashCode();
      assertFalse(complex0.isInfinite());
      assertEquals((-0.25), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-0.25), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.972747308392), (-4103.972747308392));
      Complex complex1 = new Complex((-4103.972747308392));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals((-4103.972747308392), complex0.getReal(), 0.01);
      assertEquals((-4103.972747308392), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1847.23441973307), (-1847.23441973307));
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
      assertEquals((-1847.23441973307), complex0.getReal(), 0.01);
      assertEquals((-1847.23441973307), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(2184.08993445786);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(4.578566038986038E-4, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.972747308392));
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.atan();
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(2.436663474760661E-4, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Complex complex0 = Complex.valueOf(9.990299318636903E-13, 1.5707963267948966);
      Complex complex1 = complex0.tanh();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(9.990299318636903E-13, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 82.0);
      Complex complex1 = complex0.tanh();
      assertEquals(0.3298264065076797, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(82.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2534.9155572345194));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.tanh();
      assertEquals((-0.9170896554475914), complex2.getReal(), 0.01);
      assertEquals((-8.823306744732877E-18), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      Complex complex1 = complex0.tan();
      assertEquals((-3.8950219914371575), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-758.4433156921478), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Complex complex0 = new Complex(226.131, 226.131);
      Complex complex1 = complex0.ONE.add(226.131);
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.tan();
      assertEquals(226.131, complex0.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.5669597311740348), complex3.getImaginary(), 0.01);
      assertEquals(0.40475072702189546, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.divide(0.00833333333);
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(120.000000048, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(797.83);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Complex complex0 = new Complex(2184.08993445786);
      Complex complex1 = complex0.subtract(2184.08993445786);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.851979984701));
      Complex complex1 = complex0.INF.createComplex((-4103.851979984701), (-4103.851979984701));
      Complex complex2 = complex1.subtract(2138.19607);
      assertFalse(complex2.isInfinite());
      assertEquals((-4103.851979984701), complex1.getImaginary(), 0.01);
      assertEquals((-4103.851979984701), complex0.getReal(), 0.01);
      assertEquals((-6242.048049984701), complex2.getReal(), 0.01);
      assertEquals((-4103.851979984701), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2534.9155572345194));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.sqrt();
      assertEquals(2.2148526629606182E-17, complex2.getReal(), 0.01);
      assertEquals((-1.2531567485183293), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2322.07811425238, (-0.33333333333333287));
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2322.07811425238, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Complex complex0 = Complex.valueOf(129.5072866932);
      Complex complex1 = complex0.sin();
      assertEquals(129.5072866932, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.6457368400882239), complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1847.23441973307), (-1847.23441973307));
      Complex complex1 = complex0.sin();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1847.23441973307), complex0.getImaginary(), 0.01);
      assertEquals((-1847.23441973307), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4091.936, 0.0);
      Complex complex1 = Complex.valueOf(4091.936, (-1261.11));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Complex complex0 = new Complex((-3254.15368), (-4.9E-324));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex0.sqrt1z();
      Complex complex3 = complex1.pow(complex2);
      assertEquals(0.025868389566097365, complex3.getReal(), 0.01);
      assertEquals(4.9E-324, complex2.getReal(), 0.01);
      assertEquals((-4.9E-324), complex0.getImaginary(), 0.01);
      assertEquals((-0.9996653572177324), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      Complex complex1 = complex0.pow(3711.606463526183);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      Complex complex1 = complex0.pow((-758.4433156921478));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2066.567417136));
      Complex complex1 = complex0.ZERO.pow(2657.839);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals((-2066.567417136), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.5039018405998233);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.pow(0.5039018405998233);
      assertEquals((-0.707911462788922), complex2.getImaginary(), 0.01);
      assertEquals((-0.008678008948547563), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(0.0);
      Complex complex2 = complex0.I.multiply(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.851979984701));
      Complex complex1 = complex0.INF.createComplex(82.0, (-3288.4758471524597));
      Complex complex2 = complex1.conjugate();
      Complex complex3 = complex2.multiply(complex0);
      assertEquals((-336515.8623587455), complex3.getReal(), 0.01);
      assertEquals((-1.3495418116468487E7), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1847.23441973307), (-1847.23441973307));
      Complex complex1 = complex0.multiply(1142.07162685);
      assertEquals((-2109674.018917863), complex1.getImaginary(), 0.01);
      assertEquals((-2109674.018917863), complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1847.23441973307), complex0.getReal(), 0.01);
      assertEquals((-1847.23441973307), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(2.3680768014422044);
      assertEquals(2.3680768014422044, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-4471.346031178));
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-4471.346031178), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4091.936, 0.0);
      Complex complex1 = complex0.ONE.log();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(4091.936, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.09088450866185192), (-3.141592653589793));
      Complex complex1 = complex0.log();
      assertEquals((-1.5997176979850938), complex1.getImaginary(), 0.01);
      assertEquals(1.145148167021621, complex1.getReal(), 0.01);
      assertEquals((-3.141592653589793), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2883.179687615);
      boolean boolean0 = complex0.isNaN();
      assertFalse(complex0.isInfinite());
      assertEquals(2883.179687615, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2883.179687615);
      Complex complex1 = complex0.I.tan();
      double double0 = complex1.getReal();
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertEquals(2883.179687615, complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.00833333333);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertEquals(0.00833333333, complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-403.5576683550892), (-758.4433156921478));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-758.4433156921478), double0, 0.01);
      assertEquals((-403.5576683550892), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.INF.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-403.5576683550892), (-758.4433156921478));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2.059782657643381), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Complex complex0 = Complex.valueOf(520.43590042, 520.43590042);
      Complex complex1 = complex0.multiply(520.43590042);
      Complex complex2 = complex1.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(270853.5264459762, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(270853.5264459762, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.851979984701));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4492.25014088207, (-6.032174644509064E-23));
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.divide(complex0);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(4492.25014088207, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Complex complex0 = new Complex((-1144.792827));
      Complex complex1 = complex0.createComplex((-2957.6699617), Double.NaN);
      assertEquals((-2957.6699617), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, 2.0);
      assertTrue(complex1.isInfinite());
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Complex complex0 = new Complex(1280.3, 0.0);
      Complex complex1 = complex0.createComplex(0.006097787701307311, 0.0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.006097787701307311, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.createComplex(0.0, 1301.13611196254);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1301.13611196254, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.09088450866185192), (-3.141592653589793));
      Complex complex1 = complex0.cosh();
      assertEquals((-1.0041328405526668), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3.141592653589793), complex0.getImaginary(), 0.01);
      assertEquals(1.1145471076467482E-17, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-4453.85), (-4453.85));
      Complex complex2 = complex1.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals((-4453.85), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2322.07811425238);
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals((-0.9042641169718446), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.5458659301972835, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4091.936, 0.0);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.exp();
      Complex complex3 = complex2.conjugate();
      assertEquals((-1.9389078715870711), complex2.getImaginary(), 0.01);
      assertEquals((-4.402423071250304), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1847.23441973307), (-1847.23441973307));
      Complex complex1 = complex0.atan();
      assertEquals((-2.7067489119789824E-4), complex1.getImaginary(), 0.01);
      assertEquals((-1.5705256518772575), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2066.567417136));
      Complex complex1 = complex0.asin();
      assertEquals(8.326791378407425, complex1.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.972747308392));
      Complex complex1 = complex0.INF.add(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-4103.972747308392), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.16666666666745392);
      Complex complex1 = complex0.I.add(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.1666666666674539, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Complex complex0 = new Complex(1280.3, 0.0);
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2560.6, complex1.getReal(), 0.01);
      assertEquals(1280.3, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1847.23441973307), (-1847.23441973307));
      Complex complex1 = complex0.add(1142.07162685);
      Complex complex2 = complex1.atan();
      assertEquals((-1847.23441973307), complex0.getImaginary(), 0.01);
      assertEquals((-1.5706159565148472), complex2.getReal(), 0.01);
      assertEquals((-4.7249533887864945E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4103.972747308392));
      Complex complex1 = complex0.createComplex(1.9448516332758063E296, (-3288.4758471524597));
      Complex complex2 = complex1.acos();
      assertFalse(complex1.isInfinite());
      assertEquals((-4103.972747308392), complex0.getReal(), 0.01);
      assertEquals((-3288.4758471524597), complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
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
  public void test_0235()  throws Throwable  {
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
  public void test_0236()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(628983398);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
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
  public void test_0238()  throws Throwable  {
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
  public void test_0239()  throws Throwable  {
      Complex complex0 = Complex.valueOf(607.544833571);
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
  public void test_0240()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(27.53984959458108, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Complex complex0 = new Complex(192.1147443189817, 192.1147443189817);
      Complex complex1 = complex0.ZERO.asin();
      Complex complex2 = complex1.sqrt();
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-510.35416), Double.NaN);
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.exp();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      Complex complex1 = Complex.valueOf((-510.35416), Double.NaN);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(20.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Complex complex0 = Complex.valueOf(129.5072866932);
      Complex complex1 = complex0.I.tan();
      Complex complex2 = complex1.divide(complex1);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(129.5072866932, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2184.08993445786, 6.283185307179586);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex0.add(complex2);
      assertSame(complex3, complex2);
      assertEquals(2184.08993445786, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(6.283185307179586, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.sinh();
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Complex complex0 = new Complex((-3288.4758471524597), Double.POSITIVE_INFINITY);
      assertEquals((-3288.4758471524597), complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 2109675.018917863);
      assertTrue(complex0.isNaN());
      assertEquals(2109675.018917863, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2066.567417136));
      boolean boolean0 = complex0.isInfinite();
      assertEquals((-2066.567417136), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-758.4433156921478), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.INF.divide((-1153.633));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(23);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(278);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-85));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -85
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4492.25014088207, (-6.032174644509064E-23));
      Complex complex1 = complex0.NaN.sinh();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(4492.25014088207, complex0.getReal(), 0.01);
      assertEquals((-6.032174644509064E-23), complex0.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(366.9258);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Complex complex0 = new Complex((-2264.972536621558));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-2264.972536621558), complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(347.7931441470475);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-2778.0));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-3417.933), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.I.pow(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals((-3417.933), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.multiply(complex0);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.multiply(complex0);
      assertSame(complex2, complex0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Complex complex0 = new Complex(2184.08993445786);
      Complex complex1 = Complex.valueOf(2184.08993445786, 2184.08993445786);
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(2184.08993445786, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(2184.08993445786, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2184.08993445786, 6.283185307179586);
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
      assertFalse(complex0.isNaN());
      assertEquals(2184.08993445786, complex0.getReal(), 0.01);
      assertEquals(6.283185307179586, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Complex complex0 = new Complex(1280.3, 0.0);
      boolean boolean0 = complex0.equals((Object) null);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1280.3, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(0.0);
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Complex complex0 = Complex.valueOf(520.43590042);
      Complex complex1 = complex0.divide(Double.NaN);
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex1);
      assertEquals(520.43590042, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(34.49195203105933);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.INF.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Complex complex0 = new Complex((-136));
      Complex complex1 = complex0.add(Double.NaN);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals((-136.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add((-1265.917));
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Complex complex0 = new Complex((-758.4433156921478));
      Complex complex1 = complex0.sin();
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.cosh();
      Complex complex4 = complex3.add(2.7513586536359718);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(Double.NaN, complex4.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-704.2), complex0.getReal(), 0.01);
      assertEquals((-704.2), complex0.getImaginary(), 0.01);
      assertEquals((-1408.4), complex1.getImaginary(), 0.01);
      assertEquals((-1408.4), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Complex complex0 = new Complex(2184.08993445786, Double.NaN);
      complex0.acos();
      assertEquals(2184.08993445786, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      Complex complex1 = complex0.tanh();
      assertEquals((-704.2), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-704.2), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      List<Complex> list0 = complex0.nthRoot(37);
      assertEquals(37, list0.size());
      assertEquals((-704.2), complex0.getReal(), 0.01);
      assertEquals((-704.2), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-3.3817707277189647E305), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      complex0.ZERO.getField();
      assertFalse(complex0.isInfinite());
      assertEquals((-704.2), complex0.getReal(), 0.01);
      assertEquals((-704.2), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-704.2), (-704.2));
      String string0 = complex0.ZERO.toString();
      assertFalse(complex0.isNaN());
      assertEquals((-704.2), complex0.getImaginary(), 0.01);
      assertEquals((-704.2), complex0.getReal(), 0.01);
      assertEquals("(0.0, 0.0)", string0);
      assertFalse(complex0.isInfinite());
  }
@Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0322()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 5.9157324764867695E13);
      Complex complex1 = complex0.ONE.divide(complex0);
      Complex complex2 = complex1.tanh();
      Complex complex3 = complex2.sqrt();
      assertEquals((-2.8574783468698424E-28), complex1.getReal(), 0.01);
      assertEquals(5.9157324764867695E13, complex0.getImaginary(), 0.01);
      assertEquals((-9.193497010777686E-8), complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2646.4243));
      Complex complex1 = Complex.valueOf((-2646.4243), (-200.0));
      boolean boolean0 = complex1.equals(complex0);
      assertEquals((-200.0), complex1.getImaginary(), 0.01);
      assertEquals((-2646.4243), complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals((-2646.4243), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.INF;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      Complex complex1 = Complex.valueOf((-2.356194490192345), (-3271303.7952826982));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-66.8373190672858), complex0.getImaginary(), 0.01);
      assertEquals(2.043141554263054E-5, complex2.getReal(), 0.01);
      assertEquals((-2.0431386110723832E-5), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4081.9239728);
      Complex complex1 = complex0.I.subtract(1275.61401);
      Complex complex2 = complex1.tan();
      assertEquals((-1275.61401), complex1.getReal(), 0.01);
      assertEquals((-0.053285890121936956), complex2.getReal(), 0.01);
      assertEquals(4081.9239728, complex0.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.7667921823837275, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.subtract(complex0);
      Complex complex3 = complex2.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.10960159862345803, complex3.getReal(), 0.01);
      assertEquals((-1.290315351986155), complex3.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Complex complex0 = new Complex(0.3999999761581421);
      Complex complex1 = complex0.INF.multiply(complex0);
      Complex complex2 = complex0.ZERO.subtract(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(0.3999999761581421, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      Complex complex1 = complex0.subtract((-66.8373190672858));
      assertEquals((-66.8373190672858), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-66.8373190672858), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Complex complex0 = new Complex((-3555.26357128), (-66.8373190672858));
      Complex complex1 = complex0.sqrt1z();
      assertEquals(66.83732171025429, complex1.getReal(), 0.01);
      assertEquals((-66.8373190672858), complex0.getImaginary(), 0.01);
      assertEquals((-3555.263430693135), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 2646.4243);
      Complex complex1 = complex0.sqrt();
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2646.4243, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543), (-2555.391543));
      Complex complex1 = complex0.multiply((-2555.391543));
      Complex complex2 = complex1.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(6530025.938035922, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(6530025.938035922, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      Complex complex2 = complex1.atan();
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(1.25947072527746, complex2.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      Complex complex1 = complex0.subtract((-22.75));
      Complex complex2 = complex1.sin();
      assertEquals((-44.087319067285804), complex1.getReal(), 0.01);
      assertEquals((-5.2923602255524254E28), complex2.getImaginary(), 0.01);
      assertEquals((-5.578663409716228E27), complex2.getReal(), 0.01);
      assertEquals((-66.8373190672858), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.230205524088212);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.pow(725.0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2646.4243));
      Complex complex1 = complex0.pow(1501.057795581303);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 5.9157324764867695E13);
      Complex complex1 = complex0.ONE.negate();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(5.9157324764867695E13, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex((-66.8373190672858), 0.333333333333333);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.333333333333333, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543), (-2555.391543));
      Complex complex1 = Complex.valueOf((-0.5625), 571.999125873458);
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(1463119.1366033647, complex2.getReal(), 0.01);
      assertEquals((-1460244.3211174896), complex2.getImaginary(), 0.01);
      assertEquals(571.999125873458, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.multiply((-2425.7));
      Complex complex2 = complex1.log();
      assertEquals(7.793875421511175, complex2.getReal(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getImaginary(), 0.01);
      assertEquals((-2425.7), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3047.27016784);
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.ONE.divide(complex1);
      complex2.isNaN();
      assertEquals(3047.27016784, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-2633.26961));
      double double0 = complex1.getImaginary();
      assertFalse(complex1.isInfinite());
      assertEquals((-2633.26961), double0, 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isNaN());
      assertEquals((-2.356194490192345), double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4081.9239728);
      Complex complex1 = complex0.NaN.createComplex(4081.9239728, 4081.9239728);
      Complex complex2 = complex1.exp();
      assertEquals(4081.9239728, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(4081.9239728, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-3154.8863335973));
      Complex complex2 = complex1.exp();
      assertEquals((-3154.8863335973), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.42861051889599);
      Complex complex1 = complex0.I.multiply(complex0);
      Complex complex2 = complex1.exp();
      assertEquals(20.42861051889599, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.9999659006774554, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-0.008258176694976816), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Complex complex0 = new Complex(2.0);
      Complex complex1 = complex0.asin();
      Complex complex2 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex3 = complex2.divide(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals((-1.3169578969248166), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.divide(1218.36267134415);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.add(complex1);
      Complex complex3 = complex2.divide((-1.3060051876071844E7));
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals((-7.656937426352525E-8), complex3.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals((-7.656937426352525E-8), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.createComplex(2658.116593833844, Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertEquals(2658.116593833844, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex((-3946.28842), 0.0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-3946.28842), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(0.0, 629.374615);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(629.374615, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(Double.NaN, (-2024.7176011));
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals((-2024.7176011), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Complex complex0 = new Complex((-2063.169), (-2063.169));
      Complex complex1 = complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2063.169), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.479773539153719E-5, 2765.658605);
      Complex complex1 = complex0.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2765.658605, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), 0.333333333333333);
      Complex complex1 = complex0.cos();
      assertEquals((-0.6859157190108383), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.25817441121647117), complex1.getImaginary(), 0.01);
      assertEquals(0.333333333333333, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Complex complex0 = new Complex((-636.072963));
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-636.072963), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-636.072963), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2646.4243));
      Complex complex1 = complex0.atan();
      assertEquals((-5.551115123125783E-17), complex1.getImaginary(), 0.01);
      assertEquals((-1.5704184584566996), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Complex complex0 = new Complex(3.24632175615E9, 419.925);
      Complex complex1 = complex0.asin();
      assertEquals(3.24632175615E9, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      Complex complex1 = complex0.asin();
      assertEquals((-5.241982365231668), complex1.getImaginary(), 0.01);
      assertEquals((-0.7853701818344977), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.add(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Complex complex0 = new Complex(2.0);
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.add(complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.multiply((-886.5447));
      Complex complex2 = complex0.add(complex1);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-886.5447), complex2.getImaginary(), 0.01);
      assertEquals((-886.5447), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ZERO.add((-1.0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.exp();
      assertEquals(3.0599055362181553, complex2.getReal(), 0.01);
      assertEquals((-3.7118284904074903), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
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
  public void test_0387()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0388()  throws Throwable  {
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
  public void test_0389()  throws Throwable  {
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
  public void test_0390()  throws Throwable  {
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
  public void test_0391()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Complex complex0 = new Complex((-66.8373190672858), (-66.8373190672858));
      Complex complex1 = complex0.sqrt();
      assertEquals(3.7205459297210433, complex1.getReal(), 0.01);
      assertEquals((-8.982192442964559), complex1.getImaginary(), 0.01);
      assertEquals((-66.8373190672858), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sqrt();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.log();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.exp();
      double double0 = complex1.getReal();
      assertEquals(0.5403023058681398, double0, 0.01);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.INF.subtract(complex1);
      assertNotSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Complex complex0 = new Complex(2.0);
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.negate();
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.subtract((-1.0));
      Complex complex2 = complex1.multiply(0.0);
      assertTrue(complex2.equals((Object)complex1));
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(0.7853981633974483);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Complex complex0 = new Complex(2.0, 0.333333333333333);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.cosh();
      Complex complex4 = complex3.tanh();
      assertEquals((-0.2599689464811283), complex4.getImaginary(), 0.01);
      assertFalse(complex4.isInfinite());
      assertEquals((-0.44747583066337565), complex4.getReal(), 0.01);
      assertEquals((-2.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex0.ONE.add(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.25);
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1.25, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2646.4243));
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-2646.4243), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Complex complex0 = new Complex(1135, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(1135.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      Complex complex0 = new Complex((-394.796935056), (-3060.543238144986));
      boolean boolean0 = complex0.isInfinite();
      assertFalse(complex0.isNaN());
      assertEquals((-394.796935056), complex0.getReal(), 0.01);
      assertEquals((-3060.543238144986), complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Complex complex0 = new Complex(5141.63, 5141.63);
      double double0 = complex0.getImaginary();
      assertEquals(5141.63, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(5141.63, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543));
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals((-2555.391543), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(451);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(1);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1372));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,372
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4081.9239728);
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(4081.9239728, complex0.getReal(), 0.01);
      assertEquals(1.5408029364044198, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543), (-2555.391543));
      Complex complex1 = complex0.sin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-2555.391543), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals((-2555.391543), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(1.1102230246251565E-16);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.subtract(complex0);
      boolean boolean0 = complex1.isInfinite();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.negate();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Complex complex0 = new Complex(419.925, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(419.925, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(3379.2971, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(3379.2971, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      Complex complex0 = new Complex(419.925, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertEquals(419.925, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(Double.NaN);
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.equals((Object)complex1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(1412.758);
      Complex complex2 = complex1.sinh();
      Complex complex3 = complex2.sin();
      boolean boolean0 = complex2.equals(complex3);
      assertFalse(complex3.equals((Object)complex1));
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1412.758), complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(1412.758);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-1412.758), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543), (-2555.391543));
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertEquals((-2555.391543), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2555.391543), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.divide(0.0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.divide(584.091);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.acos();
      assertNotSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      Complex complex0 = new Complex((-2555.391543), (-2555.391543));
      Complex complex1 = complex0.add((-119.8));
      assertEquals((-2555.391543), complex1.getImaginary(), 0.01);
      assertEquals((-2555.391543), complex0.getImaginary(), 0.01);
      assertEquals((-2675.1915430000004), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sqrt1z();
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(2147483309);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      List<Complex> list0 = complex0.nthRoot(1);
      assertTrue(list0.contains(complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4964.03136897, 4964.03136897);
      complex0.getField();
      assertEquals(4964.03136897, complex0.getReal(), 0.01);
      assertEquals(4964.03136897, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4964.03136897, 4964.03136897);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Complex complex0 = Complex.valueOf(4964.03136897, 4964.03136897);
      Complex complex1 = (Complex)complex0.readResolve();
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertEquals(4964.03136897, complex1.getImaginary(), 0.01);
      assertEquals(4964.03136897, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }
@Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0478()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-1.1551239628341062E7), 1020108.7457047035);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.cosh();
      assertEquals(7.586044495695046E-9, complex2.getReal(), 0.01);
      assertEquals((-6.51647737483421E-16), complex3.getImaginary(), 0.01);
      assertEquals((-8.590085926623103E-8), complex2.getImaginary(), 0.01);
      assertEquals(0.9999999999999963, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      Complex complex2 = Complex.I;
      boolean boolean0 = complex1.equals(complex2);
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-2846.6963852));
      boolean boolean0 = complex0.equals(complex1);
      assertEquals((-2846.6963852), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Complex complex0 = new Complex((-1138.871));
      Complex complex1 = complex0.divide((-1.5246242E7));
      assertEquals(7.469847323688029E-5, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1138.871), complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2761.0), (-2761.0));
      Complex complex1 = complex0.I.log();
      Complex complex2 = complex1.atan();
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals((-2761.0), complex0.getReal(), 0.01);
      assertEquals(0.7524692671419272, complex2.getImaginary(), 0.01);
      assertEquals((-2761.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(3207.11);
      Complex complex2 = complex1.tan();
      Complex complex3 = complex2.tanh();
      assertFalse(complex3.isInfinite());
      assertEquals(1.0178496731065292, complex3.getImaginary(), 0.01);
      assertEquals((-0.3775698417161184), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Complex complex0 = new Complex((-1138.871));
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.tanh();
      assertEquals((-23.120862741038767), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 1.5707963267948966);
      Complex complex1 = complex0.ONE.tan();
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.7071067811865476, (-2113.308));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.tan();
      assertEquals(7.491975833602851E-11, complex2.getReal(), 0.01);
      assertEquals((-0.9999998880448203), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.subtract(complex0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.subtract(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract((-287.85163));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(287.85163, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1400.790195605), (-1400.790195605));
      Complex complex1 = complex0.subtract((-1400.790195605));
      assertEquals((-1400.790195605), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1400.790195605), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 1.5707963267948966);
      Complex complex1 = complex0.INF.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Complex complex0 = new Complex(2239.275924111);
      Complex complex1 = complex0.createComplex(2239.275924111, (-3398.711613));
      Complex complex2 = complex1.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(2239.275924111, complex1.getReal(), 0.01);
      assertEquals((-3398.711613), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Complex complex0 = new Complex((-329.432), (-329.432));
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals((-329.432), complex0.getImaginary(), 0.01);
      assertEquals((-329.432), complex0.getReal(), 0.01);
      assertEquals(5.332964209559004E142, complex1.getReal(), 0.01);
      assertEquals((-2.479639965636913E142), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.createComplex(3165.490412235, (-1085.52561));
      Complex complex2 = complex1.sin();
      assertTrue(complex2.isInfinite());
      assertEquals((-1085.52561), complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(3165.490412235, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(42.237467203124766, (-3398.711613));
      Complex complex2 = complex1.exp();
      Complex complex3 = complex2.pow(complex1);
      assertEquals(1.04113240300574323E18, complex2.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
      assertTrue(complex3.equals((Object)complex0));
      assertEquals(1.94424575102372634E18, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Complex complex0 = new Complex(0.7970051173494792, 1163.048349283871);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Complex complex0 = new Complex((-329.432), (-329.432));
      Complex complex1 = complex0.I.pow(complex0);
      assertEquals((-4.225256566234135E224), complex1.getImaginary(), 0.01);
      assertEquals((-3.4069177666319828E224), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2417.29672659695, 2417.29672659695);
      Complex complex1 = complex0.pow(452.661030503);
      assertEquals(2417.29672659695, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2417.29672659695, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2761.0), (-2761.0));
      Complex complex1 = complex0.pow((-1306.9999019683));
      Complex complex2 = complex1.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Complex complex0 = new Complex(2.356194490192345);
      Complex complex1 = complex0.pow(2.356194490192345);
      assertEquals(7.533587347669574, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.9998189498799739, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ONE.negate();
      assertEquals(0.9998189498799739, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.3245471311735498E-8);
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-1.4705427222300724E-24), complex2.getImaginary(), 0.01);
      assertEquals(1.754425102700081E-16, complex2.getReal(), 0.01);
      assertEquals((-1.1102230246251565E-16), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-1010.0038345), (-1010.0038345));
      Complex complex2 = complex1.multiply(9.219544613762692E-9);
      assertEquals((-9.31177541224414E-6), complex2.getReal(), 0.01);
      assertEquals((-9.31177541224414E-6), complex2.getImaginary(), 0.01);
      assertEquals((-1010.0038345), complex1.getReal(), 0.01);
      assertEquals((-1010.0038345), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Complex complex0 = new Complex(2536.65);
      Complex complex1 = complex0.I.multiply(0.0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1403.3234852339624), (-1770.0));
      Complex complex1 = complex0.log();
      assertEquals((-1770.0), complex0.getImaginary(), 0.01);
      assertEquals((-2.2411549914855446), complex1.getImaginary(), 0.01);
      assertEquals(7.7225928353730025, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2556.8, 2556.8);
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.divide(complex0);
      boolean boolean0 = complex2.isNaN();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertFalse(complex2.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.9998189498799739, Double.POSITIVE_INFINITY);
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
      assertEquals(0.9998189498799739, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 1.5707963267948966);
      Complex complex1 = complex0.negate();
      double double0 = complex1.getReal();
      assertEquals((-1.5707963267948966), double0, 0.01);
      assertEquals(1.5707963267948966, complex0.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Complex complex0 = new Complex(20.0, 113.976);
      double double0 = complex0.getImaginary();
      assertEquals(20.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(113.976, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2556.8, 2556.8);
      Complex complex1 = complex0.exp();
      double double0 = complex1.getImaginary();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(2556.8, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Complex complex0 = Complex.valueOf(113.976, (-523.0));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1.3562238517514338), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2762.416270016376), (-2762.416270016376));
      Complex complex1 = complex0.exp();
      assertEquals((-2762.416270016376), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-1.718281828459045), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.05206631147995466, 0.05206631147995466);
      Complex complex1 = new Complex((-606.17017));
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-8.589388600226676E-5), complex2.getReal(), 0.01);
      assertEquals((-8.589388600226676E-5), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.divide((-276.707181872403));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-3398.711613));
      Complex complex2 = complex1.sqrt();
      assertEquals((-2.942291414708507E-4), complex1.getImaginary(), 0.01);
      assertEquals(0.012129079550214243, complex2.getReal(), 0.01);
      assertEquals((-0.012129079550214243), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(0.0, Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.createComplex(1.3245471311735498E-8, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.3245471311735498E-8, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.1551239628341062E7), 1020108.7457047035);
      Complex complex1 = complex0.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(1020108.7457047035, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-1010.0038345), (-1010.0038345));
      Complex complex2 = complex1.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals((-1010.0038345), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex((-1138.871), (-0.25));
      Complex complex2 = complex1.cos();
      assertEquals((-0.2523715569172211), complex2.getImaginary(), 0.01);
      assertEquals((-0.25), complex1.getImaginary(), 0.01);
      assertEquals((-0.0450203580641867), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2846.6963852));
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals((-2846.6963852), complex1.getReal(), 0.01);
      assertEquals((-2846.6963852), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2762.416270016376), (-2762.416270016376));
      Complex complex1 = complex0.atan();
      assertEquals((-1.8100095720786883E-4), complex1.getImaginary(), 0.01);
      assertEquals((-1.5706153258297824), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1403.3234852339624), (-1770.0));
      Complex complex1 = complex0.asin();
      assertEquals((-0.6703586169835247), complex1.getReal(), 0.01);
      assertEquals((-8.415740027107233), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.9998189498799739, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(complex0);
      assertEquals(1.9996378997599478, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.9998189498799739, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex((-329.432), (-329.432));
      Complex complex2 = complex0.add(complex1);
      assertEquals((-329.432), complex2.getImaginary(), 0.01);
      assertEquals((-328.432), complex2.getReal(), 0.01);
      assertEquals((-329.432), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.add(0.0);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Complex complex0 = new Complex((-818.22617104));
      Complex complex1 = complex0.add(0.0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-818.22617104), complex1.getReal(), 0.01);
      assertEquals((-818.22617104), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Complex complex0 = Complex.valueOf(113.976, (-523.0));
      Complex complex1 = complex0.add(1559.9077489152194);
      assertFalse(complex1.isInfinite());
      assertEquals((-523.0), complex1.getImaginary(), 0.01);
      assertEquals(1673.8837489152193, complex1.getReal(), 0.01);
      assertEquals((-523.0), complex0.getImaginary(), 0.01);
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
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
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
  public void test_0548()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0549()  throws Throwable  {
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
  public void test_0550()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.NaN.divide((Complex) null);
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
  public void test_0552()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2761.0), (-2761.0));
      Complex complex1 = complex0.sqrt();
      assertEquals((-2761.0), complex0.getImaginary(), 0.01);
      assertEquals(23.912796215751467, complex1.getReal(), 0.01);
      assertEquals((-57.73059693833122), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      Complex complex0 = Complex.valueOf(768.53);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertEquals(768.53, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-1.0));
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2762.416270016376), (-2762.416270016376));
      complex0.NaN.multiply((-2762.416270016376));
      assertEquals((-2762.416270016376), complex0.getReal(), 0.01);
      assertEquals((-2762.416270016376), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-809.4033686516594), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals((-809.4033686516594), complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      Complex complex2 = complex1.sinh();
      assertEquals((-1.1752011936438014), complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.divide(complex0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.add(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.1551239628341062E7), 1020108.7457047035);
      double double0 = complex0.abs();
      assertEquals((-1.1551239628341062E7), complex0.getReal(), 0.01);
      assertEquals(1020108.7457047035, complex0.getImaginary(), 0.01);
      assertEquals(1.1596195876425171E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      Complex complex0 = new Complex(3.304120066932761, Double.NaN);
      assertEquals(3.304120066932761, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.I.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1963.347250995531));
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
      assertEquals((-1963.347250995531), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2244.3577547122204), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-3030.012283013));
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(42.237467203124766, (-3398.711613));
      List<Complex> list0 = complex1.nthRoot(37);
      assertEquals(37, list0.size());
      assertEquals((-3398.711613), complex1.getImaginary(), 0.01);
      assertEquals(42.237467203124766, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(42.237467203124766, (-3398.711613));
      Complex complex2 = complex1.exp();
      Complex complex3 = complex2.exp();
      List<Complex> list0 = complex3.nthRoot(37);
      assertTrue(list0.contains(complex0));
      assertEquals((-3398.711613), complex1.getImaginary(), 0.01);
      assertEquals(1.94424575102372634E18, complex2.getReal(), 0.01);
      assertEquals(1.04113240300574323E18, complex2.getImaginary(), 0.01);
      assertEquals(1, list0.size());
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(1747);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.05206631147995466, 0.05206631147995466);
      // Undeclared exception!
      try { 
        complex0.nthRoot((-2868));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,868
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      complex0.tanh();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-0.7071067811865476), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865475, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sin();
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2762.416270016376), (-2762.416270016376));
      Complex complex1 = complex0.subtract(Double.NaN);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals((-2762.416270016376), complex0.getReal(), 0.01);
      assertEquals((-2762.416270016376), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(6.283185307179586);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Complex complex0 = new Complex((-1818.843393898874));
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertTrue(complex1.isNaN());
      assertEquals((-1818.843393898874), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.createComplex(149.33417807315, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(0.0);
      assertEquals(149.33417807315, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(complex0.equals((Object)complex1));
      assertTrue(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2762.416270016376), (-2762.416270016376));
      complex0.ZERO.divide(Double.NaN);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2762.416270016376), complex0.getImaginary(), 0.01);
      assertEquals((-2762.416270016376), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.divide(1.2599210498948732);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(42.237467203124766, (-3398.711613));
      Complex complex2 = complex1.divide(complex0);
      assertEquals(42.237467203124766, complex1.getReal(), 0.01);
      assertEquals((-3398.711613), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.divide(complex0);
      double double0 = complex1.getImaginary();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(559.7253109603729);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(2.377208402915858);
      Complex complex2 = complex1.tan();
      Complex complex3 = complex2.pow((-3623.99));
      Complex complex4 = complex3.acos();
      assertEquals((-9.5077868775489152E16), complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals(3.658520660883271E17, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-597.131764829));
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(1431655765);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 1.5707963267948966);
      boolean boolean0 = complex0.isNaN();
      assertEquals(1.5707963267948966, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      String string0 = complex0.toString();
      assertEquals("(NaN, NaN)", string0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.readResolve();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }
@Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
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
  public void test_0639()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Complex complex0 = new Complex((-1806.282733377276), 0.11111095942313305);
      Complex complex1 = complex0.tanh();
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(0.11111095942313305, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1806.282733377276), complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, -0.0);
      assertEquals(-0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), (-2123.3708325501852));
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-2123.3708325501852), complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.14071340213169878, complex1.getImaginary(), 0.01);
      assertEquals((-0.8002038430804147), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.subtract(1786.6);
      Complex complex2 = complex1.cosh();
      Complex complex3 = complex2.tan();
      assertFalse(complex3.isInfinite());
      assertEquals((-0.5684136414921213), complex2.getReal(), 0.01);
      assertEquals((-0.6387327241155955), complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.conjugate();
      Complex complex2 = complex1.tan();
      assertFalse(complex2.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.INF.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-2.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(211.340313277712);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.subtract(4907.802149107669);
      assertEquals((-4906.802149107669), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex1.add(complex2);
      Complex complex4 = complex3.subtract((-1006.0));
      assertEquals(1005.0, complex4.getReal(), 0.01);
      assertEquals((-7.936330239111437E-14), complex4.getImaginary(), 0.01);
      assertFalse(complex4.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-560.095142), (-560.095142));
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.tanh();
      assertEquals((-26.001820013565247), complex1.getImaginary(), 0.01);
      assertEquals(1.000000000147125, complex2.getReal(), 0.01);
      assertEquals(10.7703064960029, complex1.getReal(), 0.01);
      assertEquals((-8.708628835441756E-10), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.sinh();
      assertEquals((-1.1752011936438014), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Complex complex0 = new Complex(1596.14473, 1596.14473);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.sinh();
      assertEquals(1596.144886627408, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-1596.1445733726073), complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.sin();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(1786.6, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1786.6, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex1.sin();
      assertEquals((-4.285971550363875E-14), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals((-7.936330239111437E-14), complex1.getImaginary(), 0.01);
      assertEquals((-0.8414709848078965), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.valueOf((-1317.642642936), (-985.04622));
      Complex complex2 = complex0.I.pow(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 2855.0);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex0.pow(complex1);
      assertEquals((-1.0000000000001246), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(6.123233995737529E-17, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.pow(1786.6);
      assertEquals(1786.6, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      Complex complex0 = new Complex(3866798.102219035);
      Complex complex1 = complex0.pow((-3025.5177211727696));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 141);
      Complex complex1 = complex0.pow((double) 141);
      Complex complex2 = complex1.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1.0962128393133303E303, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.multiply((-2109.6713186247625));
      assertEquals((-2109.6713186247625), complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(0.0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex1.log();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-3.141592653589714), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getReal();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-1900.2142457));
      double double0 = complex1.getImaginary();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-5.2625644832571E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.NaN.createComplex((-2729.974125), 0.0);
      double double0 = complex1.getArgument();
      assertEquals(3.141592653589793, double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      double double0 = complex1.getArgument();
      assertEquals((-3.141592653589714), double0, 0.01);
      assertEquals((-7.936330239111437E-14), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      Complex complex0 = Complex.valueOf(882.3, 0.041666663879186654);
      Complex complex1 = complex0.exp();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.041666663879186654, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, 743.3);
      Complex complex1 = complex0.exp();
      assertEquals(509.41865110880184, complex1.getImaginary(), 0.01);
      assertEquals((-165.05741740116378), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(743.3, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      Complex complex0 = new Complex((-1006.0));
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-560.095142), (-560.095142));
      Complex complex1 = complex0.exp();
      assertEquals((-4.4137825226013134E-244), complex1.getImaginary(), 0.01);
      assertEquals((-560.095142), complex0.getImaginary(), 0.01);
      assertEquals(3.5630303120347585E-244, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-989.5093069222));
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex0.divide(complex2);
      assertEquals((-0.0010106019145089504), complex3.getReal(), 0.01);
      assertEquals((-989.5093069222), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      Complex complex0 = new Complex(3866798.102219035);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-1.0000000000000335), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(731.9034645);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Complex complex0 = new Complex(2.0, 0.5403023058681398);
      Complex complex1 = complex0.divide((-2154.694));
      assertEquals(0.5403023058681398, complex0.getImaginary(), 0.01);
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.5075593372800954E-4), complex1.getImaginary(), 0.01);
      assertEquals((-9.282060468911131E-4), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.NaN, Double.NaN);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.createComplex(0.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NaN);
      Complex complex1 = complex0.createComplex((-0.999999718285069), (-0.999999718285069));
      assertEquals((-0.999999718285069), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals((-0.999999718285069), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1786.6, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.pow((-1006.0));
      Complex complex3 = complex2.add(complex1);
      Complex complex4 = complex3.sqrt1z();
      Complex complex5 = complex4.cosh();
      assertEquals((-7.936330238371638E-14), complex5.getImaginary(), 0.01);
      assertEquals((-7.936330239111437E-14), complex2.getImaginary(), 0.01);
      assertEquals(0.9999999999999999, complex5.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Complex complex0 = new Complex((-0.1428571423679182));
      Complex complex1 = complex0.ZERO.createComplex(2502.2616464352895, 2502.2616464352895);
      Complex complex2 = complex1.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(2502.2616464352895, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-573.38022231));
      Complex complex1 = complex0.cos();
      assertEquals((-0.039552709774947466), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Complex complex0 = new Complex((-0.1428571423679182), (-0.1428571423679182));
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertEquals((-0.02040806868267467), complex1.getImaginary(), 0.01);
      assertEquals((-0.1428571423679182), complex0.getImaginary(), 0.01);
      assertEquals(0.9999305845484763, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.conjugate();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.tan();
      assertEquals((-0.761594155955765), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex1.atan();
      assertEquals((-3.963496197911966E-14), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals((-0.7853981633974483), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      Complex complex0 = Complex.valueOf(386.39);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.asin();
      assertEquals(3.206379084612184E167, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(386.39, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Complex complex0 = new Complex((-1006.0));
      Complex complex1 = complex0.asin();
      assertEquals(7.606884284274114, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex1.add(complex1);
      assertEquals((-2.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.5872660478222875E-13), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals((-7.936330239111437E-14), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(211.340313277712);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      Complex complex0 = new Complex(1786.6, 1786.6);
      Complex complex1 = complex0.I.multiply(complex0);
      Complex complex2 = complex1.add(1786.6);
      assertFalse(complex2.isInfinite());
      assertEquals(1786.6, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1786.6, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add((-573.38022231));
      assertEquals((-572.38022231), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Complex complex0 = new Complex(261.692182342107, (-1.0));
      Complex complex1 = complex0.add(261.692182342107);
      assertEquals(523.384364684214, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0710()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test_0711()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(1073741824);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
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
  public void test_0713()  throws Throwable  {
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
  public void test_0714()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.6366197723675814, 0.6366197723675814);
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
  public void test_0715()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 0.0);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      complex1.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-264.753581605));
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-264.753581605), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.multiply(2028.0959);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-1732.0820260479807));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1732.0820260479807), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.multiply(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      complex0.divide(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(2.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 0.0);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 123);
      double double0 = complex0.getImaginary();
      assertEquals(123.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      double double0 = complex0.getReal();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, Double.NaN);
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 2574.56562071914);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(53);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(31);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-4726));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -4,726
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(365);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(365, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isNaN());
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NaN);
      complex0.sinh();
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(2.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(755.09);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.acos();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-1006.0));
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.sinh();
      assertEquals(2.817149310496591E-7, complex3.getReal(), 0.01);
      assertEquals((-2.8171493107593454E-7), complex3.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(386.39);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.7908797441415157E7, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.ZERO.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(2.7908797441415157E7, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      Complex complex0 = new Complex(4907.802149107669);
      complex0.ZERO.divide(Double.NaN);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(4907.802149107669, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      Complex complex0 = new Complex((-324.1906977), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-324.1906977), complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      Complex complex2 = new Complex(1.0, Double.POSITIVE_INFINITY);
      Complex complex3 = complex2.divide(complex1);
      assertSame(complex3, complex1);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      Complex complex0 = Complex.valueOf(549.581306);
      Complex complex1 = complex0.add(Double.NaN);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(549.581306, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.7908797441415157E7, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.pow(Double.NaN);
      Complex complex2 = complex1.add(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(2.7908797441415157E7, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.ONE.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.7908797441415157E7, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.pow(Double.NaN);
      Complex complex2 = complex0.ZERO.add(complex1);
      assertTrue(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(2.7908797441415157E7, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 123);
      boolean boolean0 = complex0.isNaN();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(123.0, complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.acos();
      complex1.asin();
  }
@Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
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
  public void test_0799()  throws Throwable  {
      Complex complex0 = new Complex(1244.886400266457, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sinh();
      assertEquals(1244.886400266457, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.6033824355191673E-8), 443.011855);
      Complex complex1 = complex0.divide(443.011855);
      assertEquals((-5.876552525934474E-11), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertEquals(443.011855, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-0.09088450866185192), 6.283185307179586);
      Complex complex2 = complex1.atan();
      assertEquals((-1.5684348906151535), complex2.getReal(), 0.01);
      assertEquals(0.16048451242219242, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.07490822288864472, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(0.07490822288864472, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.tanh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), 2772.7962148);
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-1.2148245000100724), complex1.getReal(), 0.01);
      assertEquals((-0.21097892808795063), complex1.getImaginary(), 0.01);
      assertEquals(2772.7962148, complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2811.535489862639);
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2811.535489862639, complex0.getReal(), 0.01);
      assertEquals((-0.19225253817830704), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.tan();
      assertEquals(0.09462381594268642, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals((-0.3247270411411631), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.INF.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(0.0);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.subtract(0.10526403784751892);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.33333333333333287), complex1.getImaginary(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.sqrt();
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      Complex complex0 = new Complex(1943.143, 6.283185307179586);
      Complex complex1 = complex0.ONE.add((-813.433));
      Complex complex2 = complex1.sinh();
      assertFalse(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
      assertEquals((-812.433), complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1024.0, 1024.0);
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(1024.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(1024.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Complex complex0 = Complex.valueOf(759.6, (double) 2072);
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      Complex complex0 = new Complex(1943.143, 6.283185307179586);
      Complex complex1 = complex0.ONE.add((-813.433));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-812.433), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ONE.pow(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333329196, 2.14168768474935);
      Complex complex1 = complex0.pow(1045.13);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2.14168768474935, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.008333333333329196, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Complex complex0 = new Complex((-1414.3229923950223));
      Complex complex1 = complex0.pow((-1414.3229923950223));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-3492.4872377626702));
      Complex complex2 = complex1.multiply(complex1);
      assertEquals((-0.6927903687050344), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.04008301005908499, complex2.getReal(), 0.01);
      assertEquals((-0.9991963532282349), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-0.09088450866185192), 6.283185307179586);
      Complex complex2 = complex1.multiply(9.0);
      assertEquals(56.548667764616276, complex2.getImaginary(), 0.01);
      assertEquals((-0.8179605779566673), complex2.getReal(), 0.01);
      assertEquals((-0.09088450866185192), complex1.getReal(), 0.01);
      assertEquals(6.283185307179586, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.multiply(3953.223213);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals(416.1322379129224, complex1.getReal(), 0.01);
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
      assertEquals((-1317.7410709999983), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.log();
      assertEquals((-1.2649150549161383), complex1.getImaginary(), 0.01);
      assertEquals((-1.0510823694433964), complex1.getReal(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getReal();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-511.653451442994));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-511.653451442994), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((-3492.4872377626702));
      double double0 = complex1.getImaginary();
      assertEquals(0.721139033078603, complex1.getReal(), 0.01);
      assertEquals((-0.6927903687050344), double0, 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      Complex complex0 = new Complex(1943.143, 6.283185307179586);
      double double0 = complex0.ZERO.getArgument();
      assertEquals(1943.143, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(6.283185307179586, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      double double0 = complex0.getArgument();
      assertEquals((-1.2649150549161383), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(1707.5, 1707.5);
      Complex complex2 = complex1.multiply(1707.5);
      Complex complex3 = complex2.exp();
      assertEquals(2915556.25, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex3.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(2915556.25, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex(0.0, 3817);
      Complex complex2 = complex1.exp();
      assertEquals(3817.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.03506692071823295, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-0.9993849664025075), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isInfinite());
      assertEquals(1.0498508703726617, complex1.getReal(), 0.01);
      assertEquals((-0.3635145903233007), complex1.getImaginary(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(228.929052798);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1024.0, 1024.0);
      Complex complex1 = complex0.divide((-1.0));
      assertEquals((-1024.0), complex1.getImaginary(), 0.01);
      assertEquals(1024.0, complex0.getImaginary(), 0.01);
      assertEquals((-1024.0), complex1.getReal(), 0.01);
      assertEquals(1024.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.createComplex(Double.NaN, 1514.184828317367);
      assertEquals(1514.184828317367, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Complex complex0 = new Complex(1956.659, (-2150.791659));
      Complex complex1 = complex0.createComplex(Double.NEGATIVE_INFINITY, (-3377.28994338778));
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-3377.28994338778), complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      Complex complex0 = new Complex(1956.659, (-2150.791659));
      Complex complex1 = complex0.cosh();
      double double0 = complex1.getReal();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2150.791659), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.cosh();
      assertEquals(0.9501970883266997, complex1.getReal(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals((-0.03450547575556751), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.createComplex(4475.27626, 1645.7);
      Complex complex2 = complex1.cos();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1645.7, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-825.387290055));
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-825.387290055), complex1.getReal(), 0.01);
      assertEquals((-825.387290055), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.multiply(0.0);
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1024.0, 1024.0);
      Complex complex1 = complex0.multiply(complex0);
      Complex complex2 = complex1.atan();
      assertEquals(1024.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(4.7683715820305274E-7, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.sin();
      Complex complex2 = complex1.atan();
      assertEquals((-5.551115123125783E-17), complex2.getImaginary(), 0.01);
      assertEquals(0.6995216443485196, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3288.4194), 1.515663996383244E14);
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-3288.4194), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      Complex complex0 = new Complex((-0.16624882440418567));
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.1670243249841141), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-732.0));
      Complex complex1 = complex0.ONE.subtract((-732.0));
      Complex complex2 = complex1.asin();
      assertEquals((-732.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-7.290292417147336), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, 0.10526403784751892);
      Complex complex1 = Complex.valueOf((-825.387290055));
      Complex complex2 = complex0.add(complex1);
      assertEquals((-825.2820260171525), complex2.getReal(), 0.01);
      assertEquals(0.10526403784751892, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.I.add(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.21052807569503784, complex1.getReal(), 0.01);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals((-0.6666666666666657), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add((-1588.0));
      Complex complex2 = complex1.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1587.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.add(0.10526403784751892);
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertEquals(0.21052807569503784, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.33333333333333287), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.008333333333329196, 2.14168768474935);
      Complex complex1 = complex0.acos();
      assertEquals((-1.5052677644898624), complex1.getImaginary(), 0.01);
      assertEquals(1.5672707120043385, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0867()  throws Throwable  {
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
  public void test_0868()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      complex0.nthRoot(1073741824);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0870()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.I.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
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
  public void test_0872()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-3970.9295199), 6.283185307179586);
      Complex complex2 = complex1.sqrt();
      assertEquals(6.283185307179586, complex1.getImaginary(), 0.01);
      assertEquals(63.015331510378935, complex2.getImaginary(), 0.01);
      assertEquals(0.04985441762013673, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3288.4194), 1.515663996383244E14);
      Complex complex1 = complex0.NaN.log();
      assertFalse(complex0.isInfinite());
      assertEquals((-3288.4194), complex0.getReal(), 0.01);
      assertEquals(1.515663996383244E14, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      Complex complex0 = new Complex(57.2957763671875, 57.2957763671875);
      Complex complex1 = complex0.INF.multiply(6.283185307179586);
      assertEquals(57.2957763671875, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(57.2957763671875, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.6033824355191673E-8), 443.011855);
      Complex complex1 = Complex.valueOf(819.1, 819.1);
      Complex complex2 = complex1.sin();
      Complex complex3 = complex0.multiply(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(819.1, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(819.1, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      Complex complex0 = new Complex(1024.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(1024.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.multiply(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.add(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.add(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.INF.tanh();
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3288.4194), 1.515663996383244E14);
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-3288.4194), complex0.getReal(), 0.01);
      assertEquals(1.515663996383244E14, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.ONE.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      Complex complex0 = new Complex(154, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(154.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.6033824355191673E-8), 443.011855);
      double double0 = complex0.I.getArgument();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2.6033824355191673E-8), complex0.getReal(), 0.01);
      assertEquals(443.011855, complex0.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.957007209750105E-8), 196.85479880092);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(196.85479880092, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
      assertEquals((-2.957007209750105E-8), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getImaginary();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      Complex complex0 = new Complex(57.2957763671875, 57.2957763671875);
      List<Complex> list0 = complex0.INF.nthRoot(27);
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
      assertEquals(57.2957763671875, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(57.2957763671875, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(3698);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      // Undeclared exception!
      try { 
        complex0.nthRoot((-75));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -75
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.tanh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      Complex complex0 = new Complex(0.10526403784751892, (-0.33333333333333287));
      Complex complex1 = complex0.INF.tanh();
      Complex complex2 = complex1.tan();
      assertTrue(complex2.isNaN());
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.10526403784751892, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.ZERO.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1791.22544425));
      Complex complex1 = complex0.sqrt();
      assertEquals((-29.926789372149496), complex1.getImaginary(), 0.01);
      assertEquals(29.926789372149496, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-1791.22544425), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.ONE.sinh();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = complex0.sin();
      assertEquals(11.0, complex0.getReal(), 0.01);
      assertEquals(11.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-29936.777678764145), complex1.getReal(), 0.01);
      assertEquals(132.49243422565095, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.pow(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = complex0.ZERO.cosh();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      complex0.NaN.asin();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(11.0, complex0.getImaginary(), 0.01);
      assertEquals(11.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = complex0.ZERO.subtract(Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(11.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3288.4194), 1.515663996383244E14);
      complex0.NaN.subtract((-3288.4194));
      assertEquals(1.515663996383244E14, complex0.getImaginary(), 0.01);
      assertEquals((-3288.4194), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(11.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(11.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Complex complex0 = new Complex(1024.0, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(1.2702629591832921);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1024.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Complex complex0 = new Complex(57.2957763671875, 57.2957763671875);
      complex0.NaN.multiply(15.0);
      assertEquals(57.2957763671875, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(57.2957763671875, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      complex0.INF.hashCode();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4.0978193283081055E-8), 2.0);
      Complex complex1 = new Complex((-4.0978193283081055E-8));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals((-4.0978193283081055E-8), complex0.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals(2.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt1z();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf((-4.0978193283081055E-8), 2.0);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals((-4.0978193283081055E-8), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(11.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(11.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3288.4194), 1.515663996383244E14);
      Complex complex1 = complex0.INF.divide(0.0);
      assertEquals(1.515663996383244E14, complex0.getImaginary(), 0.01);
      assertEquals((-3288.4194), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.divide(1.0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.pow(1.515663996383244E14);
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.5857789309947109, complex1.getImaginary(), 0.01);
      assertEquals(0.8104708779485501, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.atan();
      assertTrue(complex1.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex2.isNaN());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.divide(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(4.0978193283081055E-8);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.acos();
      assertTrue(complex1.isNaN());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      Complex complex1 = complex0.INF.negate();
      Complex complex2 = complex1.asin();
      assertTrue(complex2.isNaN());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      List<Complex> list0 = complex0.nthRoot(248);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(248, list0.size());
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      Complex complex1 = complex0.ZERO.pow((-1.0));
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
      assertEquals((-1.0), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      Complex complex0 = new Complex(11.0, 11.0);
      complex0.I.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(11.0, complex0.getReal(), 0.01);
      assertEquals(11.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }
@Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1489.7376);
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
  public void test_0961()  throws Throwable  {
      Complex complex0 = new Complex((-1775.03074103524), (-1775.03074103524));
      complex0.hashCode();
      assertEquals((-1775.03074103524), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1775.03074103524), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((double) 273, 683.7);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(273.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(683.7, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1161.6, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(1161.6, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.tanh();
      Complex complex2 = complex1.add(complex0);
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.557407724654902, complex2.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertFalse(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-981.6));
      Complex complex1 = complex0.pow(0.16666666666666666);
      Complex complex2 = complex1.tanh();
      assertEquals(1.0085403757150582, complex2.getReal(), 0.01);
      assertEquals((-9.359565927074413E-5), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      Complex complex0 = new Complex((-6.032174644509064E-23), (-6.032174644509064E-23));
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals((-6.032174644509064E-23), complex1.getReal(), 0.01);
      assertEquals((-6.032174644509064E-23), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      Complex complex0 = new Complex((-1780.620611251012), (-1780.620611251012));
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex1.tan();
      assertEquals((-46.361613588847746), complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(6.998779810025181E-41, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 661.4823453083156);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex(1711.7289400807979, (-1665.5496));
      Complex complex2 = complex0.ONE.subtract(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(1665.5496, complex2.getImaginary(), 0.01);
      assertEquals((-1665.5496), complex1.getImaginary(), 0.01);
      assertEquals((-1710.7289400807979), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-2156.84));
      Complex complex2 = complex1.subtract(complex0);
      assertEquals((-1.0004636412529442), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(0.0);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.subtract((-1.0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-2156.84));
      Complex complex2 = complex1.sqrt();
      assertEquals((-0.01522565684862433), complex2.getImaginary(), 0.01);
      assertEquals(0.01522565684862433, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-4.636412529441219E-4), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      Complex complex0 = Complex.valueOf(14.476360444464103, 14.476360444464103);
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(913052.8022334231, complex1.getImaginary(), 0.01);
      assertEquals(14.476360444464103, complex0.getReal(), 0.01);
      assertEquals(14.476360444464103, complex0.getImaginary(), 0.01);
      assertEquals((-322152.1674788607), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      Complex complex0 = new Complex((-2156.84));
      Complex complex1 = complex0.sin();
      assertEquals((-0.9906788196691692), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2156.84), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      Complex complex0 = new Complex((-1721.414514851851), (-1721.414514851851));
      Complex complex1 = complex0.sin();
      assertFalse(complex0.isInfinite());
      assertEquals((-1721.414514851851), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-1721.414514851851), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      Complex complex0 = new Complex(1488.21513767, (-3011.0746556864233));
      Complex complex1 = complex0.pow(complex0);
      assertEquals((-3011.0746556864233), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 661.4823453083156);
      Complex complex1 = complex0.pow(661.4823453083156);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(661.4823453083156, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(3989.351);
      Complex complex2 = complex1.tanh();
      assertEquals(0.6749983061118278, complex2.getImaginary(), 0.01);
      assertEquals(0.8518183739631962, complex1.getImaginary(), 0.01);
      assertEquals((-0.8513364685049488), complex2.getReal(), 0.01);
      assertEquals((-0.5238372435964214), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.479773539153719E-5);
      Complex complex1 = complex0.INF.negate();
      assertEquals(2.479773539153719E-5, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ZERO.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.cos();
      Complex complex2 = complex1.ZERO.createComplex((-734.272), (-734.272));
      Complex complex3 = complex1.multiply(complex2);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1133.0409038870587), complex3.getReal(), 0.01);
      assertEquals((-1133.0409038870587), complex3.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.479773539153719E-5);
      Complex complex1 = complex0.multiply((-3035.1113));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-0.07526388690126445), complex1.getReal(), 0.01);
      assertEquals(2.479773539153719E-5, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(1446.2981498804);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1446.2981498804, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1918.6));
      Complex complex1 = complex0.ZERO.pow((-1918.6));
      boolean boolean0 = complex1.isNaN();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1918.6), complex0.getReal(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-6.663542893624021E-14), (-6.663542893624021E-14));
      boolean boolean0 = complex0.isInfinite();
      assertEquals((-6.663542893624021E-14), complex0.getReal(), 0.01);
      assertEquals((-6.663542893624021E-14), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      Complex complex0 = new Complex((-1404.889972392451));
      Complex complex1 = complex0.sqrt();
      double double0 = complex1.getReal();
      assertEquals(37.481861912029544, complex1.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.ZERO.cos();
      Complex complex2 = complex1.atan();
      double double0 = complex2.getReal();
      assertEquals(0.7853981633974483, double0, 0.01);
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      Complex complex0 = new Complex((-273.482048), (-273.482048));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-273.482048), double0, 0.01);
      assertEquals((-273.482048), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.divide(6.283185307179586);
      double double0 = complex1.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 1489.7376);
      Complex complex1 = complex0.negate();
      double double0 = complex1.getImaginary();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(1489.7376, complex0.getImaginary(), 0.01);
      assertEquals((-1489.7376), double0, 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      Complex complex0 = new Complex((-1721.414514851851), (-1721.414514851851));
      double double0 = complex0.getArgument();
      assertFalse(complex0.isInfinite());
      assertEquals((-2.356194490192345), double0, 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1523.8, 1523.8);
      Complex complex1 = complex0.exp();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(1523.8, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      Complex complex0 = new Complex(1488.21513767, (-3011.0746556864233));
      Complex complex1 = complex0.I.createComplex((-3011.0746556864233), 0.0);
      Complex complex2 = complex1.exp();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      Complex complex0 = Complex.valueOf(14.476360444464103, 14.476360444464103);
      Complex complex1 = complex0.exp();
      assertEquals((-644304.3349578932), complex1.getReal(), 0.01);
      assertEquals(14.476360444464103, complex0.getImaginary(), 0.01);
      assertEquals(1826105.6044663591, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-6.663542893624021E-14), (-6.663542893624021E-14));
      Complex complex1 = complex0.exp();
      assertEquals(0.9999999999999334, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-6.663542893624021E-14), complex0.getImaginary(), 0.01);
      assertEquals((-6.663542893623577E-14), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-981.6));
      Complex complex1 = Complex.valueOf(665.4552381, (-2934.38059691));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-0.07215072868277299), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-0.3181546799513379), complex2.getImaginary(), 0.01);
      assertEquals(665.4552381, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide((-2135.5344590417926));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      Complex complex0 = new Complex(1704.383990930526);
      Complex complex1 = complex0.createComplex(Double.NaN, 1704.383990930526);
      assertEquals(1704.383990930526, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals(1704.383990930526, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.createComplex((-848.306345023), Double.POSITIVE_INFINITY);
      assertEquals((-848.306345023), complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      Complex complex0 = new Complex((-1721.414514851851), (-1721.414514851851));
      Complex complex1 = complex0.createComplex(0.0, (-1.0));
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex((-324.43392490492), 0.0);
      Complex complex2 = complex1.pow((-230.481936));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(1779, 1488.21513767);
      Complex complex2 = complex1.cosh();
      assertEquals(1488.21513767, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      Complex complex0 = new Complex((-1404.889972392451));
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.826431585761543), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-6.663542893624021E-14), (-6.663542893624021E-14));
      Complex complex1 = complex0.cos();
      Complex complex2 = complex0.pow(complex1);
      assertEquals((-6.663542893624012E-14), complex2.getImaginary(), 0.01);
      assertEquals((-6.663542893624011E-14), complex2.getReal(), 0.01);
      assertEquals((-4.438811247647237E-27), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.conjugate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(1.5707963267948966);
      Complex complex2 = complex1.atan();
      assertEquals(0.2409022331451228, complex2.getImaginary(), 0.01);
      assertEquals((-1.1182850384116252), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.atan();
      assertEquals(0.9553166181245093, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.1102230246251565E-16), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.16624882440418567));
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.1670243249841141), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Complex complex0 = new Complex(1042.1357, 2181.74575208);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.asin();
      assertEquals(1.12517881227895, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.add(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex((-379.3761459017507), (-379.3761459017507));
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-379.3761459017507), complex1.getImaginary(), 0.01);
      assertEquals((-379.3761459017507), complex2.getImaginary(), 0.01);
      assertEquals((-378.3761459017507), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add((-44.460977));
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(0.0);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add((-2239263.7929177554));
      assertFalse(complex1.isNaN());
      assertEquals((-2239262.7929177554), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1918.6));
      Complex complex1 = Complex.valueOf((-1918.6), (-1918.6));
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.add((-414.4674670909698));
      assertEquals((-0.5), complex3.getImaginary(), 0.01);
      assertEquals((-413.9674670909698), complex3.getReal(), 0.01);
      assertEquals((-1918.6), complex1.getImaginary(), 0.01);
      assertEquals((-0.5), complex2.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
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
  public void test_1029()  throws Throwable  {
      Complex complex0 = new Complex((-2156.84));
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
  public void test_1030()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(2146488447);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
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
  public void test_1032()  throws Throwable  {
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
  public void test_1033()  throws Throwable  {
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
  public void test_1034()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertFalse(complex0.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((double) 1408);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      Complex complex0 = new Complex((-1721.414514851851), (-1721.414514851851));
      Complex complex1 = complex0.NaN.multiply(0.1818181574344635);
      Complex complex2 = complex0.ONE.subtract(complex1);
      assertEquals((-1721.414514851851), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1721.414514851851), complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-753.2402023359886));
      assertEquals((-753.2402023359886), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ONE.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.479773539153719E-5);
      double double0 = complex0.abs();
      assertEquals(2.479773539153719E-5, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2.479773539153719E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.ZERO.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.INF.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.16624882440418567));
      double double0 = complex0.I.abs();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.0, double0, 0.01);
      assertEquals((-0.16624882440418567), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-1404.889972392451));
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
      assertEquals((-1404.889972392451), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      Complex complex0 = new Complex(1714.31954712, Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals(1714.31954712, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.479773539153719E-5);
      double double0 = complex0.I.getArgument();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2.479773539153719E-5, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      Complex complex0 = Complex.valueOf(5.1718, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      List<Complex> list0 = complex1.nthRoot(1324);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(1, list0.size());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(201);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-66));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -66
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tanh();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      Complex complex0 = new Complex((-1780.620611251012), (-1780.620611251012));
      Complex complex1 = complex0.sinh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1780.620611251012), complex0.getReal(), 0.01);
      assertEquals((-1780.620611251012), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      Complex complex0 = new Complex((-1780.620611251012), (-1780.620611251012));
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-1780.620611251012), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cos();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.asin();
      Complex complex2 = complex0.ONE.pow(complex1);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2156.84));
      Complex complex1 = complex0.I.asin();
      Complex complex2 = complex0.conjugate();
      Complex complex3 = complex1.pow(complex2);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(-0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      Complex complex2 = complex1.tan();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      Complex complex0 = new Complex((-1780.620611251012), (-1780.620611251012));
      Complex complex1 = complex0.subtract((-245.4192122437244));
      assertEquals((-1780.620611251012), complex1.getImaginary(), 0.01);
      assertEquals((-1780.620611251012), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1535.2013990072876), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(174.4884559769);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2156.84));
      complex0.NaN.sqrt1z();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-2156.84), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.subtract(complex0);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.ZERO.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      Complex complex0 = new Complex(1446.2981498804, 1673.86471);
      Complex complex1 = Complex.valueOf(1446.2981498804);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1446.2981498804, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cosh();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1090()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.divide(Double.NEGATIVE_INFINITY);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      Complex complex0 = new Complex((-1780.620611251012), (-1780.620611251012));
      Complex complex1 = complex0.divide(3969.9219495);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.44852786374686177), complex1.getImaginary(), 0.01);
      assertEquals((-0.44852786374686177), complex1.getReal(), 0.01);
      assertEquals((-1780.620611251012), complex0.getReal(), 0.01);
      assertEquals((-1780.620611251012), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(1446.2981498804);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      Complex complex0 = new Complex((-6.032174644509064E-23), (-6.032174644509064E-23));
      Complex complex1 = new Complex((-6.032174644509064E-23), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals((-6.032174644509064E-23), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2156.84));
      Complex complex1 = complex0.INF.cos();
      Complex complex2 = complex0.I.divide(complex1);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals((-2156.84), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sqrt();
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(2.7689167860486803);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2156.84));
      Complex complex1 = complex0.INF.cos();
      Complex complex2 = complex1.INF.add(complex1);
      assertFalse(complex0.isNaN());
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals((-2156.84), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      Complex complex0 = new Complex((-6.032174644509064E-23), (-6.032174644509064E-23));
      Complex complex1 = complex0.log();
      assertEquals((-2.356194490192345), complex1.getImaginary(), 0.01);
      assertEquals((-6.032174644509064E-23), complex0.getImaginary(), 0.01);
      assertEquals((-50.815775965294385), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      Complex complex0 = new Complex((-6.032174644509064E-23), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(294);
      assertEquals(294, list0.size());
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow((double) 1435);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(5.246378247379719E-14, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.16624882440418567));
      boolean boolean0 = complex0.isNaN();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-0.16624882440418567), complex0.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.ONE.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      Complex complex0 = new Complex((-6.032174644509064E-23), (-6.032174644509064E-23));
      String string0 = complex0.toString();
      assertFalse(complex0.isInfinite());
      assertEquals("(-6.032174644509064E-23, -6.032174644509064E-23)", string0);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.sqrt1z();
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.ZERO.readResolve();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }
@Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      Complex complex0 = Complex.valueOf(7.0, 7.0);
      List<Complex> list0 = complex0.nthRoot(7);
      assertEquals(7, list0.size());
      assertEquals(7.0, complex0.getImaginary(), 0.01);
      assertEquals(7.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
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
  public void test_1119()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex(0.031, 0.031);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals(0.031, complex1.getImaginary(), 0.01);
      assertEquals(0.031, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      Complex complex0 = new Complex((-883.272386506997), (-883.272386506997));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-100.55417626226904), complex2.getImaginary(), 0.01);
      assertEquals(122.99678453318603, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.multiply(complex0);
      Complex complex2 = complex1.log();
      Complex complex3 = complex2.atan();
      assertEquals((-1.5707963267948966), complex3.getReal(), 0.01);
      assertEquals(0.7524692671419272, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.negate();
      Complex complex2 = complex1.tanh();
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-0.761594155955765), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      Complex complex0 = new Complex(1560340.2175315318, 2.0);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.tanh();
      assertEquals((-0.08563814502943998), complex2.getImaginary(), 0.01);
      assertEquals(0.9909397549540175, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1938.150994457), (-1938.150994457));
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1938.150994457), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals((-1938.150994457), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1938.150994457), (-1938.150994457));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.tan();
      assertEquals((-1.414213562373095), complex2.getImaginary(), 0.01);
      assertEquals(6.123233995736767E-17, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      Complex complex0 = Complex.valueOf(243.0898579, 243.0898579);
      Complex complex1 = complex0.INF.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(243.0898579, complex0.getReal(), 0.01);
      assertEquals(243.0898579, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      Complex complex0 = new Complex((-1892.4), 2745.4);
      Complex complex1 = complex0.ONE.cosh();
      Complex complex2 = complex0.I.subtract(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.5430806348152437), complex2.getReal(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(3677.83830708758);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1938.150994457), (-1938.150994457));
      Complex complex1 = complex0.subtract((-1052.7942274735));
      assertEquals((-885.3567669834999), complex1.getReal(), 0.01);
      assertEquals((-1938.150994457), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1938.150994457), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-2843.458));
      Complex complex1 = complex0.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-2843.458), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      Complex complex0 = new Complex((-883.272386506997), (-883.272386506997));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sinh();
      assertEquals((-0.026600821058896267), complex2.getReal(), 0.01);
      assertEquals((-1.323987738944831), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1755.9536186623914), 507.44);
      Complex complex1 = complex0.sin();
      assertEquals((-2.3351078659214546E219), complex1.getReal(), 0.01);
      assertEquals((-1.1719463423069055E220), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1755.9536186623914), complex0.getReal(), 0.01);
      assertEquals(507.44, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.211697197882296E7));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      Complex complex0 = new Complex(1086.9);
      Complex complex1 = complex0.pow((-651.335258077));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      Complex complex0 = new Complex(1086.9);
      Complex complex1 = complex0.INF.negate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3758.0900346515887);
      Complex complex1 = complex0.ZERO.multiply(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(3758.0900346515887, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1010.8591);
      Complex complex1 = new Complex((-0.2499999997677497), (-1.0));
      Complex complex2 = complex0.ONE.multiply(complex1);
      assertFalse(complex2.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(1010.8591, complex0.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.multiply((-2839.895606715));
      assertEquals((-2839.895606715), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.multiply((-0.25));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-0.25), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      Complex complex0 = new Complex(1634.8068, 0.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1634.8068, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1507.6548896360255), (-1507.6548896360255));
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertEquals((-1507.6548896360255), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1507.6548896360255), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.16624879837036133));
      double double0 = complex0.getImaginary();
      assertEquals((-0.16624879837036133), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1153()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.sqrt1z();
      double double0 = complex1.getImaginary();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
      Complex complex0 = new Complex(1171.913112, 1171.913112);
      Complex complex1 = complex0.sqrt1z();
      double double0 = complex1.getArgument();
      assertEquals((-0.7853979813648444), double0, 0.01);
      assertEquals(1171.913112, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1156()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 291466079, (double) 291466079);
      Complex complex1 = complex0.exp();
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(2.91466079E8, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1157()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1105.0));
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      Complex complex0 = Complex.valueOf(243.0898579, 243.0898579);
      Complex complex1 = complex0.exp();
      assertEquals((-1.3987156601076947E105), complex1.getReal(), 0.01);
      assertEquals((-3.465930449577318E105), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(243.0898579, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      Complex complex0 = new Complex((-946.6436495), (-946.6436495));
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-0.002558144150086928), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(Double.NaN, 1847.889033);
      assertFalse(complex1.isInfinite());
      assertEquals(1847.889033, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.createComplex(6.283185307179586, Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
      assertEquals(6.283185307179586, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.createComplex(0.0, (-2339.9509));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-2339.9509), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex((-1193.3123480050492), 0.0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1193.3123480050492), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-2843.458));
      Complex complex1 = complex0.cosh();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2843.458), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      Complex complex0 = Complex.valueOf(22.1665891, 22.1665891);
      Complex complex1 = complex0.cosh();
      assertEquals(22.1665891, complex0.getImaginary(), 0.01);
      assertEquals((-3.69570310782286E8), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2.0848706021341922E9), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-38.478417581611005), (-946.6436495));
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-946.6436495), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.sqrt1z();
      Complex complex2 = complex1.conjugate();
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.atan();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4106.9));
      Complex complex1 = complex0.atan();
      assertEquals((-1.5705528341410124), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.665334536937735E-16), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(426.17032735);
      Complex complex2 = complex1.asin();
      assertEquals((-1.0307587149330282), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.add(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(3.203749656677246E-7);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(3.203749656677246E-7, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.divide((-1.5707963267948966));
      Complex complex2 = complex1.add((-694.493400873));
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3758.0900346515887);
      Complex complex1 = complex0.acos();
      assertEquals(8.924813300859606, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_1180()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_1181()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(2147480873);
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
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
  public void test_1183()  throws Throwable  {
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
  public void test_1184()  throws Throwable  {
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
  public void test_1185()  throws Throwable  {
      Complex complex0 = new Complex(1086.9);
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.sqrt();
      Complex complex3 = complex2.add(0.0);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.30217652406994056, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.log();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.ONE.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-1904.0522));
      Complex complex1 = complex0.negate();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1904.0522, complex1.getImaginary(), 0.01);
      assertEquals((-1904.0522), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-3921.4514));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(0.02660082);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.multiply(Double.NaN);
      Complex complex2 = complex1.sqrt();
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(29.3083030982, Double.NaN);
      Complex complex2 = complex1.multiply(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      Complex complex0 = new Complex(1634.8068, 0.0);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-1.000000187084262), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      Complex complex2 = complex0.add(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-5669.945844885174), (-5669.945844885174));
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals((-11339.891689770348), complex1.getReal(), 0.01);
      assertEquals((-11339.891689770348), complex1.getImaginary(), 0.01);
      assertEquals((-5669.945844885174), complex0.getReal(), 0.01);
      assertEquals((-5669.945844885174), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.add(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.211697197882296E7));
      double double0 = complex0.abs();
      assertEquals(1.211697197882296E7, double0, 0.01);
      assertEquals((-1.211697197882296E7), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      Complex complex0 = Complex.valueOf(901.940888093);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.pow(complex0);
      double double0 = complex3.abs();
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-0.33333333333333287));
      assertTrue(complex0.isNaN());
      assertEquals((-0.33333333333333287), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 5.551115123125783E-17);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(2964);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(190);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1372));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,372
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-377.7202113538539));
      Complex complex1 = complex0.sqrt();
      assertEquals((-377.7202113538539), complex0.getImaginary(), 0.01);
      assertEquals((-13.74263823568557), complex1.getImaginary(), 0.01);
      assertEquals(13.742638235685568, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cosh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      Complex complex0 = Complex.valueOf(630.29, (-1595.5854929065));
      Complex complex1 = complex0.cos();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1595.5854929065), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(Double.NaN);
      Complex complex2 = complex0.multiply(complex1);
      complex2.asin();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.subtract(Double.NaN);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      Complex complex0 = new Complex((-946.6436495), (-946.6436495));
      Complex complex1 = complex0.NaN.subtract((-2348.597143));
      Complex complex2 = complex1.acos();
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertEquals((-946.6436495), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-946.6436495), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.negate();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.5071963801993278));
      Complex complex1 = complex0.ZERO.pow((-0.5071963801993278));
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-0.5071963801993278), complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      Complex complex0 = new Complex((-3919.625914419), (-1.0));
      Complex complex1 = new Complex((-2523.4233563), (-2523.4233563));
      Complex complex2 = complex1.sin();
      Complex complex3 = complex0.pow(complex2);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertTrue(complex3.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-2523.4233563), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-2523.4233563), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      Complex complex0 = new Complex(1560340.2175315318, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(1560340.2175315318, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.5071963801993278));
      Complex complex1 = complex0.I.pow(complex0);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.7150546025602225), complex1.getImaginary(), 0.01);
      assertEquals(0.6990686056156737, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      Complex complex0 = Complex.valueOf(901.940888093);
      Complex complex1 = complex0.pow(901.940888093);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(562);
      boolean boolean0 = complex0.equals(list0);
      assertTrue(list0.contains(complex0));
      assertEquals(562, list0.size());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      boolean boolean0 = complex0.equals(complex0);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.5071963801993278));
      Complex complex1 = Complex.valueOf((-0.5071963801993278));
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
      assertEquals((-0.5071963801993278), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1242()  throws Throwable  {
      Complex complex0 = new Complex((-946.6436495), (-946.6436495));
      Complex complex1 = complex0.divide((-2348.597143));
      assertEquals(0.40306770035954187, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-946.6436495), complex0.getReal(), 0.01);
      assertEquals(0.40306770035954187, complex1.getReal(), 0.01);
      assertEquals((-946.6436495), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1243()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1244()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1245()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1246()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.divide((-1.0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1247()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1248()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1249()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(Double.NaN);
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1250()  throws Throwable  {
      Complex complex0 = new Complex(1171.913112, 1171.913112);
      Complex complex1 = complex0.NaN.sqrt1z();
      Complex complex2 = complex1.divide(complex0);
      assertEquals(1171.913112, complex0.getImaginary(), 0.01);
      assertEquals(1171.913112, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1251()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1252()  throws Throwable  {
      Complex complex0 = new Complex((-3919.625914419), (-1.0));
      Complex complex1 = complex0.conjugate();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.equals((Object)complex0));
      assertEquals((-3919.625914419), complex0.getReal(), 0.01);
      assertEquals((-3919.625914419), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1253()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(6089.408893018744);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1254()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(4.854477144983465E15);
      Complex complex2 = complex1.acos();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(4.854477144983465E15, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1255()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3.2297131674420968E7), Double.NaN);
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1256()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-377.7202113538539));
      Complex complex1 = complex0.pow(249.79125);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-377.7202113538539), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1257()  throws Throwable  {
      Complex complex0 = new Complex((-1071.0), Double.NaN);
      assertEquals((-1071.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1258()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.getArgument();
  }

  @Test(timeout = 4000)
  public void test_1259()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1260()  throws Throwable  {
      Complex complex0 = new Complex((-946.6436495), (-946.6436495));
      complex0.ONE.getField();
      assertEquals((-946.6436495), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-946.6436495), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1261()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.toString();
      assertEquals("(1.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_1262()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.ZERO.readResolve();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }
@Test(timeout = 4000)
  public void test_1263()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_1264()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1265()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.tanh();
      Complex complex2 = complex1.atan();
      assertEquals(0.7617262217813369, complex2.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getReal(), 0.01);
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1266()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1267()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-66.80740982), 1.4142135623730951);
      Complex complex1 = complex0.tanh();
      assertEquals((-66.80740982), complex0.getReal(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(1.4142135623730951, complex0.getImaginary(), 0.01);
      assertEquals(5.774348486344889E-59, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1268()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.tanh();
      assertEquals((-0.08609933514440239), complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(1.0129425523765607, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1269()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1270()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1271()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(954.87841);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1272()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(1.0);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1273()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.subtract(0.0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1274()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1275()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1276()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.sinh();
      assertEquals((-487.0), complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1277()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.sinh();
      assertTrue(complex0.isInfinite());
      assertEquals(1.46383751424058, complex2.getReal(), 0.01);
      assertEquals((-487.0), complex0.getImaginary(), 0.01);
      assertEquals((-1.9361155717005505), complex2.getImaginary(), 0.01);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1278()  throws Throwable  {
      Complex complex0 = new Complex(1581.56);
      Complex complex1 = complex0.sin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.9732312317245536), complex1.getReal(), 0.01);
      assertEquals(1581.56, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1279()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1280()  throws Throwable  {
      Complex complex0 = new Complex((-2129.83857), (-1199.0));
      Complex complex1 = complex0.sin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-2129.83857), complex0.getReal(), 0.01);
      assertEquals((-1199.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1281()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1282()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf((-1585.351487836411), (-2769.0));
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1283()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-566.18382559567), (-2222.524004477));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1284()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-347.6019158));
      Complex complex1 = complex0.pow((-312.90935));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-347.6019158), complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1285()  throws Throwable  {
      Complex complex0 = new Complex((-3.966488024611456E7), (-3.966488024611456E7));
      Complex complex1 = complex0.pow(752.988);
      assertEquals((-3.966488024611456E7), complex0.getReal(), 0.01);
      assertEquals((-3.966488024611456E7), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1286()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.INF.multiply(0.0);
      Complex complex2 = complex1.negate();
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1287()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ONE.negate();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1288()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1289()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1290()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.log();
      assertEquals(0.5884375528174727, complex2.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-0.5113252103366475), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1291()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1292()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      boolean boolean0 = complex0.isInfinite();
      assertEquals((-487.0), complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1293()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1080.0));
      Complex complex1 = complex0.acos();
      double double0 = complex1.getReal();
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals((-7.677863286343436), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1294()  throws Throwable  {
      Complex complex0 = new Complex((-2476.450813104), (-2476.450813104));
      double double0 = complex0.getReal();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-2476.450813104), complex0.getImaginary(), 0.01);
      assertEquals((-2476.450813104), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1295()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1296()  throws Throwable  {
      Complex complex0 = new Complex((-1311.0), (-1311.0));
      double double0 = complex0.getImaginary();
      assertEquals((-1311.0), double0, 0.01);
      assertEquals((-1311.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1297()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0), 2.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tan();
      double double0 = complex2.getArgument();
      assertEquals((-1.6417448540969786), double0, 0.01);
      assertEquals(1.9978749131873728, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1298()  throws Throwable  {
      Complex complex0 = new Complex((-1311.0), (-1311.0));
      Complex complex1 = complex0.exp();
      assertEquals((-1311.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1299()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.exp();
      assertTrue(complex0.isInfinite());
      assertEquals((-487.0), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1300()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1301()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 1.0);
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.exp();
      assertEquals(0.5403023058681398, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-0.8414709848078965), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1302()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, (-487.0));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1303()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-0.9999998473210575));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-0.49999999999999417), complex2.getImaginary(), 0.01);
      assertEquals(0.5000000763394771, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1304()  throws Throwable  {
      Complex complex0 = new Complex((-587.493237052235), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(0.4440446393655);
      assertEquals((-587.493237052235), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals((-1323.0499480676317), complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1305()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.valueOf(40.10856, 1.986821492305628E-8);
      Complex complex2 = complex0.I.subtract(complex1);
      Complex complex3 = complex2.pow(complex1);
      Complex complex4 = complex3.divide(0.058823529411764705);
      assertEquals((-2.1194808949567363E65), complex4.getImaginary(), 0.01);
      assertEquals(2.738027967127672E65, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1306()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.createComplex(Double.NaN, Double.NaN);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1307()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.createComplex(5114733.758262398, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(5114733.758262398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1308()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1309()  throws Throwable  {
      Complex complex0 = new Complex((-1378.8363), (-1378.8363));
      Complex complex1 = complex0.I.createComplex((-1378.8363), (-2860.2));
      assertEquals((-2860.2), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals((-1378.8363), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1310()  throws Throwable  {
      Complex complex0 = new Complex(8906.725464065294, 8906.725464065294);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.cosh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals((-8906.725464065294), complex2.getReal(), 0.01);
      assertEquals(8906.725464065294, complex2.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1311()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 2057.3);
      Complex complex1 = complex0.cosh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.90338912941235), complex1.getReal(), 0.01);
      assertEquals(2057.3, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1312()  throws Throwable  {
      Complex complex0 = new Complex(1581.56);
      Complex complex1 = complex0.cos();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.2298281305582681), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1313()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.createComplex(968.4031, 1282);
      Complex complex2 = complex1.cos();
      assertEquals(1282.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1314()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(0.0, (-1194.8));
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.conjugate();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals((-1194.8), complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1315()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2104.754804869532), 8.0E298);
      Complex complex1 = complex0.asin();
      assertEquals(8.0E298, complex0.getImaginary(), 0.01);
      assertEquals((-2104.754804869532), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1316()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1317()  throws Throwable  {
      Complex complex0 = new Complex((-1378.8363), (-1378.8363));
      Complex complex1 = complex0.asin();
      assertEquals((-8.268715932377159), complex1.getImaginary(), 0.01);
      assertEquals((-0.7853980976491381), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1318()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-9.703619023157637));
      Complex complex1 = complex0.createComplex((-294.0255), 0.0);
      Complex complex2 = complex1.add(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals((-294.0255), complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-9.703619023157637), complex2.getImaginary(), 0.01);
      assertEquals((-294.0255), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1319()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1320()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.conjugate();
      Complex complex2 = complex0.add(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_1321()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add((-1.0));
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1322()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1323()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-488.951182863), 8.0E298);
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex2.add((-1.0));
      assertEquals((-488.951182863), complex3.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertFalse(complex1.isInfinite());
      assertEquals((-8.0E298), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1324()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      complex1.multiply(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1325()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.multiply((-1158.821));
      assertEquals((-1820.2717702127886), complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1326()  throws Throwable  {
      Complex complex0 = new Complex((-2129.83857), (-2129.83857));
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
  public void test_1327()  throws Throwable  {
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
  public void test_1328()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(2145780647);
  }

  @Test(timeout = 4000)
  public void test_1329()  throws Throwable  {
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
  public void test_1330()  throws Throwable  {
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
  public void test_1331()  throws Throwable  {
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
  public void test_1332()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1333()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1334()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1335()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.log();
      Complex complex2 = complex1.multiply((-1367.405930417));
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals((-2147.9162127365817), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1336()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.exp();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1337()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.tanh();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1338()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.subtract(complex0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1339()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1340()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1341()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1080.0));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals((-1080.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1342()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1343()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.divide(complex0);
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1344()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1345()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1080.0));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1080.0), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1346()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow((-1765.37805));
      Complex complex2 = complex1.add(complex0);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1347()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      double double0 = complex0.ZERO.abs();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1348()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2117.2937195), (-2117.2937195));
      double double0 = complex0.I.abs();
      assertFalse(complex0.isInfinite());
      assertEquals((-2117.2937195), complex0.getImaginary(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals((-2117.2937195), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1349()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1350()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1351()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 0.0);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1352()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, (-1408.794933));
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1408.794933), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1353()  throws Throwable  {
      Complex complex0 = new Complex((-1.0), Double.NaN);
      assertFalse(complex0.isInfinite());
      assertEquals((-1.0), complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1354()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1355()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1356()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1357()  throws Throwable  {
      Complex complex0 = new Complex((-560.82));
      Complex complex1 = complex0.ONE.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1358()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1359()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.9999981793233398, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1360()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1361()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(91);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1362()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(22);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1363()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-3830));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -3,830
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1364()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1365()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1366()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1367()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1811.61044), (-1811.61044));
      Complex complex1 = complex0.NaN.asin();
      Complex complex2 = complex1.sinh();
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals((-1811.61044), complex0.getImaginary(), 0.01);
      assertEquals((-1811.61044), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1368()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1369()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sin();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1370()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1371()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1372()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1373()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.cos();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1374()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.9699272335463627E-8);
      Complex complex1 = complex0.INF.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(1.9699272335463627E-8, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1375()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-566.18382559567), (-2222.524004477));
      Complex complex1 = complex0.subtract((-566.18382559567));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-2222.524004477), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2222.524004477), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1376()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(3380.5);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1377()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.subtract(complex0);
      Complex complex2 = complex1.acos();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1378()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1379()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1380()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.multiply(3030.2);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1381()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1.225743062930824E-8, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(1.225743062930824E-8, complex1.getReal(), 0.01);
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1382()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1383()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(Double.NaN);
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1384()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1385()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1386()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = new Complex(0.0, 0.38056767015119386);
      Complex complex2 = complex1.conjugate();
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(complex2.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1387()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1388()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1389()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1390()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1391()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1392()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1393()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1394()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1395()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.divide(Double.NaN);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertSame(complex2, complex0);
  }

  @Test(timeout = 4000)
  public void test_1396()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-566.18382559567), (-2222.524004477));
      Complex complex1 = complex0.divide((-2222.524004477));
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-566.18382559567), complex0.getReal(), 0.01);
      assertEquals((-2222.524004477), complex0.getImaginary(), 0.01);
      assertEquals(0.254748126209284, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1397()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.divide((-415.3174029291901));
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1398()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1399()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1400()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.9699272335463627E-8);
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1401()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1402()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-566.18382559567), (-2222.524004477));
      Complex complex1 = complex0.atan();
      assertEquals((-4.225188770952093E-4), complex1.getImaginary(), 0.01);
      assertEquals((-1.570688690889027), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1403()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1404()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1080.0));
      Complex complex1 = complex0.add(Double.NaN);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1080.0), complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1405()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.add(1.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1406()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(265);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(265, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_1407()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1408()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-488.951182863), 8.0E298);
      Complex complex2 = complex1.multiply(complex0);
      Complex complex3 = complex2.acos();
      assertEquals((-488.951182863), complex2.getImaginary(), 0.01);
      assertEquals((-8.0E298), complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1409()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-566.18382559567), (-2222.524004477));
      Complex complex1 = complex0.tan();
      assertEquals((-2222.524004477), complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-566.18382559567), complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1410()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1411()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1412()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_1413()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_1414()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      complex1.cosh();
  }
@Test(timeout = 4000)
  public void test_1415()  throws Throwable  {
      Complex complex0 = Complex.ONE;
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
  public void test_1416()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3231.4680753696, 3231.4680753696);
      complex0.hashCode();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(3231.4680753696, complex0.getReal(), 0.01);
      assertEquals(3231.4680753696, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1417()  throws Throwable  {
      Complex complex0 = new Complex(1.9521825287144194);
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.add(complex0);
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(1.9521825287144194, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals(1.676608667941874, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1418()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2000.8114050053, 2000.8114050053);
      Complex complex1 = complex0.INF.sinh();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertEquals(2000.8114050053, complex0.getImaginary(), 0.01);
      assertEquals(2000.8114050053, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1419()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1420()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex1.tanh();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.557407724654902), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1421()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1422()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2000.420034006);
      Complex complex1 = complex0.tan();
      assertEquals((-0.9784110527242698), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2000.420034006, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1423()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1424()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.subtract(0.008333333333329196);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1425()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.ZERO.subtract(0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1426()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(1.8014398509481984E16);
      assertFalse(complex1.isNaN());
      assertEquals((-1.8014398509481984E16), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1427()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1428()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-2887.4599));
      Complex complex2 = complex1.sqrt();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(37.99644654438096, complex2.getReal(), 0.01);
      assertEquals((-37.996446544380966), complex2.getImaginary(), 0.01);
      assertEquals((-2887.4599), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1429()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2740.5), (-17.0843035548));
      Complex complex1 = complex0.sinh();
      assertEquals((-17.0843035548), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2740.5), complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1430()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.sinh();
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1431()  throws Throwable  {
      Complex complex0 = new Complex((-1180.582492056), (-2801.913572));
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals((-1180.582492056), complex0.getReal(), 0.01);
      assertEquals((-2801.913572), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1432()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1433()  throws Throwable  {
      Complex complex0 = new Complex(2216.86);
      Complex complex1 = complex0.sin();
      assertEquals(2216.86, complex0.getReal(), 0.01);
      assertEquals((-0.8932005906516214), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1434()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3856.014343296685, 810.7337331650375);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1435()  throws Throwable  {
      Complex complex0 = new Complex((-1180.582492056), (-2801.913572));
      Complex complex1 = complex0.pow(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1436()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(0.008333333333329196, (-3422.9580007479203));
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex0.pow(complex2);
      assertEquals((-4.589002463820079E-4), complex3.getImaginary(), 0.01);
      assertEquals(7.112390825598909E-10, complex2.getImaginary(), 0.01);
      assertEquals(0.9999998935880645, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1437()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1103.500912));
      Complex complex1 = complex0.pow(3492.3488575652);
      assertEquals((-1103.500912), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1438()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2388.3);
      Complex complex1 = complex0.pow((-2055.631));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1439()  throws Throwable  {
      Complex complex0 = new Complex(0.1538461446762085);
      Complex complex1 = complex0.I.pow(850.7049085450521);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.4471071237438667), complex1.getReal(), 0.01);
      assertEquals((-0.894480418956998), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1440()  throws Throwable  {
      Complex complex0 = new Complex((-1180.582492056), (-2801.913572));
      Complex complex1 = complex0.ONE.tanh();
      Complex complex2 = complex1.multiply(complex0);
      assertEquals((-899.124726573543), complex2.getReal(), 0.01);
      assertEquals((-2133.9210019283423), complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1441()  throws Throwable  {
      Complex complex0 = new Complex((-1390.63472), (-1390.63472));
      Complex complex1 = complex0.ONE.multiply((-1390.63472));
      assertEquals((-1390.63472), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1442()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(1.653936936176903E7);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.653936936176903E7, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1443()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.conjugate();
      Complex complex2 = complex1.log();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-1.5707963267948966), complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1444()  throws Throwable  {
      Complex complex0 = new Complex((-1877.947075), (-1877.947075));
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
      assertEquals((-1877.947075), complex0.getReal(), 0.01);
      assertEquals((-1877.947075), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1445()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.0));
      double double0 = complex0.getReal();
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1446()  throws Throwable  {
      Complex complex0 = new Complex(2369.5568219);
      double double0 = complex0.getReal();
      assertEquals(2369.5568219, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1447()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-3504.7955128393087), 0.0);
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals((-3504.7955128393087), double0, 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1448()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1449()  throws Throwable  {
      Complex complex0 = new Complex((-1390.63472), (-1390.63472));
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1390.63472), double0, 0.01);
      assertEquals((-1390.63472), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1450()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1451()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1452()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2388.3);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.exp();
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1453()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2000.8114050053, 2000.8114050053);
      Complex complex1 = complex0.exp();
      assertTrue(complex1.isInfinite());
      assertEquals(2000.8114050053, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1454()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1.0));
      Complex complex1 = complex0.exp();
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals((-0.8414709848078965), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1455()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.divide(2299.617353577);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1456()  throws Throwable  {
      Complex complex0 = new Complex((-598.05));
      Complex complex1 = complex0.divide(21.976);
      assertEquals((-598.05), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-27.21377866763742), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1457()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, Double.NaN);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1458()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.createComplex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1459()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1460()  throws Throwable  {
      Complex complex0 = new Complex((-1390.63472), (-1390.63472));
      Complex complex1 = complex0.cosh();
      boolean boolean0 = complex1.isInfinite();
      assertEquals((-1390.63472), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(boolean0);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1461()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1462()  throws Throwable  {
      Complex complex0 = new Complex((-1390.63472), (-1390.63472));
      Complex complex1 = complex0.cos();
      assertEquals((-1390.63472), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1463()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.subtract((-1675.295189591675));
      Complex complex2 = complex1.cos();
      assertEquals((-0.6775976353300307), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1464()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1465()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(858.0);
      Complex complex2 = complex1.asin();
      Complex complex3 = complex2.cos();
      assertEquals(1.0000006790271319, complex3.getReal(), 0.01);
      assertEquals((-857.9994171408346), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1466()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1467()  throws Throwable  {
      Complex complex0 = new Complex((-598.05));
      Complex complex1 = complex0.conjugate();
      double double0 = complex1.getArgument();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-3.141592653589793), double0, 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1468()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.atan();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1469()  throws Throwable  {
      Complex complex0 = new Complex((-1180.582492056), (-2801.913572));
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.sinh();
      assertEquals((-7.604177476764885E-4), complex2.getImaginary(), 0.01);
      assertEquals((-2.3009783768381245), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1470()  throws Throwable  {
      Complex complex0 = new Complex((-598.05));
      Complex complex1 = complex0.asin();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(7.086820844091625, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1471()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1472()  throws Throwable  {
      Complex complex0 = new Complex(3064.0);
      Complex complex1 = complex0.asin();
      assertEquals((-8.720623684790958), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1473()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.INF.log();
      Complex complex2 = complex1.I.add(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1.7853981633974483, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1474()  throws Throwable  {
      Complex complex0 = new Complex((-0.3504118005384378));
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.3504118005384378), complex0.getReal(), 0.01);
      assertEquals((-0.7008236010768756), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1475()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.divide((-1675.295189591675));
      Complex complex2 = complex0.ONE.add(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals((-5.96909730424125E-4), complex1.getImaginary(), 0.01);
      assertEquals((-5.96909730424125E-4), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1476()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(879.9898615);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1477()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1103.500912));
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1103.500912), complex0.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1478()  throws Throwable  {
      Complex complex0 = new Complex(2216.86);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2216.86, complex0.getReal(), 0.01);
      assertEquals(2216.86, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1479()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1480()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tan();
      assertEquals(6.123233995736767E-17, complex2.getReal(), 0.01);
      assertEquals((-1.414213562373095), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1481()  throws Throwable  {
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
  public void test_1482()  throws Throwable  {
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
  public void test_1483()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(2147483517);
  }

  @Test(timeout = 4000)
  public void test_1484()  throws Throwable  {
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
  public void test_1485()  throws Throwable  {
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
  public void test_1486()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.sqrt();
      assertTrue(complex2.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1487()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.exp();
      Complex complex2 = complex1.log();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_1488()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.pow(0.0);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1489()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1490()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1491()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(664.470896142256);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1492()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.ONE.multiply(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1493()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1494()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(complex0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1495()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2388.3);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.INF.divide(complex1);
      assertFalse(complex0.isNaN());
      assertEquals(2388.3, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1496()  throws Throwable  {
      Complex complex0 = new Complex((-1180.582492056), (-2801.913572));
      Complex complex1 = Complex.valueOf(0.0, (-1180.582492056));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-1180.582492056), complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(2.3733314620992134, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1497()  throws Throwable  {
      Complex complex0 = new Complex(9.140260083262505E-9);
      Complex complex1 = complex0.I.atan();
      Complex complex2 = complex0.ONE.add(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(9.140260083262505E-9, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1498()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.add(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1499()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1500()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2000.8114050053, 2000.8114050053);
      double double0 = complex0.ONE.abs();
      assertFalse(complex0.isNaN());
      assertEquals(2000.8114050053, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(2000.8114050053, complex0.getImaginary(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1501()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1502()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1503()  throws Throwable  {
      Complex complex0 = new Complex((-1966.215339337987), Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals((-1966.215339337987), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1504()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1505()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1506()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2000.420034006);
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(2000.420034006, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1507()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1508()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1509()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8));
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-219.8), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1510()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4705.76263808), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1511()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 1.0);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1512()  throws Throwable  {
      Complex complex0 = new Complex(2216.86);
      List<Complex> list0 = complex0.INF.nthRoot(156);
      assertEquals(2216.86, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1, list0.size());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1513()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(82424559);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_1514()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      // Undeclared exception!
      try { 
        complex0.nthRoot((-772));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -772
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1515()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.ZERO.nthRoot(262);
      assertEquals(262, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_1516()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1517()  throws Throwable  {
      Complex complex0 = new Complex((-0.3504118005384378));
      Complex complex1 = complex0.NaN.pow(complex0);
      Complex complex2 = complex1.tan();
      assertEquals((-0.3504118005384378), complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1518()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1519()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1520()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1521()  throws Throwable  {
      Complex complex0 = new Complex((-1.4));
      Complex complex1 = complex0.sinh();
      assertEquals((-1.4), complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.904301501451534), complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1522()  throws Throwable  {
      Complex complex0 = new Complex((-1.4));
      complex0.NaN.sin();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.4), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1523()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1524()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1525()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1526()  throws Throwable  {
      Complex complex0 = new Complex((-1.4));
      Complex complex1 = complex0.NaN.asin();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1.4), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1527()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.acos();
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1528()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1529()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8), (-219.8));
      Complex complex1 = complex0.subtract((-1325.443814201));
      assertEquals((-219.8), complex0.getImaginary(), 0.01);
      assertEquals((-219.8), complex1.getImaginary(), 0.01);
      assertEquals(1105.643814201, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1530()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.subtract(1.997844754509471E-9);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1531()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1532()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1533()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1534()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(1971.5698859775073);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1535()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1536()  throws Throwable  {
      Complex complex0 = new Complex((-4058.2618995391013));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertFalse(complex0.isInfinite());
      assertEquals((-4058.2618995391013), complex0.getReal(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1537()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex0.multiply(complex1);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1538()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_1539()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1540()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1541()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = new Complex((-1.0), Double.NaN);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1542()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1543()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      boolean boolean0 = complex0.equals(complex0);
      assertFalse(complex0.isInfinite());
      assertTrue(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1544()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.conjugate();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_1545()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.NEGATIVE_INFINITY);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1546()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1547()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(0.0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1548()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.divide(Double.NaN);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1549()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(1703.7734);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_1550()  throws Throwable  {
      Complex complex0 = Complex.valueOf(195.1224998, 195.1224998);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(195.1224998, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(195.1224998, complex0.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1551()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.atan();
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1552()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1553()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_1554()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1555()  throws Throwable  {
      Complex complex0 = new Complex((-0.3504118005384378));
      complex0.NaN.conjugate();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-0.3504118005384378), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1556()  throws Throwable  {
      Complex complex0 = new Complex((-4072.946662343829));
      Complex complex1 = complex0.add(Double.NaN);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-4072.946662343829), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1557()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8), (-219.8));
      Complex complex1 = complex0.add((-219.8));
      assertEquals((-439.6), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-219.8), complex1.getImaginary(), 0.01);
      assertEquals((-219.8), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1558()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.add(3.141592653589793);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_1559()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8), (-219.8));
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.acos();
      assertEquals(1.4262398881009422E95, complex1.getReal(), 0.01);
      assertEquals((-1.5966748045814699E94), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_1560()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8), (-219.8));
      Complex complex1 = complex0.sqrt1z();
      assertEquals((-219.8), complex0.getImaginary(), 0.01);
      assertEquals((-219.79886260530867), complex1.getImaginary(), 0.01);
      assertEquals(219.80113740057706, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1561()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1562()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.00031702474069, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.00031702474069, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1563()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1564()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-219.8), (-219.8));
      complex0.getField();
      assertFalse(complex0.isNaN());
      assertEquals((-219.8), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-219.8), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_1565()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }
}
