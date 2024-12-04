package org.apache.commons.lang3;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.io.SerializablePermission;
import java.util.Locale;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.URI;
import java.net.URL;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import java.io.PipedInputStream;
import java.util.LinkedList;
import java.io.FilterOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializationUtils_ESTest extends SerializationUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale_FilteringMode0);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertSame(object0, locale_FilteringMode0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBSTITUTION_PERMISSION;
      Serializable serializable0 = SerializationUtils.clone((Serializable) serializablePermission0);
      assertTrue(serializable0.equals((Object)serializablePermission0));
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0, false);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) mockPrintStream0);
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
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-879), (byte)30);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) bufferedInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      MockPrintStream mockPrintStream0 = new MockPrintStream("v*iV uO.xv?z}@?yzU3");
      SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) mockPrintStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("v*iV uO.xv?z}@?yzU3");
      Object object0 = SerializationUtils.deserialize((InputStream) mockFileInputStream0);
      assertSame(object0, locale_FilteringMode0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("v*iV uO.xv?z}@?yzU3");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("v*iV uO.xv?z}@?yzU3");
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) mockFileInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, 512);
      SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
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
  public void test_0010()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.StreamCorruptedException: invalid stream header: 00000000
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
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
  public void test_0012()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) "org.apache.commons.lang3.SerializationException");
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertEquals("org.apache.commons.lang3.SerializationException", object0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) "org.apache.commons.lang3.SerializationException");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertEquals("org.apache.commons.lang3.SerializationException", object0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      Serializable serializable0 = SerializationUtils.clone((Serializable) uRI0);
      assertNotSame(uRI0, serializable0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1325), 1174);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) dataInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1325), (-1325));
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = MockURI.toURL(uRI0);
      File file0 = MockFile.createTempFile("8wp;43 @", "8wp;43 @");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      SerializationUtils.serialize((Serializable) uRL0, (OutputStream) mockPrintStream0);
      assertNull(uRL0.getUserInfo());
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
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
  public void test_0025()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.StreamCorruptedException: invalid stream header: 00000000
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
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
  public void test_0027()  throws Throwable  {
      Integer integer0 = new Integer(1);
      File file0 = MockFile.createTempFile("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
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
  public void test_0028()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      File[] fileArray0 = MockFile.listRoots();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) fileArray0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      Locale locale0 = Locale.US;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertSame(locale0, object0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertSame(object0, locale0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3000), 68);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test_0036()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Object[] objectArray0 = linkedList0.toArray();
      File file0 = MockFile.createTempFile("org.apache.commons.lang3.SerializationException", "$1vt~B6*+lE", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      SerializationUtils.serialize((Serializable) objectArray0, (OutputStream) mockFileOutputStream0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
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
  public void test_0039()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      Integer integer0 = new Integer((-2710));
      MockFile mockFile0 = new MockFile("x&Bn33&XMqy}", "x&Bn33&XMqy}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
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
  public void test_0042()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }
@Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("deu", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 474);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) pushbackInputStream0);
      assertEquals("de", object0.toString());
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Serializable serializable0 = SerializationUtils.clone((Serializable) locale0);
      assertSame(locale0, serializable0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(dataOutputStream0, 2426);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) linkedList0, (OutputStream) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("vO");
      linkedList0.add(locale_LanguageRange0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.NotSerializableException: java.util.Locale$LanguageRange
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test_0057()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
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
  public void test_0059()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1439), 458);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
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
  public void test_0061()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockFile mockFile0 = new MockFile("o.]xLxG8k\"w5/Z_kf?x", "ac%W_y'");
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
  public void test_0062()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("8yrTLd");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      SerializationUtils.serialize((Serializable) null, (OutputStream) filterOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("zh", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) false, (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2863), 3609);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
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
  public void test_0071()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(712);
      SerializationUtils.serialize((Serializable) integer0, (OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005sr\u0000\u0011java.lang.Integer\u0012\u2824\uFFFD\uFFFD\uFFFD8\u0002\u0000\u0001I\u0000\u0005valuexr\u0000\u0010java.lang.Number\uFFFD\uFFFD\uFFFD\u001D\u000B\uFFFD\uFFFD\uFFFD\u0002\u0000\u0000xp\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
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
  public void test_0073()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test_0074()  throws Throwable  {
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
  public void test_0075()  throws Throwable  {
      MockFile mockFile0 = new MockFile("The byte[] must not be null");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) (byte) (-40), (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      File file0 = MockFile.createTempFile("\"_C0YD9Rmh5ma", "\"_C0YD9Rmh5ma");
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) file0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Locale locale1 = SerializationUtils.clone(locale0);
      assertEquals("fr", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertSame(locale0, object0);
  }
@Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertSame(object0, locale0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test_0084()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Integer integer0 = new Integer((-1549));
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) integer0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1549), 946);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) bufferedInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(466);
      pipedOutputStream0.connect(pipedInputStream0);
      SerializationUtils.serialize((Serializable) null, (OutputStream) pipedOutputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) pipedInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, 550);
      SerializationUtils.serialize((Serializable) "", (OutputStream) bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) linkedList1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      LinkedList linkedList2 = (LinkedList)SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertEquals(0, linkedList2.size());
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
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
  public void test_0091()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
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
  public void test_0093()  throws Throwable  {
      Integer integer0 = new Integer(130);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("d~SaSG92QiZ4H^", true);
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
  public void test_0094()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) serializablePermission0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      SerializationUtils.serialize((Serializable) serializablePermission0, (OutputStream) bufferedOutputStream0);
      assertEquals("(\"java.io.SerializablePermission\" \"enableSubclassImplementation\")", serializablePermission0.toString());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("zh", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Locale locale0 = new Locale("pnPKLLns?0ewsR6K", "pnPKLLns?0ewsR6K");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1672), 732);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test_0102()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
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
  public void test_0104()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
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
  public void test_0106()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("c9GG3w3w>", true);
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
  public void test_0107()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) serializablePermission0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Locale locale0 = new Locale("org.apache.commons.lang3.SerializationUtils", "T_L[pm;<C");
      File file0 = MockFile.createTempFile("org.apache.commons.lang3.SerializationUtils", "org.apache.commons.lang3.SerializationUtils");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      SerializationUtils.serialize((Serializable) locale0, (OutputStream) mockPrintStream0);
      assertEquals("org.apache.commons.lang3.serializationutils_T_L[PM;<C", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertEquals("en_CA", object0.toString());
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-121), 1118);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) pushbackInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Locale.FilteringMode[] locale_FilteringModeArray0 = Locale.FilteringMode.values();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringModeArray0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
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
  public void test_0118()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test_0119()  throws Throwable  {
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
  public void test_0120()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
}
