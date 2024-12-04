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
      String string0 = StringEscapeUtils.unescapeJavaScript("1h.M\"jTCAi)p");
      assertEquals("1h.M\"jTCAi)p", string0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("lKe\nuMR|3VT(d2MH");
      assertEquals("lKe\nuMR|3VT(d2MH", string0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(2976);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "^]q}lQ7f;#3\r.1y");
      assertEquals("^]q}lQ7f;#3\r.1y", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "o8;L^vJBi5 )BW-g=");
      assertEquals("o8;L^vJBi5 )BW-g=", stringWriter0.toString());
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
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("Nfe>3A,q4N1_?g");
      assertEquals("Nfe&gt;3A,q4N1_?g", string0);
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
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      String string0 = "\\u/d000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: /d00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
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
  public void test_0017()  throws Throwable  {
      String string0 = "\\u/d000";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: /d00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "-itlER7.`,6;j,");
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
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "/tbk?c%bmdm");
      assertEquals("/tbk?c%bmdm", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "R\\(Mf?'Bns");
      assertEquals("R(Mf?'Bns", stringWriter0.toString());
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
      String string0 = StringEscapeUtils.escapeSql("213");
      assertEquals("213", string0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("o8;L^vJi5 )BWOg=");
      assertEquals("o8;L^vJi5 )BWOg=", string0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, ",nV");
      assertEquals(",nV", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
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
  public void test_0029()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
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
        StringEscapeUtils.escapeXml((Writer) null, "Zt2t");
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
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "xdFl5~joMsAM");
      assertEquals("xdFl5~joMsAM", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "j=2");
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
      String string0 = StringEscapeUtils.unescapeHtml("^@12U/8[{Lf#5w");
      assertEquals("^@12U/8[{Lf#5w", string0);
      assertNotNull(string0);
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
  public void test_0041()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("^@12U/8[{Lf#5w");
      assertNotNull(string0);
      assertEquals("^@12U/8[{Lf#5w", string0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      String string0 = "\\u/d000";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: /d00
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
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
        StringEscapeUtils.unescapeJava((Writer) null, "i");
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
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("eqm>)Pm]7>iEY9.f'Q");
      assertEquals("eqm>)Pm]7>iEY9.f'Q", string0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("+FvY|w2\"mMK_}z");
      assertEquals("+FvY|w2\\\"mMK_}z", string0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "Nh!GS[k#U");
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
      String string0 = StringEscapeUtils.escapeJava("\u0002Vd;G([|,=)");
      assertEquals("\\u0002Vd;G([|,=)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }
@Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("|+NgWpY3N-");
      assertEquals("|+NgWpY3N-", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("0m^(i*=|Z\\b*5k`!U@");
      assertEquals("0m^(i*=|Z\b*5k`!U@", string0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\t... ");
      assertEquals("\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\fXpS'@b!8)@&'p\"");
      assertEquals("\fXpS'@b!8)@&'p\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("FNS<aRYiZ:!}3?-");
      assertEquals("FNS<aRYiZ:!}3?-", string0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
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
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
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
      String string0 = "\\u03]0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 03]0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      String string0 = "\\u03]0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 03]0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "T;5G'; >+qV");
      assertEquals("T;5G'; >+qV", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "`9VgZd!?)q=];;Pwu");
      assertEquals("`9VgZd!?)q=];;Pwu", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
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
  public void test_0077()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("}vg28w");
      assertEquals("}vg28w", string0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "|~>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml(")B+4");
      assertEquals(")B+4", string0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "p\"0Ojr{f%`s|?");
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
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "VP)C,_\"Zd *(A2-");
      assertEquals("VP)C,_&quot;Zd *(A2-", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "969");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3465);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "WM");
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
      String string0 = StringEscapeUtils.escapeHtml("Z_t5m>.JeshqAe");
      assertEquals("Z_t5m&gt;.JeshqAe", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("[B&2~>(Po3Zo");
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("[B&2~>(Po3Zo", string1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      String string0 = "\\u03]0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 03]0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("nmf(i=\b*5!B@");
      assertEquals("nmf(i=\\b*5!B@", string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "kx`r!*R?|#>K}}M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "}>,WE:'h:T#|");
      assertEquals("}>,WE:\\'h:T#|", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\t...");
      assertNotNull(string0);
      assertEquals("\\t...", string0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "GB )K{x?fWsKtz?sRWn");
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
      String string0 = StringEscapeUtils.escapeJavaScript("VP)C,_\"Zd *(A2-");
      assertEquals("VP)C,_\\\"Zd *(A2-", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "^.ZmKaDdQ#");
      assertEquals("^.ZmKaDdQ#", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("AoS#u9.^\b^x");
      assertEquals("AoS#u9.^\b^x", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("z.3w\r`d8]wd,s");
      assertEquals("z.3w\r`d8]wd,s", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("v\"T{zK\"?y +} TyJ|W");
      assertEquals("v\\\"T{zK\\\"?y +} TyJ|W", string0);
      
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("v\"T{zK\"?y +} TyJ|W", string1);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("VkIk#d@fbKhy?}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      String string0 = "\\u[0N0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: [0N0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
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
  public void test_0129()  throws Throwable  {
      String string0 = "\\u[0N0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: [0N0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
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
  public void test_0131()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(13);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, ".e.j&gt;ylj?H1!`");
      assertEquals(".e.j&amp;gt;ylj?H1!`", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "c");
      assertEquals("c", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "0bwbwk\\i./ #ex8BR6");
      assertEquals("0bwbwki./ #ex8BR6", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "+}Lp21{tX#S73`~");
      assertEquals("+}Lp21{tX#S73`~", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("x?%jJ");
      assertEquals("x?%jJ", string0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "v\"T{zK\"?y +} TyJ|W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = StringEscapeUtils.escapeJava("0bwbwki./ #ex8BR6");
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, string0);
      assertEquals("0bwbwki./ #ex8BR6", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("#gQtb:RH+JM<h}");
      assertEquals("#gQtb:RH+JM&lt;h}", string0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "=RL$PKX yE0tDB'P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "Ky7");
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
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("c");
      assertNotNull(string0);
      assertEquals("c", string0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
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
  public void test_0154()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      String string0 = "\\u[DN0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: [DN0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNotNull(string1);
      
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, string1);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, "epsilon");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("'");
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "O-[x}$'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "Oacute");
      assertEquals("Oacute", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("G!/t2L>#~%\"n'!m");
      assertEquals("G!/t2L>#~%\\\"n\\'!m", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("TtuWsk/Etr.!");
      assertEquals("TtuWsk/Etr.!", string0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(47);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "S?N_1fRHJ\t");
      assertEquals("S?N_1fRHJ\t", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("o6p\rQ=JqD");
      assertEquals("o6p\rQ=JqD", string0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("Ttu\\sk/Etr.!");
      assertEquals("Ttusk/Etr.!", string0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "oMK ;Cd");
      assertEquals("oMK ;Cd", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("\\u0");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("#2(3%n+|y`.");
      assertEquals("#2(3%n+|y`.", string0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      String string0 = "\\u0BT 0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0BT 
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      String string0 = "\\u0B 0";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0B 0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "\t_. ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "B<hv~>%XPf)IV3U");
      assertEquals("B<hv~>%XPf)IV3U", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(47);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "e7Go|Ra_8QAE|");
      assertEquals("e7Go|Ra_8QAE|", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "<p");
      assertEquals("<p", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(5157);
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "\\$u)7]H3@=qdz\"N-");
      assertEquals("$u)7]H3@=qdz\"N-", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      String string0 = "\\u0B 0";
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0B 0
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
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
  public void test_0194()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("qJ(t`Ew85BV1 ");
      assertEquals("qJ(t`Ew85BV1 ", string0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "^G$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "org.apac7e.commonf.lang.IntHashMap");
      assertEquals("org.apac7e.commonf.lang.IntHashMap", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("TtjWskl_/Etr.!");
      assertEquals("TtjWskl_/Etr.!", string0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "/P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "185");
      assertEquals("185", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "qJ(t`Ew)85BV1 ");
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
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertEquals("\\u00", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "8501");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("macr");
      assertNotNull(string0);
      assertEquals("macr", string0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = "\\u0db ";
      StringWriter stringWriter0 = new StringWriter(1937);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0db 
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
      String string0 = "\\u";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, string0);
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
      String string0 = StringEscapeUtils.escapeJavaScript("u;s[l,S!-|.nZ'4Lv");
      assertEquals("u;s[l,S!-|.nZ\\'4Lv", string0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("TtuWsk/Etr.!");
      assertEquals("TtuWsk/Etr.!", string0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("''");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("$u)7]H3@=qdz\"N-");
      assertEquals("$u)7]H3@=qdz\\\"N-", string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\t... ");
      assertEquals("\\t... ", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(47);
      StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "(tk=re");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("\uA30B 0");
      assertEquals("\\uA30B 0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("{mjp|(<wo");
      assertEquals("{mjp|(<wo", string0);
      assertNotNull(string0);
  }
}
