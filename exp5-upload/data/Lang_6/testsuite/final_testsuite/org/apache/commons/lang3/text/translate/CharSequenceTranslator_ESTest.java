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
import org.apache.commons.lang3.text.translate.LookupTranslator;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(4185);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "1059", 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(4185, 4185);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "1059", 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
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
  public void test_0004()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[7];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1059", (Writer) stringWriter0);
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
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-5097), (-5097));
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "FFFFEC17", (-5097), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, 28, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.OctalUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(120);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, (-2149), (Writer) null);
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
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "31");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(4336);
      StringWriter stringWriter0 = new StringWriter(4336);
      StringWriter stringWriter1 = stringWriter0.append('U');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      unicodeEscaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
      assertEquals(2, stringBuffer0.length());
      assertEquals("UU", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(446);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-263), 1432);
      unicodeEscaper0.translate((CharSequence) "E12", (Writer) stringWriter0);
      assertEquals("\\u0045\\u0031\\u0032", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-400));
      assertEquals("FFFFFE70", string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      String string0 = aggregateTranslator0.translate((CharSequence) "&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#53;&#92;&#117;&#48;&#48;&#51;&#55;&#92;&#117;&#48;&#48;&#51;&#48;");
      assertEquals("&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#54;&#92;&#117;&#48;&#48;&#52;&#53;&#92;&#117;&#48;&#48;&#51;&#55;&#92;&#117;&#48;&#48;&#51;&#48;", string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter(92);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
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
  public void test_0016()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(4185);
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharSequenceTranslator charSequenceTranslator0 = unicodeUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1051);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }
@Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(445, 445);
      int int0 = unicodeEscaper0.translate((CharSequence) "Arguments cannot both be null", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(12);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(12);
      unicodeEscaper0.translate((CharSequence) "2", 0, (Writer) stringWriter0);
      assertEquals("\\u0032", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = octalUnescaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[1];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      StringWriter stringWriter0 = new StringWriter(65535);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(753);
      StringWriter stringWriter0 = new StringWriter();
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
  public void test_0025()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-329), (-329));
      StringWriter stringWriter0 = new StringWriter(120);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "FFFFFFFF", (-1), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(1575);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, 1575, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.OctalUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(39, 39);
      CharBuffer charBuffer0 = CharBuffer.allocate(9978);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1FE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-329), (-329));
      StringWriter stringWriter0 = new StringWriter(120);
      unicodeEscaper0.translate((CharSequence) "FFFFFFFF", (Writer) stringWriter0);
      assertEquals("\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) "26");
      assertEquals("26", string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(2660);
      octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
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
  public void test_0034()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(3190);
      assertEquals("C76", string0);
  }
@Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = aggregateTranslator0.translate((CharSequence) "null", (-1), (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(339);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringWriter stringWriter2 = stringWriter1.append('2');
      StringBuffer stringBuffer0 = stringWriter2.getBuffer();
      int int0 = numericEntityEscaper0.translate((CharSequence) stringBuffer0, 339, (Writer) stringWriter2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
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
  public void test_0040()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(1254);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "A", 10, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(27);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 27, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2237);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 2237, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) charBuffer1);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      aggregateTranslator0.translate((CharSequence) "null", (Writer) stringWriter0);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1435);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(1173, 1435);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      charSequenceTranslator0.translate((CharSequence) "1", (Writer) stringWriter0);
      assertEquals("\\u0031", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = aggregateTranslator0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1);
      assertEquals("1", string0);
  }
@Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(0);
      StringWriter stringWriter0 = new StringWriter(188);
      int int0 = numericEntityEscaper0.translate((CharSequence) "+}+", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      unicodeEscaper0.translate((CharSequence) "FFFFFFC5", 0, (Writer) stringWriter0);
      assertEquals("\\u0046", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(5571);
      CharBuffer charBuffer0 = CharBuffer.allocate(5571);
      StringWriter stringWriter0 = new StringWriter(5571);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertFalse(charBuffer0.isDirect());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(35);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) stringBuffer0, 35, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 10, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2293);
      StringWriter stringWriter0 = new StringWriter(2293);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 2293, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(5571);
      CharBuffer charBuffer0 = CharBuffer.allocate(5571);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "9D7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "&#101;&#66;&#0;&#0;&#0;", (Writer) stringWriter0);
      assertEquals("&#38;&#35;&#49;&#48;&#49;&#59;&#38;&#35;&#54;&#54;&#59;&#38;&#35;&#48;&#59;&#38;&#35;&#48;&#59;&#38;&#35;&#48;&#59;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(4837);
      octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
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
  public void test_0070()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) "FFFFFFF3");
      assertEquals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#51;", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-13));
      assertEquals("FFFFFFF3", string0);
  }
@Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeUnescaper0;
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) unicodeEscaper0;
      CharBuffer charBuffer0 = CharBuffer.allocate(1970);
      String string0 = charSequenceTranslatorArray0[0].translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(1947);
      int int0 = charSequenceTranslatorArray0[1].translate((CharSequence) string0, 679, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(908, 3);
      unicodeEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(1126, 1126);
      CharBuffer charBuffer0 = CharBuffer.allocate(1126);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 1126, 1126);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below((-3324));
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
  public void test_0076()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1126);
      StringWriter stringWriter0 = new StringWriter(1949);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(3);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "3", 3, (Writer) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(1162, 1162);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 1162, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1144);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1144);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 1144, (Writer) stringWriter0);
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
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
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
  public void test_0081()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(1195, 1195);
      CharBuffer charBuffer0 = CharBuffer.allocate(1195);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(1195);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[2];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityUnescaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1098);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1120, 1120);
      StringWriter stringWriter0 = new StringWriter(1120);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "25D", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharSequenceTranslator charSequenceTranslator0 = aggregateTranslator0.with(charSequenceTranslatorArray0);
      assertFalse(charSequenceTranslator0.equals((Object)aggregateTranslator0));
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter(1947);
      StringWriter stringWriter1 = stringWriter0.append('7');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      unicodeEscaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
      assertEquals("7\\u0037", stringBuffer0.toString());
      assertEquals("7\\u0037", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf((-873), 2242);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('-');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      int int0 = numericEntityEscaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-148), 0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "FFFFFF6C");
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 2, (Writer) stringWriter0);
      assertEquals("\\u0046", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter(2);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) stringBuffer0, 102, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2535);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) string0, 2535, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2676);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(2676);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 2676, (Writer) stringWriter0);
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
      CharBuffer charBuffer0 = CharBuffer.allocate(4246);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "5D");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) stringBuffer0);
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
      StringWriter stringWriter0 = new StringWriter(2);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(48, 1);
      numericEntityEscaper0.translate((CharSequence) "179", (Writer) stringWriter0);
      assertEquals("&#49;&#55;&#57;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter(2);
      numericEntityEscaper0.translate((CharSequence) "179", (Writer) stringWriter0);
      assertEquals("179", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2676);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(2676);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(2676);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(730);
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
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
  public void test_0104()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
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
  public void test_0106()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-350));
      assertEquals("FFFFFEA2", string0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      int int0 = numericEntityEscaper0.translate((CharSequence) "0", 0, (Writer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "0", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) "19", 25, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, (-341), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(715);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(715);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 715, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(5436);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "3B");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(65535, 0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "FFFFFF07", (Writer) stringWriter0);
      assertEquals("\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0030\\u0037", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2197);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(2197);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "2", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
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
  public void test_0124()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-288));
      assertEquals("FFFFFEE0", string0);
  }
@Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 2800);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[7];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-2244), (-2244));
      CharBuffer charBuffer0 = CharBuffer.allocate(10);
      StringWriter stringWriter0 = new StringWriter(3261);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2512);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(3807);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1CF", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above((-24));
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "FFFFFFE8", (-24), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 12, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(115);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 115, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2512);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1DA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 0);
      char[] charArray0 = new char[24];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) "*****u\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, 1);
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
  public void test_0136()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[5];
      charArray0[3] = 'T';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-2476), 43);
      unicodeEscaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000T\u0000\u0000\u0000\u0000\\u0054\u0000", stringBuffer0.toString());
      assertEquals("\u0000\u0000\u0000T\u0000\u0000\u0000\u0000\\u0054\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-1));
      assertEquals("FFFFFFFF", string0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-4409), (-4409));
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
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
  public void test_0142()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      int int0 = aggregateTranslator0.translate((CharSequence) "1", 2386, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
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
  public void test_0145()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(2575);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "55C", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) stringBuffer0, (-3), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (-3741), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 2, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(70, (-1014));
      CharBuffer charBuffer0 = CharBuffer.allocate(2386);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above((-2314));
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[7];
      charArray0[4] = '\\';
      charArray0[5] = '8';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 4, 2);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"8\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "ABC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      String string0 = charSequenceTranslator0.translate((CharSequence) "47");
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
      assertEquals("\\u0026\\u0023\\u0035\\u0032\\u003B\\u0026\\u0023\\u0035\\u0035\\u003B", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('J');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("JJ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf((-1), (-1));
      numericEntityEscaper0.translate((CharSequence) "1", (Writer) stringWriter0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      charSequenceTranslator0.translate((CharSequence) stringBuffer0, 1, (Writer) stringWriter0);
      assertEquals("&#49;&#35;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
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
  public void test_0157()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(2137);
      assertEquals("859", string0);
  }
@Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      StringWriter stringWriter0 = new StringWriter(1504);
      int int0 = lookupTranslator0.translate((CharSequence) "FFFFF31E", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(3841);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      aggregateTranslator0.translate((CharSequence) string0, 3841, (Writer) stringWriter0);
      assertEquals("\\u0075", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(97, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "30", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "A", 1500, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 1, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 65, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2098);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(10);
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
  public void test_0170()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(97, 10);
      CharBuffer charBuffer0 = CharBuffer.allocate(10);
      StringWriter stringWriter0 = new StringWriter(97);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "5DC", (Writer) stringWriter0);
      assertEquals("&#53;&#68;&#67;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-1680));
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
  public void test_0174()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1658);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
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
  public void test_0177()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1500);
      assertEquals("5DC", string0);
  }
}
