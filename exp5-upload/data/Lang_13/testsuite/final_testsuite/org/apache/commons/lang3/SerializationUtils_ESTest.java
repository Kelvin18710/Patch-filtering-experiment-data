package org.apache.commons.lang3;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.SerializablePermission;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import java.io.DataInputStream;
import java.net.URI;
import org.evosuite.runtime.mock.java.io.MockFile;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import java.io.BufferedInputStream;
import java.io.PushbackInputStream;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.apache.commons.lang3.SerializationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializationUtils_ESTest extends SerializationUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>(linkedList0);
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "";
      Integer integer0 = new Integer(1421);
      linkedList1.add(integer0);
      Integer integer1 = new Integer(1);
      Integer integer2 = new Integer((-559));
      linkedList0.add(integer2);
      linkedList1.push(integer1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      linkedList1.toArray();
      int int0 = 0;
      Integer integer3 = new Integer(0);
      linkedList0.add(integer3);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(")3?5/|", false);
      mockFileOutputStream0.release();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) linkedList1, (OutputStream) dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      Integer integer0 = new Integer(1);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Integer integer1 = new Integer(651);
      Integer integer2 = new Integer(1);
      Integer integer3 = new Integer(0);
      Integer integer4 = new Integer(0);
      Integer integer5 = new Integer(1);
      SerializationUtils.clone(integer5);
      Locale.FilteringMode[] locale_FilteringModeArray0 = Locale.FilteringMode.values();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      SerializationUtils.serialize((Serializable) locale_FilteringModeArray0, (OutputStream) pipedOutputStream0);
      Integer integer6 = new Integer(1395);
      SerializationUtils.clone(integer6);
      Object object0 = SerializationUtils.deserialize((InputStream) pipedInputStream0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SerializationUtils.serialize((Serializable) null);
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      Integer integer0 = new Integer((-884));
      SerializationUtils.clone(integer0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      Integer integer0 = new Integer((-413));
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-22);
      byteArray0[1] = (byte)0;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SerializationUtils.clone(integer0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SerializationUtils.clone((Integer) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      byte[] byteArray1 = SerializationUtils.serialize((Serializable) null);
      SerializationUtils.deserialize(byteArray1);
      byte[] byteArray2 = SerializationUtils.serialize((Serializable) null);
      SerializationUtils.deserialize(byteArray1);
      SerializationUtils.deserialize(byteArray2);
      byte[] byteArray3 = SerializationUtils.serialize((Serializable) integer0);
      SerializationUtils.serialize((Serializable) integer0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray3);
      SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
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
  public void test_0005()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      SerializationUtils.clone(integer0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-46);
      byteArray0[4] = (byte)0;
      Integer integer1 = SerializationUtils.clone((Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-33);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)52;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      HashMap<Integer, PipedInputStream> hashMap0 = new HashMap<Integer, PipedInputStream>();
      Integer integer0 = null;
      hashMap0.put((Integer) null, pipedInputStream0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      HashMap<Integer, PipedInputStream> hashMap1 = new HashMap<Integer, PipedInputStream>();
      hashMap0.putAll(hashMap1);
      pipedInputStream0.close();
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      byte[] byteArray1 = SerializationUtils.serialize((Serializable) serializablePermission0);
      SerializationUtils.deserialize(byteArray1);
      // Undeclared exception!
      try { 
        MockURI.create(":");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme name at index 0: :
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Integer integer0 = new Integer(1);
      SerializationUtils.clone(integer0);
      SerializationUtils.serialize((Serializable) integer0);
      OutputStream outputStream0 = null;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
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
  public void test_0008()  throws Throwable  {
      SerializationUtils.serialize((Serializable) null);
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
  public void test_0009()  throws Throwable  {
      Integer integer0 = new Integer((-1047));
      Integer integer1 = SerializationUtils.clone(integer0);
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) integer1);
      SerializationUtils.serialize((Serializable) integer1);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      Integer integer2 = SerializationUtils.clone(integer0);
      String string0 = "7S]1_";
      MockPrintStream mockPrintStream0 = new MockPrintStream("7S]1_");
      mockPrintStream0.checkError();
      mockPrintStream0.println('T');
      mockPrintStream0.println(1266.9F);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = object0;
      objectArray0[1] = (Object) integer1;
      objectArray0[2] = (Object) mockPrintStream0;
      objectArray0[3] = object0;
      mockPrintStream0.print((long) (-1047));
      PrintStream printStream0 = mockPrintStream0.format("m:[<ad_f+G#c'U8:nD", objectArray0);
      SerializationUtils.serialize((Serializable) integer2, (OutputStream) printStream0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)53;
      byteArray1[1] = (byte)0;
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      byte[] byteArray0 = null;
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
  public void test_0011()  throws Throwable  {
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
  public void test_0012()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
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
  public void test_0013()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Locale locale1 = locale0.stripExtensions();
      Locale.setDefault(locale0);
      locale1.getScript();
      SerializationUtils.serialize((Serializable) locale0);
      InputStream inputStream0 = null;
      locale1.stripExtensions();
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
  public void test_0014()  throws Throwable  {
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
  public void test_0015()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = SerializationUtils.clone(integer0);
      assertTrue(integer1.equals((Object)integer0));
      
      SerializationUtils.serialize((Serializable) integer0);
      SerializationUtils serializationUtils0 = new SerializationUtils();
      Integer integer2 = new Integer(0);
      SerializationUtils.clone(integer2);
      String string0 = null;
      String string1 = null;
      try { 
        MockURI.URI(",jVf@Vn{m8#BN|1", (String) null, (String) null, "");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 7: ,jVf@Vn{m8#BN|1:#
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) linkedList0);
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.offer(object0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.NotSerializableException: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      LinkedList<PipedInputStream> linkedList0 = new LinkedList<PipedInputStream>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      linkedList0.removeLastOccurrence(pipedInputStream0);
      PipedInputStream pipedInputStream1 = new PipedInputStream(967);
      linkedList0.add(pipedInputStream1);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.NotSerializableException: java.io.PipedInputStream
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Integer integer0 = new Integer((-1221));
      SerializationUtils.clone(integer0);
      SerializationUtils serializationUtils0 = new SerializationUtils();
      HashMap<Integer, PipedInputStream> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Integer, PipedInputStream>(0, (-1.0F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: -1.0
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
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
  public void test_0021()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-20);
      byteArray0[2] = (byte) (-49);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-47);
      byteArray0[6] = (byte)96;
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize(byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.StreamCorruptedException: invalid stream header: 00ECCFFF
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      HashMap<Integer, PipedInputStream> hashMap0 = new HashMap<Integer, PipedInputStream>(1, 1);
      HashMap<Integer, PipedInputStream> hashMap1 = new HashMap<Integer, PipedInputStream>();
      hashMap1.clone();
      Integer integer0 = new Integer(1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Integer integer1 = new Integer(1);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      hashMap1.put(integer1, pipedInputStream0);
      Integer integer2 = new Integer(1);
      Integer integer3 = new Integer(5031);
      Integer integer4 = SerializationUtils.clone(integer3);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer4, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      SerializationUtils.serialize((Serializable) null);
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
  public void test_0024()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      locale0.getDisplayVariant();
      locale0.getDisplayVariant();
      Locale.setDefault(locale0);
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
  public void test_0025()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("TWN", locale1.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      Serializable serializable0 = SerializationUtils.clone((Serializable) serializablePermission0);
      assertNotSame(serializablePermission0, serializable0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      Integer integer0 = new Integer(1800);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1800);
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
  public void test_0030()  throws Throwable  {
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
  public void test_0031()  throws Throwable  {
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
  public void test_0032()  throws Throwable  {
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
  public void test_0033()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      MockFile mockFile0 = new MockFile("$^3y%G&SR");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      SerializationUtils.serialize((Serializable) linkedList0, (OutputStream) mockPrintStream0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
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
  public void test_0036()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-3), (byte)79);
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
  public void test_0037()  throws Throwable  {
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
  public void test_0038()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      MockFile mockFile0 = new MockFile("");
      mockFile0.delete();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) uRI0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
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
  public void test_0040()  throws Throwable  {
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
  public void test_0041()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("The InputStream must not be null");
      SerializationUtils.serialize((Serializable) null, (OutputStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("deu", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Locale locale1 = (Locale)SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertEquals("zh", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test_0046()  throws Throwable  {
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
  public void test_0047()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1399), 130);
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
  public void test_0048()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
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
  public void test_0052()  throws Throwable  {
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
  public void test_0053()  throws Throwable  {
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
  public void test_0054()  throws Throwable  {
      File[] fileArray0 = MockFile.listRoots();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("X[yTaUAnkv");
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) fileArray0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = new Integer(0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("i.XEFvaLW)H:");
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) integer0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Simulated IOException
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      MockFile mockFile0 = new MockFile("D@\"w");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      SerializationUtils.serialize((Serializable) locale0, (OutputStream) mockPrintStream0);
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("JP", locale1.getCountry());
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
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
  public void test_0065()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test_0066()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBSTITUTION_PERMISSION;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) serializablePermission0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
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
  public void test_0069()  throws Throwable  {
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
  public void test_0070()  throws Throwable  {
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
  public void test_0071()  throws Throwable  {
      Integer integer0 = new Integer(897);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("The InputStream must not be null", false);
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
  public void test_0072()  throws Throwable  {
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
  public void test_0073()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      MockPrintStream mockPrintStream0 = new MockPrintStream(">");
      SerializationUtils.serialize((Serializable) locale0, (OutputStream) mockPrintStream0);
      assertEquals("fr", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) uRI0);
      URI uRI1 = (URI)SerializationUtils.deserialize(byteArray0);
      assertNull(uRI1.getRawAuthority());
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) uRI0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNotSame(uRI0, object0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      Locale locale1 = (Locale)SerializationUtils.clone((Serializable) locale0);
      assertEquals("", locale1.getVariant());
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
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
  public void test_0081()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 1011);
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
  public void test_0082()  throws Throwable  {
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
  public void test_0083()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
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
  public void test_0085()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) uRI0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
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
  public void test_0086()  throws Throwable  {
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
  public void test_0087()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.lang3.SerializationException");
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
  public void test_0088()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) uRI0, (OutputStream) mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
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
  public void test_0090()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 3643);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) dataInputStream0);
      assertNull(object0);
  }
@Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("CN", locale1.getCountry());
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale locale1 = (Locale)SerializationUtils.clone((Serializable) locale0);
      assertEquals("fr", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
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
  public void test_0097()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-85), (byte)107);
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
  public void test_0098()  throws Throwable  {
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
  public void test_0099()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("The OutputStream must not be null");
      SerializationUtils.serialize((Serializable) null, (OutputStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
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
  public void test_0101()  throws Throwable  {
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
  public void test_0102()  throws Throwable  {
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
  public void test_0103()  throws Throwable  {
      MockFile mockFile0 = new MockFile("The InputStream must not be null");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
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
  public void test_0104()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("The OutputStream must not be null");
      mockFileOutputStream0.close();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) "The OutputStream must not be null", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      Integer integer0 = new Integer(22);
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
  public void test_0106()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertEquals("zh_TW", object0.toString());
  }
@Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) hashMap0);
      HashMap hashMap1 = (HashMap)SerializationUtils.deserialize(byteArray0);
      assertEquals(0, hashMap1.size());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) hashMap0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 930);
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
  public void test_0113()  throws Throwable  {
      MockFile mockFile0 = new MockFile("LOM]SU=(\"#rs2~");
      URL uRL0 = mockFile0.toURL();
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) uRL0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertTrue(object0.equals((Object)uRL0));
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.deserialize((InputStream) dataInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = byteArrayOutputStream0.toByteArray();
      SerializationUtils.serialize((Serializable) byteArray0, (OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005ur\u0000\u0002[B\uFFFD\uFFFD\u0017\uFFFD\u0006\bT\uFFFD\u0002\u0000\u0000xp\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 1179);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertNull(object0);
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
      Integer integer0 = new Integer(0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Y.HQV@;k/\"Z!{");
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
  public void test_0121()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) null, (OutputStream) dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) hashMap0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Locale locale0 = new Locale(" g[R~mr", " g[R~mr");
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) locale0);
      Locale locale1 = (Locale)SerializationUtils.deserialize(byteArray0);
      assertEquals("", locale1.getVariant());
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      String[] stringArray0 = mockFile0.list();
      Serializable serializable0 = SerializationUtils.clone((Serializable) stringArray0);
      assertNotSame(stringArray0, serializable0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Locale locale0 = Locale.US;
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
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
  public void test_0129()  throws Throwable  {
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
  public void test_0130()  throws Throwable  {
      Locale locale0 = Locale.UK;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      SerializationUtils.serialize((Serializable) locale0, (OutputStream) pipedOutputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) pipedInputStream0);
      assertSame(object0, locale0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
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
  public void test_0132()  throws Throwable  {
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
  public void test_0133()  throws Throwable  {
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
  public void test_0134()  throws Throwable  {
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("s2u8");
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) serializablePermission0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale_FilteringMode0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The OutputStream must not be null
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }
@Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File[] fileArray0 = mockFile0.listFiles();
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) fileArray0);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      Integer integer0 = new Integer(1);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
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
  public void test_0141()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
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
  public void test_0142()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      SerializationUtils.serialize((Serializable) null, (OutputStream) pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 398);
      Object object0 = SerializationUtils.deserialize((InputStream) pushbackInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
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
  public void test_0145()  throws Throwable  {
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
  public void test_0146()  throws Throwable  {
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
  public void test_0147()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) uRI0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        SerializationUtils.serialize((Serializable) locale0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.lang3.SerializationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
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
  public void test_0150()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }
@Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      MockFile mockFile0 = new MockFile("4?Vi}MUn", "C%OOgf\"H2Yh");
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) mockFile0);
      MockFile mockFile1 = (MockFile)SerializationUtils.deserialize(byteArray0);
      assertFalse(mockFile1.isHidden());
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Object object0 = SerializationUtils.deserialize((InputStream) sequenceInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Integer integer0 = SerializationUtils.clone((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<.on34B2t", "8Tf\"M");
      MockFile mockFile1 = (MockFile)SerializationUtils.clone((Serializable) mockFile0);
      assertFalse(mockFile1.exists());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
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
  public void test_0157()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-37), (byte)123);
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
  public void test_0158()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) ",xH;}#");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object0 = SerializationUtils.deserialize((InputStream) byteArrayInputStream0);
      assertEquals(",xH;}#", object0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      SerializationUtils.serialize((Serializable) null, (OutputStream) bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
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
  public void test_0161()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(512);
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
  public void test_0162()  throws Throwable  {
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
  public void test_0163()  throws Throwable  {
      Integer integer0 = new Integer(2676);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("x{bOS");
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
  public void test_0164()  throws Throwable  {
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
  public void test_0165()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
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
  public void test_0166()  throws Throwable  {
      SerializationUtils serializationUtils0 = new SerializationUtils();
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      byte[] byteArray0 = SerializationUtils.serialize((Serializable) null);
      Object object0 = SerializationUtils.deserialize(byteArray0);
      assertNull(object0);
  }
}
