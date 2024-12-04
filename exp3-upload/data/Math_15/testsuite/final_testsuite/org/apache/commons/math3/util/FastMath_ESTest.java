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
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FastMath_ESTest extends FastMath_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      FastMath.copySign((-422.96097F), Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      FastMath.copySign(486.0F, (float) 2785L);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      FastMath.copySign(0.0F, (-1008.7858F));
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      FastMath.copySign((-2.5676078228301587E-8), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      FastMath.hypot(1.1921056801463227E-8, 1.5874010519681994);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      FastMath.hypot(136.0F, (-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      FastMath.max((-937L), (-776L));
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      FastMath.min((-981), 2047);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      FastMath.rint(1211.78852853378);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      FastMath.rint(0.5);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      FastMath.ceil(1206.5760555625984);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      FastMath.scalb((-1.0F), (-127));
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      FastMath.scalb((-560.646F), 276);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      FastMath.scalb((float) 3, 128);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      FastMath.scalb(1.5680790372727451, (-1023));
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      FastMath.scalb(851.7, 2097);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      FastMath.scalb((-817.837), (-2098));
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      FastMath.scalb((-1.900947109027913E-7), 1024);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      FastMath.ulp((-2.5309316441333305E-8));
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      FastMath.cbrt((-1.287101187097E-312));
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      FastMath.atan2(0.0, 274.58108550876875);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      FastMath.cos((-1.5707963267948966));
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      FastMath.cos(-0.0F);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      FastMath.sin(3.5306502960727705E247);
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
      FastMath.expm1((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      FastMath.atanh(0.031);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      FastMath.atanh(0.087);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      FastMath.asinh(0.036);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      FastMath.tanh((-0.5));
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      FastMath.sinh((-0.25));
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      FastMath.toRadians(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      FastMath.toRadians((-2.2250738585072014E-308));
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      FastMath.toRadians(8.224104994005517);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      FastMath.toDegrees(0.2881702184677124);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      FastMath.sqrt(3.5335436928899096E-123);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FastMath.round(1038.2574F);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      FastMath.round(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      FastMath.round(-0.0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      FastMath.round(420.0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Random.setNextRandom((-2147483647));
      FastMath.random();
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      FastMath.pow((-2967.39), 3);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      FastMath.nextAfter((-1.4E-45F), 7.130134251490065E-128);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      FastMath.nextAfter(-0.0, -0.0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      FastMath.min((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      FastMath.min((-2630L), 845L);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      FastMath.min(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      FastMath.min((-605), (-1841));
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      FastMath.min((float) 10, (float) 10);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      FastMath.max(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      FastMath.max((-79), (-79));
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      FastMath.max((float) (-522), (float) (-522));
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      FastMath.max((-421.763026140904), (-4173.3959694268));
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      FastMath.log1p(0.0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      FastMath.log10(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      FastMath.log10(5.730477881659618E-9);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      FastMath.log(Double.POSITIVE_INFINITY, 2013.3639);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      FastMath.log((double) 1436, (double) 128.8F);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      FastMath.log(1.0183920005400422E109);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      FastMath.log(0.0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      FastMath.hypot(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      FastMath.getExponent((-1.0F));
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      FastMath.getExponent((float) 3042L);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      FastMath.getExponent(1.4148219975237644);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      FastMath.getExponent((double) 0L);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      FastMath.copySign(-0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      FastMath.cbrt((-5588.947231548726));
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      FastMath.atanh((-0.9171523356672744));
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      FastMath.atan(0.0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      FastMath.atan(0.4190443754196167);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      FastMath.asinh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      FastMath.acosh(1.0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      FastMath.acosh(1864.891);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      FastMath.acosh((-5.79002114093961E86));
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      FastMath.abs(0L);
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
      FastMath.IEEEremainder((-686.9), (-776L));
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      FastMath.IEEEremainder(2660.22968151, 49.6);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(26.42049817186435, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      double double0 = FastMath.copySign(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      double double0 = FastMath.copySign(5.5807813570926636E-148, (-1023.7958367));
      assertEquals((-5.5807813570926636E-148), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      double double0 = FastMath.floor((-127));
      assertEquals((-127.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      double double0 = FastMath.floor((-749.98));
      assertEquals((-750.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      double double0 = FastMath.floor((-4.503599627370496E15));
      assertEquals((-4.503599627370496E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      double double0 = FastMath.floor(2.829168201470791E294);
      assertEquals(2.829168201470791E294, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      double double0 = FastMath.floor(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      float float0 = FastMath.nextAfter(395.31296F, 1738.59139889967);
      assertEquals(395.313F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      float float0 = FastMath.nextAfter((-2716.8F), (-2340.4400761));
      assertEquals((-2716.7998F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      float float0 = FastMath.nextAfter(0.0F, 1.625);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, 1.3286716938018799);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, (-2492.3767599));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 1.4E-45F, (-1092.838));
      assertEquals(1.4012984643248169E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.14422495703074084, 2135.216);
      assertEquals(0.14422495703074087, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (double) 3042L);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, 5.669184079525E-24);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 114);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      double double0 = FastMath.abs((-1.0));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      float float0 = FastMath.abs((-3.4028235E38F));
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      float float0 = FastMath.abs(204.4369F);
      assertEquals(204.4369F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      double double0 = FastMath.pow(0.04237639320697582, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      int int0 = FastMath.getExponent(3016.893481633);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      double double0 = FastMath.sqrt(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      float float0 = FastMath.copySign((-3.4028235E38F), (-3.4028235E38F));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      float float0 = FastMath.copySign((float) 9223372036854775807L, (-0.40701088F));
      assertEquals((-9.223372E18F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      float float0 = FastMath.copySign(1.4E-45F, 0.0F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      double double0 = FastMath.copySign((-3439.715445194971), Double.POSITIVE_INFINITY);
      assertEquals(3439.715445194971, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      double double0 = FastMath.copySign((-4856.271340278325), (-4856.271340278325));
      assertEquals((-4856.271340278325), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      double double0 = FastMath.hypot(0.0F, 1024);
      assertEquals(1024.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      double double0 = FastMath.hypot((-2372.2749376751), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      double double0 = FastMath.hypot((-1658.2372), Float.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      double double0 = FastMath.hypot(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      double double0 = FastMath.max(2599.91272357, 2599.91272357);
      assertEquals(2599.91272357, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      double double0 = FastMath.max((-712.6158357), 673.1239);
      assertEquals(673.1239, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      float float0 = FastMath.max(3.4028235E38F, 3.4028235E38F);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, (float) 1025);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      float float0 = FastMath.max(1.0F, 981.3026F);
      assertEquals(981.3026F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      float float0 = FastMath.max(2282.6018F, (-80.43F));
      assertEquals(2282.6018F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      long long0 = FastMath.max(606L, 606L);
      assertEquals(606L, long0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      long long0 = FastMath.max((-1235L), (-1265L));
      assertEquals((-1235L), long0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      int int0 = FastMath.max(0, 145);
      assertEquals(145, int0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      int int0 = FastMath.max(10, 0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      double double0 = FastMath.min((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      double double0 = FastMath.min((double) (-2621.3F), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      double double0 = FastMath.min(0.13670018315315247, 0.13670018315315247);
      assertEquals(0.13670018315315247, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      double double0 = FastMath.min(1551.58097, 1258.963404206414);
      assertEquals(1258.963404206414, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      double double0 = FastMath.min((-1085.9527), 1359.0);
      assertEquals((-1085.9527), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.POSITIVE_INFINITY);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      float float0 = FastMath.min(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      float float0 = FastMath.min(2327.4846F, (-695.6956F));
      assertEquals((-695.6956F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      float float0 = FastMath.min((-2.4414062E-4F), 1.0F);
      assertEquals((-2.4414062E-4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      long long0 = FastMath.min(3042L, 3042L);
      assertEquals(3042L, long0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      long long0 = FastMath.min(4499201580859392L, 1205L);
      assertEquals(1205L, long0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      int int0 = FastMath.min(1014, 1014);
      assertEquals(1014, int0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      double double0 = FastMath.rint(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      double double0 = FastMath.rint((-158));
      assertEquals((-158.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      double double0 = FastMath.rint((-1476.21491));
      assertEquals((-1476.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      double double0 = FastMath.rint((-1.4E-45F));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      double double0 = FastMath.ceil((-2.220446049250313E-16));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      double double0 = FastMath.ceil((-624.7057592216246));
      assertEquals((-624.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      double double0 = FastMath.ceil((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 600490155);
      assertEquals(6.0049024E8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      float float0 = FastMath.nextAfter(335.0F, (double) (-127));
      assertEquals(334.99997F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, (-812.8906976731168));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      float float0 = FastMath.nextAfter(3418.34F, (double) 3418.34F);
      assertEquals(3418.34F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      float float0 = FastMath.nextAfter((-852.0F), Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      double double0 = FastMath.nextUp(0.7853981633974483);
      assertEquals(0.7853981633974484, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.0), (-1211.2492));
      assertEquals((-1.0000000000000002), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-1.0129027912496858E-9));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (double) 114);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      double double0 = FastMath.nextUp((double) Float.NEGATIVE_INFINITY);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      double double0 = FastMath.nextAfter(2682.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-245.7));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      float float0 = FastMath.scalb(1458.1414F, (-277));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-132), (-230));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      float float0 = FastMath.scalb(455.633F, 1853);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      float float0 = FastMath.scalb(2061.7263F, (-491));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-1023), (-1023));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, (-2523));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NEGATIVE_INFINITY, 2149);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, 1632);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-117), (-117));
      assertEquals((-7.0416814E-34F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      float float0 = FastMath.scalb((-0.29018322F), 808787910);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      float float0 = FastMath.scalb((-111.17001F), (-153));
      assertEquals((-9.8E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      double double0 = FastMath.scalb((-1.2522542401353875E-9), 1936);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      double double0 = FastMath.scalb((-1.287101187097E-312), 2065);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      double double0 = FastMath.scalb((-1.287101187097E-312), 2048);
      assertEquals((-4.1595256877813786E304), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      double double0 = FastMath.scalb(7.130134251490065E-128, (-1817));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      double double0 = FastMath.scalb((-166.7329), 600490145);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      double double0 = FastMath.scalb(3234.6760105829835, 600490145);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      double double0 = FastMath.scalb(2.718281828459045, (-2147482996));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-3268), (-3268));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      double double0 = FastMath.scalb(-0.0, (-3268));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, 1404);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      double double0 = FastMath.scalb((double) Float.POSITIVE_INFINITY, 2147483646);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      double double0 = FastMath.ulp((double) Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      double double0 = FastMath.abs((double) -0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      float float0 = FastMath.ulp(102.99F);
      assertEquals(7.6293945E-6F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      long long0 = FastMath.abs((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      long long0 = FastMath.abs(4368491638549381120L);
      assertEquals(4368491638549381120L, long0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      int int0 = FastMath.abs((-705));
      assertEquals(705, int0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      int int0 = FastMath.abs(707);
      assertEquals(707, int0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      double double0 = FastMath.toDegrees(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      double double0 = FastMath.toDegrees((-1907.3));
      assertEquals((-109280.24026530191), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      double double0 = FastMath.toRadians(4.9E-324);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      double double0 = FastMath.toRadians(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      double double0 = FastMath.toRadians(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      double double0 = FastMath.acos(4.9E-324);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      double double0 = FastMath.acos((-444.546814138766));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      double double0 = FastMath.acos(1.4901879599902343);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      double double0 = FastMath.asin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      double double0 = FastMath.asin(1L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      double double0 = FastMath.asin((-2402.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      double double0 = FastMath.asin(37L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      double double0 = FastMath.atan2(5.771457643937893E237, 1.3944901709366118E-206);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      double double0 = FastMath.atan2((-466.3205424789169), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      double double0 = FastMath.atan2(2013.3639, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      double double0 = FastMath.atan2((-462), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      double double0 = FastMath.atan2(9.999999999998333E-7, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      double double0 = FastMath.atan2(3, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      double double0 = FastMath.atan2((-1570.229503343678), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, 0.0F);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      double double0 = FastMath.atan2(Float.POSITIVE_INFINITY, (-2883.11));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-1860.69012136));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      double double0 = FastMath.atan2(7.37823609412532, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      double double0 = FastMath.atan2((-1588.928), (-1588.928));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      double double0 = FastMath.asin(6.3758692300917355E-59);
      assertEquals(6.3758692300917355E-59, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      double double0 = FastMath.asin((-0.2529153196255761));
      assertEquals((-0.2556923601486298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      double double0 = FastMath.atan2((-1072.16528), (-1.287101187097E-312));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      double double0 = FastMath.atan2((-4.9E-324), (-936.0693091));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      double double0 = FastMath.tan(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      double double0 = FastMath.tan(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      double double0 = FastMath.cos(2065);
      assertEquals((-0.56230429674402), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      double double0 = FastMath.cos(Float.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      double double0 = FastMath.cos(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      double double0 = FastMath.sin(4795.67301);
      assertEquals(0.9994936498556303, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      double double0 = FastMath.sin((-1103.034073));
      assertEquals(0.32881789154781654, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      double double0 = FastMath.sin(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      double double0 = FastMath.sin((-1082130432));
      assertEquals((-0.8967297195964543), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      double double0 = FastMath.tan(4.503599627370506E15);
      assertEquals((-0.5315904124911924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      double double0 = FastMath.sin(1.1293346659459732E69);
      assertEquals((-0.40588332701635305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      double double0 = FastMath.tan(1.5220029055650633E7);
      assertEquals((-1.2368704803956778), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      double double0 = FastMath.tan(6.7784312675173695E13);
      assertEquals(0.057653596198240724, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double double0 = FastMath.cos((-1.7976931348623157E308));
      assertEquals((-0.9999876894265599), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      double double0 = FastMath.cos((-5.591880480212007E119));
      assertEquals((-0.058433049269633296), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      double double0 = FastMath.cos((-4.503599627370496E15));
      assertEquals((-0.4855348677422206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      double double0 = FastMath.tan((-2.8821731631904323E-4));
      assertEquals((-2.882173242997062E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      double double0 = FastMath.sin((-1.4E-45F));
      assertEquals((-1.401298464324817E-45), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      double double0 = FastMath.pow(915.887, (-538));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      double double0 = FastMath.pow((-2373.284691349728), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      double double0 = FastMath.pow(883.3191, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      double double0 = FastMath.pow((-1085.7), (-20.0));
      assertEquals(1.931093239493584E-61, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      double double0 = FastMath.pow((double) (-1023), (double) (-1023));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      double double0 = FastMath.pow((-8.0E298), (-8.0E298));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) 3.4028235E38F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      double double0 = FastMath.pow((-1496.864968132), (-792.3048641205));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      double double0 = FastMath.pow((double) 6.1035156E-5F, Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      double double0 = FastMath.pow((-462.0), (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 5011.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) 1936);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1432.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1199.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2373.780651368891);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) Float.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      double double0 = FastMath.pow(0.3333333134651184, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      double double0 = FastMath.pow((-1156.1465555372), Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 899.4336921);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-2.42109990366786E-8));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      double double0 = FastMath.pow((double) 0.0F, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (-949.882));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 7.130134251490065E-128);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-941.9613598191));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      double double0 = FastMath.log10(204.4369F);
      assertEquals(2.3105592972886404, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      double double0 = FastMath.log1p(1.9430724557845986);
      assertEquals(1.0794540886508237, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      double double0 = FastMath.log1p(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      double double0 = FastMath.pow((double) 1L, (-1062.74764883115));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      double double0 = FastMath.log1p((-0.2529153196255761));
      assertEquals((-0.29157673966581615), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      double double0 = FastMath.log(1.287101187097E-312, 1424.8400484);
      assertEquals((-0.01011177721980907), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      double double0 = FastMath.log10(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      double double0 = FastMath.asinh(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      double double0 = FastMath.log1p((-143.945894011478));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      double double0 = FastMath.expm1((-4.9E-324));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      double double0 = FastMath.expm1(1374.986770830018);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      double double0 = FastMath.expm1((-709.782712893384));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      double double0 = FastMath.expm1((-710.3416661563751));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      double double0 = FastMath.expm1(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      double double0 = FastMath.exp((-732.2533135));
      assertEquals(9.6923E-319, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      double double0 = FastMath.exp((-2680.11557458985));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      float float0 = FastMath.signum(Float.NEGATIVE_INFINITY);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      float float0 = FastMath.signum(10.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      double double0 = FastMath.signum(0.8706219899559277);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      double double0 = FastMath.signum((-5588.947231548726));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      double double0 = FastMath.atanh(0.1);
      assertEquals(0.10033534773107558, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      double double0 = FastMath.atanh((-1181.71268771851));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      double double0 = FastMath.asinh(0.0416667);
      assertEquals(0.0416546530532254, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      double double0 = FastMath.asinh((-0.47480901147771026));
      assertEquals((-0.4585675933918392), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      double double0 = FastMath.tanh(0.6669561475161588);
      assertEquals(0.582974075840868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      double double0 = FastMath.tanh(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      double double0 = FastMath.tanh((-2807.50994756152));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      double double0 = FastMath.tanh(2069);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      double double0 = FastMath.tanh((-2.602850370608209E-8));
      assertEquals((-2.6028503706082084E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      double double0 = FastMath.sinh(0.087);
      assertEquals(0.08710979204256272, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      double double0 = FastMath.sinh((-120.56873710084952));
      assertEquals((-1.1516147461519702E52), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      double double0 = FastMath.sinh(139);
      assertEquals(1.1638660202394311E60, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      double double0 = FastMath.sinh(1509.5439331223008);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      double double0 = FastMath.sinh((-1825.20794447));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      double double0 = FastMath.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      double double0 = FastMath.cosh((-4150.586775159113));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      double double0 = FastMath.cosh(641.745829980046);
      assertEquals(2.5447360899027288E278, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      double double0 = FastMath.cosh(2867.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      double double0 = FastMath.atan2(5.443114553057336E-187, 2.5447360899027288E278);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      double double0 = FastMath.acos(0.154941877162301);
      assertEquals(1.4152277070554822, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      double double0 = FastMath.hypot((-1.0), 6.436814332206469E-17);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      int int0 = FastMath.getExponent(0.5F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      double double0 = FastMath.cosh((-158));
      assertEquals(2.077294853052011E68, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(4.7782149589194885E246, 4.7782149589194885E246);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      double double0 = FastMath.atan((-127));
      assertEquals((-1.562922473770796), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      double double0 = FastMath.acosh(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      double double0 = FastMath.acos((-1.4E-45F));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      int int0 = FastMath.round((-1.4E-45F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      long long0 = FastMath.round((-20.0));
      assertEquals((-20L), long0);
  }
@Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      FastMath.copySign((-151.48F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      FastMath.copySign((float) 1991, 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      FastMath.copySign((-2167.4047794820076), 0.0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      FastMath.hypot((-2.6437112632041807E-8), (-3.141592653589793));
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      FastMath.rint(3333.73);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      FastMath.ceil((-4.503599627370496E15));
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      FastMath.rint(4.503599627370496E15);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      FastMath.scalb(1.0F, (-127));
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      FastMath.scalb((-1461.52F), 276);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      FastMath.scalb(60.9576F, 128);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      FastMath.scalb((-35.17896356459515), (-1028));
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      FastMath.scalb(636.0007415, 2097);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      FastMath.scalb(1.1682026251371384E-8, (-2098));
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      FastMath.scalb(0.99, 1024);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      FastMath.ulp(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      FastMath.ulp(2380.88424181);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      FastMath.abs(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      FastMath.ulp(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      FastMath.abs(7910884519577875640L);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      FastMath.toRadians(1.9699272335463627E-8);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      FastMath.asin((-5.721188726109833E-18));
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      FastMath.atan2(0.0, 441.8938903);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      FastMath.acos(6.123233995736766E-17);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      FastMath.tan(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      FastMath.tan(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      FastMath.cos(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      FastMath.cos(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      FastMath.cos(0.0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      FastMath.sin(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      FastMath.sin(3294198.0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      FastMath.log1p((-1.0E-6));
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      FastMath.log1p(1.0E-6);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      FastMath.expm1(1.0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      FastMath.expm1((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      FastMath.signum(Float.NaN);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      FastMath.signum(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      FastMath.asinh(0.167);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      FastMath.tanh(0.5);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      FastMath.tanh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      FastMath.tanh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      FastMath.sinh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      FastMath.sinh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      FastMath.sinh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      FastMath.sinh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      FastMath.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      FastMath.cosh((-709.782712893384));
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      FastMath.cosh((-20.0));
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      FastMath.cosh(709.782712893384);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      FastMath.cosh(20.0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      FastMath.toDegrees(2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      FastMath.toDegrees((-1976.18));
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      FastMath.sqrt(0.0F);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      FastMath.sqrt(4.1634917208246963E124);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      FastMath.round(1.4E-45F);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      FastMath.round((-1053.1915F));
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      FastMath.round(0.5887403313647037);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      FastMath.round((-35.17896356459515));
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Random.setNextRandom((-277));
      FastMath.random();
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      FastMath.pow((double) (-2646.17F), (-1));
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      FastMath.nextUp((-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      FastMath.nextUp((-4.9E-324));
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      FastMath.nextAfter(1.4E-45F, (double) (-1.4E-45F));
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      FastMath.nextAfter((double) 0, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      FastMath.min(0L, 0L);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      FastMath.min((-3229L), (long) 89);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      FastMath.min(0, 16);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      FastMath.min(255, 255);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      FastMath.min(658.5F, 658.5F);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      FastMath.min((double) 0.0F, 1230.0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      FastMath.max((long) (-1660), 0L);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      FastMath.max((long) (-4868), (long) (-4868));
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      FastMath.max(0, 0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      FastMath.max((-3557), (-3557));
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      FastMath.max((double) (-35L), (double) (-35L));
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      FastMath.log10(1.0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      FastMath.log10(0.8775825500488281);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      FastMath.log((double) 0.0F, 9.113349603331047);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      FastMath.log(0.041666666666666664, 2525.2630747450316);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      FastMath.log(1.0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      FastMath.log((double) 1926.0F);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      FastMath.getExponent(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      FastMath.getExponent(Float.NEGATIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      FastMath.getExponent((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      FastMath.getExponent(0.0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      FastMath.exp((-3208.0));
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      FastMath.copySign(0.0F, (-1271.7633F));
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      FastMath.copySign(0.0, (-4.1900132227036916E-73));
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      FastMath.ceil((-228.254));
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      FastMath.atanh(0.0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      FastMath.atanh((-1.0));
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      FastMath.atan(3.141592653589793);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      FastMath.atan((-1063.5227283939));
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      FastMath.acosh(1.0F);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      FastMath.acosh((-1.718446464587963E12));
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      FastMath.abs((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      FastMath.abs(0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      FastMath.abs(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      FastMath.IEEEremainder((-1019.61749), 1668.7993533);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      FastMath.IEEEremainder(905.38035604669, 1322.4363071819769);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      // Undeclared exception!
      FastMath.pow(0.0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FastMath.main(stringArray0);
      // Undeclared exception!
      FastMath.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      double double0 = FastMath.copySign(8.306111510463843E-162, 0.0);
      assertEquals(8.306111510463843E-162, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      double double0 = FastMath.floor(3.7922604812631);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      double double0 = FastMath.floor(Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      float float0 = FastMath.nextAfter(1138.3081F, 1881.713698197683);
      assertEquals(1138.3082F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) (-4852), 1.096019026243815E274);
      assertEquals((-4851.9995F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NEGATIVE_INFINITY, (-120.629));
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.NaN, 7.610125138662287);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      double double0 = FastMath.nextAfter((-1.2534241706168776E-8), Double.POSITIVE_INFINITY);
      assertEquals((-1.2534241706168775E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      double double0 = FastMath.nextAfter(3.141592653589793, Double.NEGATIVE_INFINITY);
      assertEquals(3.1415926535897927, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0L, 0.15860503911972046);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (double) 1926);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      double double0 = FastMath.scalb((double) 0L, (-2146814085));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      double double0 = FastMath.scalb(984.492213, (-127));
      assertEquals(5.786325174050161E-36, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      double double0 = FastMath.abs((-183818.9700362263));
      assertEquals(183818.9700362263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      float float0 = FastMath.abs((float) 840L);
      assertEquals(840.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      double double0 = FastMath.pow((double) 7910884519577875640L, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      double double0 = FastMath.pow(3.2345523990372546E-222, (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      int int0 = FastMath.getExponent((-1766.81072329));
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      float float0 = FastMath.copySign((-2883.0F), 1.4E-45F);
      assertEquals(2883.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      float float0 = FastMath.copySign(1.4E-45F, 1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      float float0 = FastMath.copySign((float) 89, Float.NEGATIVE_INFINITY);
      assertEquals((-89.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      float float0 = FastMath.copySign(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      double double0 = FastMath.copySign((double) Float.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      double double0 = FastMath.copySign(Double.NaN, (-1842.328));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      double double0 = FastMath.copySign((-2733.58543927269), (-2733.58543927269));
      assertEquals((-2733.58543927269), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      double double0 = FastMath.hypot(4.9E-324, (-1377.967));
      assertEquals(1377.967, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      double double0 = FastMath.hypot((-5.67996159922899E-5), 4.9E-324);
      assertEquals(5.67996159922899E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      double double0 = FastMath.hypot((-5.003410681432538E-8), Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      double double0 = FastMath.hypot(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      double double0 = FastMath.hypot((-438.7808), Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      double double0 = FastMath.hypot(Float.POSITIVE_INFINITY, (-2869));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      double double0 = FastMath.max((double) -0.0F, (double) -0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      double double0 = FastMath.max(2460.47, 2460.47);
      assertEquals(2460.47, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      double double0 = FastMath.max(3.141592653589793, (double) (-1));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      double double0 = FastMath.max((-588.71549650563), 1256.6460715518258);
      assertEquals(1256.6460715518258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      float float0 = FastMath.max((float) (-127), (-7.464389E-37F));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      float float0 = FastMath.max(-0.0F, (float) (-2483111));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      float float0 = FastMath.max(1.4E-45F, 1.4E-45F);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      long long0 = FastMath.max(717L, 717L);
      assertEquals(717L, long0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      long long0 = FastMath.max(7910884519577875640L, 1L);
      assertEquals(7910884519577875640L, long0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      int int0 = FastMath.max(143, 1004);
      assertEquals(1004, int0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      int int0 = FastMath.max(1004, 143);
      assertEquals(1004, int0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      double double0 = FastMath.min(Double.NaN, (-276.8629008));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      double double0 = FastMath.min(0.5887403313647037, 0.6233457125087903);
      assertEquals(0.5887403313647037, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      double double0 = FastMath.min(9.423976538577447E138, (-698.386));
      assertEquals((-698.386), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      double double0 = FastMath.min((-1719.0662828640873), (-1719.0662828640873));
      assertEquals((-1719.0662828640873), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      float float0 = FastMath.min((-2795.0F), (-2795.0F));
      assertEquals((-2795.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      float float0 = FastMath.min((-3290.0098F), 1926.0F);
      assertEquals((-3290.0098F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      float float0 = FastMath.min(1023.0F, (float) (-1023));
      assertEquals((-1023.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      float float0 = FastMath.min(-0.0F, -0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      long long0 = FastMath.min(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      long long0 = FastMath.min(2363L, 2353L);
      assertEquals(2353L, long0);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      int int0 = FastMath.min((-2146540446), (-102));
      assertEquals((-2146540446), int0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      int int0 = FastMath.min(127, (-3274));
      assertEquals((-3274), int0);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      double double0 = FastMath.rint(1.5);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      double double0 = FastMath.rint((-4.2043940223127995E-17));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      double double0 = FastMath.rint((-183.21));
      assertEquals((-183.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      double double0 = FastMath.ceil((-8.194157257980706E-9));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      double double0 = FastMath.ceil(0.4342944622039795);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      double double0 = FastMath.floor((-1469.46790279));
      assertEquals((-1470.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      double double0 = FastMath.floor((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      double double0 = FastMath.floor(Float.NEGATIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      double double0 = FastMath.floor(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      float float0 = FastMath.nextUp((float) 1L);
      assertEquals(1.0000001F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 0L, (-738.05842));
      assertEquals((-1.4E-45F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      float float0 = FastMath.nextAfter(-0.0F, 3.8072183820435085E293);
      assertEquals(1.4E-45F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      float float0 = FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.5887403313647037);
      assertEquals(3.4028235E38F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      float float0 = FastMath.nextUp(Float.NEGATIVE_INFINITY);
      assertEquals((-3.4028235E38F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      float float0 = FastMath.nextAfter((-3351.78F), (double) (-3351.78F));
      assertEquals((-3351.78F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      float float0 = FastMath.nextAfter((float) 717L, Double.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      double double0 = FastMath.nextUp(641.145035456);
      assertEquals(641.1450354560001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) (-7.464389E-37F), (double) (-127));
      assertEquals((-7.4643891277215265E-37), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) 0.0F, Double.NEGATIVE_INFINITY);
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-0.12502530217170715));
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      double double0 = FastMath.nextAfter((double) Float.POSITIVE_INFINITY, (double) 717L);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      double double0 = FastMath.nextAfter((-2489.0681904), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      float float0 = FastMath.scalb((float) 127, (-213));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      float float0 = FastMath.scalb((-2019.9302F), (-145));
      assertEquals((-4.5289E-41F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      float float0 = FastMath.scalb((-3347.6F), (-277));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      float float0 = FastMath.scalb(1.4E-45F, 176);
      assertEquals(1.34217728E8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      float float0 = FastMath.scalb((float) 2146442038, 2146442038);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      float float0 = FastMath.scalb(40.0F, (-1663));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-2483103), (-2483103));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      float float0 = FastMath.scalb(0.0F, 227);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      float float0 = FastMath.scalb(Float.POSITIVE_INFINITY, (-2869));
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      float float0 = FastMath.scalb(Float.NaN, (-751));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      float float0 = FastMath.scalb(-0.0F, 7);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      float float0 = FastMath.scalb((-2313.84F), 1156337341);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      float float0 = FastMath.scalb((float) (-127), (-127));
      assertEquals((-7.464389E-37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2883), 1617);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      double double0 = FastMath.scalb((-167.467821718145), (-1690));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      double double0 = FastMath.scalb(287.64005279, (-1051));
      assertEquals(1.192130823E-314, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      double double0 = FastMath.scalb((double) 2146542992, 2146542992);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      double double0 = FastMath.scalb(3.927897744936608E-17, (-2483086));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-2483086), (-2483086));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      double double0 = FastMath.hypot(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      double double0 = FastMath.scalb(Double.POSITIVE_INFINITY, 1154801746);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      double double0 = FastMath.scalb(Double.NaN, (-1162));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      double double0 = FastMath.scalb((-3205.674975808022), 1518500250);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      double double0 = FastMath.scalb((double) (-1023), (-1023));
      assertEquals((-1.1381252786264335E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      float float0 = FastMath.ulp(Float.NEGATIVE_INFINITY);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      double double0 = FastMath.ulp(Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      double double0 = FastMath.abs(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      float float0 = FastMath.abs((-1472.5391F));
      assertEquals(1472.5391F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      float float0 = FastMath.abs(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      int int0 = FastMath.abs((-4585));
      assertEquals(4585, int0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      int int0 = FastMath.abs(3324);
      assertEquals(3324, int0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      double double0 = FastMath.toDegrees(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      double double0 = FastMath.toDegrees(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      double double0 = FastMath.toRadians(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      double double0 = FastMath.toRadians((-8.0E298));
      assertEquals((-1.3962634015954635E297), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      double double0 = FastMath.toRadians(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      double double0 = FastMath.cbrt((-1713.977552991));
      assertEquals((-11.967452433060139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      double double0 = FastMath.acos((-5.721188726109833E-18));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      double double0 = FastMath.acos(-0.0F);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      double double0 = FastMath.acos((-1.0F));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      double double0 = FastMath.acos((-1063.9698F));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      double double0 = FastMath.acos(1.053956282234684E82);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      double double0 = FastMath.asin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      double double0 = FastMath.asin(1L);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      double double0 = FastMath.asin((-1744.5803828351397));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      double double0 = FastMath.asin(1.671600962564167E60);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      double double0 = FastMath.atan2(3.141592653589793, 3.141592653589793);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      double double0 = FastMath.atan2(1729.5206, (-5.617007738516714E-309));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      double double0 = FastMath.atan2((-908.233159993047), 2.2250738585072014E-308);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      double double0 = FastMath.atan2(998.1273721872444, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      double double0 = FastMath.atan2((-4.2043940223127995E-17), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      double double0 = FastMath.atan2(717L, Float.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      double double0 = FastMath.atan2((-1.0), Float.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      double double0 = FastMath.atan2(0.8045504699864651, Float.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      double double0 = FastMath.atan2((-15.334579362039253), Float.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      double double0 = FastMath.atan2(Float.NEGATIVE_INFINITY, 4.242939707124646);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 3956.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, (-129.141746));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0F, -0.0F);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      double double0 = FastMath.atan2(0.0F, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 0.5039018405998233);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      double double0 = FastMath.atan2((-1.7235306074228092), (-1.7235306074228092));
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      double double0 = FastMath.asin(0.008336750013465571);
      assertEquals(0.008336846585786619, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      double double0 = FastMath.cos(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      double double0 = FastMath.sin((-835.3986595738));
      assertEquals(0.2618960281028483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      double double0 = FastMath.sin(-0.0F);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      double double0 = FastMath.sin(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      double double0 = FastMath.sin(2144240783);
      assertEquals((-0.962564148291652), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      double double0 = FastMath.tan(5.1635269305465607E216);
      assertEquals(1.1107347025659708, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      double double0 = FastMath.sin(3.1968675236412634E92);
      assertEquals((-0.5982468198860645), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      double double0 = FastMath.cos((-1.0028324930788433E27));
      assertEquals((-0.9786808325262735), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      double double0 = FastMath.cos(8.169926810324408E237);
      assertEquals((-0.054805472397057436), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      double double0 = FastMath.cos((-2.3784640418880364E16));
      assertEquals(0.9863511838460933, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      double double0 = FastMath.sin(1.633123935319537E16);
      assertEquals((-0.9586967629285477), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      double double0 = FastMath.cos(8.0E298);
      assertEquals((-0.9991033281235678), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      double double0 = FastMath.cos((-3.4028235E38F));
      assertEquals(0.8530210398303042, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      double double0 = FastMath.tan((-8.008561371849434E-8));
      assertEquals((-8.008561371849451E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      double double0 = FastMath.sin(3.927897744936608E-17);
      assertEquals(3.927897744936608E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      double double0 = FastMath.pow(1.0887403313647037, 144);
      assertEquals(207539.52575964408, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      double double0 = FastMath.pow(1855.0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      double double0 = FastMath.pow((-3224.973), (-74622984));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      double double0 = FastMath.pow((-2.356194490192345), (-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      double double0 = FastMath.pow((-709.782712893384), 8.988465674311366E307);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      double double0 = FastMath.pow((-3208.724613), (-3208.724613));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      double double0 = FastMath.pow((double) (-3.4028235E38F), (double) (-3.4028235E38F));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      double double0 = FastMath.pow((-3205.674975808022), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      double double0 = FastMath.pow((-1.399157980498908E-8), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 355.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (double) (-4852));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 3821.275214121079);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      double double0 = FastMath.pow((-0.9976192025067354), Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      double double0 = FastMath.pow((double) Float.POSITIVE_INFINITY, (-3036.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      double double0 = FastMath.pow(0.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, (double) (-4858));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      double double0 = FastMath.pow((double) -0.0F, 20.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, (-489.8373));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      double double0 = FastMath.pow(0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      double double0 = FastMath.log10((-168.9380785016));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      double double0 = FastMath.log1p(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      double double0 = FastMath.log(1.0, (double) 2267.2F);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), (double) 2146542992);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      double double0 = FastMath.log1p(0.16666666666666666);
      assertEquals(0.1541506798272583, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 0.49999999999999994);
      assertEquals(2.2227587494851693E-162, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      double double0 = FastMath.asinh(Float.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      double double0 = FastMath.log1p((-1439.1252445773));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      double double0 = FastMath.log(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      double double0 = FastMath.expm1((-5.721188726109833E-18));
      assertEquals((-5.721188726109833E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      double double0 = FastMath.expm1(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      double double0 = FastMath.expm1(1475.3912);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      double double0 = FastMath.exp((-709.782712893384));
      assertEquals(5.562684646268137E-309, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      double double0 = FastMath.expm1((-744.2333632048923));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      double double0 = FastMath.pow((-2.3718944120137026E-7), 1093.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      double double0 = FastMath.exp((-744.2333632048923));
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      float float0 = FastMath.signum(-0.0F);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      float float0 = FastMath.signum((-3.4028235E38F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      float float0 = FastMath.signum(155.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      double double0 = FastMath.signum((-1.8705235898309343));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      double double0 = FastMath.signum(1322.4363071819769);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      double double0 = FastMath.atanh(0.008333333333333333);
      assertEquals(0.008333526242605851, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      double double0 = FastMath.atanh(0.041666663879186654);
      assertEquals(0.04169080167719773, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      double double0 = FastMath.atanh(0.15);
      assertEquals(0.15114043593646678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      double double0 = FastMath.atanh((-3205.674975808022));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      double double0 = FastMath.asinh(0.029999999999972715);
      assertEquals(0.029995501821496986, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      double double0 = FastMath.asinh(0.03601556410444137);
      assertEquals(0.036007782555809636, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      double double0 = FastMath.asinh((-2677.4995));
      assertEquals((-8.585785831012817), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      double double0 = FastMath.asinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      double double0 = FastMath.tanh((-0.3275243270791697));
      assertEquals((-0.3162945236085177), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      double double0 = FastMath.tanh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      double double0 = FastMath.tanh(1433.4129627);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      double double0 = FastMath.tanh((-818.578));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      double double0 = FastMath.sinh((-5.721188726109833E-18));
      assertEquals((-5.721188726109833E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      double double0 = FastMath.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      double double0 = FastMath.sinh((-21.020209096307916));
      assertEquals((-6.728694695975477E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      double double0 = FastMath.sinh((-1914.345736139752));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      double double0 = FastMath.sinh(45.48360248969846);
      assertEquals(2.8330065765430964E19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      double double0 = FastMath.sinh(2515.0427692512394);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      double double0 = FastMath.cosh((-512.74965));
      assertEquals(2.4172056302856606E222, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      double double0 = FastMath.cosh(439.222);
      assertEquals(2.822675377335857E190, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      double double0 = FastMath.cosh(2712.2269172854);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      double double0 = FastMath.atan2(5.990769236615968E-267, (-8.0E298));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      double double0 = FastMath.atan2(0.5, (-2.2250738585072014E-308));
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      double double0 = FastMath.log(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      int int0 = FastMath.getExponent((float) 0L);
      assertEquals((-127), int0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      double double0 = FastMath.cosh((-1305.28483));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      double double0 = FastMath.nextUp((double) (-2020.0808F));
      assertEquals((-2020.0808105468748), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      double double0 = FastMath.IEEEremainder(3.141592653589793, 3.141592653589793);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      double double0 = FastMath.atan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      double double0 = FastMath.acosh(2.718281828459045);
      assertEquals(1.6574544541530771, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      double double0 = FastMath.expm1((-1571.4182586922645));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      int int0 = FastMath.round(2097.0F);
      assertEquals(2097, int0);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      long long0 = FastMath.round((-0.19124407722541859));
      assertEquals(0L, long0);
  }
}
