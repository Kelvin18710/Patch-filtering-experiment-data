package org.apache.commons.lang3;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URI;
import java.util.Locale;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.net.URI;
import java.util.Enumeration;
import java.util.Locale;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializationUtils_ESTest extends SerializationUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      SerializationUtils.serialize((Serializable) null, (OutputStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Locale locale0 = Locale.UK;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("GB", locale1.getCountry());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Integer integer0 = new Integer(1);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Integer integer0 = new Integer((-2808));
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) integer0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertTrue(object0.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) mockFileInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) uRI0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The byte[] must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The InputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockFile mockFile0 = new MockFile("org.apache.commons.lang3.SerializationException", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Integer integer0 = new Integer((-2808));
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }
@Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) uRI0);
      URI uRI1 = (URI)SerializationUtils.deserialize(byteArray0);
      assertEquals("", uRI1.getRawPath());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Serializable serializable0 = SerializationUtils.clone((Serializable) locale_Category0);
      assertSame(serializable0, locale_Category0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) uRI0, (OutputStream) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, (InputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) sequenceInputStream1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      Integer integer0 = new Integer((-786));
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) integer0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) bufferedInputStream0);
      assertTrue(object0.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The byte[] must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) bufferedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The InputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Wa/9750xAjuADx>", "Wa/9750xAjuADx>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) mockFile0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      MockFile mockFile0 = new MockFile(" G2Y_?DX{[Kw");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      SerializationUtils.serialize((Serializable) locale_Category0, (OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) " G2Y_?DX{[Kw", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_Category0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
}
