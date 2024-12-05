package org.apache.commons.lang;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(110);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "o&@})");
      assertEquals("o&@})", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\buU0!");
      assertEquals("\buU0!", string0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\fnt");
      assertEquals("\fnt", string0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("K\\A");
      assertEquals("KA", string0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = "\\uU00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: U00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "1v210");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      String string0 = "\\uU00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: U00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "W-4]TU_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3566);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "Egrave");
      assertEquals("Egrave", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "]e_?YPk&cki!(X");
      assertEquals("]e_?YPk&cki!(X", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "K\\A");
      assertEquals("KA", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("KA");
      assertEquals("KA", string0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("q(\"<C&0R]gF(]'Z!N");
      assertEquals("q(\"<C&0R]gF(]'Z!N", string0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      String string0 = "\\u00";
      StringWriter stringWriter0 = new StringWriter(118);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, string0);
      assertEquals("\\u00", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "\\u000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("Omega");
      assertEquals("Omega", string0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1133);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "'");
      assertEquals("&apos;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("23o@y");
      assertEquals("23o@y", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "K88\"dsLmZsfkR>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("1T}-)</'n!4C<~cy9.");
      assertEquals("1T}-)&lt;/'n!4C&lt;~cy9.", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("1T}-)</\\'n!4C<~cy9.");
      assertEquals("1T}-)</'n!4C<~cy9.", string0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      String string0 = "\\uU00";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: U00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" 'M>+d0JX)");
      assertEquals(" \\'M>+d0JX)", string0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\"i.c1&IU[)DvHA");
      assertEquals("\\\"i.c1&IU[)DvHA", string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "KA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("1T}-)</'n!4C<~cy9.");
      assertEquals("1T}-)</'n!4C<~cy9.", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "KA");
      assertEquals("KA", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("Q*; NJg=2Za,;/Yb");
      assertEquals("Q*; NJg=2Za,;/Yb", string0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("]_9URB\b");
      assertEquals("]_9URB\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("I\f\"");
      assertEquals("I\f\"", string0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(678);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "'");
      assertEquals("'", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("ra@3 f");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\\u000");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      String string0 = "\\u0=00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0=00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      String string0 = "\\u0=00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0=00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      String string0 = "\\u00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "Ib<eq");
      assertEquals("Ib<eq", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(43);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "9NsW&O\"-H;p\"&.");
      assertEquals("9NsW&amp;O&quot;-H;p&quot;&amp;.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "yL");
      assertEquals("yL", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      String string0 = "\\u0=0a";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertEquals("\\u0=0a", string1);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(43);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      String string0 = "\\u000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(72);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("\"u0=00");
      assertEquals("&quot;u0=00", string0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "e8WY| !ECK/@,>L");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3156);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "`y',kNz\\|3vU3");
      assertEquals("`y',kNz|3vU3", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\\\"u0=0");
      assertEquals("\"u0=0", string0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      String string0 = "\\u0=00";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0=00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "+x;ah~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("IfP&YO'pk6P{!X");
      assertEquals("IfP&YO\\'pk6P{!X", string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\"u0=00");
      assertEquals("\\\"u0=00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }
@Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("T'%cF?[X0FT|X");
      assertEquals("T\\'%cF?[X0FT|X", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava(";?G|.g?% X_KA@w?s'");
      assertEquals(";?G|.g?% X_KA@w?s'", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("ti>\\EV#_3");
      assertEquals("ti>EV#_3", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\n");
      assertEquals("\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\u0000");
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("177");
      assertEquals("177", string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String string0 = "\\uh00g";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: h00g
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      String string0 = "\\u@0K0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: @0K0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "*PiE{?^");
      assertEquals("*PiE{?^", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      String string0 = "\\u0@00";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0@00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("rNJ|E]4I!^");
      assertEquals("rNJ|E]4I!^", string0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(260);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("M7S'C");
      assertEquals("M7S&apos;C", string0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "$~sP");
      assertEquals("$~sP", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "T'%cF?[X0FT|X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1693);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "The Writer must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("Us%]ZBE");
      assertEquals("Us%]ZBE", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(23);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "=6[0`]2d>*u@/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("^8VH:Xhn!M*y\"DIkjm");
      assertEquals("^8VH:Xhn!M*y&quot;DIkjm", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(260);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "Yacute");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("F&*SP{/a$!\"bN <1");
      assertEquals("F&*SP{/a$!\\\"bN <1", string0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\u0000");
      assertEquals("\\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\u50D2]");
      assertEquals("\\u50D2]", string0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "lR-2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\f00DB|%]");
      assertNotNull(string0);
      assertEquals("\\f00DB|%]", string0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\u00D2x]");
      assertEquals("\\u00D2x]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(7);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "nW,cl'/H,n");
      assertEquals("nW,cl'/H,n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(66);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("pUX-,8Adj(W&]rro");
      assertEquals("pUX-,8Adj(W&]rro", string0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("H\t'6HkYbBkC{7I\"@");
      assertEquals("H\t'6HkYbBkC{7I\"@", string0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("5Ss.g?diG\\Kx");
      assertEquals("5Ss.g?diGKx", string0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "N*k*RJ");
      assertEquals("N*k*RJ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("M?^}/&be");
      assertEquals("M?^}/&be", string0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      String string0 = "\\u0V0d)";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0V0d
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "pq ,;?!4:-(oHZT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      String string0 = "\\u0V/0d)";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0V/0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "Otilde");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "prop");
      assertEquals("prop", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("goM?1/ub$");
      assertEquals("goM?1/ub$", string0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "+hD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeXml(string0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(121);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "org.apache.commons.lang.StringEscapeUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "C|4yb|CCS2k%6&amp;&quot;2oA");
      assertEquals("C|4yb|CCS2k%6&amp;amp;&amp;quot;2oA", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "3|-h5Uy*7/B_@UZ>#b");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(80);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "3|-h5Uy*7/B_@UZ>#b");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("^VG#s]|2K:0ilU\"dT");
      assertEquals("^VG#s]|2K:0ilU&quot;dT", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, ":az/J~MpQvbA3^E%Z");
      assertEquals(":az/J~MpQvbA3^E%Z", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = "\\u0V0d)";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0V0d
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("j8c'W6yVe|I@D");
      assertEquals("j8c'W6yVe|I@D", string0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Zf@'A'3Z 9NnM");
      assertEquals("Zf@\\'A\\'3Z 9NnM", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Nd*WW%\"f");
      assertEquals("Nd*WW%\\\"f", string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(121);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "Br3Aa!1xkl");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotNull(string1);
      assertEquals("\\\\u000", string1);
  }
@Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("Btx/3zGlY$u");
      assertEquals("Btx/3zGlY$u", string0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "ZFSA");
      assertEquals("ZFSA", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("w/}V\\`>qr");
      assertEquals("w/}V`>qr", string0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      String string0 = "\\u0i%0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0i%0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      String string0 = "\\u0i%0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0i%0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3313);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "Ix:Xr*");
      assertEquals("Ix:Xr*", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      String string0 = "\\u00%0";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u00%0", string1);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("BJi `Kn-3");
      assertEquals("BJi `Kn-3", string0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("!0s");
      assertEquals("!0s", string0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "!0s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "CIfk1");
      assertEquals("CIfk1", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("(i@w\"LD");
      assertEquals("(i@w&quot;LD", string0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "BJi `Kn-3");
      assertEquals("BJi `Kn-3", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "!rg?wi#M+\rORO.;&>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("\t... ");
      assertEquals("\t... ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(34);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "'k@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("\t... ");
      assertNotNull(string0);
      assertEquals("\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "T\\/");
      assertEquals("T/", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      String string0 = "\\u00%0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00%0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("s^9O5a|A'B");
      assertEquals("s^9O5a|A\\'B", string0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("'k@");
      assertEquals("'k@", string0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("d\"~Koz0v");
      assertEquals("d\\\"~Koz0v", string0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("x5o\u0002[");
      assertEquals("x5o\\u0002[", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" \tp\r\n\b");
      assertNotNull(string0);
      assertEquals(" \\tp\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("ZFSA");
      assertEquals("ZFSA", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" \t\r;t");
      assertEquals(" \\t\\r;t", string0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("TVHq2\"@_9:?Zl<");
      assertEquals("TVHq2\\\"@_9:?Zl<", string0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript(";jRMQN]");
      assertEquals(";jRMQN]", string0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\b\"-cNu,O");
      assertEquals("\b\"-cNu,O", string0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "I6\tT(1w57j;HF5S&amp;D");
      assertEquals("I6\tT(1w57j;HF5S&amp;D", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("%0aX8\\#*");
      assertEquals("%0aX8#*", string0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("cap");
      assertEquals("cap", string0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("s9=6;V!1_");
      assertEquals("s9=6;V!1_", string0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      String string0 = "\\u0Q00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0Q00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, ";jRMQ+N]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "V`UcCdRjS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(158);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "The Writer must not be null.");
      assertEquals("The Writer must not be null.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "Wa");
      assertEquals("Wa", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      String string0 = "\\u0Q00";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0Q00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("[S,n\"G4U?[]dX}KmG4J");
      assertEquals("[S,n\"G4U?[]dX}KmG4J", string0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "0u#_H?GJ");
      assertEquals("0u#_H?GJ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1565);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "GLiDWyiW0)C^+\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("|CD%$Ej*_``>@U4}P+");
      assertNotNull(string0);
      assertEquals("|CD%$Ej*_``>@U4}P+", string0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNotNull(string1);
      assertEquals("\\u", string1);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava("\\u0J0{");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0J0{
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("B'L&m*aP3#Z");
      assertEquals("B'L&m*aP3#Z", string0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\b\"-cNu,C");
      assertEquals("\\b\\\"-cNu,C", string0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "ES z}bF/U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "Q=m'z'pG)-8$fQi");
      assertEquals("Q=m\\'z\\'pG)-8$fQi", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\\u", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("?PhYPV'*`Ac:,q@* t");
      assertEquals("?PhYPV\\'*`Ac:,q@* t", string0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("&kEhg\b7t5;AdBC");
      assertEquals("&kEhg\b7t5;AdBC", string0);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "rD^\r^pv");
      assertEquals("rD^\r^pv", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("cPhYPVAc\\:,Hq@*t");
      assertEquals("cPhYPVAc:,Hq@*t", string0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("\"");
      assertEquals("\"", string0);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("org.apache.commons.lang.StringEscapeUtils");
      assertEquals("org.apache.commons.lang.StringEscapeUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      String string0 = "^ZNc[+ss& rfb\\uoCe>0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: oCe>
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      String string0 = "^mc[+ss&1rfb\\uoCe>0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: oCe>
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "Ucirc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(115);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "mE_#x10|}0f?t_W+6U5");
      assertEquals("mE_#x10|}0f?t_W+6U5", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "oline");
      assertEquals("oline", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "cPhYPVAc\\:,Hq@*t");
      assertEquals("cPhYPVAc:,Hq@*t", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("GB`1|&R_o");
      assertEquals("GB`1|&R_o", string0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, " <O8w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "C");
      assertEquals("C", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "3t{#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "aSh");
      assertEquals("aSh", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(115);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("&amp;kEhg\b7t5;AdBC");
      assertEquals("&kEhg\b7t5;AdBC", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "|YRJ|L3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml(" \t\r\n\b");
      assertEquals(" \t\r\n\b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      String string0 = "^mX[+ss&\\ffb\\uoCe>5";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: oCe>
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(17);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("I\"{b2B1!k'P");
      assertEquals("I\\\"{b2B1!k'P", string0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "2b7]K;\".cz{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "Z*_GF$wALhDZ3bQ");
      assertEquals("Z*_GF$wALhDZ3bQ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("~g8u(0cM`D/%_$TD2");
      assertEquals("~g8u(0cM`D/%_$TD2", string0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\bPj");
      assertEquals("\bPj", string0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "q\t$-8CiND%");
      assertEquals("q\t$-8CiND%", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, ",-L ");
      assertEquals(",-L ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("A\\}k!z@kA`");
      assertEquals("A}k!z@kA`", string0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("`Uc^pSxQskxK0 ");
      assertEquals("`Uc^pSxQskxK0 ", string0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      String string0 = "lk{'\"\\uX2e~[Foi5t";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: X2e~
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "xT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(893);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "L+k<_hu5n{?r0");
      assertEquals("L+k<_hu5n{?r0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "qj,!");
      assertEquals("qj,!", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      String string0 = "k\\u)WlX'd>E&";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: )Wl
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("N");
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "2");
      assertEquals("2", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "org.apache.commons.lang.StringEscapeUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("r\"pQgb,Kh y.Hu");
      assertEquals("r&quot;pQgb,Kh y.Hu", string0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(34);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "The Writer must not be null");
      assertEquals("The Writer must not be null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml(" N\t\r\n\b");
      assertEquals(" N\t\r\n\b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "Ny");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      String string0 = "8ktBh(TgOp\\u\\>";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNotNull(string1);
      assertEquals("8ktBh(TgOp\\u\\&gt;", string1);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "8n\\g6||");
      assertEquals("8ng6||", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("p@6 /l_@%'$Ze,.]|");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("8ng6||");
      assertEquals("8ng6||", string0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" N\t\r\n\b");
      assertEquals(" N\\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("'");
      assertEquals("'", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("r\"pQgb,Kh y.Hu");
      assertNotNull(string0);
      assertEquals("r\\\"pQgb,Kh y.Hu", string0);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      String string0 = "lk{'R\\u92e[Fo5t";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 92e[
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\"0$V_j3\".6KDD");
      assertEquals("\\\"0$V_j3\\\".6KDD", string0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("h T11JAi($Lb");
      assertEquals("h T11JAi($Lb", string0);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("JGY,#\bNm]X s#i");
      assertEquals("JGY,#\bNm]X s#i", string0);
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("C.[#\\t ");
      assertEquals("C.[#\t ", string0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(98);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "SysJ]~8\r&5^B");
      assertEquals("SysJ]~8\r&5^B", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\\u0");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      String string0 = "PHy9c\\u~7TEU'TwGk8";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ~7TE
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      String string0 = "PHy9c\\u~7TEU'TwGk8";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ~7TE
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(330);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "K,gV_MZcN");
      assertEquals("K,gV_MZcN", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("2M(3h");
      assertEquals("2M(3h", string0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("182");
      assertEquals("182", string0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "v;yd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(385);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("s4hD,!GoR=03G][dZ7");
      assertEquals("s4hD,!GoR=03G][dZ7", string0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      String string0 = "\\u00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "Rho");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("243");
      assertNotNull(string0);
      assertEquals("243", string0);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      String string0 = "\\u00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "}{#\\f@J*DROg");
      assertEquals("}{#\f@J*DROg", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      String string0 = "PHy9c\\u~7TEU'TwGk8";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ~7TE
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "Unable to parse unicode value: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("l6d+8o{6rs8A'R)M6");
      assertEquals("l6d+8o{6rs8A\\'R)M6", string0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("TMG'\n)");
      assertEquals("TMG'\\n)", string0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "\"F7<u|F`H1f");
      assertEquals("\\\"F7<u|F`H1f", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("}{#\f@J*DROg");
      assertNotNull(string0);
      assertEquals("}{#\\f@J*DROg", string0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, ",aek{");
      assertEquals(",aek{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "GoU2@Q4s");
      assertEquals("GoU2@Q4s", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("*Bjj4c");
      assertEquals("*Bjj4c", string0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("h[YV5Q2j}eUAZKfpj8");
      assertEquals("h[YV5Q2j}eUAZKfpj8", string0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      String string0 = "\\ux0hK80";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: x0hK
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      String string0 = "\\ux0hK80";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: x0hK
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("60");
      assertEquals("60", string0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("8S$ owws");
      assertEquals("8S$ owws", string0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("E`kSdy=\\");
      assertEquals("E`kSdy=\\", string0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "^?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      String string0 = "\\u0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("Minimum abbreviation width with offset is 7");
      assertEquals("Minimum abbreviation width with offset is 7", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "Su'q;_P{Pt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(78);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "%{9.<C4:b#?SFg[{%");
      assertEquals("%{9.<C4:b#?SFg[{%", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "y}ou`y\\b+r");
      assertEquals("y}ou`y\b+r", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      String string0 = "\\ux0hK80";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: x0hK
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "zwj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("7%Co'*xq$X[bj6awq2e");
      assertEquals("7%Co'*xq$X[bj6awq2e", string0);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u00", string1);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "fAK838L'>");
      assertEquals("fAK838L\\'>", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, ":");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("gRx\"+");
      assertEquals("gRx\\\"+", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("92(");
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("92(", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript(":");
      assertNotNull(string0);
      assertEquals(":", string0);
  }
}
