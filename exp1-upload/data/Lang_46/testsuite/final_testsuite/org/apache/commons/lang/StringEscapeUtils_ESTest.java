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
      String string0 = StringEscapeUtils.unescapeJava("Js:2[%%ADISx\bh");
      assertEquals("Js:2[%%ADISx\bh", string0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\n");
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "]U0pS\rcq");
      assertEquals("]U0pS\rcq", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("Rth~-lP5\"PQ<eWv\\YS");
      assertEquals("Rth~-lP5\"PQ<eWvYS", string0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("cent");
      assertEquals("cent", string0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("z");
      assertEquals("z", string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      String string0 = "\\u;1@R00^k0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ;1@R
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "Ei``Dqc~mcG<.D\"p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      String string0 = "\\u;1@R00^k0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ;1@R
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
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
  public void test_0018()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2009);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "'6");
      assertEquals("'6", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\u00^k0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00^k
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "5UrWgBS_");
      assertEquals("5UrWgBS_", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("org.apache.commons.lang.StringEscapeUtils");
      assertEquals("org.apache.commons.lang.StringEscapeUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "k  dml`FO__h8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(92);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("*ZhBbj*~ci%4it74");
      assertEquals("*ZhBbj*~ci%4it74", string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "5UrWgBS_");
      assertEquals("5UrWgBS_", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
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
  public void test_0034()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
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
  public void test_0037()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("?0e<");
      assertEquals("?0e&lt;", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
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
  public void test_0046()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("s'g+H?B'nNM\"Wl n,");
      assertEquals("s\\'g+H?B\\'nNM\\\"Wl n,", string0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("'");
      assertEquals("'", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("ACuCjrXP\"j +[9");
      assertEquals("ACuCjrXP\\\"j +[9", string0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("P2@6K|");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("-D[*U8|:JWaa%");
      assertEquals("-D[*U8|:JWaa%", string0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("4,PX");
      assertEquals("4,PX", string0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(110);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "2.Yc[F-|UmBPj");
      assertEquals("2.Yc[F-|UmBPj", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("iq@\\',}ve'eLcJ+mh");
      assertEquals("iq@',}ve'eLcJ+mh", string0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "\\u000");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2080);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("1ww(8&jZi!_7b$N");
      assertEquals("1ww(8&jZi!_7b$N", string0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
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
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      String string0 = "\\u70\"00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 70\"0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
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
  public void test_0075()  throws Throwable  {
      String string0 = "\\u70\"00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 70\"0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      String string0 = "\\u70\"00";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 70\"0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
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
  public void test_0078()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(92);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "24P{Wzc`X");
      assertEquals("24P{Wzc`X", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("iq@',}ve'eLcJ+mh");
      assertEquals("iq@'',}ve''eLcJ+mh", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1540);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
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
  public void test_0086()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "968");
      assertEquals("968", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("Beta");
      assertEquals("Beta", string0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1540);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "\\u000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "wZA`g)iW:)x");
      assertEquals("wZA`g)iW:)x", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(116);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "7>Dd8 YUW{,AkukZ1Mt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("p%hI");
      assertNotNull(string0);
      assertEquals("p%hI", string0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
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
  public void test_0098()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("2.c[F-|UmxBP");
      assertEquals("2.c[F-|UmxBP", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "960");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("EyYof>'njB#Sc?#!");
      assertEquals("EyYof>'njB#Sc?#!", string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("q@',}ve'eLcJ+mh");
      assertEquals("q@\\',}ve\\'eLcJ+mh", string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2121);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\n");
      assertNotNull(string0);
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      String string0 = "\\u00vP";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00vP
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
      assertNotNull(string1);
  }
@Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("}qS\"=*|e'34>FaUvs");
      assertEquals("}qS\\\"=*|e'34>FaUvs", string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("A;V%=3");
      assertEquals("A;V%=3", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("Gm1=&s\bE");
      assertEquals("Gm1=&s\bE", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("&t@@eP5\\n23C=");
      assertEquals("&t@@eP5\n23C=", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "dZm#_*%eM\f(0G! HKl]");
      assertEquals("dZm#_*%eM\f(0G! HKl]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "K{bYh,Gq'853L\")");
      assertEquals("K{bYh,Gq'853L\")", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("5 Qz20;v=pl\\X`dcV");
      assertEquals("5 Qz20;v=plX`dcV", string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      String string0 = "B\\uzw&Iz";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: zw&I
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "Chi");
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
      String string0 = "B\\uzw&Iz";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: zw&I
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "((");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "3f7");
      assertEquals("3f7", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "\\u000";
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, string0);
      assertEquals("\\u000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "-iqNc3R\\oY");
      assertEquals("-iqNc3RoY", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      String string0 = "\\uW000";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertEquals("\\uW000", string1);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("((");
      assertEquals("((", string0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "VjK3klj}6W}}Xi\"r;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "((");
      assertEquals("((", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml(",H0K}J 0*(K");
      assertEquals(",H0K}J 0*(K", string0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "/}\"hlpc#^<z|2N");
      assertEquals("/}&quot;hlpc#^&lt;z|2N", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "FW$`@7&}opR");
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
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "{4{TK-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("J0Y mwT1*'(-");
      assertEquals("J0Y mwT1*'(-", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "c@Lb&1}:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("q9_ 75hX&y");
      assertNotNull(string0);
      assertEquals("q9_ 75hX&amp;y", string0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      String string0 = "B\\uzw&Iz";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: zw&I
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "6sddBd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "((");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("J0Y mwT1*'(-");
      assertEquals("J0Y mwT1*\\'(-", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "K{bYh,Gq'853L\")");
      assertEquals("K{bYh,Gq'853L\\\")", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "+?_U#2>gZ\"~ LGbeZ");
      assertEquals("+?_U#2>gZ\\\"~ LGbeZ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("r`e$;`FyOCR'|8_+z");
      assertEquals("r`e$;`FyOCR\\'|8_+z", string0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript(":P`<<m$8");
      assertEquals(":P`<<m$8", string0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\\&");
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("|VKYFonW\tD,Ui|s");
      assertEquals("|VKYFonW\tD,Ui|s", string0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("\"HfrLe$N+Iq'P2/");
      assertEquals("\"HfrLe$N+Iq'P2/", string0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      String string0 = "\\u00\\0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00\\0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "%6:_Si0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      String string0 = "\\u00\\0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00\\0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "=fN%<fXp\"");
      assertEquals("=fN%<fXp\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, ";=Le')AHrOYp");
      assertEquals(";=Le')AHrOYp", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "M");
      assertEquals("M", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      String string0 = "\\u00\\0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00\\0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("harr");
      assertEquals("harr", string0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(46);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, ">ZDm@/Q%PZP9(\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "\"9]]/7,X");
      assertEquals("\"9]]/7,X", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "Y");
      assertEquals("Y", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "zeta");
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
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("?3Z");
      assertEquals("?3Z", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(46);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("8970");
      assertEquals("8970", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "\u0D0EU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("C&u`L.'E(E\"t;lNz[");
      assertEquals("C&u`L.'E(E\\\"t;lNz[", string0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.escapeXml(string0);
      String string2 = StringEscapeUtils.escapeJava(string1);
      assertNotNull(string2);
      assertEquals("\\\\u00", string2);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "Yb6xC");
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
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("rO\u0003~K`0");
      assertEquals("rO\\u0003~K`0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "upsilon");
      assertEquals("upsilon", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("'DMR9%=\b)hc*\"^");
      assertEquals("\\'DMR9%=\\b)hc*\\\"^", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("QYZi6\nAJ");
      assertEquals("QYZi6\\nAJ", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3553);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "$-.s\b#}1\"vAU|gXc,c");
      assertEquals("$-.s\b#}1\"vAU|gXc,c", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\rg.apache.commons.lang.StringEsc<peUtils");
      assertEquals("\rg.apache.commons.lang.StringEsc<peUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\\u");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("bf_N-n,s%ti##");
      assertEquals("bf_N-n,s%ti##", string0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("0wUgWp%|F\"rY/h|QN?");
      assertEquals("0wUgWp%|F\"rY/h|QN?", string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      String string0 = "an%/-:\\u-=]bwt;.";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: -=]b
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      String string0 = "anb/-:\\u*=]bwt;.";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: *=]b
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(12);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "The Writer must not be null.");
      assertEquals("The Writer must not be null.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(26);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\/(XCM(-'YCALW%u4T");
      assertEquals("/(XCM(-'YCALW%u4T", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      String string0 = "anb/-:\\u*-=]bwt;.";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: *-=]
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("\"iA8%");
      assertEquals("\"iA8%", string0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(10);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
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
  public void test_0251()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "K7wA'6zo<fW?A/K#");
      assertEquals("K7wA'6zo<fW?A/K#", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("lXl}6'#*{");
      assertEquals("lXl}6&apos;#*{", string0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "The Writer must not be null.");
      assertEquals("The Writer must not be null.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
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
  public void test_0256()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(47);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
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
  public void test_0259()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "217");
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
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("]`hsvFK'$aQ{;h#W");
      assertEquals("]`hsvFK'$aQ{;h#W", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, ",W-qcJFcN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("]`hsvFK'$aQ{;h#W");
      assertEquals("]`hsvFK\\'$aQ{;h#W", string0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("?9k7/}jxZB0'x0eB>Rz");
      assertEquals("?9k7/}jxZB0'x0eB>Rz", string0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("4s&S9?q#\"wU}yl");
      assertEquals("4s&S9?q#\\\"wU}yl", string0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(54);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "217");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1289);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "|i7.1ORS_#ibFnU^o");
      assertEquals("|i7.1ORS_#ibFnU^o", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\uB000");
      assertEquals("\\uB000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(9);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotNull(string1);
      assertEquals("\\\\u", string1);
  }
@Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("F#>}% Sa'd&");
      assertEquals("F#>}% Sa\\'d&", string0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("aq%-G,C83!HzR_@");
      assertEquals("aq%-G,C83!HzR_@", string0);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("|[g')|u\b|");
      assertEquals("|[g')|u\b|", string0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("qr%GlW5w+&`kx)HLQne");
      assertEquals("qr%GlW5w+&`kx)HLQne", string0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      String string0 = "\\u+000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("\u0000", string1);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      String string0 = "\\u00@0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00@0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "8201");
      assertEquals("8201", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "PH7-|.jc>o`}X8:c");
      assertEquals("PH7-|.jc>o`}X8:c", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\u00");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      String string0 = "\\u00@0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00@0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql(" y3b,+");
      assertEquals(" y3b,+", string0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml(" y3b,+");
      assertEquals(" y3b,+", string0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "q%-G,C8!HzR_@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "itPll<");
      assertEquals("itPll<", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("F#>}% Sa'd&");
      assertEquals("F#&gt;}% Sa&apos;d&amp;", string0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
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
  public void test_0314()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(718);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("xW7#`y<");
      assertNotNull(string0);
      assertEquals("xW7#`y<", string0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, " y3b,+");
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
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "!u3g5+4\\p{)kw\"{");
      assertEquals("!u3g5+4p{)kw\"{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava("\\u :000");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value:  :00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(80);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
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
  public void test_0326()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("'5E");
      assertEquals("'5E", string0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("!u3g5+4p{)kw\"{");
      assertEquals("!u3g5+4p{)kw\\\"{", string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(")\fp4b*pKV");
      assertEquals(")\\fp4b*pKV", string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("w\bp");
      assertEquals("w\\bp", string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1746);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "aq%-G,C83!HzR_@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "0'}[in");
      assertEquals("0\\'}[in", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\u0000");
      assertEquals("\\u0000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "\\u00");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      String string2 = StringEscapeUtils.escapeJavaScript(string1);
      assertEquals("\\\\u000", string2);
      assertNotNull(string2);
  }
@Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("c%;: C");
      assertEquals("c%;: C", string0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "bHz-#J:/' ?ab~:F");
      assertEquals("bHz-#J:/' ?ab~:F", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "[5&\fH|hLZ3N[qp");
      assertEquals("[5&\fH|hLZ3N[qp", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\r");
      assertEquals("\r", string0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "2V|2!&_Gc`n$]%:@Jpg");
      assertEquals("2V|2!&_Gc`n$]%:@Jpg", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      String string0 = "z1n2~4O\\uQL\"-9\"+\\|";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: QL\"-
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      String string0 = "zzm1n2~4O\\uQL\"-9\"+\\|";
      StringWriter stringWriter0 = new StringWriter();
      String string1 = StringEscapeUtils.unescapeXml(string0);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: QL\"-
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      String string0 = "z1n2~4O\\uQL\"-9\"+\\|";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: QL\"-
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
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
  public void test_0358()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "B0-3qC.<jVn/Uyo&g");
      assertEquals("B0-3qC.<jVn/Uyo&g", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\u0");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "The Writer must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("c%;: C");
      assertEquals("c%;: C", string0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4354);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "^m4.m=QsSr.^-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, ":j/fbD");
      assertEquals(":j/fbD", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      String string0 = "z1n2~4O\\uQL\"-9\"+\\|";
      String string1 = StringEscapeUtils.escapeXml(string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "8764");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
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
  public void test_0376()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml(" \t\r\n\b");
      assertNotNull(string0);
      assertEquals(" \t\r\n\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "hKsFp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml(" \t\r\n\b");
      assertEquals(" \t\r\n\b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("IYzR\\e+1e/3Dkxr9");
      assertEquals("IYzRe+1e/3Dkxr9", string0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, "z1n2~4O\\uQLs\"-9\"+\\|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: QLs\"
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      String string0 = "z1n2~4O\\uQLs\"-9\"+\\|";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("z1n2~4O\\\\uQLs\\\"-9\\\"+\\\\|", string1);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("eV'.OKDl");
      assertEquals("eV'.OKDl", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\u0000");
      assertNotNull(string0);
      assertEquals("\\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "8764");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("tW!k|LQS]A}%5'xw");
      assertEquals("tW!k|LQS]A}%5\\'xw", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "RPNE4+a\"-a94z5c");
      assertEquals("RPNE4+a\\\"-a94z5c", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript(":NI");
      assertEquals(":NI", string0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, ",:0HORTi(*\b");
      assertEquals(",:0HORTi(*\b", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("rz#uR]:4l'\\nx");
      assertEquals("rz#uR]:4l'\nx", string0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("'3+v&*f@qs]zs!\\2 ~");
      assertEquals("'3+v&*f@qs]zs!2 ~", string0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("\u0000");
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("r81E-{BHM:");
      assertEquals("r81E-{BHM:", string0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("'3+v&*fqslzs! ~");
      assertEquals("&apos;3+v&amp;*fqslzs! ~", string0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      String string0 = "\\u1)000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 1)00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
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
  public void test_0412()  throws Throwable  {
      String string0 = "\\u1)000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 1)00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      String string0 = "\\u1)000";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 1)00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "Unable to parse unicode value: ");
      assertEquals("Unable to parse unicode value: ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      String string2 = StringEscapeUtils.escapeSql(string1);
      assertTrue(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, ">N+ipbN@y.;?N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "The Writer must not be null.");
      assertEquals("The Writer must not be null.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "p6ecHVi#)W,}qp/6&lt;C");
      assertEquals("p6ecHVi#)W,}qp/6&amp;lt;C", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "org.apache.commons.lang.Entities$TreeEntityMap");
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
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "8727");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "'3+v&*f@qs]zs!\\2 ~");
      assertEquals("'3+v&*f@qs]zs!2 ~", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, ">bT<S-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("'3+v&*fqslzs! ~");
      assertEquals("\\'3+v&*fqslzs! ~", string0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(">UMH<n\"'>");
      assertEquals(">UMH<n\\\"'>", string0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("rz#uR]:4l'\nx");
      assertEquals("rz#uR]:4l\\'\\nx", string0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("/F\t00-%");
      assertEquals("/F\\t00-%", string0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("/F\u1000");
      assertEquals("/F\\u1000", string0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "_.#)Q#,ef@!<>C?o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("'3+v&*f@qs]zs!\u0002 ~");
      assertNotNull(string0);
      assertEquals("\\'3+v&*f@qs]zs!\\u0002 ~", string0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "''");
      assertEquals("''", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("/\bt1qA0");
      assertNotNull(string0);
      assertEquals("/\\bt1qA0", string0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "182");
      assertEquals("182", stringWriter0.toString());
  }
}
