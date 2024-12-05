package org.apache.commons.lang3.text.translate;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = unicodeUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1036);
      StringWriter stringWriter0 = new StringWriter(1);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) aggregateTranslator0;
      StringWriter stringWriter0 = new StringWriter(55);
      // Undeclared exception!
      try { 
        charSequenceTranslatorArray0[0].translate((CharSequence) "37", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) "A39", 2617, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 1, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(268);
      StringWriter stringWriter0 = new StringWriter(268);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 268, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(1793, 1793);
      CharBuffer charBuffer0 = CharBuffer.allocate(1793);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1581);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(55, 55);
      StringWriter stringWriter0 = new StringWriter(55);
      numericEntityEscaper0.translate((CharSequence) "37", (Writer) stringWriter0);
      assertEquals("3&#55;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-1));
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2325);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(1, 823);
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(55, 55);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(55);
      assertEquals("37", string0);
  }
@Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1301);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(1301);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) string0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[4];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[2];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(1282);
      CharBuffer charBuffer0 = CharBuffer.allocate(2025);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer1);
      charBuffer0.append((CharSequence) string0);
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(1282);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer1, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(1308);
      StringWriter stringWriter0 = new StringWriter(1308);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) stringBuffer0, 1308, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 4304, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 2822, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(5110);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "10");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      octalUnescaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("&#0;&#0;&#0;&#0;&#0;&#0;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(1);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1177);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(3747);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
      assertEquals("0", string0);
  }
@Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2101);
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      int int0 = octalUnescaper0.translate((CharSequence) charBuffer0, 57, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(2086);
      StringWriter stringWriter0 = new StringWriter(1);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(117, 2);
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 1, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, 1, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4988);
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, 4988, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      unicodeUnescaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(154, 846);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2454, 653);
      CharBuffer charBuffer0 = CharBuffer.allocate(2878);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(154, 846);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "9A", (Writer) stringWriter0);
      assertEquals("&#57;&#65;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(846, 154);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "9A", (Writer) stringWriter0);
      assertEquals("9A", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "&#51;9", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(716);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1);
      // Undeclared exception!
      try { 
        unicodeEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(57);
      assertEquals("39", string0);
  }
@Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1122);
      int int0 = octalUnescaper0.translate((CharSequence) charBuffer0, 2, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = octalUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      try { 
        octalUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      octalUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(2778);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-623));
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) stringBuffer0, (-623), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(60, 60);
      StringWriter stringWriter0 = new StringWriter(60);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 60, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, (-1829), (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      unicodeUnescaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(65);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(4145, 4145);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "FFFFF508", (Writer) stringWriter0);
      assertEquals("&#70;&#70;&#70;&#70;&#70;&#53;&#48;&#56;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(4133, 4133);
      String string0 = numericEntityEscaper0.translate((CharSequence) "1025");
      assertEquals("1025", string0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = charSequenceTranslator0.translate((CharSequence) "FFFFF9AC", 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-6));
      assertEquals("FFFFFFFA", string0);
  }
@Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 679);
      CharBuffer charBuffer0 = CharBuffer.allocate(1590);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 92, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1652);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) string0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer1, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(57);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "FFFFFAD6", (-1322), (Writer) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(818);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, 818, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.OctalUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(25);
      StringWriter stringWriter0 = new StringWriter(25);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 25, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(4087);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.get();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(1);
      StringWriter stringWriter0 = new StringWriter(1);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(1590);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(0, charBuffer0.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1590);
      assertEquals("636", string0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(8);
      octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-1));
      // Undeclared exception!
      try { 
        unicodeEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }
@Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(977);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(1141, 1141);
      CharBuffer charBuffer0 = CharBuffer.allocate(808);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below((-93));
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(2, 2);
      StringWriter stringWriter0 = new StringWriter(2);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "2", 2, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(88);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, 88, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(4);
      CharBuffer charBuffer0 = CharBuffer.allocate(4);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 4, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3632);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(3632, 3632);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      String string1 = unicodeEscaper0.translate((CharSequence) string0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "4D");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[3];
      charArray0[0] = '5';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\\u0035\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      unicodeEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3617);
      StringWriter stringWriter0 = new StringWriter(3617);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(102);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      octalUnescaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(2);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }
}
