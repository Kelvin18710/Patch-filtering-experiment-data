package org.joda.time.tz;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("f", (-714));
      dateTimeZoneBuilder1.setStandardOffset((-960));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("Invalid encoding", true);
      assertEquals("Invalid encoding", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("AH&RKLWECI:Waaw]X", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(2, 'w', 24, 623158436, 2147483645, false, 1717986918);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone("AH&RKLWECI:Waaw]X", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 24 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("String pool is too large", (-1668), (-2879), 114, 'y', 2147483645, 2147483645, 969, false, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: y
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("AH&RKLWECI:Waaw]X", (-8));
      dateTimeZoneBuilder0.addCutover(44, 'u', 58, 58, (-8), true, 58);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(44);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("AH&RKLWECI:Waaw]X", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(2, 'w', 24, 623158436, 2147483645, false, 1717986918);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(2, 'w', 623158436, 623158436, 1717986918, true, 8);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("AH&RKLWECI:Waaw]X");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo(" (8Jw=YcT", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-292269054));
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("AH&RKLWECI:Waaw]X");
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("0$Ql\f");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.close();
      try { 
        dateTimeZoneBuilder0.writeTo("_Ik]*<.BPhL", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("XQ`OxYU~^2Yn", 77, 6, 6, 'u', (-2879), (-2879), 17, true, 77);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("XQ`OxYU~^2Yn", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2879 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 776L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(8);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1717986918, 115);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "MW[`pFkE48-c\"[aVK~");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "Fixing duplicate name key - ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "j#6sTlUmFfG^-");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "De@;KMiw");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings((String) null, 3968, 3968, 1073741824, 'r', 0, 1073741824, 0, true, 897);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: r
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("-cvHM", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("EYG", 1167, (-1415), 1167, 'u', 6, 1393, (-639), true, (-639));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("7^V8P;+,BFIq", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1393 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(9, 's', 354, (-299), 354, true, 2136181102);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(3968, '>', 2137159207, (-18), 2137159207, true, (-18));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: >
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("XQ`OxYU~^2Yn", 2939, 1393, 1393, 'u', 6, (-639), 1, true, 1167);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("XQ`OxYU~^2Yn", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("AH&RKLWECI:Waaw]X");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo(" - ", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(Integer.MIN_VALUE);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 3968, 1073741824, 3968, '(', 1073741824, 1073741824, 897, false, (-1029));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("AH&RKLWECI:Waaw]X", 2);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 2136181102);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("AH&RKLWECI:Waaw]X");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 2592000000L);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "5");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("XQ`OxYU~^2Yn", 2939, 1393, 1393, 'u', 6, (-639), 1, true, 1167);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("XQ`OxYU~^2Yn", true);
      assertEquals("XQ`OxYU~^2Yn", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("AH&RKLWECI:Waaw]X", (-8));
      dateTimeZoneBuilder0.addCutover(44, 'u', 58, 58, (-8), true, 58);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("AH&RKLWECI:Waaw]X", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 58 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 2136181102);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertTrue(dateTimeZone0.isFixed());
  }
@Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(116);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("E5)hm}ly'=dpB#BWGP6", 51);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder2.toDateTimeZone("45K#+4J4B9CL", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(116);
      dateTimeZoneBuilder0.addRecurringSavings("|Ym$wfX'86Snz,V&", (-786), (-3612), 58, 'w', 32, 1583, 16, false, (-786));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("sM,|^mR*U~", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 32 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("P|`^.&61!ai", 1160);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("P|`^.&61!ai", 296, Integer.MIN_VALUE, 2145283357, 'w', (-70), Integer.MIN_VALUE, 1160, false, 296);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("P|`^.&61!ai", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -70 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(1399, '|', 0, 0, 548, true, (-498));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: |
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-442));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2215, 'u', 847, 67, (-442), false, (-248));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("D5", 2215);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("wVnO-{%Gw/$[J-h4", (byte)2);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-912), 'w', 32, 32, 32, false, 32);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-230), 'w', 67, 608, (-276), false, 608);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 30962844000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("E5)hm}ly'=dpB#BWGP6");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("il[8/bDhFbxd1{", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 60000L);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)79;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)115);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(15099494400000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("E5)hm}ly'=dpB#BWGP6");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      mockPrintStream0.print('');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("E5)hm}ly'=dpB#BWGP6");
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0, mockFileInputStream0.available());
      assertEquals((-318765697000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("k!{z\"LL~+cnDzkMvBJS", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedInputStream pipedInputStream0 = new PipedInputStream(115);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("uGT", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("|Ym$wfX'86Snz,V&", (-786), (-3612), 58, 'w', 32, 1583, 16, false, (-786));
      MockPrintStream mockPrintStream0 = new MockPrintStream("|Ym$wfX'86Snz,V&");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("|Ym$wfX'86Snz,V&", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 32 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("IM{{8l;PLh;~", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.joda.time.tz.DateTimeZoneBuilder");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("E5)hm}ly'=dpB#BWGP6");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("E5)hm}ly'=dpB#BWGP6");
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) bufferedInputStream0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1592), 125);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "IM{{8l;PLh;~");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1592
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 65535, 0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "Rr{2,p<1W");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-98), 46);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "iL<A");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -98
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      pipedOutputStream0.close();
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("wVnO-{%Gw/$[J-h4", 826, 826, 1583, '?', 3606, 1583, (-191), false, (-191));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ?
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(67, 'u', (-248), 67, (-1934139550), true, 1521);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("rl-)ZFO_<a=", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("FTT", 58, 58, 58, 's', 58, 58, 3023, true, 58);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("FTT", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 58 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("FTT", (-1980));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(3912, 's', (-1980), (-919), (-1980), true, (-2146025749));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone("FTT", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1980 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("wVWnO-{%Gw/$[J-h4", (byte)2);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("wVWnO-{%Gw/$[J-h4", true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-912), 'w', 32, 32, 32, false, 32);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("America/Phoenix", (OutputStream) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 32 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("TsSFZ{^g[=U8s");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("TsSFZ{^g[=U8s", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addCutover((-2038), 's', 1687, 1687, (-2038), true, 1687);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone(" ", true);
      assertEquals(" ", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("$wq*-", 2, 2, (-1375), 'a', 2, (-2061882831), 6, true, (-2061882831));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("wVWnO-{%Gw/$[J-h4", 3);
      MockPrintStream mockPrintStream0 = new MockPrintStream("wVWnO-{%Gw/$[J-h4");
      dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(")x");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000L);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-808L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("#\"r4CO<3(R#a*I3I&", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile("#\"r4CO<3(R#a*I3I&");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "_LgerW,t");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "4hJr+flv@?]Q=skp%");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("#\"r4CO<3(R#a*I3I&", (-2038));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-2038), 'u', 1687, 1687, (-2038), true, 1687);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("#\"r4CO<3(R#a*I3I&", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1687 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
