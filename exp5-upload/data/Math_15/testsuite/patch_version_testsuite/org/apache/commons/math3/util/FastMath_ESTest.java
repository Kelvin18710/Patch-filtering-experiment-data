package org.apache.commons.math3.util;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
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
      FastMath.getExponent((-2572.653F));
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      FastMath.copySign((-1412.509F), (float) 0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      FastMath.copySign((float) 0, (float) 0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      FastMath.copySign((float) 0, (-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      FastMath.copySign((-3111.1217416517597), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      FastMath.max((-3183605296591799669L), 306L);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      FastMath.max(1433, 2446);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      FastMath.min((-4437), (-3867));
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      FastMath.rint((-920.44901955));
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      FastMath.rint((-1695.5));
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      FastMath.ceil((-1955.0334926));
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      FastMath.scalb(753.4F, 276);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      FastMath.scalb((-598.3808F), (-277));
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      FastMath.scalb(4.36849164E18F, (-127));
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      FastMath.scalb(1.7346076965332031, (-1023));
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      FastMath.scalb(4.9E-324, 2097);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      FastMath.scalb((-2114.54141615377), 1024);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      FastMath.ulp(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      FastMath.ulp(4096.413785);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      FastMath.asin((-2.7943366835352838E-8));
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      FastMath.atan2(0.0, 890.880098);
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
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      FastMath.expm1((-1));
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      FastMath.exp((-746.95966));
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      FastMath.toRadians(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      FastMath.toDegrees((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      FastMath.toRadians((-1.0129027912496858E-9));
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      FastMath.sqrt(27);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      FastMath.round((float) 0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      FastMath.round((float) 306L);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      FastMath.round(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      FastMath.round((-985.3124411151406));
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      FastMath.rint((-2795.0));
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Random.setNextRandom(134);
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      FastMath.pow((-7.06524322867392E113), (-48));
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      FastMath.pow((-2710.798), 23);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      FastMath.nextAfter(-0.0F, (double) -0.0F);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      FastMath.min(0L, (long) 306);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      FastMath.min(875, 0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      FastMath.min(349, 349);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      FastMath.max((-1210L), (-2745L));
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      FastMath.max(0, (-281));
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      FastMath.log1p(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      FastMath.log10(7.848361555046424E-8);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      FastMath.log(0.0, (double) 1.4278816E35F);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      FastMath.log(12.999002387060145, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      FastMath.log(1986.0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      FastMath.getExponent((float) 1L);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      FastMath.getExponent(1.1254286766052246);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      FastMath.getExponent((double) 4607182418800017408L);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      FastMath.exp(Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      FastMath.atanh((-0.05417713522911072));
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      FastMath.atan(1.0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      FastMath.atan((-2.356194490192345));
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      FastMath.asinh(454.134954688);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      FastMath.acosh(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      FastMath.acosh((-2.14615616E9));
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      FastMath.IEEEremainder(1.7413966655731201, 515.451467047);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      FastMath.IEEEremainder(6506.93018287676, 0.1666666505023083);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 1.1254286766052246);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, (-1794.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      double double0 = FastMath.floor(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      double double0 = FastMath.floor(266.5992761);
      assertEquals(266.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      double double0 = FastMath.floor((-594.9369117613229));
      assertEquals((-595.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      double double0 = FastMath.floor(2.547000388735681E214);
      assertEquals(2.547000388735681E214, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      double double0 = FastMath.floor(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1919.1F), 0.0);
      assertEquals((-1919.0999F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.5F, (double) -0.0F);
      assertEquals(0.49999997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 919.6);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 5.5737717715868425E-8);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      double double0 = FastMath.nextAfter(1072.0, 1973.3449);
      assertEquals(1072.0000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2977.1096898), 0.12913274941041084);
      assertEquals((-2977.1096897999996), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 127.07602025685543);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-1.5707963267948966));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-1187.129593));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 1315);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      float float0 = FastMath.abs(986.8259F);
      assertEquals(986.8259F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      double double0 = FastMath.pow(1.057380684430436E-215, 8.0E298);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-1), 0.5603315F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      float float0 = FastMath.copySign(125.6F, 125.6F);
      assertEquals(125.6F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      float float0 = FastMath.copySign(2041.216F, (-2180.42F));
      assertEquals((-2041.216F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      float float0 = FastMath.copySign(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-2146156188), 1773.76);
      assertEquals(2.146156188E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      double double0 = FastMath.copySign((-1.818046828680321), (-1.818046828680321));
      assertEquals((-1.818046828680321), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 2.0902045062932175E102);
      assertEquals(2.0902045062932175E102, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      double double0 = FastMath.hypot((-342.0), 0.0);
      assertEquals(342.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      double double0 = FastMath.hypot(6.246931513471509E-17, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      double double0 = FastMath.hypot(1778.8, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, 0.99749494);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, 1.0085373835899469E-8);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      double double0 = FastMath.max(2.718281828459045, 2.718281828459045);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      double double0 = FastMath.max((-1606.53304), (-3.785295042408568E37));
      assertEquals((-1606.53304), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      double double0 = FastMath.max((double) 0.0F, (double) 1.4E-45F);
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      float float0 = FastMath.max((-1064.7445F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      float float0 = FastMath.max(676.0F, 676.0F);
      assertEquals(676.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      float float0 = FastMath.max(1893.8995F, 1893.8994F);
      assertEquals(1893.8995F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      float float0 = FastMath.max((-1.0F), (-1.1920929E-7F));
      assertEquals((-1.1920929E-7F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      int int0 = FastMath.max((-391), (-391));
      assertEquals((-391), int0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (-2.0666258332146654));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      double double0 = FastMath.min((-702.0789658076591), 0.3333333333333333);
      assertEquals((-702.0789658076591), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      double double0 = FastMath.min(801.0, 1.7413966655731201);
      assertEquals(1.7413966655731201, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      double double0 = FastMath.min((-10.3922444143644), (-10.3922444143644));
      assertEquals((-10.3922444143644), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      float float0 = FastMath.min(3.4028235E38F, 3.4028235E38F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      float float0 = FastMath.min(2559.88F, (-2452.5994F));
      assertEquals((-2452.5994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      float float0 = FastMath.min((-2591.08F), 3626.5793F);
      assertEquals((-2591.08F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      long long0 = FastMath.min((-271L), (-271L));
      assertEquals((-271L), long0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      long long0 = FastMath.min(4368491638549381120L, 180L);
      assertEquals(180L, long0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      double double0 = FastMath.rint(266.5992761);
      assertEquals(267.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      double double0 = FastMath.rint((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      double double0 = FastMath.ceil((-3.940510424527919E-20));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      double double0 = FastMath.ceil(0.5601736307144165);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double double0 = FastMath.floor((-598.0));
      assertEquals((-598.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      float float0 = FastMath.nextUp(499.92F);
      assertEquals(499.92004F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      float float0 = FastMath.nextAfter((-7.464389E-37F), (-2.5857668567479893E-8));
      assertEquals((-7.4643896E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-1660.70536223));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-8.920016617262351E-17));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 354.05944007529);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      double double0 = FastMath.nextUp(1.184154459111628E-8);
      assertEquals(1.1841544591116282E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      double double0 = FastMath.nextAfter(6.076820259849921E-27, (-1.0129027912496858E-9));
      assertEquals(6.0768202598499205E-27, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-1331.49));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-67.7488));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      double double0 = FastMath.nextAfter((-57.45970524), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      float float0 = FastMath.scalb(1.2207031E-4F, 128);
      assertEquals(4.1538375E34F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-187));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      float float0 = FastMath.scalb((float) 4368491638549381120L, (-196));
      assertEquals(4.3496E-41F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1192, 1192);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      float float0 = FastMath.scalb((-407.5185F), 163);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-450));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 1196);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-450));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 179);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      float float0 = FastMath.scalb((float) 177, 64);
      assertEquals(3.2650737E21F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      float float0 = FastMath.scalb((-328.9F), 1150);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1735), (-1735));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      double double0 = FastMath.scalb(0.19454771280288696, 1025);
      assertEquals(6.994741754178308E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2057), (-2057));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      double double0 = FastMath.scalb(1.7413966655731201, (-1065));
      assertEquals(4.407E-321, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2084, 2084);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      double double0 = FastMath.scalb(564.1324092712, 1569936343);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      double double0 = FastMath.scalb(1.5391707185581056E-178, (-2146156162));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2146156162), (-2146156162));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, (-2880));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1172);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      double double0 = FastMath.scalb((-2.827581009333298E-233), 3554);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      double double0 = FastMath.scalb(2574.218557146874, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double double0 = FastMath.abs((-0.24641320921517315));
      assertEquals(0.24641320921517315, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      float float0 = FastMath.abs((-1.4E-45F));
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      long long0 = FastMath.abs((-1711L));
      assertEquals(1711L, long0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      long long0 = FastMath.abs(4368491638549381120L);
      assertEquals(4368491638549381120L, long0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      int int0 = FastMath.abs((-3954));
      assertEquals(3954, int0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      int int0 = FastMath.abs(27);
      assertEquals(27, int0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      double double0 = FastMath.toDegrees(3.141592653589793);
      assertEquals(180.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      double double0 = FastMath.cbrt(8.934810975239834E-309);
      assertEquals(2.0750494767504704E-103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      double double0 = FastMath.cbrt((-670.6));
      assertEquals((-8.752951385334693), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      double double0 = FastMath.acos((-462));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      double double0 = FastMath.acos(940.796);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      double double0 = FastMath.asin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      double double0 = FastMath.asin(4.878798101459259E-8);
      assertEquals(4.878798101459261E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double double0 = FastMath.asin((-1995.6681F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      double double0 = FastMath.asin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      double double0 = FastMath.atan2(1874.408755001563, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0126616322947826E158), 0.0F);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      double double0 = FastMath.atan2(1.4E-45F, -0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      double double0 = FastMath.atan2(2.718281828459045, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      double double0 = FastMath.atan2(3859.0723646294655, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double double0 = FastMath.atan2((-4142.47875022615), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-0.43730417F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 621.7191393187321);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1309.9609));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-3413.5768573951855));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      double double0 = FastMath.atan2(1.633123935319537E16, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      double double0 = FastMath.atan2((-367.14175509831637), (-367.14175509831637));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      double double0 = FastMath.atan2((-1915.598196339056), 8.934810975239834E-309);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-24.88));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      double double0 = FastMath.cos(3.0);
      assertEquals((-0.9899924966004454), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      double double0 = FastMath.cos(2144423855);
      assertEquals((-0.7807139062166828), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      double double0 = FastMath.sin((-125.290971));
      assertEquals(0.36416412532662934, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      double double0 = FastMath.tan(7.734320970545741E181);
      assertEquals((-4.8617563422371814), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      double double0 = FastMath.sin((-4194304.0));
      assertEquals((-0.975129394941707), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      double double0 = FastMath.sin((-1.2319346292749103E98));
      assertEquals(0.24579884458089415, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      double double0 = FastMath.tan(1.0051473838461469E307);
      assertEquals(0.6514114728796871, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      double double0 = FastMath.tan(7.672307991205681E285);
      assertEquals(0.12913274941041084, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      double double0 = FastMath.sin((-8.0E298));
      assertEquals((-0.042338395486962485), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double double0 = FastMath.sin((-3.4028235E38F));
      assertEquals(0.5218765233336585, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      double double0 = FastMath.tan((-2.14615616E9F));
      assertEquals((-0.06998685635716363), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      double double0 = FastMath.tan((-1.3813900289204892));
      assertEquals((-5.216368539591308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      double double0 = FastMath.sin(0.003);
      assertEquals(0.002999995500002025, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      double double0 = FastMath.pow((-2.356194490192345), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      double double0 = FastMath.pow((double) (-0.8900912F), (-20.0));
      assertEquals(10.263843947190736, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      double double0 = FastMath.pow((-62.58049357356573), (-62.58049357356573));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      double double0 = FastMath.pow((-963.74), (-1.0051473838461469E307));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      double double0 = FastMath.pow((-3543.008), 1175.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      double double0 = FastMath.pow((-20.0), 3.402369329874797E300);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double double0 = FastMath.pow(0.9985313415527344, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      double double0 = FastMath.pow((-342.0), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.71153353340803744E17);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-342.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 7.303420385174346E-8);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      double double0 = FastMath.pow(5.6648446166177225E-9, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      double double0 = FastMath.pow(3.141592653589793, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-8.152742388541905E-9));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 110);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-20.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.1759889125823975);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (-342.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-3.5997360512765566E-9));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 1.5707963267948966);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) -0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      double double0 = FastMath.log1p((-18.430862426757812));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      double double0 = FastMath.log1p(0.19999954120254515);
      assertEquals(0.18232117446266916, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      double double0 = FastMath.log(0.5618454217910767);
      assertEquals((-0.5765285171155018), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      double double0 = FastMath.log(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      double double0 = FastMath.expm1((-0.975129394941707));
      assertEquals((-0.6228564500619055), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      double double0 = FastMath.pow(8.934810975239834E-309, 8.934810975239834E-309);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      double double0 = FastMath.expm1(3037.52);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      double double0 = FastMath.expm1((-727.5));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      double double0 = FastMath.exp((-715.1806476));
      assertEquals(2.5176258165595E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      double double0 = FastMath.pow(3.0, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      float float0 = FastMath.signum((-313.48962F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      float float0 = FastMath.signum(2378.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      double double0 = FastMath.signum(1940.0126821629608);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      double double0 = FastMath.signum((double) (-2146156174));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      double double0 = FastMath.signum((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      double double0 = FastMath.atanh((-2025.7697514669815));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      double double0 = FastMath.asinh((-0.008047723281026035));
      assertEquals((-0.008047636413951233), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      double double0 = FastMath.asinh((-0.16666666666666666));
      assertEquals((-0.16590455026930118), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      double double0 = FastMath.asinh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      double double0 = FastMath.tanh(38.166234538395);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      double double0 = FastMath.tanh((-2.4770911229749302E-17));
      assertEquals((-2.4770911229749302E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      double double0 = FastMath.sinh((-1.2246467991473532E-16));
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      double double0 = FastMath.sinh((-267.5097433841));
      assertEquals((-7.53312911959831E115), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      double double0 = FastMath.sinh(25.14497218390098);
      assertEquals(4.161909874651873E10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      double double0 = FastMath.sinh(1418.3731690325926);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      double double0 = FastMath.sinh((-1.6059226011778748E112));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      double double0 = FastMath.cosh((-485.0));
      assertEquals(2.1468105823974357E210, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      double double0 = FastMath.cosh(25.14497218390098);
      assertEquals(4.161909874651873E10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      double double0 = FastMath.cosh(3858.4532824425887);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      double double0 = FastMath.atan2(8.934810975239834E-309, 8.934810975239834E-309);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      double double0 = FastMath.acos(3.285935446876949E-8);
      assertEquals(1.5707962939355422, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      double double0 = FastMath.cos((-0.7961285162218434));
      assertEquals(0.699478713630297, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      double double0 = FastMath.log(11.21, 11.21);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FastMath.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      double double0 = FastMath.cosh((-42871.84965958061));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1182.3759, 1182.3759);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      double double0 = FastMath.acos((-6.032174644509064E-23));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      int int0 = FastMath.round((float) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      long long0 = FastMath.round(1772.47490383);
      assertEquals(1772L, long0);
  }
@Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      FastMath.copySign((-132.90947F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      FastMath.copySign(0.0F, (-1603.693F));
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      FastMath.copySign(997.321F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      FastMath.copySign((double) (-2.4414062E-4F), (double) 0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      FastMath.hypot(13.07, 2.14583424E9F);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      FastMath.hypot(2.718281828459045, 1.986821492305628E-8);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      FastMath.max(0L, 528L);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      FastMath.min((-3857L), 4665729213955833856L);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      FastMath.rint((-1152.479469769));
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      FastMath.ceil((-879.5430061467025));
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      FastMath.rint(0.0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      FastMath.scalb((-1507.963F), 276);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      FastMath.scalb((float) 4501, (-277));
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      FastMath.scalb((double) (-1033), (-1033));
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      FastMath.scalb(1360.010649623, 2097);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      FastMath.scalb((double) (-1.1920929E-7F), (-2098));
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      FastMath.scalb(1.6985075903314236E-173, 1024);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      FastMath.ulp(0.3889859828175208);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      FastMath.abs((double) Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      FastMath.asin((-7.877917738262007E-9));
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      FastMath.atan2(0.0, 1.633123935319537E16);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      FastMath.atan2((-20.0), (-20.0));
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      FastMath.tanh((-0.5));
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      FastMath.atan2(1.4E-45F, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      FastMath.toDegrees((-1452.58));
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      FastMath.signum(0.0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      FastMath.round((float) 0L);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      FastMath.round(2.14619802E9F);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      FastMath.round(2062.675658191038);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      FastMath.round((-828.06479));
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      FastMath.pow((-2.356194490192345), 269);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      FastMath.min((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      FastMath.min(0, 421);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      FastMath.min(540, (-175));
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      FastMath.max((-76L), (-76L));
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      FastMath.max(0, (-1353));
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      FastMath.max((-1017), (-1017));
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      FastMath.max((-1.0828611F), (-1.0828611F));
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      FastMath.max((double) 0.0F, (-923.80812870226));
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      FastMath.log(0.0, 3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      FastMath.log(0.04207121580839157, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      FastMath.log((double) 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      FastMath.log(0.0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      FastMath.getExponent(0.5F);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      FastMath.getExponent(1.0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      FastMath.getExponent(0.9999999403953552);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      FastMath.copySign((float) 0L, 2550.6675F);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      FastMath.copySign(0.0, 0.32623589038848877);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      FastMath.atanh((-0.5));
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      FastMath.atan(Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      FastMath.acosh(655);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      FastMath.IEEEremainder(0.12642613053321838, 0.7316888570785522);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      FastMath.IEEEremainder((-4130.994815002), 3.048160986685202);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) 0.0F, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      String[] stringArray0 = new String[9];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      double double0 = FastMath.copySign(1608.128, 1608.128);
      assertEquals(1608.128, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      double double0 = FastMath.copySign(Double.POSITIVE_INFINITY, (-581.25));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      double double0 = FastMath.floor((-665.0));
      assertEquals((-665.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      double double0 = FastMath.floor((-860.0916896924));
      assertEquals((-861.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      double double0 = FastMath.floor((-9223372036854775808L));
      assertEquals((-9.223372036854776E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      double double0 = FastMath.floor(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      double double0 = FastMath.floor(2.3489472779602617E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-1088057581), -0.0);
      assertEquals((-1.08805747E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      float float0 = FastMath.nextAfter(1865.0F, 2514.6404725087427);
      assertEquals(1865.0001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 1933L);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.853987822215025, 5009.4013475509);
      assertEquals(0.8539878222150251, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      double double0 = FastMath.nextAfter((-14.7105548769713), 0.097);
      assertEquals((-14.710554876971297), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, 46.6187028512355);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      double double0 = FastMath.abs(3246.18);
      assertEquals(3246.18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      float float0 = FastMath.abs((-1146.6707F));
      assertEquals(1146.6707F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      int int0 = FastMath.getExponent(103.36555438388);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      double double0 = FastMath.log(717.5269128978912);
      assertEquals(6.575810456195675, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      double double0 = FastMath.sqrt(2482.895095);
      assertEquals(49.828657367021236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), 0.5F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      float float0 = FastMath.copySign(3557.6082F, (-225.52F));
      assertEquals((-3557.6082F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      float float0 = FastMath.copySign((-1.4E-45F), (-1.4E-45F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      double double0 = FastMath.copySign((-981.529), 1.225743062930824E-8);
      assertEquals(981.529, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      double double0 = FastMath.copySign((-2.1335475961524608E-7), (-2.1335475961524608E-7));
      assertEquals((-2.1335475961524608E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      double double0 = FastMath.hypot(0, 2.718281828459045);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      double double0 = FastMath.hypot((-14.7105548769713), 0.0);
      assertEquals(14.7105548769713, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      double double0 = FastMath.hypot((-1588.97), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      double double0 = FastMath.hypot((-6.4361125161290325), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      double double0 = FastMath.hypot(Float.POSITIVE_INFINITY, (-7.316349947981893E-8));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      double double0 = FastMath.max((-1631.1305), 1.14650559425354);
      assertEquals(1.14650559425354, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      double double0 = FastMath.max((double) (-24), (-4.503599627370496E15));
      assertEquals((-24.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      double double0 = FastMath.max(1669.2987500887, 1669.2987500887);
      assertEquals(1669.2987500887, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, (float) 1025);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      float float0 = FastMath.max((-2809.4F), 144.97832F);
      assertEquals(144.97832F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      float float0 = FastMath.max(344.14462F, (-244.9F));
      assertEquals(344.14462F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      long long0 = FastMath.max(1541L, (-1L));
      assertEquals(1541L, long0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      int int0 = FastMath.max(0, 2262);
      assertEquals(2262, int0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (double) 459);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      double double0 = FastMath.min(0.1666666505023083, 0.1666666505023083);
      assertEquals(0.1666666505023083, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      double double0 = FastMath.min(1926.74, (-3479.991951119609));
      assertEquals((-3479.991951119609), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      double double0 = FastMath.min((-1867.4074), 0.167);
      assertEquals((-1867.4074), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      float float0 = FastMath.min(1397.6516F, 1397.6516F);
      assertEquals(1397.6516F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      float float0 = FastMath.min(3408.7065F, 1349.76F);
      assertEquals(1349.76F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      float float0 = FastMath.min((-1773.2748F), (-685.33093F));
      assertEquals((-1773.2748F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      long long0 = FastMath.min(192L, 192L);
      assertEquals(192L, long0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      long long0 = FastMath.min(205L, (-1628L));
      assertEquals((-1628L), long0);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      int int0 = FastMath.min(2724, 2724);
      assertEquals(2724, int0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      double double0 = FastMath.rint(2.718281828459045);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      double double0 = FastMath.rint((-0.1428571423679182));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      double double0 = FastMath.ceil(2.3984878190403553E-145);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      double double0 = FastMath.ceil((-8.77224935488516E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      double double0 = FastMath.ceil((-20.0));
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      float float0 = FastMath.nextUp(1.0F);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      float float0 = FastMath.nextAfter(1109.434F, 0.7316888570785522);
      assertEquals(1109.4338F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-746.870272946295));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.167);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 393.717417);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0, (double) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.4E-45F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-291.194));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      double double0 = FastMath.nextUp(2482.4048);
      assertEquals(2482.4048000000003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.9006201022568844E-55, (-3622.0228379161927));
      assertEquals(1.900620102256884E-55, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-3.43338934259355E-8));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.POSITIVE_INFINITY, 2.718281828459045);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 4.908843759498681E-306);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      double double0 = FastMath.nextAfter(1802.7, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, 265);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      float float0 = FastMath.scalb(1.5258789E-5F, 128);
      assertEquals(5.192297E33F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 146);
      assertEquals(0.125F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-157), (-157));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      float float0 = FastMath.scalb((-1.1920929E-7F), (-172));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      float float0 = FastMath.scalb((float) 3550, 3550);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      float float0 = FastMath.scalb((-1.5258789E-5F), 653);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      float float0 = FastMath.scalb(2.14583424E9F, (-1607));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      float float0 = FastMath.scalb((-5024.245F), (-1073));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 165);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 836);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 262113);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, 36);
      assertEquals(6.8719477E10F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-147));
      assertEquals((-5.6E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      double double0 = FastMath.scalb(0.49999999999999994, (-1023));
      assertEquals(5.562684646268003E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      double double0 = FastMath.scalb(5.05116846251684E7, (-2015));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      double double0 = FastMath.scalb(421.299952344, 3024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1.0F), 2147274076);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      double double0 = FastMath.scalb(1167.8, (-4003));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-4836), (-4836));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-1088057581));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, 2146197959);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1088057581));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      double double0 = FastMath.scalb((-379.53874049002), 1496);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      double double0 = FastMath.abs((-3807.93));
      assertEquals(3807.93, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      float float0 = FastMath.abs((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      float float0 = FastMath.ulp((-2357.7708F));
      assertEquals(2.4414062E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      float float0 = FastMath.abs((float) 146);
      assertEquals(146.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      long long0 = FastMath.abs((long) (-142));
      assertEquals(142L, long0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      long long0 = FastMath.abs(1023L);
      assertEquals(1023L, long0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      int int0 = FastMath.abs((-817));
      assertEquals(817, int0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      int int0 = FastMath.abs(655);
      assertEquals(655, int0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.36222589015960693);
      assertEquals(20.754014736514815, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      double double0 = FastMath.toRadians(1.4E-45F);
      assertEquals(2.4457272005608357E-47, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double double0 = FastMath.cbrt(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      double double0 = FastMath.cbrt((-230.17313940237));
      assertEquals((-6.128462698670381), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      double double0 = FastMath.acos((-419.54));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      double double0 = FastMath.acos(2.718281828459045);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      double double0 = FastMath.asin(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      double double0 = FastMath.asin((-764.2136532282766));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      double double0 = FastMath.asin(1962.44568);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      double double0 = FastMath.atan2(2.147274076E9, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      double double0 = FastMath.atan2(773.9850527623338, 2.371674573639231E-306);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      double double0 = FastMath.atan2(0.4909018874168396, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), 0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      double double0 = FastMath.atan2((-0.030189112161481197), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      double double0 = FastMath.atan2(0.902267575263977, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      double double0 = FastMath.atan2((-3669.9783274), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-854.78895));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 3521);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      double double0 = FastMath.atan2(0, (-398.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NaN, 1924.979035);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double double0 = FastMath.asin(1.9006201022568844E-55);
      assertEquals(1.9006201022568844E-55, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), 4916.85);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-135.58402274430415));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      double double0 = FastMath.tan(1.5655577182769778);
      assertEquals(190.88863939530688, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      double double0 = FastMath.tan(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      double double0 = FastMath.sin((-3189.16881));
      assertEquals(0.43700537417448754, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      double double0 = FastMath.sin(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      double double0 = FastMath.tan(2147274076);
      assertEquals((-1.0854531767301303), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      double double0 = FastMath.cos(3.267878469419539E144);
      assertEquals(0.9809900585811963, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      double double0 = FastMath.cos(2.14619814E9F);
      assertEquals((-0.9848395615423694), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      double double0 = FastMath.tan(3.723411238930138E277);
      assertEquals((-3.037319806367101), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      double double0 = FastMath.cos(7.9588807014867E294);
      assertEquals((-0.017784742473290573), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double double0 = FastMath.tan(5.05116846251684E7);
      assertEquals((-3.7015411255043618), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      double double0 = FastMath.sin(1.7976931348623157E308);
      assertEquals(0.004961954789184062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      double double0 = FastMath.cos((-5.02515763991886E273));
      assertEquals(0.2813218290129758, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      double double0 = FastMath.cos((-2.5138919966097735E122));
      assertEquals((-0.9819670591542631), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      double double0 = FastMath.tan((-9.7143113104549808E16));
      assertEquals((-7.637107510184165), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      double double0 = FastMath.sin((-1.0));
      assertEquals((-0.8414709848078965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1023), (-1023));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      double double0 = FastMath.pow(2.0217439756338078E-10, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      double double0 = FastMath.pow(1962.44568, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (double) (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      double double0 = FastMath.pow((-3010.24109665358), (-3010.24109665358));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      double double0 = FastMath.pow((double) (-9223372036854775808L), (double) (-9223372036854775808L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      double double0 = FastMath.pow((double) (-9223372036854775808L), (double) 9.223372E18F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      double double0 = FastMath.pow((-1251.18599186), (-1182.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      double double0 = FastMath.pow((-62.7891), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      double double0 = FastMath.pow(1.2391595516612638E-199, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 1.0F);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 4.503599627370496E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2.8421709430404007E-14);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double double0 = FastMath.pow(1.1673546540760534E-8, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.0F, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      double double0 = FastMath.pow(4.7278395262972723E18, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-2230.798187606876));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 1.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 4.6116860184273879E18);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-893));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-392.279315073299));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-884));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      double double0 = FastMath.pow(1094.10894, (double) 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double double0 = FastMath.log1p(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      double double0 = FastMath.log10(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      double double0 = FastMath.log1p(0.22937411069869995);
      assertEquals(0.2065051867841683, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      double double0 = FastMath.log10(0.5);
      assertEquals((-0.3010299956639812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      double double0 = FastMath.log10(4.9E-324);
      assertEquals((-323.3062153431158), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      double double0 = FastMath.log1p((-262.6592460402778));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      double double0 = FastMath.acosh((-4.503599627370496E15));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      double double0 = FastMath.expm1((-3.1305705497720186E-61));
      assertEquals((-3.1305705497720186E-61), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      double double0 = FastMath.pow(2.8108219632627907E-129, 2.8108219632627907E-129);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      double double0 = FastMath.expm1(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      double double0 = FastMath.exp((-738.5609130859375));
      assertEquals(1.77E-321, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      double double0 = FastMath.expm1((-739));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      double double0 = FastMath.expm1((-749.8293789654452));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      double double0 = FastMath.exp((-908.565F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      float float0 = FastMath.signum((-2176.5117F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      float float0 = FastMath.signum((float) 192L);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      double double0 = FastMath.signum(1.633123935319537E16);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      double double0 = FastMath.signum(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      double double0 = FastMath.atanh(0.01454218477010727);
      assertEquals(0.014543210003707082, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      double double0 = FastMath.atanh(0.07490822288864472);
      assertEquals(0.07504880588537914, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      double double0 = FastMath.atanh((-2325.60769734994));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333329196);
      assertEquals(0.008333236885725868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      double double0 = FastMath.tanh(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      double double0 = FastMath.tanh(9.219544613762692E-9);
      assertEquals(9.219544613762692E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      double double0 = FastMath.tanh(1053.82035717247);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      double double0 = FastMath.tanh(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      double double0 = FastMath.tanh((-230.17313940237));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      double double0 = FastMath.sinh(0.19999998807907104);
      assertEquals(0.20133599038095068, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      double double0 = FastMath.sinh(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      double double0 = FastMath.sinh((-329.0));
      assertEquals((-3.818163753644909E142), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      double double0 = FastMath.sinh(4.49423283715579E307);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      double double0 = FastMath.sinh(146);
      assertEquals(1.2763340697627276E63, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      double double0 = FastMath.cosh((-127));
      assertEquals(7.151039979174052E54, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      double double0 = FastMath.cosh(459);
      assertEquals(1.0968246391856975E199, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      double double0 = FastMath.cosh(2903.6684);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), 7.225974166887662E86);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      double double0 = FastMath.log(1398.96981487747, 1398.96981487747);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      int int0 = FastMath.getExponent(Float.POSITIVE_INFINITY);
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      double double0 = FastMath.cosh((-1913.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      double double0 = FastMath.nextUp((-1870.728026));
      assertEquals((-1870.7280259999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-246.77993838809724), (-246.77993838809724));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      double double0 = FastMath.atan((-1677.698901025433));
      assertEquals((-1.5702002723533268), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.0F));
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      double double0 = FastMath.acosh(0.003);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      double double0 = FastMath.acos((-0.07754564006692041));
      assertEquals(1.6484198957947092, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0F));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      int int0 = FastMath.round((-1.9907784F));
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      long long0 = FastMath.round(2.3984878190403553E-145);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      FastMath.copySign((-5438.45F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      FastMath.copySign((float) 0, (float) (-127));
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      FastMath.copySign((double) (-870.09F), (double) 0);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), 1.4999452522236406E230);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      FastMath.hypot(1.9699272335463627E-8, 3.0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      FastMath.hypot(1.3831136870400057E10, (-81.4619419));
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      FastMath.max(0L, 1218L);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      FastMath.min((-1771L), 4654697928847253978L);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      FastMath.min(0, 832);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      FastMath.rint((-1655.1254654736));
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      FastMath.rint((-0.49999999999999994));
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      FastMath.rint(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      FastMath.scalb((-1.0F), (-127));
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      FastMath.scalb(1393.096F, 128);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      FastMath.scalb((double) (-1), 2097);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      FastMath.scalb(2.740393079767158, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      FastMath.scalb(0.15, 1024);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      FastMath.abs(5);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      FastMath.toDegrees(3674.4345);
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      FastMath.asin(1.7334475E-316);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      FastMath.atan2(0.0, 964.272520661);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      FastMath.acos((-3.42827917465521E-81));
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      FastMath.atan2(1.633123935319537E16, 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      FastMath.cos(-0.0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      FastMath.cos((-1.8908603201210102E262));
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      FastMath.exp((-746.0057778522272));
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      FastMath.toRadians(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      FastMath.sqrt(2.146987194E9);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      FastMath.round(3630.0F);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      FastMath.round(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      FastMath.round(3787.985704653877);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      FastMath.min(1225L, 1225L);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      FastMath.min(286, 286);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      FastMath.max((-276), (-276));
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      FastMath.max((-3932.0F), (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      FastMath.log(2.2250738585072014E-308, (double) 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      FastMath.log(0.5197699069976807, (double) 0L);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      FastMath.log(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      FastMath.log(2.520544138509738E-4);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      FastMath.hypot(0.0, 0L);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      FastMath.getExponent((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      FastMath.getExponent(0.3333333134651184);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      FastMath.exp((-747.582316));
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      FastMath.copySign(0.0, 2352.22818);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      FastMath.ceil(0.9166666666666666);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      FastMath.cbrt((-1.8908603201210102E262));
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      FastMath.atan((-1.8908603201210102E262));
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      FastMath.acosh(2755.3624);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      FastMath.acosh((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      FastMath.IEEEremainder(1.9658551724508715E-9, 1.2616519927978516);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      FastMath.IEEEremainder(2097, 3496.9);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) 1.4E-45F, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      double double0 = FastMath.copySign(1049.27283, 51.39507315277835);
      assertEquals(1049.27283, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      double double0 = FastMath.floor((-1674.5));
      assertEquals((-1675.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      double double0 = FastMath.floor((-8.0E298));
      assertEquals((-8.0E298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.4E-45F), 2.406976727302894E-69);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      float float0 = FastMath.nextAfter(2110.4F, (-1553.7));
      assertEquals(2110.3997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 5.020987398309052E-9);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 792.4540910233);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 3.19327800015159E142);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      double double0 = FastMath.nextAfter(51.39507315277835, (double) 2146000441);
      assertEquals(51.39507315277836, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1907.238), 4.9E-324);
      assertEquals((-1907.2379999999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.9);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 1262.8);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      double double0 = FastMath.scalb((-2604.0311569346945), 567);
      assertEquals((-1.2579220146350212E174), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      double double0 = FastMath.abs((double) (-1776.0F));
      assertEquals(1776.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      float float0 = FastMath.abs(729.11774F);
      assertEquals(729.11774F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      int int0 = FastMath.getExponent(1.998050894021586E35);
      assertEquals(117, int0);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      double double0 = FastMath.log((-1.8908603201210102E262));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), 1155.9177F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      float float0 = FastMath.copySign((float) 1024, (-499.835F));
      assertEquals((-1024.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      float float0 = FastMath.copySign(0.48247582F, 0.48247582F);
      assertEquals(0.48247582F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      float float0 = FastMath.copySign((-1776.0F), (-1776.0F));
      assertEquals((-1776.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-404), (double) Float.NaN);
      assertEquals(404.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      double double0 = FastMath.copySign(0.6299605249474366, (-1.8908603201210102E262));
      assertEquals((-0.6299605249474366), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-9223372036854775808L), (double) (-9223372036854775808L));
      assertEquals((-9.223372036854776E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      double double0 = FastMath.hypot((-9223372036854775808L), (-1.8908603201210102E262));
      assertEquals(1.8908603201210102E262, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      double double0 = FastMath.hypot((-1.8908603201210102E262), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, (-1.8908603201210102E262));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      double double0 = FastMath.hypot((-1.0E-6), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 1298.5858819342);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-4.503599627370496E15));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      double double0 = FastMath.max((-0.9050891919189609), (double) 2146987194);
      assertEquals(2.146987194E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      double double0 = FastMath.max(143.13041250871, (-1.0292817180691822E123));
      assertEquals(143.13041250871, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      double double0 = FastMath.max((-1.8908603201210102E262), (-1.8908603201210102E262));
      assertEquals((-1.8908603201210102E262), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      float float0 = FastMath.max(4246.467F, 4246.467F);
      assertEquals(4246.467F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      float float0 = FastMath.max(1.0F, (-2920.548F));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      long long0 = FastMath.max((-2711L), (-2711L));
      assertEquals((-2711L), long0);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      long long0 = FastMath.max((long) 1434, (-751L));
      assertEquals(1434L, long0);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      int int0 = FastMath.max((-87), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      int int0 = FastMath.max(134217729, 0);
      assertEquals(134217729, int0);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      double double0 = FastMath.min(421.767055595685, 635.73207782);
      assertEquals(421.767055595685, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      double double0 = FastMath.min(1.0, (-37.0));
      assertEquals((-37.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      double double0 = FastMath.min((-1992.7), (-1992.7));
      assertEquals((-1992.7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      float float0 = FastMath.min(302.86374F, 302.86374F);
      assertEquals(302.86374F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 0.0F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      float float0 = FastMath.min((-3212.15F), (-1.2207031E-4F));
      assertEquals((-3212.15F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      float float0 = FastMath.min(0.0F, (-533.0484F));
      assertEquals((-533.0484F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      long long0 = FastMath.min(0L, (-302932621132653753L));
      assertEquals((-302932621132653753L), long0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      int int0 = FastMath.min(0, (-4515));
      assertEquals((-4515), int0);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      double double0 = FastMath.rint((-1.8622538418245084E-4));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      double double0 = FastMath.rint(6212.802111543832);
      assertEquals(6213.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      double double0 = FastMath.ceil((-2.418358302293531E-4));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      double double0 = FastMath.floor(0.8333333333333334);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      double double0 = FastMath.ceil((-4786.87613279424));
      assertEquals((-4786.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      double double0 = FastMath.floor(1.8014398509481984E16);
      assertEquals(1.8014398509481984E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      float float0 = FastMath.nextUp(1.4E-45F);
      assertEquals(2.8E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (-1674.5));
      assertEquals((-1.0000001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-2244.856241309));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 3.141592653589793);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, (double) 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      float float0 = FastMath.nextAfter((-2515.22F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      double double0 = FastMath.nextUp(3.0);
      assertEquals(3.0000000000000004, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.0, (double) -0.0F);
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-747.582316));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 3.141592653589793);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.353569508885598, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 0.5647516031143603);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      float float0 = FastMath.scalb((-254.0F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 258);
      assertEquals(6.490371E32F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      float float0 = FastMath.scalb(2110.4F, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      float float0 = FastMath.scalb((-1135.2435F), (-140));
      assertEquals((-8.14498E-40F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2145839980, 2145839980);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-276), (-276));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      float float0 = FastMath.scalb(995.9F, (-1558));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-2144981505));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-127));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1570465849);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      float float0 = FastMath.scalb((float) 5, 5);
      assertEquals(160.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 2145839980);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1350), (-1350));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1293, 1293);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      double double0 = FastMath.scalb(3343.6, (-1043));
      assertEquals(3.547552563336E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      double double0 = FastMath.scalb((-1.5707963267948966), (-1023));
      assertEquals((-1.7475689218952297E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-337.1834F), (-1576));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2005279545, 2005279545);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1282161), (-1282161));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1.4E-45F, (-1282139));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      double double0 = FastMath.scalb((double) -0.0F, 2145836261);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, (-1282161));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1043));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      double double0 = FastMath.scalb((-1493.8), 2146987194);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      double double0 = FastMath.ulp(1474.68672214);
      assertEquals(2.2737367544323206E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      double double0 = FastMath.abs((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      double double0 = FastMath.hypot(Integer.MIN_VALUE, 1.4E-45F);
      assertEquals(2.147483648E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      double double0 = FastMath.abs(1298.5858819342);
      assertEquals(1298.5858819342, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      float float0 = FastMath.ulp(598.96F);
      assertEquals(6.1035156E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      float float0 = FastMath.abs((-3509.0F));
      assertEquals(3509.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      long long0 = FastMath.abs((long) (-2238));
      assertEquals(2238L, long0);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      long long0 = FastMath.abs(4611686018427387874L);
      assertEquals(4611686018427387874L, long0);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      double double0 = FastMath.toDegrees((-469.0));
      assertEquals((-26871.720591635607), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      double double0 = FastMath.toRadians(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      double double0 = FastMath.cbrt(3.141592653589793);
      assertEquals(1.4645918875615231, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      double double0 = FastMath.acos((-3.5997360512765566E-9));
      assertEquals(1.5707963303946326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      double double0 = FastMath.acos(0.9375);
      assertEquals(0.3554212016902235, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      double double0 = FastMath.acos((-1));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      double double0 = FastMath.acos(11);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      double double0 = FastMath.acos((-2147483644));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      double double0 = FastMath.asin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      double double0 = FastMath.asin((-1));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      double double0 = FastMath.asin(Integer.MIN_VALUE);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      double double0 = FastMath.asin(1044.925165);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      double double0 = FastMath.atan2((-3715.2), 4.9E-324);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      double double0 = FastMath.atan2((-5.637415935329794E117), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      double double0 = FastMath.atan2(5.5685313670430624E-8, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      double double0 = FastMath.atan2((-4.813899778443457E-9), -0.0F);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      double double0 = FastMath.atan2((-1673.89518697997), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      double double0 = FastMath.atan2(1050.338549551942, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      double double0 = FastMath.atan2(1835.7193027501908, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      double double0 = FastMath.atan2((-4.503599627370496E15), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, (-1.8908603201210102E262));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 3.141592653589793);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      double double0 = FastMath.atan2(0, (-128.40866064307033));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      double double0 = FastMath.atan2(0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2.5339299158309795E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      double double0 = FastMath.atan2((-1023), (-2.1141094074221325E-276));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      double double0 = FastMath.asin((-3.517594695450786E-279));
      assertEquals((-3.517594695450786E-279), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      double double0 = FastMath.atan(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      double double0 = FastMath.tan(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      double double0 = FastMath.sin((-1469.8226896558756));
      assertEquals(0.42835564066119475, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      double double0 = FastMath.cos(2145839980);
      assertEquals(0.8134762783358217, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      double double0 = FastMath.sin(2145839953);
      assertEquals((-0.6080817561734252), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      double double0 = FastMath.tan(3.4028235E38F);
      assertEquals((-0.6117979498342481), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      double double0 = FastMath.tan((-2147483644));
      assertEquals((-1.4058147747159975), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      double double0 = FastMath.sin((-1.2579220146350212E174));
      assertEquals(0.5126671027232692, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      double double0 = FastMath.sin(2005279545);
      assertEquals((-0.7382901086186217), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      double double0 = FastMath.sin((-1.0292817180691822E123));
      assertEquals(0.9901928140716272, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      double double0 = FastMath.cos(8309394.56811388);
      assertEquals(0.18974911530581073, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      double double0 = FastMath.sin((-1.7976931348623157E308));
      assertEquals((-0.004961954789184062), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      double double0 = FastMath.tan(2.427240455243201E-202);
      assertEquals(2.427240455243201E-202, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      double double0 = FastMath.sin(2.2250738585072014E-308);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      double double0 = FastMath.pow(2.2250738585072014E-308, 389);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      double double0 = FastMath.pow((-2413.354077186676), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      double double0 = FastMath.pow((-5369.837223803328), (-1));
      assertEquals((-1.8622538418245084E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      double double0 = FastMath.pow(1.0181870233355787E-9, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      double double0 = FastMath.pow(3853.5354282977, 1.7976931348623157E308);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      double double0 = FastMath.pow((-2.2555535676499395E-7), 811.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      double double0 = FastMath.pow((-2395.45152711), (-2395.45152711));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      double double0 = FastMath.pow((-17.464159635280154), 3026.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1282161), 1.633123935319537E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      double double0 = FastMath.pow((double) 1500, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      double double0 = FastMath.pow(0.5, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 1444.9149);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      double double0 = FastMath.pow((double) 1025, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.4E-45F, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-938.43427148));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 911.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 3.99168E7);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-1043));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 5.521082422279256E-42);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (double) (-1));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-2261.2929006921427));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      double double0 = FastMath.pow((-2013.6374592174789), 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      double double0 = FastMath.log10(1932.20055);
      assertEquals(3.286052201395259, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      double double0 = FastMath.log1p(0.058823529411764705);
      assertEquals(0.05715841383994861, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      double double0 = FastMath.log(1.0, 0.4956399830354676);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      double double0 = FastMath.pow(1.0, (-3343.4735007462));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      double double0 = FastMath.pow(0.5403022766113281, (-3.940510424527919E-20));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      double double0 = FastMath.pow(5.562684646268137E-309, 1.4352343082427979);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      double double0 = FastMath.asinh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      double double0 = FastMath.log1p((-2894.940877027));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0E-6));
      assertEquals((-9.999995000001667E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      double double0 = FastMath.expm1(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      double double0 = FastMath.expm1(1583.2676062);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      double double0 = FastMath.expm1((-2238.97));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      double double0 = FastMath.pow((-1.8908603201210102E262), (-1.8908603201210102E262));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      float float0 = FastMath.signum((float) 1500);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      float float0 = FastMath.signum((-273.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      double double0 = FastMath.signum((-157.7));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      double double0 = FastMath.signum(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1090()  throws Throwable  {
      double double0 = FastMath.atanh(0.080061495F);
      assertEquals(0.08023321675324002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      double double0 = FastMath.atanh(1316);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      double double0 = FastMath.atanh((-4.740494808228372E-43));
      assertEquals((-4.740494808228372E-43), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      double double0 = FastMath.asinh((-0.009570892506275479));
      assertEquals((-0.009570746393508937), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      double double0 = FastMath.asinh(0.041666663879186654);
      assertEquals(0.04165461696372619, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      double double0 = FastMath.tanh((-3.5997360512765566E-9));
      assertEquals((-3.5997360512765566E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      double double0 = FastMath.tanh(1583.2676062);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      double double0 = FastMath.tanh((-1.8908603201210102E262));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      double double0 = FastMath.sinh(2.427240455243201E-202);
      assertEquals(2.427240455243201E-202, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      double double0 = FastMath.sinh((-25.470521591912025));
      assertEquals((-5.763376387810344E10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      double double0 = FastMath.sinh((-2244.856241309));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      double double0 = FastMath.sinh(3759.38);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      double double0 = FastMath.sinh(444.388376734437);
      assertEquals(4.947546014564751E192, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      double double0 = FastMath.cosh((-525.32088914));
      assertEquals(6.965196712207367E227, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      double double0 = FastMath.cosh(-0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      double double0 = FastMath.cosh(287.51660071923);
      assertEquals(3.679960459449755E124, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      double double0 = FastMath.cosh(1972.31);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      double double0 = FastMath.atan2(2.2250738585072014E-308, (-1.3208450062862734E76));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      double double0 = FastMath.atan2((-1.8908603201210102E262), (-1.8908603201210102E262));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      int int0 = FastMath.getExponent((-114.4F));
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      double double0 = FastMath.cosh((-1.8908603201210102E262));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1992.7), (-1992.7));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1119()  throws Throwable  {
      double double0 = FastMath.atan(9.219544613762692E-9);
      assertEquals(9.219544613762692E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      double double0 = FastMath.acosh(0.1111111111111111);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      int int0 = FastMath.round((-3.4028235E38F));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      long long0 = FastMath.round((-1.8908603201210102E262));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      double double0 = FastMath.cos((-1524.1866652169294));
      assertEquals((-0.8706725887216339), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      FastMath.copySign((-3.4028235E38F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      FastMath.copySign((float) 0L, (-2.14338099E9F));
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      FastMath.copySign((-940.1328), (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      FastMath.hypot(2.220446049250313E-16, (-5.207000323380292E-8));
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      FastMath.max(558L, 1543L);
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      FastMath.max((-2147483647), 357);
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      FastMath.min(643L, 1526L);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      FastMath.min(134217729, 134217729);
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      FastMath.rint((-2.356194490192345));
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      FastMath.rint(2864.5);
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      FastMath.ceil((-3455.81875384));
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      FastMath.rint(0.0);
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      FastMath.scalb(3.4028235E38F, (-277));
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      FastMath.scalb((float) (-796), 128);
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      FastMath.scalb((-0.8100085477996705), 2097);
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      FastMath.scalb((-117.264), 1024);
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      FastMath.ulp(2210.5999F);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      FastMath.ulp((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      FastMath.abs(2146663203);
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      FastMath.cbrt((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      FastMath.asin(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      FastMath.atan2(0.0, 3986.0);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1153()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1156()  throws Throwable  {
      FastMath.cos(0);
  }

  @Test(timeout = 4000)
  public void test_1157()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      FastMath.sin(2146062414);
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      FastMath.tanh(0.5F);
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      FastMath.cosh(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      FastMath.atan2(2.2250738585072014E-308, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1180()  throws Throwable  {
      FastMath.toRadians(1.3830080342749806);
  }

  @Test(timeout = 4000)
  public void test_1181()  throws Throwable  {
      FastMath.toDegrees(0.1784076690673828);
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
      FastMath.sqrt(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1183()  throws Throwable  {
      FastMath.sqrt(954.1);
  }

  @Test(timeout = 4000)
  public void test_1184()  throws Throwable  {
      FastMath.round(9.536743E-7F);
  }

  @Test(timeout = 4000)
  public void test_1185()  throws Throwable  {
      FastMath.round(3076.0293F);
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      FastMath.round((-576.87687959));
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      FastMath.rint(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      Random.setNextRandom(Integer.MAX_VALUE);
      FastMath.random();
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      FastMath.pow(0.0, 3140);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      FastMath.pow((double) (-0.48759705F), 385);
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      FastMath.nextAfter(0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      FastMath.min((-129L), (-1914L));
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      FastMath.min(647723542, (-3044));
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      FastMath.min(345.0F, (float) 647723542);
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      FastMath.max((-4170L), (-4170L));
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      FastMath.max((double) (-92.62046F), (double) (-92.62046F));
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      FastMath.log(0.0, 347.366975817);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      FastMath.log((double) 2656L, (double) 2656L);
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      FastMath.log(2.893485277253286E-8, (double) 4919.0F);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      FastMath.log(978.77764589);
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      FastMath.getExponent(1.4830976842038277);
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      FastMath.getExponent((-2.2737367544323206E-13));
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      FastMath.copySign(0.0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      FastMath.cbrt((-8.5283906E20F));
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      FastMath.atan((-372.37795053512));
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      FastMath.asinh(-0.0);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      FastMath.acosh((-3.200068509818696E299));
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      FastMath.acosh((-5.162161641826984E133));
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      FastMath.IEEEremainder(305.89990232, (-1200.74085));
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      FastMath.IEEEremainder(956.095205, 531.0);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(1.0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      double double0 = FastMath.copySign(1024.0, 0.5455666780471802);
      assertEquals(1024.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      double double0 = FastMath.copySign(0.15, (-7.877917738262007E-9));
      assertEquals((-0.15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      double double0 = FastMath.floor(0.031);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      double double0 = FastMath.floor(1024.4324835743205);
      assertEquals(1024.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      double double0 = FastMath.floor((-1.1500729855651353));
      assertEquals((-2.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      double double0 = FastMath.floor((-8.0E298));
      assertEquals((-8.0E298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      double double0 = FastMath.floor(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, 1964.6312029104026);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), 2.9207648676289105E176);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 5.777039824101231);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2979.14);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-1.0772154376548336E-8));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      double double0 = FastMath.nextAfter((-433.2807), (-1213.06));
      assertEquals((-433.2807000000001), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      double double0 = FastMath.nextAfter((-8.007761781788659E-121), 869.8395);
      assertEquals((-8.007761781788657E-121), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0, 1.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-638.7357031771846));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1242()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1243()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1244()  throws Throwable  {
      double double0 = FastMath.scalb(2736.98652843725, 1023);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1245()  throws Throwable  {
      double double0 = FastMath.abs(344.9227766959);
      assertEquals(344.9227766959, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1246()  throws Throwable  {
      float float0 = FastMath.abs((-2207.8179F));
      assertEquals(2207.8179F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1247()  throws Throwable  {
      int int0 = FastMath.getExponent((-1098.1562031589629));
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_1248()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1249()  throws Throwable  {
      float float0 = FastMath.copySign((-2962.26F), 5237.1616F);
      assertEquals(2962.26F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1250()  throws Throwable  {
      float float0 = FastMath.copySign(1889.2172F, 346.4403F);
      assertEquals(1889.2172F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1251()  throws Throwable  {
      float float0 = FastMath.copySign(18.622623F, (-0.09650084F));
      assertEquals((-18.622623F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1252()  throws Throwable  {
      float float0 = FastMath.copySign(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1253()  throws Throwable  {
      double double0 = FastMath.copySign((-1.5707963267948966), Double.NaN);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1254()  throws Throwable  {
      double double0 = FastMath.copySign((-2522.9692684041265), (-2522.9692684041265));
      assertEquals((-2522.9692684041265), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1255()  throws Throwable  {
      double double0 = FastMath.hypot(1.0E-6, (-799.158));
      assertEquals(799.158, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1256()  throws Throwable  {
      double double0 = FastMath.hypot(1.1397855814149893, 1.268053550754962E-308);
      assertEquals(1.1397855814149893, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1257()  throws Throwable  {
      double double0 = FastMath.hypot(2.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1258()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, (-20.57541837873848));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1259()  throws Throwable  {
      double double0 = FastMath.hypot((-6.032174644509064E-23), Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1260()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 2219.21880639);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1261()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1262()  throws Throwable  {
      double double0 = FastMath.max(1333.4716, 1333.4716);
      assertEquals(1333.4716, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1263()  throws Throwable  {
      double double0 = FastMath.max((-3245.35969812131), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1264()  throws Throwable  {
      double double0 = FastMath.max(105.4, (-0.017453292519943295));
      assertEquals(105.4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1265()  throws Throwable  {
      double double0 = FastMath.max((-884.589518), (double) 15);
      assertEquals(15.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1266()  throws Throwable  {
      float float0 = FastMath.max(1.4E-45F, 1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1267()  throws Throwable  {
      float float0 = FastMath.max((float) (-127), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1268()  throws Throwable  {
      float float0 = FastMath.max((float) (-127), (-7.464389E-37F));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1269()  throws Throwable  {
      float float0 = FastMath.max(387.77F, (-1.2207031E-4F));
      assertEquals(387.77F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1270()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1271()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1272()  throws Throwable  {
      long long0 = FastMath.max(4147L, 1543L);
      assertEquals(4147L, long0);
  }

  @Test(timeout = 4000)
  public void test_1273()  throws Throwable  {
      int int0 = FastMath.max((-1588), (-1588));
      assertEquals((-1588), int0);
  }

  @Test(timeout = 4000)
  public void test_1274()  throws Throwable  {
      int int0 = FastMath.max(2146062414, (-2147482995));
      assertEquals(2146062414, int0);
  }

  @Test(timeout = 4000)
  public void test_1275()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1276()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1277()  throws Throwable  {
      double double0 = FastMath.min((-964.0779461), 2105.7815919055693);
      assertEquals((-964.0779461), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1278()  throws Throwable  {
      double double0 = FastMath.min(3.141592653589793, 0.15);
      assertEquals(0.15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1279()  throws Throwable  {
      double double0 = FastMath.min((-20.0), (-20.0));
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1280()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1281()  throws Throwable  {
      float float0 = FastMath.min(1006.27F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1282()  throws Throwable  {
      float float0 = FastMath.min(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1283()  throws Throwable  {
      float float0 = FastMath.min(1787.0F, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1284()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1285()  throws Throwable  {
      int int0 = FastMath.min(0, 1236);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1286()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1287()  throws Throwable  {
      double double0 = FastMath.rint((-5.730898606435436E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1288()  throws Throwable  {
      double double0 = FastMath.ceil((-0.300467905507383));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1289()  throws Throwable  {
      double double0 = FastMath.ceil(2105.7815919055693);
      assertEquals(2106.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1290()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1291()  throws Throwable  {
      double double0 = FastMath.rint(0.6727987232900893);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1292()  throws Throwable  {
      double double0 = FastMath.floor((-127));
      assertEquals((-127.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1293()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 1806);
      assertEquals(1806.0001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1294()  throws Throwable  {
      float float0 = FastMath.nextAfter(1904.6F, 386.0243686115);
      assertEquals(1904.5999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1295()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1.0902938113007961E-8));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1296()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 40.19140625);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1297()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1298()  throws Throwable  {
      float float0 = FastMath.nextAfter((-2017.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1299()  throws Throwable  {
      double double0 = FastMath.nextUp(1561.9266966647);
      assertEquals(1561.9266966647003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1300()  throws Throwable  {
      double double0 = FastMath.nextAfter(2.718281828459045, (-1199.7913702));
      assertEquals(2.7182818284590446, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1301()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-7.800414592973399E-9));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1302()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (double) 255);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1303()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1304()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.41078129050290885, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1305()  throws Throwable  {
      float float0 = FastMath.scalb(789.0094F, 255);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1306()  throws Throwable  {
      float float0 = FastMath.scalb((-2.4414062E-4F), 137);
      assertEquals((-4.2535296E37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1307()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 276);
      assertEquals((-1.7014118E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1308()  throws Throwable  {
      float float0 = FastMath.scalb(1749.9F, (-236));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1309()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1310()  throws Throwable  {
      float float0 = FastMath.scalb((float) 3435, 3435);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1311()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), 2146499011);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1312()  throws Throwable  {
      float float0 = FastMath.scalb(3292.2976F, (-3396));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1313()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-3396), (-3396));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1314()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-1009));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1315()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-2147483643));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1316()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 2146012416);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1317()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-103), (-103));
      assertEquals((-1.0156584E-29F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1318()  throws Throwable  {
      float float0 = FastMath.scalb((-2691.0F), (-257));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1319()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1806, 1806);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1320()  throws Throwable  {
      double double0 = FastMath.scalb((-9.892260062323546E-8), 1044);
      assertEquals((-1.8647087057271997E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1321()  throws Throwable  {
      double double0 = FastMath.scalb(4.9E-324, 1759);
      assertEquals(1.605266083236198E206, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1322()  throws Throwable  {
      double double0 = FastMath.scalb(2740.059699736509, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1323()  throws Throwable  {
      double double0 = FastMath.scalb(1.1397855814149893, (-1023));
      assertEquals(1.268053550754962E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1324()  throws Throwable  {
      double double0 = FastMath.scalb((-0.5486108846350881), (-1023));
      assertEquals((-6.103498689470226E-309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1325()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1326()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2146012375, 2146012375);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1327()  throws Throwable  {
      double double0 = FastMath.scalb((-20.0), 3455);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1328()  throws Throwable  {
      double double0 = FastMath.scalb((double) 3455, (-5031));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1329()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2042291687), (-2042291687));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1330()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 3439);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1331()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 1806);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1332()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 2146779914);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1333()  throws Throwable  {
      double double0 = FastMath.scalb((-0.3769884960877517), (-1451));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1334()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1335()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1336()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1337()  throws Throwable  {
      double double0 = FastMath.abs((-2677.9519697));
      assertEquals(2677.9519697, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1338()  throws Throwable  {
      float float0 = FastMath.abs(873.7364F);
      assertEquals(873.7364F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1339()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1340()  throws Throwable  {
      long long0 = FastMath.abs((-2L));
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test_1341()  throws Throwable  {
      long long0 = FastMath.abs(928L);
      assertEquals(928L, long0);
  }

  @Test(timeout = 4000)
  public void test_1342()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1343()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1344()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1345()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1346()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1347()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1348()  throws Throwable  {
      double double0 = FastMath.toRadians((-1261.88924));
      assertEquals((-22.02412203348893), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1349()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1350()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1351()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1352()  throws Throwable  {
      double double0 = FastMath.cbrt(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1353()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1354()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1355()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1356()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1357()  throws Throwable  {
      double double0 = FastMath.acos((-30.7042157300368));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1358()  throws Throwable  {
      double double0 = FastMath.acos(2618.033935546875);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1359()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1360()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1361()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1362()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1363()  throws Throwable  {
      double double0 = FastMath.asin((-1878.114581605));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1364()  throws Throwable  {
      double double0 = FastMath.asin(6.9293168483572165);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1365()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1366()  throws Throwable  {
      double double0 = FastMath.atan2((-2219.690311863621), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1367()  throws Throwable  {
      double double0 = FastMath.atan2(3388.6459674, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1368()  throws Throwable  {
      double double0 = FastMath.atan2(5.370679, -0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1369()  throws Throwable  {
      double double0 = FastMath.atan2((-375.2991148823), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1370()  throws Throwable  {
      double double0 = FastMath.atan2(0.8530210398303, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1371()  throws Throwable  {
      double double0 = FastMath.atan2((-1545.1274827884), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1372()  throws Throwable  {
      double double0 = FastMath.atan2(4320.61558968104, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1373()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1374()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 277.506);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1375()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1376()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1377()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1378()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1379()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 1383.656);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1380()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1381()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-552.0882041009876));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1382()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1383()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1384()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1385()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-0.3769884960877517));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1386()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1387()  throws Throwable  {
      double double0 = FastMath.acos((-2.2250738585072014E-308));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1388()  throws Throwable  {
      double double0 = FastMath.asin((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1389()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-4223.48951));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1390()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1391()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1392()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1393()  throws Throwable  {
      double double0 = FastMath.tan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1394()  throws Throwable  {
      double double0 = FastMath.cos(10.8);
      assertEquals((-0.1943299064553348), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1395()  throws Throwable  {
      double double0 = FastMath.cos((-0.3769884960877517));
      assertEquals(0.929777451233907, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1396()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1397()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1398()  throws Throwable  {
      double double0 = FastMath.sin(0.632247805595398);
      assertEquals(0.5909595568025726, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1399()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1400()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1401()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1402()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1403()  throws Throwable  {
      double double0 = FastMath.tan(3.584912896E9);
      assertEquals((-0.30914222152798715), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1404()  throws Throwable  {
      double double0 = FastMath.cos((-3.7979660725865874E274));
      assertEquals((-0.765391539470639), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1405()  throws Throwable  {
      double double0 = FastMath.tan(1.2704793774453618E163);
      assertEquals(0.2392122892412425, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1406()  throws Throwable  {
      double double0 = FastMath.sin((-3.0399439534134115E97));
      assertEquals(0.6373622733087468, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1407()  throws Throwable  {
      double double0 = FastMath.tan(2.934570385464815E247);
      assertEquals((-6.101730852289499), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1408()  throws Throwable  {
      double double0 = FastMath.tan((-4.443798187035849E125));
      assertEquals((-31.280963226933913), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1409()  throws Throwable  {
      double double0 = FastMath.tan(4.503599627370496E15);
      assertEquals((-1.8005242480088435), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1410()  throws Throwable  {
      double double0 = FastMath.cos(3.4028235E38F);
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1411()  throws Throwable  {
      double double0 = FastMath.tan((-1.202329196335048));
      assertEquals((-2.5899976461120535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1412()  throws Throwable  {
      double double0 = FastMath.pow((double) 1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1413()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1414()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1049), (-814.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1415()  throws Throwable  {
      double double0 = FastMath.pow((-1.0E-6), (-1.0E-6));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1416()  throws Throwable  {
      double double0 = FastMath.pow((-2249.846248949), (-1.1892631528580186E299));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1417()  throws Throwable  {
      double double0 = FastMath.pow((-313.906481453088), 5.0803905846743446E175);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1418()  throws Throwable  {
      double double0 = FastMath.pow((-1.0E-6), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1419()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1420()  throws Throwable  {
      double double0 = FastMath.pow(1056.3566141894864, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1421()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 2146012375);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1422()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 1502);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1423()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1424()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-162.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1425()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1426()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 419.5121641424653);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1427()  throws Throwable  {
      double double0 = FastMath.pow(2.2250738585072014E-308, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1428()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1429()  throws Throwable  {
      double double0 = FastMath.pow((-162.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1430()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) 2146012375);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1431()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1.6259920998287064E77));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1432()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 1464);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1433()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-2042291687));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1434()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-2146544910));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1435()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 3.7291263280048303E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1436()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1437()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.0E-6));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1438()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1439()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, -0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1440()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1441()  throws Throwable  {
      double double0 = FastMath.log1p((-696.2));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1442()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1443()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1444()  throws Throwable  {
      double double0 = FastMath.acosh(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1445()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1446()  throws Throwable  {
      double double0 = FastMath.log1p(0.6502478122711182);
      assertEquals(0.5009254658904353, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1447()  throws Throwable  {
      double double0 = FastMath.log(0.6816387176513672);
      assertEquals((-0.38325550101434797), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1448()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1449()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1450()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1451()  throws Throwable  {
      double double0 = FastMath.expm1((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1452()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1453()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1454()  throws Throwable  {
      double double0 = FastMath.pow(1.3541112064618357E-272, 1.3541112064618357E-272);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1455()  throws Throwable  {
      double double0 = FastMath.expm1(2345.3854);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1456()  throws Throwable  {
      double double0 = FastMath.exp((-727.723821176));
      assertEquals(8.98587E-317, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1457()  throws Throwable  {
      double double0 = FastMath.expm1((-710.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1458()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1459()  throws Throwable  {
      double double0 = FastMath.exp((-1075.197587694));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1460()  throws Throwable  {
      float float0 = FastMath.signum(18.978344F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1461()  throws Throwable  {
      float float0 = FastMath.signum((-0.48759705F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1462()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1463()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1464()  throws Throwable  {
      double double0 = FastMath.signum((-0.1666666567325592));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1465()  throws Throwable  {
      double double0 = FastMath.signum(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1466()  throws Throwable  {
      double double0 = FastMath.atanh(0.017822483496456317);
      assertEquals(0.017824370906186687, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1467()  throws Throwable  {
      double double0 = FastMath.atanh((-0.04242442551329077));
      assertEquals((-0.042449905312413716), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1468()  throws Throwable  {
      double double0 = FastMath.atanh(0.09090909090909091);
      assertEquals(0.09116077839697731, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1469()  throws Throwable  {
      double double0 = FastMath.atanh((-3396));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1470()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1471()  throws Throwable  {
      double double0 = FastMath.asinh(0.031);
      assertEquals(0.03099503697929222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1472()  throws Throwable  {
      double double0 = FastMath.asinh(0.07490822288864472);
      assertEquals(0.07483834449967837, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1473()  throws Throwable  {
      double double0 = FastMath.tanh(1.4199501303738373E-65);
      assertEquals(1.4199501303738373E-65, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1474()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1475()  throws Throwable  {
      double double0 = FastMath.tanh((-2940.4148369920376));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1476()  throws Throwable  {
      double double0 = FastMath.tanh(1.633123935319537E16);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1477()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1478()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1479()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1480()  throws Throwable  {
      double double0 = FastMath.sinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1481()  throws Throwable  {
      double double0 = FastMath.sinh((-695.8843151250624));
      assertEquals((-8.273477805082798E301), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1482()  throws Throwable  {
      double double0 = FastMath.sinh(276.788);
      assertEquals(8.062524760191097E119, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1483()  throws Throwable  {
      double double0 = FastMath.sinh(2875.1455778);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1484()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1485()  throws Throwable  {
      double double0 = FastMath.sinh((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1486()  throws Throwable  {
      double double0 = FastMath.cosh((-31.703497202163618));
      assertEquals(2.935106716782058E13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1487()  throws Throwable  {
      double double0 = FastMath.cosh(39.083655849430045);
      assertEquals(4.7074538639778328E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1488()  throws Throwable  {
      double double0 = FastMath.cosh(2656.4);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1489()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1490()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), 8.0E298);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1491()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1492()  throws Throwable  {
      int int0 = FastMath.getExponent((-1112.6991F));
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_1493()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FastMath.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_1494()  throws Throwable  {
      double double0 = FastMath.cosh((-2980.1692));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1495()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1816.2), (-1816.2));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1496()  throws Throwable  {
      double double0 = FastMath.atan(0.02613406785607736);
      assertEquals(0.026128120528395044, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1497()  throws Throwable  {
      double double0 = FastMath.acosh((-0.3769884960877517));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1498()  throws Throwable  {
      double double0 = FastMath.acos(0.5);
      assertEquals(1.0471975511965979, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1499()  throws Throwable  {
      int int0 = FastMath.round((float) (-2346L));
      assertEquals((-2346), int0);
  }

  @Test(timeout = 4000)
  public void test_1500()  throws Throwable  {
      long long0 = FastMath.round(2656.4);
      assertEquals(2656L, long0);
  }
@Test(timeout = 4000)
  public void test_1501()  throws Throwable  {
      FastMath.copySign((-3.4028235E38F), 270.5079F);
  }

  @Test(timeout = 4000)
  public void test_1502()  throws Throwable  {
      FastMath.copySign((float) 0, (float) 0);
  }

  @Test(timeout = 4000)
  public void test_1503()  throws Throwable  {
      FastMath.copySign(0.0F, (-930.0F));
  }

  @Test(timeout = 4000)
  public void test_1504()  throws Throwable  {
      FastMath.copySign((-2982.4541947337266), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1505()  throws Throwable  {
      FastMath.hypot(1.0E-6, (-146.29146728135962));
  }

  @Test(timeout = 4000)
  public void test_1506()  throws Throwable  {
      FastMath.rint(3.607909248687887);
  }

  @Test(timeout = 4000)
  public void test_1507()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_1508()  throws Throwable  {
      FastMath.ceil((-3566.6745361443404));
  }

  @Test(timeout = 4000)
  public void test_1509()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1510()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1511()  throws Throwable  {
      FastMath.scalb(818.6174F, 276);
  }

  @Test(timeout = 4000)
  public void test_1512()  throws Throwable  {
      FastMath.scalb((-2.028241E31F), (-277));
  }

  @Test(timeout = 4000)
  public void test_1513()  throws Throwable  {
      FastMath.scalb(1.569995735781442, 2097);
  }

  @Test(timeout = 4000)
  public void test_1514()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1515()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1516()  throws Throwable  {
      FastMath.toDegrees(5.551115123125783E-17);
  }

  @Test(timeout = 4000)
  public void test_1517()  throws Throwable  {
      FastMath.asin((-0.05935164670393567));
  }

  @Test(timeout = 4000)
  public void test_1518()  throws Throwable  {
      FastMath.atan2(0.0F, 2693);
  }

  @Test(timeout = 4000)
  public void test_1519()  throws Throwable  {
      FastMath.atan2(1.633123935319537E16, 1.0);
  }

  @Test(timeout = 4000)
  public void test_1520()  throws Throwable  {
      FastMath.tan((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1521()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1522()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1523()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1524()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1525()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1526()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1527()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1528()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1529()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1530()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1531()  throws Throwable  {
      FastMath.pow(0.6101331986242741, (double) 1511L);
  }

  @Test(timeout = 4000)
  public void test_1532()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1533()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1534()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_1535()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_1536()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_1537()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1538()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1539()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1540()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1541()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1542()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1543()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1544()  throws Throwable  {
      FastMath.atan2((-0.07197996260126033), (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1545()  throws Throwable  {
      FastMath.toRadians((-0.1282237606952579));
  }

  @Test(timeout = 4000)
  public void test_1546()  throws Throwable  {
      FastMath.toDegrees(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1547()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1548()  throws Throwable  {
      FastMath.sqrt(1.16354361977249E-8);
  }

  @Test(timeout = 4000)
  public void test_1549()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1550()  throws Throwable  {
      FastMath.round(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1551()  throws Throwable  {
      FastMath.round((double) -0.0F);
  }

  @Test(timeout = 4000)
  public void test_1552()  throws Throwable  {
      FastMath.round(905.580193778871);
  }

  @Test(timeout = 4000)
  public void test_1553()  throws Throwable  {
      Random.setNextRandom(Integer.MAX_VALUE);
      FastMath.random();
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_1554()  throws Throwable  {
      FastMath.pow(1.747018414872141E-8, 750);
  }

  @Test(timeout = 4000)
  public void test_1555()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1556()  throws Throwable  {
      FastMath.nextAfter((-1.4E-45F), 1530.97);
  }

  @Test(timeout = 4000)
  public void test_1557()  throws Throwable  {
      FastMath.min((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_1558()  throws Throwable  {
      FastMath.min(0L, (-4505L));
  }

  @Test(timeout = 4000)
  public void test_1559()  throws Throwable  {
      FastMath.min(0, 18);
  }

  @Test(timeout = 4000)
  public void test_1560()  throws Throwable  {
      FastMath.min(2147083012, (-429));
  }

  @Test(timeout = 4000)
  public void test_1561()  throws Throwable  {
      FastMath.min((double) 1.0F, (-0.8936357605947379));
  }

  @Test(timeout = 4000)
  public void test_1562()  throws Throwable  {
      FastMath.max((-3002L), 0L);
  }

  @Test(timeout = 4000)
  public void test_1563()  throws Throwable  {
      FastMath.max((-3207L), (-3207L));
  }

  @Test(timeout = 4000)
  public void test_1564()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1565()  throws Throwable  {
      FastMath.max((-24), (-24));
  }

  @Test(timeout = 4000)
  public void test_1566()  throws Throwable  {
      FastMath.max((-0.25), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1567()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_1568()  throws Throwable  {
      FastMath.log10(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1569()  throws Throwable  {
      FastMath.log(0.0, 575.2084349211683);
  }

  @Test(timeout = 4000)
  public void test_1570()  throws Throwable  {
      FastMath.log((double) 147L, 931.34137);
  }

  @Test(timeout = 4000)
  public void test_1571()  throws Throwable  {
      FastMath.log(3527.770761178, 0.2667117714881897);
  }

  @Test(timeout = 4000)
  public void test_1572()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_1573()  throws Throwable  {
      FastMath.log(2524.6454218336);
  }

  @Test(timeout = 4000)
  public void test_1574()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1575()  throws Throwable  {
      FastMath.getExponent(1493.1581F);
  }

  @Test(timeout = 4000)
  public void test_1576()  throws Throwable  {
      FastMath.getExponent(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1577()  throws Throwable  {
      FastMath.getExponent(0.0);
  }

  @Test(timeout = 4000)
  public void test_1578()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_1579()  throws Throwable  {
      FastMath.atan((-2322.0));
  }

  @Test(timeout = 4000)
  public void test_1580()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1581()  throws Throwable  {
      FastMath.acosh(2.0904882610105383E295);
  }

  @Test(timeout = 4000)
  public void test_1582()  throws Throwable  {
      FastMath.acosh((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1583()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_1584()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1585()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1586()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1587()  throws Throwable  {
      FastMath.IEEEremainder(939L, 939L);
  }

  @Test(timeout = 4000)
  public void test_1588()  throws Throwable  {
      FastMath.IEEEremainder(556.49840259, 779.9);
  }

  @Test(timeout = 4000)
  public void test_1589()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(1237.5, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1590()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_1591()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1592()  throws Throwable  {
      double double0 = FastMath.copySign(92.5, (-1759.5129037138));
      assertEquals((-92.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1593()  throws Throwable  {
      double double0 = FastMath.floor(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1594()  throws Throwable  {
      double double0 = FastMath.floor((-2852.0F));
      assertEquals((-2852.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1595()  throws Throwable  {
      double double0 = FastMath.floor((-2276.30196));
      assertEquals((-2277.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1596()  throws Throwable  {
      double double0 = FastMath.floor(20.0);
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1597()  throws Throwable  {
      double double0 = FastMath.floor(7.808670894670738E56);
      assertEquals(7.808670894670738E56, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1598()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1599()  throws Throwable  {
      float float0 = FastMath.nextAfter((-110.0F), (-2901.250237867292));
      assertEquals((-110.00001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1600()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, 1024.0);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1601()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (double) 612);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1602()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-3.845373872038116E-9));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1603()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.6848117113113403, 12.0);
      assertEquals(0.6848117113113404, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1604()  throws Throwable  {
      double double0 = FastMath.nextAfter((-3.763512114202445E10), 1.5707963267948966);
      assertEquals((-3.7635121142024445E10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1605()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2105.53);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1606()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1607()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 2024);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1608()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 506);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1609()  throws Throwable  {
      double double0 = FastMath.abs((-2.2679391392937389E55));
      assertEquals(2.2679391392937389E55, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1610()  throws Throwable  {
      double double0 = FastMath.abs((double) 188.86276F);
      assertEquals(188.86276245117188, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1611()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1612()  throws Throwable  {
      float float0 = FastMath.copySign(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1613()  throws Throwable  {
      float float0 = FastMath.copySign(1.0F, 2118.946F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1614()  throws Throwable  {
      float float0 = FastMath.copySign(1.0F, (-3.4028235E38F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1615()  throws Throwable  {
      float float0 = FastMath.copySign((-3758.8455F), 0.0F);
      assertEquals(3758.8455F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1616()  throws Throwable  {
      double double0 = FastMath.copySign((-5466.3006), 350.60994);
      assertEquals(5466.3006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1617()  throws Throwable  {
      double double0 = FastMath.copySign((-3410.106349312), (-3410.106349312));
      assertEquals((-3410.106349312), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1618()  throws Throwable  {
      double double0 = FastMath.hypot(-0.0, (-8.784622656707742E-9));
      assertEquals(8.784622656707742E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1619()  throws Throwable  {
      double double0 = FastMath.hypot((-4257.37195), 0.0);
      assertEquals(4257.37195, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1620()  throws Throwable  {
      double double0 = FastMath.hypot(2525.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1621()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1622()  throws Throwable  {
      double double0 = FastMath.hypot((-1980.7), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1623()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, 0.9985313415527344);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1624()  throws Throwable  {
      double double0 = FastMath.max((double) Float.NaN, (double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1625()  throws Throwable  {
      double double0 = FastMath.max(22.208248670045766, 22.208248670045766);
      assertEquals(22.208248670045766, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1626()  throws Throwable  {
      double double0 = FastMath.max(0.902267575263977, (-507.94296911));
      assertEquals(0.902267575263977, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1627()  throws Throwable  {
      double double0 = FastMath.max((-105.579838), (-1.9841269659586505E-4));
      assertEquals((-1.9841269659586505E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1628()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1629()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, 1.4E-45F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1630()  throws Throwable  {
      float float0 = FastMath.max((float) (-39), (float) (-39));
      assertEquals((-39.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1631()  throws Throwable  {
      float float0 = FastMath.max((-1.4E-45F), (-1.0F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1632()  throws Throwable  {
      float float0 = FastMath.max((-3281.0F), 1984.6174F);
      assertEquals(1984.6174F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1633()  throws Throwable  {
      long long0 = FastMath.max(939L, 939L);
      assertEquals(939L, long0);
  }

  @Test(timeout = 4000)
  public void test_1634()  throws Throwable  {
      long long0 = FastMath.max(2183L, 939L);
      assertEquals(2183L, long0);
  }

  @Test(timeout = 4000)
  public void test_1635()  throws Throwable  {
      int int0 = FastMath.max(846, 2346);
      assertEquals(2346, int0);
  }

  @Test(timeout = 4000)
  public void test_1636()  throws Throwable  {
      int int0 = FastMath.max(1073741824, 846);
      assertEquals(1073741824, int0);
  }

  @Test(timeout = 4000)
  public void test_1637()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1638()  throws Throwable  {
      double double0 = FastMath.min(0.12051977669405191, 0.12051977669405191);
      assertEquals(0.12051977669405191, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1639()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1640()  throws Throwable  {
      double double0 = FastMath.min(1772.64, 8522656.53040743);
      assertEquals(1772.64, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1641()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, 0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1642()  throws Throwable  {
      float float0 = FastMath.min((-1023.0F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1643()  throws Throwable  {
      float float0 = FastMath.min(1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1644()  throws Throwable  {
      float float0 = FastMath.min(3069.588F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1645()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), (-1.4E-45F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1646()  throws Throwable  {
      long long0 = FastMath.min(2475L, 4499201580859392L);
      assertEquals(2475L, long0);
  }

  @Test(timeout = 4000)
  public void test_1647()  throws Throwable  {
      int int0 = FastMath.min(5, 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test_1648()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1649()  throws Throwable  {
      double double0 = FastMath.rint((-5.5775699641466805E-248));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1650()  throws Throwable  {
      double double0 = FastMath.rint((-716.112));
      assertEquals((-716.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1651()  throws Throwable  {
      double double0 = FastMath.ceil((-8.784622656707742E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1652()  throws Throwable  {
      double double0 = FastMath.ceil(705.1638);
      assertEquals(706.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1653()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1654()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1655()  throws Throwable  {
      double double0 = FastMath.floor((-1.6411525886171892E248));
      assertEquals((-1.6411525886171892E248), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1656()  throws Throwable  {
      float float0 = FastMath.nextUp(1712.272F);
      assertEquals(1712.2721F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1657()  throws Throwable  {
      float float0 = FastMath.nextAfter(4703.7F, (-1937.445818));
      assertEquals(4703.6997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1658()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1656.86758));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1659()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1660()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.0);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1661()  throws Throwable  {
      float float0 = FastMath.nextAfter(798.142F, (double) 798.142F);
      assertEquals(798.142F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1662()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1663()  throws Throwable  {
      double double0 = FastMath.nextUp(1.1838281029868402E-36);
      assertEquals(1.1838281029868404E-36, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1664()  throws Throwable  {
      double double0 = FastMath.nextAfter(814.0, (-4.9E-324));
      assertEquals(813.9999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1665()  throws Throwable  {
      double double0 = FastMath.nextAfter(-0.0, (double) Float.NEGATIVE_INFINITY);
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1666()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-0.5235987755982989));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1667()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 0.1666666505023083);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1668()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1669()  throws Throwable  {
      double double0 = FastMath.nextAfter(2047.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1670()  throws Throwable  {
      float float0 = FastMath.scalb((-0.8655064F), 128);
      assertEquals((-2.9451657E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1671()  throws Throwable  {
      float float0 = FastMath.scalb((-962.0F), 128);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1672()  throws Throwable  {
      float float0 = FastMath.scalb((-1144.2F), (-147));
      assertEquals((-6.414E-42F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1673()  throws Throwable  {
      float float0 = FastMath.scalb(2466.7385F, (-239));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1674()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-127));
      assertEquals((-5.877472E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1675()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 255);
      assertEquals(8.112964E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1676()  throws Throwable  {
      float float0 = FastMath.scalb(2495.0F, 804);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1677()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1678()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-962));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1679()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-970));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1680()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-2353));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1681()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1432);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1682()  throws Throwable  {
      float float0 = FastMath.scalb((float) 127, 127);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1683()  throws Throwable  {
      float float0 = FastMath.scalb((-1510.146F), 2147483644);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1684()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-3169));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1685()  throws Throwable  {
      double double0 = FastMath.scalb(20.0, 1170);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1686()  throws Throwable  {
      double double0 = FastMath.scalb((-9.8392E-9), 1024);
      assertEquals((-1.76878622925373E300), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1687()  throws Throwable  {
      double double0 = FastMath.scalb(4.9E-324, 1024);
      assertEquals(8.881784197001252E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1688()  throws Throwable  {
      double double0 = FastMath.scalb((-6.432337568761393E161), (-2098));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1689()  throws Throwable  {
      double double0 = FastMath.scalb(770.0082445, (-1052));
      assertEquals(1.595658451E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1690()  throws Throwable  {
      double double0 = FastMath.scalb(0.3153223395347595, (-1023));
      assertEquals(3.508077473510626E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1691()  throws Throwable  {
      double double0 = FastMath.scalb((-1.1800039972549816E259), (-1443));
      assertEquals((-4.8484144325961974E-176), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1692()  throws Throwable  {
      double double0 = FastMath.scalb(2998.8, (-1172));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1693()  throws Throwable  {
      double double0 = FastMath.scalb((-3071.771), 2145206404);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1694()  throws Throwable  {
      double double0 = FastMath.scalb(0.589846134185791, 2147483021);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1695()  throws Throwable  {
      double double0 = FastMath.scalb(0.44193371222119093, (-3455));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1696()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1697()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, (-1023));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1698()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-3455));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1699()  throws Throwable  {
      double double0 = FastMath.scalb((-2447.243274), 2067);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1700()  throws Throwable  {
      double double0 = FastMath.scalb((-1688.7), (-3455));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1701()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1702()  throws Throwable  {
      float float0 = FastMath.ulp((-3.4028235E38F));
      assertEquals(2.028241E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1703()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1704()  throws Throwable  {
      double double0 = FastMath.abs((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1705()  throws Throwable  {
      double double0 = FastMath.ulp(20.65868797087825);
      assertEquals(3.552713678800501E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1706()  throws Throwable  {
      float float0 = FastMath.abs(2707.23F);
      assertEquals(2707.23F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1707()  throws Throwable  {
      float float0 = FastMath.abs((-1023.0F));
      assertEquals(1023.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1708()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1709()  throws Throwable  {
      long long0 = FastMath.abs((-26L));
      assertEquals(26L, long0);
  }

  @Test(timeout = 4000)
  public void test_1710()  throws Throwable  {
      long long0 = FastMath.abs(1667L);
      assertEquals(1667L, long0);
  }

  @Test(timeout = 4000)
  public void test_1711()  throws Throwable  {
      int int0 = FastMath.abs((-918199694));
      assertEquals(918199694, int0);
  }

  @Test(timeout = 4000)
  public void test_1712()  throws Throwable  {
      int int0 = FastMath.abs(1929);
      assertEquals(1929, int0);
  }

  @Test(timeout = 4000)
  public void test_1713()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1714()  throws Throwable  {
      double double0 = FastMath.toDegrees((-9.677614210613788));
      assertEquals((-554.4864500239999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1715()  throws Throwable  {
      double double0 = FastMath.toRadians(1.0E-323);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1716()  throws Throwable  {
      double double0 = FastMath.toRadians(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1717()  throws Throwable  {
      double double0 = FastMath.toRadians(905.5802);
      assertEquals(15.805356130868754, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1718()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1719()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1720()  throws Throwable  {
      double double0 = FastMath.cbrt(5.86440876259637E-309);
      assertEquals(1.8033280776532482E-103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1721()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1722()  throws Throwable  {
      double double0 = FastMath.cbrt(18.050569409973257);
      assertEquals(2.6231933466073047, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1723()  throws Throwable  {
      double double0 = FastMath.acos(1.9803689272433392E-303);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1724()  throws Throwable  {
      double double0 = FastMath.acos(1.0E-323);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1725()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1726()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1727()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1728()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1729()  throws Throwable  {
      double double0 = FastMath.acos(1187.0708617350049);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1730()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1731()  throws Throwable  {
      double double0 = FastMath.acos((-1738.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1732()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1733()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1734()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1735()  throws Throwable  {
      double double0 = FastMath.asin((-237.02259));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1736()  throws Throwable  {
      double double0 = FastMath.asin(2.092571258544922);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1737()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1738()  throws Throwable  {
      double double0 = FastMath.atan2(914.872, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1739()  throws Throwable  {
      double double0 = FastMath.atan2(96.46, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1740()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1741()  throws Throwable  {
      double double0 = FastMath.atan2((-758.9), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1742()  throws Throwable  {
      double double0 = FastMath.atan2(8.870982420192843E19, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1743()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1744()  throws Throwable  {
      double double0 = FastMath.atan2((-0.7853981633974483), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1745()  throws Throwable  {
      double double0 = FastMath.atan2(3294198.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1746()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1747()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1748()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 497.965505);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1749()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1750()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1751()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 911.97263195418);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1752()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1753()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-211.60805779216605));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1754()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1755()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1756()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-709.782712893384));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1757()  throws Throwable  {
      double double0 = FastMath.atan2(2387.6, Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1758()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-966.2297371184));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1759()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), 3.141592653589793);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1760()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1761()  throws Throwable  {
      double double0 = FastMath.tan(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1762()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1763()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1764()  throws Throwable  {
      double double0 = FastMath.cos((-2852.0F));
      assertEquals(0.8439833313429663, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1765()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1766()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1767()  throws Throwable  {
      double double0 = FastMath.sin((-5443.128));
      assertEquals((-0.9496348866106477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1768()  throws Throwable  {
      double double0 = FastMath.sin((-2757.8257));
      assertEquals(0.4729622844832029, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1769()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1770()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1771()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1772()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1773()  throws Throwable  {
      double double0 = FastMath.tan(8.0E298);
      assertEquals((-0.04237639320697582), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1774()  throws Throwable  {
      double double0 = FastMath.cos(2.05891132094649E44);
      assertEquals((-0.046022250678847854), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1775()  throws Throwable  {
      double double0 = FastMath.tan((-3.4552363953199905E138));
      assertEquals((-3.446762404712201), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1776()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1777()  throws Throwable  {
      double double0 = FastMath.tan((-2.2679391392937389E55));
      assertEquals((-2.765219527606155), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1778()  throws Throwable  {
      double double0 = FastMath.tan((-2.2929764629585683E126));
      assertEquals((-0.9986845383915388), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1779()  throws Throwable  {
      double double0 = FastMath.tan((-1.1800039972549816E259));
      assertEquals(1.0674480614385164, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1780()  throws Throwable  {
      double double0 = FastMath.cos((-4.503599627370496E15));
      assertEquals((-0.4855348677422206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1781()  throws Throwable  {
      double double0 = FastMath.sin((-3.4028235E38F));
      assertEquals(0.5218765233336585, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1782()  throws Throwable  {
      double double0 = FastMath.tan(0.9808930158615112);
      assertEquals(1.4938402553864665, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1783()  throws Throwable  {
      double double0 = FastMath.sin(1.375);
      assertEquals(0.9808930570231557, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1784()  throws Throwable  {
      double double0 = FastMath.pow(0.963524110275938, 380);
      assertEquals(7.375353890148316E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1785()  throws Throwable  {
      double double0 = FastMath.pow((-20.0), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1786()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1787()  throws Throwable  {
      double double0 = FastMath.pow(1.86857183406017E-15, (double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1788()  throws Throwable  {
      double double0 = FastMath.pow((-1880.3), 1.0);
      assertEquals((-1880.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1789()  throws Throwable  {
      double double0 = FastMath.pow((-14.440961934967225), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1790()  throws Throwable  {
      double double0 = FastMath.pow((-5618.036), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1791()  throws Throwable  {
      double double0 = FastMath.pow((-3349.32831), 3.5127708120698784E48);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1792()  throws Throwable  {
      double double0 = FastMath.pow((-3.197037359731606E-8), (-1036.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1793()  throws Throwable  {
      double double0 = FastMath.pow((-568.93934724), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1794()  throws Throwable  {
      double double0 = FastMath.pow(0.6823468208312988, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1795()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1796()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 20.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1797()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2211.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1798()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-1.0F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1799()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 7.877917738262007E-9);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1800()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1801()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1691.811611641828));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1802()  throws Throwable  {
      double double0 = FastMath.pow((-4.813899778443457E-9), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1803()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1804()  throws Throwable  {
      double double0 = FastMath.pow(2481.293918832063, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1805()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-753.089964823));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1806()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1807()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1808()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1024.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1809()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 0.036);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1810()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-2697.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1811()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 2475L);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1812()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-4136.093458587472));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1813()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-2169.33869764643));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1814()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1815()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1816()  throws Throwable  {
      double double0 = FastMath.log1p((-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1817()  throws Throwable  {
      double double0 = FastMath.log((-2846.25966767802), 0.9924399994607682);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1818()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.0F, 1989.6205897218);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1819()  throws Throwable  {
      double double0 = FastMath.log1p(0.1428571343421936);
      assertEquals(0.133531385173942, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1820()  throws Throwable  {
      double double0 = FastMath.log10(4.9E-324);
      assertEquals((-323.3062153431158), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1821()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1822()  throws Throwable  {
      double double0 = FastMath.log1p((-2629.770168));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1823()  throws Throwable  {
      double double0 = FastMath.log(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1824()  throws Throwable  {
      double double0 = FastMath.expm1((-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1825()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1826()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1827()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1828()  throws Throwable  {
      double double0 = FastMath.expm1((-716.112));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1829()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1830()  throws Throwable  {
      double double0 = FastMath.exp((-962));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1831()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1832()  throws Throwable  {
      float float0 = FastMath.signum((-351.3F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1833()  throws Throwable  {
      float float0 = FastMath.signum(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1834()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1835()  throws Throwable  {
      double double0 = FastMath.signum((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1836()  throws Throwable  {
      double double0 = FastMath.signum(Double.POSITIVE_INFINITY);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1837()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333329196);
      assertEquals(0.008333526242601714, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1838()  throws Throwable  {
      double double0 = FastMath.atanh(0.036);
      assertEquals(0.03601556410444137, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1839()  throws Throwable  {
      double double0 = FastMath.atanh(0.08871890604496002);
      assertEquals(0.08895278169617453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1840()  throws Throwable  {
      double double0 = FastMath.atanh(1);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1841()  throws Throwable  {
      double double0 = FastMath.atanh((-2.543891019387625E-17));
      assertEquals((-2.543891019387625E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1842()  throws Throwable  {
      double double0 = FastMath.atanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1843()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1844()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1845()  throws Throwable  {
      double double0 = FastMath.asinh((-0.1423698114896508));
      assertEquals((-0.14189319328755776), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1846()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1847()  throws Throwable  {
      double double0 = FastMath.asinh((-962));
      assertEquals((-7.562161901366145), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1848()  throws Throwable  {
      double double0 = FastMath.tanh(7.585213148062117E-25);
      assertEquals(7.585213148062117E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1849()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1850()  throws Throwable  {
      double double0 = FastMath.tanh(1800.06);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1851()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1852()  throws Throwable  {
      double double0 = FastMath.tanh((-127));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1853()  throws Throwable  {
      double double0 = FastMath.sinh(0.24740394949913025);
      assertEquals(0.24993556454409582, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1854()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1855()  throws Throwable  {
      double double0 = FastMath.sinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1856()  throws Throwable  {
      double double0 = FastMath.sinh((-528.49));
      assertEquals((-1.6567643670957767E229), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1857()  throws Throwable  {
      double double0 = FastMath.sinh(30.0);
      assertEquals(5.343237290762231E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1858()  throws Throwable  {
      double double0 = FastMath.sinh(2057.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1859()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1860()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1861()  throws Throwable  {
      double double0 = FastMath.cosh((-162.2196585069806));
      assertEquals(1.4127735328102024E70, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1862()  throws Throwable  {
      double double0 = FastMath.cosh((-4.9E-324));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1863()  throws Throwable  {
      double double0 = FastMath.cosh(462.4);
      assertEquals(3.286536322300962E200, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1864()  throws Throwable  {
      double double0 = FastMath.cosh(1045.0827485167);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1865()  throws Throwable  {
      double double0 = FastMath.cosh(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1866()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-4.9E-324));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1867()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1868()  throws Throwable  {
      int int0 = FastMath.getExponent((-204.89620376));
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test_1869()  throws Throwable  {
      int int0 = FastMath.getExponent(-0.0F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_1870()  throws Throwable  {
      double double0 = FastMath.cosh((-1344.6038151));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1871()  throws Throwable  {
      double double0 = FastMath.nextUp((double) (-351.3F));
      assertEquals((-351.2999877929687), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1872()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-2.125427494405454), (-4.1285478489484415));
      assertEquals(2.0031203545429874, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1873()  throws Throwable  {
      double double0 = FastMath.atan(11.93069162048911);
      assertEquals(1.4871743486228561, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1874()  throws Throwable  {
      double double0 = FastMath.acosh((-0.05938654758590633));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1875()  throws Throwable  {
      double double0 = FastMath.asin(0.7874716F);
      assertEquals(0.906695958262344, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1876()  throws Throwable  {
      double double0 = FastMath.expm1(1432);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1877()  throws Throwable  {
      int int0 = FastMath.round(4471.128F);
      assertEquals(4471, int0);
  }

  @Test(timeout = 4000)
  public void test_1878()  throws Throwable  {
      long long0 = FastMath.round((-1953.0));
      assertEquals((-1953L), long0);
  }

  @Test(timeout = 4000)
  public void test_1879()  throws Throwable  {
      double double0 = FastMath.cos(1669.06859267);
      assertEquals((-0.6349182592076839), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1880()  throws Throwable  {
      FastMath.copySign((-2893.1482F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1881()  throws Throwable  {
      FastMath.copySign(0.0F, (-196.497F));
  }

  @Test(timeout = 4000)
  public void test_1882()  throws Throwable  {
      FastMath.copySign((-2215.3164931751), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1883()  throws Throwable  {
      FastMath.copySign(0.0, (-2295.52));
  }

  @Test(timeout = 4000)
  public void test_1884()  throws Throwable  {
      FastMath.hypot(4.453410963357074E-6, (-908.8604119));
  }

  @Test(timeout = 4000)
  public void test_1885()  throws Throwable  {
      FastMath.max(0, 1069);
  }

  @Test(timeout = 4000)
  public void test_1886()  throws Throwable  {
      FastMath.rint((-138.4806150177315));
  }

  @Test(timeout = 4000)
  public void test_1887()  throws Throwable  {
      FastMath.rint(967.5);
  }

  @Test(timeout = 4000)
  public void test_1888()  throws Throwable  {
      FastMath.rint(-0.0);
  }

  @Test(timeout = 4000)
  public void test_1889()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1890()  throws Throwable  {
      FastMath.floor(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1891()  throws Throwable  {
      FastMath.scalb(2100.702F, (-138));
  }

  @Test(timeout = 4000)
  public void test_1892()  throws Throwable  {
      FastMath.scalb(3059.1F, 276);
  }

  @Test(timeout = 4000)
  public void test_1893()  throws Throwable  {
      FastMath.scalb((float) 128, 128);
  }

  @Test(timeout = 4000)
  public void test_1894()  throws Throwable  {
      FastMath.scalb(884.1919333833497, (-1032));
  }

  @Test(timeout = 4000)
  public void test_1895()  throws Throwable  {
      FastMath.scalb(1924.4875374606, 2097);
  }

  @Test(timeout = 4000)
  public void test_1896()  throws Throwable  {
      FastMath.scalb(1.4455756156545242E-4, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1897()  throws Throwable  {
      FastMath.ulp((-944.59F));
  }

  @Test(timeout = 4000)
  public void test_1898()  throws Throwable  {
      FastMath.ulp(3302.841);
  }

  @Test(timeout = 4000)
  public void test_1899()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1900()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1901()  throws Throwable  {
      FastMath.abs(1L);
  }

  @Test(timeout = 4000)
  public void test_1902()  throws Throwable  {
      FastMath.asin((-0.25));
  }

  @Test(timeout = 4000)
  public void test_1903()  throws Throwable  {
      FastMath.atan2(0.0, 0.5463024377822876);
  }

  @Test(timeout = 4000)
  public void test_1904()  throws Throwable  {
      FastMath.atan(1.633123935319537E16);
  }

  @Test(timeout = 4000)
  public void test_1905()  throws Throwable  {
      FastMath.tan((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1906()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1907()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1908()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1909()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1910()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1911()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1912()  throws Throwable  {
      FastMath.cos(5.266381689434054E277);
  }

  @Test(timeout = 4000)
  public void test_1913()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1914()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1915()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1916()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1917()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1918()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1919()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_1920()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_1921()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_1922()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1923()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1924()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1925()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1926()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1927()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1928()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1929()  throws Throwable  {
      FastMath.cosh(-0.0);
  }

  @Test(timeout = 4000)
  public void test_1930()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1931()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1932()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1933()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1934()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1935()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), 1.0);
  }

  @Test(timeout = 4000)
  public void test_1936()  throws Throwable  {
      FastMath.toRadians(1.5069412868172555E-236);
  }

  @Test(timeout = 4000)
  public void test_1937()  throws Throwable  {
      FastMath.toDegrees((-9.03693E-8));
  }

  @Test(timeout = 4000)
  public void test_1938()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1939()  throws Throwable  {
      FastMath.sqrt(1.921761414979015E-17);
  }

  @Test(timeout = 4000)
  public void test_1940()  throws Throwable  {
      FastMath.round((float) 24);
  }

  @Test(timeout = 4000)
  public void test_1941()  throws Throwable  {
      FastMath.round((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1942()  throws Throwable  {
      FastMath.round((double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1943()  throws Throwable  {
      FastMath.round(0.9285714285714286);
  }

  @Test(timeout = 4000)
  public void test_1944()  throws Throwable  {
      FastMath.pow(5.823920246566496E-9, 495);
  }

  @Test(timeout = 4000)
  public void test_1945()  throws Throwable  {
      FastMath.pow((-1258.21264217), 63);
  }

  @Test(timeout = 4000)
  public void test_1946()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1947()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1948()  throws Throwable  {
      FastMath.min((long) 0, 1884L);
  }

  @Test(timeout = 4000)
  public void test_1949()  throws Throwable  {
      FastMath.min(1871L, (-609L));
  }

  @Test(timeout = 4000)
  public void test_1950()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1951()  throws Throwable  {
      FastMath.min(1164.945F, 1164.945F);
  }

  @Test(timeout = 4000)
  public void test_1952()  throws Throwable  {
      FastMath.max((long) (-1023), 0L);
  }

  @Test(timeout = 4000)
  public void test_1953()  throws Throwable  {
      FastMath.max(758L, (-2566L));
  }

  @Test(timeout = 4000)
  public void test_1954()  throws Throwable  {
      FastMath.max(0, (-2147482996));
  }

  @Test(timeout = 4000)
  public void test_1955()  throws Throwable  {
      FastMath.max((double) (-2143222175), (-2439.1363588377));
  }

  @Test(timeout = 4000)
  public void test_1956()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_1957()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1958()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_1959()  throws Throwable  {
      FastMath.log(591.5, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1960()  throws Throwable  {
      FastMath.log((double) 1);
  }

  @Test(timeout = 4000)
  public void test_1961()  throws Throwable  {
      FastMath.log(2329.934022317794);
  }

  @Test(timeout = 4000)
  public void test_1962()  throws Throwable  {
      FastMath.log((double) 6.1035156E-5F);
  }

  @Test(timeout = 4000)
  public void test_1963()  throws Throwable  {
      FastMath.hypot(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1964()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1965()  throws Throwable  {
      FastMath.getExponent(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_1966()  throws Throwable  {
      FastMath.getExponent(1.0416666666666667);
  }

  @Test(timeout = 4000)
  public void test_1967()  throws Throwable  {
      FastMath.getExponent(804.14);
  }

  @Test(timeout = 4000)
  public void test_1968()  throws Throwable  {
      FastMath.exp((-1521.27907773732));
  }

  @Test(timeout = 4000)
  public void test_1969()  throws Throwable  {
      FastMath.copySign((float) 0, (float) 0);
  }

  @Test(timeout = 4000)
  public void test_1970()  throws Throwable  {
      FastMath.copySign(0.0, 5664.0);
  }

  @Test(timeout = 4000)
  public void test_1971()  throws Throwable  {
      FastMath.ceil(2910.1803488369173);
  }

  @Test(timeout = 4000)
  public void test_1972()  throws Throwable  {
      FastMath.atanh(0);
  }

  @Test(timeout = 4000)
  public void test_1973()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1974()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1975()  throws Throwable  {
      FastMath.acosh(277778.76646828535);
  }

  @Test(timeout = 4000)
  public void test_1976()  throws Throwable  {
      FastMath.acosh((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1977()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1978()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1979()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1980()  throws Throwable  {
      FastMath.IEEEremainder((-428.9921520065), (-428.9921520065));
  }

  @Test(timeout = 4000)
  public void test_1981()  throws Throwable  {
      FastMath.IEEEremainder(0.2, 1776.449);
  }

  @Test(timeout = 4000)
  public void test_1982()  throws Throwable  {
      FastMath.IEEEremainder((-0.25), (-1730.0));
  }

  @Test(timeout = 4000)
  public void test_1983()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1984()  throws Throwable  {
      String[] stringArray0 = new String[4];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_1985()  throws Throwable  {
      double double0 = FastMath.copySign(1.01, 1.01);
      assertEquals(1.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1986()  throws Throwable  {
      double double0 = FastMath.floor((-1693.0));
      assertEquals((-1693.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1987()  throws Throwable  {
      double double0 = FastMath.floor((-2.0331563579317016));
      assertEquals((-3.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1988()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1989()  throws Throwable  {
      double double0 = FastMath.floor(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1990()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1991()  throws Throwable  {
      double double0 = FastMath.floor(1.3997379246004789E-45);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1992()  throws Throwable  {
      float float0 = FastMath.nextAfter((-592.84F), (double) 565);
      assertEquals((-592.83997F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1993()  throws Throwable  {
      float float0 = FastMath.nextAfter(143.4679F, 3.069849599753188E69);
      assertEquals(143.46791F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1994()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 1699.0);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1995()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (double) 565);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1996()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 0.0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1997()  throws Throwable  {
      double double0 = FastMath.nextAfter((-0.15853338004399595), (-1990.21679791412));
      assertEquals((-0.15853338004399598), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1998()  throws Throwable  {
      double double0 = FastMath.nextAfter((-6.751434891261518E-56), 3.141592653589793);
      assertEquals((-6.751434891261517E-56), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1999()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0L, 2147.247);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2000()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, (double) (-1.0F));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2001()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-903.5531005808));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2002()  throws Throwable  {
      double double0 = FastMath.scalb((-5298.0185073111), (-195));
      assertEquals((-1.0550288036284177E-55), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2003()  throws Throwable  {
      float float0 = FastMath.abs(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2004()  throws Throwable  {
      float float0 = FastMath.abs(1002.2894F);
      assertEquals(1002.2894F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2005()  throws Throwable  {
      double double0 = FastMath.exp(3.442100456607687E-215);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2006()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_2007()  throws Throwable  {
      double double0 = FastMath.log((-3011.22836907612));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2008()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2009()  throws Throwable  {
      float float0 = FastMath.copySign((-134.08F), (float) 896);
      assertEquals(134.08F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2010()  throws Throwable  {
      float float0 = FastMath.copySign((float) 407L, (float) (-407L));
      assertEquals((-407.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2011()  throws Throwable  {
      float float0 = FastMath.copySign((float) 154, (float) 154);
      assertEquals(154.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2012()  throws Throwable  {
      float float0 = FastMath.copySign((-37.319695F), (-37.319695F));
      assertEquals((-37.319695F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2013()  throws Throwable  {
      double double0 = FastMath.copySign((-32.18350538499815), 5664.0);
      assertEquals(32.18350538499815, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2014()  throws Throwable  {
      double double0 = FastMath.copySign(16.451, (-0.6163693764784364));
      assertEquals((-16.451), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2015()  throws Throwable  {
      double double0 = FastMath.copySign((-1.5338432489022933), (-18.430862426757812));
      assertEquals((-1.5338432489022933), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2016()  throws Throwable  {
      double double0 = FastMath.hypot(18, 8.0E298);
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2017()  throws Throwable  {
      double double0 = FastMath.hypot(322.1523197021751, 2.8835418231126645E-9);
      assertEquals(322.1523197021751, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2018()  throws Throwable  {
      double double0 = FastMath.hypot(3.141592653589793, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2019()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2020()  throws Throwable  {
      double double0 = FastMath.hypot(815.07579, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2021()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2022()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2023()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-1466.11544));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2024()  throws Throwable  {
      double double0 = FastMath.max(0.0036, 1756.9616472252);
      assertEquals(1756.9616472252, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2025()  throws Throwable  {
      double double0 = FastMath.max(1214.6249300077136, (-858.86952460669));
      assertEquals(1214.6249300077136, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2026()  throws Throwable  {
      double double0 = FastMath.max((double) 1.4E-45F, (double) 1.4E-45F);
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2027()  throws Throwable  {
      float float0 = FastMath.max((-6.1035156E-5F), (-6.1035156E-5F));
      assertEquals((-6.1035156E-5F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2028()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2029()  throws Throwable  {
      float float0 = FastMath.max((-2.028241E31F), 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2030()  throws Throwable  {
      float float0 = FastMath.max(359.67313F, (-1520.6F));
      assertEquals(359.67313F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2031()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2032()  throws Throwable  {
      long long0 = FastMath.max((-584L), (-584L));
      assertEquals((-584L), long0);
  }

  @Test(timeout = 4000)
  public void test_2033()  throws Throwable  {
      int int0 = FastMath.max((-1695), (-1695));
      assertEquals((-1695), int0);
  }

  @Test(timeout = 4000)
  public void test_2034()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2035()  throws Throwable  {
      double double0 = FastMath.min(0.9375, (double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2036()  throws Throwable  {
      double double0 = FastMath.min((-1119.2823370396775), (-388.77555133));
      assertEquals((-1119.2823370396775), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2037()  throws Throwable  {
      double double0 = FastMath.min((-456.0), (-3334.64502));
      assertEquals((-3334.64502), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2038()  throws Throwable  {
      double double0 = FastMath.min(1.026763015362553E-281, 1.026763015362553E-281);
      assertEquals(1.026763015362553E-281, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2039()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2040()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 0.0F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2041()  throws Throwable  {
      float float0 = FastMath.min((-214.2132F), (-214.2132F));
      assertEquals((-214.2132F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2042()  throws Throwable  {
      float float0 = FastMath.min(1.4E-45F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2043()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), 1.0F);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2044()  throws Throwable  {
      long long0 = FastMath.min(141L, 141L);
      assertEquals(141L, long0);
  }

  @Test(timeout = 4000)
  public void test_2045()  throws Throwable  {
      int int0 = FastMath.min(2387, 2988);
      assertEquals(2387, int0);
  }

  @Test(timeout = 4000)
  public void test_2046()  throws Throwable  {
      int int0 = FastMath.min((-24), (-1022));
      assertEquals((-1022), int0);
  }

  @Test(timeout = 4000)
  public void test_2047()  throws Throwable  {
      double double0 = FastMath.rint(1086.840986167);
      assertEquals(1087.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2048()  throws Throwable  {
      double double0 = FastMath.rint((-3.530408962212661E-22));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2049()  throws Throwable  {
      double double0 = FastMath.ceil((-0.6163693764784364));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2050()  throws Throwable  {
      double double0 = FastMath.ceil((-1466.11544));
      assertEquals((-1466.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2051()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2052()  throws Throwable  {
      double double0 = FastMath.ceil((-2143222186));
      assertEquals((-2.143222186E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2053()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2054()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2055()  throws Throwable  {
      float float0 = FastMath.nextUp(1025.0F);
      assertEquals(1025.0001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2056()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, (-1135.27870362198));
      assertEquals(0.99999994F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2057()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-3281.720018559798));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2058()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2059()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-1.9734865444051182));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2060()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2061()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1285.493F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2062()  throws Throwable  {
      double double0 = FastMath.nextUp(0.4067663550376892);
      assertEquals(0.40676635503768926, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2063()  throws Throwable  {
      double double0 = FastMath.nextAfter(2.6010732940533088E-99, (-761.607687590883));
      assertEquals(2.6010732940533084E-99, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2064()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0, (double) Float.NEGATIVE_INFINITY);
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2065()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.POSITIVE_INFINITY, (-0.09088450866185192));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2066()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2067()  throws Throwable  {
      double double0 = FastMath.nextAfter(909.9759585, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2068()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 255);
      assertEquals(8.112964E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2069()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-195), (-195));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2070()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-138));
      assertEquals(2.87E-42F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2071()  throws Throwable  {
      float float0 = FastMath.scalb((-3.4028235E38F), (-277));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2072()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1601), (-127));
      assertEquals((-9.409832E-36F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2073()  throws Throwable  {
      float float0 = FastMath.scalb(2102.774F, (-259));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2074()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2143097275, 2143097275);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2075()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2102), 872);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2076()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-2102));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2077()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-2102));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2078()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 1526);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2079()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-2098));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2080()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1, 1);
      assertEquals(2.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2081()  throws Throwable  {
      float float0 = FastMath.scalb((-5513.1F), 255);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2082()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2143222175), (-2143222175));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2083()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2084()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1.4E-45F, 1097);
      assertEquals(2.379227053564453E285, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2085()  throws Throwable  {
      double double0 = FastMath.scalb(4.9E-324, 1024);
      assertEquals(8.881784197001252E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2086()  throws Throwable  {
      double double0 = FastMath.scalb((-1.4669965113042639E-8), (-1023));
      assertEquals((-1.6320878E-316), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2087()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2143222186), (-1072));
      assertEquals((-4.235569814E-314), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2088()  throws Throwable  {
      double double0 = FastMath.scalb(2934.710346, (-1023));
      assertEquals(3.264973636587612E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2089()  throws Throwable  {
      double double0 = FastMath.scalb((-1378.1543312381727), 1194);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2090()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1621916451, 1621916451);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2091()  throws Throwable  {
      double double0 = FastMath.scalb(223.37915815633636, (-2197));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2092()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2194), (-2194));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2093()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, 1621916451);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2094()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 1504);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2095()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 2146522407);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2096()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2737367544323206E-13), 1621916451);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2097()  throws Throwable  {
      double double0 = FastMath.scalb((-1634.776913), (-2092));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2098()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2099()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2100()  throws Throwable  {
      double double0 = FastMath.ulp(0.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2101()  throws Throwable  {
      double double0 = FastMath.abs(-0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2102()  throws Throwable  {
      double double0 = FastMath.abs((-1631.9));
      assertEquals(1631.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2103()  throws Throwable  {
      double double0 = FastMath.abs((double) 50);
      assertEquals(50.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2104()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2105()  throws Throwable  {
      long long0 = FastMath.abs((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2106()  throws Throwable  {
      int int0 = FastMath.abs((-86));
      assertEquals(86, int0);
  }

  @Test(timeout = 4000)
  public void test_2107()  throws Throwable  {
      int int0 = FastMath.abs(334);
      assertEquals(334, int0);
  }

  @Test(timeout = 4000)
  public void test_2108()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2109()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2110()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2111()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2112()  throws Throwable  {
      double double0 = FastMath.toRadians((-11.509066128868392));
      assertEquals((-0.20087109777851145), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2113()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2114()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2115()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2116()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2117()  throws Throwable  {
      double double0 = FastMath.cbrt((-24.06794963565));
      assertEquals((-2.8872188070231677), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2118()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2119()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2120()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2121()  throws Throwable  {
      double double0 = FastMath.acos((-1));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2122()  throws Throwable  {
      double double0 = FastMath.acos((-9));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2123()  throws Throwable  {
      double double0 = FastMath.acos(2.1252856254577637);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2124()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2125()  throws Throwable  {
      double double0 = FastMath.asin(0.008333333333333333);
      assertEquals(0.008333429786964823, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2126()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2127()  throws Throwable  {
      double double0 = FastMath.asin(1);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2128()  throws Throwable  {
      double double0 = FastMath.asin((-3031.78330324));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2129()  throws Throwable  {
      double double0 = FastMath.asin(1989.7019837496987);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2130()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2131()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2132()  throws Throwable  {
      double double0 = FastMath.atan2(1.0, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2133()  throws Throwable  {
      double double0 = FastMath.atan2((-4057.6509964767), 4.9E-324);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2134()  throws Throwable  {
      double double0 = FastMath.atan2(601.57563, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2135()  throws Throwable  {
      double double0 = FastMath.atan2((-8.0E298), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2136()  throws Throwable  {
      double double0 = FastMath.atan2(2.6010732940533088E-99, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2137()  throws Throwable  {
      double double0 = FastMath.atan2((-2143222186), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2138()  throws Throwable  {
      double double0 = FastMath.atan2(1.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2139()  throws Throwable  {
      double double0 = FastMath.atan2((-8.90036638439104), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2140()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2141()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2142()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 1198.895);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2143()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2144()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 8.0E298);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2145()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2146()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2147()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-813.1062455));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2148()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2149()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2150()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2151()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 1313.9992389645518);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2152()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2153()  throws Throwable  {
      double double0 = FastMath.atan2((-8.0E298), (-8.0E298));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2154()  throws Throwable  {
      double double0 = FastMath.acos(2.6010732940533088E-99);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2155()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-6.052137892844206));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2156()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2157()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2158()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2159()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2160()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2161()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2162()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2163()  throws Throwable  {
      double double0 = FastMath.sin((-1556.02849702));
      assertEquals(0.807636825813096, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2164()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2165()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2166()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2167()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2168()  throws Throwable  {
      double double0 = FastMath.sin((-4.503599627370496E15));
      assertEquals((-0.8742173026236351), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2169()  throws Throwable  {
      double double0 = FastMath.cos(4.5035996273704935E15);
      assertEquals(0.9121778629310492, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2170()  throws Throwable  {
      double double0 = FastMath.tan(1.8014398509481984E16);
      assertEquals((-2.0331563579317016), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2171()  throws Throwable  {
      double double0 = FastMath.cos(4.49423283715579E307);
      assertEquals((-0.2946439931390525), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2172()  throws Throwable  {
      double double0 = FastMath.sin(1.6889383928999305E13);
      assertEquals(0.34459375307053425, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2173()  throws Throwable  {
      double double0 = FastMath.tan(5.9994277301267294E175);
      assertEquals(0.5168284974299343, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2174()  throws Throwable  {
      double double0 = FastMath.tan(4.2732724072740124E300);
      assertEquals(1.4360259394986228, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2175()  throws Throwable  {
      double double0 = FastMath.sin(1.7976931348623157E308);
      assertEquals(0.004961954789184062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2176()  throws Throwable  {
      double double0 = FastMath.sin(1.4565123573071036E164);
      assertEquals((-0.5195024294791903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2177()  throws Throwable  {
      double double0 = FastMath.tan(9223372036854775794L);
      assertEquals(84.73931296875567, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2178()  throws Throwable  {
      double double0 = FastMath.tan(1.4794751934479566E-52);
      assertEquals(1.4794751934479566E-52, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2179()  throws Throwable  {
      double double0 = FastMath.sin(4.908494602153544E-8);
      assertEquals(4.908494602153542E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2180()  throws Throwable  {
      double double0 = FastMath.pow(0.75, (-2159));
      assertEquals(5.530091757078142E269, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2181()  throws Throwable  {
      double double0 = FastMath.pow(2322.58452, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2182()  throws Throwable  {
      double double0 = FastMath.pow((double) 1024, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2183()  throws Throwable  {
      double double0 = FastMath.pow((-246.0), (-246.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2184()  throws Throwable  {
      double double0 = FastMath.pow((-1.7313929175143728E-17), (double) (-1.0F));
      assertEquals((-5.7756964920222896E16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2185()  throws Throwable  {
      double double0 = FastMath.pow((-107.76562317), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2186()  throws Throwable  {
      double double0 = FastMath.pow((-2.407190180094126), 9.183480622172801E148);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2187()  throws Throwable  {
      double double0 = FastMath.pow((-1859.65), 2292.46013548092);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2188()  throws Throwable  {
      double double0 = FastMath.pow(9.898699750569508E-9, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2189()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.0F, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2190()  throws Throwable  {
      double double0 = FastMath.pow(1696.0, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2191()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2192()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.1483560326413004E-7);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2193()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-2143222186));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2194()  throws Throwable  {
      double double0 = FastMath.pow(6.123233995736766E-17, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2195()  throws Throwable  {
      double double0 = FastMath.pow((-702.3838432912182), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2196()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-6.432337568761393E161));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2197()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2198()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-12.994080144900924));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2199()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2200()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, 9.183480622172801E148);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2201()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-1.5338432489022933));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2202()  throws Throwable  {
      double double0 = FastMath.pow(833.798317, (double) -0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2203()  throws Throwable  {
      double double0 = FastMath.log10(265.1511758);
      assertEquals(2.4234935573166205, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2204()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2205()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2206()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F, (double) 1267.809F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2207()  throws Throwable  {
      double double0 = FastMath.asinh(0.3153223395347595);
      assertEquals(0.310317849303759, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2208()  throws Throwable  {
      double double0 = FastMath.log1p(2.7553817452272217E-6);
      assertEquals(2.755377949169914E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2209()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.893083F, (double) 0.893083F);
      assertEquals(0.9039456360268645, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2210()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2211()  throws Throwable  {
      double double0 = FastMath.asinh(8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2212()  throws Throwable  {
      double double0 = FastMath.log1p((-215.02821076636525));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2213()  throws Throwable  {
      double double0 = FastMath.expm1((-6.032174644509064E-23));
      assertEquals((-6.032174644509064E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2214()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2215()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2216()  throws Throwable  {
      double double0 = FastMath.expm1(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2217()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2218()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, (-709.782712893384));
      assertEquals(5.562684646268344E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2219()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 0.997495);
      assertEquals(3.0E-323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2220()  throws Throwable  {
      double double0 = FastMath.expm1((-2143222186));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2221()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2222()  throws Throwable  {
      float float0 = FastMath.signum((-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2223()  throws Throwable  {
      float float0 = FastMath.signum(1266.01F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2224()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2225()  throws Throwable  {
      double double0 = FastMath.signum((-546.2749797151744));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2226()  throws Throwable  {
      double double0 = FastMath.signum(884.1919333833497);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2227()  throws Throwable  {
      double double0 = FastMath.atanh(0.0036);
      assertEquals(0.0036000155521209334, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2228()  throws Throwable  {
      double double0 = FastMath.atanh(0.07490822288864472);
      assertEquals(0.07504880588537914, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2229()  throws Throwable  {
      double double0 = FastMath.atanh((-0.12502530217170715));
      assertEquals((-0.12568291801652487), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2230()  throws Throwable  {
      double double0 = FastMath.atanh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2231()  throws Throwable  {
      double double0 = FastMath.asinh((-0.09088450866185192));
      assertEquals((-0.09075985386836895), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2232()  throws Throwable  {
      double double0 = FastMath.asinh((-0.16666666666666666));
      assertEquals((-0.16590455026930118), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2233()  throws Throwable  {
      double double0 = FastMath.tanh(1.4E-45F);
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2234()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2235()  throws Throwable  {
      double double0 = FastMath.tanh(1985.5928612805092);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2236()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2237()  throws Throwable  {
      double double0 = FastMath.tanh((-1194.03875368468));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2238()  throws Throwable  {
      double double0 = FastMath.sinh(1.026763015362553E-281);
      assertEquals(1.026763015362553E-281, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2239()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2240()  throws Throwable  {
      double double0 = FastMath.sinh((-2775.11609001228));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2241()  throws Throwable  {
      double double0 = FastMath.sinh((-456.0));
      assertEquals((-5.4607683298696026E197), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2242()  throws Throwable  {
      double double0 = FastMath.sinh(762.006);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2243()  throws Throwable  {
      double double0 = FastMath.sinh(120.26777);
      assertEquals(8.523125162908986E51, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2244()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2245()  throws Throwable  {
      double double0 = FastMath.cosh((-7.83892088580041E80));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2246()  throws Throwable  {
      double double0 = FastMath.cosh(513.09299793);
      assertEquals(3.407436008341692E222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2247()  throws Throwable  {
      double double0 = FastMath.cosh(1567.5);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2248()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2249()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2250()  throws Throwable  {
      double double0 = FastMath.log(0.0, 386.1521238075008);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2251()  throws Throwable  {
      int int0 = FastMath.getExponent(1180.587F);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_2252()  throws Throwable  {
      double double0 = FastMath.cosh((-580.41076));
      assertEquals(5.863545635889492E251, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2253()  throws Throwable  {
      double double0 = FastMath.atan(Float.NEGATIVE_INFINITY);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2254()  throws Throwable  {
      double double0 = FastMath.acos((-3.5997360512765566E-9));
      assertEquals(1.5707963303946326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2255()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2256()  throws Throwable  {
      long long0 = FastMath.round((-1493.70841237116));
      assertEquals((-1494L), long0);
  }

  @Test(timeout = 4000)
  public void test_2257()  throws Throwable  {
      double double0 = FastMath.cos((-219.0));
      assertEquals(0.6125720663156844, double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_2258()  throws Throwable  {
      FastMath.copySign((-1338.3209F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_2259()  throws Throwable  {
      FastMath.copySign(0.0F, (-2637.7F));
  }

  @Test(timeout = 4000)
  public void test_2260()  throws Throwable  {
      FastMath.copySign(1337.001F, (float) 0);
  }

  @Test(timeout = 4000)
  public void test_2261()  throws Throwable  {
      FastMath.copySign((-3.7257346819782323E242), 3.3310057014599044E-156);
  }

  @Test(timeout = 4000)
  public void test_2262()  throws Throwable  {
      FastMath.hypot(1.7827257129423816E-8, 3.1415926535897936);
  }

  @Test(timeout = 4000)
  public void test_2263()  throws Throwable  {
      FastMath.hypot(6.991731564262158, (-3.9793609609721186E-8));
  }

  @Test(timeout = 4000)
  public void test_2264()  throws Throwable  {
      FastMath.rint((-4550.1891));
  }

  @Test(timeout = 4000)
  public void test_2265()  throws Throwable  {
      FastMath.rint(1631.5);
  }

  @Test(timeout = 4000)
  public void test_2266()  throws Throwable  {
      FastMath.ceil((-3629.50669));
  }

  @Test(timeout = 4000)
  public void test_2267()  throws Throwable  {
      FastMath.floor(0);
  }

  @Test(timeout = 4000)
  public void test_2268()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_2269()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_2270()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_2271()  throws Throwable  {
      FastMath.scalb((-2335.651F), 276);
  }

  @Test(timeout = 4000)
  public void test_2272()  throws Throwable  {
      FastMath.scalb((-3.67030725E14F), (-277));
  }

  @Test(timeout = 4000)
  public void test_2273()  throws Throwable  {
      FastMath.scalb((-1.0), (-1023));
  }

  @Test(timeout = 4000)
  public void test_2274()  throws Throwable  {
      FastMath.scalb((double) (-817L), 2097);
  }

  @Test(timeout = 4000)
  public void test_2275()  throws Throwable  {
      FastMath.scalb(1840.9648893, 1024);
  }

  @Test(timeout = 4000)
  public void test_2276()  throws Throwable  {
      FastMath.ulp(1564.6253);
  }

  @Test(timeout = 4000)
  public void test_2277()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2278()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2279()  throws Throwable  {
      FastMath.abs(4598175219545276416L);
  }

  @Test(timeout = 4000)
  public void test_2280()  throws Throwable  {
      FastMath.toDegrees((-687.39939806046));
  }

  @Test(timeout = 4000)
  public void test_2281()  throws Throwable  {
      FastMath.asin(7.60411321706007E-17);
  }

  @Test(timeout = 4000)
  public void test_2282()  throws Throwable  {
      FastMath.atan2(0L, 1.34217729E8);
  }

  @Test(timeout = 4000)
  public void test_2283()  throws Throwable  {
      FastMath.atan(1.633123935319537E16);
  }

  @Test(timeout = 4000)
  public void test_2284()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2285()  throws Throwable  {
      FastMath.tan(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_2286()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2287()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2288()  throws Throwable  {
      FastMath.cos(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2289()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_2290()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2291()  throws Throwable  {
      FastMath.sin((-1.2448938139338362E211));
  }

  @Test(timeout = 4000)
  public void test_2292()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_2293()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_2294()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_2295()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2296()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2297()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_2298()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_2299()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_2300()  throws Throwable  {
      FastMath.tanh(0.5F);
  }

  @Test(timeout = 4000)
  public void test_2301()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2302()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2303()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_2304()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2305()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2306()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2307()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2308()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2309()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2310()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2311()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2312()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_2313()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_2314()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_2315()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2316()  throws Throwable  {
      FastMath.round((-1730.913F));
  }

  @Test(timeout = 4000)
  public void test_2317()  throws Throwable  {
      FastMath.round(1.5874010519681994);
  }

  @Test(timeout = 4000)
  public void test_2318()  throws Throwable  {
      FastMath.round(Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2319()  throws Throwable  {
      FastMath.pow(0.0, 709);
  }

  @Test(timeout = 4000)
  public void test_2320()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_2321()  throws Throwable  {
      FastMath.nextAfter(1.4E-45F, (-2733.9098174));
  }

  @Test(timeout = 4000)
  public void test_2322()  throws Throwable  {
      FastMath.nextAfter(0.0, (double) 0L);
  }

  @Test(timeout = 4000)
  public void test_2323()  throws Throwable  {
      FastMath.min((long) 0, 0L);
  }

  @Test(timeout = 4000)
  public void test_2324()  throws Throwable  {
      FastMath.min(4503599627370496L, 4609746447743296384L);
  }

  @Test(timeout = 4000)
  public void test_2325()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_2326()  throws Throwable  {
      FastMath.min(977.42255F, 977.42255F);
  }

  @Test(timeout = 4000)
  public void test_2327()  throws Throwable  {
      FastMath.min(0.0, 562.933);
  }

  @Test(timeout = 4000)
  public void test_2328()  throws Throwable  {
      FastMath.min(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2329()  throws Throwable  {
      FastMath.max((-937L), 0L);
  }

  @Test(timeout = 4000)
  public void test_2330()  throws Throwable  {
      FastMath.max((-2437L), (-2437L));
  }

  @Test(timeout = 4000)
  public void test_2331()  throws Throwable  {
      FastMath.max((-1876), 273);
  }

  @Test(timeout = 4000)
  public void test_2332()  throws Throwable  {
      FastMath.max((-939.0F), (-5414.0F));
  }

  @Test(timeout = 4000)
  public void test_2333()  throws Throwable  {
      FastMath.max((-1472.0927159681476), (-577.4411091));
  }

  @Test(timeout = 4000)
  public void test_2334()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_2335()  throws Throwable  {
      FastMath.log((double) 0, 1170.85162821);
  }

  @Test(timeout = 4000)
  public void test_2336()  throws Throwable  {
      FastMath.log(0.167, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2337()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_2338()  throws Throwable  {
      FastMath.log(6.517749699181978);
  }

  @Test(timeout = 4000)
  public void test_2339()  throws Throwable  {
      FastMath.log(0.33954053627388736);
  }

  @Test(timeout = 4000)
  public void test_2340()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2341()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_2342()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2343()  throws Throwable  {
      FastMath.getExponent(1.5);
  }

  @Test(timeout = 4000)
  public void test_2344()  throws Throwable  {
      FastMath.getExponent(0.0);
  }

  @Test(timeout = 4000)
  public void test_2345()  throws Throwable  {
      FastMath.copySign((float) 0, Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2346()  throws Throwable  {
      FastMath.copySign(0.0, (-1673.694));
  }

  @Test(timeout = 4000)
  public void test_2347()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2348()  throws Throwable  {
      FastMath.atanh((-1.0));
  }

  @Test(timeout = 4000)
  public void test_2349()  throws Throwable  {
      FastMath.asinh(0);
  }

  @Test(timeout = 4000)
  public void test_2350()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_2351()  throws Throwable  {
      FastMath.acosh(2022.50459614927);
  }

  @Test(timeout = 4000)
  public void test_2352()  throws Throwable  {
      FastMath.acosh((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_2353()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_2354()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_2355()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2356()  throws Throwable  {
      FastMath.IEEEremainder(1069.18426, Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2357()  throws Throwable  {
      FastMath.IEEEremainder((-4550.1891), (-1.5705765557124376));
  }

  @Test(timeout = 4000)
  public void test_2358()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-1.1461755745719884E-7), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2359()  throws Throwable  {
      double double0 = FastMath.copySign(14.451988463498127, 14.451988463498127);
      assertEquals(14.451988463498127, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2360()  throws Throwable  {
      double double0 = FastMath.floor((-891.0));
      assertEquals((-891.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2361()  throws Throwable  {
      double double0 = FastMath.floor((-1097.52));
      assertEquals((-1098.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2362()  throws Throwable  {
      double double0 = FastMath.floor(3.3932984011177642E41);
      assertEquals(3.3932984011177642E41, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2363()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2364()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (-13.60117568898089));
      assertEquals((-1.0000001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2365()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-9223372036854775808L), (-1.9841269659586505E-4));
      assertEquals((-9.2233715E18F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2366()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 1472.106);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2367()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (double) Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2368()  throws Throwable  {
      double double0 = FastMath.nextAfter(1055.4899516829848, 2532.1079556825357);
      assertEquals(1055.489951682985, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2369()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2390.0), (-2.6437112632041807E-8));
      assertEquals((-2389.9999999999995), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2370()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2546.676617803);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2371()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 1.5273273624460932);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2372()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 1787.2);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2373()  throws Throwable  {
      double double0 = FastMath.scalb(-0.0, 0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2374()  throws Throwable  {
      double double0 = FastMath.abs((-492.42957));
      assertEquals(492.42957, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2375()  throws Throwable  {
      double double0 = FastMath.pow(2.4509711265563965, (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2376()  throws Throwable  {
      int int0 = FastMath.getExponent(606.8923);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test_2377()  throws Throwable  {
      double double0 = FastMath.log((-1.9881361945718314));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2378()  throws Throwable  {
      double double0 = FastMath.sqrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2379()  throws Throwable  {
      float float0 = FastMath.copySign((-561.77F), 88.18F);
      assertEquals(561.77F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2380()  throws Throwable  {
      float float0 = FastMath.copySign(3.4028235E38F, (-2027.9269F));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2381()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2382()  throws Throwable  {
      double double0 = FastMath.copySign((-3164.9), 0.0);
      assertEquals(3164.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2383()  throws Throwable  {
      double double0 = FastMath.copySign(1.0129027912496858E-9, (-1165.377266121847));
      assertEquals((-1.0129027912496858E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2384()  throws Throwable  {
      double double0 = FastMath.copySign((-661.8419888035261), (-661.8419888035261));
      assertEquals((-661.8419888035261), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2385()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, (-1.4E-45F));
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2386()  throws Throwable  {
      double double0 = FastMath.hypot((-0.7303177201160915), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2387()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, (-2.6033824355191673E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2388()  throws Throwable  {
      double double0 = FastMath.hypot((-1008.736), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2389()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, (-1.7976931348623157E308));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2390()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2391()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2392()  throws Throwable  {
      double double0 = FastMath.max(1330.3989, (double) 8388608);
      assertEquals(8388608.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2393()  throws Throwable  {
      double double0 = FastMath.max(4344.24, 5.206150291559893E-8);
      assertEquals(4344.24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2394()  throws Throwable  {
      double double0 = FastMath.max(0.097, 0.097);
      assertEquals(0.097, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2395()  throws Throwable  {
      float float0 = FastMath.max(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2396()  throws Throwable  {
      float float0 = FastMath.max((-3155.0F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2397()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2398()  throws Throwable  {
      float float0 = FastMath.max((-5659.301F), 1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2399()  throws Throwable  {
      long long0 = FastMath.max((-732L), 1100L);
      assertEquals(1100L, long0);
  }

  @Test(timeout = 4000)
  public void test_2400()  throws Throwable  {
      long long0 = FastMath.max(1100L, (-732L));
      assertEquals(1100L, long0);
  }

  @Test(timeout = 4000)
  public void test_2401()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2402()  throws Throwable  {
      int int0 = FastMath.max((-327), (-429));
      assertEquals((-327), int0);
  }

  @Test(timeout = 4000)
  public void test_2403()  throws Throwable  {
      double double0 = FastMath.min((double) Float.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2404()  throws Throwable  {
      double double0 = FastMath.min(4275.482300953201, 4275.6932);
      assertEquals(4275.482300953201, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2405()  throws Throwable  {
      double double0 = FastMath.min(Double.POSITIVE_INFINITY, 2515.0);
      assertEquals(2515.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2406()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2407()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2408()  throws Throwable  {
      float float0 = FastMath.min((-2508.3867F), (-2508.3867F));
      assertEquals((-2508.3867F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2409()  throws Throwable  {
      float float0 = FastMath.min(1836.37F, (-279.0F));
      assertEquals((-279.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2410()  throws Throwable  {
      float float0 = FastMath.min((-1298.0F), (float) 1234);
      assertEquals((-1298.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2411()  throws Throwable  {
      long long0 = FastMath.min((-13L), (-13L));
      assertEquals((-13L), long0);
  }

  @Test(timeout = 4000)
  public void test_2412()  throws Throwable  {
      long long0 = FastMath.min((-4591L), (long) (-134217723));
      assertEquals((-134217723L), long0);
  }

  @Test(timeout = 4000)
  public void test_2413()  throws Throwable  {
      int int0 = FastMath.min(48, 1843);
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test_2414()  throws Throwable  {
      int int0 = FastMath.min(3037, (-3013));
      assertEquals((-3013), int0);
  }

  @Test(timeout = 4000)
  public void test_2415()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2416()  throws Throwable  {
      double double0 = FastMath.rint(0.6487176418304443);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2417()  throws Throwable  {
      double double0 = FastMath.ceil((-6.824454861992054E-31));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2418()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2419()  throws Throwable  {
      double double0 = FastMath.ceil(1118.70970598207);
      assertEquals(1119.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2420()  throws Throwable  {
      double double0 = FastMath.rint((-3.7999795083850525E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2421()  throws Throwable  {
      double double0 = FastMath.rint((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2422()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2423()  throws Throwable  {
      float float0 = FastMath.nextUp(0.69585687F);
      assertEquals(0.6958569F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2424()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1843.712634));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2425()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 2.718281828459045);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2426()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-1938.0));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2427()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2428()  throws Throwable  {
      float float0 = FastMath.nextAfter(2616.61F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2429()  throws Throwable  {
      double double0 = FastMath.nextUp(2.2250738585072014E-308);
      assertEquals(2.225073858507202E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2430()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 295, 0.20421552658081055);
      assertEquals(294.99999999999994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2431()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-2027.867));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2432()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 2786.049909);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2433()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2434()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 2592L, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2435()  throws Throwable  {
      float float0 = FastMath.scalb((float) 273, 273);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2436()  throws Throwable  {
      float float0 = FastMath.scalb(1.1920929E-7F, 128);
      assertEquals(4.056482E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2437()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 273);
      assertEquals(2.1267648E37F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2438()  throws Throwable  {
      float float0 = FastMath.scalb(863.0F, (-171));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2439()  throws Throwable  {
      float float0 = FastMath.scalb(1555.3F, (-138));
      assertEquals(4.463493E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2440()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2441()  throws Throwable  {
      float float0 = FastMath.scalb((float) 295, 295);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2442()  throws Throwable  {
      float float0 = FastMath.scalb((-138.0F), 686);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2443()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-563));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2444()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 299);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2445()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 1350);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2446()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 139);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2447()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1), (-1));
      assertEquals((-0.5F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2448()  throws Throwable  {
      float float0 = FastMath.scalb((-285.0F), (-3163));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2449()  throws Throwable  {
      double double0 = FastMath.scalb(1.1426473877336358E-245, 1581);
      assertEquals(9.690258796668334E230, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2450()  throws Throwable  {
      double double0 = FastMath.scalb((-1170.215838), (-1662));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2451()  throws Throwable  {
      double double0 = FastMath.scalb((-4.813899778443457E-9), (-1023));
      assertEquals((-5.3556415E-317), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2452()  throws Throwable  {
      double double0 = FastMath.scalb(0.1111111111111111, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2453()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2371, 2371);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2454()  throws Throwable  {
      double double0 = FastMath.scalb((-979.63467), 726826900);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2455()  throws Throwable  {
      double double0 = FastMath.scalb(2.718281828459045, (-651917302));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2456()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-134217723), (-134217723));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2457()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 2058005162);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2458()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, (-3357));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2459()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1582);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2460()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2461()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2462()  throws Throwable  {
      float float0 = FastMath.ulp(3.4028235E38F);
      assertEquals(2.028241E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2463()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2464()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2465()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2466()  throws Throwable  {
      float float0 = FastMath.abs((-205.32486F));
      assertEquals(205.32486F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2467()  throws Throwable  {
      float float0 = FastMath.abs(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2468()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2469()  throws Throwable  {
      int int0 = FastMath.abs((-1339));
      assertEquals(1339, int0);
  }

  @Test(timeout = 4000)
  public void test_2470()  throws Throwable  {
      int int0 = FastMath.abs(244);
      assertEquals(244, int0);
  }

  @Test(timeout = 4000)
  public void test_2471()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2472()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2473()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2474()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2475()  throws Throwable  {
      double double0 = FastMath.toRadians(1361);
      assertEquals(23.753931119642825, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2476()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2477()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2478()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2479()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2480()  throws Throwable  {
      double double0 = FastMath.cbrt((-0.16624882440418567));
      assertEquals((-0.5498609283684404), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2481()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2482()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2483()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2484()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2485()  throws Throwable  {
      double double0 = FastMath.acos((-1629.2692));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2486()  throws Throwable  {
      double double0 = FastMath.acos(7.750755413343047);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2487()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2488()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2489()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2490()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2491()  throws Throwable  {
      double double0 = FastMath.asin((-3.0992848348853417));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2492()  throws Throwable  {
      double double0 = FastMath.asin(818.2107);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2493()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2494()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 1.5707963267948966);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2495()  throws Throwable  {
      double double0 = FastMath.atan2(8.0E298, (-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2496()  throws Throwable  {
      double double0 = FastMath.atan2(2330.80386682187, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2497()  throws Throwable  {
      double double0 = FastMath.atan2(0.167, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2498()  throws Throwable  {
      double double0 = FastMath.atan2((-7.209290877507077E10), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2499()  throws Throwable  {
      double double0 = FastMath.atan2(2.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2500()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2501()  throws Throwable  {
      double double0 = FastMath.atan2((-492.42957), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2502()  throws Throwable  {
      double double0 = FastMath.atan2(1.1426473877336358E-245, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2503()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 3.145894820876798E-6);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2504()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2505()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2506()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2507()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2508()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 2708.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2509()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, (-3896.697378672));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2510()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, -0.0);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2511()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2512()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2513()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 1097.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2514()  throws Throwable  {
      double double0 = FastMath.atan2((-2460.6977263156), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2515()  throws Throwable  {
      double double0 = FastMath.atan2((-1321.7923671404455), (-1321.7923671404455));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2516()  throws Throwable  {
      double double0 = FastMath.asin((-0.05417713522911072));
      assertEquals((-0.05420367340757514), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2517()  throws Throwable  {
      double double0 = FastMath.acos(2.9240221157844312E-8);
      assertEquals(1.5707962975546754, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2518()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2519()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2520()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2521()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2522()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2523()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2524()  throws Throwable  {
      double double0 = FastMath.cos(3253);
      assertEquals((-0.11891076553055703), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2525()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2526()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2527()  throws Throwable  {
      double double0 = FastMath.sin(1207.6747548);
      assertEquals(0.9644028533816577, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2528()  throws Throwable  {
      double double0 = FastMath.sin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2529()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2530()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2531()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2532()  throws Throwable  {
      double double0 = FastMath.tan(1.545539007875769E25);
      assertEquals((-0.9918388181054582), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2533()  throws Throwable  {
      double double0 = FastMath.sin(8388585.5F);
      assertEquals((-0.8167962542503513), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2534()  throws Throwable  {
      double double0 = FastMath.tan((-996777548));
      assertEquals(0.4920863732090681, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2535()  throws Throwable  {
      double double0 = FastMath.tan(8388586.0F);
      assertEquals((-0.49027310569354005), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2536()  throws Throwable  {
      double double0 = FastMath.sin(4.5035996273704785E15);
      assertEquals((-0.2818622308043012), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2537()  throws Throwable  {
      double double0 = FastMath.sin((-1.8921091400297595E93));
      assertEquals(0.550404181547776, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2538()  throws Throwable  {
      double double0 = FastMath.cos(7.822836349260156E273);
      assertEquals(0.2592012925922073, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2539()  throws Throwable  {
      double double0 = FastMath.cos((-1.7976931348623157E308));
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2540()  throws Throwable  {
      double double0 = FastMath.sin((-3.4028235E38F));
      assertEquals(0.5218765233336585, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2541()  throws Throwable  {
      double double0 = FastMath.tan((-6.824454861992054E-31));
      assertEquals((-6.824454861992054E-31), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2542()  throws Throwable  {
      double double0 = FastMath.tan((-1567.898673));
      assertEquals((-0.24889549450848153), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2543()  throws Throwable  {
      double double0 = FastMath.sin((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2544()  throws Throwable  {
      double double0 = FastMath.pow((double) 7, 7);
      assertEquals(823543.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2545()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2546()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2547()  throws Throwable  {
      double double0 = FastMath.pow(7.041717574102565E228, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2548()  throws Throwable  {
      double double0 = FastMath.pow((-1938.0), (-1938.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2549()  throws Throwable  {
      double double0 = FastMath.pow((-1300.05), (-1300.05));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2550()  throws Throwable  {
      double double0 = FastMath.pow((-2.356194490192345), (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2551()  throws Throwable  {
      double double0 = FastMath.pow((-1583.847891), 3.0250770246136387E36);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2552()  throws Throwable  {
      double double0 = FastMath.pow((-0.12502530217170715), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2553()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2554()  throws Throwable  {
      double double0 = FastMath.pow((-3962.065674054198), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2555()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-1938.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2556()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2557()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 3.141592653589793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2558()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2559()  throws Throwable  {
      double double0 = FastMath.pow((-0.21744394820931004), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2560()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2561()  throws Throwable  {
      double double0 = FastMath.pow(5630.770546165162, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2562()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-2082.937011986217));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2563()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2564()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2565()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2566()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-3378.862238234693));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2567()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, (double) 1.4E-45F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2568()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1170.85162821);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2569()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2570()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2571()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2572()  throws Throwable  {
      double double0 = FastMath.log1p((-12.50972507855811));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2573()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2574()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2575()  throws Throwable  {
      double double0 = FastMath.log(3.141592653589793, 0.999999994489385);
      assertEquals((-4.813899809594021E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2576()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2577()  throws Throwable  {
      double double0 = FastMath.log1p(0.04168701738764507);
      assertEquals(0.04084153102155571, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2578()  throws Throwable  {
      double double0 = FastMath.pow(0.9808930158615112, (-1.15945645153806E-8));
      assertEquals(1.000000000223681, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2579()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (double) 1189);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2580()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2581()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2582()  throws Throwable  {
      double double0 = FastMath.expm1((-6.764191876212205E-9));
      assertEquals((-6.764191853335059E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2583()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2584()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2585()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.4E-45F, (double) 1.4E-45F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2586()  throws Throwable  {
      double double0 = FastMath.expm1(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2587()  throws Throwable  {
      double double0 = FastMath.exp((-711.7178004039454));
      assertEquals(8.0331636099146E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2588()  throws Throwable  {
      double double0 = FastMath.expm1((-4115.89602546548));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2589()  throws Throwable  {
      double double0 = FastMath.exp((-2089.6012299725));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2590()  throws Throwable  {
      float float0 = FastMath.signum(2713.7788F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2591()  throws Throwable  {
      float float0 = FastMath.signum((-759.3803F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2592()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2593()  throws Throwable  {
      double double0 = FastMath.signum((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2594()  throws Throwable  {
      double double0 = FastMath.signum((-965.2667054688));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2595()  throws Throwable  {
      double double0 = FastMath.signum(1840.9648893);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2596()  throws Throwable  {
      double double0 = FastMath.atanh(0.09850110113620758);
      assertEquals(0.09882153651514411, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2597()  throws Throwable  {
      double double0 = FastMath.atanh(0.0326052050731504);
      assertEquals(0.03261676663999721, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2598()  throws Throwable  {
      double double0 = FastMath.asinh(0.09850110113620758);
      assertEquals(0.0983425086513881, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2599()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2600()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2601()  throws Throwable  {
      double double0 = FastMath.tanh((-6.824454861992054E-31));
      assertEquals((-6.824454861992054E-31), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2602()  throws Throwable  {
      double double0 = FastMath.tanh(2160.513);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2603()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2604()  throws Throwable  {
      double double0 = FastMath.tanh((-2935.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2605()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2606()  throws Throwable  {
      double double0 = FastMath.sinh((-139.35594954364));
      assertEquals((-1.6614600823186426E60), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2607()  throws Throwable  {
      double double0 = FastMath.sinh((-947.800942));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2608()  throws Throwable  {
      double double0 = FastMath.sinh(613.403);
      assertEquals(1.2488436997792655E266, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2609()  throws Throwable  {
      double double0 = FastMath.sinh(1920.5014572061);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2610()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2611()  throws Throwable  {
      double double0 = FastMath.sinh((-5.7618793749770706E-8));
      assertEquals((-5.761879374977074E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2612()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2613()  throws Throwable  {
      double double0 = FastMath.cosh((-373.8));
      assertEquals(1.0920621115398364E162, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2614()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2615()  throws Throwable  {
      double double0 = FastMath.cosh(299.031502539);
      assertEquals(3.687240558626534E129, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2616()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2617()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2618()  throws Throwable  {
      double double0 = FastMath.hypot((-1.7976931348623157E308), (-711.72));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2619()  throws Throwable  {
      int int0 = FastMath.getExponent((float) (-3523));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_2620()  throws Throwable  {
      String[] stringArray0 = new String[5];
      FastMath.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_2621()  throws Throwable  {
      double double0 = FastMath.cosh(1188.95441);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2622()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1469.0, 1469.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2623()  throws Throwable  {
      double double0 = FastMath.atan((-1.5483926773679628E93));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2624()  throws Throwable  {
      float float0 = FastMath.nextUp((-1190.95F));
      assertEquals((-1190.9498F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2625()  throws Throwable  {
      double double0 = FastMath.acosh(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2626()  throws Throwable  {
      double double0 = FastMath.acos((-6.824454861992054E-31));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2627()  throws Throwable  {
      double double0 = FastMath.expm1((-1));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2628()  throws Throwable  {
      int int0 = FastMath.round((float) 1361);
      assertEquals(1361, int0);
  }

  @Test(timeout = 4000)
  public void test_2629()  throws Throwable  {
      long long0 = FastMath.round((-4.8279217213630774E-67));
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_2630()  throws Throwable  {
      FastMath.getExponent((float) (-2012L));
  }

  @Test(timeout = 4000)
  public void test_2631()  throws Throwable  {
      FastMath.copySign((float) (-279), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_2632()  throws Throwable  {
      FastMath.copySign(0.0F, (-912.993F));
  }

  @Test(timeout = 4000)
  public void test_2633()  throws Throwable  {
      FastMath.copySign(2281.158F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_2634()  throws Throwable  {
      FastMath.copySign(Double.NEGATIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2635()  throws Throwable  {
      FastMath.hypot((-1.9948340196027965E-9), (-0.33333333333333287));
  }

  @Test(timeout = 4000)
  public void test_2636()  throws Throwable  {
      FastMath.hypot(244, (-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_2637()  throws Throwable  {
      FastMath.max((-980L), 4562L);
  }

  @Test(timeout = 4000)
  public void test_2638()  throws Throwable  {
      FastMath.max((-378), 995);
  }

  @Test(timeout = 4000)
  public void test_2639()  throws Throwable  {
      FastMath.min((-2271L), 4499201580859392L);
  }

  @Test(timeout = 4000)
  public void test_2640()  throws Throwable  {
      FastMath.rint(1.5874010519681994);
  }

  @Test(timeout = 4000)
  public void test_2641()  throws Throwable  {
      FastMath.rint(684.5);
  }

  @Test(timeout = 4000)
  public void test_2642()  throws Throwable  {
      FastMath.ceil((-577.9));
  }

  @Test(timeout = 4000)
  public void test_2643()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_2644()  throws Throwable  {
      FastMath.scalb((-183.1553F), 276);
  }

  @Test(timeout = 4000)
  public void test_2645()  throws Throwable  {
      FastMath.scalb((-1823.7267F), (-277));
  }

  @Test(timeout = 4000)
  public void test_2646()  throws Throwable  {
      FastMath.scalb(3.442100456607687E-215, 2097);
  }

  @Test(timeout = 4000)
  public void test_2647()  throws Throwable  {
      FastMath.scalb((-1890.412023), (-2098));
  }

  @Test(timeout = 4000)
  public void test_2648()  throws Throwable  {
      FastMath.scalb(9.676190774054103E-143, 1024);
  }

  @Test(timeout = 4000)
  public void test_2649()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2650()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2651()  throws Throwable  {
      FastMath.toRadians((-1.0));
  }

  @Test(timeout = 4000)
  public void test_2652()  throws Throwable  {
      FastMath.asin(9.676190774054103E-143);
  }

  @Test(timeout = 4000)
  public void test_2653()  throws Throwable  {
      FastMath.atan2(0.0, 0.40155118703842163);
  }

  @Test(timeout = 4000)
  public void test_2654()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_2655()  throws Throwable  {
      FastMath.tan((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_2656()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2657()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_2658()  throws Throwable  {
      FastMath.cos(3.99168E7);
  }

  @Test(timeout = 4000)
  public void test_2659()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2660()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_2661()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2662()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2663()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_2664()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_2665()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_2666()  throws Throwable  {
      FastMath.expm1((-1));
  }

  @Test(timeout = 4000)
  public void test_2667()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2668()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2669()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_2670()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_2671()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_2672()  throws Throwable  {
      FastMath.tanh((-0.5F));
  }

  @Test(timeout = 4000)
  public void test_2673()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2674()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2675()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_2676()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2677()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2678()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2679()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2680()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2681()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2682()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2683()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2684()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2685()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_2686()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_2687()  throws Throwable  {
      FastMath.toDegrees((-1584.3));
  }

  @Test(timeout = 4000)
  public void test_2688()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_2689()  throws Throwable  {
      FastMath.sqrt(4.5012079983352374E-164);
  }

  @Test(timeout = 4000)
  public void test_2690()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2691()  throws Throwable  {
      FastMath.round((-824.23F));
  }

  @Test(timeout = 4000)
  public void test_2692()  throws Throwable  {
      FastMath.round(0.16074948069399397);
  }

  @Test(timeout = 4000)
  public void test_2693()  throws Throwable  {
      FastMath.round(1083.5573);
  }

  @Test(timeout = 4000)
  public void test_2694()  throws Throwable  {
      FastMath.pow((-6.764191876212205E-9), (-1));
  }

  @Test(timeout = 4000)
  public void test_2695()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_2696()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2697()  throws Throwable  {
      FastMath.min((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_2698()  throws Throwable  {
      FastMath.min(8088464930757410816L, 8088464930757410816L);
  }

  @Test(timeout = 4000)
  public void test_2699()  throws Throwable  {
      FastMath.min(0, 691);
  }

  @Test(timeout = 4000)
  public void test_2700()  throws Throwable  {
      FastMath.min(11.0F, (-82.137F));
  }

  @Test(timeout = 4000)
  public void test_2701()  throws Throwable  {
      FastMath.min(123.9504175, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2702()  throws Throwable  {
      FastMath.min((double) (-2146712996), (double) (-2146712996));
  }

  @Test(timeout = 4000)
  public void test_2703()  throws Throwable  {
      FastMath.max((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_2704()  throws Throwable  {
      FastMath.max((-3652), (-3652));
  }

  @Test(timeout = 4000)
  public void test_2705()  throws Throwable  {
      FastMath.max(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2706()  throws Throwable  {
      FastMath.max((-2733.943589062544), (-925.806426469));
  }

  @Test(timeout = 4000)
  public void test_2707()  throws Throwable  {
      FastMath.log10(1.0F);
  }

  @Test(timeout = 4000)
  public void test_2708()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_2709()  throws Throwable  {
      FastMath.log(0.0, 1.9803689272433392E-303);
  }

  @Test(timeout = 4000)
  public void test_2710()  throws Throwable  {
      FastMath.log(0.7675435543060303, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2711()  throws Throwable  {
      FastMath.log(3294198.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2712()  throws Throwable  {
      FastMath.log(8.0E298);
  }

  @Test(timeout = 4000)
  public void test_2713()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_2714()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2715()  throws Throwable  {
      FastMath.getExponent(1.4635417461395264);
  }

  @Test(timeout = 4000)
  public void test_2716()  throws Throwable  {
      FastMath.getExponent((-542.0));
  }

  @Test(timeout = 4000)
  public void test_2717()  throws Throwable  {
      FastMath.copySign(0.0F, 155.903F);
  }

  @Test(timeout = 4000)
  public void test_2718()  throws Throwable  {
      FastMath.copySign(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2719()  throws Throwable  {
      FastMath.ceil(Double.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2720()  throws Throwable  {
      FastMath.cbrt((-272));
  }

  @Test(timeout = 4000)
  public void test_2721()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2722()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_2723()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2724()  throws Throwable  {
      FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test_2725()  throws Throwable  {
      FastMath.acosh(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2726()  throws Throwable  {
      FastMath.acosh((-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_2727()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_2728()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_2729()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_2730()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2731()  throws Throwable  {
      FastMath.IEEEremainder((-174.3782620627611), 0.25916901412161647);
  }

  @Test(timeout = 4000)
  public void test_2732()  throws Throwable  {
      FastMath.IEEEremainder(1866.758269, (-2684));
  }

  @Test(timeout = 4000)
  public void test_2733()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(2742.83934, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2734()  throws Throwable  {
      double double0 = FastMath.copySign(1.037806510925293, 1.037806510925293);
      assertEquals(1.037806510925293, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2735()  throws Throwable  {
      double double0 = FastMath.copySign(22.93468988235943, (double) (-127));
      assertEquals((-22.93468988235943), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2736()  throws Throwable  {
      double double0 = FastMath.floor(0.45375161885351556);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2737()  throws Throwable  {
      double double0 = FastMath.floor(1651.0548564);
      assertEquals(1651.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2738()  throws Throwable  {
      double double0 = FastMath.floor((-829.0388945911997));
      assertEquals((-830.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2739()  throws Throwable  {
      double double0 = FastMath.floor(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2740()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2741()  throws Throwable  {
      float float0 = FastMath.nextAfter((-4.8828125E-4F), (-0.12502530217170715));
      assertEquals((-4.882813E-4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2742()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0, 709.782712893384);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2743()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-128.4176779416));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2744()  throws Throwable  {
      double double0 = FastMath.nextAfter(649.809113566442, 1426.608801);
      assertEquals(649.8091135664421, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2745()  throws Throwable  {
      double double0 = FastMath.nextAfter((-4.9E-324), (-4899.5662405484945));
      assertEquals((-1.0E-323), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2746()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 1.5707963267948966);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2747()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 3294198.0);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2748()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 642.215178);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2749()  throws Throwable  {
      double double0 = FastMath.scalb(-0.0, (-2841));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2750()  throws Throwable  {
      double double0 = FastMath.scalb((double) -0.0F, 746);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2751()  throws Throwable  {
      double double0 = FastMath.abs((-1712.6084010371));
      assertEquals(1712.6084010371, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2752()  throws Throwable  {
      double double0 = FastMath.abs(96.01093011708666);
      assertEquals(96.01093011708666, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2753()  throws Throwable  {
      float float0 = FastMath.abs((-1635.0F));
      assertEquals(1635.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2754()  throws Throwable  {
      double double0 = FastMath.pow(1.5737963312949148, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2755()  throws Throwable  {
      int int0 = FastMath.getExponent(2.2950686306677644E-244);
      assertEquals((-810), int0);
  }

  @Test(timeout = 4000)
  public void test_2756()  throws Throwable  {
      float float0 = FastMath.copySign((-675.3007F), 1599.2F);
      assertEquals(675.3007F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2757()  throws Throwable  {
      float float0 = FastMath.copySign(2.74877907E11F, (float) (-1));
      assertEquals((-2.74877907E11F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2758()  throws Throwable  {
      float float0 = FastMath.copySign((-2.14748301E9F), (-2.14748301E9F));
      assertEquals((-2.14748301E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2759()  throws Throwable  {
      double double0 = FastMath.copySign((-1.1587600174449919E-8), (-1.1587600174449919E-8));
      assertEquals((-1.1587600174449919E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2760()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-824.23F), (double) 3.4028235E38F);
      assertEquals(824.22998046875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2761()  throws Throwable  {
      double double0 = FastMath.hypot(281.4434, (-1.0E-6));
      assertEquals(281.4434, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2762()  throws Throwable  {
      double double0 = FastMath.hypot((-2033.3021936961597), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2763()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 2059.3);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2764()  throws Throwable  {
      double double0 = FastMath.hypot((-0.010714690733195933), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2765()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2766()  throws Throwable  {
      double double0 = FastMath.max(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2767()  throws Throwable  {
      double double0 = FastMath.max((-1.0), 3.141592653589793);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2768()  throws Throwable  {
      double double0 = FastMath.max((double) 1265, (-0.48726664796171143));
      assertEquals(1265.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2769()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2770()  throws Throwable  {
      float float0 = FastMath.max(3027.0F, 3027.0F);
      assertEquals(3027.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2771()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2772()  throws Throwable  {
      float float0 = FastMath.max(1.4E-45F, -0.0F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2773()  throws Throwable  {
      float float0 = FastMath.max((-1381.0F), (-837.52F));
      assertEquals((-837.52F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2774()  throws Throwable  {
      long long0 = FastMath.max((-1960L), (-1960L));
      assertEquals((-1960L), long0);
  }

  @Test(timeout = 4000)
  public void test_2775()  throws Throwable  {
      long long0 = FastMath.max(3517L, 1023L);
      assertEquals(3517L, long0);
  }

  @Test(timeout = 4000)
  public void test_2776()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2777()  throws Throwable  {
      int int0 = FastMath.max(32, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test_2778()  throws Throwable  {
      double double0 = FastMath.min(1.5707963267948966, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2779()  throws Throwable  {
      double double0 = FastMath.min(761.40635857, (double) Float.POSITIVE_INFINITY);
      assertEquals(761.40635857, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2780()  throws Throwable  {
      float float0 = FastMath.min(0.5F, 0.5F);
      assertEquals(0.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2781()  throws Throwable  {
      float float0 = FastMath.min(1.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2782()  throws Throwable  {
      float float0 = FastMath.min(1317.9F, 1783.0F);
      assertEquals(1317.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2783()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2784()  throws Throwable  {
      long long0 = FastMath.min(302L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test_2785()  throws Throwable  {
      int int0 = FastMath.min(1138, 1138);
      assertEquals(1138, int0);
  }

  @Test(timeout = 4000)
  public void test_2786()  throws Throwable  {
      int int0 = FastMath.min(15, (-2366));
      assertEquals((-2366), int0);
  }

  @Test(timeout = 4000)
  public void test_2787()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2788()  throws Throwable  {
      double double0 = FastMath.rint((-0.2526123165686223));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2789()  throws Throwable  {
      double double0 = FastMath.rint((-1357.218270471161));
      assertEquals((-1357.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2790()  throws Throwable  {
      double double0 = FastMath.ceil(1.4410819537791792);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2791()  throws Throwable  {
      double double0 = FastMath.ceil((-2.756054703800197E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2792()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2793()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2794()  throws Throwable  {
      double double0 = FastMath.floor((-550.0));
      assertEquals((-550.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2795()  throws Throwable  {
      double double0 = FastMath.rint(8.0E298);
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2796()  throws Throwable  {
      float float0 = FastMath.nextUp(1.0F);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2797()  throws Throwable  {
      float float0 = FastMath.nextAfter(2640.26F, (-2942.875339071107));
      assertEquals(2640.2598F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2798()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2799()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3546.0469F), 5597.0547213);
      assertEquals((-3546.0466F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2800()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 2.718281828459045);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2801()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2802()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2803()  throws Throwable  {
      float float0 = FastMath.nextAfter(1149.106F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2804()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-3585.731367));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2805()  throws Throwable  {
      double double0 = FastMath.nextUp((double) 1L);
      assertEquals(1.0000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2806()  throws Throwable  {
      double double0 = FastMath.nextAfter(3294247.137446306, 0.0);
      assertEquals(3294247.1374463057, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2807()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-1761.7145674680557));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2808()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-78.0));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2809()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2810()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.141592653589793, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2811()  throws Throwable  {
      float float0 = FastMath.scalb((float) 244, 244);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2812()  throws Throwable  {
      float float0 = FastMath.scalb(0.60425764F, 128);
      assertEquals(2.0561822E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2813()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 244);
      assertEquals(3.9614081E28F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2814()  throws Throwable  {
      float float0 = FastMath.scalb(289.2505F, (-272));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2815()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2816()  throws Throwable  {
      float float0 = FastMath.scalb(977.3F, (-156));
      assertEquals(1.1E-44F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2817()  throws Throwable  {
      float float0 = FastMath.scalb((float) 801, 801);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2818()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2147482995), 795);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2819()  throws Throwable  {
      float float0 = FastMath.scalb(3445.5F, (-1635));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2820()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2147482995), (-2147482995));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2821()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-2147482995));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2822()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 244);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2823()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1790);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2824()  throws Throwable  {
      float float0 = FastMath.scalb((-601.1483F), 12);
      assertEquals((-2462303.5F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2825()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2826()  throws Throwable  {
      double double0 = FastMath.scalb((-2942.875339071107), 2058);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2827()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2144876400, (-1949));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2828()  throws Throwable  {
      double double0 = FastMath.scalb(0.1256551444530487, (-1023));
      assertEquals(1.397959885547124E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2829()  throws Throwable  {
      double double0 = FastMath.scalb(30380.0170914799, (-1023));
      assertEquals(3.379889092562695E-304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2830()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2099, 2099);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2831()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-4211));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2832()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-4097), (-4097));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2833()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2834()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, 1731);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2835()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1172);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2836()  throws Throwable  {
      double double0 = FastMath.scalb((-3067.47359), Integer.MAX_VALUE);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2837()  throws Throwable  {
      double double0 = FastMath.scalb((-4621.366043105329), (-1048));
      assertEquals((-1.53226863937E-312), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2838()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2839()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2840()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2841()  throws Throwable  {
      double double0 = FastMath.ulp((-549.4));
      assertEquals(1.1368683772161603E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2842()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2843()  throws Throwable  {
      float float0 = FastMath.ulp((-2.14748301E9F));
      assertEquals(128.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2844()  throws Throwable  {
      float float0 = FastMath.abs(1563.0F);
      assertEquals(1563.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2845()  throws Throwable  {
      long long0 = FastMath.abs((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_2846()  throws Throwable  {
      long long0 = FastMath.abs(9154082963658192752L);
      assertEquals(9154082963658192752L, long0);
  }

  @Test(timeout = 4000)
  public void test_2847()  throws Throwable  {
      int int0 = FastMath.abs((-2120484859));
      assertEquals(2120484859, int0);
  }

  @Test(timeout = 4000)
  public void test_2848()  throws Throwable  {
      int int0 = FastMath.abs(162);
      assertEquals(162, int0);
  }

  @Test(timeout = 4000)
  public void test_2849()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2850()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2851()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2852()  throws Throwable  {
      double double0 = FastMath.toRadians(2.718281828459045);
      assertEquals(0.047442967903742035, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2853()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2854()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2855()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2856()  throws Throwable  {
      double double0 = FastMath.cbrt(5.467348342354227E-309);
      assertEquals(1.7616741497715416E-103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2857()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2858()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2859()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2860()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2861()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2862()  throws Throwable  {
      double double0 = FastMath.acos((-41.52538896274274));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2863()  throws Throwable  {
      double double0 = FastMath.acos(1479);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2864()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2865()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2866()  throws Throwable  {
      double double0 = FastMath.asin((-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2867()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2868()  throws Throwable  {
      double double0 = FastMath.asin((-1148.0796));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2869()  throws Throwable  {
      double double0 = FastMath.asin(148.96133);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2870()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2871()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2872()  throws Throwable  {
      double double0 = FastMath.atan2(2199.893076, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2873()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), (-0.017453292519943295));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2874()  throws Throwable  {
      double double0 = FastMath.atan2(2.718281828459045, -0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2875()  throws Throwable  {
      double double0 = FastMath.atan2((-646.8), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2876()  throws Throwable  {
      double double0 = FastMath.atan2(2491.74, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2877()  throws Throwable  {
      double double0 = FastMath.atan2((-1628), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2878()  throws Throwable  {
      double double0 = FastMath.atan2(2479.516727536, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2879()  throws Throwable  {
      double double0 = FastMath.atan2((-1412.6950593306), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2880()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2881()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2882()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 0.167);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2883()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2884()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2885()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-5.207000323380292E-8));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2886()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-216.757028575765));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2887()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2888()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2889()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2890()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 837.6239174709619);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2891()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2892()  throws Throwable  {
      double double0 = FastMath.atan(Double.NEGATIVE_INFINITY);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2893()  throws Throwable  {
      double double0 = FastMath.atan2((-1.4E-45F), (-1.7976931348623157E308));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2894()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 1308.160749480694);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2895()  throws Throwable  {
      double double0 = FastMath.tan((-8.663710700190489E-10));
      assertEquals((-8.663710700190489E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2896()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2897()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2898()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2899()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2900()  throws Throwable  {
      double double0 = FastMath.cos((-2942.875339071107));
      assertEquals((-0.6988718450794067), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2901()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2902()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2903()  throws Throwable  {
      double double0 = FastMath.sin((-344.6));
      assertEquals(0.8278095582018402, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2904()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2905()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2906()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2907()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2908()  throws Throwable  {
      double double0 = FastMath.sin((-2841.38812));
      assertEquals((-0.9834048082945143), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2909()  throws Throwable  {
      double double0 = FastMath.tan((-8.0E298));
      assertEquals(0.04237639320697582, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2910()  throws Throwable  {
      double double0 = FastMath.tan(8088464930757410816L);
      assertEquals((-0.5926124681570917), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2911()  throws Throwable  {
      double double0 = FastMath.cos(3.1962472803616787E178);
      assertEquals(0.9854826904602326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2912()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2913()  throws Throwable  {
      double double0 = FastMath.cos(9.320900373401115E275);
      assertEquals(0.2999918308303658, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2914()  throws Throwable  {
      double double0 = FastMath.cos(9.34513766335033E9);
      assertEquals(0.9997511880329797, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2915()  throws Throwable  {
      double double0 = FastMath.tan(3.4028235E38F);
      assertEquals((-0.6117979498342481), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2916()  throws Throwable  {
      double double0 = FastMath.tan((-1.7976931348623157E308));
      assertEquals(0.004962015874444895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2917()  throws Throwable  {
      double double0 = FastMath.tan(1.474522484905093E189);
      assertEquals((-8.896150501759468), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2918()  throws Throwable  {
      double double0 = FastMath.tan((-3.141592653589793));
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2919()  throws Throwable  {
      double double0 = FastMath.sin(1.0);
      assertEquals(0.8414709848078965, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2920()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1635), (-1635));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2921()  throws Throwable  {
      double double0 = FastMath.pow((-2392.089050046413), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2922()  throws Throwable  {
      double double0 = FastMath.pow((-2942.875339071107), 1172);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2923()  throws Throwable  {
      double double0 = FastMath.pow((-1.7976931348623157E308), (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2924()  throws Throwable  {
      double double0 = FastMath.pow(2.2250738585072014E-308, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2925()  throws Throwable  {
      double double0 = FastMath.pow((-3335.22163347964), (-3335.22163347964));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2926()  throws Throwable  {
      double double0 = FastMath.pow((-4.6694407626686244E235), (-4.6694407626686244E235));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2927()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), 4.503599627370496E15);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2928()  throws Throwable  {
      double double0 = FastMath.pow(0.3333333134651184, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2929()  throws Throwable  {
      double double0 = FastMath.pow(372.512846527, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2930()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 2144876400);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2931()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2099.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2932()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2933()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2934()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2935()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.3152879990698739E-17);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2936()  throws Throwable  {
      double double0 = FastMath.pow(0.6366197723675815, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2937()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2938()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2939()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2940()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2941()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 4.503599627370496E15);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2942()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 1193046471);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2943()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1584));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2944()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-1889.72147489));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2945()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 3.141592653589793);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2946()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2947()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-846.7920017661619));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2948()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2949()  throws Throwable  {
      double double0 = FastMath.log10(553.23431943018);
      assertEquals(2.742909113369374, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2950()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2951()  throws Throwable  {
      double double0 = FastMath.log1p(1.505582332611084);
      assertEquals(0.9185211756285215, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2952()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2953()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2954()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2955()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2956()  throws Throwable  {
      double double0 = FastMath.pow(0.5450438937867097, 0.5450438937867097);
      assertEquals(0.7183623901622327, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2957()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324);
      assertEquals((-744.4400719213812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2958()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2959()  throws Throwable  {
      double double0 = FastMath.log1p((-127));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2960()  throws Throwable  {
      double double0 = FastMath.expm1((-3.9986783938944604E-8));
      assertEquals((-3.998678313947317E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2961()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2962()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2963()  throws Throwable  {
      double double0 = FastMath.pow((-118.0), (-118.0));
      assertEquals(3.295513824922103E-245, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2964()  throws Throwable  {
      double double0 = FastMath.expm1(1099.991);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2965()  throws Throwable  {
      double double0 = FastMath.exp((-709.8));
      assertEquals(5.467348342354227E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2966()  throws Throwable  {
      double double0 = FastMath.exp((-745.0));
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2967()  throws Throwable  {
      double double0 = FastMath.expm1((-723.2652623027159));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2968()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2969()  throws Throwable  {
      double double0 = FastMath.exp((-1187.42));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2970()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2971()  throws Throwable  {
      float float0 = FastMath.signum((float) (-972));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2972()  throws Throwable  {
      float float0 = FastMath.signum(2279.7913F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2973()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2974()  throws Throwable  {
      double double0 = FastMath.signum(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2975()  throws Throwable  {
      double double0 = FastMath.signum(9.676190774054103E-143);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2976()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2977()  throws Throwable  {
      double double0 = FastMath.atanh((-0.05417713522911072));
      assertEquals((-0.05423023499691139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2978()  throws Throwable  {
      double double0 = FastMath.atanh(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2979()  throws Throwable  {
      double double0 = FastMath.asinh(0.008336750013465571);
      assertEquals(0.008336653447185054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2980()  throws Throwable  {
      double double0 = FastMath.asinh(0.09090909090909091);
      assertEquals(0.09078433518852215, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2981()  throws Throwable  {
      double double0 = FastMath.asinh((-0.1));
      assertEquals((-0.09983407889920758), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2982()  throws Throwable  {
      double double0 = FastMath.asinh(0.5925495624542236);
      assertEquals(0.5624257106817877, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2983()  throws Throwable  {
      double double0 = FastMath.tanh((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2984()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2985()  throws Throwable  {
      double double0 = FastMath.tanh(2618.4);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2986()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2987()  throws Throwable  {
      double double0 = FastMath.tanh((-1662.6272F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2988()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2989()  throws Throwable  {
      double double0 = FastMath.sinh((-374.089108));
      assertEquals((-1.4581605649935441E162), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2990()  throws Throwable  {
      double double0 = FastMath.sinh((-3.25185684131607E8));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2991()  throws Throwable  {
      double double0 = FastMath.sinh(359.0699);
      assertEquals(4.375686428140109E155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2992()  throws Throwable  {
      double double0 = FastMath.sinh(1602.6181820385682);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2993()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2994()  throws Throwable  {
      double double0 = FastMath.sinh((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2995()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2996()  throws Throwable  {
      double double0 = FastMath.cosh(445.5808413911166);
      assertEquals(1.6303117638672566E193, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2997()  throws Throwable  {
      double double0 = FastMath.cosh(1375.849514169758);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2998()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2999()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3000()  throws Throwable  {
      double double0 = FastMath.hypot((-1.0E-6), 1.8396930096213817E290);
      assertEquals(1.8396930096213817E290, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3001()  throws Throwable  {
      double double0 = FastMath.log(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3002()  throws Throwable  {
      String[] stringArray0 = new String[7];
      FastMath.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_3003()  throws Throwable  {
      double double0 = FastMath.cosh((-537.99815));
      assertEquals(2.2315047904559707E233, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3004()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(2.761628769925529E-8, 2.761628769925529E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3005()  throws Throwable  {
      double double0 = FastMath.atan(7.848361555046424E-8);
      assertEquals(7.848361555046408E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3006()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3007()  throws Throwable  {
      double double0 = FastMath.acos((-2.7205933594338066E-17));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3008()  throws Throwable  {
      int int0 = FastMath.round(1378.6F);
      assertEquals(1379, int0);
  }

  @Test(timeout = 4000)
  public void test_3009()  throws Throwable  {
      long long0 = FastMath.round((double) (-933.0F));
      assertEquals((-933L), long0);
  }

  @Test(timeout = 4000)
  public void test_3010()  throws Throwable  {
      double double0 = FastMath.cos((-1217.131));
      assertEquals((-0.2339643981885371), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_3011()  throws Throwable  {
      int int0 = FastMath.getExponent((-415.62F));
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test_3012()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), 0.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3013()  throws Throwable  {
      float float0 = FastMath.copySign((float) 0L, (-965.51F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3014()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NEGATIVE_INFINITY, 0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3015()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, (-2263.45));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3016()  throws Throwable  {
      double double0 = FastMath.hypot(1.5707963267948966, 1.2549416560182509E-8);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3017()  throws Throwable  {
      int int0 = FastMath.max((-1694), 338);
      assertEquals(338, int0);
  }

  @Test(timeout = 4000)
  public void test_3018()  throws Throwable  {
      int int0 = FastMath.min((-2324), 0);
      assertEquals((-2324), int0);
  }

  @Test(timeout = 4000)
  public void test_3019()  throws Throwable  {
      double double0 = FastMath.rint((-2295.3));
      assertEquals((-2295.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3020()  throws Throwable  {
      double double0 = FastMath.rint(1.5);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3021()  throws Throwable  {
      double double0 = FastMath.ceil(0.9166666666666666);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3022()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3023()  throws Throwable  {
      double double0 = FastMath.rint((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3024()  throws Throwable  {
      int int0 = FastMath.round((float) 4503599627370496L);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_3025()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3026()  throws Throwable  {
      float float0 = FastMath.scalb(66.1772F, 128);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3027()  throws Throwable  {
      double double0 = FastMath.scalb((-1.5707963267948966), (-1023));
      assertEquals((-1.7475689218952297E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3028()  throws Throwable  {
      double double0 = FastMath.scalb(0.04168701738764507, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3029()  throws Throwable  {
      double double0 = FastMath.scalb(259.030713626, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3030()  throws Throwable  {
      float float0 = FastMath.ulp(917.0275F);
      assertEquals(6.1035156E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3031()  throws Throwable  {
      double double0 = FastMath.ulp(108.37253157227);
      assertEquals(1.4210854715202004E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3032()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3033()  throws Throwable  {
      float float0 = FastMath.abs(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3034()  throws Throwable  {
      double double0 = FastMath.toDegrees(1446.6958236977507);
      assertEquals(82889.56493708334, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3035()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3036()  throws Throwable  {
      double double0 = FastMath.asin(0.167);
      assertEquals(0.1677861505874786, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3037()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, 2.2250738585072014E-308);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3038()  throws Throwable  {
      double double0 = FastMath.atan2(1.633123935319537E16, (-1.0));
      assertEquals(1.5707963267948968, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3039()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0);
      assertEquals((-0.7734333808731876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3040()  throws Throwable  {
      double double0 = FastMath.cos(1.5707963267948966);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3041()  throws Throwable  {
      double double0 = FastMath.cos(3294198.0);
      assertEquals(0.7910146852024715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3042()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3043()  throws Throwable  {
      double double0 = FastMath.sin(3294198.0);
      assertEquals((-0.6117971622964877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3044()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0E-6));
      assertEquals((-1.0000005000003334E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3045()  throws Throwable  {
      double double0 = FastMath.log1p(1.0E-6);
      assertEquals(9.999995000003334E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3046()  throws Throwable  {
      double double0 = FastMath.expm1(1.0);
      assertEquals(1.7182818284590453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3047()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0F));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3048()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3049()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3050()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3051()  throws Throwable  {
      double double0 = FastMath.tanh(0.5);
      assertEquals(0.46211715726000974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3052()  throws Throwable  {
      double double0 = FastMath.tanh((-20.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3053()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3054()  throws Throwable  {
      double double0 = FastMath.sinh(0.25);
      assertEquals(0.2526123168081683, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3055()  throws Throwable  {
      double double0 = FastMath.sinh((-709.782712893384));
      assertEquals((-8.988465674311366E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3056()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3057()  throws Throwable  {
      double double0 = FastMath.sinh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3058()  throws Throwable  {
      double double0 = FastMath.cosh((-20.0));
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3059()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3060()  throws Throwable  {
      double double0 = FastMath.cosh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3061()  throws Throwable  {
      double double0 = FastMath.toRadians(2.2250738585072014E-308);
      assertEquals(3.8834864931005E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3062()  throws Throwable  {
      double double0 = FastMath.atan2((-5.7618793749770706E-8), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3063()  throws Throwable  {
      double double0 = FastMath.sqrt(2106.580805145874);
      assertEquals(45.89750325612357, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3064()  throws Throwable  {
      int int0 = FastMath.round((-8.624F));
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test_3065()  throws Throwable  {
      long long0 = FastMath.round(0.0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3066()  throws Throwable  {
      long long0 = FastMath.round((-607.14));
      assertEquals((-607L), long0);
  }

  @Test(timeout = 4000)
  public void test_3067()  throws Throwable  {
      double double0 = FastMath.pow(1.986821492305628E-8, 1488730379);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3068()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-381));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3069()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3070()  throws Throwable  {
      double double0 = FastMath.nextUp((double) (-1023));
      assertEquals((-1022.9999999999999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3071()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, (double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3072()  throws Throwable  {
      long long0 = FastMath.min(0L, (long) 13);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3073()  throws Throwable  {
      int int0 = FastMath.min(2228, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3074()  throws Throwable  {
      int int0 = FastMath.min(1874, 1874);
      assertEquals(1874, int0);
  }

  @Test(timeout = 4000)
  public void test_3075()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3076()  throws Throwable  {
      long long0 = FastMath.max((-3406L), (-3406L));
      assertEquals((-3406L), long0);
  }

  @Test(timeout = 4000)
  public void test_3077()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3078()  throws Throwable  {
      double double0 = FastMath.max((-2359.256697), (double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3079()  throws Throwable  {
      double double0 = FastMath.max((-4595.09284486236), (-1.1422067932698783E222));
      assertEquals((-4595.09284486236), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3080()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3081()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3082()  throws Throwable  {
      double double0 = FastMath.log(-0.0, 2600.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3083()  throws Throwable  {
      double double0 = FastMath.log(19246.30154221925, 1077.1708094384626);
      assertEquals(0.7077588191440839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3084()  throws Throwable  {
      double double0 = FastMath.log(3.9794194213265515, 0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3085()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3086()  throws Throwable  {
      double double0 = FastMath.log(1.78482304E8);
      assertEquals(19.000000017014642, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3087()  throws Throwable  {
      int int0 = FastMath.getExponent(1.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3088()  throws Throwable  {
      int int0 = FastMath.getExponent((double) 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3089()  throws Throwable  {
      int int0 = FastMath.getExponent(9.219544613762692E-9);
      assertEquals((-27), int0);
  }

  @Test(timeout = 4000)
  public void test_3090()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3091()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3092()  throws Throwable  {
      double double0 = FastMath.atan(2631);
      assertEquals(1.5704162431948032, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3093()  throws Throwable  {
      double double0 = FastMath.atan((-9223372036854775808L));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3094()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3095()  throws Throwable  {
      double double0 = FastMath.acosh(3016.14562);
      assertEquals(8.704882163534416, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3096()  throws Throwable  {
      double double0 = FastMath.acosh((-6.348234638961959E11));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3097()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3098()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_3099()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3100()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_3101()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(2.5811242408799305E164, 2.5811242408799305E164);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3102()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(8.763380887467774, 1798.1);
      assertEquals(8.763380887467774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3103()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NaN, 3.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3104()  throws Throwable  {
      double double0 = FastMath.copySign((double) 2228.598F, (-4561.30868));
      assertEquals((-2228.597900390625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3105()  throws Throwable  {
      double double0 = FastMath.floor(2.893485277253286E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3106()  throws Throwable  {
      double double0 = FastMath.floor(1881.0);
      assertEquals(1881.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3107()  throws Throwable  {
      double double0 = FastMath.floor((-1524.358815));
      assertEquals((-1525.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3108()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3109()  throws Throwable  {
      double double0 = FastMath.floor(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3110()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3111()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.4E-45F), (-1.0));
      assertEquals((-2.8E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3112()  throws Throwable  {
      float float0 = FastMath.nextAfter((-294.436F), 3682.167);
      assertEquals((-294.43597F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3113()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 0.2528730743291269);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3114()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2308.5);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3115()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (double) -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3116()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-1356.081212042199));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3117()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.6931470632553101, 0.9166666666666666);
      assertEquals(0.6931470632553102, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3118()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) 1.4E-45F);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3119()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 1001.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3120()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-1216));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3121()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1215L), 0);
      assertEquals((-1215.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3122()  throws Throwable  {
      double double0 = FastMath.abs((-581.31));
      assertEquals(581.31, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3123()  throws Throwable  {
      int int0 = FastMath.getExponent(Double.NaN);
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test_3124()  throws Throwable  {
      double double0 = FastMath.sqrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3125()  throws Throwable  {
      double double0 = FastMath.cos((-3.141592653589793));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3126()  throws Throwable  {
      float float0 = FastMath.copySign((-89.61972F), (float) 945L);
      assertEquals(89.61972F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3127()  throws Throwable  {
      float float0 = FastMath.copySign(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3128()  throws Throwable  {
      float float0 = FastMath.copySign((float) Integer.MAX_VALUE, (float) Integer.MAX_VALUE);
      assertEquals(2.14748365E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3129()  throws Throwable  {
      float float0 = FastMath.copySign((-5291.0F), (-5291.0F));
      assertEquals((-5291.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3130()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-127), 1.2641184329986572);
      assertEquals(127.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3131()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-1097), (-0.3058015757857271));
      assertEquals((-1097.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3132()  throws Throwable  {
      double double0 = FastMath.hypot(1.7475689218952297E-308, (-1351.82587024));
      assertEquals(1351.82587024, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3133()  throws Throwable  {
      double double0 = FastMath.hypot(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3134()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3135()  throws Throwable  {
      double double0 = FastMath.hypot((-1.0F), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3136()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, (-709.782712893384));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3137()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3138()  throws Throwable  {
      double double0 = FastMath.max(181.8113925, 181.8113925);
      assertEquals(181.8113925, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3139()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3140()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3141()  throws Throwable  {
      float float0 = FastMath.max((-1897.0F), (-1897.0F));
      assertEquals((-1897.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3142()  throws Throwable  {
      float float0 = FastMath.max(586.2573F, 1.0F);
      assertEquals(586.2573F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3143()  throws Throwable  {
      float float0 = FastMath.max((-1369.5F), 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3144()  throws Throwable  {
      long long0 = FastMath.max(369L, 2928L);
      assertEquals(2928L, long0);
  }

  @Test(timeout = 4000)
  public void test_3145()  throws Throwable  {
      long long0 = FastMath.max(9223372036854775807L, (long) (-531));
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test_3146()  throws Throwable  {
      int int0 = FastMath.max((-1097), (-1097));
      assertEquals((-1097), int0);
  }

  @Test(timeout = 4000)
  public void test_3147()  throws Throwable  {
      int int0 = FastMath.max(34, (-3739));
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test_3148()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) 0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3149()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, 3543.962164392834);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3150()  throws Throwable  {
      double double0 = FastMath.min((double) 1230.5714F, (double) 1231);
      assertEquals(1230.5714111328125, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3151()  throws Throwable  {
      double double0 = FastMath.min(294.602121068, (-1877.313935853));
      assertEquals((-1877.313935853), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3152()  throws Throwable  {
      double double0 = FastMath.min(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3153()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3154()  throws Throwable  {
      float float0 = FastMath.min(2280.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3155()  throws Throwable  {
      float float0 = FastMath.min(1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3156()  throws Throwable  {
      float float0 = FastMath.min((float) 2330, 1382.8F);
      assertEquals(1382.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3157()  throws Throwable  {
      float float0 = FastMath.min((-3891.5134F), (-1.0F));
      assertEquals((-3891.5134F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3158()  throws Throwable  {
      long long0 = FastMath.min(4503599627370496L, 4503599627370496L);
      assertEquals(4503599627370496L, long0);
  }

  @Test(timeout = 4000)
  public void test_3159()  throws Throwable  {
      long long0 = FastMath.min(1073741824L, (-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_3160()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3161()  throws Throwable  {
      double double0 = FastMath.rint(0.008333333333333333);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3162()  throws Throwable  {
      double double0 = FastMath.rint((-5.7618793749770706E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3163()  throws Throwable  {
      double double0 = FastMath.rint(594.6712583904919);
      assertEquals(595.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3164()  throws Throwable  {
      double double0 = FastMath.ceil((-1.401298464324817E-45));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3165()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3166()  throws Throwable  {
      double double0 = FastMath.floor((-5291.0F));
      assertEquals((-5291.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3167()  throws Throwable  {
      double double0 = FastMath.ceil((-26.614026208756165));
      assertEquals((-26.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3168()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3169()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 269);
      assertEquals(269.00003F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3170()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, 0.031);
      assertEquals(0.99999994F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3171()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-1477.94161));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3172()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3173()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3174()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3136.7039F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3175()  throws Throwable  {
      double double0 = FastMath.nextUp(3172.741068333629);
      assertEquals(3172.7410683336293, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3176()  throws Throwable  {
      double double0 = FastMath.nextAfter(886.5258702933, (-1.0E-6));
      assertEquals(886.5258702932999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3177()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) -0.0F, (-897.699875494));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3178()  throws Throwable  {
      double double0 = FastMath.nextAfter((-0.05417713522911072), 6.570047690198998E269);
      assertEquals((-0.05417713522911071), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3179()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-3.43338934259355E-8));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3180()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-3.43338934259355E-8));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3181()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3182()  throws Throwable  {
      float float0 = FastMath.scalb((-1712.7579F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3183()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 276);
      assertEquals((-1.7014118E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3184()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-277), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3185()  throws Throwable  {
      float float0 = FastMath.scalb(1382.8F, (-261));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3186()  throws Throwable  {
      float float0 = FastMath.scalb((-1643.57F), (-153));
      assertEquals((-1.44E-43F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3187()  throws Throwable  {
      float float0 = FastMath.scalb((float) Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3188()  throws Throwable  {
      float float0 = FastMath.scalb((-1127.901F), (-127));
      assertEquals((-6.629206E-36F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3189()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-482));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3190()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-127));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3191()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-2098));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3192()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1326);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3193()  throws Throwable  {
      float float0 = FastMath.scalb(4384.439F, 2);
      assertEquals(17537.756F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3194()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 2631);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3195()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-754));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3196()  throws Throwable  {
      double double0 = FastMath.scalb(9.198855229106814E-8, 2097);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3197()  throws Throwable  {
      double double0 = FastMath.scalb(2.2250738585072014E-308, 1610);
      assertEquals(1.0130653244338362E177, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3198()  throws Throwable  {
      double double0 = FastMath.scalb(1.9699272335463627E-8, (-1023));
      assertEquals(2.1916168E-316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3199()  throws Throwable  {
      double double0 = FastMath.scalb((-508.361624997), (-1684));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3200()  throws Throwable  {
      double double0 = FastMath.scalb(257.9632054, (-1023));
      assertEquals(2.8699359239613186E-306, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3201()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2631, 2631);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3202()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1897.0F), 1319220989);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3203()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-5570), (-5570));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3204()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3205()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, Integer.MAX_VALUE);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3206()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-715827883));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3207()  throws Throwable  {
      double double0 = FastMath.scalb((-1110.017822265625), 1615);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3208()  throws Throwable  {
      double double0 = FastMath.scalb(1.633123935319537E16, (-2147482996));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3209()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3210()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3211()  throws Throwable  {
      double double0 = FastMath.abs((double) -0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3212()  throws Throwable  {
      double double0 = FastMath.abs(4.23719669792332E-8);
      assertEquals(4.23719669792332E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3213()  throws Throwable  {
      float float0 = FastMath.abs(1997.758F);
      assertEquals(1997.758F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3214()  throws Throwable  {
      float float0 = FastMath.abs((-4398.2F));
      assertEquals(4398.2F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3215()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3216()  throws Throwable  {
      long long0 = FastMath.abs((-3097L));
      assertEquals(3097L, long0);
  }

  @Test(timeout = 4000)
  public void test_3217()  throws Throwable  {
      long long0 = FastMath.abs(3229L);
      assertEquals(3229L, long0);
  }

  @Test(timeout = 4000)
  public void test_3218()  throws Throwable  {
      int int0 = FastMath.abs((-424));
      assertEquals(424, int0);
  }

  @Test(timeout = 4000)
  public void test_3219()  throws Throwable  {
      int int0 = FastMath.abs(3685);
      assertEquals(3685, int0);
  }

  @Test(timeout = 4000)
  public void test_3220()  throws Throwable  {
      double double0 = FastMath.toDegrees(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3221()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1.0052894641195118));
      assertEquals((-57.59884348301623), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3222()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3223()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3224()  throws Throwable  {
      double double0 = FastMath.toRadians(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3225()  throws Throwable  {
      double double0 = FastMath.toRadians((-2573.382723885112));
      assertEquals((-44.91400144573532), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3226()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3227()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3228()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3229()  throws Throwable  {
      double double0 = FastMath.cbrt(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3230()  throws Throwable  {
      double double0 = FastMath.cbrt(3.65022601502127E-17);
      assertEquals(3.3172121849939147E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3231()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3232()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3233()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3234()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3235()  throws Throwable  {
      double double0 = FastMath.acos((-1336.904052734375));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3236()  throws Throwable  {
      double double0 = FastMath.acos(3305.4936987458);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3237()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3238()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3239()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3240()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3241()  throws Throwable  {
      double double0 = FastMath.asin((-2144.7543817433066));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3242()  throws Throwable  {
      double double0 = FastMath.asin(2031.8591765);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3243()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3244()  throws Throwable  {
      double double0 = FastMath.atan2((-3634.53278), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3245()  throws Throwable  {
      double double0 = FastMath.atan2((-2031), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3246()  throws Throwable  {
      double double0 = FastMath.atan2(1025, -0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3247()  throws Throwable  {
      double double0 = FastMath.atan2((-4.813899778443457E-9), -0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3248()  throws Throwable  {
      double double0 = FastMath.atan2(1.7976931348623157E308, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3249()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3250()  throws Throwable  {
      double double0 = FastMath.atan2(1505, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3251()  throws Throwable  {
      double double0 = FastMath.atan2((-3210.255776811049), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3252()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, (-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3253()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3254()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3255()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3256()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 2.192160831263035E-8);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3257()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3258()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-3.141592653589793));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3259()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3260()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3261()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-3212.41));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3262()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3263()  throws Throwable  {
      double double0 = FastMath.atan2((-2272.71602641), (-2272.71602641));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3264()  throws Throwable  {
      double double0 = FastMath.asin((-1.0E-6));
      assertEquals((-1.0000000000001666E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3265()  throws Throwable  {
      double double0 = FastMath.atan2(2.854978560542175E-229, (-1.7976931348623157E308));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3266()  throws Throwable  {
      double double0 = FastMath.tan(1.5707963267948966);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3267()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3268()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3269()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3270()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3271()  throws Throwable  {
      double double0 = FastMath.cos(1.4035923083915864E217);
      assertEquals(0.9993589237085855, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3272()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3273()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3274()  throws Throwable  {
      double double0 = FastMath.sin(0.1428571343421936);
      assertEquals(0.142371721364054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3275()  throws Throwable  {
      double double0 = FastMath.sin(121.662);
      assertEquals(0.7579166031441406, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3276()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3277()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3278()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3279()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3280()  throws Throwable  {
      double double0 = FastMath.sin(799202708);
      assertEquals((-0.06673211952516446), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3281()  throws Throwable  {
      double double0 = FastMath.sin(1.73927483790327808E18);
      assertEquals((-0.3625216712494011), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3282()  throws Throwable  {
      double double0 = FastMath.sin(6.443805025317327E169);
      assertEquals((-0.9541817106094909), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3283()  throws Throwable  {
      double double0 = FastMath.sin(799202707);
      assertEquals(0.8035397671149453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3284()  throws Throwable  {
      double double0 = FastMath.sin(1.2888736757320174E268);
      assertEquals((-0.22248874071579078), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3285()  throws Throwable  {
      double double0 = FastMath.cos(1.3083870531380308E144);
      assertEquals(0.0715065126823359, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3286()  throws Throwable  {
      double double0 = FastMath.cos((-3.30101656090905E173));
      assertEquals((-0.1500127641492195), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3287()  throws Throwable  {
      double double0 = FastMath.sin((-8.016793741945299E96));
      assertEquals((-0.7225989423990621), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3288()  throws Throwable  {
      double double0 = FastMath.tan(1.633123935319537E16);
      assertEquals(3.370587556518889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3289()  throws Throwable  {
      double double0 = FastMath.cos(9.223372036854776E18);
      assertEquals(0.011800076512800236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3290()  throws Throwable  {
      double double0 = FastMath.tan(2.2038806519542315E-267);
      assertEquals(2.2038806519542315E-267, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3291()  throws Throwable  {
      double double0 = FastMath.sin((-1.5707963267948966));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3292()  throws Throwable  {
      double double0 = FastMath.pow((double) 37, 37);
      assertEquals(1.0555134955777783E58, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3293()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3294()  throws Throwable  {
      double double0 = FastMath.pow(1.0937349228978382E48, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3295()  throws Throwable  {
      double double0 = FastMath.pow((double) 2266, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3296()  throws Throwable  {
      double double0 = FastMath.pow((-18.430862426757812), (double) (-1.0F));
      assertEquals((-0.05425682080661652), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3297()  throws Throwable  {
      double double0 = FastMath.pow((-1740.71013), (-1740.71013));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3298()  throws Throwable  {
      double double0 = FastMath.pow((-441.6345), (-2.268994961992292E125));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3299()  throws Throwable  {
      double double0 = FastMath.pow((-0.16666666666666666), 1.633123935319537E16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3300()  throws Throwable  {
      double double0 = FastMath.pow(0.7077588191440839, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3301()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3302()  throws Throwable  {
      double double0 = FastMath.pow((-2631.2165), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3303()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.633123935319537E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3304()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3305()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 4.407761303908463E-267);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3306()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-1.0F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3307()  throws Throwable  {
      double double0 = FastMath.pow((-6.22836197265283E-8), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3308()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3309()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3310()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (double) (-127.0F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3311()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3312()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 1.633123935319537E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3313()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3314()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 1505);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3315()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-2.6033824355191673E-8));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3316()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.3930181860923767);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3317()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 7.685235201534525E71);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3318()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 2.366314656322868E-8);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3319()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) -0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3320()  throws Throwable  {
      double double0 = FastMath.log1p((-5291.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3321()  throws Throwable  {
      double double0 = FastMath.log1p(802.7981);
      assertEquals(6.689348118240225, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3322()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3323()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3324()  throws Throwable  {
      double double0 = FastMath.pow(1.0, (-1333.0389853188615));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3325()  throws Throwable  {
      double double0 = FastMath.acosh(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3326()  throws Throwable  {
      double double0 = FastMath.log(0.9166666666666666);
      assertEquals((-0.08701137698962981), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3327()  throws Throwable  {
      double double0 = FastMath.log10(4.9E-324);
      assertEquals((-323.3062153431158), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3328()  throws Throwable  {
      double double0 = FastMath.pow((-1.7475689218952297E-308), 1196.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3329()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3330()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3331()  throws Throwable  {
      double double0 = FastMath.atanh(6229.2163323070445);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3332()  throws Throwable  {
      double double0 = FastMath.expm1((-0.8813735870195429));
      assertEquals((-0.585786437626905), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3333()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3334()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3335()  throws Throwable  {
      double double0 = FastMath.expm1((-723.5424532));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3336()  throws Throwable  {
      double double0 = FastMath.exp((-716.2662406149352));
      assertEquals(8.502059252943E-312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3337()  throws Throwable  {
      double double0 = FastMath.expm1((-852.6388));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3338()  throws Throwable  {
      double double0 = FastMath.exp((-2088.697919));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3339()  throws Throwable  {
      float float0 = FastMath.signum(1.4E-45F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3340()  throws Throwable  {
      float float0 = FastMath.signum((-1890.074F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3341()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3342()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3343()  throws Throwable  {
      double double0 = FastMath.signum((double) (-8.624F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3344()  throws Throwable  {
      double double0 = FastMath.signum(0.924814726669217);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3345()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333329196);
      assertEquals(0.008333526242601714, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3346()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3347()  throws Throwable  {
      double double0 = FastMath.atanh((-0.33333333333333287));
      assertEquals((-0.3465735902799721), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3348()  throws Throwable  {
      double double0 = FastMath.atanh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3349()  throws Throwable  {
      double double0 = FastMath.asinh(0.017453292519943295);
      assertEquals(0.017452406545229723, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3350()  throws Throwable  {
      double double0 = FastMath.asinh(0.05483113556160755);
      assertEquals(0.054803698123075485, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3351()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3352()  throws Throwable  {
      double double0 = FastMath.asinh((-3.9986783938944604E-8));
      assertEquals((-3.99867839389446E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3353()  throws Throwable  {
      double double0 = FastMath.asinh((-2235.7517857116163));
      assertEquals((-8.405480050508148), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3354()  throws Throwable  {
      double double0 = FastMath.tanh(2.2038806519542315E-267);
      assertEquals(2.2038806519542315E-267, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3355()  throws Throwable  {
      double double0 = FastMath.tanh(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3356()  throws Throwable  {
      double double0 = FastMath.tanh(2609.56);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3357()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3358()  throws Throwable  {
      double double0 = FastMath.tanh((-1110.0178F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3359()  throws Throwable  {
      double double0 = FastMath.sinh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3360()  throws Throwable  {
      double double0 = FastMath.sinh((-2787.889935291));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3361()  throws Throwable  {
      double double0 = FastMath.sinh(3.65022601502127E-17);
      assertEquals(3.65022601502127E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3362()  throws Throwable  {
      double double0 = FastMath.sinh(8.165619676597685E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3363()  throws Throwable  {
      double double0 = FastMath.sinh(25.183014108615232);
      assertEquals(4.323287024000022E10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3364()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3365()  throws Throwable  {
      double double0 = FastMath.sinh((-531));
      assertEquals((-2.0386369663859145E230), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3366()  throws Throwable  {
      double double0 = FastMath.cosh((-593.0));
      assertEquals(1.720274584044543E257, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3367()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3368()  throws Throwable  {
      double double0 = FastMath.cosh(181.8113925);
      assertEquals(4.5567427811185076E78, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3369()  throws Throwable  {
      double double0 = FastMath.cosh(2817.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3370()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3371()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 4.9E-324);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3372()  throws Throwable  {
      double double0 = FastMath.acos(0.7214844226837158);
      assertEquals(0.7648526099207889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3373()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3374()  throws Throwable  {
      double double0 = FastMath.hypot((-2570.728), 0.0);
      assertEquals(2570.728, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3375()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_3376()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_3377()  throws Throwable  {
      double double0 = FastMath.cosh((-3210.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3378()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-795.1), 1610);
      assertEquals((-795.1), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3379()  throws Throwable  {
      double double0 = FastMath.atan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3380()  throws Throwable  {
      double double0 = FastMath.acosh(-0.0F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3381()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3382()  throws Throwable  {
      double double0 = FastMath.expm1(7.663353127378024E218);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3383()  throws Throwable  {
      int int0 = FastMath.round(-0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3384()  throws Throwable  {
      long long0 = FastMath.round(1.4352697002457768E131);
      assertEquals(9223372036854775807L, long0);
  }
@Test(timeout = 4000)
  public void test_3385()  throws Throwable  {
      float float0 = FastMath.copySign((-2252.6245F), (float) 0L);
      assertEquals(2252.6245F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3386()  throws Throwable  {
      float float0 = FastMath.copySign((float) 0L, (-1.0F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3387()  throws Throwable  {
      double double0 = FastMath.copySign((-1211.83209587), 0.0);
      assertEquals(1211.83209587, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3388()  throws Throwable  {
      double double0 = FastMath.hypot(2.893485277253286E-8, 2.718281828459045);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3389()  throws Throwable  {
      double double0 = FastMath.hypot(9.755392680573412E-9, 6.123233995736766E-17);
      assertEquals(9.755392680573412E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3390()  throws Throwable  {
      double double0 = FastMath.rint(2605.61932);
      assertEquals(2606.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3391()  throws Throwable  {
      double double0 = FastMath.rint(0.5F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3392()  throws Throwable  {
      double double0 = FastMath.ceil((-3787.44189715));
      assertEquals((-3787.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3393()  throws Throwable  {
      double double0 = FastMath.rint(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3394()  throws Throwable  {
      double double0 = FastMath.rint((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3395()  throws Throwable  {
      double double0 = FastMath.rint(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3396()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3397()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3398()  throws Throwable  {
      float float0 = FastMath.scalb((-3401.4746F), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3399()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-38L), 2097);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3400()  throws Throwable  {
      double double0 = FastMath.scalb((-2380.0), (-2098));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3401()  throws Throwable  {
      double double0 = FastMath.scalb(3895.984853, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3402()  throws Throwable  {
      float float0 = FastMath.ulp(4656.1F);
      assertEquals(4.8828125E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3403()  throws Throwable  {
      double double0 = FastMath.ulp((-817.9142026008452));
      assertEquals(1.1368683772161603E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3404()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3405()  throws Throwable  {
      float float0 = FastMath.abs(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3406()  throws Throwable  {
      int int0 = FastMath.abs(2047);
      assertEquals(2047, int0);
  }

  @Test(timeout = 4000)
  public void test_3407()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3408()  throws Throwable  {
      double double0 = FastMath.asin(0.3333333134651184);
      assertEquals(0.33983688838069775, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3409()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, 1.2871924223480165E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3410()  throws Throwable  {
      double double0 = FastMath.tan(1.5707963267948966);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3411()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0);
      assertEquals((-0.7734333808731876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3412()  throws Throwable  {
      double double0 = FastMath.cos(1.5707963267948966);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3413()  throws Throwable  {
      double double0 = FastMath.cos(3294198.0);
      assertEquals(0.7910146852024715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3414()  throws Throwable  {
      double double0 = FastMath.cos(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3415()  throws Throwable  {
      double double0 = FastMath.sin((-1.5707963267948966));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3416()  throws Throwable  {
      double double0 = FastMath.sin(3294198.0);
      assertEquals((-0.6117971622964877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3417()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0E-6));
      assertEquals((-1.0000005000003334E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3418()  throws Throwable  {
      double double0 = FastMath.log1p(1.0E-6);
      assertEquals(9.999995000003334E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3419()  throws Throwable  {
      double double0 = FastMath.expm1(1L);
      assertEquals(1.7182818284590453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3420()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3421()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3422()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3423()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3424()  throws Throwable  {
      double double0 = FastMath.tanh((-20.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3425()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3426()  throws Throwable  {
      double double0 = FastMath.sinh((-0.25));
      assertEquals((-0.2526123168081683), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3427()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3428()  throws Throwable  {
      double double0 = FastMath.sinh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3429()  throws Throwable  {
      double double0 = FastMath.sinh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3430()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3431()  throws Throwable  {
      double double0 = FastMath.cosh((-20.0));
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3432()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3433()  throws Throwable  {
      double double0 = FastMath.cosh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3434()  throws Throwable  {
      double double0 = FastMath.atan2(6.17227771655645E-18, 2.2250738585072014E-308);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3435()  throws Throwable  {
      double double0 = FastMath.atan2(1.1795268640216787E-8, (-2.2250738585072014E-308));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3436()  throws Throwable  {
      double double0 = FastMath.toRadians((-3103.0));
      assertEquals((-54.15756668938405), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3437()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1259.386320378));
      assertEquals((-72157.52093416994), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3438()  throws Throwable  {
      double double0 = FastMath.sqrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3439()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3440()  throws Throwable  {
      int int0 = FastMath.round(1265.3356F);
      assertEquals(1265, int0);
  }

  @Test(timeout = 4000)
  public void test_3441()  throws Throwable  {
      long long0 = FastMath.round((double) -0.0F);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3442()  throws Throwable  {
      long long0 = FastMath.round((-3251.1062339245));
      assertEquals((-3251L), long0);
  }

  @Test(timeout = 4000)
  public void test_3443()  throws Throwable  {
      double double0 = FastMath.pow(0.036, 1223);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3444()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3445()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3446()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3447()  throws Throwable  {
      long long0 = FastMath.min((-1886L), 4593671619917905920L);
      assertEquals((-1886L), long0);
  }

  @Test(timeout = 4000)
  public void test_3448()  throws Throwable  {
      int int0 = FastMath.min(0, 12);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3449()  throws Throwable  {
      int int0 = FastMath.min(1303, (-548441278));
      assertEquals((-548441278), int0);
  }

  @Test(timeout = 4000)
  public void test_3450()  throws Throwable  {
      float float0 = FastMath.min(431.85F, 431.85F);
      assertEquals(431.85F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3451()  throws Throwable  {
      double double0 = FastMath.min(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3452()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3453()  throws Throwable  {
      long long0 = FastMath.max((-53L), 1337L);
      assertEquals(1337L, long0);
  }

  @Test(timeout = 4000)
  public void test_3454()  throws Throwable  {
      int int0 = FastMath.max((-2350), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3455()  throws Throwable  {
      double double0 = FastMath.max((-3774.43105893693), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3456()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3457()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3458()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3459()  throws Throwable  {
      double double0 = FastMath.log((double) 0, (double) 17);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3460()  throws Throwable  {
      double double0 = FastMath.log(7.848361555046424E-8, 2374.82016772162);
      assertEquals((-0.4750915881796154), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3461()  throws Throwable  {
      double double0 = FastMath.log(4571.7699086);
      assertEquals(8.42765569744532, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3462()  throws Throwable  {
      double double0 = FastMath.log(1.1795268640216787E-8);
      assertEquals((-18.25556734857532), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3463()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3464()  throws Throwable  {
      int int0 = FastMath.getExponent((-1.0F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3465()  throws Throwable  {
      int int0 = FastMath.getExponent((float) (-2987));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_3466()  throws Throwable  {
      int int0 = FastMath.getExponent(1.5529763273748018);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3467()  throws Throwable  {
      int int0 = FastMath.getExponent((-7.800414592973399E-9));
      assertEquals((-27), int0);
  }

  @Test(timeout = 4000)
  public void test_3468()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3469()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3470()  throws Throwable  {
      double double0 = FastMath.atanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3471()  throws Throwable  {
      double double0 = FastMath.atan(1.952984663889236);
      assertEquals(1.0975657192547796, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3472()  throws Throwable  {
      double double0 = FastMath.asinh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3473()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3474()  throws Throwable  {
      double double0 = FastMath.acosh(2.718281828459045);
      assertEquals(1.6574544541530771, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3475()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3476()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_3477()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_3478()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(0.6366197723675814, Double.POSITIVE_INFINITY);
      assertEquals(0.6366197723675814, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3479()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(6468.92600700294, (-835.395610492));
      assertEquals((-214.23887693305915), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3480()  throws Throwable  {
      String[] stringArray0 = new String[6];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_3481()  throws Throwable  {
      double double0 = FastMath.copySign(4571.376599288436, 4571.376599288436);
      assertEquals(4571.376599288436, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3482()  throws Throwable  {
      double double0 = FastMath.copySign(0.7982857660300269, (-1660.6));
      assertEquals((-0.7982857660300269), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3483()  throws Throwable  {
      double double0 = FastMath.floor((-2898.817109));
      assertEquals((-2899.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3484()  throws Throwable  {
      double double0 = FastMath.floor(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3485()  throws Throwable  {
      double double0 = FastMath.floor(1.8014398509481984E16);
      assertEquals(1.8014398509481984E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3486()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3487()  throws Throwable  {
      float float0 = FastMath.nextAfter(902.465F, 1600.0);
      assertEquals(902.4651F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3488()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1119.9629F), 1.0);
      assertEquals((-1119.9628F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3489()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 7.724278756071081E-9);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3490()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.6603463846820721);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3491()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 0.0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3492()  throws Throwable  {
      double double0 = FastMath.nextAfter(1776.0087512, 2687.1554266);
      assertEquals(1776.0087512000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3493()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1337.003), (-921.067518563));
      assertEquals((-1337.0029999999997), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3494()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2634.7929100845113);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3495()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-3.284204788892967E204));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3496()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-382.58207901162433));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3497()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1), (-1023));
      assertEquals((-1.1125369292536007E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3498()  throws Throwable  {
      double double0 = FastMath.scalb((double) 10, 10);
      assertEquals(10240.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3499()  throws Throwable  {
      double double0 = FastMath.abs((-1234.173864262291));
      assertEquals(1234.173864262291, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3500()  throws Throwable  {
      float float0 = FastMath.abs((-3.4028235E38F));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3501()  throws Throwable  {
      double double0 = FastMath.pow(2149.0, 8.988465674311366E307);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3502()  throws Throwable  {
      double double0 = FastMath.pow(582.0, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3503()  throws Throwable  {
      int int0 = FastMath.getExponent(1.7991060813894693E185);
      assertEquals(615, int0);
  }

  @Test(timeout = 4000)
  public void test_3504()  throws Throwable  {
      double double0 = FastMath.sqrt(1.438238915120834);
      assertEquals(1.1992659901459868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3505()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3506()  throws Throwable  {
      float float0 = FastMath.copySign((-0.044938624F), (float) 128);
      assertEquals(0.044938624F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3507()  throws Throwable  {
      float float0 = FastMath.copySign(1514.0F, 1514.0F);
      assertEquals(1514.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3508()  throws Throwable  {
      float float0 = FastMath.copySign(2089.461F, (-1122.5968F));
      assertEquals((-2089.461F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3509()  throws Throwable  {
      float float0 = FastMath.copySign((-2206.565F), (-2206.565F));
      assertEquals((-2206.565F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3510()  throws Throwable  {
      double double0 = FastMath.copySign((-764.114541), 0.14433705806732178);
      assertEquals(764.114541, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3511()  throws Throwable  {
      double double0 = FastMath.copySign((-4.49423283715579E307), (double) -0.0F);
      assertEquals((-4.49423283715579E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3512()  throws Throwable  {
      double double0 = FastMath.hypot(4.711165925070571E-58, 1528.08953022);
      assertEquals(1528.08953022, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3513()  throws Throwable  {
      double double0 = FastMath.hypot(1.2806275683797178E-57, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3514()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3515()  throws Throwable  {
      double double0 = FastMath.hypot((-549.52), Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3516()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3517()  throws Throwable  {
      double double0 = FastMath.max(692.917873, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3518()  throws Throwable  {
      double double0 = FastMath.max(3.141592653589793, (double) 3111);
      assertEquals(3111.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3519()  throws Throwable  {
      double double0 = FastMath.max(2702.158760683431, (double) -0.0F);
      assertEquals(2702.158760683431, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3520()  throws Throwable  {
      double double0 = FastMath.max((-777.152003492), (-777.152003492));
      assertEquals((-777.152003492), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3521()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3522()  throws Throwable  {
      float float0 = FastMath.max((-1294.5952F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3523()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, 2261.26F);
      assertEquals(2261.26F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3524()  throws Throwable  {
      float float0 = FastMath.max((-253.4F), (-966.8361F));
      assertEquals((-253.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3525()  throws Throwable  {
      float float0 = FastMath.max((-1.0F), (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3526()  throws Throwable  {
      long long0 = FastMath.max((-212L), (-212L));
      assertEquals((-212L), long0);
  }

  @Test(timeout = 4000)
  public void test_3527()  throws Throwable  {
      long long0 = FastMath.max((-1036L), (-2472L));
      assertEquals((-1036L), long0);
  }

  @Test(timeout = 4000)
  public void test_3528()  throws Throwable  {
      int int0 = FastMath.max(2786, 2786);
      assertEquals(2786, int0);
  }

  @Test(timeout = 4000)
  public void test_3529()  throws Throwable  {
      int int0 = FastMath.max((-481), (-3109));
      assertEquals((-481), int0);
  }

  @Test(timeout = 4000)
  public void test_3530()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3531()  throws Throwable  {
      double double0 = FastMath.min(2.718281828459045, 2.718281828459045);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3532()  throws Throwable  {
      double double0 = FastMath.min(1578.803704, (-1128.41));
      assertEquals((-1128.41), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3533()  throws Throwable  {
      double double0 = FastMath.min((double) (-1380.0F), (-121.8527108188044));
      assertEquals((-1380.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3534()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3535()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 1.4E-45F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3536()  throws Throwable  {
      float float0 = FastMath.min(Float.NEGATIVE_INFINITY, (-1258.0316F));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3537()  throws Throwable  {
      float float0 = FastMath.min(0.0F, (-1768.7634F));
      assertEquals((-1768.7634F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3538()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_3539()  throws Throwable  {
      long long0 = FastMath.min(4620693217682128896L, 4577762542105553359L);
      assertEquals(4577762542105553359L, long0);
  }

  @Test(timeout = 4000)
  public void test_3540()  throws Throwable  {
      int int0 = FastMath.min(358, 358);
      assertEquals(358, int0);
  }

  @Test(timeout = 4000)
  public void test_3541()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3542()  throws Throwable  {
      double double0 = FastMath.rint((-907.262679545837));
      assertEquals((-907.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3543()  throws Throwable  {
      double double0 = FastMath.rint((-0.16666666666666666));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3544()  throws Throwable  {
      double double0 = FastMath.ceil((-2.2250738585072014E-308));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3545()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3546()  throws Throwable  {
      double double0 = FastMath.floor(2.5039391215625133E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3547()  throws Throwable  {
      double double0 = FastMath.floor((-1380.0F));
      assertEquals((-1380.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3548()  throws Throwable  {
      double double0 = FastMath.ceil(2084.53279281345);
      assertEquals(2085.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3549()  throws Throwable  {
      double double0 = FastMath.ceil(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3550()  throws Throwable  {
      float float0 = FastMath.nextUp(657.03595F);
      assertEquals(657.036F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3551()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.5F, (-1875.2233262));
      assertEquals(0.49999997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3552()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0, (-287.87813168));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3553()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.0686474223616E13);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3554()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3555()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3556()  throws Throwable  {
      double double0 = FastMath.nextUp((double) 128);
      assertEquals(128.00000000000003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3557()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.141592653589793, 2.718281828459045);
      assertEquals(3.1415926535897927, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3558()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-2.8064314757880205E-8));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3559()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-1085.7960530409));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3560()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3561()  throws Throwable  {
      double double0 = FastMath.nextAfter(1055.012, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3562()  throws Throwable  {
      float float0 = FastMath.scalb((float) 200, 200);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3563()  throws Throwable  {
      float float0 = FastMath.scalb(0.5F, 128);
      assertEquals(1.7014118E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3564()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 200);
      assertEquals((-2.25179981E15F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3565()  throws Throwable  {
      float float0 = FastMath.scalb(0.5F, (-157));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3566()  throws Throwable  {
      float float0 = FastMath.scalb(591.307F, (-145));
      assertEquals(1.3258E-41F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3567()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3568()  throws Throwable  {
      float float0 = FastMath.scalb(1952.0F, 483);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3569()  throws Throwable  {
      float float0 = FastMath.scalb((-833.81F), 593);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3570()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-929));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3571()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-1154));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3572()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 3138);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3573()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-207));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3574()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-118), (-118));
      assertEquals((-3.5509333E-34F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3575()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2847), (-2847));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3576()  throws Throwable  {
      double double0 = FastMath.scalb(3.3951607353932444E-301, 1244);
      assertEquals(1.0284304945950805E74, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3577()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1368, (-1079));
      assertEquals(2.1E-322, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3578()  throws Throwable  {
      double double0 = FastMath.scalb(4.503599627370496E15, (-1053));
      assertEquals(4.6663180925160944E-302, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3579()  throws Throwable  {
      double double0 = FastMath.scalb(1155.038315466378, (-1350));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3580()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2146532676, 2146532676);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3581()  throws Throwable  {
      double double0 = FastMath.scalb(2563.3, (-3162));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3582()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-2146025152));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3583()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, 1935296736);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3584()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-2146025152));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3585()  throws Throwable  {
      double double0 = FastMath.scalb((-136.2), 2436);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3586()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2146025152), (-2146025152));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3587()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3588()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3589()  throws Throwable  {
      double double0 = FastMath.abs((double) -0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3590()  throws Throwable  {
      double double0 = FastMath.abs(2.85040095144011776E17);
      assertEquals(2.85040095144011776E17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3591()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3592()  throws Throwable  {
      long long0 = FastMath.abs((-24L));
      assertEquals(24L, long0);
  }

  @Test(timeout = 4000)
  public void test_3593()  throws Throwable  {
      long long0 = FastMath.abs(714L);
      assertEquals(714L, long0);
  }

  @Test(timeout = 4000)
  public void test_3594()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_3595()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3596()  throws Throwable  {
      double double0 = FastMath.toDegrees(3.8540083204495303);
      assertEquals(220.818410970061, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3597()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3598()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3599()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3600()  throws Throwable  {
      double double0 = FastMath.toRadians(4571.4);
      assertEquals(79.78598142566878, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3601()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3602()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3603()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3604()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3605()  throws Throwable  {
      double double0 = FastMath.cbrt(0.5F);
      assertEquals(0.7937005259840998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3606()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3607()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3608()  throws Throwable  {
      double double0 = FastMath.acos(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3609()  throws Throwable  {
      double double0 = FastMath.acos((-1));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3610()  throws Throwable  {
      double double0 = FastMath.acos((-641.12967516242));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3611()  throws Throwable  {
      double double0 = FastMath.acos(3138);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3612()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3613()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3614()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3615()  throws Throwable  {
      double double0 = FastMath.asin(1L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3616()  throws Throwable  {
      double double0 = FastMath.asin((-5.759582672039005E-10));
      assertEquals((-5.759582672039005E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3617()  throws Throwable  {
      double double0 = FastMath.asin(11693.914542418897);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3618()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3619()  throws Throwable  {
      double double0 = FastMath.asin((-1842.6134));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3620()  throws Throwable  {
      double double0 = FastMath.atan2(2.925681159240093E-8, 2.925681159240093E-8);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3621()  throws Throwable  {
      double double0 = FastMath.atan2((-4.49423283715579E307), 2.925681159240093E-8);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3622()  throws Throwable  {
      double double0 = FastMath.atan2((-4872.27528729004), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3623()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3624()  throws Throwable  {
      double double0 = FastMath.atan2((-658.3975644760054), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3625()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3626()  throws Throwable  {
      double double0 = FastMath.atan2((-4872.27528729004), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3627()  throws Throwable  {
      double double0 = FastMath.atan2((-475.546456607), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3628()  throws Throwable  {
      double double0 = FastMath.atan2(4571.7699086, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3629()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3630()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3631()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 689.3972656444);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3632()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3633()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3634()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-658.3975644760054));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3635()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3636()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-964.2999877929688));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3637()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3638()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3639()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3640()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 2610.805);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3641()  throws Throwable  {
      double double0 = FastMath.atan2((-1597.591638926822), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3642()  throws Throwable  {
      double double0 = FastMath.atan2((-2146025152), (-2146025152));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3643()  throws Throwable  {
      double double0 = FastMath.atan(Float.NEGATIVE_INFINITY);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3644()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-3769.597));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3645()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3646()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3647()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3648()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3649()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3650()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3651()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3652()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3653()  throws Throwable  {
      double double0 = FastMath.sin(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3654()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3655()  throws Throwable  {
      double double0 = FastMath.sin(1.2204032949639917E39);
      assertEquals(0.9336116712262983, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3656()  throws Throwable  {
      double double0 = FastMath.sin((-2146025152));
      assertEquals(0.3661606142507114, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3657()  throws Throwable  {
      double double0 = FastMath.tan(3.7660598745907915E115);
      assertEquals((-1.0141216723665623), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3658()  throws Throwable  {
      double double0 = FastMath.cos((-1.7846700158234043E30));
      assertEquals((-0.57774471519365), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3659()  throws Throwable  {
      double double0 = FastMath.cos(7.201319954099161E239);
      assertEquals((-0.956950641954292), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3660()  throws Throwable  {
      double double0 = FastMath.sin(2140393468);
      assertEquals((-0.5558549257632271), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3661()  throws Throwable  {
      double double0 = FastMath.sin(2.1540322390343345E90);
      assertEquals(0.8020182038726827, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3662()  throws Throwable  {
      double double0 = FastMath.cos((-4.503599627370496E15));
      assertEquals((-0.4855348677422206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3663()  throws Throwable  {
      double double0 = FastMath.tan(1.7976931348623157E308);
      assertEquals((-0.004962015874444895), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3664()  throws Throwable  {
      double double0 = FastMath.tan((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3665()  throws Throwable  {
      double double0 = FastMath.sin(0.4342944622039795);
      assertEquals(0.42077046544322494, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3666()  throws Throwable  {
      double double0 = FastMath.pow((double) 128, 128);
      assertEquals(5.2829453113566525E269, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3667()  throws Throwable  {
      double double0 = FastMath.pow((-7.0), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3668()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3669()  throws Throwable  {
      double double0 = FastMath.pow((-3.6535299896840334E43), (double) (-101));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3670()  throws Throwable  {
      double double0 = FastMath.pow((-2937.34466), (double) 1514.0F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3671()  throws Throwable  {
      double double0 = FastMath.pow((-8.0E298), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3672()  throws Throwable  {
      double double0 = FastMath.pow((-1290.6622852354292), 1.7976931348623157E308);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3673()  throws Throwable  {
      double double0 = FastMath.pow((-1234.173864262291), (-1234.173864262291));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3674()  throws Throwable  {
      double double0 = FastMath.pow(6.390098458668406E-8, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3675()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3676()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3677()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 341.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3678()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-2.2667083759873216E16));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3679()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3680()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 3.141592653589793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3681()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-58.95789561));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3682()  throws Throwable  {
      double double0 = FastMath.pow(1988.6745621726295, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3683()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3684()  throws Throwable  {
      double double0 = FastMath.pow(8.07011980809078E-18, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3685()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1535.910766));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3686()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3687()  throws Throwable  {
      double double0 = FastMath.pow((double) 0L, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3688()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 3.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3689()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.5707963267948966);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3690()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-4042.5645F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3691()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3692()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 110.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3693()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3694()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3695()  throws Throwable  {
      double double0 = FastMath.log10(342.2751413303387);
      assertEquals(2.534375358456908, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3696()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3697()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3698()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3699()  throws Throwable  {
      double double0 = FastMath.pow((double) 1L, (double) 1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3700()  throws Throwable  {
      double double0 = FastMath.log1p(0.031);
      assertEquals(0.030529205034822874, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3701()  throws Throwable  {
      double double0 = FastMath.log1p((-0.2499999997677497));
      assertEquals((-0.28768207214211383), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3702()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 4.9E-324);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3703()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3704()  throws Throwable  {
      double double0 = FastMath.asinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3705()  throws Throwable  {
      double double0 = FastMath.log1p((-1052.97));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3706()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0129027912496858E-9));
      assertEquals((-1.0129027907366998E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3707()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3708()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3709()  throws Throwable  {
      double double0 = FastMath.pow(1402.1861019755, 2.041872501373291);
      assertEquals(2663029.274656836, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3710()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3711()  throws Throwable  {
      double double0 = FastMath.exp((-711.82173876));
      assertEquals(7.2401365604051E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3712()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3713()  throws Throwable  {
      double double0 = FastMath.exp((-1215.688057));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3714()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3715()  throws Throwable  {
      float float0 = FastMath.signum(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3716()  throws Throwable  {
      float float0 = FastMath.signum(1.4E-45F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3717()  throws Throwable  {
      double double0 = FastMath.signum((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3718()  throws Throwable  {
      double double0 = FastMath.signum((-1234.173864262291));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3719()  throws Throwable  {
      double double0 = FastMath.signum(0.041666666666666664);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3720()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3721()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3722()  throws Throwable  {
      double double0 = FastMath.atanh(0.11865071952342987);
      assertEquals(0.11921225842401252, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3723()  throws Throwable  {
      double double0 = FastMath.atanh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3724()  throws Throwable  {
      double double0 = FastMath.atanh((-3.403809212925344E-17));
      assertEquals((-3.403809212925344E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3725()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333329196);
      assertEquals(0.008333236885725868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3726()  throws Throwable  {
      double double0 = FastMath.tanh((-2.5147255753587636E-8));
      assertEquals((-2.514725575358763E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3727()  throws Throwable  {
      double double0 = FastMath.tanh(0.5);
      assertEquals(0.46211715726000974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3728()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3729()  throws Throwable  {
      double double0 = FastMath.tanh(4724.8);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3730()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3731()  throws Throwable  {
      double double0 = FastMath.tanh((-4251.387166035734));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3732()  throws Throwable  {
      double double0 = FastMath.sinh(1.997844754509471E-9);
      assertEquals(1.997844754509471E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3733()  throws Throwable  {
      double double0 = FastMath.sinh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3734()  throws Throwable  {
      double double0 = FastMath.sinh((-2723));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3735()  throws Throwable  {
      double double0 = FastMath.sinh(567.0);
      assertEquals(8.789036002598174E245, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3736()  throws Throwable  {
      double double0 = FastMath.sinh(2245.305253);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3737()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3738()  throws Throwable  {
      double double0 = FastMath.sinh((-201.10793480825075));
      assertEquals((-1.0940479545816806E87), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3739()  throws Throwable  {
      double double0 = FastMath.cosh((-255.8756697385673));
      assertEquals(6.673619248036771E110, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3740()  throws Throwable  {
      double double0 = FastMath.cosh(444.8341F);
      assertEquals(7.726232908815563E192, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3741()  throws Throwable  {
      double double0 = FastMath.cosh(4571.7699086);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3742()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3743()  throws Throwable  {
      double double0 = FastMath.acos(0.8333333333333334);
      assertEquals(0.5856855434571508, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3744()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3745()  throws Throwable  {
      double double0 = FastMath.hypot((-3666.951), 0.0);
      assertEquals(3666.951, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3746()  throws Throwable  {
      double double0 = FastMath.log(3.608488720395596E-255, 3.608488720395596E-255);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3747()  throws Throwable  {
      int int0 = FastMath.getExponent(1.4E-45F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_3748()  throws Throwable  {
      double double0 = FastMath.cosh((-2289.908826));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3749()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(3765.5658371833642, 3765.5658371833642);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3750()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3751()  throws Throwable  {
      double double0 = FastMath.acosh((-2146025152));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3752()  throws Throwable  {
      double double0 = FastMath.acos((-3.015709444206057E-226));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3753()  throws Throwable  {
      double double0 = FastMath.expm1(1012.7388855074405);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3754()  throws Throwable  {
      int int0 = FastMath.round((float) (-2987));
      assertEquals((-2987), int0);
  }

  @Test(timeout = 4000)
  public void test_3755()  throws Throwable  {
      long long0 = FastMath.round(Double.POSITIVE_INFINITY);
      assertEquals(9223372036854775807L, long0);
  }
}
