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
      String string0 = StringEscapeUtils.escapeJava("bi?RH XE4G");
      assertEquals("bi?RH XE4G", string0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("(I\"Aw\nc6");
      assertEquals("(I\"Aw\nc6", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "I#K`$APvzr7P*%j<.C");
      assertEquals("I#K`$APvzr7P*%j<.C", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("G\\qh^s");
      assertEquals("Gqh^s", string0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\\u0", string1);
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
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("X_O#sxFtzD");
      assertEquals("X_O#sxFtzD", string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript("\\uHlu000");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: Hlu0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
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
  public void test_0018()  throws Throwable  {
      String string0 = "\\uHlu000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: Hlu0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "^e5#@A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "'");
      assertEquals("'", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("'");
      assertEquals("\\'", string0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql(")<58${");
      assertEquals(")<58${", string0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("^%zdnr");
      assertEquals("^%zdnr", string0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1775);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "234");
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
      StringWriter stringWriter0 = new StringWriter();
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
      String string0 = StringEscapeUtils.escapeXml(";^'");
      assertEquals(";^&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "oW(||M_ta$&;Uf&4N<V");
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
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
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
      StringWriter stringWriter0 = new StringWriter(0);
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
      String string0 = StringEscapeUtils.escapeHtml(")<58${");
      assertNotNull(string0);
      assertEquals(")&lt;58${", string0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("kd9jl");
      assertEquals("kd9jl", string0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, ";)42b\\cz^fiJvaa");
      assertEquals(";)42bcz^fiJvaa", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      String string0 = "\\uHlu000";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: Hlu0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      String string0 = "\\u000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, string0);
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
      String string0 = StringEscapeUtils.escapeJava("F[Ez'");
      assertEquals("F[Ez'", string0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript(";^'");
      assertEquals(";^\\'", string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("2h8ad2@a\"");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
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
  public void test_0054()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1775);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1775);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "<:.i=B*}jHz{ ~]Ln");
      assertEquals("<:.i=B*}jHz{ ~]Ln", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("tL{*-`!n*z6Ad(_6");
      assertEquals("tL{*-`!n*z6Ad(_6", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("T3s");
      assertEquals("T3s", string0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("6IS\\nmW");
      assertEquals("6IS\nmW", string0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava("\\u00s+");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00s+
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertEquals("\\u00", string1);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
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
  public void test_0073()  throws Throwable  {
      String string0 = "\\u";
      StringWriter stringWriter0 = new StringWriter(114);
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, string1);
      assertEquals("\\u", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(73);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "rOCSE\"s^_/ne8QH{");
      assertEquals("rOCSE&quot;s^_/ne8QH{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      String string0 = "\\ue0s+";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: e0s+
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\\u", string1);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertEquals("\\u", string1);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(114);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "957");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "The Writer must not be null");
      assertEquals("The Writer must not be null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("E+[sG +{*^");
      assertEquals("E+[sG +{*^", string0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(121);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "h4unR?\"OZt03n'.{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "isin");
      assertEquals("isin", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "!Vs8y");
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
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(73);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
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
  public void test_0095()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("6I6S44L\n#W");
      assertEquals("6I6S44L\n#W", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(117);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(76);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\ts.. ");
      assertEquals("\ts.. ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(79);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "tL{*-`!n\\*z6Ad(_6");
      assertEquals("tL{*-`!n*z6Ad(_6", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      String string0 = "\\ue0s+";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: e0s+
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
      String string0 = "\\u";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, string0);
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
      String string0 = StringEscapeUtils.escapeJava("vj-WW'!b:!z4Mu+c");
      assertEquals("vj-WW'!b:!z4Mu+c", string0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Y%|;H'+tXb+'//");
      assertEquals("Y%|;H\\'+tXb+\\'//", string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("F*\"dt02du? ");
      assertEquals("F*\\\"dt02du? ", string0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\ts.. ");
      assertEquals("\\ts.. ", string0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("6I6S4xL\b#W");
      assertEquals("6I6S4xL\\b#W", string0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "$Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "ecirc");
      assertEquals("ecirc", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" HU#82s$@ \u0004WZ)");
      assertEquals(" HU#82s$@ \\u0004WZ)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "T\"wX6_Rd,-4");
      assertEquals("T\"wX6_Rd,-4", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("6I6S44L\n#W");
      assertNotNull(string0);
      assertEquals("6I6S44L\\n#W", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("r(py>a!N[cUa:");
      assertEquals("r(py>a!N[cUa:", string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("r(>a!9N[cUa:");
      assertEquals("r(>a!9N[cUa:", string0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("9LG`9=s9h=XB0y^jo\b");
      assertEquals("9LG`9=s9h=XB0y^jo\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("^t)%(NW'wh\\!D.I_r}");
      assertEquals("^t)%(NW'wh!D.I_r}", string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      String string0 = "/-(?0[tu\\u'=#LaL>";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: '=#L
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "^t)%8NW'wa!vD.I_}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      String string0 = "/-(?0[tu\\u'=#LaL>";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: '=#L
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "r(>a!9[cUa:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(270);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(389);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "di4+{o");
      assertEquals("di4+{o", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("^t)%8NW'wa!vD.I_}");
      assertEquals("^t)%8NW'wa!vD.I_}", string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("^t)%(NW'wh!D.I_r}");
      assertNotNull(string0);
      assertEquals("^t)%(NW''wh!D.I_r}", string0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("238");
      assertEquals("238", string0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
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
  public void test_0145()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "/#z>&@gFj\"9O708Q<@-");
      assertEquals("/#z>&@gFj\"9O708Q<@-", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("r(>a!N[cUa:");
      assertEquals("r(&gt;a!N[cUa:", string0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(270);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "klQL/2`");
      assertEquals("klQL/2`", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "(mqwqOz3Oq~o6K;+/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(270);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "Lambda");
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
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("}vm/%[jCI|z'$V- ");
      assertEquals("}vm/%[jCI|z'$V- ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(61);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "^hf<rpBhUqT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "*\\s1bRb>8h!Ix3Cm,Z5");
      assertEquals("*s1bRb>8h!Ix3Cm,Z5", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      String string0 = "\\u,6&";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      StringWriter stringWriter0 = new StringWriter(343);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ,6&a
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      String string0 = "\\u000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("^t)%(NW'wh!D.I_r}");
      assertEquals("^t)%(NW\\'wh!D.I_r}", string0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "/#z>&@gFj\"9O708Q<@-");
      assertEquals("/#z>&@gFj\\\"9O708Q<@-", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("qH] Kri5!j>\"qr|");
      StringWriter stringWriter0 = new StringWriter(123);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
      assertEquals("qH] Kri5!j>\"qr|", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "+b`7Oc~");
      assertEquals("+b`7Oc~", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "Unable to parse unicode value: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("l`_>;h");
      assertEquals("l`_>;h", string0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("4*Ch<j|$]");
      assertEquals("4*Ch<j|$]", string0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "?\"");
      assertEquals("?\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("wvhdpWLKq'\"9uX \\s1");
      assertEquals("wvhdpWLKq'\"9uX s1", string0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      String string0 = "\\uR0";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
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
      String string0 = "\\u0 00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0 00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
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
  public void test_0189()  throws Throwable  {
      String string0 = "\\u0 00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0 00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "#(q%");
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
      StringWriter stringWriter0 = new StringWriter(2333);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "org.apache.commons.lang.Entities");
      assertEquals("org.apache.commons.lang.Entities", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "\\uR0");
      assertEquals("\\uR0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      String string0 = "\\uR0";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\\uR0", string1);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("BnW2'B&>o(");
      assertEquals("BnW2''B&>o(", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("Zl!+\tG%/EMU058$");
      assertEquals("Zl!+\tG%/EMU058$", string0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "3{\"wHQbEiB7");
      assertEquals("3{\"wHQbEiB7", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "X6P%T");
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
      String string0 = StringEscapeUtils.escapeXml("Upsilon");
      assertEquals("Upsilon", string0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2333);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "*/B'$P+:X009Ha");
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
      StringWriter stringWriter0 = new StringWriter(40);
      String string0 = "\\u0";
      StringEscapeUtils.escapeXml((Writer) stringWriter0, string0);
      assertEquals("\\u0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(17);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "8971");
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
      String string0 = StringEscapeUtils.unescapeHtml("_ 6p$f1Qy3sOH#mu");
      assertNotNull(string0);
      assertEquals("_ 6p$f1Qy3sOH#mu", string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, (String) null);
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
      String string0 = StringEscapeUtils.escapeHtml("l`_>;h");
      assertEquals("l`_&gt;;h", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\uR0");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = "\\u0 00";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0 00
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
        StringEscapeUtils.unescapeJava((Writer) null, "5\"?ODXS~[+bV|%&A&");
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
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("wvhdpWLKq'\"9uZ s1");
      assertEquals("wvhdpWLKq'\\\"9uZ s1", string0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("ly -+(w}\"B'P6^&I4");
      assertEquals("ly -+(w}\\\"B\\'P6^&I4", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
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
  public void test_0224()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(40);
      String string0 = "\\u0";
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("7r dO=Z#PO6q:%=f P");
      assertEquals("7r dO=Z#PO6q:%=f P", string0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\n");
      assertEquals("\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("7r dO#Z#PO6q:%=f P");
      assertEquals("7r dO#Z#PO6q:%=f P", string0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("7rv(^OZ#O\r8>q.N P");
      assertEquals("7rv(^OZ#O\r8>q.N P", string0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("&`3JFzn#fFh|60~");
      assertEquals("&`3JFzn#fFh|60~", string0);
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
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
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
      String string0 = "\\u0`00";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0`00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      String string0 = "\\u0`0o";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0`0o
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "913");
      assertEquals("913", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("7r dO=Z#PO6q:%= P");
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, string0);
      assertEquals("7r dO=Z#PO6q:%= P", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "7r dO=Z#PO6\\q:%=P");
      assertEquals("7r dO=Z#PO6q:%=P", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, ":Fr=QI=,$X!}G!#[uA6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      String string0 = "\\u)0";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u)0", string1);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("@\";pQju8");
      assertEquals("@\";pQju8", string0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("Ct(B");
      assertEquals("Ct(B", string0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
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
  public void test_0256()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "Ct(B");
      assertEquals("Ct(B", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("5MH{2@x/nbl?]4'3");
      assertEquals("5MH{2@x/nbl?]4&apos;3", string0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "8756");
      assertEquals("8756", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
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
  public void test_0261()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(55);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "k>X[pal&8:no*E.ym}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1918);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
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
  public void test_0268()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("5zMH{I`2@>nbl?]4'3");
      assertEquals("5zMH{I`2@&gt;nbl?]4'3", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      String string0 = "\\u0`0o";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0`0o
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("5zMH{2@>nbl?]4'3");
      assertEquals("5zMH{2@>nbl?]4'3", string0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("@\";pQju8");
      assertEquals("@\\\";pQju8", string0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" \t\r\n\b");
      assertEquals(" \\t\\r\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "5zMH{2@>nbl?]4'3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "`-d}BJy)WQcS<HEjn5w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("5zMH{I`2@>nbl?]4'3");
      assertEquals("5zMH{I`2@>nbl?]4\\'3", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4095);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("dF7 a)KH]h[b");
      assertEquals("dF7 a)KH]h[b", string0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("=Pl");
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("=Pl", string1);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "(|iNIU#zu");
      assertEquals("(|iNIU#zu", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("a9[m0/:ExoLf");
      assertEquals("a9[m0/:ExoLf", string0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      String string0 = "\\u00)0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00)0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      String string0 = "\\u00)0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00)0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "sup2");
      assertEquals("sup2", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u", string1);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("#-,*@ $0/Mo&EW1BU");
      assertEquals("#-,*@ $0/Mo&EW1BU", string0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("4&2{|");
      assertEquals("4&2{|", string0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
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
  public void test_0308()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("Unable to parse unicode value: ");
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, string0);
      assertEquals("Unable to parse unicode value: ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "&7}LLw|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
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
  public void test_0315()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(92);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
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
  public void test_0319()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("''");
      assertNotNull(string0);
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "c5z\\)6]2]K^$");
      assertEquals("c5z)6]2]K^$", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "\\u00)0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 00)0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "8");
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
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Z^o#VuPC7'te)");
      assertEquals("Z^o#VuPC7\\'te)", string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("&*W#T09C#3Oe-b\"#u>");
      assertEquals("&*W#T09C#3Oe-b\\\"#u>", string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
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
  public void test_0332()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(14);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(133);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "P");
      assertEquals("P", stringWriter0.toString());
  }
}
