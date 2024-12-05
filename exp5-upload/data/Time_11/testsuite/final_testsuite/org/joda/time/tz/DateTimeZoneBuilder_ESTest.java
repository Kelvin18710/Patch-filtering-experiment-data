package org.joda.time.tz;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.chrono.IslamicChronology;
import java.io.BufferedOutputStream;
import java.io.FilterInputStream;
import org.joda.time.YearMonthDay;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("weeks", 0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(524);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("rk{~*", true);
      assertEquals("rk{~*", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("j<", (byte)117, (-576), (byte)117, 'w', (-2770), (-1531), (byte)117, true, 128);
      dateTimeZoneBuilder0.setFixedSavings("weeks", 5);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("weeks", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2770 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("weeks", 1050);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(1413, 'w', (-1), 2, (-143), true, 1394);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone(" ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("UTC", 860, 860, 860, 'd', 860, 860, (-1711), false, 860);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: d
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings(":-d", 1589, (-568), 0, 'z', (-568), 690562340, 1589, false, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: z
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("weeks", 0);
      dateTimeZoneBuilder0.addCutover(0, 'w', 695, 2443, (-3621), true, 695);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setFixedSavings("weeks", (-576));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("weeks", 0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(91, 'w', 695, 2443, (-3617), true, 695);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(67, 'w', (-576), (-3617), (-3639), true, 2798);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder3);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("weeks");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-12219292800000L));
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("org.joda.time.field.PreciseDurationDateTimeField", "org.joda.time.field.PreciseDurationDateTimeField");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("weeks", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)76;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(12079595520000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-76);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataInputStream0.readBoolean();
      dataInputStream0.readByte();
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals((-51539607552000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("4", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("weeks");
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
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
  public void test_0015()  throws Throwable  {
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
  public void test_0016()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0017()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "^$1tc");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3617), 1928);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3617
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "The field must not be null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3, (-1451618389));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "weeks");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("`nAJ= C%<f~", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "xm62ba!K");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("weeks", 0);
      dateTimeZoneBuilder0.addCutover('u', 'u', 0, 0, 'u', true, 0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("weeks", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("weeks", 0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(0, 's', 366, (-1560), 1576, false, 1);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone("weeks", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 366 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover('t', 't', 't', 't', 't', false, 't');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: t
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(100, 'u', 100, 100, 100, false, (-111247333));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("weeks");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("QZ;q?C", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(13);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UU$", true);
      assertEquals("UU$", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
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
  public void test_0030()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("UU$", (-323), (-323), (-2086279433), ':', (-323), (-2086279433), (-323), false, (-2086279433));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Interval must not be null", (-3170));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-76L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(10125000);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 10125000);
      assertEquals(5, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000'\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("weeks");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 86400000L);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(6);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 6);
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0006", byteArrayOutputStream0.toString());
      assertEquals(9, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "weeks");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "^$1tc");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.toString());
  }
@Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Khc@Q8z\"", 5);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(58);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Khc@Q8z\"", false);
      dateTimeZoneBuilder1.writeTo("Khc@Q8z\"", (OutputStream) mockFileOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("YgC");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("YgC", 2143239609, 2143239609, 2143239609, 'w', 2143239609, 2143239609, 2011, true, 2011);
      dateTimeZoneBuilder0.setFixedSavings("YgC", 2011);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo(" ", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2143239609 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Fixing duplicate name key - ", 1747);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover('s', 's', 690562308, (-2161), 2145856766, true, 2145856766);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("ce", (-372));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("mLp", 1630);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover('u', 'u', 113, 999, 'u', false, (-1953369677));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(1630, 'u', 1630, (-1953369677), 245, false, 1630);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("{V>|me={&Z:#<pY(]d");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 10000000L);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("z&w|zR7{R9*6@TL9,>;", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.DateTimeZoneBuilder$OfYear", true);
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
  public void test_0048()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Khc@Q8z\"", false);
      try { 
        dateTimeZoneBuilder0.writeTo("Khc@Q8z\"", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$OfYear", (DataOutput) dataOutputStream0);
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
  public void test_0051()  throws Throwable  {
      File file0 = MockFile.createTempFile("WGh4qq,0L", "Unknown mode: ");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
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
  public void test_0052()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "dt$$68jp:o0kp(=cKo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) sequenceInputStream0, "FW/39G*}-shi=s|`");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "IST");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "org.joda.time.tz.DateTimeZoneBuilder");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("vWWGIou$x@n'", 1266, (-864), 1266, '|', 0, (-1), (-1691), false, 1266);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: |
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings((String) null, (-1953369677));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("org.joda.time.field.ZeroIsMaxDateTimeField", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Khc@Q8z\"", 5);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("Khc@Q8z\"", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
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
  public void test_0060()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1953369677), 'u', 113, (-1953369677), 113, true, 113);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("YgC", 2143239609, 128, 128, 'w', 128, 2143239609, 2011, true, 2011);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("YgC", (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 128 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Fixing duplicate name key - ", 1747);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover('s', 's', 690562308, (-2161), 2145856766, true, 2145856766);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("org.joda.time.field.RemainderDateTimeField", (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 690562308 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(6929, 'i', 255, 2102, 255, false, 255);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: i
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Fixing duplicate recurrent name key - ");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("Fixing duplicate recurrent name key - ", (OutputStream) dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
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
  public void test_0066()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Khc@Q8z\"", (-1597), 142, (-1597), '(', (-1597), 142, 2527, false, 454);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(",m}", 1630);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Z0.b");
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1953369677));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 30585600000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder0.writeTo("\"U)/ZfwhJaqvlV]", (DataOutput) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 2076);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pushbackInputStream0, "f8M0bmor/NU=>2OWbMi");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("7V>|(tQv1H6xCL48o", 153, (-372), Integer.MAX_VALUE, 's', (-372), 153, 153, false, 938);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("yd'ZZOWeGY+ws~<HB", true);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("yd'ZZOWeGY+ws~<HB", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -372 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("mLp", 1630);
      dateTimeZoneBuilder0.addCutover('u', 'u', 113, 999, 'u', true, (-1953369677));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("mLp", (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 113 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", (-1953369677));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }
@Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!A%", (-391), (-391), 470, 'u', 3, (-1754), 'u', true, (-391));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("Q3]\"{Wf#JIc", true);
      assertEquals("Q3]\"{Wf#JIc", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("!A%", (-1754), (-391), 3, 'u', 1, 1880, (-391), false, 116);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("$>G4Di9B?R{{`", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1880 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 2592000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("`s~WYK@lJ47fB7(-%g[", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("`s~WYK@lJ47fB7(-%g[", (DataOutput) dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-UY");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1L);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      MockFile mockFile0 = new MockFile("!A%", "!A%");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 100000000000L);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(16106127360000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("*.zM?ML-5qz101ZnOg", 9, 1722, 1722, 'u', 1722, 1722, 54, true, 54);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("ap", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1722 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("]sC>");
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
  public void test_0086()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("FBw&~uuwf", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1549L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!A%", 'u', 16, 1197, 'u', 3, 1, 16, true, 'u');
      // Undeclared exception!
      dateTimeZoneBuilder1.toDateTimeZone("!A%", true);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("9J", (-292269337), (-292269337), 1722, 'u', 9, 1, (-292269337), true, 18);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("MIT", true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223191616521599982 + -25252070198400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
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
  public void test_0091()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-21);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0092()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1482), 37);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "!G7=cBFt3X&Oh]");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1482
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "t3");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 43, 43);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("*la/lM'g)", 585, (-1372), (-1262), '/', (-1262), (-2144864764), (-19), true, (-19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: /
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      assertEquals((-28800000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("$4NdWl]cgc0B2", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(22, 's', (-478), (-478), 112, true, 64);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition((-185587696886399219L));
      assertEquals((-185587696886399219L), long0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition(7);
      assertEquals((-891594000001L), long0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("!A%", 781);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(3, 'u', 1, 3, (-1), true, 3);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("{gM2", 1);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder2.toDateTimeZone("!=}itz+`/l`-", true);
      assertEquals("!=}itz+`/l`-", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!A%", (-5275), 539, 2001, 'u', 3, Integer.MIN_VALUE, 470, true, 781);
      dateTimeZoneBuilder0.addCutover(12825000, 'u', 1, 117, 1, false, 3);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("ONcPM6_Q0N*R7\n|O", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 117 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings(" interval]", 1, 1722, 1722, 'u', 9, 3, 1722, false, 9);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone(" interval]", false);
      assertEquals(" interval]", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("!A%", 1, 1722, 1722, 'u', 9, 34, 1722, true, 9);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("-Summer", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 34 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", (-999), 579, 1008, 'w', (-3439), 557, 367, true, (-3263));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("FBw&~uuwf", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3439 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("!A%", 781);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(3, 'u', 1, 3, (-1), true, 3);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("!=}itz+`/l`-", true);
      assertEquals("!=}itz+`/l`-", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-2040109464), '', (-2040109464), 2484, 59, false, 2484);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.field.ZeroIsMaxDateTimeField", 3, 7, 7, 'u', 3, (-391), 20, true, 1);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo(" + ", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
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
  public void test_0111()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("zla/lM'g)", (-19));
      dateTimeZoneBuilder1.setStandardOffset(1956);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("zla/lM'g)", true);
      assertEquals("zla/lM'g)", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("S`Qk ,:Ai", 117, 664, 117, ')', (-2821), 664, 664, false, (-2821));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 100000000000000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("|* L-\"i;");
      dateTimeZoneBuilder0.writeTo("|* L-\"i;", (OutputStream) mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0117()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "zb$zI|dqZK|j}9h>I)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Period period0 = null;
      try {
        period0 = new Period((-47929449599883L), (Chronology) islamicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minuend instant is below the supported minimum of 0001-01-01T00:00:00.000Z (IslamicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("MIT", 4, 3, 450, 'u', 10, 3, 3, true, (-391));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("MIT", true);
      assertEquals("MIT", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("M'W", (-557), 17, 1073741824, 'u', (-557), 70, (-557), false, 70);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-557), 'u', 189, Integer.MIN_VALUE, Integer.MIN_VALUE, false, 189);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(17, 'u', (-1154), 17, 13, false, 13);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder2);
  }
@Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("8+3#v{1", 0);
      dateTimeZoneBuilder0.setStandardOffset(1732);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("8+3#v{1", true);
      assertEquals("8+3#v{1", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("8S", 2074, 2074, 2074, 'z', 0, (-1902), 1401, true, 1401);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: z
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(86399999);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-747), 's', 86399999, 114, (-747), false, 92);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.addCutover(4, 's', 114, 86399999, (-1912079463), false, (-1912079463));
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.YearMonthDay$Property", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
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
  public void test_0127()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)85;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0128()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "NoYears");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "WvIFiV*PFu*R'sb-D");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("fJ");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("fJ");
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
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
  public void test_0131()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("jR++D27it'`+0&", 153692453, 21, 153692453, 'j', 2, (-286), (-1350), true, (-1834));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: j
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("orgjoda.wime.tzjDateTimeZLneBuilder", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(86399999, 'b', 86399999, 86399999, (-3), false, 114);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: b
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(1732);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("8+3#v{1", true);
      assertEquals("8+3#v{1", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("GJ");
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("6rOz", 100, 100, 0, 'Q', 3376, (-945), (-2225), true, 100);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("orgjoda.wime.tzjDateTimeZLneBuilder");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-681));
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("orgjoda.wime.tzjDateTimeZLneBuilder");
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 71);
      dateTimeZoneBuilder1.writeTo("", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "?/r1R|q*");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "?/r1R|q*");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("aJ", (-8), (-8), 14, 'w', (-1604), (-1350), 14, true, 153692453);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }
@Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(490);
      dateTimeZoneBuilder0.setFixedSavings("{sQS$d,*_8'k2$\"c5@7", 490);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("{sQS$d,*_8'k2$\"c5@7", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(156, '~', 23118750, 93, (byte)117, true, (-1578));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ~
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1073741824);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(34, 's', 6, 1073741824, (-2143313775), true, 18);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("A<8V6d-9H|+%%|", (-3834));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder3);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings((String) null, (-1408));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1000, 'u', 1000, 105, (-3298), false, (-1502));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(863, 'u', 863, (-1502), (-4835), true, 5);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("A<8V6d-9H|+%%|");
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo("A<8V6d-9H|+%%|", (OutputStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("|Z", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 3037L);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(58);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 10000000000000L);
      assertEquals("\uFFFDT\u000B\uFFFD\u0000", byteArrayOutputStream0.toString());
      assertEquals(5, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)78;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(14092861440000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)37;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(4, byteArrayInputStream0.available());
      assertEquals((-48600000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo(",%x=O oKvCDdNkH|1|[", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo(">ZW", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
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
  public void test_0156()  throws Throwable  {
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
  public void test_0157()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(65533);
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
  public void test_0158()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0159()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "The lower limit must be come before than the upper limit");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) bufferedInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "Field type must not be null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-154027536), 5407);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)2);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "FKUOz6jO;Zs)>^5O");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "FKUOz6jO;Zs)>^5O");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(1, 'T', 1, 1, 1, true, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: T
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("String pool is too large", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("String pool is too large", (DataOutput) dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Y", (-2847));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("-Pi", 14, 14, 14, 'w', (-2847), (-1574), (-2847), true, (-1574));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("b)y4,Hk4", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2847 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1870, 's', 3887, 1870, 0, true, 0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("V/P]dKU");
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("hourOfDay", (-2173));
      dateTimeZoneBuilder1.addCutover((-2173), 'w', (-2173), 2086, 2086, true, (-2173));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("United States", (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2173 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 0, (-2003), 0, 's', 0, 0, 1073741824, true, 63);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("hourOfDay", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("4={hTN#(;_y?jwHWe9R", 63, 63, 63, 'v', 63, 63, 3462, false, 63);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: v
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(")[;H-:w");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 18);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("4={hTN#(;_y?jwHWe9R", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(490);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("Dxc;@\".wV(,pHe.a", false);
      assertEquals("Dxc;@\".wV(,pHe.a", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
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
  public void test_0175()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, (-1399), 255, (-1399), '}', 255, 6, (-1399), false, 99);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 790L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 21859200000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-2307L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "FKUOz6jO;Zs)>^5O");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "75.?C ");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }
@Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-3193));
      dateTimeZoneBuilder1.setFixedSavings(".y", (-1209));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone(".y", true);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("H*cN'M4", 3600, 7, 1493, '}', (-935), 2012, 10, true, 5378);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: }
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-3193));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(3787, 's', 3539, (-3195), 3787, false, 119);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setStandardOffset((-4463));
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1983825000));
      dateTimeZoneBuilder1.addCutover((-1983825000), 'u', (-1983825000), 423, (-1983825000), true, (-1983825000));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover('u', 'u', (-2198), (-1983825000), (-2751), true, 'u');
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 100000000000000003L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("+He)Wh64KP\"m", "&>OS*).3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("&>OS*).3", (DataOutput) dataOutputStream0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)106);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(23400000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("NoMonths");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("NoMonths", 12, (-118), 70, 's', 119, 2478, (-1737), true, 3539);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("O~=", (OutputStream) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 119 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("%WO7@@Y/DnI,", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "\"Hw");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("CI%M7WOFd\"mmrh$V_'", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("Ihsxh019+Mm", "Ihsxh019+Mm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("EDjy?5O^k3vkibvz", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
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
  public void test_0197()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(7);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
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
  public void test_0198()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0199()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "0^~tb");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-105), 117);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0, 65535);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pushbackInputStream0, "\"Hw");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -105
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) sequenceInputStream0, "0^~tb");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 34, (byte) (-98));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) bufferedInputStream0, "5%C/_X");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "halfJdaykf]ay");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("VH3)@v)", 1381, 1381, 1381, '=', 100, 982, 982, false, 1493);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: =
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("&>OS*).3", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("bD]HlV5QV]6-Di}3", 115);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("bD]HlV5QV]6-Di}3", true);
      assertEquals("bD]HlV5QV]6-Di}3", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)67;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, ";cAwk%[8;]*d1\fL-+>");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("V[DB2?eD5o", 1619, 12, 12, 's', 12, 70, 1619, true, 3539);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("V[DB2?eD5o", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 70 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(".y", (-1209));
      dateTimeZoneBuilder1.addCutover(3787, 's', 3539, (-3195), 3787, false, 119);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone(".y", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3539 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-1745), '*', (-1745), (-1745), (-1745), false, (-1745));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: *
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1983825000), 'u', (-1983825000), 423, (-1983825000), true, (-1983825000));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder0.writeTo("+Ll4uA", (OutputStream) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(215);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("halfdayOfDay", true);
      assertEquals("halfdayOfDay", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
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
  public void test_0215()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("&>OS*).3", 256, 256, 8, '=', 27, 2487, 256, false, 27);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 100000000000000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("NoMonths");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 604800000L);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "NoMonths");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("G}RW+^(oFKRrnGWPb", (-1792066540));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("G}RW+^(oFKRrnGWPb");
      dateTimeZoneBuilder0.writeTo("", (OutputStream) mockFileOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }
@Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((byte)65);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("", (-815));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder2.toDateTimeZone("", true);
      assertEquals("", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("UTC", (-851), (-851), (byte)65, 's', (-2205), 687, 80, true, (byte)65);
      dateTimeZoneBuilder1.setFixedSavings("\"CJ+fet<)D$", 67);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2205 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2945));
      dateTimeZoneBuilder1.addRecurringSavings("UTC", (-851), (-851), (byte)65, 's', (-2205), 687, 80, true, (byte)65);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2205 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(0, 'z', 0, 7678125, 0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: z
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2945));
      dateTimeZoneBuilder1.addCutover((-1202), 's', 80, 3335, 687, true, (-3672));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setFixedSavings("", 11);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", Integer.MAX_VALUE);
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) byteArrayOutputStream0);
      assertEquals(16, byteArrayOutputStream0.size());
      assertEquals("F\u0000\u0003UTC\uFFFD\u0000\u0000\u0000\u0000\uFFFD\uFFFD\uFFFD\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(199);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      dateTimeZoneBuilder0.writeTo("org.joda.time.chrono.BasicDayOfMonthDateTimeField", (DataOutput) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-25L));
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-48);
      byteArray0[3] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(67070209294336L, long0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[0] = (byte)37;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(11, byteArrayInputStream0.available());
      assertEquals((-48600000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("[A]", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("UTC", (-851), (-851), (byte)65, 's', 's', 687, 80, true, (byte)65);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("UTC", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 115 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("=C%%*(a;Bi R=%$");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-27317L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
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
  public void test_0235()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-64), 133);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -64
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, (byte)70);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.skip(2976L);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test_0238()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(352831696);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) bufferedInputStream0, ",<\"6x+");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "3R*ex!kMN1/vZ^8\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      DateTimeZoneBuilder.readMillis(dataInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "#]^UH>i-=e'<:M");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-2945));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("", true);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-128132973), 's', (-2205), 135, (-801), true, (-1439881115));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", (-815));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((byte)65, 's', (-2945), 1486, 91, true, 43);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone("", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2945 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings((String) null, (-607), (-607), (-607), '<', (-447), (-607), (-607), true, 2161);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: <
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder0.writeTo("waxd#:J%:Mv", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(85);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("H", 85, 85, 85, 'u', 85, 15, 15, true, 806);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("leQKg", 7, 2127224368, 7, '0', 18, 12, 12, false, 12);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", (-44575577));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(":D\"0Ci'Wb_", (-2145903452));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-1342L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 100000000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[1] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "=8M@Eia._~[");
      assertEquals("=8M@Eia._~[", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "=8M@Eia._~[");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "$vW(-f3U/ms)#ZV;U");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("l%6Lrtv{^ '}n06EB0", 15, 756, 806, 'u', 806, 806, 128, true, 756);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }
@Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(",)@?6", (-1886));
      dateTimeZoneBuilder1.setStandardOffset((-1886));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("bhG<|`XnU2<_:rtb", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("halfdayOfDay", (-1404), (-3171), 271, 'w', (-636), (-1480), 32, false, 15);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("62w:W", 119);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("L", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -636 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(0, '{', 63, (-1156), (-5292), false, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: {
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("J59OKuy78M\"k`", 688);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2513, 'w', 32, 16, 2513, false, (-1404));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.field.RemainderDateTimeField", (-636), 688, 292271022, 'w', 0, 255, 0, false, (-3171));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("HNl[X:v!e7", 662, 0, 0, 'f', Integer.MAX_VALUE, 662, 0, true, (-325));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: f
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1886));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover((-1886), 's', 34, (-1886), 34, false, (-1404));
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(4, 's', (-439), 24, 4, false, (-1404));
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", (-9));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals((-52200000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("q:&7{s(~7");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("LrdzSlT%\u0004/MKjU6", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-678L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
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
  public void test_0273()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 4033);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
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
  public void test_0274()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, " 6jZ('2MA+r<s3{pIRg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2409), (byte)1);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "bu");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2409
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)70;
      byteArray0[2] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "62wW");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
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
  public void test_0278()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((-1678L));
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("bhG<|`XnU2<_:rtb", 3032, (-3171), 1710, 'w', 1710, 54, 3032, false, 1710);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1710 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1886), 's', 34, (-1886), 34, false, (-1404));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("The calculation caused an overflow: ", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("7Tl<edU# Q4XTiegq", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(751);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("$@&n:bL", false);
      assertEquals("$@&n:bL", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
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
  public void test_0286()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(",)@?6", (-4519), 292272708, 1233, '`', (-1378), 1233, (-1886), true, (-1886));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 16);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("LrdzSlT%\u0004/MKjU6", 43);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(18);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1678L));
      assertEquals(9, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDr", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(15);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$Transition", (DataOutput) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1699);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1209600000L);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("@\u0000N\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(60);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 3260L);
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\f\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(9, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DateTimeZone dateTimeZone0 = DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "62wW");
      assertEquals("62wW", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "62wW");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("DateTimeZone.setProvider", 119, (-265), 24, 'u', 165, (-630), 2513, true, 4927);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("J59OKuy78M\"k`", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 165 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("J59OKuy78M\"k`", 688);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2513, 'w', 32, 16, 2513, false, (-1404));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("itG]b`xpQt.7<D", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 32 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(80);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(" - ", 0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo(" - ", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("t#^+?N|@]gaxt&nz0o_", 's', 's', 's', 's', 12, 's', 60, false, 369);
      dateTimeZoneBuilder1.setFixedSavings("Or,", 369);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("!V2t:4.T$Gp7G35T", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 115 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-1));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 1893, 843, 843, 's', 843, 70, 2183, true, (-3190));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("`]0=KLA:5qapU8L", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 843 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(2320, 'x', (-1269), 1262, (-1269), false, (-1321));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: x
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("G;d|(zG@Ih", 1893);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1435307946), 'w', (-1435307946), 2, 1893, true, 65535);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("G;d|(zG@Ih", (-1340), (-1605), 2146678744, 'w', 1367, (-1605), 65535, true, 365);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("G;d|(zG@Ih", 1893);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1435307946), 'w', (-1435307946), 2, 1893, true, 65535);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder1.addCutover(70, 'w', 298, 1056, 168, false, 2);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-12219292800000L));
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("s\uFFFDy ", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("MIT", 10);
      dateTimeZoneBuilder1.writeTo("MIT", (DataOutput) dataOutputStream0);
      assertEquals(16, byteArrayOutputStream0.size());
      assertEquals("F\u0000\u0003MIT\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo(" - ", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("t#^+?N|@]Xaxt_nz0o_", 's', 's', 's', 's', 12, 's', 60, false, 369);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("t#^+?N|@]Xaxt_nz0o_", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 115 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("{HHhM", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1122310335));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
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
  public void test_0312()  throws Throwable  {
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
  public void test_0313()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 441, (byte) (-115));
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, (String) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "org.joda.time.tz.DateTimeZoneBuilder$Rule");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 317351877, (byte)107);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "Hj>7ZE3'd");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.tz.DateTimeZoneBuilder$OfYear", 400, 400, 400, 'q', 400, 'q', 400, true, 'q');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: q
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(604800);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.tz.DateTimeZoneBuilder$Rule", true);
      assertEquals("org.joda.time.tz.DateTimeZoneBuilder$Rule", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
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
  public void test_0320()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 'u', 0, 0, (-1994818282), true, 0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, 17887500, 255, 255, 'u', (-550), Integer.MIN_VALUE, (-550), true, 12);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("N&<`", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -550 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.tz.DateTimeZoneBuilder$OfYear", 400, 400, (-353), 'q', 83, (-2147176292), 400, true, (-353));
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 100000000000007L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 2629746000L);
      assertEquals(5, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000( r", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo("9i0$ZJBy8Q 3~[k", (OutputStream) dataOutputStream0);
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 63158400000L);
      assertEquals("@\u0010\u000F\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "/d?ll`W;?!");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "F*J)n>Ho?7=(9");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 366);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", false);
      assertEquals("UTC", dateTimeZone0.getID());
  }
@Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1370);
      dateTimeZoneBuilder1.addRecurringSavings((String) null, (-712), 0, 256, 's', 6, (-2139062142), (-2944), false, 0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("org.joda.time.tz.DateTimeZoneBuilder$OfYear", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(3699);
      dateTimeZoneBuilder1.addCutover(3699, 's', 3699, (-315), 118, true, 118);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setFixedSavings("Buddhist", (-315));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(15);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(100, 's', 16, 1514, 2046, false, 4);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(0, 's', 21, 2046, 0, true, 16);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 7);
      dateTimeZoneBuilder1.setStandardOffset((-1512));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-12219292800000L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 606L);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000000000000L);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      MockFile mockFile0 = new MockFile("A");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 63158400000L);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals((-5400000L), long0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 990, 3, 118, 's', 118, 100, 115, true, 100);
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicFixedMonthChronology", "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("gFsk98", (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 118 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, 8, 256, 256, 's', 6, (-712), 6, true, (-1254));
      MockFile mockFile0 = new MockFile("AiOxQ&*8Vo44dz", "9223372036854775808");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("i,A1GCeuRf", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("D", "AiOxQ&*8Vo44dz");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
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
  public void test_0344()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("Y9FEUhR", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!K:OeO(%*SGM6OXIRr", 4401, 100, 516, 's', (-1693), (-1096120646), 115, true, 3600);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("pn", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1693 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("z1;tj]H@Z%oR XKiL", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", "org.joda.time.chrono.GJChronology$ImpreciseCutoverField");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
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
  public void test_0348()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("XU7t-`W}OcMkz6", "7bw)dC+2W}b4*n");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 2660L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
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
  public void test_0350()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(7);
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
  public void test_0351()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.joda.time.convert.CalendarConverter", "^ba~x?#bJ+5!bPn");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
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
  public void test_0352()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-240), 135);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pushbackInputStream0, "America/Chicago");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -240
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "P>&9%pGcmHp\"Cy7u");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "org.joda.time.tz.DateTimeZoneBuilder$Transition");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      File file0 = MockFile.createTempFile("sy:e-3{i)/7`br=7)", "sy:e-3{i)/7`br=7)");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "}zo*0l1,%58!q-p2");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(119, 'C', 119, 12740625, (-4492), true, 119);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: C
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, 's', 311, 311, 's', 6, (-589), 6, false, (-1249));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("MST", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", "org.joda.time.chrono.GJChronology$ImpreciseCutoverField");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1539), 's', (-1539), (-1539), (-1539), true, (-2209));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("iA1GCuR", 8, 256, 256, 's', 6, (-712), 6, true, (-1254));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("ReadablePartial objects must not be null", false);
      assertEquals("", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, (-712), 0, 256, 's', 6, (-2139062142), (-2944), true, 0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("MST", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Ej", 7, (-4266), 115, 's', 7, 115, 3, true, (-2144441885));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.field.OffsetDateTimeField", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 115 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, (-712), 0, 256, 's', 6, (-2139062142), (-2944), false, 0);
      dateTimeZoneBuilder0.addCutover(0, 's', (-1907), (-2944), 6, false, (-2944));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("MST", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1907 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings((String) null, 119, 0, 119, '}', 30, (-1197), 49, false, 16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: }
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("BCE", 7678125, 7678125, 7678125, 'u', 1584, (-3484), 1872, true, 3394);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", (String) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo(" GlBzpf%c?^+A", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("iA1GCuR", 8, 256, 256, 's', 6, (-712), 6, true, (-1254));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("iA1GCuR", true);
      assertEquals("iA1GCuR", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings((String) null, (-712), 0, 256, 'w', 6, (-2139062142), (-2944), false, 0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1), 'w', 6, (-2142), 128, false, 10);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.base.BaseSingleFieldPeriod", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(0);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("BCE", true);
      assertEquals("BCE", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
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
  public void test_0372()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("BCE", (-11713122), (-589), (-11713122), 's', 6, (-589), (-589), true, 256);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 7);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.chrono.GJChronology$ImpreciseCutoverField", 829);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 1000000000000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-1393L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 117);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "i,A1GCeuRf");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "/.V-&jh'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime();
      DateTime dateTime0 = localTime0.toDateTimeToday(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTime0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 's', 256, 256, 's', 6, (-589), 6, true, (-1254));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("MST", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
