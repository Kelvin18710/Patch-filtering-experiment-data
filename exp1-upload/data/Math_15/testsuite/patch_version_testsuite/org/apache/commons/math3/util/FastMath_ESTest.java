package org.apache.commons.math3.util;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.evosuite.runtime.Random;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FastMath_ESTest extends FastMath_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      FastMath.copySign((-2450.0F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      FastMath.copySign(0.0F, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      FastMath.copySign((float) 1642L, 2080.0F);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      FastMath.copySign((-2585.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      FastMath.hypot((-4.068233003401932E-9), 0.5752220392306203);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      FastMath.hypot((-161.5543), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      FastMath.max((-1929L), 0L);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      FastMath.min(538L, 1023L);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      FastMath.rint(378.652741);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      FastMath.rint((-699.5F));
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      FastMath.rint(0.0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      FastMath.scalb((-1.0F), (-127));
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      FastMath.scalb(1.0F, 276);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      FastMath.scalb(1.0F, (-277));
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      FastMath.scalb((double) (-967), (-2098));
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      FastMath.toDegrees((-3739.1834));
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      FastMath.asin((-2.4442443105031435E-117));
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      FastMath.atan2(0.0, 3.443971723674285E-8);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      FastMath.atan2(1.633123935319537E16, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      FastMath.cos(-0.0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      FastMath.sin(1.3328680266667662E237);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      FastMath.cosh(-0.0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      FastMath.atan2(2.2250738585072014E-308, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      FastMath.round((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      FastMath.round((double) 0L);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      FastMath.round((-2650.34511489));
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FastMath.pow((-4480.045685), (-2110));
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      FastMath.nextAfter(0.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      FastMath.min((long) (-127), (long) (-127));
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      FastMath.min((-817), 104);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      FastMath.min(1051.0F, 936.176F);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      FastMath.min((double) 0L, 563.2727637751);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      FastMath.max((-3739L), (-3739L));
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      FastMath.max((-12), 0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      FastMath.max((-967), (-2126));
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      FastMath.max((-1118.85), (double) (-2147483647));
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      FastMath.log10(1);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      FastMath.log((double) 0, 1195.5929);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      FastMath.log(430.5, 0.3153223395347595);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      FastMath.log(1287.99969);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      FastMath.getExponent((-364.93427F));
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      FastMath.getExponent(1.5574076175689697);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      FastMath.getExponent(1622.61723);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      FastMath.copySign(0.0, 1.1047391891479492);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      FastMath.ceil((-1180.6680697895747));
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      FastMath.atanh((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      FastMath.atan(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      FastMath.asinh(0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      FastMath.acosh(1549);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      FastMath.acosh((-2147483647));
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      FastMath.IEEEremainder(1.0905890688083124E-180, (-1.0037562566203142));
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      FastMath.IEEEremainder(2185.0, (-2359.138));
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(1.7642714221524228E-7, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      double double0 = FastMath.copySign(6.311265339957543E-17, 0.7853981633974483);
      assertEquals(6.311265339957543E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      double double0 = FastMath.copySign(5.562684646268137E-309, (-709.782712893384));
      assertEquals((-5.562684646268137E-309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      double double0 = FastMath.floor(0.041666666666621166);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      double double0 = FastMath.floor(2295.851);
      assertEquals(2295.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      double double0 = FastMath.floor((-3.5997360512765566E-9));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      double double0 = FastMath.floor(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      double double0 = FastMath.floor(8.113027299196505E149);
      assertEquals(8.113027299196505E149, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      float float0 = FastMath.nextAfter(353.65186F, 1778.369876);
      assertEquals(353.6519F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      float float0 = FastMath.nextAfter((-686.63F), 1175.8328655);
      assertEquals((-686.62994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 0.1666666505023083);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-1605.3881292098981));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.07923452154026E-9, 1.7642714221524228E-7);
      assertEquals(3.0792345215402606E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2.0416603812329616E-8), (double) Float.NEGATIVE_INFINITY);
      assertEquals((-2.041660381232962E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 217.4917540707035);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      double double0 = FastMath.scalb((-4696.5326), 289);
      assertEquals((-4.671389585072139E90), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      double double0 = FastMath.abs(2.356194490192345);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      float float0 = FastMath.abs(1.1953958F);
      assertEquals(1.1953958F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      double double0 = FastMath.pow(3.141592653589793, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      int int0 = FastMath.getExponent(1.8412576154421806E-7);
      assertEquals((-23), int0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      double double0 = FastMath.sqrt(2.2250738585072014E-308);
      assertEquals(1.4916681462400413E-154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      float float0 = FastMath.copySign((-3.4028235E38F), 3.4028235E38F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      float float0 = FastMath.copySign((float) 2156, Float.NEGATIVE_INFINITY);
      assertEquals((-2156.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      float float0 = FastMath.copySign((-3633.9163F), (-3633.9163F));
      assertEquals((-3633.9163F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      double double0 = FastMath.copySign((-704.2486656713812), (-704.2486656713812));
      assertEquals((-704.2486656713812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      double double0 = FastMath.copySign((-3983.64389061), 6.311265339957543E-17);
      assertEquals(3983.64389061, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      double double0 = FastMath.hypot((-5.49755813888E11), (-452.1918238583004));
      assertEquals(5.49755813888E11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      double double0 = FastMath.hypot(67.0719142, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      double double0 = FastMath.hypot(1.7976931348623157E308, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      double double0 = FastMath.max((-8.0E298), (double) 1214);
      assertEquals(1214.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      double double0 = FastMath.max(-0.0, (-1730.1379));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      double double0 = FastMath.max(1102.355213749, 1102.355213749);
      assertEquals(1102.355213749, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, 3299.2473F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      float float0 = FastMath.max((-3.4028235E38F), 1654.7F);
      assertEquals(1654.7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      float float0 = FastMath.max((-1953.3232F), (-2117.5825F));
      assertEquals((-1953.3232F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      float float0 = FastMath.max(1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      long long0 = FastMath.max(1073741824L, 0L);
      assertEquals(1073741824L, long0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      int int0 = FastMath.max(8, 8);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      double double0 = FastMath.min((double) (-1), 9.755392680573412E-9);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      double double0 = FastMath.min(1703.3272237842257, 0.3153223395347595);
      assertEquals(0.3153223395347595, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      double double0 = FastMath.min((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, (-1937.5386F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      float float0 = FastMath.min((-46.479893F), (-46.479893F));
      assertEquals((-46.479893F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      float float0 = FastMath.min((-3415.0F), 1431.8232F);
      assertEquals((-3415.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      long long0 = FastMath.min(2934L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      int int0 = FastMath.min(124, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      double double0 = FastMath.rint((-718.4070973404));
      assertEquals((-718.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      double double0 = FastMath.rint((-0.33333333333333287));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      double double0 = FastMath.ceil(1.1188538074493408);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      double double0 = FastMath.floor((-20.0));
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      double double0 = FastMath.ceil((-5.905511605694905E-113));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      float float0 = FastMath.nextUp(1144.0F);
      assertEquals(1144.0001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      float float0 = FastMath.nextAfter(347.43524F, (-363.9));
      assertEquals(347.4352F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1593.5359470545961));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 9.761163062156018E179);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      double double0 = FastMath.nextUp(1190.76111888471);
      assertEquals(1190.7611188847102, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      double double0 = FastMath.nextAfter(6610.034190531846, 4674.0);
      assertEquals(6610.0341905318455, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-2759.80307));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 1932.109013859);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 988.874263208);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double double0 = FastMath.nextAfter(2089.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      float float0 = FastMath.scalb((-3.8146973E-6F), 128);
      assertEquals((-1.2980742E33F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      float float0 = FastMath.scalb((-1919.3F), 268);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      float float0 = FastMath.scalb(1001.4323F, (-148));
      assertEquals(2.807E-42F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      float float0 = FastMath.scalb((-3156.9F), (-242));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      float float0 = FastMath.scalb((-3053.1F), (-127));
      assertEquals((-1.794451E-35F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 144);
      assertEquals((-0.03125F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      float float0 = FastMath.scalb((-558.9675F), 1500);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-3415), (-3415));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      float float0 = FastMath.scalb(2.2737368E-13F, 2864);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 265);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-127));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      float float0 = FastMath.scalb(112.1528F, 27);
      assertEquals(1.50528942E10F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 1293);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      float float0 = FastMath.scalb((float) 8388601, (-21262215));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      double double0 = FastMath.scalb(1024.0, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      double double0 = FastMath.scalb(1.9366601417010147E-217, 1706);
      assertEquals(6.985958754451805E296, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      double double0 = FastMath.scalb((-6.56149137290163E-310), 1706);
      assertEquals((-2.3668741412998406E204), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1706, (-1846));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-1038));
      assertEquals(1.066631422053E-312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      double double0 = FastMath.scalb((-1730.1379), (-1038));
      assertEquals((-5.8741525465432E-310), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      double double0 = FastMath.scalb((-1730.2286046618474), (-1023));
      assertEquals((-1.924943218737234E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      double double0 = FastMath.scalb((-7.489923835540476), 2099);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2099, 2099);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-3415), (-3415));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      double double0 = FastMath.scalb(1249.8615171749, (-3235));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, (-4647));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, 1408);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 8388628);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      double double0 = FastMath.scalb((-512.9), 1974);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      double double0 = FastMath.ulp(3643.213261984);
      assertEquals(4.547473508864641E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      double double0 = FastMath.abs((-1036.5));
      assertEquals(1036.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      float float0 = FastMath.abs((-972.37F));
      assertEquals(972.37F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      float float0 = FastMath.ulp(769.71F);
      assertEquals(6.1035156E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      long long0 = FastMath.abs((long) (-1023));
      assertEquals(1023L, long0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      long long0 = FastMath.abs((long) 660);
      assertEquals(660L, long0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      int int0 = FastMath.abs((-2156));
      assertEquals(2156, int0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      int int0 = FastMath.abs(4021);
      assertEquals(4021, int0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      double double0 = FastMath.toDegrees(1211.0);
      assertEquals(69385.18899034269, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      double double0 = FastMath.toDegrees(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      double double0 = FastMath.toRadians(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      double double0 = FastMath.toRadians(1.4352697002457768E131);
      assertEquals(2.5050181923400872E129, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      double double0 = FastMath.cbrt(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      double double0 = FastMath.cbrt(0.49999999999999994);
      assertEquals(0.7937005259840997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      double double0 = FastMath.acos(0.6750115999998343);
      assertEquals(0.8298159024388065, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double double0 = FastMath.acos(-0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      double double0 = FastMath.acos((-3.4028235E38F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      double double0 = FastMath.acos(2089.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double double0 = FastMath.asin(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      double double0 = FastMath.asin((-648.4691893583416));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      double double0 = FastMath.asin(3674.6475083774);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      double double0 = FastMath.atan2(722.105788, 722.105788);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      double double0 = FastMath.atan2(1047.211F, (-2.2250738585072014E-308));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      double double0 = FastMath.atan2(1500, 2.2250738585072014E-308);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      double double0 = FastMath.atan2((-7.635830383612894E-133), 0.0F);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double double0 = FastMath.atan2(656.1629901165854, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      double double0 = FastMath.atan2(2424.6893362195824, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      double double0 = FastMath.atan2((-574.213), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      double double0 = FastMath.atan2(1.2743576537773829, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      double double0 = FastMath.atan2((-7.44321345601866E-11), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, (-567.534912109375));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 1.2223710200753275);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, (-8.601714863281504));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-12.8335424935897));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 1.2223710200753275);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      double double0 = FastMath.atan2((-5.7618793749770706E-8), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      double double0 = FastMath.asin(1.2622530679915087E-16);
      assertEquals(1.2622530679915087E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      double double0 = FastMath.atan2(8.0E298, (-567.534912109375));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), (-1.4015110811648513E195));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      double double0 = FastMath.tan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      double double0 = FastMath.sin((-1515.1346427934066));
      assertEquals((-0.7751697598677956), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      double double0 = FastMath.sin((-1086.28438));
      assertEquals(0.6493110088369964, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      double double0 = FastMath.tan(8388642);
      assertEquals((-1.5729440458519441), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028235E38F));
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      double double0 = FastMath.tan(8.444844270993298E7);
      assertEquals(0.6677112993869599, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      double double0 = FastMath.tan(1.4096049122803999E296);
      assertEquals((-0.3099703440183827), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      double double0 = FastMath.sin((-4.690417668647599E88));
      assertEquals((-0.9989932510869961), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      double double0 = FastMath.cos(6.369051672525773E15);
      assertEquals(0.24977260231155868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      double double0 = FastMath.cos(8388608);
      assertEquals((-0.9017546737587593), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      double double0 = FastMath.cos(8.0E298);
      assertEquals((-0.9991033281235678), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028233E38F));
      assertEquals((-0.7665377443470253), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      double double0 = FastMath.tan((-0.2499999701976776));
      assertEquals((-0.2553418894756177), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      double double0 = FastMath.sin(6.311265339957543E-17);
      assertEquals(6.311265339957543E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      double double0 = FastMath.pow(2594.879094844237, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double double0 = FastMath.pow((-1675.0), 242);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      double double0 = FastMath.pow(0.041666663879186654, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      double double0 = FastMath.pow((-2394.0), (-2394.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      double double0 = FastMath.pow((-498.7049191759338), (-498.7049191759338));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      double double0 = FastMath.pow((-1.7976931348623157E308), (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      double double0 = FastMath.pow((-1730.2286046618474), 1.817649308779104E117);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      double double0 = FastMath.pow(0.19999998807907104, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      double double0 = FastMath.pow((-853.240038781591), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 20.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 4.438921624363781E-8);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-2394.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      double double0 = FastMath.pow(4.983191803254889E-7, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double double0 = FastMath.pow((-1298.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 1840.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-7.44321345601866E-11));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-167));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-2394.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (-2413.877452988509));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 0.0875862700108075);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      double double0 = FastMath.pow((-1.899407107267079E-8), 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      double double0 = FastMath.log1p(6.311265339957543E-17);
      assertEquals(6.311265339957543E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      double double0 = FastMath.log1p(1964.9254855919644);
      assertEquals(7.583718398458802, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      double double0 = FastMath.log1p((-567.534912109375));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      double double0 = FastMath.log10(0.9978052709326276);
      assertEquals((-9.54206218736877E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      double double0 = FastMath.atanh(0.28997974985912256);
      assertEquals(0.2985441542475325, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      double double0 = FastMath.pow(0.8414709568023682, 0.8414709568023682);
      assertEquals(0.8648137894591263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324);
      assertEquals((-744.4400719213812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      double double0 = FastMath.asinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      double double0 = FastMath.expm1((-5.755303038890997E-8));
      assertEquals((-5.755302873273435E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      double double0 = FastMath.pow((-0.48128303078673396), (-1.0));
      assertEquals((-2.077779468695043), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      double double0 = FastMath.expm1((-739.68838));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      double double0 = FastMath.exp((-725.6109597410466));
      assertEquals(7.43300075E-316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      double double0 = FastMath.exp((-1073.11472));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      float float0 = FastMath.signum((-2617.6045F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      float float0 = FastMath.signum(1308.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      double double0 = FastMath.signum((-8.885865156265888));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      double double0 = FastMath.signum(2.718281828459045);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      double double0 = FastMath.atanh(0.026085407970470632);
      assertEquals(0.026091326979527082, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      double double0 = FastMath.atanh((-1577.920023924033));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      double double0 = FastMath.atanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333329196);
      assertEquals(0.008333236885725868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      double double0 = FastMath.asinh(0.11111095942313305);
      assertEquals(0.11088359754107008, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      double double0 = FastMath.tanh(6.311265339957543E-17);
      assertEquals(6.311265339957543E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      double double0 = FastMath.tanh(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      double double0 = FastMath.tanh(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      double double0 = FastMath.tanh(8.0E298);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      double double0 = FastMath.tanh((-0.49999999999999994));
      assertEquals((-0.46211715726000974), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      double double0 = FastMath.sinh(1.0493479260117497E-96);
      assertEquals(1.0493479260117497E-96, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      double double0 = FastMath.sinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      double double0 = FastMath.sinh((-555.805));
      assertEquals((-1.2078542132995396E241), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      double double0 = FastMath.sinh(988.874263208);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      double double0 = FastMath.sinh(311.0);
      assertEquals(5.8150556630007905E134, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      double double0 = FastMath.cosh(1.3574569976673652E-8);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      double double0 = FastMath.cosh((-483.952859));
      assertEquals(7.534009601446067E209, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      double double0 = FastMath.cosh(176.0513F);
      assertEquals(1.4357477601720758E76, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      double double0 = FastMath.cosh(2089.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      double double0 = FastMath.atan2((-1.924943218737234E-305), (-1730.2286046618474));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      double double0 = FastMath.hypot(1.2622530679915087E-16, 9.79045937979623E-8);
      assertEquals(9.79045937979623E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      double double0 = FastMath.log(5.2240336371356666E-9, 7.387899219930507E-9);
      assertEquals(0.981826236871242, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      int int0 = FastMath.getExponent(-0.0F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      double double0 = FastMath.cosh((-2815.6383682));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      double double0 = FastMath.nextUp((-3.6754317105801715E46));
      assertEquals((-3.675431710580171E46), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1730.1379), (-1730.1379));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      double double0 = FastMath.atan((-6.540181860667302E168));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      double double0 = FastMath.acosh((-2.041660381232962E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      double double0 = FastMath.acos((-1.458843364504023E-8));
      assertEquals(1.5707963413833304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      double double0 = FastMath.expm1(2448.5245029911225);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      int int0 = FastMath.round(1194.3079F);
      assertEquals(1194, int0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      long long0 = FastMath.round(0.795694864977687);
      assertEquals(1L, long0);
  }
@Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      FastMath.getExponent((-60.5F));
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      FastMath.copySign((-5897.2F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      FastMath.copySign(0.0F, (-1139.7412F));
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      FastMath.copySign((-2799.3646248407995), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      FastMath.copySign(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      FastMath.hypot(2.608736797081283E-8, 2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      FastMath.max((long) Integer.MIN_VALUE, 1L);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      FastMath.max((-1553), 52);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      FastMath.min((-1308L), (-915L));
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      FastMath.rint((-809.0272F));
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      FastMath.rint(808.5F);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      FastMath.scalb((-1748.6122F), 276);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      FastMath.scalb(315.6F, (-277));
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      FastMath.scalb(1.5707963267948966, (-1023));
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      FastMath.scalb(3.3058299602856804E-8, 2097);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      FastMath.scalb(7.739359202689098, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      FastMath.scalb(Double.POSITIVE_INFINITY, 1024);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      FastMath.ulp((-1196.8727F));
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      FastMath.ulp(1189.354);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      FastMath.cbrt(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      FastMath.asin((-1.0188117475357564E-260));
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      FastMath.atan2(0.0, 2159.1373942400223);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      FastMath.atan2(2425.660888671875, (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      FastMath.tan((-1.8097633115378247E227));
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      FastMath.log1p((-1311.251527));
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      FastMath.exp((-746.2F));
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      FastMath.tanh(0.5F);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      FastMath.atan2((-2.2250738585072014E-308), 1.0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      FastMath.toRadians(3.145894820876798E-6);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      FastMath.sqrt(9.313225746154785E-10);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      FastMath.signum(0.0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      FastMath.round(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      FastMath.round(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      FastMath.round(0.99);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Random.setNextRandom(94);
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      FastMath.pow((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      FastMath.nextAfter(-0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      FastMath.nextAfter(4.9E-324, (double) (-809.02716F));
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      FastMath.min((long) 52, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      FastMath.min(898, 1906);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      FastMath.min((float) 1710L, (float) 1710L);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      FastMath.max((-152L), (-152L));
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      FastMath.max(0, (-1073741824));
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      FastMath.max((-855), (-1978680545));
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      FastMath.log(996.7, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      FastMath.log(2091.9175, (double) 0L);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      FastMath.log((double) 970500337);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      FastMath.log(9.313225746154785E-10);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      FastMath.getExponent((double) 1L);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      FastMath.getExponent(8.51332686506487);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      FastMath.copySign((float) 0L, 1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      FastMath.copySign((double) 0.0F, 0.28082263469696045);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      FastMath.ceil((-487.935871));
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      FastMath.atan((-10.644372659806171));
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      FastMath.acosh(1L);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      FastMath.acosh(2490.35294605);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      FastMath.acosh((-2146281922));
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      FastMath.IEEEremainder(2580.5426, 2580.5426);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      FastMath.IEEEremainder((-2236.0), 812.6485406021862);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      FastMath.IEEEremainder(1158.6832, 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-307.7315929062), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      double double0 = FastMath.copySign(0.7872846506228863, (-3.1709446793400893E-7));
      assertEquals((-0.7872846506228863), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      double double0 = FastMath.floor((-5436.0));
      assertEquals((-5436.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      double double0 = FastMath.floor((-3.7269289985326055E-143));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      double double0 = FastMath.floor(6.000235114895513E123);
      assertEquals(6.000235114895513E123, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      float float0 = FastMath.nextAfter(3.4028235E38F, 4.940883275207154E117);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), 8.849812639395597E201);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 262.2096549);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 3.141592653589793);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 0.0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      double double0 = FastMath.nextAfter(1132.5, 3919.98);
      assertEquals(1132.5000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2260.165701), 291.04110370252886);
      assertEquals((-2260.1657009999994), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 1347.5);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-1451.8));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 5024);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1176, (-643));
      assertEquals(3.2219597430423525E-191, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      double double0 = FastMath.abs(0.1428571343421936);
      assertEquals(0.1428571343421936, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      float float0 = FastMath.copySign((-1513.7472F), 2814.1604F);
      assertEquals(1513.7472F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      float float0 = FastMath.copySign(2811.9595F, (float) (-127));
      assertEquals((-2811.9595F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      float float0 = FastMath.copySign((-335.0F), (-335.0F));
      assertEquals((-335.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      double double0 = FastMath.copySign((-2203.0), (-2203.0));
      assertEquals((-2203.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      double double0 = FastMath.copySign((-854.08), 0.2);
      assertEquals(854.08, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      double double0 = FastMath.hypot(2514.0, (-1.4E-45F));
      assertEquals(2514.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      double double0 = FastMath.hypot(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 0.4505495340698077);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      double double0 = FastMath.hypot(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      double double0 = FastMath.max((-709.1727168039549), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      double double0 = FastMath.max((-2562.482803001), 650.040527);
      assertEquals(650.040527, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      double double0 = FastMath.max(1361.67766, 0.3333333333332802);
      assertEquals(1361.67766, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      double double0 = FastMath.max((-156.0221521392), (-156.0221521392));
      assertEquals((-156.0221521392), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      float float0 = FastMath.max((float) 1586L, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      float float0 = FastMath.max((-335.0F), (-335.0F));
      assertEquals((-335.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      float float0 = FastMath.max(Float.POSITIVE_INFINITY, 1007.623F);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      float float0 = FastMath.max((-1638.454F), (-468.97098F));
      assertEquals((-468.97098F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      long long0 = FastMath.max(1710L, (-1760L));
      assertEquals(1710L, long0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      int int0 = FastMath.max(1156, 1156);
      assertEquals(1156, int0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      double double0 = FastMath.min(1403.0000000000002, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      double double0 = FastMath.min(709.9402424122574, 709.9402424122574);
      assertEquals(709.9402424122574, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      double double0 = FastMath.min((double) Float.POSITIVE_INFINITY, (double) 989);
      assertEquals(989.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      double double0 = FastMath.min((-2207.5153712), (-1072.1891125610491));
      assertEquals((-2207.5153712), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, (-687.06903F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      float float0 = FastMath.min((-298.1F), 1175.7823F);
      assertEquals((-298.1F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      float float0 = FastMath.min((float) 274L, (-453.5797F));
      assertEquals((-453.5797F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      long long0 = FastMath.min((-4566309173549072384L), (-4566309173549072384L));
      assertEquals((-4566309173549072384L), long0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      long long0 = FastMath.min(1158L, 71L);
      assertEquals(71L, long0);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      int int0 = FastMath.min(898, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      double double0 = FastMath.rint(1422.773);
      assertEquals(1423.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      double double0 = FastMath.rint((-1.4E-45F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      double double0 = FastMath.ceil((-1.4E-45F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      double double0 = FastMath.floor(0.4906970000000115);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      double double0 = FastMath.ceil(1755.1128322706);
      assertEquals(1756.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      double double0 = FastMath.floor((-2.0769187E34F));
      assertEquals((-2.076918743413931E34), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 989);
      assertEquals(989.00006F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      float float0 = FastMath.nextAfter(5327.521F, 0.087);
      assertEquals(5327.5205F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1395.74374603));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.0918686389923096);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-335), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      double double0 = FastMath.nextUp((double) 892);
      assertEquals(892.0000000000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-14.36332));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 2135.8643368543);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      double double0 = FastMath.nextAfter((-750.9979), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      float float0 = FastMath.scalb((float) 128, 128);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 255);
      assertEquals((-8.112964E31F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      float float0 = FastMath.scalb((-746.2F), (-136));
      assertEquals((-8.565957E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-150), (-150));
      assertEquals((-1.05E-43F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      float float0 = FastMath.scalb((float) 989, 989);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 2112);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2122, (-1073741823));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1795), (-1795));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-606));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-2098));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-2142772008));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 114);
      assertEquals((-2.0769187E34F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      float float0 = FastMath.scalb((-0.39525533F), 128);
      assertEquals((-1.3449842E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      float float0 = FastMath.scalb((-1450.8405F), (-162));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      double double0 = FastMath.scalb(2.2250738585072014E-308, 1417);
      assertEquals(8.069530869021589E118, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      double double0 = FastMath.scalb(2308.6484573054454, (-1054));
      assertEquals(1.1960308373E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      double double0 = FastMath.scalb((-1647.823), (-1087));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      double double0 = FastMath.scalb(2.2250738585072014E-308, 2097151);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      double double0 = FastMath.scalb((-1.2611620861764292), 1417);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      double double0 = FastMath.scalb(1.625, (-3366));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 2097);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      double double0 = FastMath.scalb((-0.4017794081812231), 2146622993);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      double double0 = FastMath.scalb((-1247.80808617645), (-715827883));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      double double0 = FastMath.ulp(0.9285714285714286);
      assertEquals(1.1102230246251565E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      double double0 = FastMath.abs((-3307.0));
      assertEquals(3307.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      double double0 = FastMath.hypot((-9.860761315262648E-32), 1.8267512321472168);
      assertEquals(1.8267512321472168, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      float float0 = FastMath.abs((-1.0F));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      float float0 = FastMath.abs(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      long long0 = FastMath.abs((-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      long long0 = FastMath.abs((long) 94);
      assertEquals(94L, long0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      int int0 = FastMath.abs((-1357));
      assertEquals(1357, int0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      int int0 = FastMath.abs(94);
      assertEquals(94, int0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1744.8288));
      assertEquals((-99971.32621287601), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      double double0 = FastMath.toRadians((-710.0));
      assertEquals((-12.39183768915974), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      double double0 = FastMath.cbrt(204.513890451131);
      assertEquals(5.891704231658267, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      double double0 = FastMath.acos((-654.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      double double0 = FastMath.acos(989);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      double double0 = FastMath.asin((-4.503599627370496E15));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      double double0 = FastMath.asin(4.90334700062756E236);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double double0 = FastMath.atan2((-734.28), (-4.9E-324));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      double double0 = FastMath.atan2(1941.0, 2.2250738585072014E-308);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      double double0 = FastMath.atan2(0.3374482989311218, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      double double0 = FastMath.atan2((-1714.5), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      double double0 = FastMath.atan2((-277.05), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double double0 = FastMath.atan2(4240.43729708735, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 2131148005);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 1609.1537028909);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 2.1970362663269043);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      double double0 = FastMath.atan2(1.4E-45F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      double double0 = FastMath.atan2((-710.0), (-710.0));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      double double0 = FastMath.asin(1.2829599363166098E-7);
      assertEquals(1.2829599363166132E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      double double0 = FastMath.sin(3721.301);
      assertEquals(0.9964318449406109, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      double double0 = FastMath.sin((-1738.34948));
      assertEquals(0.8667968766708142, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      double double0 = FastMath.sin((-4.3088693800637676E99));
      assertEquals((-0.3815137609284476), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      double double0 = FastMath.tan(4.641652786683918E38);
      assertEquals(1.404270118027582, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      double double0 = FastMath.sin(4.262295966E9);
      assertEquals((-0.5382381068107466), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      double double0 = FastMath.cos(3294231.1532799266);
      assertEquals(0.4721899708038844, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      double double0 = FastMath.cos(1.7976931348623157E308);
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      double double0 = FastMath.tan((-3.1669480241588855E48));
      assertEquals(0.6650062978059614, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      double double0 = FastMath.cos(1.633123935319537E16);
      assertEquals((-0.28443016146380146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      double double0 = FastMath.tan(9.608060944124859E-295);
      assertEquals(9.608060944124859E-295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      double double0 = FastMath.tan(8.0E298);
      assertEquals((-0.04237639320697582), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      double double0 = FastMath.sin((-0.35422252851104036));
      assertEquals((-0.3468612668448818), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      double double0 = FastMath.pow(5.808043506069512E13, 3116);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      double double0 = FastMath.pow((-4.1992274260857037E-7), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      double double0 = FastMath.pow(1199.4879221052918, (-3189));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      double double0 = FastMath.pow(340.9284599853339, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      double double0 = FastMath.pow(1719.717789870808, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.4E-45F), (-1232.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double double0 = FastMath.pow((-0.5837463452719329), (-0.5837463452719329));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), (double) (-3.4028235E38F));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      double double0 = FastMath.pow((double) (-335), 3.505791114318544E95);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      double double0 = FastMath.pow(1.7660059778220905E-220, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double double0 = FastMath.pow(1080.96015, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 11);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 94);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1232.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.7660059778220905E-220);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      double double0 = FastMath.pow(6.519765758635405E-145, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      double double0 = FastMath.pow(1.9369852542877197, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-2.7512502471075893E-17));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 594);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) 597);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-335.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 1.4E-45F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-731.86257));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-2744.143323));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      double double0 = FastMath.log1p(2664.6663251694);
      assertEquals(7.888209333554256, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      double double0 = FastMath.asinh(0.6416587670260064);
      assertEquals(0.6042173386695118, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      double double0 = FastMath.log1p((-0.2499999701976776));
      assertEquals((-0.28768203271535187), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-2.2250738585072014E-308));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      double double0 = FastMath.expm1(3.4028234663852886E38);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      double double0 = FastMath.expm1((-709.1727168039549));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      double double0 = FastMath.expm1((-730.3825950097958));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      double double0 = FastMath.exp((-710.0));
      assertEquals(4.47628622567513E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      double double0 = FastMath.exp((-709.1727168039549));
      assertEquals(1.0237699449184023E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      float float0 = FastMath.signum((-0.118474126F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      float float0 = FastMath.signum(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      double double0 = FastMath.signum(Double.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      double double0 = FastMath.signum(3.141592653589793);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      double double0 = FastMath.atanh(0.046532762799593216);
      assertEquals(0.04656639226739721, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      double double0 = FastMath.atanh((-20.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      double double0 = FastMath.atanh((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      double double0 = FastMath.asinh(0.010379437162469037);
      assertEquals(0.010379250804011152, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      double double0 = FastMath.tanh((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      double double0 = FastMath.tanh(2669.8445097);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      double double0 = FastMath.tanh((-1787.500620515202));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      double double0 = FastMath.sinh(0.1428571343421936);
      assertEquals(0.14334353897047872, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      double double0 = FastMath.sinh((-641.8));
      assertEquals((-2.686386459917724E278), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      double double0 = FastMath.sinh(305.6609557);
      assertEquals(2.7914920678460357E132, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      double double0 = FastMath.sinh(2131148009);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      double double0 = FastMath.sinh((-3016.894061640602));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      double double0 = FastMath.cosh((-709.1727168039549));
      assertEquals(4.883909734621596E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      double double0 = FastMath.cosh(1609.1537028909);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      double double0 = FastMath.cosh(150.05);
      assertEquals(7.325832994484652E64, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-1.5707963267948966));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      double double0 = FastMath.acos(3.4439717236742845E-8);
      assertEquals(1.5707962923551795, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      double double0 = FastMath.log(3.141592653589793, 3.141592653589793);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      String[] stringArray0 = new String[6];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      double double0 = FastMath.cosh((-2207.1549557));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      double double0 = FastMath.atan(Double.POSITIVE_INFINITY);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      double double0 = FastMath.acos((-0.4017794081812231));
      assertEquals(1.9842554908278778, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      double double0 = FastMath.expm1((-4.278201128741098E-9));
      assertEquals((-4.2782011195895956E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      int int0 = FastMath.round((float) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      long long0 = FastMath.round((double) (-809.0272F));
      assertEquals((-809L), long0);
  }
@Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      FastMath.copySign((float) (-726L), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      FastMath.copySign(592.3F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      FastMath.copySign(0.0F, (-842.0936F));
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      FastMath.copySign((-3015.6891491139427), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      FastMath.copySign(2858.196123, 2521.227939270575);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      FastMath.hypot((-170.8274610176), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      FastMath.max(191, 191);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      FastMath.min((long) (-21), 811L);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      FastMath.rint(2525.654);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      FastMath.rint((-0.5));
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      FastMath.round(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      FastMath.scalb((-2606.0F), 276);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      FastMath.scalb(1.5707963267948966, (-1023));
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      FastMath.scalb(1.2246467991473532E-16, 2097);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      FastMath.scalb((-20.0), (-2098));
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      FastMath.ulp(1103.87899735912);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      FastMath.cbrt((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      FastMath.asin((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      FastMath.atan2(0.0, 4.9E-324);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      FastMath.pow(-0.0, (double) 203);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      FastMath.expm1(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      FastMath.cosh(1563);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      FastMath.atan2(2.2250738585072014E-308, 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      FastMath.toRadians(2497.08943961);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      FastMath.toDegrees(2.968781250496917E198);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      FastMath.sqrt(3.0415914564212585);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      FastMath.signum(0.0);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      FastMath.round((-0.1666666567325592));
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      FastMath.pow(1665.456119205514, (-2511));
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      FastMath.pow((-1036.251469), 5);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      FastMath.min(2089L, 2089L);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      FastMath.min(2082.5315F, 2582.243F);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      FastMath.min(0.0, 1.2391595516612638E-199);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      FastMath.max((-1552L), (long) (-13));
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      FastMath.max((-127), 0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      FastMath.max((-13), (-1107));
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      FastMath.max((float) (-1418), (float) (-1418));
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      FastMath.max(-0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      FastMath.log10(3328.348415798282);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      FastMath.log(270.47938, (double) 1.0F);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      FastMath.log(0.07692307692307693, 0.07692307692307693);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      FastMath.log(0.15, 1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      FastMath.getExponent(1.5707963267950042);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      FastMath.getExponent(0.7346880061528503);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      FastMath.copySign(-0.0F, (float) 2145603708);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      FastMath.ceil(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      FastMath.atan(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      FastMath.atan((-286.5092));
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      FastMath.acosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      FastMath.acosh((-1.3850458263351744E91));
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      FastMath.IEEEremainder((-3.4028235E38F), (-1769.4763234));
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      FastMath.IEEEremainder((-818.965302363062), 5187.943);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      String[] stringArray0 = new String[10];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, (-1.0E-6));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      double double0 = FastMath.floor((-1107.827032374512));
      assertEquals((-1108.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      double double0 = FastMath.floor((-9223372036854775808L));
      assertEquals((-9.223372036854776E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      double double0 = FastMath.floor(9.737174542364203E181);
      assertEquals(9.737174542364203E181, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      double double0 = FastMath.floor(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      float float0 = FastMath.nextAfter(726.2314F, Double.POSITIVE_INFINITY);
      assertEquals(726.23145F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), 0.0);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 154.45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 1689.828476713218);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      double double0 = FastMath.nextAfter((-8.0E298), 8.0E298);
      assertEquals((-7.999999999999999E298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 1.0F, 1.2423699995465188E-9);
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.3678794503211975);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 0.5);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      double double0 = FastMath.abs(1.0E-6);
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      int int0 = FastMath.getExponent(2.968781250496917E198);
      assertEquals(659, int0);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      float float0 = FastMath.copySign((-3809.655F), (-3809.655F));
      assertEquals((-3809.655F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      float float0 = FastMath.copySign((float) 1024, (-2566.8F));
      assertEquals((-1024.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      float float0 = FastMath.copySign(2098.0F, 1.0F);
      assertEquals(2098.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      double double0 = FastMath.copySign((-227.8715811), 0.4342944622039795);
      assertEquals(227.8715811, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      double double0 = FastMath.copySign((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      double double0 = FastMath.hypot(8.0E298, (-1.0440854056870505E-160));
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      double double0 = FastMath.hypot((-2821.3032817250323), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 10.5525527825);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      double double0 = FastMath.hypot(5.826233477413577E-8, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      double double0 = FastMath.max((-4.9E-324), (-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      double double0 = FastMath.max(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      double double0 = FastMath.max((-688.03778262327), (-430.3314860337));
      assertEquals((-430.3314860337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      double double0 = FastMath.max(1.2118879476428366, (-913.0));
      assertEquals(1.2118879476428366, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      double double0 = FastMath.max(3.141592653589793, 3.141592653589793);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      float float0 = FastMath.max((float) 1025, (float) 1025);
      assertEquals(1025.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, (float) 2102);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      float float0 = FastMath.max(2378.2F, (-2068.647F));
      assertEquals(2378.2F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      float float0 = FastMath.max(0.0F, 575.79675F);
      assertEquals(575.79675F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      long long0 = FastMath.max((-2516L), 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      long long0 = FastMath.max(4499201580859392L, 1L);
      assertEquals(4499201580859392L, long0);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, 0.42342661571378354);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      double double0 = FastMath.min(3547.861332077603, 3547.861332077603);
      assertEquals(3547.861332077603, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      double double0 = FastMath.min((-787.2004), (-1574.8278708407));
      assertEquals((-1574.8278708407), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      float float0 = FastMath.min((-3172.1929F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), 1857.27F);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      float float0 = FastMath.min(346.31F, (-1228.821F));
      assertEquals((-1228.821F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      float float0 = FastMath.min(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      long long0 = FastMath.min(3039L, (long) (-2535));
      assertEquals((-2535L), long0);
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      int int0 = FastMath.min(6, 410);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      int int0 = FastMath.min(514, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      double double0 = FastMath.rint((-3.940510424527919E-20));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      double double0 = FastMath.rint((-2146.163966));
      assertEquals((-2146.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      double double0 = FastMath.ceil((-0.825633981867378));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      double double0 = FastMath.ceil(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      double double0 = FastMath.ceil((-1038.2178297));
      assertEquals((-1038.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      int int0 = FastMath.round(Float.POSITIVE_INFINITY);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      float float0 = FastMath.nextUp(2977.0483F);
      assertEquals(2977.0486F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      float float0 = FastMath.nextAfter(1851.5F, 1300.0);
      assertEquals(1851.4999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1.0));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.01);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 4.23719669792332E-8);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      double double0 = FastMath.nextUp(1588.518277839163);
      assertEquals(1588.5182778391631, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      double double0 = FastMath.nextAfter((-7.800414592973399E-9), (-2015.171993));
      assertEquals((-7.8004145929734E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-670.4));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 10.15104052361048);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      double double0 = FastMath.nextAfter(1753.8, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2535), 128);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      float float0 = FastMath.scalb(6.1035156E-5F, 128);
      assertEquals(2.0769187E34F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-9223372036854775808L), (-255));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      float float0 = FastMath.scalb(3600.069F, (-142));
      assertEquals(6.45731E-40F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      float float0 = FastMath.scalb((float) 10, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-713), 3242);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      float float0 = FastMath.scalb(1731.0F, 128);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-713), (-713));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      float float0 = FastMath.scalb(3477.1438F, (-2143451089));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-3235));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1353);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      float float0 = FastMath.scalb(637.995F, 3);
      assertEquals(5103.96F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      float float0 = FastMath.scalb(2393.5017F, 1977442548);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-1226));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      double double0 = FastMath.scalb((-788.974563583767), 1063);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      double double0 = FastMath.scalb(1.7827257129423813E-8, 1025);
      assertEquals(6.409587550998093E300, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      double double0 = FastMath.scalb(1.277937375351209E8, (-1064));
      assertEquals(6.4653819361E-313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-752.08685F), (-1023));
      assertEquals((-8.367243979990451E-306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      double double0 = FastMath.scalb(1.633123935319537E16, (-1139));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2119, 2119);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      double double0 = FastMath.scalb((-4.9E-324), 1938);
      assertEquals((-1.2300315572313621E260), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2514), (-2514));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, 1073741835);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, 1024);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1489);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      double double0 = FastMath.scalb((-2.147483648E9), 2146869010);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      double double0 = FastMath.scalb((-0.12502530217170715), (-425));
      assertEquals((-1.4429449270419658E-129), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      double double0 = FastMath.scalb(934.70895, (-2529));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      float float0 = FastMath.ulp((-3841.485F));
      assertEquals(2.4414062E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      double double0 = FastMath.abs((double) (-752.08685F));
      assertEquals(752.0868530273438, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      float float0 = FastMath.abs((-279.0F));
      assertEquals(279.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      float float0 = FastMath.abs(1.07374182E9F);
      assertEquals(1.07374182E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      long long0 = FastMath.abs((-1024L));
      assertEquals(1024L, long0);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      long long0 = FastMath.abs((long) 2146168593);
      assertEquals(2146168593L, long0);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      int int0 = FastMath.abs((-2146168593));
      assertEquals(2146168593, int0);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      int int0 = FastMath.abs(2736);
      assertEquals(2736, int0);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      double double0 = FastMath.toDegrees((-585.2896));
      assertEquals((-33534.62387290014), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      double double0 = FastMath.toDegrees(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      double double0 = FastMath.toRadians((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      double double0 = FastMath.toRadians((-3010.2176303348));
      assertEquals((-52.5382088509238), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      double double0 = FastMath.cbrt(1374.15027);
      assertEquals(11.117609335244008, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      double double0 = FastMath.acos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      double double0 = FastMath.acos(1326);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      double double0 = FastMath.asin(5.196515905786975E-17);
      assertEquals(5.196515905786975E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      double double0 = FastMath.asin(1);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      double double0 = FastMath.asin((-632.3004061719934));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      double double0 = FastMath.asin(673.247885614653);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      double double0 = FastMath.atan2(1820.134288, 1820.134288);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      double double0 = FastMath.atan2(163.31547757713, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      double double0 = FastMath.atan2(1023.50745, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      double double0 = FastMath.atan2((-3017.427781193031), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      double double0 = FastMath.atan2(1024, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      double double0 = FastMath.atan2(Integer.MIN_VALUE, Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      double double0 = FastMath.atan2(4.503599627370496E15, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      double double0 = FastMath.atan2((-3245.2455951229), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 1.073741824E9);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      double double0 = FastMath.atan2(0, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-2535));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 1.34217729E8);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      double double0 = FastMath.atan2((-1.1878772398311421E260), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-4829.781791128394));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      double double0 = FastMath.cos((-788.974563583767));
      assertEquals((-0.9069511332119096), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      double double0 = FastMath.cos(4.503599627370496E15);
      assertEquals((-0.4855348677422206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      double double0 = FastMath.sin(3856.163026911003);
      assertEquals((-0.9899412448692827), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      double double0 = FastMath.sin(5.009056963919943E31);
      assertEquals(0.9615912395250954, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      double double0 = FastMath.tan(1.1769263341851E17);
      assertEquals((-15.21098020398446), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      double double0 = FastMath.sin(2.550793060921221E137);
      assertEquals((-0.9607461183761609), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      double double0 = FastMath.sin(3.4028235E38F);
      assertEquals((-0.5218765233336585), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      double double0 = FastMath.tan((-1.7976931348623157E308));
      assertEquals(0.004962015874444895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      double double0 = FastMath.sin((-1.1878772398311421E260));
      assertEquals(0.8753968560035691, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      double double0 = FastMath.tan((-1.1800039972549816E259));
      assertEquals(1.0674480614385164, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      double double0 = FastMath.tan(0.5778634548187256);
      assertEquals(0.6521190646350806, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      double double0 = FastMath.sin((-1.0258469865953145E-7));
      assertEquals((-1.0258469865953126E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      double double0 = FastMath.pow(3.141592653589793, 1);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      double double0 = FastMath.pow((-283.58296), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      double double0 = FastMath.pow(2.595079206183114E-167, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      double double0 = FastMath.pow((double) (-168), (double) (-168));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      double double0 = FastMath.pow((-3.7999795083850525E-8), (double) 1);
      assertEquals((-3.7999795083850525E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      double double0 = FastMath.pow((-1.9755765019779875E222), (-1.9755765019779875E222));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      double double0 = FastMath.pow((-2535.401), 1.4513757076459615E88);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      double double0 = FastMath.pow((-228.58901387), (-65.54));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      double double0 = FastMath.pow(0.4518819265224888, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      double double0 = FastMath.pow(786.576069, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.633123935319537E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-722.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 0.9166666666666666);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      double double0 = FastMath.pow(0.8775825500488281, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      double double0 = FastMath.pow((double) 3813, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      double double0 = FastMath.pow((double) 1, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-2052.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 859.469);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-0.255309132921207));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.0E-6);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (double) 2102);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      double double0 = FastMath.log1p(0.5712664127349854);
      assertEquals(0.4518819265224888, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      double double0 = FastMath.log10(0.8775825500488281);
      assertEquals((-0.05671202090833159), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      double double0 = FastMath.log(0.9931126409017552);
      assertEquals((-0.006911186423841614), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-2460.9646));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      double double0 = FastMath.log(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      double double0 = FastMath.log1p((-9.147992E7F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      double double0 = FastMath.expm1((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      double double0 = FastMath.expm1(1.976868146639626E196);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      double double0 = FastMath.expm1((-710.564740573816));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      double double0 = FastMath.exp((-1.1878772398311421E260));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      double double0 = FastMath.exp((-722.0));
      assertEquals(2.7503253126E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      float float0 = FastMath.signum(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      float float0 = FastMath.signum(1500.221F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1090()  throws Throwable  {
      double double0 = FastMath.signum((-1688.9869468545787));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      double double0 = FastMath.signum(1.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      double double0 = FastMath.atanh((-0.008726646259971648));
      assertEquals((-0.008726867794133135), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      double double0 = FastMath.atanh((-632.152231));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      double double0 = FastMath.asinh((-0.03299460520313482));
      assertEquals((-0.03298862157097858), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      double double0 = FastMath.asinh((-0.12502530217170715));
      assertEquals((-0.12470185366756537), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      double double0 = FastMath.asinh((-3883.333049864));
      assertEquals((-8.95759629446723), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      double double0 = FastMath.tanh((-0.49999999999999994));
      assertEquals((-0.46211715726000974), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      double double0 = FastMath.tanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      double double0 = FastMath.tanh(1814.4);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      double double0 = FastMath.tanh((-548.1894814992606));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      double double0 = FastMath.sinh((-24));
      assertEquals((-1.3244561064921736E10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      double double0 = FastMath.sinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      double double0 = FastMath.sinh(39);
      assertEquals(4.3296700211996872E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      double double0 = FastMath.sinh(1025);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      double double0 = FastMath.sinh((-7.667998948729528E-9));
      assertEquals((-7.667998948729528E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      double double0 = FastMath.cosh((-585.2896));
      assertEquals(7.709276098688136E253, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      double double0 = FastMath.cosh(659.933631381);
      assertEquals(2.016065024979436E286, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      double double0 = FastMath.atan2((-8.367243979990451E-306), (-1023));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 887.93);
      assertEquals(887.93, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      int int0 = FastMath.getExponent(617.6207F);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
      double double0 = FastMath.cosh((-3157.54240687));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1119()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-2.2343978871888277), (-2.2343978871888277));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      double double0 = FastMath.acosh(2.595079206183114E-167);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      double double0 = FastMath.expm1((-1898.6644751));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      int int0 = FastMath.round(Float.NEGATIVE_INFINITY);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      long long0 = FastMath.round((double) Float.NEGATIVE_INFINITY);
      assertEquals((-9223372036854775808L), long0);
  }
@Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      float float0 = FastMath.copySign((-738.2149F), 0.0F);
      assertEquals(738.2149F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, (-318.28F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      float float0 = FastMath.copySign(654.0F, 0.0F);
      assertEquals(654.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      double double0 = FastMath.copySign((-1.984126978977036E-4), (double) 0L);
      assertEquals(1.984126978977036E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      double double0 = FastMath.hypot(1.5707963314569644, (-2.1449709588846198E8));
      assertEquals(2.1449709588846198E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      int int0 = FastMath.min(523, 1203);
      assertEquals(523, int0);
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      double double0 = FastMath.rint(519.747025626015);
      assertEquals(520.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      double double0 = FastMath.rint(0.5F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      double double0 = FastMath.ceil((-1.5574077246549023));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      double double0 = FastMath.rint((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      double double0 = FastMath.rint(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-127));
      assertEquals((-5.877472E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      float float0 = FastMath.scalb(1271.963F, 276);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      double double0 = FastMath.scalb(1.5532162322162244, (-1023));
      assertEquals(1.728010417456686E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      double double0 = FastMath.scalb((-1863.89012508), 2097);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      double double0 = FastMath.scalb(2.3004507636947437E164, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      double double0 = FastMath.scalb(2.2860509143963117E-8, 1024);
      assertEquals(4.1096180347559694E300, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      float float0 = FastMath.ulp(3.4028235E38F);
      assertEquals(2.028241E31F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      double double0 = FastMath.asin((-3.940510424527919E-20));
      assertEquals((-3.940510424527919E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      double double0 = FastMath.atan2(0, 4.11616444656196E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      double double0 = FastMath.acos(6.123233995736766E-17);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      double double0 = FastMath.tan(1.5707963267948966);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0);
      assertEquals((-0.7734333808731876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      double double0 = FastMath.cos((-1.5707963267948966));
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      double double0 = FastMath.cos(3294198.0);
      assertEquals(0.7910146852024715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1153()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      double double0 = FastMath.sin(1.5707963267948966);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
      double double0 = FastMath.sin(3294198.0);
      assertEquals((-0.6117971622964877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1156()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0E-6));
      assertEquals((-1.0000005000003334E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1157()  throws Throwable  {
      double double0 = FastMath.log1p(1.0E-6);
      assertEquals(9.999995000003334E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      double double0 = FastMath.expm1(1.0F);
      assertEquals(1.7182818284590453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0F));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      double double0 = FastMath.signum((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      double double0 = FastMath.tanh(0.5);
      assertEquals(0.46211715726000974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      double double0 = FastMath.tanh((-20.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      double double0 = FastMath.sinh(0.25);
      assertEquals(0.2526123168081683, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      double double0 = FastMath.sinh((-709.782712893384));
      assertEquals((-8.988465674311366E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      double double0 = FastMath.sinh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      double double0 = FastMath.cosh((-709.782712893384));
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      double double0 = FastMath.cosh((-20.0));
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      double double0 = FastMath.cosh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      double double0 = FastMath.toRadians(2.2250738585072014E-308);
      assertEquals(3.8834864931005E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      double double0 = FastMath.toDegrees((-2.2250738585072014E-308));
      assertEquals((-1.2748734119735194E-306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      double double0 = FastMath.sqrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      double double0 = FastMath.sqrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1180()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1181()  throws Throwable  {
      int int0 = FastMath.round(0.5F);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
      int int0 = FastMath.round((-2931.8F));
      assertEquals((-2932), int0);
  }

  @Test(timeout = 4000)
  public void test_1183()  throws Throwable  {
      long long0 = FastMath.round(0.14686977863311768);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1184()  throws Throwable  {
      long long0 = FastMath.round((-2808.99948631));
      assertEquals((-2809L), long0);
  }

  @Test(timeout = 4000)
  public void test_1185()  throws Throwable  {
      double double0 = FastMath.pow((-2075.304864), (-35));
      assertEquals((-7.982397703422408E-117), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (double) -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      long long0 = FastMath.min((-56L), 1608L);
      assertEquals((-56L), long0);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      float float0 = FastMath.min((float) 586, 1528.0F);
      assertEquals(586.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      long long0 = FastMath.max(0L, (-3958705157555305932L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      long long0 = FastMath.max((long) (-1816), (long) (-825));
      assertEquals((-825L), long0);
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      int int0 = FastMath.max(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      float float0 = FastMath.max((-754.5683F), (-754.5683F));
      assertEquals((-754.5683F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      double double0 = FastMath.log1p(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      double double0 = FastMath.log10(3410.47946701);
      assertEquals(3.532815439179849, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      double double0 = FastMath.log((double) -0.0F, 0.5318912267684937);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      double double0 = FastMath.log(440.3985, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      double double0 = FastMath.log(3629.51, 0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      double double0 = FastMath.log(1.633123935319537E16);
      assertEquals(37.33185619326892, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      int int0 = FastMath.getExponent((-1.0F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      int int0 = FastMath.getExponent(Float.POSITIVE_INFINITY);
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      int int0 = FastMath.getExponent(1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      int int0 = FastMath.getExponent((-0.5));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 1378.906F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      double double0 = FastMath.copySign((double) 0, (-1.984126978977036E-4));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      double double0 = FastMath.atanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      double double0 = FastMath.atan((-1128.0321F));
      assertEquals((-1.5699098274354748), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      double double0 = FastMath.acosh(4.5644028026683605);
      assertEquals(2.1992131799233863, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      double double0 = FastMath.acosh((-2.738246981762776E132));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      long long0 = FastMath.abs((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(0.0, 68.66125277345692);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1.0, 1148.0522482482);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-3.4028235E38F), (-7.93844120619577E215));
      assertEquals((-3.4028234663852886E38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      double double0 = FastMath.copySign(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      double double0 = FastMath.floor(3704.385F);
      assertEquals(3704.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      double double0 = FastMath.floor((-1964.9361904822258));
      assertEquals((-1965.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      double double0 = FastMath.floor(8.0E298);
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      float float0 = FastMath.nextAfter(859.2F, 1017.8910645834);
      assertEquals(859.2001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1076.341F), 450.093);
      assertEquals((-1076.3408F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0, 0.7853981633974483);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (double) 3947);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 1.0000005000001665E-6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      double double0 = FastMath.nextAfter((-6.16104291892), (-2658.6));
      assertEquals((-6.161042918920001), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-260), 0.087);
      assertEquals((-259.99999999999994), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0, 942.0993848);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 1.6266731695798413E34);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-3440));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-127), 317);
      assertEquals((-3.3908794195244448E97), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      double double0 = FastMath.abs((-2559.023760057569));
      assertEquals(2559.023760057569, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1242()  throws Throwable  {
      double double0 = FastMath.abs((double) 352);
      assertEquals(352.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1243()  throws Throwable  {
      int int0 = FastMath.getExponent(Double.NaN);
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test_1244()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1245()  throws Throwable  {
      float float0 = FastMath.copySign((-1354.89F), (float) (-971));
      assertEquals((-1354.89F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1246()  throws Throwable  {
      float float0 = FastMath.copySign(2525.1738F, (-2042.12F));
      assertEquals((-2525.1738F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1247()  throws Throwable  {
      float float0 = FastMath.copySign((-1306.7017F), (float) 1388);
      assertEquals(1306.7017F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1248()  throws Throwable  {
      double double0 = FastMath.copySign((-23.6064), 113.10656);
      assertEquals(23.6064, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1249()  throws Throwable  {
      double double0 = FastMath.copySign(3.4328920767283035, (double) (-2144564158));
      assertEquals((-3.4328920767283035), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1250()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1251()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 1.1767205227552116E-179);
      assertEquals(1.1767205227552116E-179, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1252()  throws Throwable  {
      double double0 = FastMath.hypot(2.718281828459045, 0.0F);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1253()  throws Throwable  {
      double double0 = FastMath.hypot((-494), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1254()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1255()  throws Throwable  {
      double double0 = FastMath.hypot(48.3304574119, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1256()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 1575.544562716);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1257()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1258()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, 3639.372189534);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1259()  throws Throwable  {
      double double0 = FastMath.max(1201.2561271717236, 1682.5761829628846);
      assertEquals(1682.5761829628846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1260()  throws Throwable  {
      double double0 = FastMath.max((-1949.437898591), Double.NEGATIVE_INFINITY);
      assertEquals((-1949.437898591), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1261()  throws Throwable  {
      double double0 = FastMath.max((-221.1138472955), (-221.1138472955));
      assertEquals((-221.1138472955), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1262()  throws Throwable  {
      float float0 = FastMath.max(2586.3647F, 2586.3647F);
      assertEquals(2586.3647F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1263()  throws Throwable  {
      float float0 = FastMath.max(2982.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1264()  throws Throwable  {
      float float0 = FastMath.max(2.028241E31F, 3.4028235E38F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1265()  throws Throwable  {
      float float0 = FastMath.max(3668.9797F, 3668.9795F);
      assertEquals(3668.9797F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1266()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1267()  throws Throwable  {
      long long0 = FastMath.max(4503599627370496L, 4503599627370496L);
      assertEquals(4503599627370496L, long0);
  }

  @Test(timeout = 4000)
  public void test_1268()  throws Throwable  {
      int int0 = FastMath.max((-37), 282);
      assertEquals(282, int0);
  }

  @Test(timeout = 4000)
  public void test_1269()  throws Throwable  {
      int int0 = FastMath.max(142010369, 297);
      assertEquals(142010369, int0);
  }

  @Test(timeout = 4000)
  public void test_1270()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1271()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1272()  throws Throwable  {
      double double0 = FastMath.min((-3194.18202392), (-3194.18202392));
      assertEquals((-3194.18202392), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1273()  throws Throwable  {
      double double0 = FastMath.min(3.141592653589793, 6.790321470786489E-301);
      assertEquals(6.790321470786489E-301, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1274()  throws Throwable  {
      double double0 = FastMath.min((-2266.3931903), (-137.66381838));
      assertEquals((-2266.3931903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1275()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1276()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1277()  throws Throwable  {
      float float0 = FastMath.min((-2809.7F), (-2809.7F));
      assertEquals((-2809.7F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1278()  throws Throwable  {
      float float0 = FastMath.min((-3419.7966F), (-4969.55F));
      assertEquals((-4969.55F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1279()  throws Throwable  {
      long long0 = FastMath.min(1655L, 1655L);
      assertEquals(1655L, long0);
  }

  @Test(timeout = 4000)
  public void test_1280()  throws Throwable  {
      long long0 = FastMath.min(4368491638549381120L, 1769L);
      assertEquals(1769L, long0);
  }

  @Test(timeout = 4000)
  public void test_1281()  throws Throwable  {
      int int0 = FastMath.min((-250), (-370));
      assertEquals((-370), int0);
  }

  @Test(timeout = 4000)
  public void test_1282()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1283()  throws Throwable  {
      double double0 = FastMath.rint((-0.12502530217170715));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1284()  throws Throwable  {
      double double0 = FastMath.rint((-3042.076130729));
      assertEquals((-3042.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1285()  throws Throwable  {
      double double0 = FastMath.ceil(1.4E-45F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1286()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1287()  throws Throwable  {
      double double0 = FastMath.floor((-1136));
      assertEquals((-1136.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1288()  throws Throwable  {
      double double0 = FastMath.ceil((-0.16666666666666666));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1289()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1290()  throws Throwable  {
      float float0 = FastMath.nextUp(3668.9795F);
      assertEquals(3668.9797F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1291()  throws Throwable  {
      float float0 = FastMath.nextAfter(1909.946F, (-20.0));
      assertEquals(1909.9459F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1292()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-2031.48));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1293()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-269.0));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1294()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1295()  throws Throwable  {
      float float0 = FastMath.nextAfter((-4805.38F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1296()  throws Throwable  {
      double double0 = FastMath.nextUp(1.2513570453397078);
      assertEquals(1.251357045339708, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1297()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.426849365234375, 0.0);
      assertEquals(1.4268493652343748, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1298()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-1191.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1299()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-18.513948440551758));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1300()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1301()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1302()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 2716.179432);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1303()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1154), 171);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1304()  throws Throwable  {
      float float0 = FastMath.scalb((-0.27805078F), 128);
      assertEquals((-9.461578E37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1305()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-272));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1306()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, (-272));
      assertEquals(4.5E-44F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1307()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 171);
      assertEquals(4194304.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1308()  throws Throwable  {
      float float0 = FastMath.scalb((float) 753, 753);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1309()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-1142));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1310()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1172), (-1172));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1311()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 753);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1312()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 554);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1313()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 3117);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1314()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-21), (-21));
      assertEquals((-1.001358E-5F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1315()  throws Throwable  {
      float float0 = FastMath.scalb((-10.863016F), 746);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1316()  throws Throwable  {
      float float0 = FastMath.scalb((-1961.6F), (-127));
      assertEquals((-1.15292484E-35F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1317()  throws Throwable  {
      double double0 = FastMath.scalb(0.6366197723675814, 1900);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1318()  throws Throwable  {
      double double0 = FastMath.scalb(5.562684646268137E-309, 1900);
      assertEquals(5.03820925841978E263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1319()  throws Throwable  {
      double double0 = FastMath.scalb(2546.4918863648522, (-1064));
      assertEquals(1.2883295E-317, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1320()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1321()  throws Throwable  {
      double double0 = FastMath.scalb((-1332.7), (-1172));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1322()  throws Throwable  {
      double double0 = FastMath.scalb((double) 3862, 3862);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1323()  throws Throwable  {
      double double0 = FastMath.scalb(5.166420404109835E-55, (-1073741824));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1324()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1325()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, (-1906));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1326()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-2142104412));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1327()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-715827883), 2935);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1328()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1073741824), (-1073741824));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1329()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1330()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1331()  throws Throwable  {
      double double0 = FastMath.abs((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1332()  throws Throwable  {
      double double0 = FastMath.ulp(469.575916648042);
      assertEquals(5.6843418860808015E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1333()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1334()  throws Throwable  {
      float float0 = FastMath.abs((-2503.0F));
      assertEquals(2503.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1335()  throws Throwable  {
      float float0 = FastMath.abs(816.0184F);
      assertEquals(816.0184F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1336()  throws Throwable  {
      long long0 = FastMath.abs((-4267615245585081135L));
      assertEquals(4267615245585081135L, long0);
  }

  @Test(timeout = 4000)
  public void test_1337()  throws Throwable  {
      long long0 = FastMath.abs((long) 12);
      assertEquals(12L, long0);
  }

  @Test(timeout = 4000)
  public void test_1338()  throws Throwable  {
      int int0 = FastMath.abs((-784));
      assertEquals(784, int0);
  }

  @Test(timeout = 4000)
  public void test_1339()  throws Throwable  {
      int int0 = FastMath.abs(255);
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test_1340()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1341()  throws Throwable  {
      double double0 = FastMath.toDegrees(3.141592653589793);
      assertEquals(180.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1342()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1343()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1344()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1345()  throws Throwable  {
      double double0 = FastMath.toRadians((-2.724174869314043E-8));
      assertEquals((-4.754582086961629E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1346()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1347()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1348()  throws Throwable  {
      double double0 = FastMath.cbrt(5.562684646268137E-309);
      assertEquals(1.7718548704178574E-103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1349()  throws Throwable  {
      double double0 = FastMath.cbrt(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1350()  throws Throwable  {
      double double0 = FastMath.cbrt(0.5664610474192651);
      assertEquals(0.8274149247522009, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1351()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1352()  throws Throwable  {
      double double0 = FastMath.acos(0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1353()  throws Throwable  {
      double double0 = FastMath.acos(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1354()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1355()  throws Throwable  {
      double double0 = FastMath.acos((-453.3189));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1356()  throws Throwable  {
      double double0 = FastMath.acos(6.588794F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1357()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1358()  throws Throwable  {
      double double0 = FastMath.asin(0.4058506F);
      assertEquals(0.4179093230191796, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1359()  throws Throwable  {
      double double0 = FastMath.asin(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1360()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1361()  throws Throwable  {
      double double0 = FastMath.asin((-2.456511F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1362()  throws Throwable  {
      double double0 = FastMath.asin(157.44539466);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1363()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1364()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1365()  throws Throwable  {
      double double0 = FastMath.atan2(1388, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1366()  throws Throwable  {
      double double0 = FastMath.atan2(1.633123935319537E16, 6.790321470786489E-301);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1367()  throws Throwable  {
      double double0 = FastMath.atan2(1793.3, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1368()  throws Throwable  {
      double double0 = FastMath.atan2((-6.718118142759364), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1369()  throws Throwable  {
      double double0 = FastMath.atan2((-1.5707963267948966), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1370()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1371()  throws Throwable  {
      double double0 = FastMath.atan2((-1108), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1372()  throws Throwable  {
      double double0 = FastMath.atan2(2715.7982083326497, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1373()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 8.136316299122392E-192);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1374()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1375()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1376()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-493.08513726773));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1377()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1378()  throws Throwable  {
      double double0 = FastMath.atan2(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1379()  throws Throwable  {
      double double0 = FastMath.atan2(0, (-221.1138472955));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1380()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1381()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1382()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1383()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 2047);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1384()  throws Throwable  {
      double double0 = FastMath.atan2(1.7534012237555307E-252, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1385()  throws Throwable  {
      double double0 = FastMath.atan2((-1039.6932), (-1039.6932));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1386()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0F), 5.645687086879944E-128);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1387()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-1268.7523837085203));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1388()  throws Throwable  {
      double double0 = FastMath.atan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1389()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1390()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1391()  throws Throwable  {
      double double0 = FastMath.tan(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1392()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1393()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1394()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1395()  throws Throwable  {
      double double0 = FastMath.sin(9);
      assertEquals(0.4121184852417566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1396()  throws Throwable  {
      double double0 = FastMath.sin((-171.42404377293));
      assertEquals((-0.978601683813683), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1397()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1398()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1399()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1400()  throws Throwable  {
      double double0 = FastMath.sin(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1401()  throws Throwable  {
      double double0 = FastMath.cos(3.266247870639074E16);
      assertEquals((-0.8381989664993517), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1402()  throws Throwable  {
      double double0 = FastMath.tan(2.3454138776381036E11);
      assertEquals(24.08407999923893, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1403()  throws Throwable  {
      double double0 = FastMath.tan((-715827841));
      assertEquals(3.2181959632413393, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1404()  throws Throwable  {
      double double0 = FastMath.cos(1.9866116535687868E240);
      assertEquals((-0.9650048749765727), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1405()  throws Throwable  {
      double double0 = FastMath.tan((-4.503599627370496E15));
      assertEquals(1.8005242480088435, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1406()  throws Throwable  {
      double double0 = FastMath.cos(3.277761692053645E12);
      assertEquals((-0.8360236306757013), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1407()  throws Throwable  {
      double double0 = FastMath.cos(7.557687774594392E9);
      assertEquals((-0.4713494449009298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1408()  throws Throwable  {
      double double0 = FastMath.sin(2.9758750368256437E29);
      assertEquals((-0.40681932220136), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1409()  throws Throwable  {
      double double0 = FastMath.sin(2.451245443147225E40);
      assertEquals(0.5024426584895586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1410()  throws Throwable  {
      double double0 = FastMath.cos((-1.7976931348623157E308));
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1411()  throws Throwable  {
      double double0 = FastMath.tan(0.6931470632553101);
      assertEquals(0.8306406796201612, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1412()  throws Throwable  {
      double double0 = FastMath.tan((-5366.275998695));
      assertEquals((-0.46559449307904016), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1413()  throws Throwable  {
      double double0 = FastMath.sin((-1.0F));
      assertEquals((-0.8414709848078965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1414()  throws Throwable  {
      double double0 = FastMath.pow(3294198.0, 95);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1415()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1416()  throws Throwable  {
      double double0 = FastMath.pow((-2683.3719), (-702));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1417()  throws Throwable  {
      double double0 = FastMath.pow(287.427698392707, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1418()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1419()  throws Throwable  {
      double double0 = FastMath.pow((-1711.0), (-1711.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1420()  throws Throwable  {
      double double0 = FastMath.pow((-1.0E-6), (-1.0E-6));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1421()  throws Throwable  {
      double double0 = FastMath.pow((-1055.34902299), (-3.555396360735552E156));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1422()  throws Throwable  {
      double double0 = FastMath.pow((-3142.29571), 1.633123935319537E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1423()  throws Throwable  {
      double double0 = FastMath.pow(0.4824984669685364, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1424()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1425()  throws Throwable  {
      double double0 = FastMath.pow(4.9759187284770303E269, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1426()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1427()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1324.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1428()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-715827883));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1429()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1430()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1431()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 0.38108);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1432()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1433()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1434()  throws Throwable  {
      double double0 = FastMath.pow(8.136316299122392E-192, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1435()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1842.8973191));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1436()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1437()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1438()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 3.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1439()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1073741871));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1440()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1441()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1073741824));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1442()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 4.116164446561962E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1443()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-1940.5));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1444()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, (double) 0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1445()  throws Throwable  {
      double double0 = FastMath.log10(0.0F);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1446()  throws Throwable  {
      double double0 = FastMath.log1p(1682.5761829628846);
      assertEquals(7.428675490302462, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1447()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1448()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1449()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1450()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), 1878.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1451()  throws Throwable  {
      double double0 = FastMath.pow(0.99, 0.99);
      assertEquals(0.9900995033250751, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1452()  throws Throwable  {
      double double0 = FastMath.pow(5.562684646268137E-309, (-709.782712893384));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1453()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1454()  throws Throwable  {
      double double0 = FastMath.log1p((-1.680456060190799));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1455()  throws Throwable  {
      double double0 = FastMath.log(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1456()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0E-6));
      assertEquals((-9.999995000001667E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1457()  throws Throwable  {
      double double0 = FastMath.expm1(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1458()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1459()  throws Throwable  {
      double double0 = FastMath.expm1(2716.179432);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1460()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1461()  throws Throwable  {
      double double0 = FastMath.exp((-721.5698696089561));
      assertEquals(4.2285096026E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1462()  throws Throwable  {
      double double0 = FastMath.expm1((-746.8821781877713));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1463()  throws Throwable  {
      double double0 = FastMath.exp((-928.1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1464()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1465()  throws Throwable  {
      float float0 = FastMath.signum((-2.488684F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1466()  throws Throwable  {
      float float0 = FastMath.signum(1275.2474F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1467()  throws Throwable  {
      double double0 = FastMath.signum(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1468()  throws Throwable  {
      double double0 = FastMath.signum((-200.716281232));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1469()  throws Throwable  {
      double double0 = FastMath.signum(1.4248240407755996E-17);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1470()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333333333);
      assertEquals(0.008333526242605851, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1471()  throws Throwable  {
      double double0 = FastMath.atanh((-0.33333333333333287));
      assertEquals((-0.3465735902799721), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1472()  throws Throwable  {
      double double0 = FastMath.atanh(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1473()  throws Throwable  {
      double double0 = FastMath.asinh(0.027876301141431477);
      assertEquals(0.02787269201274577, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1474()  throws Throwable  {
      double double0 = FastMath.asinh(0.040196798741817474);
      assertEquals(0.0401859817235255, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1475()  throws Throwable  {
      double double0 = FastMath.asinh((-349.207111125));
      assertEquals((-6.548814418452495), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1476()  throws Throwable  {
      double double0 = FastMath.asinh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1477()  throws Throwable  {
      double double0 = FastMath.tanh((-3.940510424527919E-20));
      assertEquals((-3.940510424527919E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1478()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1479()  throws Throwable  {
      double double0 = FastMath.tanh(3703.538F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1480()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1481()  throws Throwable  {
      double double0 = FastMath.tanh((-510.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1482()  throws Throwable  {
      double double0 = FastMath.sinh(1.6985075903314236E-173);
      assertEquals(1.6985075903314236E-173, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1483()  throws Throwable  {
      double double0 = FastMath.sinh((-457.1364293213));
      assertEquals((-1.7013698622787436E198), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1484()  throws Throwable  {
      double double0 = FastMath.sinh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1485()  throws Throwable  {
      double double0 = FastMath.sinh(355.8);
      assertEquals(1.663208383871981E154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1486()  throws Throwable  {
      double double0 = FastMath.sinh(9.023639664212642E195);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1487()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1488()  throws Throwable  {
      double double0 = FastMath.sinh((-1172));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1489()  throws Throwable  {
      double double0 = FastMath.cosh((-259.99999999999994));
      assertEquals(4.126057720906711E112, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1490()  throws Throwable  {
      double double0 = FastMath.cosh(525.7039258499094);
      assertEquals(1.021607601724109E228, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1491()  throws Throwable  {
      double double0 = FastMath.cosh(2716.179432);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1492()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1493()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1494()  throws Throwable  {
      int int0 = FastMath.getExponent(2.4414062E-4F);
      assertEquals((-12), int0);
  }

  @Test(timeout = 4000)
  public void test_1495()  throws Throwable  {
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_1496()  throws Throwable  {
      double double0 = FastMath.cosh((-1108));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1497()  throws Throwable  {
      double double0 = FastMath.atan(33.856285F);
      assertEquals(1.5412682983808903, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1498()  throws Throwable  {
      double double0 = FastMath.acos((-1.9589778310104216E-74));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1499()  throws Throwable  {
      double double0 = FastMath.expm1((-2005.18497));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1500()  throws Throwable  {
      int int0 = FastMath.round((-1.4E-45F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1501()  throws Throwable  {
      long long0 = FastMath.round(0.9305076599121094);
      assertEquals(1L, long0);
  }
@Test(timeout = 4000)
  public void test_1502()  throws Throwable  {
      FastMath.copySign((-2636.789F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1503()  throws Throwable  {
      FastMath.copySign(0.0F, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1504()  throws Throwable  {
      FastMath.copySign(1.4E-45F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1505()  throws Throwable  {
      FastMath.copySign((-1282.6836382705042), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1506()  throws Throwable  {
      FastMath.hypot(2.2860509143963117E-8, 2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_1507()  throws Throwable  {
      FastMath.max((-2384L), 1792L);
  }

  @Test(timeout = 4000)
  public void test_1508()  throws Throwable  {
      FastMath.min(0, 1232);
  }

  @Test(timeout = 4000)
  public void test_1509()  throws Throwable  {
      FastMath.rint((-361.2902676580641));
  }

  @Test(timeout = 4000)
  public void test_1510()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1511()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_1512()  throws Throwable  {
      FastMath.scalb(2063.0F, 276);
  }

  @Test(timeout = 4000)
  public void test_1513()  throws Throwable  {
      FastMath.scalb(180.12238F, 128);
  }

  @Test(timeout = 4000)
  public void test_1514()  throws Throwable  {
      FastMath.scalb((-1.0), (-1023));
  }

  @Test(timeout = 4000)
  public void test_1515()  throws Throwable  {
      FastMath.scalb(3.141592653589793, 2097);
  }

  @Test(timeout = 4000)
  public void test_1516()  throws Throwable  {
      FastMath.scalb(0.16666666666666666, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1517()  throws Throwable  {
      FastMath.ulp(378.35263F);
  }

  @Test(timeout = 4000)
  public void test_1518()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1519()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1520()  throws Throwable  {
      FastMath.toRadians(0.9414084368694061);
  }

  @Test(timeout = 4000)
  public void test_1521()  throws Throwable  {
      FastMath.asin(1.986821492305628E-8);
  }

  @Test(timeout = 4000)
  public void test_1522()  throws Throwable  {
      FastMath.atan2(0.0, 325.2678867620211);
  }

  @Test(timeout = 4000)
  public void test_1523()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1524()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1525()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1526()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1527()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1528()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1529()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1530()  throws Throwable  {
      FastMath.sin(6.434748642336812E236);
  }

  @Test(timeout = 4000)
  public void test_1531()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1532()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1533()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1534()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1535()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1536()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1537()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_1538()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_1539()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1540()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1541()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1542()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1543()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1544()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1545()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1546()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1547()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1548()  throws Throwable  {
      FastMath.toDegrees((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1549()  throws Throwable  {
      FastMath.sqrt(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1550()  throws Throwable  {
      FastMath.sqrt(1045.5);
  }

  @Test(timeout = 4000)
  public void test_1551()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1552()  throws Throwable  {
      FastMath.round((-793.2377F));
  }

  @Test(timeout = 4000)
  public void test_1553()  throws Throwable  {
      FastMath.round((-2.1139124097042925E-7));
  }

  @Test(timeout = 4000)
  public void test_1554()  throws Throwable  {
      FastMath.round(1.0);
  }

  @Test(timeout = 4000)
  public void test_1555()  throws Throwable  {
      FastMath.pow((-5650.849955935), 57);
  }

  @Test(timeout = 4000)
  public void test_1556()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1557()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_1558()  throws Throwable  {
      FastMath.nextAfter(0.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1559()  throws Throwable  {
      FastMath.nextAfter((double) 0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1560()  throws Throwable  {
      FastMath.min((long) 1667, 0L);
  }

  @Test(timeout = 4000)
  public void test_1561()  throws Throwable  {
      FastMath.min((-4995L), 277L);
  }

  @Test(timeout = 4000)
  public void test_1562()  throws Throwable  {
      FastMath.min(551, 551);
  }

  @Test(timeout = 4000)
  public void test_1563()  throws Throwable  {
      FastMath.min(Double.POSITIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1564()  throws Throwable  {
      FastMath.max(0L, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_1565()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1566()  throws Throwable  {
      FastMath.max((-3570), (-482));
  }

  @Test(timeout = 4000)
  public void test_1567()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_1568()  throws Throwable  {
      FastMath.log(0.16666666666666666, 177.95330533914063);
  }

  @Test(timeout = 4000)
  public void test_1569()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_1570()  throws Throwable  {
      FastMath.log(0.25534194707870483);
  }

  @Test(timeout = 4000)
  public void test_1571()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1572()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1573()  throws Throwable  {
      FastMath.getExponent(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_1574()  throws Throwable  {
      FastMath.getExponent(1.0);
  }

  @Test(timeout = 4000)
  public void test_1575()  throws Throwable  {
      FastMath.getExponent(0.0);
  }

  @Test(timeout = 4000)
  public void test_1576()  throws Throwable  {
      FastMath.copySign(0.0F, 597.83F);
  }

  @Test(timeout = 4000)
  public void test_1577()  throws Throwable  {
      FastMath.copySign((double) 0.0F, (-1529.17857085362));
  }

  @Test(timeout = 4000)
  public void test_1578()  throws Throwable  {
      FastMath.ceil((-203.72));
  }

  @Test(timeout = 4000)
  public void test_1579()  throws Throwable  {
      FastMath.cbrt((-3512.50706635));
  }

  @Test(timeout = 4000)
  public void test_1580()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1581()  throws Throwable  {
      FastMath.atanh((-8.008561371849434E-8));
  }

  @Test(timeout = 4000)
  public void test_1582()  throws Throwable  {
      FastMath.atan(569.854059);
  }

  @Test(timeout = 4000)
  public void test_1583()  throws Throwable  {
      FastMath.atan((-190.61));
  }

  @Test(timeout = 4000)
  public void test_1584()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1585()  throws Throwable  {
      FastMath.acosh(1256.65492);
  }

  @Test(timeout = 4000)
  public void test_1586()  throws Throwable  {
      FastMath.acosh((-3.6690272854279968E16));
  }

  @Test(timeout = 4000)
  public void test_1587()  throws Throwable  {
      FastMath.abs((long) 0);
  }

  @Test(timeout = 4000)
  public void test_1588()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1589()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1590()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1591()  throws Throwable  {
      FastMath.IEEEremainder(482.0F, (-3570));
  }

  @Test(timeout = 4000)
  public void test_1592()  throws Throwable  {
      FastMath.IEEEremainder(2153.209755178404, 127L);
  }

  @Test(timeout = 4000)
  public void test_1593()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(0.902267575263977, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1594()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_1595()  throws Throwable  {
      double double0 = FastMath.copySign(160.8379881874021, 160.8379881874021);
      assertEquals(160.8379881874021, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1596()  throws Throwable  {
      double double0 = FastMath.copySign((double) 609.6078F, (-2090.98));
      assertEquals((-609.6077880859375), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1597()  throws Throwable  {
      double double0 = FastMath.floor(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1598()  throws Throwable  {
      double double0 = FastMath.floor((-8.0));
      assertEquals((-8.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1599()  throws Throwable  {
      double double0 = FastMath.floor((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1600()  throws Throwable  {
      double double0 = FastMath.floor((-1.550851303094034E-7));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1601()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1220.08F), Double.NEGATIVE_INFINITY);
      assertEquals((-1220.0801F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1602()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), 0.0);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1603()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 839.0F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1604()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2736.0345078901);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1605()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, Double.NEGATIVE_INFINITY);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1606()  throws Throwable  {
      double double0 = FastMath.nextAfter((-9.344069504534806), 1.0);
      assertEquals((-9.344069504534804), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1607()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.689503868988906, (-2213.1292317824));
      assertEquals(3.6895038689889055, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1608()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.5596157312393188);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1609()  throws Throwable  {
      double double0 = FastMath.scalb((-24.4667158312793), (-127));
      assertEquals((-1.4380243121421522E-37), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1610()  throws Throwable  {
      int int0 = FastMath.getExponent((-3450.137842335));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_1611()  throws Throwable  {
      double double0 = FastMath.log(414.366709766432);
      assertEquals(6.026751354143147, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1612()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1613()  throws Throwable  {
      float float0 = FastMath.copySign((-2331.6875F), 2177.1F);
      assertEquals(2331.6875F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1614()  throws Throwable  {
      float float0 = FastMath.copySign(1746.1191F, Float.NEGATIVE_INFINITY);
      assertEquals((-1746.1191F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1615()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1616()  throws Throwable  {
      double double0 = FastMath.copySign((-5.763495903609913E-231), (-3516.321589436115));
      assertEquals((-5.763495903609913E-231), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1617()  throws Throwable  {
      double double0 = FastMath.copySign((-837.3), (double) 1045);
      assertEquals(837.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1618()  throws Throwable  {
      double double0 = FastMath.hypot((-2.2250738585072014E-308), (-264.94));
      assertEquals(264.94, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1619()  throws Throwable  {
      double double0 = FastMath.hypot(113.72963211971384, (-3.356118100840571E-7));
      assertEquals(113.72963211971384, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1620()  throws Throwable  {
      double double0 = FastMath.hypot(1228.3930151149182, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1621()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 2139534423);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1622()  throws Throwable  {
      double double0 = FastMath.hypot(1.4E-45F, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1623()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1624()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1625()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1626()  throws Throwable  {
      double double0 = FastMath.max((-714.3), (-714.3));
      assertEquals((-714.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1627()  throws Throwable  {
      double double0 = FastMath.max(164.7190913513097, 1.2599210498948732);
      assertEquals(164.7190913513097, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1628()  throws Throwable  {
      double double0 = FastMath.max((-169.2017), (-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1629()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1630()  throws Throwable  {
      float float0 = FastMath.max(903.512F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1631()  throws Throwable  {
      float float0 = FastMath.max((-5345.12F), 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1632()  throws Throwable  {
      float float0 = FastMath.max(1.0F, (-1450.5647F));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1633()  throws Throwable  {
      float float0 = FastMath.max((-1557.5775F), (-1557.5775F));
      assertEquals((-1557.5775F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1634()  throws Throwable  {
      long long0 = FastMath.max((-1764L), (-1764L));
      assertEquals((-1764L), long0);
  }

  @Test(timeout = 4000)
  public void test_1635()  throws Throwable  {
      long long0 = FastMath.max(1736L, 1023L);
      assertEquals(1736L, long0);
  }

  @Test(timeout = 4000)
  public void test_1636()  throws Throwable  {
      int int0 = FastMath.max(0, 1139);
      assertEquals(1139, int0);
  }

  @Test(timeout = 4000)
  public void test_1637()  throws Throwable  {
      int int0 = FastMath.max(586, (-3631));
      assertEquals(586, int0);
  }

  @Test(timeout = 4000)
  public void test_1638()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (-1.6259920998287064E77));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1639()  throws Throwable  {
      double double0 = FastMath.min(1.6231601238250732, 1.6231601238250732);
      assertEquals(1.6231601238250732, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1640()  throws Throwable  {
      double double0 = FastMath.min(1.1044092571980793E155, (-8883.435577142172));
      assertEquals((-8883.435577142172), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1641()  throws Throwable  {
      double double0 = FastMath.min((-2610.12051), 1.401298464324817E-45);
      assertEquals((-2610.12051), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1642()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1643()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 2083.01F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1644()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, 0.5F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1645()  throws Throwable  {
      float float0 = FastMath.min(934.8F, 5.22923F);
      assertEquals(5.22923F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1646()  throws Throwable  {
      float float0 = FastMath.min((-1181.0F), (-1181.0F));
      assertEquals((-1181.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1647()  throws Throwable  {
      long long0 = FastMath.min(2935890503282001226L, 2935890503282001226L);
      assertEquals(2935890503282001226L, long0);
  }

  @Test(timeout = 4000)
  public void test_1648()  throws Throwable  {
      int int0 = FastMath.min(1824, (-1096));
      assertEquals((-1096), int0);
  }

  @Test(timeout = 4000)
  public void test_1649()  throws Throwable  {
      double double0 = FastMath.rint(1317.5);
      assertEquals(1318.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1650()  throws Throwable  {
      double double0 = FastMath.rint(2.718281828459045);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1651()  throws Throwable  {
      double double0 = FastMath.rint((-1.0E-6));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1652()  throws Throwable  {
      double double0 = FastMath.ceil((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1653()  throws Throwable  {
      double double0 = FastMath.ceil(204.0F);
      assertEquals(204.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1654()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1655()  throws Throwable  {
      double double0 = FastMath.ceil(1.1864056832305874E-207);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1656()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1657()  throws Throwable  {
      double double0 = FastMath.floor(5.68253547942899E295);
      assertEquals(5.68253547942899E295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1658()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1659()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 1202);
      assertEquals(1202.0001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1660()  throws Throwable  {
      float float0 = FastMath.nextAfter(384.7346F, (-1.5357621407647677));
      assertEquals(384.73456F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1661()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-4095.0481676));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1662()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-15.201008512190326));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1663()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1664()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 463, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1665()  throws Throwable  {
      double double0 = FastMath.nextUp(0.25);
      assertEquals(0.25000000000000006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1666()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.0), (-705.0));
      assertEquals((-1.0000000000000002), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1667()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2.718281828459045);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1668()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, (-773.33199));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1669()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.POSITIVE_INFINITY, (double) 1114);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1670()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1671()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2042.4422840199484), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1672()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 1000.1603918280776);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1673()  throws Throwable  {
      float float0 = FastMath.scalb((-1604.0F), 236);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1674()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 236);
      assertEquals(1.54742505E26F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1675()  throws Throwable  {
      float float0 = FastMath.scalb(2.0F, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1676()  throws Throwable  {
      float float0 = FastMath.scalb((-128.14294F), (-138));
      assertEquals((-3.67753E-40F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1677()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), (-127));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1678()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1114, 1114);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1679()  throws Throwable  {
      float float0 = FastMath.scalb(903.51F, (-3489));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1680()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-3913));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1681()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 2392);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1682()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-213));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1683()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-1297));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1684()  throws Throwable  {
      float float0 = FastMath.scalb(2.05233933E9F, 0);
      assertEquals(2.05233933E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1685()  throws Throwable  {
      float float0 = FastMath.scalb((-914.17F), 415);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1686()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1687()  throws Throwable  {
      double double0 = FastMath.scalb(2.719805132368625E-271, 1024);
      assertEquals(4.889375014622369E37, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1688()  throws Throwable  {
      double double0 = FastMath.scalb(1.01, (-1034));
      assertEquals(5.48663231712E-312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1689()  throws Throwable  {
      double double0 = FastMath.scalb((-1683.983907983), (-1212));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1690()  throws Throwable  {
      double double0 = FastMath.scalb(2894.0, (-1023));
      assertEquals(3.2196818732599204E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1691()  throws Throwable  {
      double double0 = FastMath.scalb((-1035.0), 3704);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1692()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2139534421, 2139534421);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1693()  throws Throwable  {
      double double0 = FastMath.scalb(2066.9752, (-2898));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1694()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 2738526);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1695()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, (-1717));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1696()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1114);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1697()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1.4E-45F), 1450);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1698()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-127), (-1073741824));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1699()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1700()  throws Throwable  {
      float float0 = FastMath.ulp(2.0E-5F);
      assertEquals(1.8189894E-12F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1701()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1702()  throws Throwable  {
      double double0 = FastMath.ulp(4533.197772259059);
      assertEquals(9.094947017729282E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1703()  throws Throwable  {
      double double0 = FastMath.abs(1.184154459111628E-8);
      assertEquals(1.184154459111628E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1704()  throws Throwable  {
      double double0 = FastMath.abs((-1445.454));
      assertEquals(1445.454, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1705()  throws Throwable  {
      double double0 = FastMath.abs((double) -0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1706()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1707()  throws Throwable  {
      float float0 = FastMath.abs((-959.4F));
      assertEquals(959.4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1708()  throws Throwable  {
      float float0 = FastMath.abs(163.97F);
      assertEquals(163.97F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1709()  throws Throwable  {
      long long0 = FastMath.abs((-1533L));
      assertEquals(1533L, long0);
  }

  @Test(timeout = 4000)
  public void test_1710()  throws Throwable  {
      long long0 = FastMath.abs(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_1711()  throws Throwable  {
      int int0 = FastMath.abs((-39));
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test_1712()  throws Throwable  {
      int int0 = FastMath.abs(2448);
      assertEquals(2448, int0);
  }

  @Test(timeout = 4000)
  public void test_1713()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1.0E-6));
      assertEquals((-5.729577951308232E-5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1714()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1715()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1716()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1717()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1718()  throws Throwable  {
      double double0 = FastMath.toRadians((-3.691E-8));
      assertEquals((-6.44201026911107E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1719()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1720()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1721()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1722()  throws Throwable  {
      double double0 = FastMath.cbrt(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1723()  throws Throwable  {
      double double0 = FastMath.acos((-0.25F));
      assertEquals(1.8234765819369754, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1724()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1725()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1726()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1727()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1728()  throws Throwable  {
      double double0 = FastMath.acos((-3440.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1729()  throws Throwable  {
      double double0 = FastMath.acos(272.34);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1730()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1731()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1732()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1733()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1734()  throws Throwable  {
      double double0 = FastMath.asin((-1942.2916423));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1735()  throws Throwable  {
      double double0 = FastMath.asin(1860.04);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1736()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1737()  throws Throwable  {
      double double0 = FastMath.atan2(613.0442475554, 613.0442475554);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1738()  throws Throwable  {
      double double0 = FastMath.atan2(0.1120316604106267, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1739()  throws Throwable  {
      double double0 = FastMath.atan2(1607180828, (-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1740()  throws Throwable  {
      double double0 = FastMath.atan2((-1.4E-45F), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1741()  throws Throwable  {
      double double0 = FastMath.atan2(1114, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1742()  throws Throwable  {
      double double0 = FastMath.atan2(0.5130000000000337, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1743()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1744()  throws Throwable  {
      double double0 = FastMath.atan2(1518, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1745()  throws Throwable  {
      double double0 = FastMath.atan2((-709.782712893384), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1746()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, (-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1747()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1748()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1749()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 1024);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1750()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1751()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1752()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-643.5607979270336));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1753()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1754()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1755()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1756()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 0.4402999725203576);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1757()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1758()  throws Throwable  {
      double double0 = FastMath.asin((-8.881784197001252E-16));
      assertEquals((-8.881784197001252E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1759()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), (-1161.8624470058655));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1760()  throws Throwable  {
      double double0 = FastMath.acos(6.47906886957586E-91);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1761()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-3512.50706635));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1762()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1763()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1764()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1765()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1766()  throws Throwable  {
      double double0 = FastMath.cos((-2311.65031793));
      assertEquals(0.8462575884431299, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1767()  throws Throwable  {
      double double0 = FastMath.cos(1170209330);
      assertEquals((-0.43573054884884804), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1768()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1769()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1770()  throws Throwable  {
      double double0 = FastMath.sin((-268.707579900955));
      assertEquals(0.9948626116677709, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1771()  throws Throwable  {
      double double0 = FastMath.sin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1772()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1773()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1774()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1775()  throws Throwable  {
      double double0 = FastMath.tan((-4.6860888E7F));
      assertEquals(0.2375836423258855, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1776()  throws Throwable  {
      double double0 = FastMath.cos(1.633123935319537E16);
      assertEquals((-0.28443016146380146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1777()  throws Throwable  {
      double double0 = FastMath.sin(1.1044092571980793E155);
      assertEquals(0.6390363707705762, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1778()  throws Throwable  {
      double double0 = FastMath.tan((-7.83892088580041E80));
      assertEquals(0.6558997129759169, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1779()  throws Throwable  {
      double double0 = FastMath.sin(1.7976931348623157E308);
      assertEquals(0.004961954789184062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1780()  throws Throwable  {
      double double0 = FastMath.sin(5477076.650146094);
      assertEquals((-0.8978507304661351), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1781()  throws Throwable  {
      double double0 = FastMath.tan((-1.2433080910244666E86));
      assertEquals((-1.2273233757501503), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1782()  throws Throwable  {
      double double0 = FastMath.sin((-4.503599627370496E15));
      assertEquals((-0.8742173026236351), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1783()  throws Throwable  {
      double double0 = FastMath.tan(3.4028235E38F);
      assertEquals((-0.6117979498342481), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1784()  throws Throwable  {
      double double0 = FastMath.tan((-0.31408129376920907));
      assertEquals((-0.324833495147069), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1785()  throws Throwable  {
      double double0 = FastMath.sin((-1.0));
      assertEquals((-0.8414709848078965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1786()  throws Throwable  {
      double double0 = FastMath.pow((double) 1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1787()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1788()  throws Throwable  {
      double double0 = FastMath.pow((double) (-420082145), (-420082145));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1789()  throws Throwable  {
      double double0 = FastMath.pow(1141.153138432, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1790()  throws Throwable  {
      double double0 = FastMath.pow((double) 190.0F, 8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1791()  throws Throwable  {
      double double0 = FastMath.pow((-654.0), (-654.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1792()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1023), (double) (-1023));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1793()  throws Throwable  {
      double double0 = FastMath.pow((-4301.025988460294), (-4.503599627370496E15));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1794()  throws Throwable  {
      double double0 = FastMath.pow((-20.0), 3.4028234663852886E38);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1795()  throws Throwable  {
      double double0 = FastMath.pow((-3.6206211446779087E-63), (-3.6206211446779087E-63));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1796()  throws Throwable  {
      double double0 = FastMath.pow(0.31732862933206474, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1797()  throws Throwable  {
      double double0 = FastMath.pow(1.1044092571980793E155, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1798()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 20.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1799()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 2635.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1800()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-879.370889));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1801()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1035.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1802()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 9.93290460096577E-18);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1803()  throws Throwable  {
      double double0 = FastMath.pow((-2.933016992001806E-10), (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1804()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1805()  throws Throwable  {
      double double0 = FastMath.pow(9.667436145114516, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1806()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1807()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-718.7766));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1808()  throws Throwable  {
      double double0 = FastMath.pow((double) 0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1809()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1640.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1810()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 3029.89732224575);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1811()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-8.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1812()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1035.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1813()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-430.882));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1814()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 281L);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1815()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-1.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1816()  throws Throwable  {
      double double0 = FastMath.pow(0.1246747374534607, -0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1817()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1818()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1819()  throws Throwable  {
      double double0 = FastMath.log(1.0, (double) 3.4028235E38F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1820()  throws Throwable  {
      double double0 = FastMath.log10(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1821()  throws Throwable  {
      double double0 = FastMath.log1p(0.7508260956301605);
      assertEquals(0.5600877311984854, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1822()  throws Throwable  {
      double double0 = FastMath.pow(0.7853981633974483, 0.7853981633974483);
      assertEquals(0.8271871619626222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1823()  throws Throwable  {
      double double0 = FastMath.log(0.0, 4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1824()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1825()  throws Throwable  {
      double double0 = FastMath.atanh(1.0F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1826()  throws Throwable  {
      double double0 = FastMath.log1p((-11.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1827()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1828()  throws Throwable  {
      double double0 = FastMath.expm1((-0.002649971333977445));
      assertEquals((-0.002646463259391873), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1829()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1830()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1831()  throws Throwable  {
      double double0 = FastMath.expm1(822.11F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1832()  throws Throwable  {
      double double0 = FastMath.expm1((-726.0F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1833()  throws Throwable  {
      double double0 = FastMath.exp((-742.6775988));
      assertEquals(3.0E-323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1834()  throws Throwable  {
      double double0 = FastMath.expm1((-751.258976));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1835()  throws Throwable  {
      double double0 = FastMath.exp((-1527.4286353906098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1836()  throws Throwable  {
      float float0 = FastMath.signum((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1837()  throws Throwable  {
      float float0 = FastMath.signum((-1770.111F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1838()  throws Throwable  {
      float float0 = FastMath.signum(1966.43F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1839()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1840()  throws Throwable  {
      double double0 = FastMath.signum((-837.3));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1841()  throws Throwable  {
      double double0 = FastMath.signum(3.141592653589793);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1842()  throws Throwable  {
      double double0 = FastMath.atanh(0.07073719799518585);
      assertEquals(0.0708555372623453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1843()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1844()  throws Throwable  {
      double double0 = FastMath.atanh((-2031.99));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1845()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333333333);
      assertEquals(0.008333236885730006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1846()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1847()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1848()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1849()  throws Throwable  {
      double double0 = FastMath.asinh((-2038.276));
      assertEquals((-8.313006872237036), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1850()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1851()  throws Throwable  {
      double double0 = FastMath.tanh(0.4926934838294983);
      assertEquals(0.45635159956761745, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1852()  throws Throwable  {
      double double0 = FastMath.tanh(113.72963211971384);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1853()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1854()  throws Throwable  {
      double double0 = FastMath.tanh((-76.77));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1855()  throws Throwable  {
      double double0 = FastMath.sinh(2.719805132368625E-271);
      assertEquals(2.719805132368625E-271, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1856()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1857()  throws Throwable  {
      double double0 = FastMath.sinh((-654.0));
      assertEquals((-5.3402448400899536E283), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1858()  throws Throwable  {
      double double0 = FastMath.sinh((-2941.651708496497));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1859()  throws Throwable  {
      double double0 = FastMath.sinh(378.35263F);
      assertEquals(1.0361668506813782E164, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1860()  throws Throwable  {
      double double0 = FastMath.sinh(1391.3138242058685);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1861()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1862()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1863()  throws Throwable  {
      double double0 = FastMath.cosh((-1881.518122548688));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1864()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1865()  throws Throwable  {
      double double0 = FastMath.cosh(22.64);
      assertEquals(3.39935933333163E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1866()  throws Throwable  {
      double double0 = FastMath.cosh((-398.1916116793745));
      assertEquals(4.279467148540743E172, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1867()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1868()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1869()  throws Throwable  {
      int int0 = FastMath.getExponent((-2816.4F));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_1870()  throws Throwable  {
      double double0 = FastMath.cosh(903.512F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1871()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1872()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1873()  throws Throwable  {
      double double0 = FastMath.acosh(4.7683716E-7F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1874()  throws Throwable  {
      int int0 = FastMath.round((float) 1045);
      assertEquals(1045, int0);
  }

  @Test(timeout = 4000)
  public void test_1875()  throws Throwable  {
      long long0 = FastMath.round((-1763.95868446073));
      assertEquals((-1764L), long0);
  }
@Test(timeout = 4000)
  public void test_1876()  throws Throwable  {
      FastMath.getExponent((-827.7F));
  }

  @Test(timeout = 4000)
  public void test_1877()  throws Throwable  {
      FastMath.copySign((-1300.571F), (float) 0);
  }

  @Test(timeout = 4000)
  public void test_1878()  throws Throwable  {
      FastMath.copySign(0.0F, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1879()  throws Throwable  {
      FastMath.copySign(1.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1880()  throws Throwable  {
      FastMath.copySign((-9.64850218273547E-17), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1881()  throws Throwable  {
      FastMath.copySign((double) 0.0F, (-538.3274196435696));
  }

  @Test(timeout = 4000)
  public void test_1882()  throws Throwable  {
      FastMath.hypot(1.0E-6, 155.99682325421);
  }

  @Test(timeout = 4000)
  public void test_1883()  throws Throwable  {
      FastMath.hypot(0.36231553432901653, 3.7201467248814224E-9);
  }

  @Test(timeout = 4000)
  public void test_1884()  throws Throwable  {
      FastMath.max((-207550410), (-19));
  }

  @Test(timeout = 4000)
  public void test_1885()  throws Throwable  {
      FastMath.min((-2420L), 488L);
  }

  @Test(timeout = 4000)
  public void test_1886()  throws Throwable  {
      FastMath.min((-1654), 556);
  }

  @Test(timeout = 4000)
  public void test_1887()  throws Throwable  {
      FastMath.rint((-2778.24360450873));
  }

  @Test(timeout = 4000)
  public void test_1888()  throws Throwable  {
      FastMath.rint(1136.5F);
  }

  @Test(timeout = 4000)
  public void test_1889()  throws Throwable  {
      FastMath.ceil(483.80545911);
  }

  @Test(timeout = 4000)
  public void test_1890()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_1891()  throws Throwable  {
      FastMath.scalb((-1.7692452696156633), (-1023));
  }

  @Test(timeout = 4000)
  public void test_1892()  throws Throwable  {
      FastMath.scalb(0.37035053968429565, 2097);
  }

  @Test(timeout = 4000)
  public void test_1893()  throws Throwable  {
      FastMath.scalb(928.64, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1894()  throws Throwable  {
      FastMath.scalb((-2616.52713526), 1024);
  }

  @Test(timeout = 4000)
  public void test_1895()  throws Throwable  {
      FastMath.ulp(1.01);
  }

  @Test(timeout = 4000)
  public void test_1896()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1897()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1898()  throws Throwable  {
      FastMath.toRadians(1.2252256870269775);
  }

  @Test(timeout = 4000)
  public void test_1899()  throws Throwable  {
      FastMath.cbrt((-1.968350699354669E-308));
  }

  @Test(timeout = 4000)
  public void test_1900()  throws Throwable  {
      FastMath.asin((-1.0271780540759147E-150));
  }

  @Test(timeout = 4000)
  public void test_1901()  throws Throwable  {
      FastMath.atan2(2506.84517111866, (-1.3345148716925826E-23));
  }

  @Test(timeout = 4000)
  public void test_1902()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_1903()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1904()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1905()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1906()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1907()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1908()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1909()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1910()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1911()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1912()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1913()  throws Throwable  {
      FastMath.expm1((-1L));
  }

  @Test(timeout = 4000)
  public void test_1914()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1915()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_1916()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_1917()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_1918()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_1919()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1920()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1921()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1922()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1923()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1924()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1925()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1926()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1927()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1928()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1929()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1930()  throws Throwable  {
      FastMath.sqrt(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1931()  throws Throwable  {
      FastMath.round(1266.0F);
  }

  @Test(timeout = 4000)
  public void test_1932()  throws Throwable  {
      FastMath.round((-565.561F));
  }

  @Test(timeout = 4000)
  public void test_1933()  throws Throwable  {
      FastMath.round(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1934()  throws Throwable  {
      FastMath.round((-391.8));
  }

  @Test(timeout = 4000)
  public void test_1935()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1936()  throws Throwable  {
      Random.setNextRandom(1004);
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_1937()  throws Throwable  {
      FastMath.pow((-153.8281), 1);
  }

  @Test(timeout = 4000)
  public void test_1938()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1939()  throws Throwable  {
      FastMath.nextAfter(1.4E-45F, (-3401.756692512));
  }

  @Test(timeout = 4000)
  public void test_1940()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1941()  throws Throwable  {
      FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_1942()  throws Throwable  {
      FastMath.min(9218868437227405312L, 1729L);
  }

  @Test(timeout = 4000)
  public void test_1943()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1944()  throws Throwable  {
      FastMath.min((float) 1359, (float) 1359);
  }

  @Test(timeout = 4000)
  public void test_1945()  throws Throwable  {
      FastMath.min((double) 0L, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1946()  throws Throwable  {
      FastMath.max((-496L), (long) 0);
  }

  @Test(timeout = 4000)
  public void test_1947()  throws Throwable  {
      FastMath.max((-1713L), (-1713L));
  }

  @Test(timeout = 4000)
  public void test_1948()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1949()  throws Throwable  {
      FastMath.max((-1841.89F), (-565.561F));
  }

  @Test(timeout = 4000)
  public void test_1950()  throws Throwable  {
      FastMath.max((-1294.850743292149), (-1294.850743292149));
  }

  @Test(timeout = 4000)
  public void test_1951()  throws Throwable  {
      FastMath.log1p(0L);
  }

  @Test(timeout = 4000)
  public void test_1952()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1953()  throws Throwable  {
      FastMath.log(0.0, 8.378574405736031E-247);
  }

  @Test(timeout = 4000)
  public void test_1954()  throws Throwable  {
      FastMath.log(2925.304747, 2925.304747);
  }

  @Test(timeout = 4000)
  public void test_1955()  throws Throwable  {
      FastMath.log(1.770547866821289, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1956()  throws Throwable  {
      FastMath.log((double) 3764.0F);
  }

  @Test(timeout = 4000)
  public void test_1957()  throws Throwable  {
      FastMath.log(0.0);
  }

  @Test(timeout = 4000)
  public void test_1958()  throws Throwable  {
      FastMath.getExponent(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1959()  throws Throwable  {
      FastMath.getExponent(1.0);
  }

  @Test(timeout = 4000)
  public void test_1960()  throws Throwable  {
      FastMath.getExponent((-299.677338030522));
  }

  @Test(timeout = 4000)
  public void test_1961()  throws Throwable  {
      FastMath.copySign(0.0F, (float) 1203);
  }

  @Test(timeout = 4000)
  public void test_1962()  throws Throwable  {
      FastMath.copySign(0.0, 2829.206675188903);
  }

  @Test(timeout = 4000)
  public void test_1963()  throws Throwable  {
      FastMath.cbrt((-1.1381252786264335E-305));
  }

  @Test(timeout = 4000)
  public void test_1964()  throws Throwable  {
      FastMath.atan(1.184154459111628E-8);
  }

  @Test(timeout = 4000)
  public void test_1965()  throws Throwable  {
      FastMath.atan((-2367.0));
  }

  @Test(timeout = 4000)
  public void test_1966()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1967()  throws Throwable  {
      FastMath.acosh(Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_1968()  throws Throwable  {
      FastMath.acosh((-5.4199510725063615E129));
  }

  @Test(timeout = 4000)
  public void test_1969()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_1970()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1971()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1972()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1973()  throws Throwable  {
      FastMath.IEEEremainder(505.337631, (-2488));
  }

  @Test(timeout = 4000)
  public void test_1974()  throws Throwable  {
      FastMath.IEEEremainder(1.0183920005400422E109, 2.9495302004590423E-225);
  }

  @Test(timeout = 4000)
  public void test_1975()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((double) Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1976()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_1977()  throws Throwable  {
      double double0 = FastMath.copySign(1.25, 1.25);
      assertEquals(1.25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1978()  throws Throwable  {
      double double0 = FastMath.floor((-328));
      assertEquals((-328.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1979()  throws Throwable  {
      double double0 = FastMath.floor((-1413.87491110853));
      assertEquals((-1414.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1980()  throws Throwable  {
      double double0 = FastMath.floor(0.1246747374534607);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1981()  throws Throwable  {
      double double0 = FastMath.floor(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1982()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1983()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.4E-45F), (-1431.4902694600294));
      assertEquals((-2.8E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1984()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3.4028235E38F), (-951.0133784578582));
      assertEquals((-3.4028233E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1985()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 4.363437558318513E-8);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1986()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-1626.421663173));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1987()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1729.1578109178909), 2.220446049250313E-16);
      assertEquals((-1729.1578109178906), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1988()  throws Throwable  {
      double double0 = FastMath.nextAfter((-7.44321345601866E-11), (-2536.65));
      assertEquals((-7.443213456018661E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1989()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.1246747374534607);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1990()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 2.71853394036182E-51);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1991()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 2147103450);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1992()  throws Throwable  {
      double double0 = FastMath.scalb((-1495.528393567), 362);
      assertEquals((-1.4049248464157775E112), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1993()  throws Throwable  {
      double double0 = FastMath.abs((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1994()  throws Throwable  {
      float float0 = FastMath.abs((-271.56918F));
      assertEquals(271.56918F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1995()  throws Throwable  {
      float float0 = FastMath.abs((float) 2146534454);
      assertEquals(2.1465344E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1996()  throws Throwable  {
      int int0 = FastMath.getExponent(3.7201467248814224E-9);
      assertEquals((-29), int0);
  }

  @Test(timeout = 4000)
  public void test_1997()  throws Throwable  {
      float float0 = FastMath.copySign((-1732.0F), (float) 2266);
      assertEquals(1732.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1998()  throws Throwable  {
      float float0 = FastMath.copySign(1.0F, (-878.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1999()  throws Throwable  {
      float float0 = FastMath.copySign((-1393.3851F), (-1393.3851F));
      assertEquals((-1393.3851F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2000()  throws Throwable  {
      double double0 = FastMath.copySign((-1120.9538233888106), 3.141592653589793);
      assertEquals(1120.9538233888106, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2001()  throws Throwable  {
      double double0 = FastMath.copySign((double) 1073741824, Double.NEGATIVE_INFINITY);
      assertEquals((-1.073741824E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2002()  throws Throwable  {
      double double0 = FastMath.copySign((-259.0), (-259.0));
      assertEquals((-259.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2003()  throws Throwable  {
      double double0 = FastMath.hypot(2.2250738585072014E-308, (-1120.73));
      assertEquals(1120.73, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2004()  throws Throwable  {
      double double0 = FastMath.hypot(4.983191803254889E-7, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2005()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 0.5855053663253784);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2006()  throws Throwable  {
      double double0 = FastMath.hypot((-1120.73), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2007()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2008()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2009()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (double) (-6.591668F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2010()  throws Throwable  {
      double double0 = FastMath.max(16.083379651647853, 3294198.0);
      assertEquals(3294198.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2011()  throws Throwable  {
      double double0 = FastMath.max((double) Float.POSITIVE_INFINITY, (-3308.99));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2012()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2013()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, 1.8189894E-12F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2014()  throws Throwable  {
      float float0 = FastMath.max(1.4E-45F, (float) Integer.MAX_VALUE);
      assertEquals(2.14748365E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2015()  throws Throwable  {
      float float0 = FastMath.max(0.0F, (-5473.0F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2016()  throws Throwable  {
      float float0 = FastMath.max(1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2017()  throws Throwable  {
      long long0 = FastMath.max((-1926L), 1023L);
      assertEquals(1023L, long0);
  }

  @Test(timeout = 4000)
  public void test_2018()  throws Throwable  {
      long long0 = FastMath.max(2819561105158720014L, (-374L));
      assertEquals(2819561105158720014L, long0);
  }

  @Test(timeout = 4000)
  public void test_2019()  throws Throwable  {
      int int0 = FastMath.max(1685, 350);
      assertEquals(1685, int0);
  }

  @Test(timeout = 4000)
  public void test_2020()  throws Throwable  {
      double double0 = FastMath.min(1996.0306007848978, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2021()  throws Throwable  {
      double double0 = FastMath.min(1.2940962314605713, 1.2940962314605713);
      assertEquals(1.2940962314605713, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2022()  throws Throwable  {
      double double0 = FastMath.min((double) 1073741826, (double) 1.4E-45F);
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2023()  throws Throwable  {
      double double0 = FastMath.min((-361.51268959219993), 219.2694);
      assertEquals((-361.51268959219993), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2024()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2025()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, (-2670.6F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2026()  throws Throwable  {
      float float0 = FastMath.min((-199.37F), 4.8828125E-4F);
      assertEquals((-199.37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2027()  throws Throwable  {
      float float0 = FastMath.min((-1265.2F), (-1982.9869F));
      assertEquals((-1982.9869F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2028()  throws Throwable  {
      int int0 = FastMath.min(1351, 1351);
      assertEquals(1351, int0);
  }

  @Test(timeout = 4000)
  public void test_2029()  throws Throwable  {
      int int0 = FastMath.min(669, (-767764849));
      assertEquals((-767764849), int0);
  }

  @Test(timeout = 4000)
  public void test_2030()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2031()  throws Throwable  {
      double double0 = FastMath.rint(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2032()  throws Throwable  {
      double double0 = FastMath.rint((-0.2499999997677497));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2033()  throws Throwable  {
      double double0 = FastMath.rint(0.6299605249474366);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2034()  throws Throwable  {
      double double0 = FastMath.ceil((-3.940510424527919E-20));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2035()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2036()  throws Throwable  {
      double double0 = FastMath.ceil((-2589.0));
      assertEquals((-2589.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2037()  throws Throwable  {
      double double0 = FastMath.ceil((-1811.407));
      assertEquals((-1811.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2038()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2039()  throws Throwable  {
      float float0 = FastMath.nextUp(8064.0F);
      assertEquals(8064.0005F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2040()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (double) (-1.4E-45F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2041()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2042()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-2280.5082));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2043()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 2263, (double) 2263);
      assertEquals(2263.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2044()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3001.4F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2045()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (double) Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2046()  throws Throwable  {
      double double0 = FastMath.nextUp(0.07692307692307693);
      assertEquals(0.07692307692307694, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2047()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 875.0F, (double) 6.1035156E-5F);
      assertEquals(874.9999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2048()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-6.032174644509064E-23));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2049()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, -0.0);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2050()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2051()  throws Throwable  {
      double double0 = FastMath.nextAfter(2.2250738585072014E-308, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2052()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-709.782712893384));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2053()  throws Throwable  {
      float float0 = FastMath.scalb((-1.1920929E-7F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2054()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2055()  throws Throwable  {
      float float0 = FastMath.scalb(851.2F, (-138));
      assertEquals(2.442825E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2056()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1092, (-259));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2057()  throws Throwable  {
      float float0 = FastMath.scalb((float) 128, 128);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2058()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1073741826, 1073741826);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2059()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2060()  throws Throwable  {
      float float0 = FastMath.scalb(1670.0F, (-1804));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2061()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 1088);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2062()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 1750);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2063()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-1343));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2064()  throws Throwable  {
      float float0 = FastMath.scalb((-2596.0F), 1073741826);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2065()  throws Throwable  {
      float float0 = FastMath.scalb((-1983.4388F), (-22));
      assertEquals((-4.7288867E-4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2066()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1037), (-1037));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2067()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2250738585072014E-308), 1060);
      assertEquals((-2.74877906944E11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2068()  throws Throwable  {
      double double0 = FastMath.scalb((-1.0271780540759147E-150), (-1811));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2069()  throws Throwable  {
      double double0 = FastMath.scalb(0.6747214144581297, (-1023));
      assertEquals(7.50652490542894E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2070()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2071()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2147103461, 2147103461);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2072()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2142066629), 2146391392);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2073()  throws Throwable  {
      double double0 = FastMath.scalb(922.8666433348297, (-4470));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2074()  throws Throwable  {
      double double0 = FastMath.scalb((-4.503599627370496E15), (-2114));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2075()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, (-2115166225));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2076()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 2266);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2077()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2078()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2079()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2080()  throws Throwable  {
      double double0 = FastMath.abs((-433.13575013));
      assertEquals(433.13575013, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2081()  throws Throwable  {
      double double0 = FastMath.hypot(2.85040095144011776E17, 1.9868161777724352E-8);
      assertEquals(2.85040095144011776E17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2082()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2083()  throws Throwable  {
      float float0 = FastMath.ulp(1017.3F);
      assertEquals(6.1035156E-5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2084()  throws Throwable  {
      long long0 = FastMath.abs((long) (-3619));
      assertEquals(3619L, long0);
  }

  @Test(timeout = 4000)
  public void test_2085()  throws Throwable  {
      long long0 = FastMath.abs(3952090531849364496L);
      assertEquals(3952090531849364496L, long0);
  }

  @Test(timeout = 4000)
  public void test_2086()  throws Throwable  {
      int int0 = FastMath.abs((-1312145731));
      assertEquals(1312145731, int0);
  }

  @Test(timeout = 4000)
  public void test_2087()  throws Throwable  {
      int int0 = FastMath.abs(1431655765);
      assertEquals(1431655765, int0);
  }

  @Test(timeout = 4000)
  public void test_2088()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2089()  throws Throwable  {
      double double0 = FastMath.toDegrees((-776.571));
      assertEquals((-44494.240792253855), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2090()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2091()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2092()  throws Throwable  {
      double double0 = FastMath.toRadians(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2093()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2094()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2095()  throws Throwable  {
      double double0 = FastMath.cbrt(7.453997425999124E-309);
      assertEquals(1.953423521451138E-103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2096()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2097()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2098()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2099()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2100()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2101()  throws Throwable  {
      double double0 = FastMath.acos((-1390.825845035449));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2102()  throws Throwable  {
      double double0 = FastMath.acos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2103()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2104()  throws Throwable  {
      double double0 = FastMath.asin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2105()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2106()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2107()  throws Throwable  {
      double double0 = FastMath.asin((-693.0969));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2108()  throws Throwable  {
      double double0 = FastMath.asin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2109()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2110()  throws Throwable  {
      double double0 = FastMath.atan2((-2860.3975), (-1.57333572310673E-310));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2111()  throws Throwable  {
      double double0 = FastMath.atan2(368, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2112()  throws Throwable  {
      double double0 = FastMath.atan2(5.041914939880371, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2113()  throws Throwable  {
      double double0 = FastMath.atan2((-4.503599627370496E15), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2114()  throws Throwable  {
      double double0 = FastMath.atan2((-1983.4388F), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2115()  throws Throwable  {
      double double0 = FastMath.atan2(1.01, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2116()  throws Throwable  {
      double double0 = FastMath.atan2(2.718281828459045, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2117()  throws Throwable  {
      double double0 = FastMath.atan2((-659.17253), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2118()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2119()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 0.2);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2120()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2121()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 2266);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2122()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1412.74754));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2123()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2124()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2125()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2126()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2127()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 0.1256551444530487);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2128()  throws Throwable  {
      double double0 = FastMath.atan2((-3651.0), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2129()  throws Throwable  {
      double double0 = FastMath.atan2((-1858.58), (-1858.58));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2130()  throws Throwable  {
      double double0 = FastMath.asin(0.031);
      assertEquals(0.031004967315082038, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2131()  throws Throwable  {
      double double0 = FastMath.atan2((-4.503599627370496E15), 1.5830993332061267E-10);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2132()  throws Throwable  {
      double double0 = FastMath.atan2(4.62601139369344E-309, (-5.04128025464686E71));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2133()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2134()  throws Throwable  {
      double double0 = FastMath.tan(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2135()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2136()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2137()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2138()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2139()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2140()  throws Throwable  {
      double double0 = FastMath.sin((-1905.917758881573));
      assertEquals((-0.8567743807969438), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2141()  throws Throwable  {
      double double0 = FastMath.sin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2142()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2143()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2144()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2145()  throws Throwable  {
      double double0 = FastMath.sin(8388607);
      assertEquals(0.9923450937696126, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2146()  throws Throwable  {
      double double0 = FastMath.cos(3.8656278695544835E114);
      assertEquals((-0.30985041233613), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2147()  throws Throwable  {
      double double0 = FastMath.sin(8388583);
      assertEquals(0.3090968242690512, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2148()  throws Throwable  {
      double double0 = FastMath.cos((-3.512380426745336E20));
      assertEquals(0.988121602818053, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2149()  throws Throwable  {
      double double0 = FastMath.tan(2.0545105444669818E11);
      assertEquals(1.1219853772293567, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2150()  throws Throwable  {
      double double0 = FastMath.sin(4.503599627370496E15);
      assertEquals(0.8742173026236351, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2151()  throws Throwable  {
      double double0 = FastMath.sin((-5.2744376732859406E250));
      assertEquals((-0.9050027766067021), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2152()  throws Throwable  {
      double double0 = FastMath.tan((-5.8180712702152444E212));
      assertEquals(18.746773068614086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2153()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2154()  throws Throwable  {
      double double0 = FastMath.sin((-2.2537635160762597E296));
      assertEquals(0.92694450194073, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2155()  throws Throwable  {
      double double0 = FastMath.sin((-1073741644));
      assertEquals((-0.9997176940746059), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2156()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028235E38F));
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2157()  throws Throwable  {
      double double0 = FastMath.tan((-0.5576592056049767));
      assertEquals((-0.6236934272109871), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2158()  throws Throwable  {
      double double0 = FastMath.sin(9.313225746154785E-10);
      assertEquals(9.313225746154785E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2159()  throws Throwable  {
      double double0 = FastMath.pow(3588.10092895, (-161));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2160()  throws Throwable  {
      double double0 = FastMath.pow(1.5518778128928824E-170, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2161()  throws Throwable  {
      double double0 = FastMath.pow((-699.694594149), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2162()  throws Throwable  {
      double double0 = FastMath.pow(3.4061835424180075E-242, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2163()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), (double) (-1.0F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2164()  throws Throwable  {
      double double0 = FastMath.pow((-709.9670987083852), (-709.9670987083852));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2165()  throws Throwable  {
      double double0 = FastMath.pow((-145.38541), 3.529920406834134E113);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2166()  throws Throwable  {
      double double0 = FastMath.pow((-2766.0), (double) 2266);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2167()  throws Throwable  {
      double double0 = FastMath.pow((double) (-3354.3147F), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2168()  throws Throwable  {
      double double0 = FastMath.pow(0.539891242980957, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2169()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1073741833);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2170()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1073741826);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2171()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) (-1.0F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2172()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) (-1732.0F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2173()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2174()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2175()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2.0810681643102672E-8);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2176()  throws Throwable  {
      double double0 = FastMath.pow(2.2038806519542315E-267, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2177()  throws Throwable  {
      double double0 = FastMath.pow(1.3097998705006566, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2178()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) 2266);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2179()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2180()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-714.41));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2181()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 1088);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2182()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2183()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-1732.0F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2184()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-259.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2185()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-301.97532244961747));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2186()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 1277.6658960453703);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2187()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 1107);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2188()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2189()  throws Throwable  {
      double double0 = FastMath.pow(4259.893656, (double) -0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2190()  throws Throwable  {
      double double0 = FastMath.log10(276);
      assertEquals(2.4409090820652177, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2191()  throws Throwable  {
      double double0 = FastMath.log1p(2079.0);
      assertEquals(7.640123172695364, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2192()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2193()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2194()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2195()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.0F, (double) 1.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2196()  throws Throwable  {
      double double0 = FastMath.pow(0.6415454149246216, 0.6415454149246216);
      assertEquals(0.752190122027258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2197()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-1299.42));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2198()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2199()  throws Throwable  {
      double double0 = FastMath.asinh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2200()  throws Throwable  {
      double double0 = FastMath.log1p((-5.7488127374));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2201()  throws Throwable  {
      double double0 = FastMath.atanh(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2202()  throws Throwable  {
      double double0 = FastMath.log10(-0.0F);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2203()  throws Throwable  {
      double double0 = FastMath.expm1((-4.713790209541894E-139));
      assertEquals((-4.713790209541894E-139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2204()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2205()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2206()  throws Throwable  {
      double double0 = FastMath.expm1(8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2207()  throws Throwable  {
      double double0 = FastMath.pow(0.167, 405.21766);
      assertEquals(1.07395796E-315, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2208()  throws Throwable  {
      double double0 = FastMath.expm1((-719.6921183813816));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2209()  throws Throwable  {
      double double0 = FastMath.exp((-1904.706199649));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2210()  throws Throwable  {
      double double0 = FastMath.exp((-709.9670987083852));
      assertEquals(4.62601139369344E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2211()  throws Throwable  {
      float float0 = FastMath.signum(1823.1548F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2212()  throws Throwable  {
      float float0 = FastMath.signum((-1173.22F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2213()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2214()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2215()  throws Throwable  {
      double double0 = FastMath.signum((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2216()  throws Throwable  {
      double double0 = FastMath.signum(9.496119530068797E19);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2217()  throws Throwable  {
      double double0 = FastMath.atanh(0.018315639346837997);
      assertEquals(0.018317687830105695, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2218()  throws Throwable  {
      double double0 = FastMath.atanh(0.07692307692307694);
      assertEquals(0.07707533991362917, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2219()  throws Throwable  {
      double double0 = FastMath.atanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2220()  throws Throwable  {
      double double0 = FastMath.atanh((-0.99999994F));
      assertEquals((-8.664339742098155), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2221()  throws Throwable  {
      double double0 = FastMath.asinh((-0.004363323125932291));
      assertEquals((-0.004363309280798513), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2222()  throws Throwable  {
      double double0 = FastMath.asinh(0.07692307692307694);
      assertEquals(0.07684741718867193, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2223()  throws Throwable  {
      double double0 = FastMath.asinh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2224()  throws Throwable  {
      double double0 = FastMath.tanh((-0.2526123165686223));
      assertEquals((-0.24737270307802384), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2225()  throws Throwable  {
      double double0 = FastMath.tanh((-20.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2226()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2227()  throws Throwable  {
      double double0 = FastMath.tanh(595.7);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2228()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2229()  throws Throwable  {
      double double0 = FastMath.tanh((-1301.3094471132733));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2230()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2231()  throws Throwable  {
      double double0 = FastMath.sinh((-859.0883294943189));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2232()  throws Throwable  {
      double double0 = FastMath.sinh((-478.0));
      assertEquals((-1.9576378535498093E207), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2233()  throws Throwable  {
      double double0 = FastMath.sinh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2234()  throws Throwable  {
      double double0 = FastMath.sinh(166.5115104484);
      assertEquals(1.0327617992093336E72, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2235()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2236()  throws Throwable  {
      double double0 = FastMath.sinh((-0.2499999997677497));
      assertEquals((-0.2526123165686223), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2237()  throws Throwable  {
      double double0 = FastMath.cosh((-507.1645424916));
      assertEquals(9.072609643993036E219, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2238()  throws Throwable  {
      double double0 = FastMath.cosh(480.39796470126);
      assertEquals(2.1535511514579595E208, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2239()  throws Throwable  {
      double double0 = FastMath.cosh(1073741826);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2240()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2241()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2242()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2243()  throws Throwable  {
      int int0 = FastMath.getExponent(1.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2244()  throws Throwable  {
      double double0 = FastMath.cosh((-4.503599627370496E15));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2245()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1612.3, 1612.3);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2246()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2247()  throws Throwable  {
      double double0 = FastMath.acos((-0.004363323125932291));
      assertEquals(1.5751596637662, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2248()  throws Throwable  {
      double double0 = FastMath.expm1((-2.0529011131616557E9));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2249()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2250()  throws Throwable  {
      long long0 = FastMath.round(457.2763384);
      assertEquals(457L, long0);
  }

  @Test(timeout = 4000)
  public void test_2251()  throws Throwable  {
      double double0 = FastMath.cos((-1466.3958));
      assertEquals((-0.7465271260766739), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_2252()  throws Throwable  {
      FastMath.getExponent((float) (-1317));
  }

  @Test(timeout = 4000)
  public void test_2253()  throws Throwable  {
      FastMath.copySign((-1017.4659F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_2254()  throws Throwable  {
      FastMath.copySign(1.0F, Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2255()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_2256()  throws Throwable  {
      FastMath.copySign((-159.2402776656), 2738.17);
  }

  @Test(timeout = 4000)
  public void test_2257()  throws Throwable  {
      FastMath.hypot(2.5465477111883854E-8, 3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_2258()  throws Throwable  {
      FastMath.hypot(1.7182818284590453, 1.3574569976673652E-8);
  }

  @Test(timeout = 4000)
  public void test_2259()  throws Throwable  {
      FastMath.max(642, 1112);
  }

  @Test(timeout = 4000)
  public void test_2260()  throws Throwable  {
      FastMath.min((-320L), (-320L));
  }

  @Test(timeout = 4000)
  public void test_2261()  throws Throwable  {
      FastMath.rint((-151.141));
  }

  @Test(timeout = 4000)
  public void test_2262()  throws Throwable  {
      FastMath.ceil((-1.000703086186836));
  }

  @Test(timeout = 4000)
  public void test_2263()  throws Throwable  {
      FastMath.round((-3.4028235E38F));
  }

  @Test(timeout = 4000)
  public void test_2264()  throws Throwable  {
      FastMath.floor(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_2265()  throws Throwable  {
      FastMath.scalb((-1.0F), 276);
  }

  @Test(timeout = 4000)
  public void test_2266()  throws Throwable  {
      FastMath.scalb(2674.88F, (-277));
  }

  @Test(timeout = 4000)
  public void test_2267()  throws Throwable  {
      FastMath.scalb(0.5F, 128);
  }

  @Test(timeout = 4000)
  public void test_2268()  throws Throwable  {
      FastMath.scalb(1732.6320740981512, 2097);
  }

  @Test(timeout = 4000)
  public void test_2269()  throws Throwable  {
      FastMath.scalb(278.093994, (-2098));
  }

  @Test(timeout = 4000)
  public void test_2270()  throws Throwable  {
      FastMath.scalb(657.06, 1024);
  }

  @Test(timeout = 4000)
  public void test_2271()  throws Throwable  {
      FastMath.ulp((-2512.3F));
  }

  @Test(timeout = 4000)
  public void test_2272()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2273()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_2274()  throws Throwable  {
      FastMath.abs((long) 1318);
  }

  @Test(timeout = 4000)
  public void test_2275()  throws Throwable  {
      FastMath.toDegrees(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_2276()  throws Throwable  {
      FastMath.toRadians(1.951876992743923);
  }

  @Test(timeout = 4000)
  public void test_2277()  throws Throwable  {
      FastMath.cbrt((-3.8834864931005E-310));
  }

  @Test(timeout = 4000)
  public void test_2278()  throws Throwable  {
      FastMath.asin(0.8872109434018359);
  }

  @Test(timeout = 4000)
  public void test_2279()  throws Throwable  {
      FastMath.atan2(0.0, 0.05235987755982989);
  }

  @Test(timeout = 4000)
  public void test_2280()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_2281()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2282()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2283()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2284()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2285()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_2286()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_2287()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_2288()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_2289()  throws Throwable  {
      FastMath.expm1(1L);
  }

  @Test(timeout = 4000)
  public void test_2290()  throws Throwable  {
      FastMath.expm1((-1));
  }

  @Test(timeout = 4000)
  public void test_2291()  throws Throwable  {
      FastMath.pow((double) (-1142.1345F), (-106.0));
  }

  @Test(timeout = 4000)
  public void test_2292()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_2293()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_2294()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_2295()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_2296()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_2297()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_2298()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2299()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2300()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2301()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2302()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2303()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2304()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2305()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_2306()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_2307()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_2308()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_2309()  throws Throwable  {
      FastMath.atan2(0.9315965175628662, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_2310()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_2311()  throws Throwable  {
      FastMath.sqrt(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2312()  throws Throwable  {
      FastMath.signum(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2313()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_2314()  throws Throwable  {
      FastMath.round(874.0604F);
  }

  @Test(timeout = 4000)
  public void test_2315()  throws Throwable  {
      FastMath.round((double) 1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_2316()  throws Throwable  {
      FastMath.round((double) Float.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2317()  throws Throwable  {
      FastMath.rint((-2645.5509));
  }

  @Test(timeout = 4000)
  public void test_2318()  throws Throwable  {
      FastMath.pow(7.848361555046424E-8, 709);
  }

  @Test(timeout = 4000)
  public void test_2319()  throws Throwable  {
      FastMath.pow((-730.0), 1);
  }

  @Test(timeout = 4000)
  public void test_2320()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_2321()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_2322()  throws Throwable  {
      FastMath.nextAfter((float) 0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2323()  throws Throwable  {
      FastMath.nextAfter((double) 0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2324()  throws Throwable  {
      FastMath.min(4368491638549381120L, (long) 1318);
  }

  @Test(timeout = 4000)
  public void test_2325()  throws Throwable  {
      FastMath.min(0, 105);
  }

  @Test(timeout = 4000)
  public void test_2326()  throws Throwable  {
      FastMath.min(2176, 2176);
  }

  @Test(timeout = 4000)
  public void test_2327()  throws Throwable  {
      FastMath.min(2.14458099E9F, (-1196.5706F));
  }

  @Test(timeout = 4000)
  public void test_2328()  throws Throwable  {
      FastMath.max(0L, (-2121L));
  }

  @Test(timeout = 4000)
  public void test_2329()  throws Throwable  {
      FastMath.max((-320L), (-320L));
  }

  @Test(timeout = 4000)
  public void test_2330()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_2331()  throws Throwable  {
      FastMath.max((-112), (-112));
  }

  @Test(timeout = 4000)
  public void test_2332()  throws Throwable  {
      FastMath.max((-2496.542032554), 0.0);
  }

  @Test(timeout = 4000)
  public void test_2333()  throws Throwable  {
      FastMath.max((-0.12502530217170715), (-0.12502530217170715));
  }

  @Test(timeout = 4000)
  public void test_2334()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_2335()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_2336()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_2337()  throws Throwable  {
      FastMath.log(0.0, 0.1111111111111111);
  }

  @Test(timeout = 4000)
  public void test_2338()  throws Throwable  {
      FastMath.log(2.0902722826084166E-199, (double) 0.5F);
  }

  @Test(timeout = 4000)
  public void test_2339()  throws Throwable  {
      FastMath.log((double) 1.0F, 0.4145383834838867);
  }

  @Test(timeout = 4000)
  public void test_2340()  throws Throwable  {
      FastMath.log((double) 1547.6835F);
  }

  @Test(timeout = 4000)
  public void test_2341()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_2342()  throws Throwable  {
      FastMath.getExponent((float) 1L);
  }

  @Test(timeout = 4000)
  public void test_2343()  throws Throwable  {
      FastMath.getExponent(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_2344()  throws Throwable  {
      FastMath.getExponent(1.5);
  }

  @Test(timeout = 4000)
  public void test_2345()  throws Throwable  {
      FastMath.getExponent((double) 910.0F);
  }

  @Test(timeout = 4000)
  public void test_2346()  throws Throwable  {
      FastMath.exp(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_2347()  throws Throwable  {
      FastMath.copySign(0.0, (-1577.0745));
  }

  @Test(timeout = 4000)
  public void test_2348()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2349()  throws Throwable  {
      FastMath.atan(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_2350()  throws Throwable  {
      FastMath.atan((-717.968707541583));
  }

  @Test(timeout = 4000)
  public void test_2351()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_2352()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_2353()  throws Throwable  {
      FastMath.acosh(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_2354()  throws Throwable  {
      FastMath.acosh((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_2355()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_2356()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_2357()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2358()  throws Throwable  {
      FastMath.IEEEremainder(0.0, (-1831.4));
  }

  @Test(timeout = 4000)
  public void test_2359()  throws Throwable  {
      FastMath.IEEEremainder(553.20012732986, 4042.812706373767);
  }

  @Test(timeout = 4000)
  public void test_2360()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-0.0011194701915796426), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_2361()  throws Throwable  {
      double double0 = FastMath.copySign(2.718281828459045, 313.7789986);
      assertEquals(2.718281828459045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2362()  throws Throwable  {
      double double0 = FastMath.floor((-730.0));
      assertEquals((-730.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2363()  throws Throwable  {
      double double0 = FastMath.floor((-755.141334981673));
      assertEquals((-756.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2364()  throws Throwable  {
      double double0 = FastMath.floor((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2365()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2366()  throws Throwable  {
      double double0 = FastMath.floor(0.8033811974749892);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2367()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3225.0F), 758.9875485880606);
      assertEquals((-3224.9998F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2368()  throws Throwable  {
      float float0 = FastMath.nextAfter(2461.0F, 6.123233995736766E-17);
      assertEquals(2460.9998F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2369()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 3.141592653589793);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2370()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 111.1631176372);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2371()  throws Throwable  {
      double double0 = FastMath.nextAfter(1595.2600187, 1713.87);
      assertEquals(1595.2600187000003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2372()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-127.95F), 5.721188726109833E-18);
      assertEquals((-127.94999694824217), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2373()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 1012.6437049);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2374()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-112), (-112));
      assertEquals((-2.1570415377137042E-32), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2375()  throws Throwable  {
      double double0 = FastMath.abs(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2376()  throws Throwable  {
      float float0 = FastMath.abs(5185.0F);
      assertEquals(5185.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2377()  throws Throwable  {
      double double0 = FastMath.pow(0.097, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2378()  throws Throwable  {
      int int0 = FastMath.getExponent((double) 0.0F);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_2379()  throws Throwable  {
      double double0 = FastMath.sqrt(1495.4154F);
      assertEquals(38.67060130478239, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2380()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2381()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-1501), (float) 2144581051);
      assertEquals(1501.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2382()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, (-2169.337F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2383()  throws Throwable  {
      float float0 = FastMath.copySign(524.04443F, 524.04443F);
      assertEquals(524.04443F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2384()  throws Throwable  {
      float float0 = FastMath.copySign((-2169.337F), (-2169.337F));
      assertEquals((-2169.337F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2385()  throws Throwable  {
      double double0 = FastMath.copySign((-3.886351942973105E7), 0.0);
      assertEquals(3.886351942973105E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2386()  throws Throwable  {
      double double0 = FastMath.copySign(2.718281828459045, (-3387.3287430602));
      assertEquals((-2.718281828459045), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2387()  throws Throwable  {
      double double0 = FastMath.copySign((-1.3342857299467437), (-1.3342857299467437));
      assertEquals((-1.3342857299467437), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2388()  throws Throwable  {
      double double0 = FastMath.hypot(1.0, 1.633123935319537E16);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2389()  throws Throwable  {
      double double0 = FastMath.hypot((-4.503599627370496E15), 1.8005242480088435);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2390()  throws Throwable  {
      double double0 = FastMath.hypot((-4.068233003401932E-9), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2391()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NaN, Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2392()  throws Throwable  {
      double double0 = FastMath.hypot((-1.5707963267948966), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2393()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, 754.7633396208242);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2394()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-2.2250738585072014E-308));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2395()  throws Throwable  {
      double double0 = FastMath.max(1.8338691637947184, 1.8338691637947184);
      assertEquals(1.8338691637947184, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2396()  throws Throwable  {
      double double0 = FastMath.max(2698.173, 0.2852376699447632);
      assertEquals(2698.173, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2397()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2398()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, (-366.0F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2399()  throws Throwable  {
      float float0 = FastMath.max((-2128.0F), 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2400()  throws Throwable  {
      float float0 = FastMath.max(1495.4154F, 73.0F);
      assertEquals(1495.4154F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2401()  throws Throwable  {
      float float0 = FastMath.max((-3349.15F), (-3349.15F));
      assertEquals((-3349.15F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2402()  throws Throwable  {
      long long0 = FastMath.max((-1L), (long) 660);
      assertEquals(660L, long0);
  }

  @Test(timeout = 4000)
  public void test_2403()  throws Throwable  {
      int int0 = FastMath.max(2721, 1485);
      assertEquals(2721, int0);
  }

  @Test(timeout = 4000)
  public void test_2404()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2405()  throws Throwable  {
      double double0 = FastMath.min(0.11111095942313305, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2406()  throws Throwable  {
      double double0 = FastMath.min((-2.356194490192345), 1.0921536132159379E198);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2407()  throws Throwable  {
      double double0 = FastMath.min(2.05, (-1330.487));
      assertEquals((-1330.487), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2408()  throws Throwable  {
      double double0 = FastMath.min(1210.6, 1210.6);
      assertEquals(1210.6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2409()  throws Throwable  {
      float float0 = FastMath.min(2277.0F, 2277.0F);
      assertEquals(2277.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2410()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2411()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2412()  throws Throwable  {
      float float0 = FastMath.min(897.09155F, 3823.4F);
      assertEquals(897.09155F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2413()  throws Throwable  {
      long long0 = FastMath.min((long) (-4042), 1984L);
      assertEquals((-4042L), long0);
  }

  @Test(timeout = 4000)
  public void test_2414()  throws Throwable  {
      long long0 = FastMath.min(2011L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2415()  throws Throwable  {
      int int0 = FastMath.min((-1317), (-1317));
      assertEquals((-1317), int0);
  }

  @Test(timeout = 4000)
  public void test_2416()  throws Throwable  {
      int int0 = FastMath.min(708, (-2144545913));
      assertEquals((-2144545913), int0);
  }

  @Test(timeout = 4000)
  public void test_2417()  throws Throwable  {
      double double0 = FastMath.rint(1.5);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2418()  throws Throwable  {
      double double0 = FastMath.rint(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2419()  throws Throwable  {
      double double0 = FastMath.rint((-1.605251622332555E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2420()  throws Throwable  {
      double double0 = FastMath.rint(1539.9218855121878);
      assertEquals(1540.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2421()  throws Throwable  {
      double double0 = FastMath.ceil((-6.032174644509064E-23));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2422()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2423()  throws Throwable  {
      double double0 = FastMath.ceil((-110));
      assertEquals((-110.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2424()  throws Throwable  {
      double double0 = FastMath.ceil(0.5646255016326904);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2425()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2426()  throws Throwable  {
      float float0 = FastMath.nextUp(2319.0425F);
      assertEquals(2319.0427F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2427()  throws Throwable  {
      float float0 = FastMath.nextAfter((-926.23F), (-2645.5509));
      assertEquals((-926.23004F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2428()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-3509.02813971821));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2429()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 7.694715047457021);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2430()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2431()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-313), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2432()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 255.9387);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2433()  throws Throwable  {
      double double0 = FastMath.nextUp(1539.9218855121878);
      assertEquals(1539.921885512188, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2434()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.2027015686035156, (-9.183365));
      assertEquals(1.2027015686035154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2435()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-603.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2436()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 3743.0);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2437()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-2.7943366835352838E-8));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2438()  throws Throwable  {
      double double0 = FastMath.nextAfter(4.9E-324, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2439()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-1142.137));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2440()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-270), (-270));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2441()  throws Throwable  {
      float float0 = FastMath.scalb((-3513.3152F), (-158));
      assertEquals((-9.8E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2442()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2443()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, 207);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2444()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2012, 2012);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2445()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2446()  throws Throwable  {
      float float0 = FastMath.scalb(239.755F, (-3368));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2447()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-2146282482));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2448()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 2144581051);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2449()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-2476));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2450()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-110), (-110));
      assertEquals((-8.474092E-32F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2451()  throws Throwable  {
      float float0 = FastMath.scalb((-428.7178F), 2012);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2452()  throws Throwable  {
      float float0 = FastMath.scalb((-4085.0F), (-1625));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2453()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2250738585072014E-308), 1112);
      assertEquals((-1.2379400392853803E27), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2454()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-127), (-1540));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2455()  throws Throwable  {
      double double0 = FastMath.scalb(1.8914212864250446, (-1023));
      assertEquals(2.1042760299242145E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2456()  throws Throwable  {
      double double0 = FastMath.scalb(1.8019459247589111, (-1023));
      assertEquals(2.004731385812319E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2457()  throws Throwable  {
      double double0 = FastMath.scalb((-5.721188726109833E-18), 2144581051);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2458()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2144581051, 2144581051);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2459()  throws Throwable  {
      double double0 = FastMath.scalb(8.835485213510683, (-2854));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2460()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1073055614), (-1073055614));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2461()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 134217729);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2462()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, 2144581075);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2463()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1023));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2464()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1073055614), 1187);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2465()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2466()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2467()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2468()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2469()  throws Throwable  {
      double double0 = FastMath.ulp((-1328.70841));
      assertEquals(2.2737367544323206E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2470()  throws Throwable  {
      double double0 = FastMath.abs(281.329660161537);
      assertEquals(281.329660161537, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2471()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2472()  throws Throwable  {
      float float0 = FastMath.abs((-1.0F));
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2473()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2474()  throws Throwable  {
      int int0 = FastMath.abs((-421));
      assertEquals(421, int0);
  }

  @Test(timeout = 4000)
  public void test_2475()  throws Throwable  {
      int int0 = FastMath.abs(1179);
      assertEquals(1179, int0);
  }

  @Test(timeout = 4000)
  public void test_2476()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2477()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1.3342857299467437));
      assertEquals((-76.44894099048072), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2478()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2479()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2480()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2481()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2482()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2483()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2484()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2485()  throws Throwable  {
      double double0 = FastMath.cbrt((-2.2250738585072014E-308));
      assertEquals((-2.812644285236262E-103), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2486()  throws Throwable  {
      double double0 = FastMath.acos((-5.721188726109833E-18));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2487()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2488()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2489()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2490()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2491()  throws Throwable  {
      double double0 = FastMath.acos(3802.63526);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2492()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2493()  throws Throwable  {
      double double0 = FastMath.acos((-1753.615F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2494()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2495()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2496()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2497()  throws Throwable  {
      double double0 = FastMath.asin((-1866.56882573282));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2498()  throws Throwable  {
      double double0 = FastMath.asin(492.3347);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2499()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2500()  throws Throwable  {
      double double0 = FastMath.atan2((-2169.1314716335), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2501()  throws Throwable  {
      double double0 = FastMath.atan2((-3.940510424527919E-20), -0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2502()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2503()  throws Throwable  {
      double double0 = FastMath.atan2((-2496.29642661639), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2504()  throws Throwable  {
      double double0 = FastMath.atan2(3294198.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2505()  throws Throwable  {
      double double0 = FastMath.atan2(2144581051, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2506()  throws Throwable  {
      double double0 = FastMath.atan2((-4.503599627370496E15), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2507()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2508()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2509()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2510()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2511()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2512()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 0.366272509098053);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2513()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, (-2128));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2514()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, -0.0F);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2515()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2516()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2517()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2518()  throws Throwable  {
      double double0 = FastMath.atan2(492.3347, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2519()  throws Throwable  {
      double double0 = FastMath.atan2(2.403806217004454E138, 2.403806217004454E138);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2520()  throws Throwable  {
      double double0 = FastMath.asin((-1.605251622332555E-8));
      assertEquals((-1.605251622332555E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2521()  throws Throwable  {
      double double0 = FastMath.atan2((-1276.0), (-5.721188726109833E-18));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2522()  throws Throwable  {
      double double0 = FastMath.atan2(4.604606371472047E299, (-2.329967807055457E-10));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2523()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2524()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2525()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2526()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2527()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2528()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2529()  throws Throwable  {
      double double0 = FastMath.sin(2.718281828459045);
      assertEquals(0.41078129050290885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2530()  throws Throwable  {
      double double0 = FastMath.sin((-1604.029896693));
      assertEquals((-0.9696876602758614), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2531()  throws Throwable  {
      double double0 = FastMath.sin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2532()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2533()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2534()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2535()  throws Throwable  {
      double double0 = FastMath.cos((-8.0E298));
      assertEquals((-0.9991033281235678), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2536()  throws Throwable  {
      double double0 = FastMath.cos(4.140660584406384E188);
      assertEquals((-0.5950377055092694), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2537()  throws Throwable  {
      double double0 = FastMath.tan(2.85040095144011776E17);
      assertEquals((-108.83538159540501), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2538()  throws Throwable  {
      double double0 = FastMath.sin((-4.503599627370496E15));
      assertEquals((-0.8742173026236351), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2539()  throws Throwable  {
      double double0 = FastMath.sin((-4.443798187035849E125));
      assertEquals((-0.9994894044252355), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2540()  throws Throwable  {
      double double0 = FastMath.cos(2.934570385464815E247);
      assertEquals((-0.16173033752392985), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2541()  throws Throwable  {
      double double0 = FastMath.cos(2.976165301105432E120);
      assertEquals((-0.9575568146555768), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2542()  throws Throwable  {
      double double0 = FastMath.cos(1.633123935319537E16);
      assertEquals((-0.28443016146380146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2543()  throws Throwable  {
      double double0 = FastMath.tan(1.7976931348623157E308);
      assertEquals((-0.004962015874444895), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2544()  throws Throwable  {
      double double0 = FastMath.tan(0.5545934978279704);
      assertEquals(0.6194432922685323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2545()  throws Throwable  {
      double double0 = FastMath.sin(1.3877787807814457E-17);
      assertEquals(1.3877787807814457E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2546()  throws Throwable  {
      double double0 = FastMath.pow((double) (-110), (-110));
      assertEquals(2.79772248084661E-225, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2547()  throws Throwable  {
      double double0 = FastMath.pow(2.5465477111883854E-8, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2548()  throws Throwable  {
      double double0 = FastMath.pow(8.0E298, 8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2549()  throws Throwable  {
      double double0 = FastMath.pow((double) (-127), (double) (-127));
      assertEquals((-6.560356474884124E-268), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2550()  throws Throwable  {
      double double0 = FastMath.pow((-4272.1273), (-4272.1273));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2551()  throws Throwable  {
      double double0 = FastMath.pow((-8.0E298), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2552()  throws Throwable  {
      double double0 = FastMath.pow((-3.6983808988303125E-20), 3.4595555602536527E261);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2553()  throws Throwable  {
      double double0 = FastMath.pow((-9.179458802504127E-9), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2554()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2555()  throws Throwable  {
      double double0 = FastMath.pow((double) (-127), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2556()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1023);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2557()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 0.8333333333333334);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2558()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-730.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2559()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-1142.1345F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2560()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 746);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2561()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2562()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) (-1283));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2563()  throws Throwable  {
      double double0 = FastMath.pow(8.979279989292184E-9, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2564()  throws Throwable  {
      double double0 = FastMath.pow(1.0, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2565()  throws Throwable  {
      double double0 = FastMath.pow((double) 2144581051, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2566()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2567()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2568()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2569()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 2406);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2570()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 1.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2571()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-603.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2572()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) 2.7524717F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2573()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-0.7853981633974483));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2574()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2575()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2576()  throws Throwable  {
      double double0 = FastMath.log1p((-127));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2577()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0898941254272996E-7));
      assertEquals((-1.0898941848207643E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2578()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2579()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2580()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2581()  throws Throwable  {
      double double0 = FastMath.pow((double) 1, (-0.010714690733195933));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2582()  throws Throwable  {
      double double0 = FastMath.log1p(0.5000000000042687);
      assertEquals(0.40546510811101016, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2583()  throws Throwable  {
      double double0 = FastMath.log(0.5604744922343463);
      assertEquals((-0.5789715464540207), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2584()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324);
      assertEquals((-744.4400719213812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2585()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2586()  throws Throwable  {
      double double0 = FastMath.log(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2587()  throws Throwable  {
      double double0 = FastMath.expm1((-2.1570415E-32F));
      assertEquals((-2.1570415377137042E-32), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2588()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2589()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2590()  throws Throwable  {
      double double0 = FastMath.expm1(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2591()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2592()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2593()  throws Throwable  {
      double double0 = FastMath.expm1((-718.8664041670397));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2594()  throws Throwable  {
      float float0 = FastMath.signum(1547.6835F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2595()  throws Throwable  {
      float float0 = FastMath.signum((-1142.1345F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2596()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2597()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2598()  throws Throwable  {
      double double0 = FastMath.signum((double) (-112));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2599()  throws Throwable  {
      double double0 = FastMath.signum(236.7193368344);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2600()  throws Throwable  {
      double double0 = FastMath.atanh((-0.004962015874444895));
      assertEquals((-0.004962056599305753), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2601()  throws Throwable  {
      double double0 = FastMath.atanh((-1.5707963267948966));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2602()  throws Throwable  {
      double double0 = FastMath.asinh(0.01745329052209854);
      assertEquals(0.017452404547689187, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2603()  throws Throwable  {
      double double0 = FastMath.asinh((-5.721188726109833E-18));
      assertEquals((-5.721188726109833E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2604()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2605()  throws Throwable  {
      double double0 = FastMath.tanh((-5.721188726109833E-18));
      assertEquals((-5.721188726109833E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2606()  throws Throwable  {
      double double0 = FastMath.tanh(943.2226634);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2607()  throws Throwable  {
      double double0 = FastMath.tanh(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2608()  throws Throwable  {
      double double0 = FastMath.tanh((-3154.1526));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2609()  throws Throwable  {
      double double0 = FastMath.sinh((-4.8293856891818295E-8));
      assertEquals((-4.8293856891818315E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2610()  throws Throwable  {
      double double0 = FastMath.sinh((-1230.27830523));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2611()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2612()  throws Throwable  {
      double double0 = FastMath.sinh(129.0);
      assertEquals(5.283943557181294E55, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2613()  throws Throwable  {
      double double0 = FastMath.sinh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2614()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2615()  throws Throwable  {
      double double0 = FastMath.sinh((-444.21));
      assertEquals((-4.1392514594074175E192), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2616()  throws Throwable  {
      double double0 = FastMath.cosh((-278.093994));
      assertEquals(2.976165301105432E120, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2617()  throws Throwable  {
      double double0 = FastMath.cosh(492.3347);
      assertEquals(3.2901330730943075E213, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2618()  throws Throwable  {
      double double0 = FastMath.cosh(1365.8);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2619()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2620()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-281.7659));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2621()  throws Throwable  {
      double double0 = FastMath.atan2((-2.8421709430404007E-14), (-2.8421709430404007E-14));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2622()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2623()  throws Throwable  {
      double double0 = FastMath.log(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2624()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_2625()  throws Throwable  {
      double double0 = FastMath.cosh((-730.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2626()  throws Throwable  {
      double double0 = FastMath.nextUp((-41.124019));
      assertEquals((-41.12401899999999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2627()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(3392.25, (-2062.39));
      assertEquals((-732.5299999999997), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2628()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2629()  throws Throwable  {
      double double0 = FastMath.asinh(2.047863006591797);
      assertEquals(1.4648378260732091, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2630()  throws Throwable  {
      double double0 = FastMath.expm1((-2697.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2631()  throws Throwable  {
      long long0 = FastMath.round((-3154.1526));
      assertEquals((-3154L), long0);
  }
@Test(timeout = 4000)
  public void test_2632()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), 0.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2633()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NaN, (-3221.1218F));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2634()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2635()  throws Throwable  {
      double double0 = FastMath.copySign((-1444.0), (double) 0.0F);
      assertEquals(1444.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2636()  throws Throwable  {
      double double0 = FastMath.hypot(5.0614674548127384E-8, 4.0);
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2637()  throws Throwable  {
      double double0 = FastMath.hypot(3.141592653589793, 1.883511811213715E-8);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2638()  throws Throwable  {
      long long0 = FastMath.max(29L, 6722166367014452318L);
      assertEquals(6722166367014452318L, long0);
  }

  @Test(timeout = 4000)
  public void test_2639()  throws Throwable  {
      long long0 = FastMath.min((-1950L), 1023L);
      assertEquals((-1950L), long0);
  }

  @Test(timeout = 4000)
  public void test_2640()  throws Throwable  {
      int int0 = FastMath.min(587, 171877716);
      assertEquals(587, int0);
  }

  @Test(timeout = 4000)
  public void test_2641()  throws Throwable  {
      double double0 = FastMath.rint(1.6487212181091309);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2642()  throws Throwable  {
      double double0 = FastMath.rint(0.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2643()  throws Throwable  {
      double double0 = FastMath.ceil((-2.356194490192345));
      assertEquals((-2.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2644()  throws Throwable  {
      double double0 = FastMath.ceil((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2645()  throws Throwable  {
      long long0 = FastMath.round(4.503599627370496E15);
      assertEquals(4503599627370496L, long0);
  }

  @Test(timeout = 4000)
  public void test_2646()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-127));
      assertEquals((-5.877472E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2647()  throws Throwable  {
      float float0 = FastMath.scalb((-1392.423F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2648()  throws Throwable  {
      double double0 = FastMath.scalb(1.0398354530334473, (-1023));
      assertEquals(1.156855341846858E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2649()  throws Throwable  {
      double double0 = FastMath.scalb(2400.87737362, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2650()  throws Throwable  {
      double double0 = FastMath.scalb((double) 944, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2651()  throws Throwable  {
      float float0 = FastMath.ulp(2714.047F);
      assertEquals(2.4414062E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2652()  throws Throwable  {
      double double0 = FastMath.ulp(2173.09139929);
      assertEquals(4.547473508864641E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2653()  throws Throwable  {
      double double0 = FastMath.abs(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2654()  throws Throwable  {
      float float0 = FastMath.abs(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2655()  throws Throwable  {
      double double0 = FastMath.toDegrees(104.0);
      assertEquals(5958.761069360561, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2656()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2657()  throws Throwable  {
      double double0 = FastMath.asin(0.366272509098053);
      assertEquals(0.37499997851925765, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2658()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 12.898619726925823);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2659()  throws Throwable  {
      double double0 = FastMath.acos(6.123233995736766E-17);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2660()  throws Throwable  {
      double double0 = FastMath.tan(1.5707963267948966);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2661()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0);
      assertEquals((-0.7734333808731876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2662()  throws Throwable  {
      double double0 = FastMath.cos(1.5707963267948966);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2663()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2664()  throws Throwable  {
      double double0 = FastMath.sin(1.5707963267948966);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2665()  throws Throwable  {
      double double0 = FastMath.sin(3294198.0);
      assertEquals((-0.6117971622964877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2666()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0E-6));
      assertEquals((-1.0000005000003334E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2667()  throws Throwable  {
      double double0 = FastMath.log1p(1.0E-6);
      assertEquals(9.999995000003334E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2668()  throws Throwable  {
      double double0 = FastMath.expm1(1L);
      assertEquals(1.7182818284590453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2669()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2670()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2671()  throws Throwable  {
      double double0 = FastMath.atanh(0.087);
      assertEquals(0.08722050326312049, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2672()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2673()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2674()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2675()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2676()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2677()  throws Throwable  {
      double double0 = FastMath.sinh(0.25);
      assertEquals(0.2526123168081683, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2678()  throws Throwable  {
      double double0 = FastMath.sinh((-709.782712893384));
      assertEquals((-8.988465674311366E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2679()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2680()  throws Throwable  {
      double double0 = FastMath.sinh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2681()  throws Throwable  {
      double double0 = FastMath.sinh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2682()  throws Throwable  {
      double double0 = FastMath.cosh((-709.782712893384));
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2683()  throws Throwable  {
      double double0 = FastMath.cosh((-20.0));
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2684()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2685()  throws Throwable  {
      double double0 = FastMath.cosh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2686()  throws Throwable  {
      double double0 = FastMath.toRadians(2.2250738585072014E-308);
      assertEquals(3.8834864931005E-310, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2687()  throws Throwable  {
      double double0 = FastMath.toRadians((-2.2250738585072014E-308));
      assertEquals((-3.8834864931005E-310), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2688()  throws Throwable  {
      double double0 = FastMath.toRadians((-627.402601));
      assertEquals((-10.950241123026268), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2689()  throws Throwable  {
      double double0 = FastMath.toDegrees((-2723.62988931901));
      assertEquals((-156052.4976136628), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2690()  throws Throwable  {
      double double0 = FastMath.sqrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2691()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2692()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2693()  throws Throwable  {
      int int0 = FastMath.round((float) 3394L);
      assertEquals(3394, int0);
  }

  @Test(timeout = 4000)
  public void test_2694()  throws Throwable  {
      long long0 = FastMath.round(Double.NaN);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2695()  throws Throwable  {
      Random.setNextRandom((-3652));
      double double0 = FastMath.random();
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2696()  throws Throwable  {
      double double0 = FastMath.pow((-28.071999999999996), 3);
      assertEquals((-22121.77982924799), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2697()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2698()  throws Throwable  {
      double double0 = FastMath.nextUp((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2699()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.4E-45F, (double) (-2098));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2700()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) -0.0F, (double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2701()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2702()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2703()  throws Throwable  {
      double double0 = FastMath.min(0.0, 1.0932279207149782E-7);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2704()  throws Throwable  {
      long long0 = FastMath.max((-2223L), (-9223372036854775807L));
      assertEquals((-2223L), long0);
  }

  @Test(timeout = 4000)
  public void test_2705()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2706()  throws Throwable  {
      int int0 = FastMath.max((-1942), (-1942));
      assertEquals((-1942), int0);
  }

  @Test(timeout = 4000)
  public void test_2707()  throws Throwable  {
      double double0 = FastMath.max(0.0, (-3034.213877939084));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2708()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2709()  throws Throwable  {
      double double0 = FastMath.log10(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2710()  throws Throwable  {
      double double0 = FastMath.log(0.0, 624.984813489724);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2711()  throws Throwable  {
      double double0 = FastMath.log(12.076639124676689, 6.938871462941557E63);
      assertEquals(59.00597959520394, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2712()  throws Throwable  {
      double double0 = FastMath.log((double) 85, 0.9985313415527344);
      assertEquals((-3.3082452309192624E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2713()  throws Throwable  {
      double double0 = FastMath.log((double) 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2714()  throws Throwable  {
      double double0 = FastMath.log(3.141592653589793);
      assertEquals(1.1447298858494002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2715()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2716()  throws Throwable  {
      int int0 = FastMath.getExponent((float) 1L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2717()  throws Throwable  {
      int int0 = FastMath.getExponent((float) 0);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_2718()  throws Throwable  {
      int int0 = FastMath.getExponent(1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2719()  throws Throwable  {
      int int0 = FastMath.getExponent(2617.4784);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_2720()  throws Throwable  {
      double double0 = FastMath.exp((-6.793094743406533E110));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2721()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), (-1677.9F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2722()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, Double.NaN);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2723()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2724()  throws Throwable  {
      double double0 = FastMath.atanh((-3.43338934259355E-8));
      assertEquals((-3.433389342593551E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2725()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2726()  throws Throwable  {
      double double0 = FastMath.atan((-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2727()  throws Throwable  {
      double double0 = FastMath.acosh(1593.0);
      assertEquals(8.066521391953597, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2728()  throws Throwable  {
      double double0 = FastMath.acosh((-4.503599627370496E15));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2729()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2730()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_2731()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2732()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_2733()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1.0000001F, 1.0F);
      assertEquals(1.1920928955078125E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2734()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1L), (-497.97321817506));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2735()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_2736()  throws Throwable  {
      double double0 = FastMath.copySign(1.5707963, (double) 345);
      assertEquals(1.5707963, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2737()  throws Throwable  {
      double double0 = FastMath.copySign(0.3936265707015991, (-2.356194490192345));
      assertEquals((-0.3936265707015991), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2738()  throws Throwable  {
      double double0 = FastMath.floor(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2739()  throws Throwable  {
      double double0 = FastMath.floor((-276.0));
      assertEquals((-276.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2740()  throws Throwable  {
      double double0 = FastMath.floor((-2.928362616578011E142));
      assertEquals((-2.928362616578011E142), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2741()  throws Throwable  {
      double double0 = FastMath.floor(1.5340733916570804E145);
      assertEquals(1.5340733916570804E145, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2742()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2743()  throws Throwable  {
      double double0 = FastMath.floor((-1.5769399025229002E-17));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2744()  throws Throwable  {
      float float0 = FastMath.nextAfter((-999.2105F), (-8.0E298));
      assertEquals((-999.2106F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2745()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), 1.0);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2746()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, 4.0);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2747()  throws Throwable  {
      double double0 = FastMath.nextAfter(619.1373498004061, 3617.039427);
      assertEquals(619.1373498004062, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2748()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-1541), 1.5628822871880503E-18);
      assertEquals((-1540.9999999999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2749()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 4.445372986583078E-135);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2750()  throws Throwable  {
      double double0 = FastMath.scalb((-2.529950530235105E-8), 746);
      assertEquals((-9.364590575255805E216), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2751()  throws Throwable  {
      float float0 = FastMath.abs((-211.0F));
      assertEquals(211.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2752()  throws Throwable  {
      double double0 = FastMath.pow(3113.69255317333, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2753()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_2754()  throws Throwable  {
      double double0 = FastMath.sqrt(948.143757);
      assertEquals(30.79194305333783, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2755()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2756()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-2566L), 1.0F);
      assertEquals(2566.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2757()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, (float) (-1781));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2758()  throws Throwable  {
      float float0 = FastMath.copySign((float) 709, 1.4E-45F);
      assertEquals(709.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2759()  throws Throwable  {
      double double0 = FastMath.copySign((-2906.079665), Double.NaN);
      assertEquals(2906.079665, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2760()  throws Throwable  {
      double double0 = FastMath.copySign((-2881.011191883276), (-2881.011191883276));
      assertEquals((-2881.011191883276), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2761()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 8.066521391953597);
      assertEquals(8.066521391953597, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2762()  throws Throwable  {
      double double0 = FastMath.hypot((-127), (-7.464389E-37F));
      assertEquals(127.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2763()  throws Throwable  {
      double double0 = FastMath.hypot(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2764()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2765()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2766()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2767()  throws Throwable  {
      double double0 = FastMath.max((-4.9E-324), (-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2768()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-2.5857668567479893E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2769()  throws Throwable  {
      double double0 = FastMath.max(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2770()  throws Throwable  {
      double double0 = FastMath.max(896.069285581481, 0.5990082025527954);
      assertEquals(896.069285581481, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2771()  throws Throwable  {
      double double0 = FastMath.max(0.0, 2511.23163058569);
      assertEquals(2511.23163058569, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2772()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2773()  throws Throwable  {
      float float0 = FastMath.max(0.5F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2774()  throws Throwable  {
      float float0 = FastMath.max((float) (-1023), 1682.8777F);
      assertEquals(1682.8777F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2775()  throws Throwable  {
      float float0 = FastMath.max(738.2F, -0.0F);
      assertEquals(738.2F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2776()  throws Throwable  {
      float float0 = FastMath.max((-1.0739315F), (-1.0739315F));
      assertEquals((-1.0739315F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2777()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_2778()  throws Throwable  {
      int int0 = FastMath.max(0, 944);
      assertEquals(944, int0);
  }

  @Test(timeout = 4000)
  public void test_2779()  throws Throwable  {
      int int0 = FastMath.max(1024, (-987));
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test_2780()  throws Throwable  {
      double double0 = FastMath.min((-4.9E-324), (-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2781()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2782()  throws Throwable  {
      double double0 = FastMath.min(0.5, 1417.48);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2783()  throws Throwable  {
      double double0 = FastMath.min(3.141592653589793, (-3450.41686));
      assertEquals((-3450.41686), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2784()  throws Throwable  {
      double double0 = FastMath.min((-134.54756059), (-134.54756059));
      assertEquals((-134.54756059), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2785()  throws Throwable  {
      float float0 = FastMath.min(1335.739F, 1335.739F);
      assertEquals(1335.739F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2786()  throws Throwable  {
      float float0 = FastMath.min(255.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2787()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2788()  throws Throwable  {
      float float0 = FastMath.min((-815.3452F), Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2789()  throws Throwable  {
      float float0 = FastMath.min((-672.4F), 135.2F);
      assertEquals((-672.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2790()  throws Throwable  {
      long long0 = FastMath.min(4799L, 4799L);
      assertEquals(4799L, long0);
  }

  @Test(timeout = 4000)
  public void test_2791()  throws Throwable  {
      long long0 = FastMath.min((-1885L), (-1966L));
      assertEquals((-1966L), long0);
  }

  @Test(timeout = 4000)
  public void test_2792()  throws Throwable  {
      int int0 = FastMath.min(587, (-364));
      assertEquals((-364), int0);
  }

  @Test(timeout = 4000)
  public void test_2793()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2794()  throws Throwable  {
      double double0 = FastMath.rint((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2795()  throws Throwable  {
      double double0 = FastMath.rint((-30.189457750302108));
      assertEquals((-30.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2796()  throws Throwable  {
      double double0 = FastMath.ceil((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2797()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2798()  throws Throwable  {
      double double0 = FastMath.ceil(0.22079706192);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2799()  throws Throwable  {
      double double0 = FastMath.rint(1.7976931348623157E308);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2800()  throws Throwable  {
      float float0 = FastMath.nextUp(2319.48F);
      assertEquals(2319.4802F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2801()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0L, (-872.15166612564));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2802()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.3241194486618042);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2803()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-1.7976931348623157E308));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2804()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1735.4F), (double) (-1735.4F));
      assertEquals((-1735.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2805()  throws Throwable  {
      float float0 = FastMath.nextAfter((-4231.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2806()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, -0.0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2807()  throws Throwable  {
      double double0 = FastMath.nextUp(5.254484300522433);
      assertEquals(5.254484300522434, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2808()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.633123935319537E16, 0.6409968137741089);
      assertEquals(1.6331239353195368E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2809()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-574.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2810()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 105.4826765672981);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2811()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2812()  throws Throwable  {
      double double0 = FastMath.nextAfter((-4519.38589928418), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2813()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-0.8364064038706399));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2814()  throws Throwable  {
      float float0 = FastMath.scalb(0.14062794F, 255);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2815()  throws Throwable  {
      float float0 = FastMath.scalb((-7.464389E-37F), 233);
      assertEquals((-1.0303464E34F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2816()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 255);
      assertEquals((-8.112964E31F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2817()  throws Throwable  {
      float float0 = FastMath.scalb(2717.4077F, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2818()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, (-277));
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2819()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2820()  throws Throwable  {
      float float0 = FastMath.scalb((-3818.61F), (-175));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2821()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, 709);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2822()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 128);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2823()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-2147160425));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2824()  throws Throwable  {
      float float0 = FastMath.scalb((float) 0L, (-2135525770));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2825()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 646);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2826()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 741);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2827()  throws Throwable  {
      float float0 = FastMath.scalb(121.4F, 13);
      assertEquals(994508.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2828()  throws Throwable  {
      float float0 = FastMath.scalb((-1730.32F), 369);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2829()  throws Throwable  {
      float float0 = FastMath.scalb((float) 145, (-2147482996));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2830()  throws Throwable  {
      double double0 = FastMath.scalb((-2881.011), 1287);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2831()  throws Throwable  {
      double double0 = FastMath.scalb(7.020668578160457E-251, 1774);
      assertEquals(7.474648592086214E283, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2832()  throws Throwable  {
      double double0 = FastMath.scalb((-4.9E-324), 2097);
      assertEquals((-8.98846567431158E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2833()  throws Throwable  {
      double double0 = FastMath.scalb((-1757.8595337), (-1304));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2834()  throws Throwable  {
      double double0 = FastMath.scalb((-0.817343452709565), (-1023));
      assertEquals((-9.09324775023035E-309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2835()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1.4E-45F), 1474217324);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2836()  throws Throwable  {
      double double0 = FastMath.scalb(462.5392382586612, 1474217324);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2837()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-3693), (-3693));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2838()  throws Throwable  {
      double double0 = FastMath.scalb(4.455505956692757, (-2147483647));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2839()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-2146210716));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2840()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NEGATIVE_INFINITY, 1474217324);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2841()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1738);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2842()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1025), (-1025));
      assertEquals((-2.850875881212352E-306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2843()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2844()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2845()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2846()  throws Throwable  {
      double double0 = FastMath.abs((-2.0937429891059164E185));
      assertEquals(2.0937429891059164E185, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2847()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2848()  throws Throwable  {
      long long0 = FastMath.abs((-2372L));
      assertEquals(2372L, long0);
  }

  @Test(timeout = 4000)
  public void test_2849()  throws Throwable  {
      long long0 = FastMath.abs(4275L);
      assertEquals(4275L, long0);
  }

  @Test(timeout = 4000)
  public void test_2850()  throws Throwable  {
      int int0 = FastMath.abs((-2591));
      assertEquals(2591, int0);
  }

  @Test(timeout = 4000)
  public void test_2851()  throws Throwable  {
      int int0 = FastMath.abs(124);
      assertEquals(124, int0);
  }

  @Test(timeout = 4000)
  public void test_2852()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2853()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2854()  throws Throwable  {
      double double0 = FastMath.toRadians(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2855()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2856()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2857()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2858()  throws Throwable  {
      double double0 = FastMath.cbrt(1.2E-322);
      assertEquals(4.912832599710365E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2859()  throws Throwable  {
      double double0 = FastMath.cbrt(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2860()  throws Throwable  {
      double double0 = FastMath.cbrt(369);
      assertEquals(7.172580900088796, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2861()  throws Throwable  {
      double double0 = FastMath.acos((-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2862()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2863()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2864()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2865()  throws Throwable  {
      double double0 = FastMath.acos((-505.7921395149184));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2866()  throws Throwable  {
      double double0 = FastMath.acos(2142);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2867()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2868()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2869()  throws Throwable  {
      double double0 = FastMath.asin((-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2870()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2871()  throws Throwable  {
      double double0 = FastMath.asin((-1086.001F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2872()  throws Throwable  {
      double double0 = FastMath.asin(1458);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2873()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2874()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2875()  throws Throwable  {
      double double0 = FastMath.atan2(2047.601113061, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2876()  throws Throwable  {
      double double0 = FastMath.atan2((-1717.7603406012888), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2877()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2878()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2879()  throws Throwable  {
      double double0 = FastMath.atan2((-3593.265624541534), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2880()  throws Throwable  {
      double double0 = FastMath.atan2((-277), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2881()  throws Throwable  {
      double double0 = FastMath.atan2(1874.69384, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2882()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2883()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-2881.011191883276));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2884()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2885()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 3522.363341560255);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2886()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2887()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2888()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-18.430862426757812));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2889()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2890()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2891()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-0.16886858633533056));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2892()  throws Throwable  {
      double double0 = FastMath.atan2(1517.04, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2893()  throws Throwable  {
      double double0 = FastMath.atan2((-1306.0989990234375), (-1306.0989990234375));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2894()  throws Throwable  {
      double double0 = FastMath.atan2((-4890.17), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2895()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), 1602.7932);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2896()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-1816371.2F));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2897()  throws Throwable  {
      double double0 = FastMath.tan(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2898()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2899()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2900()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2901()  throws Throwable  {
      double double0 = FastMath.cos(3294198.0);
      assertEquals(0.7910146852024715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2902()  throws Throwable  {
      double double0 = FastMath.cos(8.328731059820148);
      assertEquals((-0.457115599052063), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2903()  throws Throwable  {
      double double0 = FastMath.cos(1.34217729E8);
      assertEquals(0.9913749299353887, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2904()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2905()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2906()  throws Throwable  {
      double double0 = FastMath.sin(2.0088042407239129E-7);
      assertEquals(2.0088042407238994E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2907()  throws Throwable  {
      double double0 = FastMath.sin((-803.613320326041));
      assertEquals(0.5926935534857349, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2908()  throws Throwable  {
      double double0 = FastMath.sin(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2909()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2910()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2911()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2912()  throws Throwable  {
      double double0 = FastMath.tan(4.85165184E8);
      assertEquals(511.6355739405326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2913()  throws Throwable  {
      double double0 = FastMath.tan(3.529920406834134E113);
      assertEquals((-1.4401521786259859), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2914()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2915()  throws Throwable  {
      double double0 = FastMath.sin((-1.7976931348623157E308));
      assertEquals((-0.004961954789184062), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2916()  throws Throwable  {
      double double0 = FastMath.sin((-9.364590575255805E216));
      assertEquals(0.6755649381411237, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2917()  throws Throwable  {
      double double0 = FastMath.sin((-8.0E298));
      assertEquals((-0.042338395486962485), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2918()  throws Throwable  {
      double double0 = FastMath.tan(4.8516518342864007E8);
      assertEquals(1.5488155377343933, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2919()  throws Throwable  {
      double double0 = FastMath.tan((-1793.407367057904));
      assertEquals(0.47327278611873125, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2920()  throws Throwable  {
      double double0 = FastMath.tan(0.4555059566927566);
      assertEquals(0.489863972658548, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2921()  throws Throwable  {
      double double0 = FastMath.pow(9.863720960170636E228, (-1159));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2922()  throws Throwable  {
      double double0 = FastMath.pow(1.2791850600366742E-9, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2923()  throws Throwable  {
      double double0 = FastMath.pow((-8.0E298), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2924()  throws Throwable  {
      double double0 = FastMath.pow(2397.7459179408, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2925()  throws Throwable  {
      double double0 = FastMath.pow((-1654.5567638099), (double) (-1302));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2926()  throws Throwable  {
      double double0 = FastMath.pow((-3.5428767363273534E-19), (-3.5428767363273534E-19));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2927()  throws Throwable  {
      double double0 = FastMath.pow((-3.5997360512765566E-9), 2.934570385464815E247);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2928()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1820.008F), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2929()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2930()  throws Throwable  {
      double double0 = FastMath.pow(5.669184079525E-24, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2931()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 85);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2932()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1450);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2933()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2934()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2935()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 25.684557585821164);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2936()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2937()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-480.0F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2938()  throws Throwable  {
      double double0 = FastMath.pow(2425.214194312191, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2939()  throws Throwable  {
      double double0 = FastMath.pow(3.563520822714634E-18, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2940()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-1296.9));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2941()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2942()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2943()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1256));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2944()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (double) (-1733));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2945()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.2799608071421933E-11);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2946()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-2015.81059));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2947()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2948()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-2266.78689757));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2949()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2950()  throws Throwable  {
      double double0 = FastMath.log1p((-2485.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2951()  throws Throwable  {
      double double0 = FastMath.log1p(1874.69384);
      assertEquals(7.536733917953637, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2952()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2953()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2954()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2955()  throws Throwable  {
      double double0 = FastMath.log10(0.5191346387160468);
      assertEquals((-0.2847199923090712), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2956()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-1514.17493461));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2957()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2958()  throws Throwable  {
      double double0 = FastMath.atanh(1.0F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2959()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2960()  throws Throwable  {
      double double0 = FastMath.log(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2961()  throws Throwable  {
      double double0 = FastMath.expm1((-3.356118100840571E-7));
      assertEquals((-3.3561175376641985E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2962()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2963()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2964()  throws Throwable  {
      double double0 = FastMath.pow(1.012776136, 2658.255003002888);
      assertEquals(4.530867735029917E14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2965()  throws Throwable  {
      double double0 = FastMath.expm1(994.00223047726);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2966()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2967()  throws Throwable  {
      double double0 = FastMath.expm1((-724.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2968()  throws Throwable  {
      double double0 = FastMath.exp((-735.725617943066));
      assertEquals(3.009E-320, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2969()  throws Throwable  {
      double double0 = FastMath.pow((-633.0), (-633.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2970()  throws Throwable  {
      float float0 = FastMath.signum(281.93756F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2971()  throws Throwable  {
      float float0 = FastMath.signum((-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2972()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2973()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2974()  throws Throwable  {
      double double0 = FastMath.signum((-4.9E-324));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2975()  throws Throwable  {
      double double0 = FastMath.signum(2424.56522287146);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2976()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2977()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2978()  throws Throwable  {
      double double0 = FastMath.asinh(0.031);
      assertEquals(0.03099503697929222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2979()  throws Throwable  {
      double double0 = FastMath.asinh((-1267.1735716));
      assertEquals((-7.837691501350174), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2980()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2981()  throws Throwable  {
      double double0 = FastMath.tanh(0.1111111111111111);
      assertEquals(0.11065611052473799, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2982()  throws Throwable  {
      double double0 = FastMath.tanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2983()  throws Throwable  {
      double double0 = FastMath.tanh((-637.6670764658031));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2984()  throws Throwable  {
      double double0 = FastMath.tanh(1522.7);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2985()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2986()  throws Throwable  {
      double double0 = FastMath.tanh((-1.0F));
      assertEquals((-0.7615941559557649), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2987()  throws Throwable  {
      double double0 = FastMath.sinh(3.814697265625E-6);
      assertEquals(3.814697265634252E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2988()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2989()  throws Throwable  {
      double double0 = FastMath.sinh((-28.072));
      assertEquals((-7.771139415154375E11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2990()  throws Throwable  {
      double double0 = FastMath.sinh((-1633.438516));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2991()  throws Throwable  {
      double double0 = FastMath.sinh(457.830944947);
      assertEquals(3.4073993747070005E198, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2992()  throws Throwable  {
      double double0 = FastMath.sinh(1048.1);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2993()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2994()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2995()  throws Throwable  {
      double double0 = FastMath.cosh((-390.051694455));
      assertEquals(1.2481551216866175E169, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2996()  throws Throwable  {
      double double0 = FastMath.cosh(367.254166);
      assertEquals(1.5682949865113436E159, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2997()  throws Throwable  {
      double double0 = FastMath.cosh(3322.508);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2998()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2999()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3000()  throws Throwable  {
      int int0 = FastMath.getExponent((-1086.001F));
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_3001()  throws Throwable  {
      double double0 = FastMath.cosh((-1196.6485011866046));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3002()  throws Throwable  {
      double double0 = FastMath.nextUp((-1706.1577));
      assertEquals((-1706.1576999999997), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3003()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-250.0), (-250.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3004()  throws Throwable  {
      double double0 = FastMath.atan(0.031);
      assertEquals(0.03099007538856943, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3005()  throws Throwable  {
      float float0 = FastMath.nextUp((-390.71F));
      assertEquals((-390.70996F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_3006()  throws Throwable  {
      double double0 = FastMath.acosh(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3007()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3008()  throws Throwable  {
      double double0 = FastMath.expm1((-1438.8362986601));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_3009()  throws Throwable  {
      int int0 = FastMath.round((float) (-431L));
      assertEquals((-431), int0);
  }

  @Test(timeout = 4000)
  public void test_3010()  throws Throwable  {
      long long0 = FastMath.round((-2565.9854074379914));
      assertEquals((-2566L), long0);
  }

  @Test(timeout = 4000)
  public void test_3011()  throws Throwable  {
      double double0 = FastMath.cos((-1065.2187367564197));
      assertEquals((-0.9761527201038566), double0, 0.01);
  }
}
