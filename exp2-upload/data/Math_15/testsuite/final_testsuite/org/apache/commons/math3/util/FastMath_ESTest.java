package org.apache.commons.math3.util;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FastMath_ESTest extends FastMath_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      FastMath.copySign((-865.25F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      FastMath.copySign((float) 10, Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      FastMath.copySign((-0.8385901059582784), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      FastMath.copySign(2441.128, 2441.128);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      FastMath.hypot((-1.3824992526093461E-8), 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      FastMath.hypot(179.21268, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      FastMath.max(0L, 2819561105158720014L);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      FastMath.max(592, 750);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      FastMath.rint(1126.8F);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      FastMath.ceil(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      FastMath.round(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      FastMath.scalb(287.024F, 276);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      FastMath.scalb(1.4E-45F, (-277));
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      FastMath.scalb(1.0, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      FastMath.scalb(331.64, 1024);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      FastMath.ulp(2452.47F);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      FastMath.ulp((-12.154336345872983));
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      FastMath.cbrt((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      FastMath.asin((-2.0764122246389383E-9));
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      FastMath.atan2(0L, 1113.9268504);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      FastMath.cos(4.308816643345461E286);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      FastMath.atan2(2.2250738585072014E-308, 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      FastMath.toRadians(1.1274094947994538E-16);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      FastMath.toDegrees((-1204.231273));
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      FastMath.sqrt(0.8850744540278802);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      FastMath.round((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      FastMath.round(0.008333333333329196);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      FastMath.round((-354.091));
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      FastMath.pow(0.0, 805);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      FastMath.pow((double) (-1), 2093);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      FastMath.nextAfter(0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      FastMath.min(0L, 1466L);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      FastMath.min(3381L, 3381L);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      FastMath.min(4302, 0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      FastMath.min((-1048), 496);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      FastMath.min(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      FastMath.max(0L, (-823L));
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      FastMath.max((-295L), (-295L));
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      FastMath.max((-1043), (-1043));
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      FastMath.max(0.0F, (-332.0F));
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      FastMath.max((-2919.895214822475), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      FastMath.log1p(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      FastMath.log((double) 0.0F, 1717.207871);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      FastMath.log(2.4741696814204338E-17, 4136.2476);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      FastMath.log((double) 694);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      FastMath.getExponent(1.6026840209960938);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      FastMath.getExponent(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      FastMath.ceil(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      FastMath.atanh((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      FastMath.atan(0.5);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      FastMath.acosh((-2146150897));
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      FastMath.IEEEremainder(911.0430416422129, (-1854.1877F));
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      FastMath.IEEEremainder(1362.27302753, 882.8629875623385);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-580.84), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      double double0 = FastMath.copySign((double) 0L, (double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      double double0 = FastMath.copySign((double) 0L, (-1340.452845));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      double double0 = FastMath.floor(1457.55);
      assertEquals(1457.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      double double0 = FastMath.floor((-1540L));
      assertEquals((-1540.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      double double0 = FastMath.floor((-527.9947421633));
      assertEquals((-528.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      double double0 = FastMath.floor(7.808670894670738E56);
      assertEquals(7.808670894670738E56, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-2225L), (double) 0);
      assertEquals((-2224.9998F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 1454L, (double) (-1454));
      assertEquals(1453.9999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 3.141592653589793);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-668.22369719182));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 4.8828125E-4F, 0.3153223395347595);
      assertEquals(4.882812500000001E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      double double0 = FastMath.nextAfter((-10.39720770839918), 1982.1703);
      assertEquals((-10.397207708399177), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, 8.262337003574578);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 5.551115123125783E-17);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, 1353);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      double double0 = FastMath.scalb(1267.812, 575);
      assertEquals(1.567842254762098E176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, (-174.345F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      float float0 = FastMath.copySign(2452.47F, 2452.47F);
      assertEquals(2452.47F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      float float0 = FastMath.copySign((-1593.3F), 2515.0552F);
      assertEquals(1593.3F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      double double0 = FastMath.copySign((-20.0), 6.123233995736766E-17);
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      double double0 = FastMath.copySign((-1669.851076), (-1669.851076));
      assertEquals((-1669.851076), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, (-2019.59003102261));
      assertEquals(2019.59003102261, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      double double0 = FastMath.hypot(805, 0.0);
      assertEquals(805.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      double double0 = FastMath.hypot(380, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 7.316033240396569E150);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      double double0 = FastMath.max((double) (-1.0F), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      double double0 = FastMath.max((-2.356194490192345), (-2.356194490192345));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      double double0 = FastMath.max(344.0, (-2.2250738585072014E-308));
      assertEquals(344.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      float float0 = FastMath.max((-159.6212F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      float float0 = FastMath.max((-1083.4727F), (-1083.4727F));
      assertEquals((-1083.4727F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      float float0 = FastMath.max(1094.089F, (-511.71973F));
      assertEquals(1094.089F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      float float0 = FastMath.max((-1.0F), 2.14109901E9F);
      assertEquals(2.14109901E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      int int0 = FastMath.max(592, 27);
      assertEquals(592, int0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, 3.145894820876798E-6);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      double double0 = FastMath.min(728.775, 2072.773);
      assertEquals(728.775, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      double double0 = FastMath.min(3.436811623877024E-7, (-316.828316488721));
      assertEquals((-316.828316488721), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, 0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      float float0 = FastMath.min(2.81956123E18F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      float float0 = FastMath.min(32.4128F, 1851.27F);
      assertEquals(32.4128F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      float float0 = FastMath.min(1.0F, (-1228.3151F));
      assertEquals((-1228.3151F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      float float0 = FastMath.min((float) (-1663), (float) (-1663));
      assertEquals((-1663.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      long long0 = FastMath.min((-1528L), (-1528L));
      assertEquals((-1528L), long0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      long long0 = FastMath.min(0L, (-1267L));
      assertEquals((-1267L), long0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      int int0 = FastMath.min(694, 694);
      assertEquals(694, int0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      double double0 = FastMath.rint((-736.1046490195899));
      assertEquals((-736.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      double double0 = FastMath.rint((-1.944841848873016E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      double double0 = FastMath.ceil((-7.340587186324432E-93));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      double double0 = FastMath.ceil((-1.6436423669122624E8));
      assertEquals((-1.64364236E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      double double0 = FastMath.floor(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 9);
      assertEquals(9.000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1428.3687F), (-2606.9));
      assertEquals((-1428.3688F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-2550.65650083692));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      float float0 = FastMath.nextAfter((-0.44899F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-695.8392));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      double double0 = FastMath.nextUp(2.718281828459045);
      assertEquals(2.7182818284590455, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.383009899758782, 2.718281828459045);
      assertEquals(3.3830098997587816, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-709.782712893384));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 2203.4165774803764);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      double double0 = FastMath.nextAfter(1305.49185, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 3327.22863788252);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      float float0 = FastMath.scalb(0.2475791F, 128);
      assertEquals(8.42468E37F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      float float0 = FastMath.scalb((-0.69774556F), (-157));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      float float0 = FastMath.scalb((-437.9998F), (-141));
      assertEquals((-1.57125E-40F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      float float0 = FastMath.scalb((-4015.0F), (-141));
      assertEquals((-1.44031E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, (-210));
      assertEquals(2.0679514E-25F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      float float0 = FastMath.scalb((float) 3024, 3024);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      float float0 = FastMath.scalb((-16.230606F), 1025);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2147483647), (-2147483647));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      float float0 = FastMath.scalb(1312.87F, (-2517));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 1025);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-2398));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      float float0 = FastMath.scalb(684.21F, 40);
      assertEquals(7.5229687E14F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      float float0 = FastMath.scalb((-1051.263F), 143);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-1333));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2250738585072014E-308), 1298);
      assertEquals((-1.2141680576410807E83), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      double double0 = FastMath.scalb((-6.032174644509064E-23), (-1663));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      double double0 = FastMath.scalb(0.9407839571484413, (-1023));
      assertEquals(1.046656894776978E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      double double0 = FastMath.scalb(1311.5506708669107, (-1023));
      assertEquals(1.4591485559267727E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      double double0 = FastMath.scalb((-7.512438321498593E-8), (-1023));
      assertEquals((-8.35786506E-316), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2822, 2822);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), Integer.MAX_VALUE);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2145571357), (-2145571357));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      double double0 = FastMath.scalb(6.123233995736766E-17, (-2147483647));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, (-1073741823));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1023));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      double double0 = FastMath.scalb((-217.16), 2096);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      float float0 = FastMath.ulp(5.9358883F);
      assertEquals(4.7683716E-7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      double double0 = FastMath.abs((-571.1975));
      assertEquals(571.1975, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      double double0 = FastMath.abs(2064.032);
      assertEquals(2064.032, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      float float0 = FastMath.abs(35.8666F);
      assertEquals(35.8666F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      float float0 = FastMath.abs((-3.4028235E38F));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      long long0 = FastMath.abs((long) (-1062));
      assertEquals(1062L, long0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      long long0 = FastMath.abs(1466L);
      assertEquals(1466L, long0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      int int0 = FastMath.abs((-141));
      assertEquals(141, int0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      int int0 = FastMath.abs(1073741824);
      assertEquals(1073741824, int0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      double double0 = FastMath.toDegrees(5.769871153180574E57);
      assertEquals(3.3058926541152823E59, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      double double0 = FastMath.cbrt(0.15);
      assertEquals(0.5313292845913056, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      double double0 = FastMath.acos((-0.5));
      assertEquals(2.0943951023931957, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      double double0 = FastMath.acos(6.123233995736766E-17);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      double double0 = FastMath.acos(2513.0685818925404);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double double0 = FastMath.acos((-736.1046490195899));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      double double0 = FastMath.asin(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      double double0 = FastMath.asin(4.9E-324);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      double double0 = FastMath.asin((-9.029142770124446));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      double double0 = FastMath.asin(4438.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      double double0 = FastMath.atan2((-2364.07192703338), (-4.9E-324));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      double double0 = FastMath.atan2(1.6544084224626834E220, 6.1009492034592176E-158);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double double0 = FastMath.atan2(61.6, 0L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      double double0 = FastMath.atan2((-2674.1185301602), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      double double0 = FastMath.atan2((-3.1188200930771705E-17), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      double double0 = FastMath.atan2(6.123233995736766E-17, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      double double0 = FastMath.atan2(2636.265, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      double double0 = FastMath.atan2((-0.010714690733195933), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 232.78081359934043);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, (-3504.8919));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, (-1.0));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-3504.8919));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 3603.5431333);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      double double0 = FastMath.atan2((-2147483647), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      double double0 = FastMath.atan2(1466L, 1466L);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      double double0 = FastMath.atan2(6.39485115791896E288, (-1.0));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      double double0 = FastMath.atan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      double double0 = FastMath.cos(0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      double double0 = FastMath.sin(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      double double0 = FastMath.sin((-736.1046490195899));
      assertEquals((-0.8259966695533919), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      double double0 = FastMath.sin(4602678819172646912L);
      assertEquals((-0.23230980729846257), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      double double0 = FastMath.tan(1073741822L);
      assertEquals(0.5158574613474274, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      double double0 = FastMath.cos(2.81956110515872E18);
      assertEquals(0.979342973834013, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      double double0 = FastMath.sin(1.6463574403322797E105);
      assertEquals((-0.2713593755561027), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      double double0 = FastMath.cos((-4.9202842786896806E14));
      assertEquals((-0.5413477112236972), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028235E38F));
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      double double0 = FastMath.tan((-1.7976931348623157E308));
      assertEquals(0.004962015874444895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      double double0 = FastMath.sin(6.39485115791896E288);
      assertEquals(0.1944746570153961, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      double double0 = FastMath.tan((-8.0E298));
      assertEquals(0.04237639320697582, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      double double0 = FastMath.tan((-5.3681978363391484E-52));
      assertEquals((-5.3681978363391484E-52), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      double double0 = FastMath.sin(6.123233995736766E-17);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double double0 = FastMath.pow(1.7031839360032603E-108, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      double double0 = FastMath.pow((double) (-61.954277F), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      double double0 = FastMath.pow(2381.7, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) (-1540.0F));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      double double0 = FastMath.pow((-9.029142770124446), (-1.0));
      assertEquals((-0.11075248508737638), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      double double0 = FastMath.pow((-7.340587186324432E-93), (-7.340587186324432E-93));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      double double0 = FastMath.pow((-709.782712893384), 2.3971445233885962E126);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      double double0 = FastMath.pow(0.9922572694280454, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1880L), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 788L);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 3.141592653589793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      double double0 = FastMath.pow(0.19999954120254515, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      double double0 = FastMath.pow((double) 2093, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, 0.36290550231933594);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-557.85993));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 4.7683716E-7F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-3470.5F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 1.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-4.35799392139009E85));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      double double0 = FastMath.pow(2302.7181518106127, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double double0 = FastMath.log1p((-8.0E298));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      double double0 = FastMath.log1p(3.141592653589793);
      assertEquals(1.4210804127942926, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      double double0 = FastMath.log10(1.7810166866861927);
      assertEquals(0.2506679884704225, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      double double0 = FastMath.log10(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      double double0 = FastMath.log10(0.7853981633974483);
      assertEquals((-0.10491011863382856), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-1299.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      double double0 = FastMath.atanh(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      double double0 = FastMath.log((double) 0.0F);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      double double0 = FastMath.expm1(4410.3);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      double double0 = FastMath.exp((-711.9505899));
      assertEquals(6.3648389429996E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      double double0 = FastMath.expm1((-736.1046490195899));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      double double0 = FastMath.exp((-5411.77625875175));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      float float0 = FastMath.signum((-1428.3687F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      float float0 = FastMath.signum(5.9358883F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      double double0 = FastMath.signum((-111.90143919898));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      double double0 = FastMath.signum(2.718281828459045);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333329196);
      assertEquals(0.008333526242601714, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      double double0 = FastMath.asinh(0.09678834321746449);
      assertEquals(0.09663785814357552, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      double double0 = FastMath.tanh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      double double0 = FastMath.tanh((-5.998853580108024E-17));
      assertEquals((-5.998853580108024E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      double double0 = FastMath.tanh(911.0865568554);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      double double0 = FastMath.tanh((-313.2632));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      double double0 = FastMath.sinh(6.123233995736766E-17);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      double double0 = FastMath.sinh((-736.1046490195899));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      double double0 = FastMath.sinh(201.68342);
      assertEquals(1.9452095887131303E87, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      double double0 = FastMath.sinh(728.775);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      double double0 = FastMath.sinh((-440.468477715392));
      assertEquals((-9.81746424957351E190), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      double double0 = FastMath.cosh((-281.3));
      assertEquals(7.34526998905439E121, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      double double0 = FastMath.cosh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      double double0 = FastMath.cosh(365.3298501);
      assertEquals(2.2893277748701226E158, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-709.782712893384));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      double double0 = FastMath.log(3.1767499045826235, 3.1767499045826235);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      int int0 = FastMath.getExponent((-2626.8F));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      double double0 = FastMath.cosh((-1672.674732));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1689.42, 1689.42);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      double double0 = FastMath.atan((-736.1046490195899));
      assertEquals((-1.5694378251387038), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      double double0 = FastMath.acosh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      double double0 = FastMath.asinh((-2872.305965288409));
      assertEquals((-8.656017669231034), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0902938113007961E-8));
      assertEquals((-1.0902938053570931E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      int int0 = FastMath.round(1526.9358F);
      assertEquals(1527, int0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      double double0 = FastMath.cos((-1945.645261683376));
      assertEquals((-0.5407994272174237), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      FastMath.getExponent((-1389.0F));
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      FastMath.copySign(Float.NEGATIVE_INFINITY, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      FastMath.copySign((float) 0, (float) (-31));
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      FastMath.copySign((-667.8294909650309), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      FastMath.copySign(0.0, (-1643.88));
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      FastMath.hypot((-7.800414592973399E-9), 1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      FastMath.hypot(1.6168320178985596, (-1.1109834472051523E-8));
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      FastMath.max(113236205062349959L, 4607182418800017408L);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      FastMath.max(281, 2259);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      FastMath.min(113236205062349959L, 113236205062349959L);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      FastMath.min((-1), (-1));
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      FastMath.rint(3941.945);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      FastMath.ceil((-119.1662171963));
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      FastMath.floor(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      FastMath.scalb(1752.9048F, 276);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      FastMath.scalb(1.5707963267948966, (-1023));
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      FastMath.scalb((double) (-1023), 2097);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      FastMath.scalb((double) 1110, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      FastMath.scalb(Double.NaN, 1024);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      FastMath.ulp(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      FastMath.ulp((-6.634425377851263E151));
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      FastMath.atan2(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      FastMath.atan2(2.2250738585072014E-308, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      FastMath.atan2(5.5846006716348844E-8, (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      FastMath.toRadians((-3.5997360512765566E-9));
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      FastMath.toDegrees((-1.1920929E-7F));
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      FastMath.sqrt(1.0537591246531136E255);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      FastMath.signum((double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      FastMath.round(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      FastMath.round((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      FastMath.round(1.0428862571716309);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      FastMath.pow((-1.0), 1);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      FastMath.pow((-1.3548568223001414E-8), (double) (-1));
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      FastMath.nextAfter(0.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      FastMath.min((long) 10, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      FastMath.min(2407, 1439);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      FastMath.max(0L, (-1580L));
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      FastMath.max(4607182418800017408L, 4607182418800017408L);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      FastMath.max((-2249), (-4609));
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      FastMath.max((-498.8F), (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      FastMath.max(0.004961954789184062, 0.004961954789184062);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      FastMath.log(0.0, (double) 1999.3004F);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      FastMath.log(2.85040095144011776E17, 3827.4605186);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      FastMath.log(1207.72145);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      FastMath.getExponent(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      FastMath.getExponent(1.0297303199768066);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      FastMath.getExponent((double) (-2574.2053F));
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      FastMath.exp((-2861.4));
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      FastMath.copySign(0.0F, 2593.537F);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      FastMath.copySign(0.0, (double) Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      FastMath.cbrt((-5468.673884152946));
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      FastMath.atanh((-1.7292527438195104E-7));
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      FastMath.atan(1028.291);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      FastMath.acosh((-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      FastMath.IEEEremainder(0.0, 1492.3336716204);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      FastMath.IEEEremainder(1.5707963267948966, 0.6057114569539279);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-1028.48874), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      double double0 = FastMath.copySign(6.438501, 6.438501);
      assertEquals(6.438501, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      double double0 = FastMath.floor((-2247.0F));
      assertEquals((-2247.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      double double0 = FastMath.floor((-1046.7718647903));
      assertEquals((-1047.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      double double0 = FastMath.floor(1.5778116731493233E217);
      assertEquals(1.5778116731493233E217, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3.0517578E-5F), (-0.2499999701976776));
      assertEquals((-3.051758E-5F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      float float0 = FastMath.nextAfter(2.4414062E-4F, 1.7578073785142153E246);
      assertEquals(2.4414065E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 1.0);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.0281354621357104), (double) (-2093.3784F));
      assertEquals((-1.0281354621357106), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      double double0 = FastMath.nextAfter((-0.31955484499700954), (double) 878.0073F);
      assertEquals((-0.3195548449970095), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) 3813L);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (double) 2159.946F);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, 831);
      assertEquals(4.498588507857244E250, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      double double0 = FastMath.abs((-1674.63487));
      assertEquals(1674.63487, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      double double0 = FastMath.pow(207.861379041623, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      double double0 = FastMath.log(3.6725170580355583E-9);
      assertEquals((-19.422388563089246), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      float float0 = FastMath.copySign((-498.8F), (float) 13);
      assertEquals(498.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      float float0 = FastMath.copySign((float) 233, (-1.1920929E-7F));
      assertEquals((-233.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      float float0 = FastMath.copySign(0.99999994F, 0.0F);
      assertEquals(0.99999994F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      float float0 = FastMath.copySign((-1.4E-45F), (-4124.549F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-2143074030), 1.9636495113372803);
      assertEquals(2.14307403E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      double double0 = FastMath.copySign(1752.379, (-1.3584500601329896E-8));
      assertEquals((-1752.379), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      double double0 = FastMath.copySign((-1211.549234895981), (-2908.5145435));
      assertEquals((-1211.549234895981), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      double double0 = FastMath.hypot(1.997844754509471E-9, 1.5907089565090164E-173);
      assertEquals(1.997844754509471E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      double double0 = FastMath.hypot((-2799.7162130487527), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 0.99);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      double double0 = FastMath.hypot((-5335.02261388), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-4.983281844744412E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      double double0 = FastMath.max(Double.NEGATIVE_INFINITY, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      double double0 = FastMath.max(0.0, (-1802.5619));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      double double0 = FastMath.max((-5471.178579617131), (-5471.178579617131));
      assertEquals((-5471.178579617131), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      float float0 = FastMath.max(2.7556303F, 2.7556303F);
      assertEquals(2.7556303F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      float float0 = FastMath.max(1.0F, -0.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      long long0 = FastMath.max((-780L), (-780L));
      assertEquals((-780L), long0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      int int0 = FastMath.max(310, 310);
      assertEquals(310, int0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      int int0 = FastMath.max(0, (-3486));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      double double0 = FastMath.min(-0.0, 0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      double double0 = FastMath.min((-2799.7162130487527), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      double double0 = FastMath.min((-546.705832), 0.003);
      assertEquals((-546.705832), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      double double0 = FastMath.min(0.6366197723675814, (-2181.0));
      assertEquals((-2181.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      double double0 = FastMath.min(1.6172173180326343E9, 1.6172173180326343E9);
      assertEquals(1.6172173180326343E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      float float0 = FastMath.min(2333.848F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      float float0 = FastMath.min((-400.18F), (-400.18F));
      assertEquals((-400.18F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      float float0 = FastMath.min((float) 265, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      float float0 = FastMath.min((-2302.9F), 222.1731F);
      assertEquals((-2302.9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      long long0 = FastMath.min((-9223372036854775807L), (long) 1025);
      assertEquals((-9223372036854775807L), long0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      int int0 = FastMath.min((-1636), (-898));
      assertEquals((-1636), int0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      int int0 = FastMath.min(439, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      double double0 = FastMath.rint((-8.146080588190463E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      double double0 = FastMath.rint((-2824.426698918938));
      assertEquals((-2824.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      double double0 = FastMath.ceil((-1.6166170913368169E-12));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      double double0 = FastMath.ceil(371.82352637131);
      assertEquals(372.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      double double0 = FastMath.rint(1.4906417734326107E-16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      float float0 = FastMath.nextUp(3911.61F);
      assertEquals(3911.6104F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      float float0 = FastMath.nextAfter(2260.664F, 2.1819935527247946E-7);
      assertEquals(2260.6638F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-777.99838372));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (double) 2494);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 1795.3465087067011);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      float float0 = FastMath.nextAfter(3222.011F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 0.097);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      double double0 = FastMath.nextUp((double) 10);
      assertEquals(10.000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      double double0 = FastMath.nextAfter(2572.5, 6.551846134861994E-17);
      assertEquals(2572.4999999999995, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-914.5298));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 1.883511811213715E-8);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      double double0 = FastMath.nextAfter(6.080174837146273E-8, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-2521.63951891337));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      float float0 = FastMath.scalb((float) 274, 274);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      float float0 = FastMath.scalb(2.4414062E-4F, 128);
      assertEquals(8.307675E34F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 208);
      assertEquals(5.7646075E17F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      float float0 = FastMath.scalb(1.5134604F, (-135));
      assertEquals(3.4748E-41F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      float float0 = FastMath.scalb(1568.72F, (-127));
      assertEquals(9.220107E-36F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      float float0 = FastMath.scalb((-1869.7832F), 225);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1973994193, 1973994193);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-613));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-1417));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-1069984104));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 3031);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      float float0 = FastMath.scalb(1880.29F, 0);
      assertEquals(1880.29F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      float float0 = FastMath.scalb((-1477.294F), 622);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1417), (-1417));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1.4E-45F, 1025);
      assertEquals(5.038209258419659E263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      double double0 = FastMath.scalb(1.8307188599677033E-8, (-1023));
      assertEquals(2.03674234E-316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      double double0 = FastMath.scalb((-637.2468244977), (-1555));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      double double0 = FastMath.scalb(1382.8694, (-1023));
      assertEquals(1.5384932758347693E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      double double0 = FastMath.scalb(1.7792143821716309, 2047);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      double double0 = FastMath.scalb((double) 131060, 131060);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      double double0 = FastMath.scalb(0.7214844226837158, (-3406));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, 1142);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, Integer.MAX_VALUE);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      double double0 = FastMath.scalb((-2.6437112632041807E-8), 2144670964);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2181), (-2181));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      float float0 = FastMath.ulp(0.0F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      double double0 = FastMath.abs((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      float float0 = FastMath.abs(2091.829F);
      assertEquals(2091.829F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      float float0 = FastMath.abs((-16.0F));
      assertEquals(16.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      long long0 = FastMath.abs(3813L);
      assertEquals(3813L, long0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      int int0 = FastMath.abs((-13));
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      int int0 = FastMath.abs(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      double double0 = FastMath.toDegrees(125.03125);
      assertEquals(7163.762932245074, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      double double0 = FastMath.toRadians((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      double double0 = FastMath.toRadians(6.103515621210439E-5);
      assertEquals(1.0652644353702921E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      double double0 = FastMath.acos((-1.8409546441412518E-8));
      assertEquals(1.5707963452044431, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      double double0 = FastMath.acos(1845.206);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      double double0 = FastMath.acos((-1370.98092));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      double double0 = FastMath.asin((-8.0E298));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      double double0 = FastMath.asin(3.141592653589793);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      double double0 = FastMath.atan2((-1592.4552F), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      double double0 = FastMath.atan2((-8.56825295972308E226), 3.380120956554982E-123);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      double double0 = FastMath.atan2(2465.988144, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      double double0 = FastMath.atan2((-2261.721), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      double double0 = FastMath.atan2(0.2596699708288747, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      double double0 = FastMath.atan2((-1.56400149127482E-259), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      double double0 = FastMath.atan2(2879.67050031211, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      double double0 = FastMath.atan2((-2807.144102091237), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 0.3333333333332802);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 1025.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, (-6167.431546697243));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-2932.0781));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 80.332);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-1.8409546441412518E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      double double0 = FastMath.asin(8.467026501338835E-8);
      assertEquals(8.467026501338845E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double double0 = FastMath.asin((-6.032174644509064E-23));
      assertEquals((-6.032174644509064E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      double double0 = FastMath.tan(1.4E-45F);
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double double0 = FastMath.tan(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      double double0 = FastMath.cos((-2798.033588));
      assertEquals((-0.430755698783069), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      double double0 = FastMath.sin((-2140396244));
      assertEquals((-0.5467809469925522), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      double double0 = FastMath.cos(1.792783182582235E246);
      assertEquals((-0.1207506098569779), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      double double0 = FastMath.cos(9.320900373401115E275);
      assertEquals(0.2999918308303658, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      double double0 = FastMath.sin(4.503599627370496E15);
      assertEquals(0.8742173026236351, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      double double0 = FastMath.sin(4.498588507857244E250);
      assertEquals((-0.8414886658683733), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      double double0 = FastMath.tan((-4.789917000227385E145));
      assertEquals(12.7469568476652, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      double double0 = FastMath.sin(3410978.1327726105);
      assertEquals(0.19113938257766305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      double double0 = FastMath.sin((-2.394015322088228E181));
      assertEquals((-0.49113474075943536), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      double double0 = FastMath.sin(3410977.277371421);
      assertEquals((-0.6155458470965838), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      double double0 = FastMath.sin(1.7976931348623157E308);
      assertEquals(0.004961954789184062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      double double0 = FastMath.tan((-255.47335134));
      assertEquals((-1.5723979620552389), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double double0 = FastMath.sin(3.380120956554982E-123);
      assertEquals(3.380120956554982E-123, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1507));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      double double0 = FastMath.pow((-1.6166170913368169E-12), (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      double double0 = FastMath.pow(626.75526217, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      double double0 = FastMath.pow((-1.8349670703969982E-34), (-20.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      double double0 = FastMath.pow((-113.842), 945.0841835478248);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      double double0 = FastMath.pow((double) (-527.0F), 7.710512446969693E192);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.4E-45F), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      double double0 = FastMath.pow((-1416.2), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1645.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 0.3000000000001819);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      double double0 = FastMath.pow(1505.2355625, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.0F, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double double0 = FastMath.pow(0.8762307735665577, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-596.208472997275));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 0.041666663879186654);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-2775.74123));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-2792.976));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      double double0 = FastMath.pow(4.814793918384117E127, (double) 0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      double double0 = FastMath.log1p(1916.39116165489);
      assertEquals(7.558720771085433, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      double double0 = FastMath.log(1.0, 0.3333333134651184);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      double double0 = FastMath.log10(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      double double0 = FastMath.log10(0.8506768752065795);
      assertEquals((-0.07023537289238313), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      double double0 = FastMath.log(20.0, 4.9E-324);
      assertEquals((-248.50020093358134), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      double double0 = FastMath.acosh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      double double0 = FastMath.log1p((-1838.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double double0 = FastMath.expm1((-0.31955484499700954));
      assertEquals((-0.2735276420909345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      double double0 = FastMath.pow((double) 131060, 3.141592653589793);
      assertEquals(1.1940064448966244E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      double double0 = FastMath.expm1(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      double double0 = FastMath.exp((-730.7454190704365));
      assertEquals(4.37821E-318, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      double double0 = FastMath.expm1((-2799.7162130487527));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      float float0 = FastMath.signum(2266.8F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      float float0 = FastMath.signum((-471.1F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      float float0 = FastMath.signum((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      double double0 = FastMath.signum((-1121.6728));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      double double0 = FastMath.signum(2135.730677592);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      double double0 = FastMath.atanh(0.041666666666621166);
      assertEquals(0.041690804469479946, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      double double0 = FastMath.atanh(0.1428571343421936);
      assertEquals(0.14384102753354644, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      double double0 = FastMath.atanh((-3585.064185));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      double double0 = FastMath.atanh(0.19999999999923582);
      assertEquals(0.20273255405328616, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      double double0 = FastMath.asinh((-2181));
      assertEquals((-8.380685999318342), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      double double0 = FastMath.tanh(6.551846134861994E-17);
      assertEquals(6.551846134861994E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      double double0 = FastMath.tanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      double double0 = FastMath.tanh((-302.143981306));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      double double0 = FastMath.tanh(2.85040095144011776E17);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      double double0 = FastMath.sinh((-350.275768282));
      assertEquals((-6.634425377851263E151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      double double0 = FastMath.sinh(2.2250738585072014E-308);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      double double0 = FastMath.sinh(125.03125);
      assertEquals(9.985089105417813E53, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      double double0 = FastMath.sinh(6.809741127603255E225);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      double double0 = FastMath.sinh((-4.789917000227385E145));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      double double0 = FastMath.cosh((-477.7252773));
      assertEquals(1.487379534090271E207, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      double double0 = FastMath.cosh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      double double0 = FastMath.cosh(81.572500309227);
      assertEquals(1.3349246841256283E35, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      double double0 = FastMath.atan2(2.2250738585072014E-308, 1.0537591246531136E255);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      double double0 = FastMath.hypot((-2.4151930593158485E-17), (-2487.2600951704));
      assertEquals(2487.2600951704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      String[] stringArray0 = new String[8];
      FastMath.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      double double0 = FastMath.cosh((-1291.6));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(7.281207480411644, 726.3709056444181);
      assertEquals(7.281207480411644, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      double double0 = FastMath.atan((-1644.3614449108409));
      assertEquals((-1.5701881880673576), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.0F));
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      double double0 = FastMath.acosh((-8.629967484362177E-9));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      int int0 = FastMath.round(599.4158F);
      assertEquals(599, int0);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      long long0 = FastMath.round((-5.235397688850367E180));
      assertEquals((-9223372036854775808L), long0);
  }
@Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      FastMath.copySign((-1495.0F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      FastMath.copySign(0.0F, (float) (-578));
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      FastMath.copySign(0.0F, 2153.4607F);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      FastMath.copySign((-0.9999999999999998), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      FastMath.hypot(1.3137214081023085E-8, (-1.776856617288104));
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      FastMath.hypot((-5.002774317612589E-8), 2.220446049250313E-16);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      FastMath.max(0L, 3204L);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      FastMath.max((-2098), 2044);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      FastMath.rint(839.9945818404896);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      FastMath.scalb(1.954335F, (-127));
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      FastMath.scalb(1632.6469F, 276);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      FastMath.scalb(1748.026F, (-277));
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      FastMath.scalb((-1.5707963267948966), (-1023));
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      FastMath.scalb((-1159.506934097217), 2097);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      FastMath.ulp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      FastMath.ulp(2766.1344005325786);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      FastMath.toRadians(1.887237361505784E-207);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      FastMath.asin((-1.2246467991473532E-16));
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      FastMath.atan2(0.0F, 3.448765014623506E49);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      FastMath.sin(3.2542391242036633E233);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      FastMath.pow(1.633123935319537E16, (-20.0));
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      FastMath.toDegrees(8.69177352065934E-9);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      FastMath.sqrt(2.719805132368625E-271);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      FastMath.round((-1.2207031E-4F));
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      FastMath.round(903.90436F);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      FastMath.round((-4.0852427502515625E-8));
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      FastMath.round((-135.1459292));
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      FastMath.pow(1.3277776999702289, (-3745));
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      FastMath.nextUp((double) (-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      FastMath.nextAfter((-1.4E-45F), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      FastMath.min(2990L, 1L);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      FastMath.min(0, 2203);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      FastMath.min(17, 52);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      FastMath.min(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      FastMath.max((-860), (-860));
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      FastMath.max((-393.521), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      FastMath.log10(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      FastMath.log(0.0, 0.26296502351760864);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      FastMath.log(3.141592653589793, 3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      FastMath.log((double) 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      FastMath.log(0.4860306440673961);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      FastMath.getExponent((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      FastMath.getExponent(-0.0);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      FastMath.copySign(0.0, (-7.08313012515209E-155));
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      FastMath.ceil((-3.141592653589793));
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      FastMath.atan(1.9999999999999998);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      FastMath.acosh((-1.7198866036687559E90));
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      FastMath.IEEEremainder(1.3961255018698695E-220, 1232);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      FastMath.IEEEremainder((-1834.8603139469), (-6423182));
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(0.0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      double double0 = FastMath.copySign(3.141592653589793, 3.141592653589793);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      double double0 = FastMath.floor((-904));
      assertEquals((-904.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      double double0 = FastMath.floor((-8.0E298));
      assertEquals((-8.0E298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      double double0 = FastMath.floor(1.7014116317805963E38);
      assertEquals(1.7014116317805963E38, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      double double0 = FastMath.floor((-15.0746424121));
      assertEquals((-16.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      float float0 = FastMath.nextAfter(1107.4F, 1.0);
      assertEquals(1107.3999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.5F, 1485.2174006509);
      assertEquals(0.50000006F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      double double0 = FastMath.nextAfter((-912.1670641879743), (-2078.3304));
      assertEquals((-912.1670641879745), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      double double0 = FastMath.abs(19.364336291428643);
      assertEquals(19.364336291428643, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      double double0 = FastMath.pow(1436.56, (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      int int0 = FastMath.getExponent(1594.0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      double double0 = FastMath.log(9.903174064539538E203);
      assertEquals(469.7176291961263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, (float) 8);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      float float0 = FastMath.copySign((float) 1, -0.0F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      float float0 = FastMath.copySign((-859.04F), (-859.04F));
      assertEquals((-859.04F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-1587), Double.NaN);
      assertEquals(1587.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NaN, (double) (-24));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      double double0 = FastMath.copySign((-222.7712346731), (-222.7712346731));
      assertEquals((-222.7712346731), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      double double0 = FastMath.hypot(9.098790295810902E-8, 1258);
      assertEquals(1258.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, (-475.8794795));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      double double0 = FastMath.hypot(1040, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 1337.0943335);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      double double0 = FastMath.max(2.718281828459045, 3.141592653589793);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      double double0 = FastMath.max(1918.3, (-1402.93));
      assertEquals(1918.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      double double0 = FastMath.max((-2971.470942047596), (-2971.470942047596));
      assertEquals((-2971.470942047596), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      float float0 = FastMath.max((-2.4332566F), (-2.4332566F));
      assertEquals((-2.4332566F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      float float0 = FastMath.max(0.0F, (-698.0901F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      float float0 = FastMath.max(0.0F, 120.0F);
      assertEquals(120.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      long long0 = FastMath.max((long) (-860), (long) (-860));
      assertEquals((-860L), long0);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      long long0 = FastMath.max(6L, 0L);
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      int int0 = FastMath.max(260, 1);
      assertEquals(260, int0);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (double) 2144325191);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      double double0 = FastMath.min(1856.8808831538, Double.POSITIVE_INFINITY);
      assertEquals(1856.8808831538, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      double double0 = FastMath.min(7.568772963781632E-10, (-18.430862426757812));
      assertEquals((-18.430862426757812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      double double0 = FastMath.min(8.0E298, 8.0E298);
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, 0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      float float0 = FastMath.min((-2.1017349F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), (-1.4E-45F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), (-140.03F));
      assertEquals((-140.03F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), Float.POSITIVE_INFINITY);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      long long0 = FastMath.min((-1443L), 2935890503282001226L);
      assertEquals((-1443L), long0);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      int int0 = FastMath.min((-1587), (-1587));
      assertEquals((-1587), int0);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      int int0 = FastMath.min(169, (-2721));
      assertEquals((-2721), int0);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      double double0 = FastMath.rint((-3.0287143914420064E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      double double0 = FastMath.rint((-375.0378892460611));
      assertEquals((-375.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      double double0 = FastMath.ceil(3.141592653589793);
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      double double0 = FastMath.ceil((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      float float0 = FastMath.nextUp(287.552F);
      assertEquals(287.55203F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (-1279.1441517208));
      assertEquals((-1.0000001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-6.5551603409));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 6769.175863497);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2202.995667);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.997844754509471E-9);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, (double) 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 1040, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 3294197.267666618);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2213.52654183301), (-1.57034455903288));
      assertEquals((-2213.5265418330096), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      double double0 = FastMath.nextAfter(721.07, 1.734665280502264E-8);
      assertEquals(721.0699999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, (-1.7153446350968184));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2766.1344005325786);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-1.7168146928204135));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 219);
      assertEquals(1.1805916E21F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), (-223));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      float float0 = FastMath.scalb(2068.1594F, (-141));
      assertEquals(7.41916E-40F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 1054);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      float float0 = FastMath.scalb((-1017.80237F), 1315);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      float float0 = FastMath.scalb(2766.58F, (-2213));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 1054);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 219);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 204);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      float float0 = FastMath.scalb((float) 17, 17);
      assertEquals(2228224.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 128);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-3387), (-3387));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      double double0 = FastMath.scalb(1.8014398509481984E16, 2065);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      double double0 = FastMath.scalb((-6.492869512756698E-17), 1024);
      assertEquals((-1.1672186948639547E292), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      double double0 = FastMath.scalb(4.9E-324, 1360);
      assertEquals(1.2433080910244666E86, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      double double0 = FastMath.scalb((-958.9439601472072), (-1587));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      double double0 = FastMath.scalb(30.918072668, (-1035));
      assertEquals(8.3978265684807E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      double double0 = FastMath.scalb(709.782712893384, (-1028));
      assertEquals(2.4676858744990484E-307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      double double0 = FastMath.scalb((-560.1), 2143462143);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, 135306725);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      double double0 = FastMath.scalb(412.895242414995, (-3659));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      double double0 = FastMath.scalb(-0.0, (-1750));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, (-3659));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1040);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1, 1);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-3673), (-3673));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      double double0 = FastMath.abs((-2.0821912536551675E-8));
      assertEquals(2.0821912536551675E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      float float0 = FastMath.abs((-4097.06F));
      assertEquals(4097.06F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      float float0 = FastMath.abs(3.0517578E-5F);
      assertEquals(3.0517578E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      long long0 = FastMath.abs((-624L));
      assertEquals(624L, long0);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      long long0 = FastMath.abs(1073741824L);
      assertEquals(1073741824L, long0);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      int int0 = FastMath.abs((-2946));
      assertEquals(2946, int0);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      int int0 = FastMath.abs(993);
      assertEquals(993, int0);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      double double0 = FastMath.toDegrees((-0.47754099973766034));
      assertEquals((-27.36108382942589), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      double double0 = FastMath.cbrt(435.1965);
      assertEquals(7.578125582243906, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      double double0 = FastMath.acos((-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      double double0 = FastMath.acos((-1307.0892F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      double double0 = FastMath.acos(2766.1344005325786);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      double double0 = FastMath.asin((-3045.421789));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      double double0 = FastMath.asin(2.718281828459045);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), (-0.21028039F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      double double0 = FastMath.atan2((-7.464389E-37F), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      double double0 = FastMath.atan2(1.01, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      double double0 = FastMath.atan2((-3868.1936F), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      double double0 = FastMath.atan2(7.985580489464097E-19, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      double double0 = FastMath.atan2(1535, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7168146928204135), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, (-2267.127587));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-2192.5582871047664));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2196.42627977));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      double double0 = FastMath.atan2(2653.384400205, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      double double0 = FastMath.asin(2.802596928649634E-45);
      assertEquals(2.802596928649634E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      double double0 = FastMath.atan2((-3.4028232635611926E38), 2125);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      double double0 = FastMath.acos(1.4E-45F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-1217.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      double double0 = FastMath.atan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      double double0 = FastMath.tan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      double double0 = FastMath.sin((-2234.2F));
      assertEquals(0.5034390913436836, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      double double0 = FastMath.sin((-2147483647));
      assertEquals(0.7249165551445564, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028235E38F));
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      double double0 = FastMath.tan((-1.5343120819745468E95));
      assertEquals((-2.8385779812768237), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      double double0 = FastMath.sin(3.448765014623506E49);
      assertEquals((-0.9948719852476267), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      double double0 = FastMath.tan(1.0386032577072378E209);
      assertEquals(4.349130172218527, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      double double0 = FastMath.cos(6.7108864E7);
      assertEquals((-0.9071720390522806), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      double double0 = FastMath.tan(3.872917381663487E10);
      assertEquals((-4.806607242362901), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      double double0 = FastMath.sin(4.503599627370496E15);
      assertEquals(0.8742173026236351, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      double double0 = FastMath.tan(0.17020416259765625);
      assertEquals(0.17186700800516258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      double double0 = FastMath.sin(3.6938826366068014E-196);
      assertEquals(3.6938826366068014E-196, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      double double0 = FastMath.pow((double) 1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      double double0 = FastMath.pow(2819.18, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      double double0 = FastMath.pow((double) (-21), (-21));
      assertEquals((-1.7115705711410172E-28), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      double double0 = FastMath.pow((-2504.382443437425), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      double double0 = FastMath.pow(419.283749875, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      double double0 = FastMath.pow((double) (-2146240348), (double) (-2146240348));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      double double0 = FastMath.pow((-1083.0), (-1083.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      double double0 = FastMath.pow((-3415.0), 1.0407926842436056E294);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      double double0 = FastMath.pow((-3224.342287), 3.0287143914420064E-8);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      double double0 = FastMath.pow((double) (-3.4028233E38F), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      double double0 = FastMath.pow(2.7755575615628914E-17, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 1794.18130322783);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) (-0.21028039F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 390.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      double double0 = FastMath.pow((-0.8438894065707786), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      double double0 = FastMath.pow((-1148.806), (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-20.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 3.0287143914420064E-8);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-20.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-3387));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 4.473779311490168E-38);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-9.628709342929729E-9));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, (-2224.84771));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      double double0 = FastMath.log10((-1.5704597931448117));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      double double0 = FastMath.log1p(1.1099648061301941E-7);
      assertEquals(1.1099647445291051E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      double double0 = FastMath.log1p((-0.4775410278531622));
      assertEquals((-0.6492088204332099), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      double double0 = FastMath.log1p(0.7853981633974483);
      assertEquals(0.5796414510841191, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324, Double.POSITIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      double double0 = FastMath.log1p((-2671.15F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      double double0 = FastMath.atanh(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      double double0 = FastMath.expm1((-6.663542893624021E-14));
      assertEquals((-6.663542893623799E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      double double0 = FastMath.expm1(1040);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, (-709.782712893384));
      assertEquals(5.562684646268344E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      double double0 = FastMath.expm1((-729.85));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      double double0 = FastMath.exp((-879.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      double double0 = FastMath.exp((-116.775422447057));
      assertEquals(1.927872947927935E-51, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      float float0 = FastMath.signum((-1169.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      float float0 = FastMath.signum((float) 1040);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      double double0 = FastMath.signum((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      double double0 = FastMath.signum((double) (-23.641666F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      double double0 = FastMath.signum((double) 1.4E-45F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      double double0 = FastMath.atanh(0.04450073F);
      assertEquals(0.04453014104022869, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      double double0 = FastMath.atanh(0.1477125883102417);
      assertEquals(0.14880118965599784, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      double double0 = FastMath.asinh(0.031);
      assertEquals(0.03099503697929222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      double double0 = FastMath.asinh(0.125);
      assertEquals(0.12467674692144275, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      double double0 = FastMath.asinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      double double0 = FastMath.tanh(7.985580489464097E-19);
      assertEquals(7.985580489464097E-19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      double double0 = FastMath.tanh((-39.535901541));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      double double0 = FastMath.tanh(1002.6112566);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      double double0 = FastMath.sinh(2.1377905661197194E-104);
      assertEquals(2.1377905661197194E-104, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      double double0 = FastMath.sinh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      double double0 = FastMath.sinh((-424.0422));
      assertEquals((-7.213691384816105E183), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      double double0 = FastMath.sinh((-5425.7803014));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      double double0 = FastMath.sinh(788.60463167);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      double double0 = FastMath.sinh(487.46);
      assertEquals(2.5128013278998014E211, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      double double0 = FastMath.cosh((-702.58695));
      assertEquals(6.739155020927938E304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      double double0 = FastMath.cosh(2459.15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      double double0 = FastMath.cosh(624.0930394797407);
      assertEquals(5.484452059751682E270, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1090()  throws Throwable  {
      double double0 = FastMath.toRadians((-1.7475689218952297E-308));
      assertEquals((-3.05008315925993E-310), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      double double0 = FastMath.hypot(2.083115484919861E219, (-2.1414301981236817E-8));
      assertEquals(2.083115484919861E219, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      int int0 = FastMath.getExponent(2176.165F);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      String[] stringArray0 = new String[4];
      FastMath.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      double double0 = FastMath.cosh((-1307.78F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      double double0 = FastMath.nextUp(1.49414062);
      assertEquals(1.4941406200000003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(3.141592653589793, 3.141592653589793);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      double double0 = FastMath.atan((-2971.470942047596));
      assertEquals((-1.5704597931448117), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      float float0 = FastMath.nextUp((-3127.095F));
      assertEquals((-3127.0947F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      double double0 = FastMath.acosh(961.00632214);
      assertEquals(7.561127897518625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      double double0 = FastMath.asinh((-1.0F));
      assertEquals((-0.8813735870195429), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      double double0 = FastMath.expm1((-2079.38675));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      int int0 = FastMath.round((-860.48F));
      assertEquals((-860), int0);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      long long0 = FastMath.round(2510.095975698939);
      assertEquals(2510L, long0);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      double double0 = FastMath.cos((-695.42728));
      assertEquals((-0.42185722866160486), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      FastMath.copySign((-298.8733F), 2900.95F);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      FastMath.copySign(0.0F, (-1482.0F));
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      FastMath.copySign(0.0F, 985.3178F);
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      FastMath.copySign((double) (-1100.91F), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      FastMath.hypot(3.1660099222737955E-7, (-32.4432255881));
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      FastMath.max(1023L, 3153L);
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      FastMath.max((-2006), 582);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      FastMath.min((long) (-467), (long) 231);
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      FastMath.rint((-945.129));
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      FastMath.ceil((-424.8));
  }

  @Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
      FastMath.scalb((-1.0F), (-127));
  }

  @Test(timeout = 4000)
  public void test_1119()  throws Throwable  {
      FastMath.scalb((float) (-145), 276);
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      FastMath.scalb((float) (-145), (-277));
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      FastMath.scalb((-1.0F), 128);
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      FastMath.scalb(1.125, (-1023));
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      FastMath.scalb(1781.2268, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      FastMath.scalb(9.755392680573412E-9, 1024);
  }

  @Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      FastMath.ulp((-2133.5652F));
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      FastMath.cbrt(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      FastMath.asin((-1.8592937532754405E-9));
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      FastMath.atan2(0.0, 2.3195229636950566E-16);
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      FastMath.tan((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      FastMath.cos(8388557);
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      FastMath.tanh(0.5F);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      FastMath.atan2(0.5F, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1153()  throws Throwable  {
      FastMath.toDegrees((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      FastMath.toRadians((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
      FastMath.toDegrees(1147.0);
  }

  @Test(timeout = 4000)
  public void test_1156()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1157()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      FastMath.round(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      FastMath.round((double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      FastMath.round(2767.3329034816);
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      FastMath.rint((-2151.75084092));
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      FastMath.pow((-1.0006958045419199), (-249));
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      FastMath.nextAfter(0.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      FastMath.min(142L, 0L);
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      FastMath.min(351, 145);
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      FastMath.max((-2146266253), (-2146266253));
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      FastMath.max((float) (-420196813), (-339.63586F));
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      FastMath.max((-2290.13588742), (double) -0.0F);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      FastMath.max(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      FastMath.log(0.0, 8.711129287069315E-8);
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      FastMath.log(4.547473508864641E-13, 8388608.0);
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      FastMath.log((double) 582);
  }

  @Test(timeout = 4000)
  public void test_1180()  throws Throwable  {
      FastMath.log((double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1181()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
      FastMath.getExponent(1.2207031E-4F);
  }

  @Test(timeout = 4000)
  public void test_1183()  throws Throwable  {
      FastMath.getExponent((-1.0007731809084428));
  }

  @Test(timeout = 4000)
  public void test_1184()  throws Throwable  {
      FastMath.getExponent((-1434.809371113));
  }

  @Test(timeout = 4000)
  public void test_1185()  throws Throwable  {
      FastMath.copySign(0.0, (-77.4));
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      FastMath.atan((-2029.058573069763));
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      FastMath.acosh((-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      FastMath.IEEEremainder((-467), (-29.7589493205597));
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      FastMath.IEEEremainder(0.5930894613265991, (-2.4642997069960124E-8));
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(4.9E-324, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      String[] stringArray0 = new String[3];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      double double0 = FastMath.copySign(1914.55061965164, 1945.1489098424438);
      assertEquals(1914.55061965164, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      double double0 = FastMath.floor((-3373.565));
      assertEquals((-3374.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (double) (-2196));
      assertEquals((-1.0000001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      float float0 = FastMath.nextAfter((-2353.12F), (double) 3.4028235E38F);
      assertEquals((-2353.1199F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 1829);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      double double0 = FastMath.nextAfter(1024.0, 3.4028234663852886E38);
      assertEquals(1024.0000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-420196813), 736.72);
      assertEquals((-4.2019681299999994E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 9.1930705055710536E18);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (double) 2501);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 1071);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      double double0 = FastMath.scalb(1.0, 163);
      assertEquals(1.1692013098647223E49, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      double double0 = FastMath.abs(752.3623);
      assertEquals(752.3623, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      float float0 = FastMath.abs(384.7F);
      assertEquals(384.7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      double double0 = FastMath.sqrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      float float0 = FastMath.copySign((-3.4028235E38F), 0.0F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      float float0 = FastMath.copySign(2526.516F, (-573.0071F));
      assertEquals((-2526.516F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      float float0 = FastMath.copySign((-12.116487F), (-12.116487F));
      assertEquals((-12.116487F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      double double0 = FastMath.copySign(2.718281828459045, Double.NEGATIVE_INFINITY);
      assertEquals((-2.718281828459045), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      double double0 = FastMath.copySign((-1.9841269659586505E-4), 855.552278551);
      assertEquals(1.9841269659586505E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      double double0 = FastMath.hypot((-3.940510424527919E-20), 2114.892247895);
      assertEquals(2114.892247895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      double double0 = FastMath.hypot((-1.401298464324817E-45), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      double double0 = FastMath.hypot((-1610.8808777), Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      double double0 = FastMath.max((double) 0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      double double0 = FastMath.max(0.5145297050476074, 0.5145297050476074);
      assertEquals(0.5145297050476074, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      double double0 = FastMath.max(4762.88, (-2396.4371));
      assertEquals(4762.88, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      float float0 = FastMath.max(8388608.0F, 8388608.0F);
      assertEquals(8388608.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      float float0 = FastMath.max(322.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      float float0 = FastMath.max(1829.0F, 384.7F);
      assertEquals(1829.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      long long0 = FastMath.max((long) (-3882), (long) (-3882));
      assertEquals((-3882L), long0);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      long long0 = FastMath.max(1023L, (-2176L));
      assertEquals(1023L, long0);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      int int0 = FastMath.max(1252, 0);
      assertEquals(1252, int0);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1242()  throws Throwable  {
      double double0 = FastMath.min((double) (-1782), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1243()  throws Throwable  {
      double double0 = FastMath.min(0.0, 1620.8257436);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1244()  throws Throwable  {
      double double0 = FastMath.min(0.1666666505023083, 1.883511811213715E-8);
      assertEquals(1.883511811213715E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1245()  throws Throwable  {
      double double0 = FastMath.min(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1246()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, 0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1247()  throws Throwable  {
      float float0 = FastMath.min((-0.019629538F), (-0.019629538F));
      assertEquals((-0.019629538F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1248()  throws Throwable  {
      float float0 = FastMath.min(235.23F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1249()  throws Throwable  {
      float float0 = FastMath.min(3399.02F, 1806.8F);
      assertEquals(1806.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1250()  throws Throwable  {
      float float0 = FastMath.min((-918.905F), (-1.4E-45F));
      assertEquals((-918.905F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1251()  throws Throwable  {
      long long0 = FastMath.min((-123L), (-123L));
      assertEquals((-123L), long0);
  }

  @Test(timeout = 4000)
  public void test_1252()  throws Throwable  {
      long long0 = FastMath.min(928L, 541L);
      assertEquals(541L, long0);
  }

  @Test(timeout = 4000)
  public void test_1253()  throws Throwable  {
      int int0 = FastMath.min((-597), 582);
      assertEquals((-597), int0);
  }

  @Test(timeout = 4000)
  public void test_1254()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1255()  throws Throwable  {
      double double0 = FastMath.rint((-0.23104990639326328));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1256()  throws Throwable  {
      double double0 = FastMath.rint(1925.9844562);
      assertEquals(1926.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1257()  throws Throwable  {
      double double0 = FastMath.rint(0.5F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1258()  throws Throwable  {
      double double0 = FastMath.ceil(712.89);
      assertEquals(713.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1259()  throws Throwable  {
      double double0 = FastMath.ceil((-1.0938612624777085E-7));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1260()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1261()  throws Throwable  {
      double double0 = FastMath.floor(3.4028235E38F);
      assertEquals(3.4028234663852886E38, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1262()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1263()  throws Throwable  {
      float float0 = FastMath.nextUp(793.00116F);
      assertEquals(793.0012F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1264()  throws Throwable  {
      float float0 = FastMath.nextAfter(2604.6821F, (-342.034));
      assertEquals(2604.682F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1265()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-5.343822444010118E-15));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1266()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-398.16065532823));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1267()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 3.7179924024793253E227);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1268()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.07374182E9F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1269()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (double) Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1270()  throws Throwable  {
      double double0 = FastMath.nextUp(2543103.0);
      assertEquals(2543103.0000000005, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1271()  throws Throwable  {
      double double0 = FastMath.nextAfter(1317.921499664, 70.8011904746264);
      assertEquals(1317.9214996639998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1272()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-4.6753408714233723E244));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1273()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.3560888171195984);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1274()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 141.1718099268);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1275()  throws Throwable  {
      double double0 = FastMath.nextAfter(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1276()  throws Throwable  {
      double double0 = FastMath.nextAfter(2.2250738585072014E-308, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1277()  throws Throwable  {
      float float0 = FastMath.scalb(5079.276F, 270);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1278()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 235);
      assertEquals(7.7371252E25F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1279()  throws Throwable  {
      float float0 = FastMath.scalb(5079.276F, (-230));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1280()  throws Throwable  {
      float float0 = FastMath.scalb(1295.453F, (-160));
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1281()  throws Throwable  {
      float float0 = FastMath.scalb(5079.276F, (-127));
      assertEquals(2.98533E-35F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1282()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1353, 1353);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1283()  throws Throwable  {
      float float0 = FastMath.scalb((-3266.2275F), 3524);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1284()  throws Throwable  {
      float float0 = FastMath.scalb(0.5F, (-1073741824));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1285()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 871);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1286()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-2542));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1287()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 4057);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1288()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 1);
      assertEquals((-2.8E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1289()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2543), (-2543));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1290()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1025, 1025);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1291()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2250738585072014E-308), 1500);
      assertEquals((-7.804371375789981E143), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1292()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2147483631), 1832);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1293()  throws Throwable  {
      double double0 = FastMath.scalb((-0.5925838097534137), (-1525));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1294()  throws Throwable  {
      double double0 = FastMath.hypot(4.9E-324, 4.9E-324);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1295()  throws Throwable  {
      double double0 = FastMath.scalb(0.67232320417461, (-1023));
      assertEquals(7.479843930383623E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1296()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1297()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1073741824, 1073741824);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1298()  throws Throwable  {
      double double0 = FastMath.scalb((-4.9E-324), 1071);
      assertEquals((-0.125), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1299()  throws Throwable  {
      double double0 = FastMath.scalb(0.5000000000042687, (-2147483631));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1300()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1301()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, Integer.MIN_VALUE);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1302()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1023));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1303()  throws Throwable  {
      double double0 = FastMath.scalb((-152.82), 2049732625);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1304()  throws Throwable  {
      double double0 = FastMath.scalb((-3.940510424527919E-20), (-2147483631));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1305()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1306()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1307()  throws Throwable  {
      double double0 = FastMath.ulp(1.126326877851684E-7);
      assertEquals(1.3234889800848443E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1308()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1309()  throws Throwable  {
      double double0 = FastMath.abs((-3.940510424527919E-20));
      assertEquals(3.940510424527919E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1310()  throws Throwable  {
      double double0 = FastMath.hypot(608.3773485806, (-8.697724830833087E-8));
      assertEquals(608.3773485806, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1311()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1312()  throws Throwable  {
      float float0 = FastMath.abs((-390.139F));
      assertEquals(390.139F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1313()  throws Throwable  {
      long long0 = FastMath.abs((-3958705157555305932L));
      assertEquals(3958705157555305932L, long0);
  }

  @Test(timeout = 4000)
  public void test_1314()  throws Throwable  {
      long long0 = FastMath.abs(928L);
      assertEquals(928L, long0);
  }

  @Test(timeout = 4000)
  public void test_1315()  throws Throwable  {
      int int0 = FastMath.abs((-2196));
      assertEquals(2196, int0);
  }

  @Test(timeout = 4000)
  public void test_1316()  throws Throwable  {
      int int0 = FastMath.abs(582);
      assertEquals(582, int0);
  }

  @Test(timeout = 4000)
  public void test_1317()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1318()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1319()  throws Throwable  {
      double double0 = FastMath.toRadians((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1320()  throws Throwable  {
      double double0 = FastMath.toRadians(0.19999999999923582);
      assertEquals(0.0034906585039753218, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1321()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1322()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1323()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1324()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1325()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1326()  throws Throwable  {
      double double0 = FastMath.cbrt((-1586.79));
      assertEquals((-11.663793396736759), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1327()  throws Throwable  {
      double double0 = FastMath.acos((-0.5652091992666405));
      assertEquals(2.171483149323774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1328()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1329()  throws Throwable  {
      double double0 = FastMath.acos(0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1330()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1331()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1332()  throws Throwable  {
      double double0 = FastMath.acos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1333()  throws Throwable  {
      double double0 = FastMath.acos(2.718281828459045);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1334()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1335()  throws Throwable  {
      double double0 = FastMath.asin(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1336()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1337()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1338()  throws Throwable  {
      double double0 = FastMath.asin((-1.5707963));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1339()  throws Throwable  {
      double double0 = FastMath.asin(1.9722862688653467E192);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1340()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1341()  throws Throwable  {
      double double0 = FastMath.atan2(20.0, (-2.2250738585072014E-308));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1342()  throws Throwable  {
      double double0 = FastMath.atan2((-888.9), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1343()  throws Throwable  {
      double double0 = FastMath.atan2((-1336.092), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1344()  throws Throwable  {
      double double0 = FastMath.atan2(0.5F, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1345()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0F), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1346()  throws Throwable  {
      double double0 = FastMath.atan2(2061.3, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1347()  throws Throwable  {
      double double0 = FastMath.atan2(8.235445660525604E260, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1348()  throws Throwable  {
      double double0 = FastMath.atan2((-1628.444213), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1349()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1350()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1351()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-0.02015591714318871));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1352()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1353()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, (-2.6437112632041807E-8));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1354()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, (-2.5857668233170385E-8));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1355()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1356()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1357()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1358()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1336.092));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1359()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, -0.0F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1360()  throws Throwable  {
      double double0 = FastMath.atan2(5.650007086920087E-9, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1361()  throws Throwable  {
      double double0 = FastMath.asin(8.741165305E-314);
      assertEquals(8.741165305E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1362()  throws Throwable  {
      double double0 = FastMath.atan2(4122.89037, (-140.7927663797573));
      assertEquals(1.6049321061091, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1363()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1364()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1365()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1366()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1367()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1368()  throws Throwable  {
      double double0 = FastMath.cos((-2353.470159592826));
      assertEquals((-0.9142019425759685), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1369()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1370()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1371()  throws Throwable  {
      double double0 = FastMath.sin(3.4028234663852886E38);
      assertEquals((-0.5218765233336585), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1372()  throws Throwable  {
      double double0 = FastMath.sin((-1023.0));
      assertEquals(0.9164853722719367, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1373()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1374()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1375()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1376()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1377()  throws Throwable  {
      double double0 = FastMath.tan(8388577);
      assertEquals((-0.03106788737342634), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1378()  throws Throwable  {
      double double0 = FastMath.tan(8388608);
      assertEquals((-0.4793412386265429), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1379()  throws Throwable  {
      double double0 = FastMath.tan(1073741824L);
      assertEquals((-0.7846966133192005), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1380()  throws Throwable  {
      double double0 = FastMath.tan(1.070962389529409E127);
      assertEquals(1.9967516457749581, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1381()  throws Throwable  {
      double double0 = FastMath.tan(3.732653864247646E138);
      assertEquals(0.355616214813, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1382()  throws Throwable  {
      double double0 = FastMath.sin((-8.0E298));
      assertEquals((-0.042338395486962485), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1383()  throws Throwable  {
      double double0 = FastMath.cos((-4.768909872963015E232));
      assertEquals(0.8109757466738373, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1384()  throws Throwable  {
      double double0 = FastMath.sin((-5.056512677995137E101));
      assertEquals(0.9531790375747462, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1385()  throws Throwable  {
      double double0 = FastMath.tan(1.3157594203948975);
      assertEquals(3.835617901450323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1386()  throws Throwable  {
      double double0 = FastMath.sin((-1.497405487919762E-139));
      assertEquals((-1.497405487919762E-139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1387()  throws Throwable  {
      double double0 = FastMath.pow((double) 1073741824, 1073741824);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1388()  throws Throwable  {
      double double0 = FastMath.pow(2.0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1389()  throws Throwable  {
      double double0 = FastMath.pow((-95.6709), (-472));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1390()  throws Throwable  {
      double double0 = FastMath.pow((-2115.749777184395), (double) (-2542));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1391()  throws Throwable  {
      double double0 = FastMath.pow((double) (-241), (double) (-241));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1392()  throws Throwable  {
      double double0 = FastMath.pow((-7.877917738262007E-9), (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1393()  throws Throwable  {
      double double0 = FastMath.pow((-121.7602348593732), 8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1394()  throws Throwable  {
      double double0 = FastMath.pow((-709.782712893384), (-709.782712893384));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1395()  throws Throwable  {
      double double0 = FastMath.pow(2.4256181927024344E-120, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1396()  throws Throwable  {
      double double0 = FastMath.pow((-2449.6), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1397()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1071);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1398()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 0.7853981633974483);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1399()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1400()  throws Throwable  {
      double double0 = FastMath.pow((double) (-123L), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1401()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1402()  throws Throwable  {
      double double0 = FastMath.pow((-3.9945124955316294E-8), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1403()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1404()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1405()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1406()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1248.47613304));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1407()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 857);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1408()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.5707963267948966);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1409()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 2.4557628631591797);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1410()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) -0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1411()  throws Throwable  {
      double double0 = FastMath.log10((-16.01372582588722));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1412()  throws Throwable  {
      double double0 = FastMath.log1p((-2.209492705846306E-7));
      assertEquals((-2.2094929499392433E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1413()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1414()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1415()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1416()  throws Throwable  {
      double double0 = FastMath.log1p(0.1111111111111111);
      assertEquals(0.1053605156578263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1417()  throws Throwable  {
      double double0 = FastMath.log1p((-0.19787267102608438));
      assertEquals((-0.22048791941071336), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1418()  throws Throwable  {
      double double0 = FastMath.pow(8.8145979066E-314, (-4894.37797012));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1419()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1420()  throws Throwable  {
      double double0 = FastMath.asinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1421()  throws Throwable  {
      double double0 = FastMath.log1p((-127));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1422()  throws Throwable  {
      double double0 = FastMath.atanh(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1423()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1424()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1425()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1426()  throws Throwable  {
      double double0 = FastMath.expm1(2615.2993376590935);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1427()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1428()  throws Throwable  {
      double double0 = FastMath.exp((-720.8436756892435));
      assertEquals(8.741165305E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1429()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1430()  throws Throwable  {
      double double0 = FastMath.exp((-4.503599627370496E15));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1431()  throws Throwable  {
      float float0 = FastMath.signum(2576.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1432()  throws Throwable  {
      float float0 = FastMath.signum((-1.4E-45F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1433()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1434()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1435()  throws Throwable  {
      double double0 = FastMath.signum((-0.12502530217170715));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1436()  throws Throwable  {
      double double0 = FastMath.signum(1858.7512240909984);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1437()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1438()  throws Throwable  {
      double double0 = FastMath.atanh(0.036);
      assertEquals(0.03601556410444137, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1439()  throws Throwable  {
      double double0 = FastMath.atanh(0.11113807559013367);
      assertEquals(0.11159907727494156, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1440()  throws Throwable  {
      double double0 = FastMath.atanh((-2.6437112632041807E-8));
      assertEquals((-2.6437112632041814E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1441()  throws Throwable  {
      double double0 = FastMath.asinh(0.031);
      assertEquals(0.03099503697929222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1442()  throws Throwable  {
      double double0 = FastMath.asinh((-0.05336708838073756));
      assertEquals((-0.05334178880362104), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1443()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1444()  throws Throwable  {
      double double0 = FastMath.tanh(4.9E-324);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1445()  throws Throwable  {
      double double0 = FastMath.tanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1446()  throws Throwable  {
      double double0 = FastMath.tanh((-934.824016));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1447()  throws Throwable  {
      double double0 = FastMath.tanh(1038.288);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1448()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1449()  throws Throwable  {
      double double0 = FastMath.sinh((-7.877917738262007E-9));
      assertEquals((-7.877917738262007E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1450()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1451()  throws Throwable  {
      double double0 = FastMath.sinh((-708.288572268384));
      assertEquals((-2.0173838306308415E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1452()  throws Throwable  {
      double double0 = FastMath.sinh(61.164126313166);
      assertEquals(1.8289951446555077E26, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1453()  throws Throwable  {
      double double0 = FastMath.sinh(1389.162973077678);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1454()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1455()  throws Throwable  {
      double double0 = FastMath.sinh((-2542));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1456()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1457()  throws Throwable  {
      double double0 = FastMath.cosh((-5186.0F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1458()  throws Throwable  {
      double double0 = FastMath.cosh((-2.6437112632041807E-8));
      assertEquals(1.0000000000000004, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1459()  throws Throwable  {
      double double0 = FastMath.cosh(21.239898158049808);
      assertEquals(8.381863240693847E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1460()  throws Throwable  {
      double double0 = FastMath.cosh(2.147375418E9);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1461()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1462()  throws Throwable  {
      double double0 = FastMath.atan2(2.2250738585072014E-308, (-8.0E298));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1463()  throws Throwable  {
      double double0 = FastMath.atan2((-979.48435820234), (-979.48435820234));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1464()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1465()  throws Throwable  {
      double double0 = FastMath.log(2543103.0, 2543103.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1466()  throws Throwable  {
      int int0 = FastMath.getExponent((float) 276);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test_1467()  throws Throwable  {
      double double0 = FastMath.cosh((-53.279));
      assertEquals(6.882491847934292E22, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1468()  throws Throwable  {
      double double0 = FastMath.nextUp((-1773.978845420256));
      assertEquals((-1773.9788454202558), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1469()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-2385), (-2385));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1470()  throws Throwable  {
      double double0 = FastMath.atan(0.6179975220651728);
      assertEquals(0.5535479709257496, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1471()  throws Throwable  {
      float float0 = FastMath.nextUp((-4005.2114F));
      assertEquals((-4005.2112F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1472()  throws Throwable  {
      double double0 = FastMath.acosh(4.503599627370496E15);
      assertEquals(36.7368005696771, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1473()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0E-6));
      assertEquals((-9.999995000001667E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1474()  throws Throwable  {
      int int0 = FastMath.round((float) 1829);
      assertEquals(1829, int0);
  }

  @Test(timeout = 4000)
  public void test_1475()  throws Throwable  {
      long long0 = FastMath.round((-1436.52589093));
      assertEquals((-1437L), long0);
  }
}
