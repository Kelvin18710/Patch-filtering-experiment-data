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
      String string0 = StringEscapeUtils.unescapeJava("4vhb',S'@Tt0$[nS]v");
      assertEquals("4vhb',S'@Tt0$[nS]v", string0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\t");
      assertEquals("\t", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("L'81>IaG+");
      assertEquals("L'81>IaG+", string0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("\\0");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
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
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("h! riter @ust\not be null");
      assertEquals("h! riter @ust\not be null", string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = "\\u07x0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 07x0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      String string0 = "\\u07x0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 07x0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "8659");
      assertEquals("8659", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(389);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\0");
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u00", string1);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("t-7UBd K");
      assertEquals("t-7UBd K", string0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertEquals("\\u00", string1);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "y4ivlN+V.G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(80);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "org.apache.commons.lang.StringEscapeUtils");
      assertEquals("org.apache.commons.lang.StringEscapeUtils", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("`|V^XIv6hK%+YB6");
      assertEquals("`|V^XIv6hK%+YB6", string0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "t-7IB K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "t-7UBd K");
      assertEquals("t-7UBd K", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
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
  public void test_0035()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "The Writer must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      String string0 = "\\u07x0";
      StringWriter stringWriter0 = new StringWriter(80);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 07x0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("CP$,3DD]wK;M`}ERp=<");
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
  public void test_0043()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("]'fs:nX~G:");
      assertEquals("]\\'fs:nX~G:", string0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("h! riter @ust\not be null");
      assertEquals("h! riter @ust\\not be null", string0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" \t\r\n");
      assertEquals(" \\t\\r\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(" -?\n\b");
      assertEquals(" -?\\n\\b", string0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "|(qS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("<DVZiI1\"KoE'");
      assertNotNull(string0);
      assertEquals("<DVZiI1\\\"KoE'", string0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\u0000");
      assertNotNull(string0);
      assertEquals("\\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3134);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava(")\\]ct{'v+e1lS*");
      assertEquals(")]ct{'v+e1lS*", string0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\uE000");
      assertEquals("\uE000", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("%");
      assertEquals("%", string0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      String string0 = "\\ux000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: x000
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
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
  public void test_0071()  throws Throwable  {
      String string0 = "\\ux000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: x000
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "224");
      assertEquals("224", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "FW)#FY/z=F");
      assertEquals("FW)#FY/z=F", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("}mK+ACZ:ywP{)'");
      assertEquals("}mK+ACZ:ywP{)'", string0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "ordf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(23);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml(".8HtgmA-l");
      assertEquals(".8HtgmA-l", string0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, ")=lc~fgJBxIZv`p");
      assertEquals(")=lc~fgJBxIZv`p", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "nS&;d=-");
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
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "I*eDe*#Bbr$XBUYT8[R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("H");
      assertNotNull(string0);
      assertEquals("H", string0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "i  /67");
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
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\u000");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      String string0 = "\\uu100";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: u100
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNotNull(string1);
      assertEquals("\\u0", string1);
      
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, string1);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(470);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
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
  public void test_0099()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(",j4'j5G;a AF/x0T(");
      assertEquals(",j4'j5G;a AF/x0T(", string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
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
  public void test_0103()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(23);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "lrm");
      assertEquals("lrm", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("w dx[)'Pi.nH%?Bga");
      assertNotNull(string0);
      assertEquals("w dx[)\\'Pi.nH%?Bga", string0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(114);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "O*pcD\"Bu.de");
      assertEquals("O*pcD\\\"Bu.de", stringWriter0.toString());
  }
}
