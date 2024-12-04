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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(1);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "FFFFF939", 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      int int0 = numericEntityEscaper0.translate((CharSequence) "&#38;&#35;&#49;&#59;", 1, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) stringBuffer0);
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
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[4];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "43F", (Writer) stringWriter0);
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
        octalUnescaper0.translate((CharSequence) "33", 51, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (-1968), (Writer) stringWriter0);
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
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(46);
      CharBuffer charBuffer0 = CharBuffer.allocate(46);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 46, (Writer) stringWriter0);
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
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "33");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      char[] charArray0 = new char[26];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append('v');
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
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
  public void test_0010()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1965);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(1);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) "FFFFF939", (Writer) stringWriter0);
      assertEquals("FFFFF939", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(48);
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
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
  public void test_0015()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(6439, 6439);
      CharBuffer charBuffer0 = CharBuffer.allocate(6439);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(37);
      assertEquals("25", string0);
  }
@Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(36);
      int int0 = numericEntityEscaper0.translate((CharSequence) "&#104;&#42;&#48;&#46;&#48;&#42;\"&#46;", 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter(1342);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(2901);
      StringWriter stringWriter0 = new StringWriter(2901);
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
  public void test_0024()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(11);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "B", 11, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 120, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(48);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 48, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(5060);
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "31");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below('c');
      charBuffer0.flip();
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
  public void test_0030()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-973));
      StringWriter stringWriter0 = new StringWriter(1192);
      unicodeEscaper0.translate((CharSequence) "FFFFFC33", (Writer) stringWriter0);
      assertEquals("FFFFFC33", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(723);
      numericEntityEscaper0.translate((CharSequence) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'h';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(36);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("&#104;\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(731, 731);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "2DB", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
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
  public void test_0037()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(30);
      assertEquals("1E", string0);
  }
}
