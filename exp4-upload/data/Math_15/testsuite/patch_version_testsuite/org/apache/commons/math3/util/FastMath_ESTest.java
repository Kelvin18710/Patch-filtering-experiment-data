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
      float float0 = FastMath.copySign((-3592.8167F), 2384.0F);
      assertEquals(3592.8167F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      float float0 = FastMath.copySign((float) 0, (-2163.62F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      double double0 = FastMath.copySign((-3048.9151299054), (double) 0.0F);
      assertEquals(3048.9151299054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      double double0 = FastMath.hypot(9.37721319457112E-9, 1.01);
      assertEquals(1.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      double double0 = FastMath.hypot(3.0, 1.9868161777724352E-8);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      long long0 = FastMath.max((-2952L), (long) 128);
      assertEquals(128L, long0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      int int0 = FastMath.max(985, 1500);
      assertEquals(1500, int0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      double double0 = FastMath.rint(2.718281828459045);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      double double0 = FastMath.rint(348.5);
      assertEquals(348.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      double double0 = FastMath.ceil((-1425.6292038614208));
      assertEquals((-1425.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      double double0 = FastMath.ceil((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      double double0 = FastMath.ceil(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, 276);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      float float0 = FastMath.scalb((-214.04478F), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      double double0 = FastMath.scalb(1.8131446822877832, (-1023));
      assertEquals(2.017190417124946E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      double double0 = FastMath.scalb((double) Integer.MIN_VALUE, 2097);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-2098));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, 1024);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      float float0 = FastMath.ulp((-2638.28F));
      assertEquals(2.4414062E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      double double0 = FastMath.ulp(639.9);
      assertEquals(1.1368683772161603E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      double double0 = FastMath.toDegrees((-2196.354));
      assertEquals((-125841.8145166764), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      double double0 = FastMath.toRadians((-955.35908849604));
      assertEquals((-16.67416163310778), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      double double0 = FastMath.asin((-3.702271091849158E-8));
      assertEquals((-3.7022710918491585E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 1482.5742981735);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      double double0 = FastMath.acos(6.123233995736766E-17);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      double double0 = FastMath.tan(1.5707963267948966);
      assertEquals(1.633123935319537E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0);
      assertEquals((-0.7734333808731876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      double double0 = FastMath.cos(1.5707963267948966);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      double double0 = FastMath.cos(3294198.0);
      assertEquals(0.7910146852024715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      double double0 = FastMath.sin(1.5707963267948966);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      double double0 = FastMath.sin(3294198.0);
      assertEquals((-0.6117971622964877), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      double double0 = FastMath.log1p(1.0E-6);
      assertEquals(9.999995000003334E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      double double0 = FastMath.expm1(1.0);
      assertEquals(1.7182818284590453, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      double double0 = FastMath.expm1((-1.0F));
      assertEquals((-0.6321205588285577), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      float float0 = FastMath.signum(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      double double0 = FastMath.tanh(0.5);
      assertEquals(0.46211715726000974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      double double0 = FastMath.tanh((-20.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      double double0 = FastMath.tanh(20.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      double double0 = FastMath.sinh(0.25);
      assertEquals(0.2526123168081683, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      double double0 = FastMath.sinh((-709.782712893384));
      assertEquals((-8.988465674311366E307), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      double double0 = FastMath.sinh((-20.0));
      assertEquals((-2.4258259770489514E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      double double0 = FastMath.sinh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      double double0 = FastMath.sinh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      double double0 = FastMath.cosh((-20.0));
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      double double0 = FastMath.cosh(709.782712893384);
      assertEquals(8.988465674311366E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      double double0 = FastMath.cosh(20.0);
      assertEquals(2.4258259770489514E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      double double0 = FastMath.atan2(1.4E-45F, 2.2250738585072014E-308);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      double double0 = FastMath.tan(0.167);
      assertEquals(0.16857000433591113, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      double double0 = FastMath.sqrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      double double0 = FastMath.sqrt(2.2250738585072014E-308);
      assertEquals(1.4916681462400413E-154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      int int0 = FastMath.round(-0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = FastMath.round((float) 1856);
      assertEquals(1856, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      long long0 = FastMath.round(8.0);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      long long0 = FastMath.round((-4096.48));
      assertEquals((-4096L), long0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Random.setNextRandom(4);
      double double0 = FastMath.random();
      assertEquals(0.4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Random.setNextRandom(Integer.MIN_VALUE);
      double double0 = FastMath.random();
      assertEquals((-0.8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      double double0 = FastMath.pow((double) (-2078), (-2078));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      float float0 = FastMath.nextUp((-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      long long0 = FastMath.min(2771L, 4368491638549381120L);
      assertEquals(2771L, long0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      long long0 = FastMath.min((-3902L), (-1473L));
      assertEquals((-3902L), long0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      int int0 = FastMath.min(410, 2445);
      assertEquals(410, int0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      float float0 = FastMath.min(1148.92F, 1148.92F);
      assertEquals(1148.92F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      long long0 = FastMath.max((long) 801, (-1043L));
      assertEquals(801L, long0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      int int0 = FastMath.max(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      int int0 = FastMath.max((-31), (-31));
      assertEquals((-31), int0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      float float0 = FastMath.max((float) (-1010), (float) (-1010));
      assertEquals((-1010.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      double double0 = FastMath.max((-1262.0), (-708.841673663637));
      assertEquals((-708.841673663637), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      double double0 = FastMath.log1p(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      double double0 = FastMath.log((double) 0.0F, 1.188150495445695);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      double double0 = FastMath.log(2763.906841, 2763.906841);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      double double0 = FastMath.log(873.47749312);
      assertEquals(6.772482362922749, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      double double0 = FastMath.log(0.6598852872848511);
      assertEquals((-0.41568926621204294), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      int int0 = FastMath.getExponent((-1.0F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      int int0 = FastMath.getExponent((float) 0);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      int int0 = FastMath.getExponent((double) 1L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      double double0 = FastMath.exp((-2196.354));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      float float0 = FastMath.copySign(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      double double0 = FastMath.acosh(639.9);
      assertEquals(7.1544584841624586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      double double0 = FastMath.acosh((-4.503599627370496E15));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-1.0), (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(4.566672575206695E-8, 1.8131446822877832);
      assertEquals(4.566672575206695E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-346.7531), 4181.7196391);
      assertEquals((-346.7531), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      double double0 = FastMath.copySign(1.5E-323, 1.5E-323);
      assertEquals(1.5E-323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, (-2196.354));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      double double0 = FastMath.floor((-2078));
      assertEquals((-2078.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      double double0 = FastMath.floor((-1483.9860839843748));
      assertEquals((-1484.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      double double0 = FastMath.floor(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      double double0 = FastMath.floor(6.354457078421343E137);
      assertEquals(6.354457078421343E137, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      float float0 = FastMath.nextAfter(1200.03F, 1661.865244);
      assertEquals(1200.0302F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      float float0 = FastMath.nextAfter((-755.203F), 0.0);
      assertEquals((-755.20294F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 0.2);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2077.96842775888);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.6598852872848511, 2917.905376997386);
      assertEquals(0.6598852872848512, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      double double0 = FastMath.nextAfter((-9.42059255281795E-309), 1515.3420992866);
      assertEquals((-9.420592552817947E-309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, (double) Float.POSITIVE_INFINITY);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, (double) Float.POSITIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-510), (-510));
      assertEquals((-1.5215015091648422E-151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      float float0 = FastMath.abs((-1060.1576F));
      assertEquals(1060.1576F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      float float0 = FastMath.abs(2026.27F);
      assertEquals(2026.27F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      int int0 = FastMath.getExponent((double) 1365);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      double double0 = FastMath.log(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, 0.0F);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      float float0 = FastMath.copySign(Float.POSITIVE_INFINITY, (-3623.1F));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      float float0 = FastMath.copySign(1703.7F, 1703.7F);
      assertEquals(1703.7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      double double0 = FastMath.copySign((-459.5832410394), Double.POSITIVE_INFINITY);
      assertEquals(459.5832410394, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      double double0 = FastMath.copySign((-181.64034194439), (-181.64034194439));
      assertEquals((-181.64034194439), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, (-716.0));
      assertEquals(716.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      double double0 = FastMath.hypot(8.0E298, (-3705.75));
      assertEquals(8.0E298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      double double0 = FastMath.hypot(6.305116324200775E-16, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      double double0 = FastMath.hypot(0.7853981633974483, Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NEGATIVE_INFINITY, 3.141592653589793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      double double0 = FastMath.max(905.4018155, 905.4018155);
      assertEquals(905.4018155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      double double0 = FastMath.max(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      double double0 = FastMath.max((double) 3959, 2.718281828459045);
      assertEquals(3959.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      float float0 = FastMath.max(0.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      float float0 = FastMath.max(1.4E-45F, 1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      float float0 = FastMath.max(0.0F, (-1320.905F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      float float0 = FastMath.max((-2633.038F), 702.643F);
      assertEquals(702.643F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      long long0 = FastMath.max((long) (-1010), (long) (-1010));
      assertEquals((-1010L), long0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      long long0 = FastMath.max(0L, (-308L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      int int0 = FastMath.max(1189, 184);
      assertEquals(1189, int0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      double double0 = FastMath.min(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      double double0 = FastMath.min(2.718281828459045, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      double double0 = FastMath.min(3.141592653589793, 57.2957763671875);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      double double0 = FastMath.min(3251.626352, (-3711.1));
      assertEquals((-3711.1), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      double double0 = FastMath.min(2169.7698748297375, 2169.7698748297375);
      assertEquals(2169.7698748297375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      float float0 = FastMath.min((-840.24F), (-840.24F));
      assertEquals((-840.24F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), (-1729.4F));
      assertEquals((-1729.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), 583.9412F);
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      long long0 = FastMath.min(1030L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      int int0 = FastMath.min((-901), (-901));
      assertEquals((-901), int0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      int int0 = FastMath.min((-295), (-3506));
      assertEquals((-3506), int0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      double double0 = FastMath.rint((-1073.2285717076727));
      assertEquals((-1073.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      double double0 = FastMath.rint((-1.0E-6));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      double double0 = FastMath.ceil((-1.1368683772161603E-13));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      double double0 = FastMath.ceil(0.041666663879186654);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      double double0 = FastMath.rint((-1.0948854140579084E67));
      assertEquals((-1.0948854140579084E67), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      float float0 = FastMath.nextUp(1.0F);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 3941, 3.141592653589793);
      assertEquals(3940.9998F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (double) (-2146290000));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 1.2523630909973607E29);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1485.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-668.612));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      double double0 = FastMath.nextUp(1.9424264981694277E130);
      assertEquals(1.942426498169428E130, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      double double0 = FastMath.nextAfter(2513.006368, (-1.7990934773848504E-8));
      assertEquals(2513.0063679999994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) -0.0F, (double) (-784));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      double double0 = FastMath.nextAfter(344.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      float float0 = FastMath.scalb((-876.623F), 136);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      float float0 = FastMath.scalb((float) 698, (-238));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      float float0 = FastMath.scalb((-1597.0F), (-137));
      assertEquals((-9.16633E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      float float0 = FastMath.scalb(1024.9698F, (-137));
      assertEquals(5.883039E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      float float0 = FastMath.scalb(212.396F, (-127));
      assertEquals(1.2483515E-36F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      float float0 = FastMath.scalb((float) 128, 128);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      float float0 = FastMath.scalb((float) 698, 698);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      float float0 = FastMath.scalb(0.5F, (-1012));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2936), (-2936));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-2936));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 3941);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 755);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      float float0 = FastMath.scalb(2435.4438F, (-1));
      assertEquals(1217.7219F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      float float0 = FastMath.scalb((-2.4414062E-4F), 2124988665);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1429, 1429);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      double double0 = FastMath.scalb(2.8323395451363237E-248, 1077);
      assertEquals(4.586175248535961E76, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      double double0 = FastMath.scalb(0.15, (-1023));
      assertEquals(1.6688053938804E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      double double0 = FastMath.scalb(1983.270605153, (-1023));
      assertEquals(2.206461788935849E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      double double0 = FastMath.scalb((double) 3941, 3941);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1.4E-45F), 3941);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      double double0 = FastMath.scalb(1.9868161777724352E-8, (-2496));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2146290000), (-2146290000));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 3941);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-2147483647));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2078), (-2078));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      double double0 = FastMath.abs(-0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      double double0 = FastMath.abs((-28.83085576389784));
      assertEquals(28.83085576389784, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      double double0 = FastMath.abs(182.5031616627);
      assertEquals(182.5031616627, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      long long0 = FastMath.abs((-1043L));
      assertEquals(1043L, long0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      long long0 = FastMath.abs(341L);
      assertEquals(341L, long0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      int int0 = FastMath.abs((-1778));
      assertEquals(1778, int0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      int int0 = FastMath.abs(715827883);
      assertEquals(715827883, int0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      double double0 = FastMath.toDegrees(2219.727);
      assertEquals(127180.98877123567, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      double double0 = FastMath.toRadians((-4.9E-324));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      double double0 = FastMath.toRadians(1.5007857288519654E-41);
      assertEquals(2.6193652335409654E-43, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      double double0 = FastMath.cbrt(361.0F);
      assertEquals(7.120367358901993, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      double double0 = FastMath.acos(1.6688053938804E-309);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      double double0 = FastMath.acos((-1078.6218827082516));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      double double0 = FastMath.acos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double double0 = FastMath.asin(0.041666666666621166);
      assertEquals(0.041678732422532325, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      double double0 = FastMath.asin(7.299929931893312);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      double double0 = FastMath.asin((-1394.7));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      double double0 = FastMath.atan2(1065.70327149, 1065.70327149);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      double double0 = FastMath.atan2(355.27883836703, 4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      double double0 = FastMath.atan2(8.0E298, (-3.940510424527919E-20));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double double0 = FastMath.atan2(1640.9, -0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      double double0 = FastMath.atan2((-2.220446049250313E-16), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      double double0 = FastMath.atan2(835.664154070086, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      double double0 = FastMath.atan2((-1.315295870404327E-8), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      double double0 = FastMath.atan2(1.0047320986688445E-151, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      double double0 = FastMath.atan2((-66.036308273), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-2.220446049250313E-16));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-1.0009971333317513));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-2.220446049250313E-16));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2404.4357174202));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      double double0 = FastMath.atan(Double.POSITIVE_INFINITY);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      double double0 = FastMath.atan(Double.NEGATIVE_INFINITY);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-2252.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      double double0 = FastMath.tan(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      double double0 = FastMath.sin((-1312.0));
      assertEquals(0.9267732207044014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      double double0 = FastMath.sin(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028233E38F));
      assertEquals((-0.7665377443470253), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      double double0 = FastMath.sin(4.137618951061827E263);
      assertEquals((-0.3966251043830362), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double double0 = FastMath.sin(1.34217729E8);
      assertEquals(0.1310562791155129, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      double double0 = FastMath.tan((-1.436111169285268E169));
      assertEquals((-0.13057748867620933), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      double double0 = FastMath.sin(1.9424264981694277E130);
      assertEquals(0.1470115189158655, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      double double0 = FastMath.sin(6.3984347447610573E17);
      assertEquals((-0.43528136189777855), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      double double0 = FastMath.cos(8.131762373533769E79);
      assertEquals(0.9922187983490318, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      double double0 = FastMath.cos(1.633123935319537E16);
      assertEquals((-0.28443016146380146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      double double0 = FastMath.cos((-1.7976931348623157E308));
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      double double0 = FastMath.sin((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      double double0 = FastMath.pow((double) 1148, 1148);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      double double0 = FastMath.pow((-1492.0444), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double double0 = FastMath.pow(1.5352771282196045, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      double double0 = FastMath.pow(1763.549606549394, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      double double0 = FastMath.pow((-1086.0), 2.0);
      assertEquals(1179396.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      double double0 = FastMath.pow((-914.28945), (double) (-1));
      assertEquals((-0.0010937455310241193), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      double double0 = FastMath.pow((-8.037983950983888E-17), (-3.4028232635611926E38));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double double0 = FastMath.pow((-1443.9), (-1443.9));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      double double0 = FastMath.pow((-1.578495717307427), 6.380177790989479E207);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      double double0 = FastMath.pow(3.633404807819848E-9, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      double double0 = FastMath.pow(461.09118530318, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 750);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 3113.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-2.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-513));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.746408207555959E-177);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      double double0 = FastMath.pow((-1.0018949540371866), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      double double0 = FastMath.pow((-2.957007209750105E-8), (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-2685.48545872054));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.633123935319537E16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-513));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-888));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 2600.56567680965);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.9256682968755803E-7));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-1775.06226));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      double double0 = FastMath.log1p(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      double double0 = FastMath.log1p((-2.9646587857612632E-8));
      assertEquals((-2.9646588297072724E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      double double0 = FastMath.log(0.9999997749296758, (double) 8);
      assertEquals((-9239073.678280815), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      double double0 = FastMath.log1p(0.6613985300064087);
      assertEquals(0.5076597356303448, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      double double0 = FastMath.log10(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      double double0 = FastMath.log10(0.5000753608834101);
      assertEquals((-0.3009645429647978), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      double double0 = FastMath.expm1((-1.5528308247580353E-8));
      assertEquals((-1.5528308127016175E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      double double0 = FastMath.expm1(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      double double0 = FastMath.pow(1.6688053938804E-309, 1.0);
      assertEquals(1.6688053938804E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      double double0 = FastMath.exp((-362.3071411471142));
      assertEquals(4.487534967322485E-158, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      float float0 = FastMath.signum((float) (-510));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      float float0 = FastMath.signum(2557.267F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      double double0 = FastMath.signum((double) 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      double double0 = FastMath.signum((-1.178234251477505E-7));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      double double0 = FastMath.signum(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      double double0 = FastMath.atanh((-0.05417713522911072));
      assertEquals((-0.05423023499691139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      double double0 = FastMath.atanh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      double double0 = FastMath.asinh((-0.010714690733195933));
      assertEquals((-0.01071448572782725), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      double double0 = FastMath.asinh((-1926.5283213229));
      assertEquals((-8.256622112796368), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      double double0 = FastMath.tanh(2.2250738585072014E-308);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      double double0 = FastMath.tanh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      double double0 = FastMath.tanh((-478.5333F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      double double0 = FastMath.tanh(Double.POSITIVE_INFINITY);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      double double0 = FastMath.sinh(6.123233995736766E-17);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      double double0 = FastMath.sinh((-99));
      assertEquals((-4.944515159673473E42), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      double double0 = FastMath.sinh(147.4);
      assertEquals(5.1757898773845706E63, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      double double0 = FastMath.sinh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      double double0 = FastMath.sinh((-3913.434656));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      double double0 = FastMath.cosh((-233.05649907581423));
      assertEquals(8.205811279184823E100, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      double double0 = FastMath.cosh(625.316532623531);
      assertEquals(1.864187388617302E271, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      double double0 = FastMath.cosh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, (-1.7976931348623157E308));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      double double0 = FastMath.cos((-4.011320021817099E249));
      assertEquals((-0.7569865846842974), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      int int0 = FastMath.getExponent(268.327F);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      double double0 = FastMath.acosh((-1.4E-45F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      double double0 = FastMath.acos((-2.2737367544323206E-13));
      assertEquals(1.570796326795124, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      double double0 = FastMath.expm1((-1112.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      int int0 = FastMath.round((-3410.2212F));
      assertEquals((-3410), int0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      long long0 = FastMath.round(0.0);
      assertEquals(0L, long0);
  }
@Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      FastMath.copySign((-2381.3423F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      FastMath.copySign((float) 0, (float) 0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      FastMath.copySign((double) (-1.0F), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      FastMath.copySign(0.0, (-1165.244577368682));
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      FastMath.hypot(1.0, 1.34217729E8);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      FastMath.hypot(1.0328685338718233, (-7.877917738262007E-9));
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      FastMath.min((-3512299194304650054L), 0L);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      FastMath.rint((-18.430862426757812));
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      FastMath.rint((-943.5));
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      FastMath.ceil((-603.504082705776));
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      FastMath.scalb((-3260.006F), 276);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      FastMath.scalb((-1249.88F), (-277));
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      FastMath.scalb((float) 1312145731, (-127));
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      FastMath.scalb((-5.056512677995137E101), 2097);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      FastMath.scalb(5.89953246760617E-101, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      FastMath.scalb(7.624618747740734, 1024);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      FastMath.ulp(1613.378F);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      FastMath.ulp(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      FastMath.toDegrees(0.7853981633974483);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      FastMath.asin(9.516285362051742E-8);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      FastMath.atan2(-0.0, 6.103515625E-5);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      FastMath.atan2(5.05239404378821E31, (-622.0));
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
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
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      FastMath.toRadians(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      FastMath.sqrt(6.372298757235201E212);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      FastMath.round(1559.0F);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      FastMath.round((float) (-5034868814120038111L));
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      FastMath.round(197.0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      FastMath.round((-18.430862426757812));
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      FastMath.nextAfter(-0.0F, (double) -0.0F);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      FastMath.nextAfter((double) -0.0F, (double) -0.0F);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      FastMath.min((long) 150, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      FastMath.min(1826L, 1826L);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      FastMath.min(1826, 2045222521);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      FastMath.max((-1356L), (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      FastMath.max((-3323), (-1));
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      FastMath.max(2307.3494F, (-2436.6565F));
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      FastMath.log10(0.0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      FastMath.log(0.0, 554.092064264);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      FastMath.log((double) 428.188F, (double) 1810.0355F);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      FastMath.log(341.77170008334, 0.041666666666621166);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      FastMath.log(2631.99995);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      FastMath.log(0.04168701738764507);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      FastMath.hypot(0.0, 0L);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      FastMath.getExponent((float) (-1023));
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      FastMath.getExponent(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      FastMath.getExponent(0.0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      FastMath.copySign(0.0F, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      FastMath.copySign((double) 0L, 1.285159987981792E19);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      FastMath.atan((-2310));
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      FastMath.acosh(1610.88879499);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      FastMath.IEEEremainder(0L, 0.031009936063096846);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      FastMath.IEEEremainder(0.1111111111111111, Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      FastMath.IEEEremainder((-603.504082705776), (-0.08000800726172164));
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-2034.6339123), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      double double0 = FastMath.copySign(5.6843418860808015E-14, 2.145524681E9);
      assertEquals(5.6843418860808015E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      double double0 = FastMath.floor(40.680352591199);
      assertEquals(40.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      double double0 = FastMath.floor((-622.0));
      assertEquals((-622.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      double double0 = FastMath.floor((-7.369842361872221E127));
      assertEquals((-7.369842361872221E127), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      float float0 = FastMath.nextAfter((-318.65F), (-5.905511605694905E-113));
      assertEquals((-318.64996F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.5F, (-1893.3));
      assertEquals(0.49999997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 1465.7259);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.401298464324817E-45, 770.0);
      assertEquals(1.4012984643248174E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1479.7), (double) (-1269.4F));
      assertEquals((-1479.6999999999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 5624.6);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 4.503599627370496E15);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 5.3393125705958075E87);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, 3);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      double double0 = FastMath.abs(5.601105668518E-8);
      assertEquals(5.601105668518E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      float float0 = FastMath.abs((-1854.5F));
      assertEquals(1854.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      float float0 = FastMath.abs((float) 1153);
      assertEquals(1153.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      double double0 = FastMath.pow(5189.3, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      double double0 = FastMath.pow(12.443552471811103, (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      int int0 = FastMath.getExponent(3117.337822255251);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      float float0 = FastMath.copySign((-777.3505F), (-777.3505F));
      assertEquals((-777.3505F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      float float0 = FastMath.copySign(2.4414062E-4F, (-3734.3062F));
      assertEquals((-2.4414062E-4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      float float0 = FastMath.copySign(1.4E-45F, (float) 60);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-1142), 1337.139F);
      assertEquals(1142.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      double double0 = FastMath.copySign((double) Integer.MIN_VALUE, 1.3401332048151893E-262);
      assertEquals(2.147483648E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      double double0 = FastMath.copySign(2.718281828459045, (double) (-1));
      assertEquals((-2.718281828459045), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      double double0 = FastMath.copySign((-2.417679757E-4), (-2.417679757E-4));
      assertEquals((-2.417679757E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      double double0 = FastMath.hypot(3.911086668967361E112, (-302.91));
      assertEquals(3.911086668967361E112, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      double double0 = FastMath.hypot((-512.0965874011), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 3294198.0389523);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      double double0 = FastMath.hypot(3132.515590131, Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 2869.390981117187);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      double double0 = FastMath.max(1.34217729E8, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      double double0 = FastMath.max((-1639.47384), 877.5825806385551);
      assertEquals(877.5825806385551, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      double double0 = FastMath.max((-20.0), (-1281.0));
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      double double0 = FastMath.max(0.8387747664949146, 0.8387747664949146);
      assertEquals(0.8387747664949146, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      float float0 = FastMath.max(0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      float float0 = FastMath.max((-1553.9537F), (-474.10733F));
      assertEquals((-474.10733F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      long long0 = FastMath.max((-3157L), (-3157L));
      assertEquals((-3157L), long0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      long long0 = FastMath.max((long) 958, 0L);
      assertEquals(958L, long0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      int int0 = FastMath.max((-951), 2079);
      assertEquals(2079, int0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      int int0 = FastMath.max(1781, 40);
      assertEquals(1781, int0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      double double0 = FastMath.min(40.0, 40.680352591199);
      assertEquals(40.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      double double0 = FastMath.min(0.0, (-1.1681436418514489E-7));
      assertEquals((-1.1681436418514489E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      double double0 = FastMath.min((-0.006898307579668871), (-0.006898307579668871));
      assertEquals((-0.006898307579668871), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 1.0F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      float float0 = FastMath.min(Float.NEGATIVE_INFINITY, (-1.0F));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      float float0 = FastMath.min(1.4E-45F, (float) (-1428));
      assertEquals((-1428.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      float float0 = FastMath.min(1129.0621F, 1129.0621F);
      assertEquals(1129.0621F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      int int0 = FastMath.min((-3058), 0);
      assertEquals((-3058), int0);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      int int0 = FastMath.min(0, (-1805));
      assertEquals((-1805), int0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      double double0 = FastMath.rint(1.154369831085205);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      double double0 = FastMath.rint((-0.16666666666666666));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      double double0 = FastMath.rint(1497.696243779669);
      assertEquals(1498.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      double double0 = FastMath.ceil(3.141592653589793);
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      double double0 = FastMath.ceil((-6.032174644509064E-23));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      double double0 = FastMath.floor((-1852.6621774569599));
      assertEquals((-1853.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      double double0 = FastMath.floor(4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      float float0 = FastMath.nextUp(576.0F);
      assertEquals(576.00006F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (double) (-778.863F));
      assertEquals((-1.0000001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-20.0));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (double) 1115);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 2310.0);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      float float0 = FastMath.nextAfter(426.0829F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 2280.0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      double double0 = FastMath.nextUp(5.359568079675375E-212);
      assertEquals(5.359568079675376E-212, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.2207032705191523E-4, (-2099.566604458));
      assertEquals(1.220703270519152E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) (-1346.4756F));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-1122.92374631559));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      float float0 = FastMath.scalb((float) 166, 166);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      float float0 = FastMath.scalb(0.5F, 128);
      assertEquals(1.7014118E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 166);
      assertEquals(131072.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      float float0 = FastMath.scalb(2246.7256F, (-252));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      float float0 = FastMath.scalb((-4180.71F), (-148));
      assertEquals((-1.1716E-41F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, (-271));
      assertEquals(9.0E-44F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2145703410, 2145703410);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      float float0 = FastMath.scalb((-3557.89F), 1608);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-427004249));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 2265);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-588));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 177);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      float float0 = FastMath.scalb(16.93773F, 94);
      assertEquals(3.3548632E29F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      float float0 = FastMath.scalb((-1549.0F), (-378));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      double double0 = FastMath.scalb(5.359568079675375E-212, 1300);
      assertEquals(1.1698337725221223E180, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      double double0 = FastMath.scalb(1.01, (-1023));
      assertEquals(1.123662298546137E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1070), (-1071));
      assertEquals((-4.229E-320), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2145524681, 2145524681);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1.4E-45F, (-427004249));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      double double0 = FastMath.scalb((-2.047124671392676E-8), (-2045222521));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      double double0 = FastMath.scalb((double) -0.0F, 2095);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 1300);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1500);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      double double0 = FastMath.scalb((-1166.5200661), 5026);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      double double0 = FastMath.scalb((-0.143144172857457), (-1260));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      double double0 = FastMath.abs(-0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      double double0 = FastMath.abs((-20.0));
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      long long0 = FastMath.abs((-1803L));
      assertEquals(1803L, long0);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      long long0 = FastMath.abs(1184L);
      assertEquals(1184L, long0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      int int0 = FastMath.abs((-2142946384));
      assertEquals(2142946384, int0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      int int0 = FastMath.abs(2095);
      assertEquals(2095, int0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1557.9496956020203));
      assertEquals((-89263.94225168707), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      double double0 = FastMath.toDegrees(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      double double0 = FastMath.cbrt((-389.415168056882));
      assertEquals((-7.302489724709332), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      double double0 = FastMath.acos((-0.49470997F));
      assertEquals(2.088297395954376, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      double double0 = FastMath.acos(0L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      double double0 = FastMath.acos(1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      double double0 = FastMath.acos((-1));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      double double0 = FastMath.acos((-512.5069));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      double double0 = FastMath.acos(2783.81087);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      double double0 = FastMath.asin((-1941.2409615786055));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      double double0 = FastMath.asin(624.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      double double0 = FastMath.atan2(1.7976931348623157E308, 2.242630017261011E-174);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      double double0 = FastMath.atan2((-1.1357810855950775E-7), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      double double0 = FastMath.atan2(1750.7025, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      double double0 = FastMath.atan2(1.61949812578045E-182, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      double double0 = FastMath.atan2((-2951.3416F), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double double0 = FastMath.atan2(1.5707963267948966, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      double double0 = FastMath.atan2((-4136.1971), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 4.87082071118958E-18);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 2.4240442814945802E83);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-5.7618793749770706E-8));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2310.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      double double0 = FastMath.atan2((-2040.496157972212), 4.87082071118958E-18);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      double double0 = FastMath.asin((-0.010714690733195933));
      assertEquals((-0.010714895759747715), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-50.70241747));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      double double0 = FastMath.cos((-1287.6758F));
      assertEquals(0.9296970953791615, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      double double0 = FastMath.cos(1600.03);
      assertEquals((-0.5740610820594948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      double double0 = FastMath.cos(9.223372036854776E18);
      assertEquals(0.011800076512800236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      double double0 = FastMath.sin(578.868);
      assertEquals(0.7276924973854728, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double double0 = FastMath.sin(6.589235682116406E83);
      assertEquals((-0.4348137617151847), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      double double0 = FastMath.sin(9.959152908532152E194);
      assertEquals((-0.9041667592307756), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      double double0 = FastMath.tan((-6.336314643222911E118));
      assertEquals(1.7343835614830827, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      double double0 = FastMath.tan(4.6200790930711506E67);
      assertEquals((-0.12382803829248165), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      double double0 = FastMath.tan((-1.5038413653121357E55));
      assertEquals((-6.019152523346417), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      double double0 = FastMath.tan(2.3789334438756013E245);
      assertEquals((-0.03655601351378309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      double double0 = FastMath.tan(0.9985313415527344);
      assertEquals(1.5523882848582389, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      double double0 = FastMath.tan(3294198.0389523);
      assertEquals((-0.7129708200487589), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      double double0 = FastMath.sin((-1.9841269659586505E-4));
      assertEquals((-1.984126952940265E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 2379);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      double double0 = FastMath.pow((-2832.5804578), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      double double0 = FastMath.pow((-602.98452534884), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      double double0 = FastMath.pow((-1975.0), (-4.503599627370496E15));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      double double0 = FastMath.pow((-3110.6680099999994), 8.0E298);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      double double0 = FastMath.pow(5.759440286608551E-191, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double double0 = FastMath.pow((-1773.5), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 3535);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 4.503599627370496E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-2286.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 4.5035996273704955E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-2375.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      double double0 = FastMath.pow(4.983191803254889E-7, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      double double0 = FastMath.pow(3.141592653589793, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 3.141592653589793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-3049.3012642751));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 0.5662899017333984);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-1975.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      double double0 = FastMath.log10(2.718281828459045);
      assertEquals(0.4342944819032518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      double double0 = FastMath.log1p(0.9980957488718369);
      assertEquals(0.692194601436399, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (double) (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      double double0 = FastMath.asinh(0.52197265625);
      assertEquals(0.5007779113158667, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      double double0 = FastMath.pow((-0.8114139958613131), (double) 907);
      assertEquals((-4.818839665040407E-83), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 1.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      double double0 = FastMath.log1p((-677.5054));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      double double0 = FastMath.atanh(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      double double0 = FastMath.expm1((-0.17326355828128545));
      assertEquals((-0.1590840447280787), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      double double0 = FastMath.expm1(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      double double0 = FastMath.expm1((-740L));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      double double0 = FastMath.exp((-2599.8703));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      double double0 = FastMath.pow((-20.0), (-20.0));
      assertEquals(9.5367431640625E-27, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      float float0 = FastMath.signum(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      float float0 = FastMath.signum(1.4E-45F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      double double0 = FastMath.signum((double) (-593));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      double double0 = FastMath.signum(1940.839503760817);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      double double0 = FastMath.atanh(0.1256551444530487);
      assertEquals(0.1263228131832331, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      double double0 = FastMath.atanh((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      double double0 = FastMath.asinh(0.008333333333333333);
      assertEquals(0.008333236885730006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      double double0 = FastMath.asinh(0.087);
      assertEquals(0.08689062164014465, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      double double0 = FastMath.asinh((-0.12502530217170715));
      assertEquals((-0.12470185366756537), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      double double0 = FastMath.asinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      double double0 = FastMath.tanh(5.359568079675376E-212);
      assertEquals(5.359568079675376E-212, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      double double0 = FastMath.tanh((-1517.0117F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      double double0 = FastMath.tanh(2095);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      double double0 = FastMath.sinh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      double double0 = FastMath.sinh((-359.9886711289));
      assertEquals((-1.096638334824535E156), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      double double0 = FastMath.sinh(1.3234499856771504E-16);
      assertEquals(1.3234499856771504E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      double double0 = FastMath.sinh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      double double0 = FastMath.sinh(532.45225);
      assertEquals(8.710519479413269E230, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      double double0 = FastMath.sinh((-3029.639489199185));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      double double0 = FastMath.cosh((-474.10733F));
      assertEquals(3.9917873098187433E205, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      double double0 = FastMath.cosh(693.1315);
      assertEquals(5.274188988184976E300, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      double double0 = FastMath.cosh(1006.354);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      double double0 = FastMath.atan2((-1), (-1));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      double double0 = FastMath.hypot((-4.012947040998503E-8), 1010.8502494307);
      assertEquals(1010.8502494307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      int int0 = FastMath.getExponent(1.4E-45F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      double double0 = FastMath.cosh((-1480.36871));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      double double0 = FastMath.atan(2.718281828459045);
      assertEquals(1.2182829050172777, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      float float0 = FastMath.nextUp((-1181.0F));
      assertEquals((-1180.9999F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      double double0 = FastMath.acosh((-2136349312));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      double double0 = FastMath.expm1((-4.503599627370496E15));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      long long0 = FastMath.round(1.9987994582857286E-8);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      double double0 = FastMath.cos((-3.037257948202342));
      assertEquals((-0.9945620702985218), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      FastMath.copySign((-91.106F), 1285.887F);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      FastMath.copySign((float) 0L, (-2826.68F));
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      FastMath.copySign((double) (-459.14307F), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      FastMath.copySign(2.7106814809424793E-8, (double) (-424.0F));
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      FastMath.hypot(8.69851089918337E-9, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      FastMath.max((-1191L), 4625196817309499392L);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      FastMath.min((long) (-127), 0L);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      FastMath.rint((-3.141592653589793));
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      FastMath.ceil((-1064.99434));
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      FastMath.scalb(3.4028235E38F, 276);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      FastMath.scalb((float) 3286, (-277));
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      FastMath.scalb((float) 2070, 128);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      FastMath.scalb((-3501.424831101), 2097);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      FastMath.scalb(8.0E298, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      FastMath.scalb((double) 1024, 1024);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      FastMath.ulp((-102.57F));
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      FastMath.toRadians(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      FastMath.asin((-5.7618793749770706E-8));
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      FastMath.atan2(0.0, 2622L);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      FastMath.atan2(3.518198614137319E171, (-6.816484796854261));
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      FastMath.atan(1.633123935319537E16);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      FastMath.sin((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      FastMath.expm1(1L);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      FastMath.atan2(0.036, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      FastMath.toDegrees((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      FastMath.toDegrees(1238.0);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      FastMath.signum(0.0);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      FastMath.round(1828.0F);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      FastMath.round((-8011.376F));
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      FastMath.round(452.969);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      FastMath.pow((-1841.6570710588242), (-5));
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      FastMath.min(1L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      FastMath.max((-1307L), (-1307L));
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      FastMath.max((-277), (-1990));
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      FastMath.max(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      FastMath.log1p(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      FastMath.log10(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      FastMath.log(0.0, 1094.63);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      FastMath.log(1.5215325E7, 1.5215325E7);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      FastMath.log((double) 1.4E-45F, 2445.44218);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      FastMath.getExponent((float) 0L);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      FastMath.getExponent((-1.5702573330575216));
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      FastMath.getExponent(0.5403022766113281);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      FastMath.copySign((float) 0L, (float) 0L);
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      double double0 = FastMath.acosh(2.718281828459045);
      assertEquals(1.6574544541530771, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      double double0 = FastMath.acosh((-1.5453111533064765E19));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      int int0 = FastMath.abs(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      int int0 = FastMath.abs(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(1.0, 4607182418800017408L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(3.518198614137319E171, 19.388465282223862);
      assertEquals((-2.617828637677306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(1555.6009116, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      double double0 = FastMath.copySign(3806.3, 1374.06);
      assertEquals(3806.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, (-1064.99434));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      double double0 = FastMath.floor((-3.4194410638967946E-8));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      double double0 = FastMath.floor(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      double double0 = FastMath.floor(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-260), (-8.0E298));
      assertEquals((-260.00003F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.0F), (double) 1L);
      assertEquals((-0.99999994F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 0.167);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 440.4);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1741.424255), 2.3318915367126465);
      assertEquals((-1741.4242549999997), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.087, Double.NEGATIVE_INFINITY);
      assertEquals(0.08699999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) 672L);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 569.0);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (double) (-351L));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      double double0 = FastMath.abs((double) (-1062));
      assertEquals(1062.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      float float0 = FastMath.abs(1479.1965F);
      assertEquals(1479.1965F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      double double0 = FastMath.pow(2.185301053838889E-9, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      double double0 = FastMath.pow((double) 1.4E-45F, (-1.7976931348623157E308));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      double double0 = FastMath.sqrt(2662.150822763);
      assertEquals(51.596034951951495, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      float float0 = FastMath.copySign((-3.4028235E38F), 0.0F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      float float0 = FastMath.copySign(1497.4681F, (-901.2831F));
      assertEquals((-1497.4681F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      float float0 = FastMath.copySign(3592.0F, 3592.0F);
      assertEquals(3592.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      float float0 = FastMath.copySign((-3010.0F), (-3010.0F));
      assertEquals((-3010.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      double double0 = FastMath.copySign((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      double double0 = FastMath.copySign((-5.0), 4.503599627370496E15);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      double double0 = FastMath.hypot(134217727, 0.7214212713763215);
      assertEquals(1.34217727E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      double double0 = FastMath.hypot(0.06612417101860046, (-1.2246467991473532E-16));
      assertEquals(0.06612417101860046, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      double double0 = FastMath.hypot((-3.356118100840571E-7), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      double double0 = FastMath.hypot((-3.718924074653624E-8), Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-0.3123698364537455));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      double double0 = FastMath.max(3.141592653589793, 480155.8524161131);
      assertEquals(480155.8524161131, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      double double0 = FastMath.max((-131.502994241191), (-2.9275804461593914E217));
      assertEquals((-131.502994241191), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      double double0 = FastMath.max(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      float float0 = FastMath.max(948.2F, 2063.77F);
      assertEquals(2063.77F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      float float0 = FastMath.max(0.8520254F, (-1.2207031E-4F));
      assertEquals(0.8520254F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      long long0 = FastMath.max((long) 0, (-1396L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      int int0 = FastMath.max((-3538), 964);
      assertEquals(964, int0);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      double double0 = FastMath.min(4428.1917, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      double double0 = FastMath.min(2.71853394036182E-51, 2.71853394036182E-51);
      assertEquals(2.71853394036182E-51, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      double double0 = FastMath.min((-7.1220651311999115), (-408.06427343504186));
      assertEquals((-408.06427343504186), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      double double0 = FastMath.min(0.0, 1.5707990608257887);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      float float0 = FastMath.min(1.4E-45F, 3.4028235E38F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      float float0 = FastMath.min((float) 15215325, (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      long long0 = FastMath.min(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      int int0 = FastMath.min(1245, 2617);
      assertEquals(1245, int0);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      int int0 = FastMath.min(881, (-1620));
      assertEquals((-1620), int0);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      double double0 = FastMath.rint((-1.2246467991473532E-16));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      double double0 = FastMath.rint(2972.665);
      assertEquals(2973.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      double double0 = FastMath.rint(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      double double0 = FastMath.ceil(1.0045010733191337);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      double double0 = FastMath.ceil((-5.2070003233802944E-8));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      double double0 = FastMath.ceil(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      float float0 = FastMath.nextUp(1.4E-45F);
      assertEquals(2.8E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.4E-45F, (-1.7976931348623157E308));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-3.476352191116455E277));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-1719.980294066593));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (double) -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 1.7127254009246826);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      double double0 = FastMath.nextUp(1673.96102);
      assertEquals(1673.9610200000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-1105.8031F), (double) (-1105.8032F));
      assertEquals((-1105.8031005859377), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) -0.0F, (-1266.67774));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 4428.1917);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      double double0 = FastMath.nextAfter((-20.0), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      float float0 = FastMath.scalb(8.34601E-37F, 142);
      assertEquals(4653056.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 142);
      assertEquals(0.0078125F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      float float0 = FastMath.scalb((float) 4, (-129));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      float float0 = FastMath.scalb(3.4028235E38F, (-260));
      assertEquals(1.83671E-40F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      float float0 = FastMath.scalb((-1664.3427F), 156);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1357, 1357);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-855), (-855));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, (-855));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 336);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 652);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-3759));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      float float0 = FastMath.scalb(1380.0F, 11);
      assertEquals(2826240.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      float float0 = FastMath.scalb((-5.791707F), 336);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-260), (-260));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      double double0 = FastMath.scalb(4.999126524757713E-197, 1478);
      assertEquals(4.180495112018231E248, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      double double0 = FastMath.scalb((-4.9E-324), 1281);
      assertEquals((-2.0568806966515076E62), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      double double0 = FastMath.scalb(2.718281828459045, (-1048));
      assertEquals(9.01278533E-316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1062), (-1062));
      assertEquals((-2.149162E-317), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-1023));
      assertEquals(3.4951378437904593E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2358, 2358);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2045222524), (-2045222524));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      double double0 = FastMath.scalb(698.775714944765, (-2976));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, (-4274));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, 1626);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-2250));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      double double0 = FastMath.scalb(1.0, 128);
      assertEquals(3.4028236692093846E38, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      double double0 = FastMath.scalb((-1.7976931348623157E308), 3019);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      double double0 = FastMath.scalb((-3389.3990735143), (-2067));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      double double0 = FastMath.ulp(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      double double0 = FastMath.ulp((-953.68639034572));
      assertEquals(1.1368683772161603E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      double double0 = FastMath.abs(-0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, (-5.381287389094251E-8));
      assertEquals(5.381287389094251E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      float float0 = FastMath.abs((-2294.0F));
      assertEquals(2294.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      long long0 = FastMath.abs((-7278142539171889152L));
      assertEquals(7278142539171889152L, long0);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      long long0 = FastMath.abs((long) 2047);
      assertEquals(2047L, long0);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      int int0 = FastMath.abs((-278));
      assertEquals(278, int0);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      int int0 = FastMath.abs(1238);
      assertEquals(1238, int0);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      double double0 = FastMath.toDegrees(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      double double0 = FastMath.toRadians(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      double double0 = FastMath.toRadians(720.051);
      assertEquals(12.56726073227769, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      double double0 = FastMath.cbrt(1652.9633F);
      assertEquals(11.823727171390892, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      double double0 = FastMath.acos((-5.1E-8));
      assertEquals(1.5707963777948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      double double0 = FastMath.acos((-4.9E-324));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      double double0 = FastMath.acos((-1106.2555F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      double double0 = FastMath.acos(1862.713959726);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      double double0 = FastMath.asin((-4949.78814209));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      double double0 = FastMath.asin(823.144193047);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      double double0 = FastMath.atan2((-2111.63F), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      double double0 = FastMath.atan2(1829.6668405541, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7976931348623157E308), 0.0F);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      double double0 = FastMath.atan2(6.402020300783889E-254, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      double double0 = FastMath.atan2((-4.49423283715579E307), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      double double0 = FastMath.atan2((-2081.664875), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      double double0 = FastMath.atan2(0.09584270417690277, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 3294198.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, (-990.959864224548));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, (-1700.8987823293162));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2228.93));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      double double0 = FastMath.asin(3.814697265625E-6);
      assertEquals(3.814697265634252E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      double double0 = FastMath.atan2((-501.4), 4.9E-324);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      double double0 = FastMath.atan((-1855.30894669));
      assertEquals((-1.5702573330575216), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      double double0 = FastMath.atan2(6.123233995736766E-17, (-1.7976931348623157E308));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      double double0 = FastMath.cos((-2483.769191729185));
      assertEquals((-0.33367475635965793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      double double0 = FastMath.sin(4023.5837F);
      assertEquals(0.7148775776861893, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      double double0 = FastMath.sin(4.123026721295484E187);
      assertEquals((-0.4292545795048203), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      double double0 = FastMath.tan(6.7221663670144522E18);
      assertEquals((-5.618407349534663), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      double double0 = FastMath.sin(3.601462096264153E14);
      assertEquals((-0.38433852180858286), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      double double0 = FastMath.sin((-4.49423283715579E307));
      assertEquals(0.9556070935834843, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      double double0 = FastMath.sin(4.937951853898024E211);
      assertEquals(0.9896690790297462, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      double double0 = FastMath.sin((-3.0417051809209134E136));
      assertEquals(0.4640938764932981, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      double double0 = FastMath.sin(15215325);
      assertEquals(0.9165016487650176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      double double0 = FastMath.cos(4.793444363780116E219);
      assertEquals(0.4092654905564577, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      double double0 = FastMath.tan(2.71853394036182E-51);
      assertEquals(2.71853394036182E-51, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      double double0 = FastMath.tan(102.0);
      assertEquals(9.79298026353578, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      double double0 = FastMath.sin((-0.2438117590770259));
      assertEquals((-0.24140339695478366), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 746);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      double double0 = FastMath.pow(3.141592653589793, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      double double0 = FastMath.pow(1499.9346838135525, (-536));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      double double0 = FastMath.pow((-346.1), 4.3083697654732717E304);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), (double) (-8388608));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      double double0 = FastMath.pow((-5.207000323380292E-8), (-5.207000323380292E-8));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      double double0 = FastMath.pow((-2.2250738585072014E-308), (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      double double0 = FastMath.pow((-1758.9), 991.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      double double0 = FastMath.pow(0.9999999999999999, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.1670396F), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 4.503599627370496E15);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 0.5);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      double double0 = FastMath.pow(2.479773539153719E-5, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-267.6077003117789));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 991.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 2740.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 1.5391707185581056E-178);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      double double0 = FastMath.log1p(4015.1038F);
      assertEquals(8.298067497632832, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      double double0 = FastMath.log1p((-3.476352191116455E277));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      double double0 = FastMath.log(1.1910135746002197);
      assertEquals(0.17480468795742926, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324);
      assertEquals((-744.4400719213812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      double double0 = FastMath.atanh((-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      double double0 = FastMath.expm1((-3.342662547601502E-11));
      assertEquals((-3.342662547545635E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      double double0 = FastMath.pow(0.5403022766113281, 1.01);
      assertEquals(0.5369862501261444, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      double double0 = FastMath.expm1(2358);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      double double0 = FastMath.exp((-741.295));
      assertEquals(1.14E-322, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      double double0 = FastMath.expm1((-715.56000639));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      double double0 = FastMath.expm1((-2161.65982904114));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      double double0 = FastMath.exp((-1854.3827514318907));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      float float0 = FastMath.signum(4.6251968E18F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      float float0 = FastMath.signum((-3.4028235E38F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      double double0 = FastMath.signum((-7.678973146281339E-156));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      double double0 = FastMath.signum(2.71853394036182E-51);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      double double0 = FastMath.atanh(0.008278874280854717);
      assertEquals(0.008279063432650417, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      double double0 = FastMath.atanh(0.041666663879186654);
      assertEquals(0.04169080167719773, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      double double0 = FastMath.atanh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      double double0 = FastMath.atanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      double double0 = FastMath.asinh(0.07073719799518585);
      assertEquals(0.07067833854257323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      double double0 = FastMath.asinh((-0.16666666666666666));
      assertEquals((-0.16590455026930118), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1088()  throws Throwable  {
      double double0 = FastMath.asinh(0.036);
      assertEquals(0.035992228531467885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1089()  throws Throwable  {
      double double0 = FastMath.asinh((-1087.452));
      assertEquals((-7.684740016024796), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1090()  throws Throwable  {
      double double0 = FastMath.tanh(6.123233995736766E-17);
      assertEquals(6.123233995736766E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1091()  throws Throwable  {
      double double0 = FastMath.tanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1092()  throws Throwable  {
      double double0 = FastMath.tanh((-3.476352191116455E277));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1093()  throws Throwable  {
      double double0 = FastMath.tanh(667.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1094()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1095()  throws Throwable  {
      double double0 = FastMath.sinh(0.07073719799518585);
      assertEquals(0.07079620464564006, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1096()  throws Throwable  {
      double double0 = FastMath.sinh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1097()  throws Throwable  {
      double double0 = FastMath.sinh((-2944.978651));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1098()  throws Throwable  {
      double double0 = FastMath.sinh((-146));
      assertEquals((-1.2763340697627276E63), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1099()  throws Throwable  {
      double double0 = FastMath.sinh(895.7317490664279);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1100()  throws Throwable  {
      double double0 = FastMath.sinh(23.284907825306362);
      assertEquals(6.478537612422651E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1101()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1102()  throws Throwable  {
      double double0 = FastMath.cosh((-4433.0335));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1103()  throws Throwable  {
      double double0 = FastMath.cosh(517.4385042113023);
      assertEquals(2.628192112386049E224, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1104()  throws Throwable  {
      double double0 = FastMath.cosh(1996.9271F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1105()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1106()  throws Throwable  {
      double double0 = FastMath.atan2((-4.49423283715579E307), (-4.49423283715579E307));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1107()  throws Throwable  {
      double double0 = FastMath.random();
      double double1 = FastMath.random();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1108()  throws Throwable  {
      int int0 = FastMath.getExponent((-767.2877879));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test_1109()  throws Throwable  {
      int int0 = FastMath.getExponent((float) (-855));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test_1110()  throws Throwable  {
      double double0 = FastMath.cosh((-27.542522674635745));
      assertEquals(4.576522687133275E11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1111()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-2411.0), (-2411.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1112()  throws Throwable  {
      double double0 = FastMath.acos(0.19999954104423523);
      assertEquals(1.3694388744243093, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1113()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1114()  throws Throwable  {
      long long0 = FastMath.round((double) (-0.99999994F));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test_1115()  throws Throwable  {
      double double0 = FastMath.cos((-204.4));
      assertEquals((-0.9807603055289619), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1116()  throws Throwable  {
      FastMath.getExponent((-2211.1F));
  }

  @Test(timeout = 4000)
  public void test_1117()  throws Throwable  {
      FastMath.copySign((-1.0F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1118()  throws Throwable  {
      FastMath.copySign(0.0F, (-109.0F));
  }

  @Test(timeout = 4000)
  public void test_1119()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1120()  throws Throwable  {
      FastMath.copySign((-20.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1121()  throws Throwable  {
      FastMath.hypot((-2.6033824355191673E-8), 3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_1122()  throws Throwable  {
      FastMath.hypot(1054.0673F, (-8.33796245311781E-6));
  }

  @Test(timeout = 4000)
  public void test_1123()  throws Throwable  {
      FastMath.min((-1L), (-1L));
  }

  @Test(timeout = 4000)
  public void test_1124()  throws Throwable  {
      FastMath.rint((-874.39432));
  }

  @Test(timeout = 4000)
  public void test_1125()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_1126()  throws Throwable  {
      FastMath.ceil(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_1127()  throws Throwable  {
      FastMath.ceil(-0.0);
  }

  @Test(timeout = 4000)
  public void test_1128()  throws Throwable  {
      FastMath.round(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1129()  throws Throwable  {
      FastMath.scalb((-2211.1F), (-138));
  }

  @Test(timeout = 4000)
  public void test_1130()  throws Throwable  {
      FastMath.scalb(4738.0F, (-277));
  }

  @Test(timeout = 4000)
  public void test_1131()  throws Throwable  {
      FastMath.scalb((-2211.1F), 128);
  }

  @Test(timeout = 4000)
  public void test_1132()  throws Throwable  {
      FastMath.scalb((-2211.10009765625), 2097);
  }

  @Test(timeout = 4000)
  public void test_1133()  throws Throwable  {
      FastMath.scalb(1.1795268640216787E-8, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1134()  throws Throwable  {
      FastMath.ulp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1135()  throws Throwable  {
      FastMath.ulp(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1136()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1137()  throws Throwable  {
      FastMath.abs(4643422322051514410L);
  }

  @Test(timeout = 4000)
  public void test_1138()  throws Throwable  {
      FastMath.toDegrees(2946.09);
  }

  @Test(timeout = 4000)
  public void test_1139()  throws Throwable  {
      FastMath.asin((-1.1368683772161603E-13));
  }

  @Test(timeout = 4000)
  public void test_1140()  throws Throwable  {
      FastMath.atan2(0.0, 2.220446049250313E-16);
  }

  @Test(timeout = 4000)
  public void test_1141()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1142()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1143()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1144()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1145()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1146()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1147()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1148()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1149()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1150()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1151()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1152()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_1153()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_1154()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_1155()  throws Throwable  {
      FastMath.asinh(0.097);
  }

  @Test(timeout = 4000)
  public void test_1156()  throws Throwable  {
      FastMath.tanh((-0.5));
  }

  @Test(timeout = 4000)
  public void test_1157()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1158()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_1159()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1160()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1161()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1162()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1163()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1164()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1165()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1166()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1167()  throws Throwable  {
      FastMath.atan2(0.5, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1168()  throws Throwable  {
      FastMath.atan2(3.817173955083142E-32, (-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1169()  throws Throwable  {
      FastMath.toRadians((-2048.3));
  }

  @Test(timeout = 4000)
  public void test_1170()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1171()  throws Throwable  {
      FastMath.sqrt(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_1172()  throws Throwable  {
      FastMath.signum(0.0);
  }

  @Test(timeout = 4000)
  public void test_1173()  throws Throwable  {
      FastMath.round(0.5F);
  }

  @Test(timeout = 4000)
  public void test_1174()  throws Throwable  {
      FastMath.round((-213.94775F));
  }

  @Test(timeout = 4000)
  public void test_1175()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_1176()  throws Throwable  {
      FastMath.round((-3498.619067));
  }

  @Test(timeout = 4000)
  public void test_1177()  throws Throwable  {
      Random.setNextRandom(128);
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_1178()  throws Throwable  {
      Random.setNextRandom(Integer.MIN_VALUE);
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_1179()  throws Throwable  {
      FastMath.pow(0.0, 2554);
  }

  @Test(timeout = 4000)
  public void test_1180()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1181()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_1182()  throws Throwable  {
      FastMath.nextAfter(0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1183()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1184()  throws Throwable  {
      FastMath.min(0L, 4503599627370496L);
  }

  @Test(timeout = 4000)
  public void test_1185()  throws Throwable  {
      FastMath.min(4820L, 1763L);
  }

  @Test(timeout = 4000)
  public void test_1186()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_1187()  throws Throwable  {
      FastMath.min(5, 4643);
  }

  @Test(timeout = 4000)
  public void test_1188()  throws Throwable  {
      FastMath.min(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1189()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_1190()  throws Throwable  {
      FastMath.max((-2762), 0);
  }

  @Test(timeout = 4000)
  public void test_1191()  throws Throwable  {
      FastMath.max((-1072), (-280106563));
  }

  @Test(timeout = 4000)
  public void test_1192()  throws Throwable  {
      FastMath.max(Float.NEGATIVE_INFINITY, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1193()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1194()  throws Throwable  {
      FastMath.log10(741);
  }

  @Test(timeout = 4000)
  public void test_1195()  throws Throwable  {
      FastMath.log(0.0, 2.767775868745994);
  }

  @Test(timeout = 4000)
  public void test_1196()  throws Throwable  {
      FastMath.log(0.7316888570785522, 2008.06624193);
  }

  @Test(timeout = 4000)
  public void test_1197()  throws Throwable  {
      FastMath.log(1148.6);
  }

  @Test(timeout = 4000)
  public void test_1198()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1199()  throws Throwable  {
      FastMath.getExponent(1.2207031E-4F);
  }

  @Test(timeout = 4000)
  public void test_1200()  throws Throwable  {
      FastMath.getExponent((double) 5);
  }

  @Test(timeout = 4000)
  public void test_1201()  throws Throwable  {
      FastMath.getExponent(1.1920928955078125E-7);
  }

  @Test(timeout = 4000)
  public void test_1202()  throws Throwable  {
      FastMath.copySign((double) 0.0F, 766.41251952143);
  }

  @Test(timeout = 4000)
  public void test_1203()  throws Throwable  {
      FastMath.cbrt(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_1204()  throws Throwable  {
      FastMath.atanh(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_1205()  throws Throwable  {
      FastMath.atan(1.633123935319537E16);
  }

  @Test(timeout = 4000)
  public void test_1206()  throws Throwable  {
      FastMath.atan((-5153.204));
  }

  @Test(timeout = 4000)
  public void test_1207()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1208()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_1209()  throws Throwable  {
      FastMath.acosh(568.912694);
  }

  @Test(timeout = 4000)
  public void test_1210()  throws Throwable  {
      FastMath.acosh((-3.0193997990753756E16));
  }

  @Test(timeout = 4000)
  public void test_1211()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1212()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1213()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1214()  throws Throwable  {
      FastMath.IEEEremainder(1766.32916, 1766.32916);
  }

  @Test(timeout = 4000)
  public void test_1215()  throws Throwable  {
      FastMath.IEEEremainder(0.667459725203805, (-0.46211715726000974));
  }

  @Test(timeout = 4000)
  public void test_1216()  throws Throwable  {
      FastMath.IEEEremainder((-760.3351), 9.755392680573412E-9);
  }

  @Test(timeout = 4000)
  public void test_1217()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-1831.730968), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1218()  throws Throwable  {
      double double0 = FastMath.copySign((double) 0.81141245F, 1.3132616875182228);
      assertEquals(0.8114124536514282, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1219()  throws Throwable  {
      double double0 = FastMath.copySign((double) 1.4E-45F, (double) (-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1220()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1221()  throws Throwable  {
      double double0 = FastMath.floor((-1.6471487337453832E-9));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1222()  throws Throwable  {
      double double0 = FastMath.floor((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1223()  throws Throwable  {
      double double0 = FastMath.floor(6.862107413628198E276);
      assertEquals(6.862107413628198E276, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1224()  throws Throwable  {
      double double0 = FastMath.floor(1.184154459111628E-8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1225()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1377.0F), 1.0E-6);
      assertEquals((-1376.9999F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1226()  throws Throwable  {
      float float0 = FastMath.nextAfter(128.0F, 2.5707965595513373);
      assertEquals(127.99999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1227()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0L, 0.8333333333333334);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1228()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 1436.593086811519);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1229()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1230()  throws Throwable  {
      double double0 = FastMath.nextAfter(57.082390016, (double) 1023);
      assertEquals(57.082390016000005, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1231()  throws Throwable  {
      double double0 = FastMath.nextAfter((-806.011319), (-1423.4));
      assertEquals((-806.0113190000001), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1232()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) 132);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1233()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 2.9802322387695312E-8);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1234()  throws Throwable  {
      double double0 = FastMath.scalb(1025.039789884, (-1033));
      assertEquals(1.113666621289357E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1235()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0.0F, (-2144864733));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1236()  throws Throwable  {
      double double0 = FastMath.scalb(7.196457718729758E281, 0);
      assertEquals(7.196457718729758E281, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1237()  throws Throwable  {
      double double0 = FastMath.abs((-2974.966135853234));
      assertEquals(2974.966135853234, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1238()  throws Throwable  {
      double double0 = FastMath.abs(1375.646322342808);
      assertEquals(1375.646322342808, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1239()  throws Throwable  {
      float float0 = FastMath.abs((-697.9704F));
      assertEquals(697.9704F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1240()  throws Throwable  {
      double double0 = FastMath.pow(1.0E-6, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1241()  throws Throwable  {
      int int0 = FastMath.getExponent(1.0791480541229248);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1242()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1243()  throws Throwable  {
      float float0 = FastMath.copySign((-3.4028235E38F), (float) 1L);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1244()  throws Throwable  {
      float float0 = FastMath.copySign((float) 10, (-1792.541F));
      assertEquals((-10.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1245()  throws Throwable  {
      float float0 = FastMath.copySign(441.703F, (float) 2045222521);
      assertEquals(441.703F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1246()  throws Throwable  {
      float float0 = FastMath.copySign(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1247()  throws Throwable  {
      double double0 = FastMath.copySign((-713.9926569478), 4.503599627370496E15);
      assertEquals(713.9926569478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1248()  throws Throwable  {
      double double0 = FastMath.atan2((-2.2250738585072014E-308), 3.7840364464509555E276);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1249()  throws Throwable  {
      double double0 = FastMath.copySign((double) (-2211.1F), (double) (-2211.1F));
      assertEquals((-2211.10009765625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1250()  throws Throwable  {
      double double0 = FastMath.hypot(1.0, 1.1552273904608563E-172);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1251()  throws Throwable  {
      double double0 = FastMath.hypot((-845.2273228731531), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1252()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, (-2683.4619564124537));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1253()  throws Throwable  {
      double double0 = FastMath.hypot(1611, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1254()  throws Throwable  {
      double double0 = FastMath.hypot(Float.NEGATIVE_INFINITY, 1131.50148);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1255()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1256()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, (-2048.3));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1257()  throws Throwable  {
      double double0 = FastMath.max((-5153.204), (-1.5706022727680333));
      assertEquals((-1.5706022727680333), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1258()  throws Throwable  {
      double double0 = FastMath.max(1.9532357113E-314, (-1.3811462167E-314));
      assertEquals(1.9532357113E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1259()  throws Throwable  {
      double double0 = FastMath.max(9.544642884951585E-145, 9.544642884951585E-145);
      assertEquals(9.544642884951585E-145, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1260()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1261()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1262()  throws Throwable  {
      float float0 = FastMath.max((-593.0F), (float) 1611);
      assertEquals(1611.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1263()  throws Throwable  {
      float float0 = FastMath.max((float) 750, 151.12032F);
      assertEquals(750.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1264()  throws Throwable  {
      float float0 = FastMath.max(3543.1833F, 3543.1833F);
      assertEquals(3543.1833F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1265()  throws Throwable  {
      long long0 = FastMath.max((-3499L), (-1261L));
      assertEquals((-1261L), long0);
  }

  @Test(timeout = 4000)
  public void test_1266()  throws Throwable  {
      long long0 = FastMath.max(4643422322051514410L, (-1261L));
      assertEquals(4643422322051514410L, long0);
  }

  @Test(timeout = 4000)
  public void test_1267()  throws Throwable  {
      int int0 = FastMath.max(1023, 1023);
      assertEquals(1023, int0);
  }

  @Test(timeout = 4000)
  public void test_1268()  throws Throwable  {
      double double0 = FastMath.min(1596.7066902521, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1269()  throws Throwable  {
      double double0 = FastMath.min(1.0, 1.4142135623730951);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1270()  throws Throwable  {
      double double0 = FastMath.min(2092.633, (-1.004637577735705));
      assertEquals((-1.004637577735705), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1271()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1272()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, 3.5492892F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1273()  throws Throwable  {
      float float0 = FastMath.min(226.75F, 226.75F);
      assertEquals(226.75F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1274()  throws Throwable  {
      float float0 = FastMath.min(2012.377F, (-167.0F));
      assertEquals((-167.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1275()  throws Throwable  {
      float float0 = FastMath.min((-1.0F), -0.0F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1276()  throws Throwable  {
      int int0 = FastMath.min((-3170), (-3170));
      assertEquals((-3170), int0);
  }

  @Test(timeout = 4000)
  public void test_1277()  throws Throwable  {
      int int0 = FastMath.min(1301, (-60));
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  public void test_1278()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1279()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1280()  throws Throwable  {
      double double0 = FastMath.rint((-2.2250738585072014E-308));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1281()  throws Throwable  {
      double double0 = FastMath.rint(1413.9261519397);
      assertEquals(1414.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1282()  throws Throwable  {
      double double0 = FastMath.ceil((-1.6471487337453832E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1283()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1284()  throws Throwable  {
      double double0 = FastMath.rint((-127));
      assertEquals((-127.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1285()  throws Throwable  {
      double double0 = FastMath.ceil((-385.10318642809));
      assertEquals((-385.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1286()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1287()  throws Throwable  {
      float float0 = FastMath.nextUp(1.0F);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1288()  throws Throwable  {
      float float0 = FastMath.nextAfter((-358.0F), (-2873.7249));
      assertEquals((-358.00003F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1289()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-705.278015838683));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1290()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1291()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1292()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 2138769243, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1293()  throws Throwable  {
      double double0 = FastMath.nextUp(3073.068);
      assertEquals(3073.0680000000007, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1294()  throws Throwable  {
      double double0 = FastMath.nextAfter(232.97708, 0.2);
      assertEquals(232.97707999999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1295()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-54.691));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1296()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 1375.646322342808);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1297()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.POSITIVE_INFINITY, (-1522.4952756674547));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1298()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Integer.MAX_VALUE, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1299()  throws Throwable  {
      float float0 = FastMath.scalb((float) 218, 218);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1300()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 218);
      assertEquals((-5.902958E20F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1301()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-164), (-164));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1302()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-3499L), (-161));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1303()  throws Throwable  {
      float float0 = FastMath.scalb((float) 1025, 1025);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1304()  throws Throwable  {
      float float0 = FastMath.scalb((-88.0F), 523);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1305()  throws Throwable  {
      float float0 = FastMath.scalb((float) 53, Integer.MIN_VALUE);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1306()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1664), (-1664));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1307()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, (-3895));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1308()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-1288));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1309()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-1073741824));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1310()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2, 2);
      assertEquals(8.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1311()  throws Throwable  {
      float float0 = FastMath.scalb((-2391.9028F), 276);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1312()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1313()  throws Throwable  {
      double double0 = FastMath.scalb((double) 1611, 1611);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1314()  throws Throwable  {
      double double0 = FastMath.scalb((-2.2250738585072014E-308), 1611);
      assertEquals((-2.0261306488676723E177), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1315()  throws Throwable  {
      double double0 = FastMath.scalb((-2.938736052218037E-39), (-1064));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1316()  throws Throwable  {
      double double0 = FastMath.scalb(0.4974554181098938, (-1029));
      assertEquals(8.6474613016336E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1317()  throws Throwable  {
      double double0 = FastMath.scalb(2929.59, (-1023));
      assertEquals(3.259277062572056E-305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1318()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2138769243, 2138769243);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1319()  throws Throwable  {
      double double0 = FastMath.scalb((-2048.3), 3530);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1320()  throws Throwable  {
      double double0 = FastMath.scalb(3.141592653589793, (-2144864733));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1321()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2143269833), (-2143269833));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1322()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1323()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, (-2075));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1324()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, Integer.MAX_VALUE);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1325()  throws Throwable  {
      double double0 = FastMath.scalb((-1597.1208222), 1024);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1326()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1327()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1328()  throws Throwable  {
      double double0 = FastMath.ulp(5289.6454);
      assertEquals(9.094947017729282E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1329()  throws Throwable  {
      double double0 = FastMath.hypot(5.0614674548127384E-8, (-735.469));
      assertEquals(735.469, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1330()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1331()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1332()  throws Throwable  {
      float float0 = FastMath.abs(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1333()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1334()  throws Throwable  {
      int int0 = FastMath.abs((-942));
      assertEquals(942, int0);
  }

  @Test(timeout = 4000)
  public void test_1335()  throws Throwable  {
      int int0 = FastMath.abs(1049);
      assertEquals(1049, int0);
  }

  @Test(timeout = 4000)
  public void test_1336()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1337()  throws Throwable  {
      double double0 = FastMath.toDegrees((-3498.0));
      assertEquals((-200420.63673676195), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1338()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1339()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1340()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1341()  throws Throwable  {
      double double0 = FastMath.toRadians(1.0);
      assertEquals(0.017453292519943295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1342()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1343()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1344()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1345()  throws Throwable  {
      double double0 = FastMath.acos((-1.3811462167E-314));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1346()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1347()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1348()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1349()  throws Throwable  {
      double double0 = FastMath.acos((-2417.1126444127));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1350()  throws Throwable  {
      double double0 = FastMath.acos(2399.06443697832);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1351()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1352()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1353()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1354()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1355()  throws Throwable  {
      double double0 = FastMath.asin(0.02412080392241478);
      assertEquals(0.024123143501952285, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1356()  throws Throwable  {
      double double0 = FastMath.asin(1412.6907973798);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1357()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1358()  throws Throwable  {
      double double0 = FastMath.asin((-1.1324629266369002));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1359()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 3.141592653589793);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1360()  throws Throwable  {
      double double0 = FastMath.atan2(1.820141955326842E-7, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1361()  throws Throwable  {
      double double0 = FastMath.atan2((-1455.072), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1362()  throws Throwable  {
      double double0 = FastMath.atan2(1.7976931348623157E308, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1363()  throws Throwable  {
      double double0 = FastMath.atan2((-2716.156452227), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1364()  throws Throwable  {
      double double0 = FastMath.atan2((-0.570282747486), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1365()  throws Throwable  {
      double double0 = FastMath.atan2(1014, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1366()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-2211.1F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1367()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1368()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1369()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1370()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 1182.2931583188827);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1371()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1372()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1373()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1889.8009541));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1374()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Integer.MAX_VALUE);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1375()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1376()  throws Throwable  {
      double double0 = FastMath.acos((-4.813899778443457E-9));
      assertEquals(1.5707963316087965, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1377()  throws Throwable  {
      double double0 = FastMath.atan2((-1804.3450801498934), (-2.2250738585072014E-308));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1378()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, (-1819.779840663));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1379()  throws Throwable  {
      double double0 = FastMath.tan((-9.223372036854776E18));
      assertEquals((-84.73931296875567), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1380()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1381()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1382()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1383()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1384()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1385()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1386()  throws Throwable  {
      double double0 = FastMath.sin((-913.0));
      assertEquals((-0.9332880504589218), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1387()  throws Throwable  {
      double double0 = FastMath.sin((-2211.1F));
      assertEquals(0.5489691831514759, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1388()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1389()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1390()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1391()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1392()  throws Throwable  {
      double double0 = FastMath.tan(1.8586717056324128E31);
      assertEquals((-0.40369039381262783), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1393()  throws Throwable  {
      double double0 = FastMath.sin(1.34217729E8);
      assertEquals(0.1310562791155129, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1394()  throws Throwable  {
      double double0 = FastMath.cos(1.8702183451052442E149);
      assertEquals(0.21098518470877894, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1395()  throws Throwable  {
      double double0 = FastMath.tan(8.655600419198154E10);
      assertEquals((-0.4202950626264139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1396()  throws Throwable  {
      double double0 = FastMath.cos(1.633123935319537E16);
      assertEquals((-0.28443016146380146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1397()  throws Throwable  {
      double double0 = FastMath.tan((-9.684925795536813E116));
      assertEquals((-0.5555101712666682), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1398()  throws Throwable  {
      double double0 = FastMath.cos(8.550658957115427E118);
      assertEquals((-0.8507741938330003), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1399()  throws Throwable  {
      double double0 = FastMath.sin(8.169926810324408E237);
      assertEquals((-0.9984970506693224), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1400()  throws Throwable  {
      double double0 = FastMath.tan(2.2250738585072014E-308);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1401()  throws Throwable  {
      double double0 = FastMath.sin(0.2540974480313346);
      assertEquals(0.2513719396008681, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1402()  throws Throwable  {
      double double0 = FastMath.pow(0.8079523438077358, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1403()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1404()  throws Throwable  {
      double double0 = FastMath.pow((-2528.740331423305), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1405()  throws Throwable  {
      double double0 = FastMath.pow(2399.06443697832, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1406()  throws Throwable  {
      double double0 = FastMath.pow((-7.861419797923639E-8), 124.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1407()  throws Throwable  {
      double double0 = FastMath.pow((-2.356194490192345), (-2.356194490192345));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1408()  throws Throwable  {
      double double0 = FastMath.pow((double) (-164), 8.169926810324408E237);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1409()  throws Throwable  {
      double double0 = FastMath.pow((-1.4121324224340735E84), (double) (-127));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1410()  throws Throwable  {
      double double0 = FastMath.pow(0.9689123630523682, (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1411()  throws Throwable  {
      double double0 = FastMath.pow((-2080.0), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1412()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) 1045);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1413()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1414()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1415()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, 6.0778104626050015E-9);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1416()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (-2898.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1417()  throws Throwable  {
      double double0 = FastMath.pow((-2700.20117), (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1418()  throws Throwable  {
      double double0 = FastMath.pow(0.9689123630523682, (double) Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1419()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (double) Integer.MAX_VALUE);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1420()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1421()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-3.141592653589793));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1422()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 3228.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1423()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-1.4E-45F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1424()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 0.003489010462502087);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1425()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (-1.1E-13));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1426()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 194.81862328396);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1427()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1428()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1429()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1430()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1431()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1432()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1433()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1434()  throws Throwable  {
      double double0 = FastMath.log1p(0.34508460760116577);
      assertEquals(0.29645691635502547, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1435()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, (-145.43428316858157));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1436()  throws Throwable  {
      double double0 = FastMath.log1p(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1437()  throws Throwable  {
      double double0 = FastMath.log(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1438()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1439()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1440()  throws Throwable  {
      double double0 = FastMath.expm1(2776.538962405358);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1441()  throws Throwable  {
      double double0 = FastMath.exp((-719.9501));
      assertEquals(2.1362118719E-313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1442()  throws Throwable  {
      double double0 = FastMath.expm1((-736.3));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1443()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1444()  throws Throwable  {
      double double0 = FastMath.exp((-1268.209195));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1445()  throws Throwable  {
      float float0 = FastMath.signum(1.4E-45F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1446()  throws Throwable  {
      float float0 = FastMath.signum(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1447()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1448()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1449()  throws Throwable  {
      double double0 = FastMath.signum((-9.223372036854776E18));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1450()  throws Throwable  {
      double double0 = FastMath.signum(1.1368683772161603E-13);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1451()  throws Throwable  {
      double double0 = FastMath.atanh((-0.010714690733195933));
      assertEquals((-0.010715100793361396), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1452()  throws Throwable  {
      double double0 = FastMath.atanh(0.03550322020875851);
      assertEquals(0.035518148517444094, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1453()  throws Throwable  {
      double double0 = FastMath.atanh((-674.299));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1454()  throws Throwable  {
      double double0 = FastMath.atanh(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1455()  throws Throwable  {
      double double0 = FastMath.asinh(0.167);
      assertEquals(0.1662333393520369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1456()  throws Throwable  {
      double double0 = FastMath.asinh((-19.143789831599744));
      assertEquals((-3.6458070126022424), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1457()  throws Throwable  {
      double double0 = FastMath.tanh(1.7827257129423813E-8);
      assertEquals(1.782725712942381E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1458()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1459()  throws Throwable  {
      double double0 = FastMath.tanh((-2048.3));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1460()  throws Throwable  {
      double double0 = FastMath.tanh(1866.19);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1461()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1462()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1463()  throws Throwable  {
      double double0 = FastMath.sinh((-3102.3227603625));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1464()  throws Throwable  {
      double double0 = FastMath.sinh((-2.938736052218037E-39));
      assertEquals((-2.938736052218037E-39), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1465()  throws Throwable  {
      double double0 = FastMath.sinh(164.4799250532);
      assertEquals(1.354234391690959E71, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1466()  throws Throwable  {
      double double0 = FastMath.sinh(1129.38171083);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1467()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1468()  throws Throwable  {
      double double0 = FastMath.sinh((-119));
      assertEquals((-2.398906663649651E51), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1469()  throws Throwable  {
      double double0 = FastMath.cosh((-431.294));
      assertEquals(1.0175934018518812E187, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1470()  throws Throwable  {
      double double0 = FastMath.cosh(394.0788173);
      assertEquals(7.002059432666949E170, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1471()  throws Throwable  {
      double double0 = FastMath.cosh(2068.336);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1472()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1473()  throws Throwable  {
      double double0 = FastMath.acos(0.99);
      assertEquals(0.1415394733244273, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1474()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1475()  throws Throwable  {
      double double0 = FastMath.log(2.718281828459045, 2.718281828459045);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1476()  throws Throwable  {
      String[] stringArray0 = new String[1];
      FastMath.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_1477()  throws Throwable  {
      double double0 = FastMath.cosh((-2285.36298135));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1478()  throws Throwable  {
      double double0 = FastMath.nextUp((double) (-1.4E-45F));
      assertEquals((-1.4012984643248169E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1479()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1480()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1481()  throws Throwable  {
      double double0 = FastMath.expm1((-2.2250738585072014E-308));
      assertEquals((-2.2250738585072014E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1482()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1483()  throws Throwable  {
      double double0 = FastMath.cos(108.5567450666);
      assertEquals((-0.17095466618676147), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1484()  throws Throwable  {
      FastMath.getExponent((float) (-812L));
  }

  @Test(timeout = 4000)
  public void test_1485()  throws Throwable  {
      FastMath.copySign((-953.758F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1486()  throws Throwable  {
      FastMath.copySign(1895.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1487()  throws Throwable  {
      FastMath.copySign((-2443.35493), (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1488()  throws Throwable  {
      FastMath.hypot(6.206776940880773E-9, 0.8715557817996559);
  }

  @Test(timeout = 4000)
  public void test_1489()  throws Throwable  {
      FastMath.hypot((-244.045579782484), (-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1490()  throws Throwable  {
      FastMath.min((-1313L), (-756L));
  }

  @Test(timeout = 4000)
  public void test_1491()  throws Throwable  {
      FastMath.min(4054, 4054);
  }

  @Test(timeout = 4000)
  public void test_1492()  throws Throwable  {
      FastMath.rint((-2981.1519F));
  }

  @Test(timeout = 4000)
  public void test_1493()  throws Throwable  {
      FastMath.rint(267.5);
  }

  @Test(timeout = 4000)
  public void test_1494()  throws Throwable  {
      FastMath.ceil((-298.6226998064227));
  }

  @Test(timeout = 4000)
  public void test_1495()  throws Throwable  {
      FastMath.rint((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1496()  throws Throwable  {
      FastMath.ceil(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1497()  throws Throwable  {
      FastMath.scalb((-435.0F), 276);
  }

  @Test(timeout = 4000)
  public void test_1498()  throws Throwable  {
      FastMath.scalb((double) 1.0F, (-1023));
  }

  @Test(timeout = 4000)
  public void test_1499()  throws Throwable  {
      FastMath.scalb(1066.611644587487, 2097);
  }

  @Test(timeout = 4000)
  public void test_1500()  throws Throwable  {
      FastMath.scalb((double) 8, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1501()  throws Throwable  {
      FastMath.ulp((-722.6217));
  }

  @Test(timeout = 4000)
  public void test_1502()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1503()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1504()  throws Throwable  {
      FastMath.cbrt(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test_1505()  throws Throwable  {
      FastMath.asin(0.18765154615652024);
  }

  @Test(timeout = 4000)
  public void test_1506()  throws Throwable  {
      FastMath.atan2(0.0, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1507()  throws Throwable  {
      FastMath.atan2((-0.014447212544890566), (-0.014447212544890566));
  }

  @Test(timeout = 4000)
  public void test_1508()  throws Throwable  {
      FastMath.tan((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1509()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1510()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1511()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1512()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1513()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1514()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1515()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1516()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_1517()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1518()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1519()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_1520()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_1521()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_1522()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_1523()  throws Throwable  {
      FastMath.tanh((-0.5));
  }

  @Test(timeout = 4000)
  public void test_1524()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1525()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1526()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1527()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1528()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1529()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1530()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1531()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1532()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1533()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1534()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1535()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1536()  throws Throwable  {
      FastMath.toDegrees((-2895.54));
  }

  @Test(timeout = 4000)
  public void test_1537()  throws Throwable  {
      FastMath.sqrt(0.0);
  }

  @Test(timeout = 4000)
  public void test_1538()  throws Throwable  {
      FastMath.sqrt(1895.0001F);
  }

  @Test(timeout = 4000)
  public void test_1539()  throws Throwable  {
      FastMath.round(0.4564711F);
  }

  @Test(timeout = 4000)
  public void test_1540()  throws Throwable  {
      FastMath.round((float) 709);
  }

  @Test(timeout = 4000)
  public void test_1541()  throws Throwable  {
      FastMath.round(0.0);
  }

  @Test(timeout = 4000)
  public void test_1542()  throws Throwable  {
      FastMath.round((-111.8555353455));
  }

  @Test(timeout = 4000)
  public void test_1543()  throws Throwable  {
      FastMath.pow((double) (-0.99999994F), (-1186810335));
  }

  @Test(timeout = 4000)
  public void test_1544()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1545()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_1546()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1547()  throws Throwable  {
      FastMath.min(4503599627370496L, 4503599627370496L);
  }

  @Test(timeout = 4000)
  public void test_1548()  throws Throwable  {
      FastMath.min(174, 0);
  }

  @Test(timeout = 4000)
  public void test_1549()  throws Throwable  {
      FastMath.min(1.4E-45F, 1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_1550()  throws Throwable  {
      FastMath.max((-1589L), 0L);
  }

  @Test(timeout = 4000)
  public void test_1551()  throws Throwable  {
      FastMath.max(123L, 123L);
  }

  @Test(timeout = 4000)
  public void test_1552()  throws Throwable  {
      FastMath.max((-3714), (-3714));
  }

  @Test(timeout = 4000)
  public void test_1553()  throws Throwable  {
      FastMath.max((-561.826F), (-561.826F));
  }

  @Test(timeout = 4000)
  public void test_1554()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1555()  throws Throwable  {
      FastMath.log10(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_1556()  throws Throwable  {
      FastMath.log(1.7227904796600342, 537.815944805);
  }

  @Test(timeout = 4000)
  public void test_1557()  throws Throwable  {
      FastMath.log(4972.9647506195, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1558()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_1559()  throws Throwable  {
      FastMath.log(2.718281828459045);
  }

  @Test(timeout = 4000)
  public void test_1560()  throws Throwable  {
      FastMath.log(0.0);
  }

  @Test(timeout = 4000)
  public void test_1561()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1562()  throws Throwable  {
      FastMath.getExponent((float) 0L);
  }

  @Test(timeout = 4000)
  public void test_1563()  throws Throwable  {
      FastMath.getExponent(4972.9647506195);
  }

  @Test(timeout = 4000)
  public void test_1564()  throws Throwable  {
      FastMath.getExponent(1.178204606523101E-7);
  }

  @Test(timeout = 4000)
  public void test_1565()  throws Throwable  {
      FastMath.copySign(0.0F, (-23.357498F));
  }

  @Test(timeout = 4000)
  public void test_1566()  throws Throwable  {
      FastMath.atanh(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1567()  throws Throwable  {
      FastMath.atanh((-4.595250028278979E-113));
  }

  @Test(timeout = 4000)
  public void test_1568()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_1569()  throws Throwable  {
      FastMath.atan((-2981.0));
  }

  @Test(timeout = 4000)
  public void test_1570()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1571()  throws Throwable  {
      FastMath.acosh((-1.8235546296745605E23));
  }

  @Test(timeout = 4000)
  public void test_1572()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_1573()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1574()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1575()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1576()  throws Throwable  {
      FastMath.IEEEremainder(0.0, 9);
  }

  @Test(timeout = 4000)
  public void test_1577()  throws Throwable  {
      FastMath.IEEEremainder(3.1660099222737955E-7, 1.5);
  }

  @Test(timeout = 4000)
  public void test_1578()  throws Throwable  {
      FastMath.IEEEremainder((-1.440995270758115E-291), 1581.87166458);
  }

  @Test(timeout = 4000)
  public void test_1579()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow((-0.25), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1580()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1581()  throws Throwable  {
      double double0 = FastMath.copySign(254.15, (-1.0));
      assertEquals((-254.15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1582()  throws Throwable  {
      double double0 = FastMath.floor(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1583()  throws Throwable  {
      double double0 = FastMath.floor((-864.0));
      assertEquals((-864.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1584()  throws Throwable  {
      double double0 = FastMath.floor((-3.4028235E38F));
      assertEquals((-3.4028234663852886E38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1585()  throws Throwable  {
      double double0 = FastMath.floor(1.2639113706171572E250);
      assertEquals(1.2639113706171572E250, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1586()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1587()  throws Throwable  {
      double double0 = FastMath.floor((-4393.133));
      assertEquals((-4394.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1588()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.0F, 1920.9);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1589()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 0.14285714285714285);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1590()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 1281.0648274);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1591()  throws Throwable  {
      double double0 = FastMath.nextAfter((-3.141592653589793), (-3099.039191));
      assertEquals((-3.1415926535897936), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1592()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.3584500601329896E-8), 4.503599627370496E15);
      assertEquals((-1.3584500601329895E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1593()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, 5.2240336371356666E-9);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1594()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.NEGATIVE_INFINITY, 3294198.0);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1595()  throws Throwable  {
      double double0 = FastMath.scalb((double) -0.0F, 1094);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1596()  throws Throwable  {
      double double0 = FastMath.scalb((-8.0E298), (-127));
      assertEquals((-4.70197740328915E260), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1597()  throws Throwable  {
      float float0 = FastMath.abs((-3.4028235E38F));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1598()  throws Throwable  {
      float float0 = FastMath.abs((float) 14);
      assertEquals(14.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1599()  throws Throwable  {
      double double0 = FastMath.pow(0.11111095942313305, (-1.4672600326020399E299));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1600()  throws Throwable  {
      int int0 = FastMath.getExponent((-1.0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1601()  throws Throwable  {
      double double0 = FastMath.log((-2810.150681946913));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1602()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-24), (float) (-24));
      assertEquals((-24.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1603()  throws Throwable  {
      float float0 = FastMath.copySign(0.5F, 0.5F);
      assertEquals(0.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1604()  throws Throwable  {
      float float0 = FastMath.copySign(1586.0F, (float) (-127));
      assertEquals((-1586.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1605()  throws Throwable  {
      float float0 = FastMath.copySign((float) (-24), 1.4E-45F);
      assertEquals(24.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1606()  throws Throwable  {
      double double0 = FastMath.copySign((-1402.615234375), 2.161656025361765E166);
      assertEquals(1402.615234375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1607()  throws Throwable  {
      double double0 = FastMath.copySign((-2141.4443359375), (-2141.4443359375));
      assertEquals((-2141.4443359375), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1608()  throws Throwable  {
      double double0 = FastMath.hypot((-1.7031839360032603E-108), 4.503599627370496E15);
      assertEquals(4.503599627370496E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1609()  throws Throwable  {
      double double0 = FastMath.hypot((-2057.493978012185), 9.755392680573412E-9);
      assertEquals(2057.493978012185, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1610()  throws Throwable  {
      double double0 = FastMath.hypot((-2720.479995), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1611()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 3.141592653589793);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1612()  throws Throwable  {
      double double0 = FastMath.hypot((-1.7976931348623157E308), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1613()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1614()  throws Throwable  {
      double double0 = FastMath.max(-0.0, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1615()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, 2032.618026572073);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1616()  throws Throwable  {
      double double0 = FastMath.max(0.0, 1009.41073665689);
      assertEquals(1009.41073665689, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1617()  throws Throwable  {
      double double0 = FastMath.max(1408.0, 709.782712893384);
      assertEquals(1408.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1618()  throws Throwable  {
      double double0 = FastMath.max((-8.751026775025784), (-8.751026775025784));
      assertEquals((-8.751026775025784), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1619()  throws Throwable  {
      float float0 = FastMath.max(1026.7444F, 1026.7444F);
      assertEquals(1026.7444F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1620()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, 1.0F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1621()  throws Throwable  {
      float float0 = FastMath.max((-716.637F), 590.0F);
      assertEquals(590.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1622()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, (-1.4E-45F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1623()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1624()  throws Throwable  {
      long long0 = FastMath.max((long) (-1), (long) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test_1625()  throws Throwable  {
      long long0 = FastMath.max((-109L), (-3358L));
      assertEquals((-109L), long0);
  }

  @Test(timeout = 4000)
  public void test_1626()  throws Throwable  {
      int int0 = FastMath.max((-127), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1627()  throws Throwable  {
      int int0 = FastMath.max(14, (-2315));
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test_1628()  throws Throwable  {
      double double0 = FastMath.min(-0.0, 0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1629()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1630()  throws Throwable  {
      double double0 = FastMath.min(Double.NEGATIVE_INFINITY, 0.5);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1631()  throws Throwable  {
      double double0 = FastMath.min(3.141592653589793, 1.2246467991473532E-16);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1632()  throws Throwable  {
      double double0 = FastMath.min(725.25072, 725.25072);
      assertEquals(725.25072, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1633()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1634()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1635()  throws Throwable  {
      float float0 = FastMath.min((float) (-715), 1223.7112F);
      assertEquals((-715.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1636()  throws Throwable  {
      float float0 = FastMath.min((-1.4E-45F), (-2672.6172F));
      assertEquals((-2672.6172F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1637()  throws Throwable  {
      long long0 = FastMath.min(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1638()  throws Throwable  {
      long long0 = FastMath.min((long) 5091, (long) (-1045));
      assertEquals((-1045L), long0);
  }

  @Test(timeout = 4000)
  public void test_1639()  throws Throwable  {
      int int0 = FastMath.min((-2271), 1050);
      assertEquals((-2271), int0);
  }

  @Test(timeout = 4000)
  public void test_1640()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1641()  throws Throwable  {
      double double0 = FastMath.rint(3592.9625);
      assertEquals(3593.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1642()  throws Throwable  {
      double double0 = FastMath.rint((-2.462631860370667E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1643()  throws Throwable  {
      double double0 = FastMath.ceil((-0.7894284547624598));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1644()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1645()  throws Throwable  {
      double double0 = FastMath.ceil(2.2250738585072014E-308);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1646()  throws Throwable  {
      double double0 = FastMath.rint(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1647()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1021.71423F), (-276.0));
      assertEquals((-1021.7142F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1648()  throws Throwable  {
      float float0 = FastMath.nextAfter(1.4E-45F, (-1.0));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1649()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-639.3864776));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1650()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 0);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1651()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1652()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 237.64164128493354);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1653()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1.4E-45F), (double) (-1.4E-45F));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1654()  throws Throwable  {
      float float0 = FastMath.nextAfter((-1258.5011F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1655()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1656()  throws Throwable  {
      double double0 = FastMath.nextUp(0.998531);
      assertEquals(0.9985310000000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1657()  throws Throwable  {
      double double0 = FastMath.nextAfter(1739.3870684273472, 101.830897);
      assertEquals(1739.387068427347, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1658()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-2048.9));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1659()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0035935355101301704);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1660()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1661()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1662()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1663()  throws Throwable  {
      float float0 = FastMath.scalb((float) 174, 174);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1664()  throws Throwable  {
      float float0 = FastMath.scalb(0.4847831F, 128);
      assertEquals(1.6496315E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1665()  throws Throwable  {
      float float0 = FastMath.scalb((float) 8, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1666()  throws Throwable  {
      float float0 = FastMath.scalb((-0.1930033F), (-127));
      assertEquals((-1.134372E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1667()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), (-127));
      assertEquals((-5.877472E-39F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1668()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-277), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1669()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1670()  throws Throwable  {
      float float0 = FastMath.scalb((float) 3993, 3993);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1671()  throws Throwable  {
      float float0 = FastMath.scalb((-46.9F), 3248);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1672()  throws Throwable  {
      float float0 = FastMath.scalb((float) 128, (-1088));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1673()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-740), (-740));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1674()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 1375);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1675()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, 8388607);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1676()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 125);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1677()  throws Throwable  {
      float float0 = FastMath.scalb((-1.4E-45F), 268);
      assertEquals((-6.64614E35F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1678()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-695983090));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1679()  throws Throwable  {
      double double0 = FastMath.scalb(2.854978560542175E-229, 1024);
      assertEquals(5.1323753584657647E79, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1680()  throws Throwable  {
      double double0 = FastMath.scalb(4.9E-324, 1110);
      assertEquals(6.8719476736E10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1681()  throws Throwable  {
      double double0 = FastMath.scalb((-707.5), (-1793));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1682()  throws Throwable  {
      double double0 = FastMath.scalb((-3.433389342593549E-8), (-1023));
      assertEquals((-3.81977245E-316), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1683()  throws Throwable  {
      double double0 = FastMath.scalb((-8.751026775025784), (-1023));
      assertEquals((-9.735840456103226E-308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1684()  throws Throwable  {
      double double0 = FastMath.scalb((-1113.07), 2145737738);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1685()  throws Throwable  {
      double double0 = FastMath.scalb(0.3170322775840759, 8388607);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1686()  throws Throwable  {
      double double0 = FastMath.scalb(7.989378677301346E-301, (-2855));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1687()  throws Throwable  {
      double double0 = FastMath.hypot(0.0F, 0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1688()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 2628);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1689()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 3997);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1690()  throws Throwable  {
      double double0 = FastMath.scalb((-1148.66), 1094);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1691()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2109), (-2109));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1692()  throws Throwable  {
      float float0 = FastMath.ulp(Float.POSITIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1693()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1694()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1695()  throws Throwable  {
      double double0 = FastMath.abs((-0.2499999997677497));
      assertEquals(0.2499999997677497, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1696()  throws Throwable  {
      float float0 = FastMath.abs(-0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1697()  throws Throwable  {
      float float0 = FastMath.ulp(2975.066F);
      assertEquals(2.4414062E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1698()  throws Throwable  {
      float float0 = FastMath.ulp(1271.8192F);
      assertEquals(1.2207031E-4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1699()  throws Throwable  {
      long long0 = FastMath.abs((-3639L));
      assertEquals(3639L, long0);
  }

  @Test(timeout = 4000)
  public void test_1700()  throws Throwable  {
      long long0 = FastMath.abs((long) 265);
      assertEquals(265L, long0);
  }

  @Test(timeout = 4000)
  public void test_1701()  throws Throwable  {
      int int0 = FastMath.abs((-2041335497));
      assertEquals(2041335497, int0);
  }

  @Test(timeout = 4000)
  public void test_1702()  throws Throwable  {
      int int0 = FastMath.abs(2127961069);
      assertEquals(2127961069, int0);
  }

  @Test(timeout = 4000)
  public void test_1703()  throws Throwable  {
      double double0 = FastMath.toDegrees(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1704()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1705()  throws Throwable  {
      double double0 = FastMath.toRadians(1.0);
      assertEquals(0.017453292519943295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1706()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1707()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1708()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1709()  throws Throwable  {
      double double0 = FastMath.cbrt((-4.9E-324));
      assertEquals((-1.7031839360032603E-108), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1710()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1711()  throws Throwable  {
      double double0 = FastMath.cbrt(235.991754648833);
      assertEquals(6.179674635845431, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1712()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1713()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1714()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1715()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1716()  throws Throwable  {
      double double0 = FastMath.acos((-127));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1717()  throws Throwable  {
      double double0 = FastMath.acos(1408.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1718()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1719()  throws Throwable  {
      double double0 = FastMath.asin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1720()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1721()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1722()  throws Throwable  {
      double double0 = FastMath.asin((-1170447880));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1723()  throws Throwable  {
      double double0 = FastMath.asin(2.0598974227905273);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1724()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1725()  throws Throwable  {
      double double0 = FastMath.atan2((-1.4672600326020399E299), 6.1694117899971836E-201);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1726()  throws Throwable  {
      double double0 = FastMath.atan2(1.0, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1727()  throws Throwable  {
      double double0 = FastMath.atan2((-1.4672600326020399E299), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1728()  throws Throwable  {
      double double0 = FastMath.atan2((-4.503599627370496E15), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1729()  throws Throwable  {
      double double0 = FastMath.atan2(1.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1730()  throws Throwable  {
      double double0 = FastMath.atan2(585.0294156007319, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1731()  throws Throwable  {
      double double0 = FastMath.atan2((-721.60468723974), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1732()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-4.503599627370496E15));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1733()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1734()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1735()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, 1361.0680691226);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1736()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1737()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1738()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1739()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1.4672600326020399E299));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1740()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, (-2720.479995));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1741()  throws Throwable  {
      double double0 = FastMath.atan2(472.7684179585, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1742()  throws Throwable  {
      double double0 = FastMath.asin((-2.3580462372762525E-230));
      assertEquals((-2.3580462372762525E-230), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1743()  throws Throwable  {
      double double0 = FastMath.atan2(1.7578073785142153E246, (-2.3580462372762525E-230));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1744()  throws Throwable  {
      double double0 = FastMath.atan2(4.9E-324, 600.895881);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1745()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-1573.46208));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1746()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1747()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1748()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1749()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1750()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1751()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1752()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1753()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1754()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1755()  throws Throwable  {
      double double0 = FastMath.sin((-4.503599627370496E15));
      assertEquals((-0.8742173026236351), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1756()  throws Throwable  {
      double double0 = FastMath.sin(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1757()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1758()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1759()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1760()  throws Throwable  {
      double double0 = FastMath.sin((-12.889353629140434));
      assertEquals((-0.3173967401348246), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1761()  throws Throwable  {
      double double0 = FastMath.cos(8.467761378458806E206);
      assertEquals(0.8907888502390936, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1762()  throws Throwable  {
      double double0 = FastMath.tan(1.633123935319537E16);
      assertEquals(3.370587556518889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1763()  throws Throwable  {
      double double0 = FastMath.tan((-2.738246981762776E132));
      assertEquals(0.48901696376372694, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1764()  throws Throwable  {
      double double0 = FastMath.tan((-1.8472516879728875E59));
      assertEquals(0.6691012972367529, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1765()  throws Throwable  {
      double double0 = FastMath.cos((-3.732266217624991E251));
      assertEquals(0.8648952600391839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1766()  throws Throwable  {
      double double0 = FastMath.cos(8388593);
      assertEquals(0.9661378758758488, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1767()  throws Throwable  {
      double double0 = FastMath.tan((-3.4028235E38F));
      assertEquals(0.6117979498342481, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1768()  throws Throwable  {
      double double0 = FastMath.tan((-2.5857668567479893E-8));
      assertEquals((-2.58576685674799E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1769()  throws Throwable  {
      double double0 = FastMath.sin(9.755392680573412E-9);
      assertEquals(9.755392680573412E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1770()  throws Throwable  {
      double double0 = FastMath.pow(548.33, (-923));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1771()  throws Throwable  {
      double double0 = FastMath.pow(0.15, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1772()  throws Throwable  {
      double double0 = FastMath.pow(2809.06883, 856);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1773()  throws Throwable  {
      double double0 = FastMath.pow(1178.40122172486, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1774()  throws Throwable  {
      double double0 = FastMath.pow((-1.172506154034636E-4), (-20.0));
      assertEquals(4.146650030200583E78, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1775()  throws Throwable  {
      double double0 = FastMath.pow((-709.782712893384), (-709.782712893384));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1776()  throws Throwable  {
      double double0 = FastMath.pow((-306.02798607), (-1.4672600326020399E299));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1777()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1023), 3.416324322370112E105);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1778()  throws Throwable  {
      double double0 = FastMath.pow((-941.0706), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1779()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1.0F), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1780()  throws Throwable  {
      double double0 = FastMath.pow(2.2250738585072014E-308, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1781()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 3293);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1782()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 20.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1783()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.17044788E9));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1784()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1785()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 19.623811585946324);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1786()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1787()  throws Throwable  {
      double double0 = FastMath.pow(0.13108077428519344, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1788()  throws Throwable  {
      double double0 = FastMath.pow(8.0, (double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1789()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-709.782712893384));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1790()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 1817.34499);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1791()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1068.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1792()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1793()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-3.35137581974451E-8));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1794()  throws Throwable  {
      double double0 = FastMath.pow(0.0, (-709.782712893384));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1795()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 357.0087568);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1796()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-0.7894284547624598));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1797()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1798()  throws Throwable  {
      double double0 = FastMath.log10((-117.766287));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1799()  throws Throwable  {
      double double0 = FastMath.log1p(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1800()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1801()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1802()  throws Throwable  {
      double double0 = FastMath.acosh(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1803()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1804()  throws Throwable  {
      double double0 = FastMath.log1p(0.19999954104423523);
      assertEquals(0.18232117433074418, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1805()  throws Throwable  {
      double double0 = FastMath.log1p((-0.12349580912475928));
      assertEquals((-0.1318137932572179), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1806()  throws Throwable  {
      double double0 = FastMath.log(0.0, 4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1807()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1808()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1809()  throws Throwable  {
      double double0 = FastMath.log1p((-2054.818067157));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1810()  throws Throwable  {
      double double0 = FastMath.acosh((-0.7894284547624598));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1811()  throws Throwable  {
      double double0 = FastMath.expm1((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1812()  throws Throwable  {
      double double0 = FastMath.expm1(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1813()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1814()  throws Throwable  {
      double double0 = FastMath.pow(2.1076716069929933E-95, 2.1076716069929933E-95);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1815()  throws Throwable  {
      double double0 = FastMath.expm1(1.073741824E9);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1816()  throws Throwable  {
      double double0 = FastMath.exp((-709.1148813850002));
      assertEquals(1.0847258227860114E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1817()  throws Throwable  {
      double double0 = FastMath.exp((-715));
      assertEquals(3.016097934134E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1818()  throws Throwable  {
      double double0 = FastMath.exp((-1360.7976455298372));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1819()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1820()  throws Throwable  {
      float float0 = FastMath.signum((-3.4028235E38F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1821()  throws Throwable  {
      float float0 = FastMath.signum(1.4E-45F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1822()  throws Throwable  {
      double double0 = FastMath.signum(903.2929104346966);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1823()  throws Throwable  {
      double double0 = FastMath.signum((-108.283835));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1824()  throws Throwable  {
      double double0 = FastMath.signum((double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1825()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333333333);
      assertEquals(0.008333526242605851, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1826()  throws Throwable  {
      double double0 = FastMath.atanh((-1490.81));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1827()  throws Throwable  {
      double double0 = FastMath.asinh(0.04626845502245073);
      assertEquals(0.046251962552607426, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1828()  throws Throwable  {
      double double0 = FastMath.tanh((-4.595250028278979E-113));
      assertEquals((-4.595250028278979E-113), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1829()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1830()  throws Throwable  {
      double double0 = FastMath.tanh(1817.702474630248);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1831()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1832()  throws Throwable  {
      double double0 = FastMath.tanh((-2470.69));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1833()  throws Throwable  {
      double double0 = FastMath.sinh(2.2250738585072014E-308);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1834()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1835()  throws Throwable  {
      double double0 = FastMath.sinh((-2225.9474));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1836()  throws Throwable  {
      double double0 = FastMath.sinh(683.786907);
      assertEquals(4.61158812434247E296, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1837()  throws Throwable  {
      double double0 = FastMath.sinh(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1838()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1839()  throws Throwable  {
      double double0 = FastMath.sinh((-108.283835));
      assertEquals((-5.321597507881883E46), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1840()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1841()  throws Throwable  {
      double double0 = FastMath.cosh(1716.2112423);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1842()  throws Throwable  {
      double double0 = FastMath.cosh(156.20655);
      assertEquals(3.4563101480884563E67, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1843()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1844()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1845()  throws Throwable  {
      double double0 = FastMath.acos(0.5);
      assertEquals(1.0471975511965979, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1846()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1847()  throws Throwable  {
      double double0 = FastMath.cos((-751.6F));
      assertEquals((-0.725296476736036), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1848()  throws Throwable  {
      FastMath.main((String[]) null);
      // Undeclared exception!
      FastMath.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test_1849()  throws Throwable  {
      double double0 = FastMath.cosh((-207.00435831302755));
      assertEquals(3.979427067312384E89, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1850()  throws Throwable  {
      double double0 = FastMath.atan(1681.691763);
      assertEquals(1.570201687572575, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1851()  throws Throwable  {
      double double0 = FastMath.acosh(1365.43766392);
      assertEquals(7.9123773356057, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1852()  throws Throwable  {
      double double0 = FastMath.acos((-0.62321365F));
      assertEquals(2.2436415892643553, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1853()  throws Throwable  {
      double double0 = FastMath.expm1((-2909.33637));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1854()  throws Throwable  {
      int int0 = FastMath.round((-1.0F));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_1855()  throws Throwable  {
      long long0 = FastMath.round(2.718281828459045);
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test_1856()  throws Throwable  {
      double double0 = FastMath.cos((-3809.530818));
      assertEquals((-0.3426399577516913), double0, 0.01);
  }
@Test(timeout = 4000)
  public void test_1857()  throws Throwable  {
      FastMath.copySign((-1.0F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1858()  throws Throwable  {
      FastMath.copySign(0.0F, (-1421.0F));
  }

  @Test(timeout = 4000)
  public void test_1859()  throws Throwable  {
      FastMath.copySign((-775.821386), 0.0);
  }

  @Test(timeout = 4000)
  public void test_1860()  throws Throwable  {
      FastMath.copySign(0.0, (-680.0));
  }

  @Test(timeout = 4000)
  public void test_1861()  throws Throwable  {
      FastMath.hypot(1.1921056801463227E-8, (-1.0000001F));
  }

  @Test(timeout = 4000)
  public void test_1862()  throws Throwable  {
      FastMath.hypot((-1.1752011936438014), 1.1765332726757802E-8);
  }

  @Test(timeout = 4000)
  public void test_1863()  throws Throwable  {
      FastMath.max((-794), 1065353216);
  }

  @Test(timeout = 4000)
  public void test_1864()  throws Throwable  {
      FastMath.min((-1337L), 0L);
  }

  @Test(timeout = 4000)
  public void test_1865()  throws Throwable  {
      FastMath.min((-1540), 2127);
  }

  @Test(timeout = 4000)
  public void test_1866()  throws Throwable  {
      FastMath.rint((-2900.1712848901725));
  }

  @Test(timeout = 4000)
  public void test_1867()  throws Throwable  {
      FastMath.rint(1.5);
  }

  @Test(timeout = 4000)
  public void test_1868()  throws Throwable  {
      FastMath.ceil((-3848.3601));
  }

  @Test(timeout = 4000)
  public void test_1869()  throws Throwable  {
      FastMath.floor((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_1870()  throws Throwable  {
      FastMath.floor(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_1871()  throws Throwable  {
      FastMath.scalb((-2690.0369F), 276);
  }

  @Test(timeout = 4000)
  public void test_1872()  throws Throwable  {
      FastMath.scalb((-1.0F), (-277));
  }

  @Test(timeout = 4000)
  public void test_1873()  throws Throwable  {
      FastMath.scalb(1.5707963267948966, (-1023));
  }

  @Test(timeout = 4000)
  public void test_1874()  throws Throwable  {
      FastMath.scalb(1241.0, 2097);
  }

  @Test(timeout = 4000)
  public void test_1875()  throws Throwable  {
      FastMath.scalb(0.5387523174285889, (-2098));
  }

  @Test(timeout = 4000)
  public void test_1876()  throws Throwable  {
      FastMath.scalb((-1.002346866932645), 1024);
  }

  @Test(timeout = 4000)
  public void test_1877()  throws Throwable  {
      FastMath.ulp((-23.059614F));
  }

  @Test(timeout = 4000)
  public void test_1878()  throws Throwable  {
      FastMath.ulp(1.774E-321);
  }

  @Test(timeout = 4000)
  public void test_1879()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_1880()  throws Throwable  {
      FastMath.abs(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1881()  throws Throwable  {
      FastMath.asin(0.5);
  }

  @Test(timeout = 4000)
  public void test_1882()  throws Throwable  {
      FastMath.atan2(0.0, 70.52877936551255);
  }

  @Test(timeout = 4000)
  public void test_1883()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_1884()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1885()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1886()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_1887()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1888()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_1889()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_1890()  throws Throwable  {
      FastMath.sin((-8.0E298));
  }

  @Test(timeout = 4000)
  public void test_1891()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_1892()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_1893()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_1894()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_1895()  throws Throwable  {
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1896()  throws Throwable  {
      FastMath.expm1((-746.51068));
  }

  @Test(timeout = 4000)
  public void test_1897()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_1898()  throws Throwable  {
      FastMath.atanh(0.15);
  }

  @Test(timeout = 4000)
  public void test_1899()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_1900()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_1901()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1902()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1903()  throws Throwable  {
      FastMath.sinh(0.25);
  }

  @Test(timeout = 4000)
  public void test_1904()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1905()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1906()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1907()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1908()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_1909()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_1910()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_1911()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_1912()  throws Throwable  {
      FastMath.atan2(5.0614674548127384E-8, 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_1913()  throws Throwable  {
      FastMath.toDegrees((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_1914()  throws Throwable  {
      FastMath.toRadians((-23.059614F));
  }

  @Test(timeout = 4000)
  public void test_1915()  throws Throwable  {
      FastMath.sqrt(-0.0);
  }

  @Test(timeout = 4000)
  public void test_1916()  throws Throwable  {
      FastMath.signum((double) 0L);
  }

  @Test(timeout = 4000)
  public void test_1917()  throws Throwable  {
      FastMath.round(0.0F);
  }

  @Test(timeout = 4000)
  public void test_1918()  throws Throwable  {
      FastMath.round((float) (-1425));
  }

  @Test(timeout = 4000)
  public void test_1919()  throws Throwable  {
      FastMath.round(0.008333333333333333);
  }

  @Test(timeout = 4000)
  public void test_1920()  throws Throwable  {
      FastMath.round(2276.9426219);
  }

  @Test(timeout = 4000)
  public void test_1921()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_1922()  throws Throwable  {
      FastMath.nextAfter(0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1923()  throws Throwable  {
      FastMath.nextAfter(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_1924()  throws Throwable  {
      FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_1925()  throws Throwable  {
      FastMath.min((long) 3449, (-1L));
  }

  @Test(timeout = 4000)
  public void test_1926()  throws Throwable  {
      FastMath.min(110, 110);
  }

  @Test(timeout = 4000)
  public void test_1927()  throws Throwable  {
      FastMath.min((-3409.4126F), (-3409.4126F));
  }

  @Test(timeout = 4000)
  public void test_1928()  throws Throwable  {
      FastMath.max((-2338L), (-1590L));
  }

  @Test(timeout = 4000)
  public void test_1929()  throws Throwable  {
      FastMath.max(0, (-38));
  }

  @Test(timeout = 4000)
  public void test_1930()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_1931()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_1932()  throws Throwable  {
      FastMath.log((double) 0.0F, 2.0);
  }

  @Test(timeout = 4000)
  public void test_1933()  throws Throwable  {
      FastMath.log((double) 1.0F);
  }

  @Test(timeout = 4000)
  public void test_1934()  throws Throwable  {
      FastMath.log(1188.637939453125);
  }

  @Test(timeout = 4000)
  public void test_1935()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_1936()  throws Throwable  {
      FastMath.getExponent(939.331F);
  }

  @Test(timeout = 4000)
  public void test_1937()  throws Throwable  {
      FastMath.getExponent(1.2903103828430176);
  }

  @Test(timeout = 4000)
  public void test_1938()  throws Throwable  {
      FastMath.getExponent((double) 504);
  }

  @Test(timeout = 4000)
  public void test_1939()  throws Throwable  {
      FastMath.copySign(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_1940()  throws Throwable  {
      FastMath.copySign(0.0, 1468.6542299999999);
  }

  @Test(timeout = 4000)
  public void test_1941()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1942()  throws Throwable  {
      FastMath.atan((-3592.355692809));
  }

  @Test(timeout = 4000)
  public void test_1943()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_1944()  throws Throwable  {
      FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test_1945()  throws Throwable  {
      FastMath.acosh(3415.9322337731);
  }

  @Test(timeout = 4000)
  public void test_1946()  throws Throwable  {
      FastMath.acosh((-2145195750));
  }

  @Test(timeout = 4000)
  public void test_1947()  throws Throwable  {
      FastMath.abs(0L);
  }

  @Test(timeout = 4000)
  public void test_1948()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_1949()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_1950()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1951()  throws Throwable  {
      FastMath.IEEEremainder(0.1229778528213501, 1569.0);
  }

  @Test(timeout = 4000)
  public void test_1952()  throws Throwable  {
      FastMath.IEEEremainder(1158.907612854, (-325.6592131));
  }

  @Test(timeout = 4000)
  public void test_1953()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(1862.8, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_1954()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NaN, 20.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1955()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1956()  throws Throwable  {
      double double0 = FastMath.floor((-5110.0));
      assertEquals((-5110.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1957()  throws Throwable  {
      double double0 = FastMath.floor((-3409.4126F));
      assertEquals((-3410.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1958()  throws Throwable  {
      double double0 = FastMath.floor((-1.7976931348623157E308));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1959()  throws Throwable  {
      float float0 = FastMath.nextAfter((-356.82895F), (-671.806711738628));
      assertEquals((-356.82898F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1960()  throws Throwable  {
      float float0 = FastMath.nextAfter((-4026.9F), (double) (-157));
      assertEquals((-4026.8997F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1961()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, 1325.5533302102772);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1962()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 2965.468946378634);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1963()  throws Throwable  {
      double double0 = FastMath.nextAfter((-116.2), (-2361.634758569903));
      assertEquals((-116.20000000000002), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1964()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2900.171284890173), 1.5707963267948966);
      assertEquals((-2900.1712848901725), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1965()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 2064.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1966()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 1.5);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1967()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-2.2250738585072014E-308));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1968()  throws Throwable  {
      double double0 = FastMath.scalb(0.0, 1314);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1969()  throws Throwable  {
      double double0 = FastMath.scalb(1.5707963267948966, 32);
      assertEquals(6.746518852261009E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1970()  throws Throwable  {
      double double0 = FastMath.abs((-1352.588));
      assertEquals(1352.588, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1971()  throws Throwable  {
      float float0 = FastMath.abs((-2447.2F));
      assertEquals(2447.2F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1972()  throws Throwable  {
      double double0 = FastMath.pow(0.19454771280288696, (-1.7976931348623157E308));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1973()  throws Throwable  {
      int int0 = FastMath.getExponent(0.0);
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test_1974()  throws Throwable  {
      double double0 = FastMath.sqrt(0.9315965175628662);
      assertEquals(0.9651924769510308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1975()  throws Throwable  {
      float float0 = FastMath.copySign((-1.0F), 920.9921F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1976()  throws Throwable  {
      float float0 = FastMath.copySign(2341.6077F, (-80.99999F));
      assertEquals((-2341.6077F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1977()  throws Throwable  {
      float float0 = FastMath.copySign(920.9921F, 920.9921F);
      assertEquals(920.9921F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1978()  throws Throwable  {
      float float0 = FastMath.copySign((-5658.092F), (-5658.092F));
      assertEquals((-5658.092F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1979()  throws Throwable  {
      double double0 = FastMath.copySign((-20.0), 896.037);
      assertEquals(20.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1980()  throws Throwable  {
      double double0 = FastMath.copySign(0.031, (double) -0.0F);
      assertEquals((-0.031), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1981()  throws Throwable  {
      double double0 = FastMath.copySign((-1062.0), (-1062.0));
      assertEquals((-1062.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1982()  throws Throwable  {
      double double0 = FastMath.hypot((-3.5997360512765566E-9), 981.9326477889547);
      assertEquals(981.9326477889547, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1983()  throws Throwable  {
      double double0 = FastMath.hypot(1.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1984()  throws Throwable  {
      double double0 = FastMath.hypot(1325.5533302102772, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1985()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, 1.0426398861088704E-16);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1986()  throws Throwable  {
      double double0 = FastMath.hypot((-2217.656567093291), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1987()  throws Throwable  {
      double double0 = FastMath.hypot(Double.POSITIVE_INFINITY, 2.718281828459045);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1988()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1989()  throws Throwable  {
      double double0 = FastMath.max(1325.5533302102772, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1990()  throws Throwable  {
      double double0 = FastMath.max((double) Float.NEGATIVE_INFINITY, 1542.612535156212);
      assertEquals(1542.612535156212, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1991()  throws Throwable  {
      double double0 = FastMath.max((-400.705479), (-1742.1));
      assertEquals((-400.705479), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1992()  throws Throwable  {
      double double0 = FastMath.max((-4.785516919589518E-19), (-4.785516919589518E-19));
      assertEquals((-4.785516919589518E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_1993()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1994()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1995()  throws Throwable  {
      float float0 = FastMath.max(Float.NEGATIVE_INFINITY, (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1996()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, (-1.0F));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1997()  throws Throwable  {
      float float0 = FastMath.max(1279.0F, 1279.0F);
      assertEquals(1279.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_1998()  throws Throwable  {
      long long0 = FastMath.max(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_1999()  throws Throwable  {
      long long0 = FastMath.max(3832L, (-1L));
      assertEquals(3832L, long0);
  }

  @Test(timeout = 4000)
  public void test_2000()  throws Throwable  {
      int int0 = FastMath.max((-251), (-251));
      assertEquals((-251), int0);
  }

  @Test(timeout = 4000)
  public void test_2001()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2002()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, 1703.7197948612577);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2003()  throws Throwable  {
      double double0 = FastMath.min(961.79225, 961.79225);
      assertEquals(961.79225, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2004()  throws Throwable  {
      double double0 = FastMath.min((-1852.5321), (-2424.5078));
      assertEquals((-2424.5078), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2005()  throws Throwable  {
      double double0 = FastMath.min((-120.56606539848057), 1339.6418660795248);
      assertEquals((-120.56606539848057), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2006()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2007()  throws Throwable  {
      float float0 = FastMath.min(0.0F, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2008()  throws Throwable  {
      float float0 = FastMath.min(682.192F, 1529.0F);
      assertEquals(682.192F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2009()  throws Throwable  {
      float float0 = FastMath.min(1373.341F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2010()  throws Throwable  {
      long long0 = FastMath.min(4607182418800017404L, 4607182418800017404L);
      assertEquals(4607182418800017404L, long0);
  }

  @Test(timeout = 4000)
  public void test_2011()  throws Throwable  {
      int int0 = FastMath.min(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_2012()  throws Throwable  {
      int int0 = FastMath.min(4, (-570));
      assertEquals((-570), int0);
  }

  @Test(timeout = 4000)
  public void test_2013()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2014()  throws Throwable  {
      double double0 = FastMath.rint(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2015()  throws Throwable  {
      double double0 = FastMath.rint((-1.4E-45F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2016()  throws Throwable  {
      double double0 = FastMath.rint(36.691845F);
      assertEquals(37.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2017()  throws Throwable  {
      double double0 = FastMath.rint((-605.617554613291));
      assertEquals((-606.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2018()  throws Throwable  {
      double double0 = FastMath.ceil((-4.785516919589518E-19));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2019()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2020()  throws Throwable  {
      double double0 = FastMath.ceil(0.16666666666666666);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2021()  throws Throwable  {
      double double0 = FastMath.ceil((-20.0));
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2022()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2023()  throws Throwable  {
      float float0 = FastMath.nextUp(1611.7F);
      assertEquals(1611.7001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2024()  throws Throwable  {
      float float0 = FastMath.nextAfter(264.4F, (-2.2250738585072014E-308));
      assertEquals(264.39996F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2025()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, (-1.0));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2026()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, (-1.0));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2027()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2028()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2029()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-2032.5702833144583));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2030()  throws Throwable  {
      double double0 = FastMath.nextUp(1324.864197463824);
      assertEquals(1324.8641974638242, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2031()  throws Throwable  {
      double double0 = FastMath.nextAfter(5.8377876767612725E-8, 0.0);
      assertEquals(5.837787676761272E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2032()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, (-10.364417006230203));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2033()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-633.3024020740875));
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2034()  throws Throwable  {
      double double0 = FastMath.nextUp(Double.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2035()  throws Throwable  {
      double double0 = FastMath.nextAfter((-955.2), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2036()  throws Throwable  {
      float float0 = FastMath.scalb((-7.6293945E-6F), 128);
      assertEquals((-2.5961484E33F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2037()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 271);
      assertEquals(5.316912E36F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2038()  throws Throwable  {
      float float0 = FastMath.scalb(1562.6F, (-265));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2039()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-157), (-157));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2040()  throws Throwable  {
      float float0 = FastMath.scalb(1.0F, (-127));
      assertEquals(5.877472E-39F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2041()  throws Throwable  {
      float float0 = FastMath.scalb(432.54135F, (-127));
      assertEquals(2.5422496E-36F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2042()  throws Throwable  {
      float float0 = FastMath.scalb((float) 271, 2258);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2043()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2145754595, 258);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2044()  throws Throwable  {
      float float0 = FastMath.scalb(3141.748F, (-1082684152));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2045()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 298);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2046()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, (-399));
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2047()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-6423151));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2048()  throws Throwable  {
      float float0 = FastMath.scalb((-922.7207F), 1430);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2049()  throws Throwable  {
      float float0 = FastMath.scalb((-1.0F), 27);
      assertEquals((-1.34217728E8F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2050()  throws Throwable  {
      float float0 = FastMath.scalb((-566.1658F), (-1073741760));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2051()  throws Throwable  {
      double double0 = FastMath.scalb(0.15, 1025);
      assertEquals(5.393079404586948E307, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2052()  throws Throwable  {
      double double0 = FastMath.scalb(1.774E-321, 1487);
      assertEquals(7.594210969462376E126, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2053()  throws Throwable  {
      double double0 = FastMath.scalb((-24.49174387429737), (-1279));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2054()  throws Throwable  {
      double double0 = FastMath.scalb(0.5281101235237176, (-1023));
      assertEquals(5.875420151328167E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2055()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2056()  throws Throwable  {
      double double0 = FastMath.scalb(1.0337605476379395, Integer.MAX_VALUE);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2057()  throws Throwable  {
      double double0 = FastMath.scalb((-4384.5896940946), 2846);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2058()  throws Throwable  {
      double double0 = FastMath.scalb(2.0, (-2147482996));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2059()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2060()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.NEGATIVE_INFINITY, (-2147482996));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2061()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 2142000077);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2062()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2147482996), (-2147482996));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2063()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2064()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2065()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2066()  throws Throwable  {
      float float0 = FastMath.abs(1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2067()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2068()  throws Throwable  {
      long long0 = FastMath.abs((-81L));
      assertEquals(81L, long0);
  }

  @Test(timeout = 4000)
  public void test_2069()  throws Throwable  {
      long long0 = FastMath.abs(4368491638549381120L);
      assertEquals(4368491638549381120L, long0);
  }

  @Test(timeout = 4000)
  public void test_2070()  throws Throwable  {
      int int0 = FastMath.abs((-1027));
      assertEquals(1027, int0);
  }

  @Test(timeout = 4000)
  public void test_2071()  throws Throwable  {
      int int0 = FastMath.abs(3436);
      assertEquals(3436, int0);
  }

  @Test(timeout = 4000)
  public void test_2072()  throws Throwable  {
      double double0 = FastMath.toDegrees(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2073()  throws Throwable  {
      double double0 = FastMath.toDegrees(1335.2049814087861);
      assertEquals(76501.610219567, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2074()  throws Throwable  {
      double double0 = FastMath.toDegrees(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2075()  throws Throwable  {
      double double0 = FastMath.toRadians(1.0E-323);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2076()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2077()  throws Throwable  {
      double double0 = FastMath.toRadians(3.141592653589793);
      assertEquals(0.05483113556160755, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2078()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2079()  throws Throwable  {
      double double0 = FastMath.cbrt(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2080()  throws Throwable  {
      double double0 = FastMath.cbrt(1.774E-321);
      assertEquals(1.2104858073773302E-107, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2081()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2082()  throws Throwable  {
      double double0 = FastMath.cbrt((-774.297));
      assertEquals((-9.182674545015084), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2083()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2084()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2085()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2086()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2087()  throws Throwable  {
      double double0 = FastMath.acos((-3.4028235E38F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2088()  throws Throwable  {
      double double0 = FastMath.acos(1429.2916927968186);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2089()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2090()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2091()  throws Throwable  {
      double double0 = FastMath.asin((-1.0F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2092()  throws Throwable  {
      double double0 = FastMath.asin(1.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2093()  throws Throwable  {
      double double0 = FastMath.asin((-2022.804476716));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2094()  throws Throwable  {
      double double0 = FastMath.asin(1846.236636354);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2095()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2096()  throws Throwable  {
      double double0 = FastMath.atan2(2.2250738585072014E-308, 1335.2053558830705);
      assertEquals(1.6664656479267E-311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2097()  throws Throwable  {
      double double0 = FastMath.atan2(3.7224587081481774E-26, 0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2098()  throws Throwable  {
      double double0 = FastMath.atan2((-396.9322055), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2099()  throws Throwable  {
      double double0 = FastMath.atan2((-3.4028235E38F), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2100()  throws Throwable  {
      double double0 = FastMath.atan2(2512.51, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2101()  throws Throwable  {
      double double0 = FastMath.atan2((-24.503620438277803), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2102()  throws Throwable  {
      double double0 = FastMath.atan2(113.11392869, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2103()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-3.4028235E38F));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2104()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2105()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2106()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 1335.2049814087861);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2107()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2108()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-3088.6032));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2109()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2110()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2111()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2112()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2113()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2114()  throws Throwable  {
      double double0 = FastMath.atan2((-3.4028235E38F), (-3.4028235E38F));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2115()  throws Throwable  {
      double double0 = FastMath.asin((-4.785516919589518E-19));
      assertEquals((-4.785516919589518E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2116()  throws Throwable  {
      double double0 = FastMath.atan2((-6.0749930313120616E156), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2117()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2118()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2119()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2120()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2121()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2122()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2123()  throws Throwable  {
      double double0 = FastMath.cos(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2124()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2125()  throws Throwable  {
      double double0 = FastMath.sin((-3028.0427618930166));
      assertEquals(0.4372658042328594, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2126()  throws Throwable  {
      double double0 = FastMath.sin(2146033131);
      assertEquals((-0.8522230623330966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2127()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2128()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2129()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2130()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2131()  throws Throwable  {
      double double0 = FastMath.sin((-931));
      assertEquals((-0.8859667583012527), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2132()  throws Throwable  {
      double double0 = FastMath.tan(9.75915904E8);
      assertEquals(1.6573535272390016, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2133()  throws Throwable  {
      double double0 = FastMath.cos(2.810922761760878E102);
      assertEquals((-0.7542974880488102), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2134()  throws Throwable  {
      double double0 = FastMath.cos((-1.6843492713373762E229));
      assertEquals((-0.7809859768728921), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2135()  throws Throwable  {
      double double0 = FastMath.cos(2.191579085869801E10);
      assertEquals(0.9047246025919853, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2136()  throws Throwable  {
      double double0 = FastMath.cos(1.7976931348623157E308);
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2137()  throws Throwable  {
      double double0 = FastMath.cos(1.0143022354947225E63);
      assertEquals(0.918796504205376, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2138()  throws Throwable  {
      double double0 = FastMath.tan((-4.785516919589518E-19));
      assertEquals((-4.785516919589518E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2139()  throws Throwable  {
      double double0 = FastMath.sin(6.034539636024073E-8);
      assertEquals(6.034539636024069E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2140()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2141()  throws Throwable  {
      double double0 = FastMath.pow((double) (-23.059614F), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2142()  throws Throwable  {
      double double0 = FastMath.pow((-4.785516919589518E-19), 932);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2143()  throws Throwable  {
      double double0 = FastMath.pow((-477.3096861), (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2144()  throws Throwable  {
      double double0 = FastMath.pow(8.446532344375812E-242, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2145()  throws Throwable  {
      double double0 = FastMath.pow((double) (-837.775F), (double) (-1.0F));
      assertEquals((-0.0011936378751555613), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2146()  throws Throwable  {
      double double0 = FastMath.pow((double) (-66L), (double) (-66L));
      assertEquals(8.130181747984103E-121, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2147()  throws Throwable  {
      double double0 = FastMath.pow((double) (-3409.4126F), 4.591031309199317E18);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2148()  throws Throwable  {
      double double0 = FastMath.pow((-2.356194490192345), (-2.356194490192345));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2149()  throws Throwable  {
      double double0 = FastMath.pow((-1.124848988733307E-10), (double) Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2150()  throws Throwable  {
      double double0 = FastMath.pow((double) 4607182418800017404L, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2151()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2152()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 4607182418800017404L);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2153()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1265.75);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2154()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2155()  throws Throwable  {
      double double0 = FastMath.pow(1207.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2156()  throws Throwable  {
      double double0 = FastMath.pow(1.0, Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2157()  throws Throwable  {
      double double0 = FastMath.pow(0.75, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2158()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 872.9349774679798);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2159()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2160()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (double) (-1.4E-45F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2161()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2162()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 2.718281828459045);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2163()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-2577.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2164()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-1.401298464324817E-45));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2165()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-1000517676));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2166()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2167()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 2.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2168()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-4818.83));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2169()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2170()  throws Throwable  {
      double double0 = FastMath.log1p((-1869.046));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2171()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2172()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2173()  throws Throwable  {
      double double0 = FastMath.log1p(1.2556045504583413);
      assertEquals(0.813418030353688, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2174()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2175()  throws Throwable  {
      double double0 = FastMath.asinh(0.25);
      assertEquals(0.24746646154726346, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2176()  throws Throwable  {
      double double0 = FastMath.log(1335.2049814087861, 0.7853981633974483);
      assertEquals((-0.03356535254464679), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2177()  throws Throwable  {
      double double0 = FastMath.log(4.9E-324);
      assertEquals((-744.4400719213812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2178()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2179()  throws Throwable  {
      double double0 = FastMath.asinh(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2180()  throws Throwable  {
      double double0 = FastMath.log10(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2181()  throws Throwable  {
      double double0 = FastMath.expm1((-1.735366061128156E-8));
      assertEquals((-1.7353660460706794E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2182()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2183()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2184()  throws Throwable  {
      double double0 = FastMath.expm1(1324.864197463824);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2185()  throws Throwable  {
      double double0 = FastMath.pow(2.718281828459045, (-709.6363584181));
      assertEquals(6.43939967150113E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2186()  throws Throwable  {
      double double0 = FastMath.exp((-738.556170773995));
      assertEquals(1.774E-321, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2187()  throws Throwable  {
      double double0 = FastMath.expm1((-836.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2188()  throws Throwable  {
      double double0 = FastMath.exp((-764.5769285587818));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2189()  throws Throwable  {
      float float0 = FastMath.signum(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2190()  throws Throwable  {
      float float0 = FastMath.signum((-2.028241E31F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2191()  throws Throwable  {
      float float0 = FastMath.signum(1625.203F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_2192()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2193()  throws Throwable  {
      double double0 = FastMath.signum((-1555.2));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2194()  throws Throwable  {
      double double0 = FastMath.signum(1997.06157051);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2195()  throws Throwable  {
      double double0 = FastMath.atanh(0.031);
      assertEquals(0.031009936063096846, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2196()  throws Throwable  {
      double double0 = FastMath.atanh(0.058823529411764705);
      assertEquals(0.05889151782819173, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2197()  throws Throwable  {
      double double0 = FastMath.atanh((-1.287101187097E-312));
      assertEquals((-1.287101187097E-312), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2198()  throws Throwable  {
      double double0 = FastMath.atanh(1325.5533302102772);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2199()  throws Throwable  {
      double double0 = FastMath.asinh((-0.031));
      assertEquals((-0.03099503697929222), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2200()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2201()  throws Throwable  {
      double double0 = FastMath.tanh((-1.2645600379949252E-7));
      assertEquals((-1.2645600379949186E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2202()  throws Throwable  {
      double double0 = FastMath.tanh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2203()  throws Throwable  {
      double double0 = FastMath.tanh(884.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2204()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2205()  throws Throwable  {
      double double0 = FastMath.tanh((-2308.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2206()  throws Throwable  {
      double double0 = FastMath.sinh(5.669184079525E-24);
      assertEquals(5.669184079525E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2207()  throws Throwable  {
      double double0 = FastMath.sinh(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2208()  throws Throwable  {
      double double0 = FastMath.sinh((-603.74));
      assertEquals((-7.941828576044184E261), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2209()  throws Throwable  {
      double double0 = FastMath.sinh(920.9921F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2210()  throws Throwable  {
      double double0 = FastMath.sinh(659.406074161357);
      assertEquals(1.1895682004377133E286, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2211()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2212()  throws Throwable  {
      double double0 = FastMath.sinh((-3.4028235E38F));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2213()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2214()  throws Throwable  {
      double double0 = FastMath.cosh((-664.67));
      assertEquals(2.2987052672624378E288, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2215()  throws Throwable  {
      double double0 = FastMath.cosh(445.7303177855);
      assertEquals(1.893160504547957E193, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2216()  throws Throwable  {
      double double0 = FastMath.cosh(1.6448897917725177E233);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2217()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2218()  throws Throwable  {
      double double0 = FastMath.atan2(1.4E-45F, (-8.0E298));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2219()  throws Throwable  {
      FastMath.random();
      double double0 = FastMath.random();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2220()  throws Throwable  {
      double double0 = FastMath.log(27.0, 27.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2221()  throws Throwable  {
      int int0 = FastMath.getExponent(-0.0F);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_2222()  throws Throwable  {
      String[] stringArray0 = new String[1];
      FastMath.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test_2223()  throws Throwable  {
      double double0 = FastMath.cosh((-3.4028235E38F));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2224()  throws Throwable  {
      double double0 = FastMath.IEEEremainder((-3.4028235E38F), (-3.4028235E38F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2225()  throws Throwable  {
      double double0 = FastMath.atan(0.19999954120254515);
      assertEquals(0.19739511869844295, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2226()  throws Throwable  {
      double double0 = FastMath.acosh(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2227()  throws Throwable  {
      double double0 = FastMath.acos((-4.785516919589518E-19));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_2228()  throws Throwable  {
      int int0 = FastMath.round(452.0F);
      assertEquals(452, int0);
  }

  @Test(timeout = 4000)
  public void test_2229()  throws Throwable  {
      long long0 = FastMath.round((-3659.6024));
      assertEquals((-3660L), long0);
  }
}
