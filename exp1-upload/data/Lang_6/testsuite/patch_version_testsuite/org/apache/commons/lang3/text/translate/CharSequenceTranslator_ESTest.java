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
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(3102);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = octalUnescaper0.translate((CharSequence) charBuffer0, 1662, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[9];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTIONArray0[1];
      numericEntityUnescaper_OPTIONArray0[6] = numericEntityUnescaper_OPTIONArray0[4];
      numericEntityUnescaper_OPTIONArray0[7] = numericEntityUnescaper_OPTIONArray0[1];
      numericEntityUnescaper_OPTIONArray0[8] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
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
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(3533);
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(1068);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "42C", 1068, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(57);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 57, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1736);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 1736, (Writer) stringWriter0);
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
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      octalUnescaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
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
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(4297);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.position(4297);
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
  public void test_0011()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1083, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) "43B", (Writer) stringWriter0);
      assertEquals("43B", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-242), 447);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) "FFFFF49F", (Writer) stringWriter0);
      assertEquals("\\u0046\\u0046\\u0046\\u0046\\u0046\\u0034\\u0039\\u0046", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-1017));
      assertEquals("FFFFFC07", string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-1402), (-1402));
      StringWriter stringWriter0 = new StringWriter(945);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
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
  public void test_0016()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1083, 0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }
@Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(843, 843);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "&#38;&#35;&#56;&#50;&#59;&#38;&#35;&#56;&#50;&#59;&#38;&#35;&#54;&#49;&#59;&#38;&#35;&#57;&#53;&#59;&#38;&#35;&#56;&#56;&#59;", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(1);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 1, 1);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2452, 2452);
      CharBuffer charBuffer0 = CharBuffer.allocate(2452);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      String string1 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) string1, (Writer) stringWriter0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(1);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "1", 1, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, 2001, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(657, 657);
      CharBuffer charBuffer0 = CharBuffer.allocate(657);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 1211, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      octalUnescaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2002);
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
  public void test_0028()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(108, 2);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "&&YbMoE0", (Writer) stringWriter0);
      assertEquals("&#38;&#38;&#89;&#98;&#77;&#111;&#69;&#48;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
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
  public void test_0031()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(1);
      String string0 = unicodeEscaper0.translate((CharSequence) "1");
      assertEquals("\\u0031", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1);
      assertEquals("1", string0);
  }
@Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = lookupTranslator0.translate((CharSequence) charBuffer0, 3407, (Writer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;", 191, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
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
  public void test_0039()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(5675);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      charBuffer0.get(charArray0);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer1, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) stringBuffer0, (-939), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 2342, (Writer) null);
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
      CharBuffer charBuffer0 = CharBuffer.allocate(549);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 549, (Writer) stringWriter0);
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
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(5696);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "23");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-1));
      CharBuffer charBuffer0 = CharBuffer.allocate(226);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.compact();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1);
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
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(97);
      unicodeEscaper0.translate((CharSequence) "1CE", (Writer) stringWriter0);
      assertEquals("1CE", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(97);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(243, 462);
      unicodeEscaper0.translate((CharSequence) "1CE", (Writer) stringWriter0);
      assertEquals("\\u0031\\u0043\\u0045", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(226);
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(226);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(226);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(226);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(2);
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
  public void test_0053()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-1));
      assertEquals("FFFFFFFF", string0);
  }
@Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = unicodeUnescaper0.translate((CharSequence) "8", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(188);
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(188);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 112, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 0, 0);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-1910), (-1910));
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2974);
      unicodeUnescaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertFalse(charBuffer0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "5D", 93, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, 59, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1792);
      StringWriter stringWriter0 = new StringWriter(1792);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, 1792, (Writer) stringWriter0);
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
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(9988);
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "110");
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
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-1823), 188);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "FFFFFDC6", (Writer) stringWriter0);
      assertEquals("\\u0046\\u0046\\u0046\\u0046\\u0046\\u0044\\u0043\\u0036", stringWriter0.toString());
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
  public void test_0068()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(137);
      assertEquals("89", string0);
  }
@Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2, (-316));
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      unicodeEscaper0.translate((CharSequence) "\u0000\u0000", 0, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      String string0 = octalUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(1207);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "4B7", 1207, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, 0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(1448);
      CharBuffer charBuffer0 = CharBuffer.allocate(1448);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 1448, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(1800, 1800);
      CharBuffer charBuffer0 = CharBuffer.allocate(1800);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(999);
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
  public void test_0080()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[3];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[4];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityUnescaper0;
      CharSequenceTranslator charSequenceTranslator0 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      StringWriter stringWriter0 = new StringWriter(0);
      charSequenceTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter(2);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      aggregateTranslator0.translate((CharSequence) "4B7", (Writer) stringWriter0);
      assertEquals("&#52;&#66;&#55;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "4B7", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
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
  public void test_0085()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1207);
      assertEquals("4B7", string0);
  }
@Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonRequired;
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[2];
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(1, (-380));
      StringWriter stringWriter0 = new StringWriter(1771);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-746));
      assertEquals("FFFFFD16", string0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
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
  public void test_0091()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(5100);
      StringWriter stringWriter0 = new StringWriter(5100);
      unicodeUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(0, charBuffer0.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-1));
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "FFFFFFFF", (-1), (Writer) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(30);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 30, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(555);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 555, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4227);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(4227);
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(98);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) "@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(54);
      char[] charArray0 = new char[5];
      charArray0[0] = 'W';
      charArray0[1] = 'f';
      charArray0[2] = 'R';
      charArray0[3] = '{';
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(54);
      // Undeclared exception!
      try { 
        charSequenceTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(54);
      char[] charArray0 = new char[5];
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) unicodeEscaper0;
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(54);
      charSequenceTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(54);
      char[] charArray0 = new char[5];
      charArray0[0] = 'W';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(54);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals("\\u0057", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
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
  public void test_0102()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-497));
      CharBuffer charBuffer0 = CharBuffer.allocate(3142);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 5, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "FFFFF81B", 0, (Writer) stringWriter0);
      assertEquals("\\u0046", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = octalUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(2565, 2565);
      CharBuffer charBuffer0 = CharBuffer.allocate(2565);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(2941);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "B7D", 2941, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 740, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "E2");
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
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(2565, 2565);
      CharBuffer charBuffer0 = CharBuffer.allocate(284);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertTrue(charBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-497));
      CharBuffer charBuffer0 = CharBuffer.allocate(3142);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertTrue(charBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "8FC", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(226);
      assertEquals("E2", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
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
  public void test_0118()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
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
  public void test_0120()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(775, 775);
      CharBuffer charBuffer0 = CharBuffer.allocate(1229);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }
@Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(16);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[4];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(494, (-1984));
      int int0 = numericEntityEscaper0.translate((CharSequence) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 97, (Writer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-1181), 0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = numericEntityEscaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "3D0", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(884);
      StringWriter stringWriter0 = new StringWriter(884);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "FFFFFFD8", (-40), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 448, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(935);
      CharBuffer charBuffer0 = CharBuffer.allocate(935);
      StringWriter stringWriter0 = new StringWriter(935);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 935, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(65544);
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      unicodeUnescaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
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
  public void test_0130()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "3F9", (Writer) stringWriter0);
      assertEquals("\\u0033\\u0046\\u0039", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-2746));
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "3F9", (Writer) stringWriter0);
      assertEquals("3F9", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-1984));
      assertEquals("FFFFF840", string0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(915);
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[1];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2050);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-1));
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
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
  public void test_0138()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2050);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }
}
