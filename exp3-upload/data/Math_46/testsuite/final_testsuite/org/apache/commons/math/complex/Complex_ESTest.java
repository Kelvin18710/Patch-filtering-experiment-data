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
      Complex complex0 = new Complex(1.5830993332061267E-10);
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
  public void test_0001()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.negate();
      Complex complex2 = Complex.ZERO;
      boolean boolean0 = complex2.equals(complex1);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ONE;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(0.09900990099009901, 749.440847);
      Complex complex2 = complex1.atan();
      assertEquals(1.570796150514235, complex2.getReal(), 0.01);
      assertEquals(0.0013343288933706267, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-4295.0328749739));
      Complex complex2 = complex0.divide(complex1);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-4295.0328749739), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Complex complex0 = new Complex(2532.550974895118, 0.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.tanh();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.2464010700197394), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.tan();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Complex complex0 = Complex.valueOf(3100.862988881096, (-400.8333672));
      Complex complex1 = complex0.I.acos();
      Complex complex2 = complex1.tan();
      assertEquals((-1.414213562373095), complex2.getImaginary(), 0.01);
      assertEquals((-400.8333672), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.ZERO.exp();
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(6.283185307179586);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      Complex complex1 = complex0.I.subtract(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(1.5874010519681994);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.5874010519681994), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4184.781029039), (-4184.781029039));
      Complex complex1 = complex0.subtract((-793.51048));
      assertFalse(complex1.isInfinite());
      assertEquals((-3391.270549039), complex1.getReal(), 0.01);
      assertEquals((-4184.781029039), complex1.getImaginary(), 0.01);
      assertEquals((-4184.781029039), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, 8.0E298);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isInfinite());
      assertEquals(8.0E298, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4184.781029039), (-4184.781029039));
      Complex complex1 = complex0.sqrt();
      assertEquals((-4184.781029039), complex0.getImaginary(), 0.01);
      assertEquals((-71.07374731878005), complex1.getImaginary(), 0.01);
      assertEquals(29.4397100681171, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Complex complex0 = Complex.valueOf(64.540703929735, 0.01745329052209854);
      Complex complex1 = complex0.multiply(783.8);
      Complex complex2 = complex1.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(50587.00374012629, complex1.getReal(), 0.01);
      assertEquals(13.679889111220836, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Complex complex0 = new Complex((-1202.16));
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals((-1202.16), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add((-1481.9));
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.sinh();
      assertEquals((-0.9354473375517472), complex3.getImaginary(), 0.01);
      assertEquals(-0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      Complex complex0 = Complex.valueOf(25.9, 3456.9);
      Complex complex1 = complex0.sin();
      assertTrue(complex1.isInfinite());
      assertEquals(25.9, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(3456.9, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add((-3420.876534982));
      Complex complex2 = complex1.sin();
      assertEquals((-3420.876534982), complex1.getReal(), 0.01);
      assertEquals((-0.4822729032871814), complex2.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.1163293997959283), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Complex complex0 = new Complex(1012.0272476787669);
      Complex complex1 = Complex.valueOf((-2373.3), 1012.0272476787669);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      Complex complex0 = new Complex(450.27, 450.27);
      Complex complex1 = complex0.I.log();
      Complex complex2 = complex1.tan();
      Complex complex3 = new Complex((-809.7127271));
      Complex complex4 = complex2.pow(complex3);
      assertEquals((-2.3217246415021147E30), complex4.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-1.1250943834474515E30), complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      Complex complex0 = new Complex(450.27, 450.27);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2777.104037385), (-3038.1714));
      Complex complex1 = complex0.pow((-1099.8806077924));
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3038.1714), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Complex complex0 = Complex.valueOf(25.9, 25.9);
      Complex complex1 = complex0.pow(333.0);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(25.9, complex0.getImaginary(), 0.01);
      assertEquals(25.9, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.pow(1.0);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex2.multiply(complex0);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertFalse(complex3.isNaN());
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.multiply((-2.356194490192345));
      assertEquals((-2.356194490192345), complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-699.0));
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-699.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.log();
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-2.356194490192345), complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2559.6989818127));
      Complex complex1 = complex0.NaN.pow(complex0);
      complex1.isNaN();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-2559.6989818127), complex0.getReal(), 0.01);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.INF.log();
      boolean boolean0 = complex1.isInfinite();
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Complex complex0 = Complex.valueOf(987.07265901341, 987.07265901341);
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(987.07265901341, complex0.getImaginary(), 0.01);
      assertEquals(987.07265901341, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Complex complex0 = new Complex((-1349.681751154614));
      double double0 = complex0.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-1349.681751154614), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.getImaginary();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      double double0 = complex1.getImaginary();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract((-2777.104037385));
      Complex complex2 = complex1.tan();
      Complex complex3 = complex0.multiply(complex2);
      double double0 = complex3.getArgument();
      assertEquals((-0.026796043060241415), complex3.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals((-3.106483130622663), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2393.096261691318, 2797.11641373);
      Complex complex1 = complex0.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(2797.11641373, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2499.4638602874), 2108.308708828884);
      Complex complex1 = complex0.exp();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(2108.308708828884, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Complex complex0 = Complex.valueOf(111.34532492078573, 486.65853);
      Complex complex1 = complex0.exp();
      assertEquals(486.65853, complex0.getImaginary(), 0.01);
      assertEquals((-2.179474809618486E48), complex1.getReal(), 0.01);
      assertEquals(6.464243787331201E47, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Complex complex0 = new Complex((-1202.16));
      Complex complex1 = complex0.divide((-2154.295));
      Complex complex2 = complex1.atan();
      Complex complex3 = complex2.exp();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-9.234862819750326E-17), complex3.getImaginary(), 0.01);
      assertEquals(1.6636049901538086, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Complex complex0 = new Complex(15.0);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-0.050645860857254754), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-0.7596879128588213), complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.createComplex(Double.NaN, Double.NaN);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Complex complex0 = new Complex((-4184.781029039));
      Complex complex1 = complex0.createComplex((-1.1948056635446846E-4), (-6.2633448));
      assertFalse(complex1.isInfinite());
      assertEquals((-1.1948056635446846E-4), complex1.getReal(), 0.01);
      assertEquals((-6.2633448), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      double double0 = complex1.getArgument();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex(Double.POSITIVE_INFINITY, (-799.0));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-799.0), complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Complex complex0 = Complex.valueOf(5691.882545377, (-991559.3492820448));
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-991559.3492820448), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.414213562373095, (-1.048981850553085E12));
      Complex complex1 = complex0.cosh();
      assertEquals((-1.048981850553085E12), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.4939855509698716, complex1.getReal(), 0.01);
      assertEquals((-5.347320564575383), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Complex complex0 = Complex.valueOf(25.9, 3456.9);
      Complex complex1 = complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(3456.9, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Complex complex0 = new Complex(450.27, 450.27);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.conjugate();
      assertFalse(complex2.isInfinite());
      assertEquals((-9.246055232617858E194), complex1.getReal(), 0.01);
      assertEquals((-1.513003139667286E195), complex2.getImaginary(), 0.01);
      assertEquals((-9.246055232617858E194), complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.conjugate();
      assertFalse(complex1.isNaN());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2559.6989818127));
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1.57040565587764), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Complex complex0 = new Complex((-1349.681751154614));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.tanh();
      assertEquals((-0.008818385220025048), complex2.getImaginary(), 0.01);
      assertEquals((-1.0898812027267453), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Complex complex0 = Complex.valueOf(139.0);
      Complex complex1 = complex0.asin();
      assertEquals((-5.627608174150636), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.I.add(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-4939.10739585), (-997.0));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-1994.0), complex1.getImaginary(), 0.01);
      assertEquals((-9878.2147917), complex1.getReal(), 0.01);
      assertEquals((-997.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-4939.10739585), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(625.1624046);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.add(0.0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.add(0.09900990099009901);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals((-0.17520119364380138), complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(0.09900990099009901, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 1059);
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.acos();
      assertEquals(2.8583169133501145, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.ONE.subtract((Complex) null);
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
      Complex complex0 = Complex.valueOf((-2703.34), 163.461);
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
  public void test_0075()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      complex0.nthRoot(890228764);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
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
  public void test_0077()  throws Throwable  {
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
  public void test_0078()  throws Throwable  {
      Complex complex0 = Complex.valueOf(5691.882545377);
      try { 
        complex0.NaN.add((Complex) null);
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
      Complex complex0 = new Complex((-4184.781029039));
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(64.68988351387719, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Complex complex0 = Complex.valueOf(25.9, 3456.9);
      Complex complex1 = complex0.tan();
      Complex complex2 = complex1.log();
      assertEquals(3456.9, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(25.9, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-2345.57532304));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Complex complex0 = new Complex((-0.16624879837036133), 0.0);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.027638662959589055, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex0.divide(complex2);
      assertTrue(complex3.isNaN());
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex0.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.divide(complex0);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Complex complex0 = new Complex((-4184.781029039));
      Complex complex1 = complex0.NaN.exp();
      Complex complex2 = complex1.add(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-4184.781029039), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.I.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      assertTrue(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Complex complex0 = new Complex(2948.7, Double.NaN);
      complex0.multiply(complex0);
      assertFalse(complex0.isInfinite());
      assertEquals(2948.7, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.getImaginary();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getReal();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2091.44), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, 5691.882545377);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(735);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Complex complex0 = new Complex(2532.550974895118, 0.0);
      List<Complex> list0 = complex0.NaN.nthRoot(294);
      assertFalse(list0.contains(complex0));
      assertEquals(2532.550974895118, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1375));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,375
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(1850);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(1850, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.tanh();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sqrt();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Complex complex0 = new Complex(6170.728);
      complex0.NaN.sinh();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(6170.728, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.pow((-139.6683086327));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Complex complex0 = new Complex(15.0);
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1634508.6862362083, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract((double) 4968);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Complex complex0 = new Complex((-1202.16));
      Complex complex1 = complex0.INF.tan();
      Complex complex2 = complex0.subtract(complex1);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-1202.16), complex0.getReal(), 0.01);
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.multiply(Double.NaN);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.multiply(1695.0725963532122);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.valueOf(1797.4935346, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(1797.4935346, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      Complex complex0 = new Complex(1.5169229610576633E7, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Complex complex0 = Complex.valueOf(987.07265901341, 987.07265901341);
      Complex complex1 = complex0.NaN.negate();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(987.07265901341, complex0.getReal(), 0.01);
      assertEquals(987.07265901341, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = Complex.valueOf(0.0, 0.0);
      boolean boolean0 = complex1.equals(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Complex complex0 = Complex.valueOf(987.07265901341, 987.07265901341);
      Complex complex1 = complex0.sqrt1z();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(987.0729122876039, complex1.getReal(), 0.01);
      assertEquals((-987.0724057392811), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      Complex complex0 = new Complex((-347.3843979857));
      boolean boolean0 = complex0.equals(complex0);
      assertEquals((-347.3843979857), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertTrue(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      Complex complex0 = new Complex(1012.0272476787669);
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
      assertEquals(1012.0272476787669, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(6.283185307179586);
      assertTrue(complex1.equals((Object)complex0));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Complex complex0 = Complex.valueOf(139.0);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(139.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.divide(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.divide(-0.0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.divide((double) 1850);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.atan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-1349.681751154614));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-7.40915404053236E-4), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.cos();
      Complex complex2 = complex0.divide(complex1);
      assertFalse(complex1.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.divide((-5061.8937007734));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-1.975545238824773E-4), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.tan();
      Complex complex2 = complex1.divide(complex0);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.add(0.0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 991559.3492820448);
      Complex complex1 = complex0.multiply(991559.3492820448);
      Complex complex2 = complex1.asin();
      assertEquals(991559.3492820448, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.getArgument();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }
@Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
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
  public void test_0160()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.sqrt();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-0.7071067811865475), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, 657.832647530883);
      Complex complex1 = new Complex(1207.33176275, 0.19999954104423523);
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1207.33176275, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.19999954104423523, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.valueOf((-3.919460114047979E-4), 1249.1967266);
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertFalse(boolean0);
      assertEquals(1249.1967266, complex1.getImaginary(), 0.01);
      assertEquals((-3.919460114047979E-4), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.tanh();
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Complex complex0 = new Complex((-2062.26037457299), 1.9868161777724352E-8);
      Complex complex1 = complex0.NaN.createComplex(1.9868161777724352E-8, 438.93304828582);
      Complex complex2 = complex1.tanh();
      assertEquals(1.9868161777724352E-8, complex1.getReal(), 0.01);
      assertEquals((-1.2344056583925436), complex2.getImaginary(), 0.01);
      assertEquals(5.014241899164468E-8, complex2.getReal(), 0.01);
      assertEquals(438.93304828582, complex1.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2867.5), (-2867.5));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.tan();
      assertEquals((-0.7853981481953632), complex1.getReal(), 0.01);
      assertEquals((-0.9999999999999987), complex2.getImaginary(), 0.01);
      assertEquals((-3.040417023598949E-8), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertFalse(complex1.isNaN());
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-0.09088450866185192));
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.tan();
      assertEquals((-0.09088450866185192), complex0.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
      assertEquals((-0.761594155955765), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1988.1058, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.subtract(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(1988.1058, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 2084.85517);
      Complex complex1 = complex0.ONE.subtract(complex0);
      assertEquals((-2084.85517), complex1.getImaginary(), 0.01);
      assertEquals(2084.85517, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-0.5707963267948966), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.createComplex(1821.9009177118, 1821.9009177118);
      Complex complex2 = complex0.subtract(complex1);
      assertEquals((-1821.9009177118), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1821.9009177118, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.subtract(1.0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.subtract(1.8843359503386494);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, 657.832647530883);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(657.8328215244807, complex1.getReal(), 0.01);
      assertEquals((-1207.3314434165918), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.createComplex(1821.9009177118, 1821.9009177118);
      Complex complex2 = complex1.pow(3173.08);
      Complex complex3 = complex2.sqrt();
      assertEquals(1821.9009177118, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.createComplex(1821.9009177118, 1821.9009177118);
      Complex complex2 = complex1.sinh();
      assertTrue(complex2.isInfinite());
      assertEquals(1821.9009177118, complex1.getImaginary(), 0.01);
      assertEquals(1821.9009177118, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Complex complex0 = Complex.valueOf(11.4205134146302, (-4427.0));
      Complex complex1 = complex0.sinh();
      assertEquals((-4427.0), complex0.getImaginary(), 0.01);
      assertEquals((-40094.05285880911), complex1.getReal(), 0.01);
      assertEquals(11.4205134146302, complex0.getReal(), 0.01);
      assertEquals(21693.15891134923, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, 657.832647530883);
      Complex complex1 = complex0.I.pow(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.pow(3173.08);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-8.200782800526285), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Complex complex0 = new Complex((-742.8909), 1655.506121783);
      Complex complex1 = complex0.pow((-2160.65694));
      assertEquals(1655.506121783, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(6.283185307179586);
      assertEquals((-0.9026853619330714), complex1.getReal(), 0.01);
      assertEquals((-0.4303012170000917), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Complex complex0 = Complex.valueOf(784.9863);
      Complex complex1 = complex0.INF.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(784.9863, complex0.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.cosh();
      Complex complex2 = complex1.negate();
      assertEquals((-0.5403023058681398), complex2.getReal(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1275.6860948367187));
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-1275.6860948367187), complex2.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Complex complex0 = new Complex((-2062.26037457299), 1.9868161777724352E-8);
      Complex complex1 = complex0.multiply(737.38444312111);
      assertEquals(1.4650473408307395E-5, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-2062.26037457299), complex0.getReal(), 0.01);
      assertEquals((-1520678.717875236), complex1.getReal(), 0.01);
      assertEquals(1.9868161777724352E-8, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      Complex complex0 = new Complex((-2062.26037457299), 1.9868161777724352E-8);
      Complex complex1 = complex0.multiply((-2062.26037457299));
      Complex complex2 = complex1.log();
      assertEquals(15.263115858867929, complex2.getReal(), 0.01);
      assertEquals((-9.634167451740054E-12), complex2.getImaginary(), 0.01);
      assertEquals((-4.097332274980658E-5), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isNaN();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Complex complex0 = new Complex(2.479773539153719E-5);
      boolean boolean0 = complex0.isInfinite();
      assertEquals(2.479773539153719E-5, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.log();
      double double0 = complex1.getReal();
      assertEquals(0.0, double0, 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Complex complex0 = new Complex(657.832647530883, 657.832647530883);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      double double0 = complex2.getReal();
      assertFalse(complex0.isInfinite());
      assertEquals(657.832647530883, complex2.getImaginary(), 0.01);
      assertEquals((-657.832647530883), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Complex complex0 = new Complex(641.4406911178594);
      double double0 = complex0.getImaginary();
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(641.4406911178594, complex0.getReal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-917.38));
      double double0 = complex0.getImaginary();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-917.38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      double double0 = complex0.I.getArgument();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(1821.9009177118, complex0.getReal(), 0.01);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Complex complex0 = new Complex(2062.26037457299, 348.5123516005739);
      Complex complex1 = complex0.exp();
      assertEquals(348.5123516005739, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2867.5), (-2867.5));
      Complex complex1 = complex0.exp();
      assertEquals((-2867.5), complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Complex complex0 = Complex.valueOf(419.034871739, 419.034871739);
      Complex complex1 = complex0.exp();
      assertEquals((-9.004904284153019E181), complex1.getImaginary(), 0.01);
      assertEquals((-3.4693561735841505E181), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(419.034871739, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Complex complex0 = new Complex(175.4, 1123.945842287851);
      Complex complex1 = complex0.I.negate();
      Complex complex2 = complex1.divide(complex0);
      assertEquals((-1.3554665237442125E-4), complex2.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-8.685695346195406E-4), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(3204.8440773697);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide((-2407.8279));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-4.153120744219302E-4), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Complex complex0 = new Complex(1.5707963267948966, 2084.85517);
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.divide(1.2393345855018391E-8);
      assertEquals((-1.8580720755905074E8), complex2.getImaginary(), 0.01);
      assertEquals((-2.3027729856345034), complex1.getImaginary(), 0.01);
      assertEquals(7.375205934472525E7, complex2.getReal(), 0.01);
      assertEquals(0.9140347789790211, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.createComplex((-1603.061958), Double.NaN);
      assertTrue(complex1.isNaN());
      assertEquals((-1603.061958), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-1.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-917.38));
      Complex complex1 = complex0.createComplex(0.0, 0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.createComplex((-3073.2389042247437), (-3073.2389042247437));
      assertFalse(complex1.isInfinite());
      assertEquals((-3073.2389042247437), complex1.getImaginary(), 0.01);
      assertEquals((-3073.2389042247437), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Complex complex0 = new Complex((-1666.6), (-1666.6));
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isInfinite());
      assertEquals((-1666.6), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      Complex complex0 = new Complex(2.0, 2.0);
      Complex complex1 = complex0.cosh();
      assertEquals((-1.5656258353157435), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(2.0, complex0.getImaginary(), 0.01);
      assertEquals(3.297894836311237, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.cosh();
      assertEquals((-1.77571291870694), complex2.getImaginary(), 0.01);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5960680219775756, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.createComplex(1821.9009177118, 1821.9009177118);
      Complex complex2 = complex1.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(1821.9009177118, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      Complex complex0 = new Complex(1821.9009177118);
      Complex complex1 = complex0.multiply(3173.08);
      Complex complex2 = complex1.cos();
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals((-0.46695646494004567), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      Complex complex0 = new Complex(5.669184079525E-24, 5.669184079525E-24);
      Complex complex1 = complex0.divide(5.669184079525E-24);
      Complex complex2 = complex1.cos();
      assertEquals(0.8337300251311491, complex2.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals((-0.9888977057628651), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.0, 1.0);
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.conjugate();
      assertEquals((-1.0), complex2.getReal(), 0.01);
      assertEquals(1.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(complex2.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.conjugate();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      Complex complex1 = complex0.atan();
      assertEquals((-1.5706237558333538), complex1.getReal(), 0.01);
      assertEquals((-1.7257095469025159E-4), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Complex complex0 = new Complex(0.0, (-917.38));
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals((-7.51466925880217), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1073.1855159));
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.tanh();
      assertEquals((-1.0835958226857698), complex2.getReal(), 0.01);
      assertEquals(0.03348275318374757, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.ONE.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.ONE.add(complex1);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Complex complex0 = new Complex(657.832647530883, 657.832647530883);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.add(complex2);
      assertEquals(657.832647530883, complex2.getImaginary(), 0.01);
      assertEquals((-1315.665295061766), complex3.getReal(), 0.01);
      assertEquals(1315.665295061766, complex3.getImaginary(), 0.01);
      assertEquals((-657.832647530883), complex2.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1578.3345187));
      Complex complex1 = complex0.add(complex0);
      assertEquals((-1578.3345187), complex0.getImaginary(), 0.01);
      assertEquals((-3156.6690374), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Complex complex0 = new Complex(175.4, 1123.945842287851);
      Complex complex1 = complex0.ZERO.add(175.4);
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.add(0.0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add((-1407.54371073));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1406.54371073), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
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
  public void test_0231()  throws Throwable  {
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
  public void test_0232()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      // Undeclared exception!
      complex0.nthRoot(755797692);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
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
  public void test_0234()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test_0235()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
  public void test_0236()  throws Throwable  {
      Complex complex0 = new Complex((-742.8909), 1655.506121783);
      Complex complex1 = complex0.sqrt();
      assertEquals(23.1479795749405, complex1.getReal(), 0.01);
      assertEquals(1655.506121783, complex0.getImaginary(), 0.01);
      assertEquals(35.759192641918844, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.ZERO.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Complex complex0 = new Complex(188.0, (-1661.5486093779));
      Complex complex1 = complex0.ZERO.pow(complex0);
      Complex complex2 = complex1.log();
      assertEquals((-1661.5486093779), complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(188.0, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(complex0);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(439.6);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-200.4487300475559));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(2371.315);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.valueOf(Double.NaN, Double.NaN);
      Complex complex2 = complex1.multiply(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-1578.3345187));
      Complex complex1 = complex0.divide(complex0);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals((-1578.3345187), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, 657.832647530883);
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex0.add(complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1207.33176275, complex0.getReal(), 0.01);
      assertEquals(657.832647530883, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ONE.add(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(2.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      Complex complex0 = Complex.valueOf(419.034871739, 419.034871739);
      double double0 = complex0.ZERO.abs();
      assertEquals(0.0, double0, 0.01);
      assertEquals(419.034871739, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(419.034871739, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.acos();
      double double0 = complex1.abs();
      assertEquals(2.5246306599334645, complex1.getImaginary(), 0.01);
      assertEquals(2.5246306599334645, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      double double0 = complex0.abs();
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(6.283185307179586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertTrue(complex1.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, 7.549789948768648E-8);
      assertTrue(complex0.isNaN());
      assertEquals(7.549789948768648E-8, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.isInfinite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sqrt1z();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Complex complex0 = Complex.valueOf(419.034871739, 419.034871739);
      double double0 = complex0.getImaginary();
      assertEquals(419.034871739, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(419.034871739, double0, 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Complex complex0 = new Complex(3135.7756757481006, Double.POSITIVE_INFINITY);
      double double0 = complex0.getReal();
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(3135.7756757481006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-38.47841760435743), Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(609);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(3213);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      try { 
        complex0.nthRoot((-1128));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,128
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      List<Complex> list0 = complex0.nthRoot(3213);
      assertEquals((-2897.358892), complex0.getReal(), 0.01);
      assertEquals(3213, list0.size());
      assertEquals((-2897.358892), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      complex0.tan();
      assertFalse(complex0.isInfinite());
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Complex complex0 = new Complex((-2897.358892), (-2897.358892));
      Complex complex1 = complex0.ONE.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.sqrt();
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sqrt();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isNaN());
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Complex complex0 = new Complex(3135.7756757481006, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.sin();
      assertEquals(3135.7756757481006, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      Complex complex1 = complex0.sin();
      assertEquals((-2897.358892), complex0.getImaginary(), 0.01);
      assertEquals((-2897.358892), complex0.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      complex0.atan();
      assertFalse(complex0.isInfinite());
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.asin();
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.asin();
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Complex complex0 = new Complex((-2897.358892), (-2897.358892));
      Complex complex1 = complex0.subtract(1.1430250008909141E-8);
      assertFalse(complex1.isInfinite());
      assertEquals((-2897.358892), complex0.getImaginary(), 0.01);
      assertEquals((-2897.3588920114303), complex1.getReal(), 0.01);
      assertEquals((-2897.358892), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      Complex complex1 = complex0.subtract(8.869604401089358);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.tanh();
      Complex complex3 = complex2.subtract(complex0);
      assertNotSame(complex3, complex2);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      Complex complex2 = complex1.negate();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow((-1024905.1931875315));
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.multiply(complex0);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      Complex complex1 = complex0.I.pow((-160.9917933139));
      Complex complex2 = complex1.multiply(complex0);
      assertTrue(complex2.isNaN());
      assertEquals((-0.999916911792709), complex1.getImaginary(), 0.01);
      assertEquals(0.012890675348162637, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.NaN.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, 657.832647530883);
      Complex complex1 = new Complex(1207.33176275, 1207.33176275);
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(1207.33176275, complex1.getImaginary(), 0.01);
      assertEquals(1207.33176275, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Complex complex0 = new Complex(0.1929544756605618);
      Complex complex1 = complex0.ONE.pow(0.1929544756605618);
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.pow(1747.29383022257);
      boolean boolean0 = complex2.equals(complex3);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertFalse(complex3.equals((Object)complex0));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertTrue(complex3.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Complex complex0 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, (-1.0));
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals(1207.33176275, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, (-1.0));
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(1207.33176275, complex0.getReal(), 0.01);
      assertEquals((-1.0), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Complex complex0 = new Complex(1207.33176275, (-1.0));
      Complex complex1 = Complex.valueOf(Double.POSITIVE_INFINITY, 13.07);
      Complex complex2 = complex0.divide(complex1);
      assertEquals(13.07, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.ONE.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      complex0.divide(complex0);
      assertTrue(complex0.isNaN());
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      Complex complex1 = complex0.add(1655.506121783);
      assertEquals((-2897.358892), complex1.getImaginary(), 0.01);
      assertEquals((-2897.358892), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1241.8527702170002), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(0.0);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Complex complex0 = new Complex(3135.7756757481006, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(3135.7756757481006, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Complex complex0 = new Complex(826.9919239316771, Double.NaN);
      Complex complex1 = complex0.add(complex0);
      assertEquals(826.9919239316771, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      Complex complex1 = Complex.valueOf((-6.032174644509064E-23), 7710397.775488746);
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.acos();
      complex3.pow(Double.NaN);
      assertEquals(2.2339789555669342E10, complex2.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.cosh();
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      Complex complex1 = Complex.valueOf((-6.032174644509064E-23), 7710397.775488746);
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.acos();
      complex3.atan();
      assertEquals((-2.2339789555669342E10), complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      complex0.getArgument();
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      complex0.getField();
      assertEquals((-2897.358892), complex0.getReal(), 0.01);
      assertEquals((-2897.358892), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2897.358892), (-2897.358892));
      String string0 = complex0.toString();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals("(-2897.358892, -2897.358892)", string0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Complex complex0 = new Complex(3135.7756757481006, Double.POSITIVE_INFINITY);
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertTrue(complex1.isInfinite());
  }
}
